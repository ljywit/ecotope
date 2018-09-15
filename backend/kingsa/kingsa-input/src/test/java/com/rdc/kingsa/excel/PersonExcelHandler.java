package com.rdc.kingsa.excel;

import cn.afterturn.easypoi.handler.impl.ExcelDataHandlerDefaultImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PersonExcelHandler extends ExcelDataHandlerDefaultImpl<Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonExcelHandler.class);


    @Override
    public Object importHandler(Person obj, String name, Object value) {
        log.info(name+":"+value);
        return super.importHandler(obj, name, value);
    }

}