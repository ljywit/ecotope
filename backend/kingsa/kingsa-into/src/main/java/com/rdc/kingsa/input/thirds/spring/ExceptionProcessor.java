package com.rdc.kingsa.input.thirds.spring;

import com.rdc.kingsa.input.common.KingsaException;
import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;
import com.rdc.kingsa.input.thirds.spring.config.PropertyConfigurer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionProcessor {

    @Autowired
    private PropertyConfigurer propertys;

    /**
     * 异常处理
     *
     * @param ex 异常对象
     * @return ErrorInfo
     */
    @ExceptionHandler(KingsaException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorInfo handleException(KingsaException ex) {
        DeveloperLogRecord record = new DeveloperLogRecord("");
        PsLog.DEVELOPER.error(record, ex);
        String errorMsg = propertys.getString(ex.getErrorCode());
        //未封装的异常，错误信息不暴露到上层应用，使用默认错误原因
        return new ErrorInfo(HttpStatus.INTERNAL_SERVER_ERROR.value(), reviseErrorMsg(errorMsg));
    }

    /**
     * 异常处理
     *
     * @param ex 异常对象
     * @return ErrorInfo
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorInfo handleException(Exception ex) {
        DeveloperLogRecord record = new DeveloperLogRecord("", "", "");
        PsLog.DEVELOPER.error(record, ex);
        String errorMsg = "";
        //未封装的异常，错误信息不暴露到上层应用，使用默认错误原因
        return new ErrorInfo(HttpStatus.INTERNAL_SERVER_ERROR.value(), reviseErrorMsg(errorMsg));
    }

    /**
     * 修正空错误信息
     *
     * @param str 原始错误信息信息
     * @return str 重新返回的错误信息
     */
    private static String reviseErrorMsg(String str) {
        String unknowMsg = "errorMessage:[Unknown exception,please connect to the engineer.]";
        if (StringUtils.isEmpty(str)) {
            return unknowMsg;
        }

        int errorMsgIndex = str.indexOf("errorMessage");
        if (errorMsgIndex < 0) {
            return str;
        }
        String errMsg = str.substring(errorMsgIndex);
        String msg = errMsg.substring(errMsg.indexOf("[") + 1, errMsg.indexOf("]"));
        if (!StringUtils.isEmpty(msg)) {
            return str;
        }
        return str.replace("errorMessage:[]", unknowMsg);
    }

    class ErrorInfo {
        /**
         * 状态码
         */
        private int code;

        /**
         * 错误信息
         */
        private String message;

        /**
         * 有参构造方法
         *
         * @param code    状态码
         * @param message 错误信息
         */
        public ErrorInfo(int code, String message) {
            this.code = code;
            this.message = message;
        }

        /**
         * 获取状态码
         *
         * @return String
         */
        public int getCode() {
            return code;
        }

        /**
         * 设置状态码
         *
         * @param code 状态码
         */
        public void setCode(int code) {
            this.code = code;
        }

        /**
         * 获取错误信息
         *
         * @return String
         */
        public String getMessage() {
            return message;
        }

        /**
         * 设置错误信息
         *
         * @param message 错误信息
         */
        public void setMessage(String message) {
            this.message = message;
        }
    }

}
