package com.springmvc.Util;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String,Date> {


    @Override
    public Date convert(String Source) {
        if (Source==null){
            throw new RuntimeException("您的输入为空,请重新输入!");
        }else{
            DateFormat date = new SimpleDateFormat("yyyy-mm-dd");
            Date parse =null;
            try {
                parse = date.parse(Source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return parse ;
        }
    }
}
