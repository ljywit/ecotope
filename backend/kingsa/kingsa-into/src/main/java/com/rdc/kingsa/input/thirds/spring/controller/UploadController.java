package com.rdc.kingsa.input.thirds.spring.controller;

import com.base.utils.DateUtils;
import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

/**
 * 文件上传controller
 * 
 * @author Administrator
 *
 */
@Controller()
@Scope("singleton")
@RequestMapping("/file/")
public class UploadController {

	@Autowired
	private CommonsMultipartResolver multipartResolver;

	@ResponseBody
	@RequestMapping("upload")
	public String upload(HttpServletRequest request, HttpServletResponse response) {
		String fileName = "";
		try {
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				while (iter.hasNext()) {
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							// 重命名上传后的文件名
							String curDate = DateUtils.date2String(new Date(), DateUtils.YYYYMMDDHHMMSSSSS);
							fileName = "upload_" + curDate + myFileName;
							// 定义上传路径
							String serverFilePath = "";//filePathName
							File localFile = new File(serverFilePath);
							file.transferTo(localFile);
						}
					}
				}
			}
		} catch (IllegalStateException | IOException e) {
			DeveloperLogRecord record = new DeveloperLogRecord("UploadController", "upload", "upload fail!");
			PsLog.DEVELOPER.error(record, e);
			fileName = "";
		}
		return fileName;
	}

}
