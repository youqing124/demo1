package com.offcn;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.MobileinfotableMapper;
import com.offcn.po.Mobileinfotable;
import com.offcn.service.MobileinfotableService;
import com.offcn.service.MobileinfotableServiceImpl;

public class test {

	
	
	/*@Resource
	MobileinfotableServiceImpl mobileinfotableServiceImpl;*/
	
	public static void main(String[] args) {
	
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:beans.xml");
		MobileinfotableService mobileinfotableServiceImpl=(MobileinfotableService) app.getBean("mobileinfotableServiceImpl");
		//Mobileinfotable mobile=new Mobileinfotable();
		/*mobile.setMobileNumber("1886653");
		mobile.setMobileArea("山东 聊城");
		mobile.setMobileType("中国移动GSM/3G");
		mobile.setAreaCode("0635");
		mobile.setPostCode("252000");*/
		//System.out.println(mobile);
		//mobileinfotableServiceImpl.insertV(mobile);
		System.out.println("插入成功"+mobileinfotableServiceImpl.getAreaById("1886653"));
	}
	
}