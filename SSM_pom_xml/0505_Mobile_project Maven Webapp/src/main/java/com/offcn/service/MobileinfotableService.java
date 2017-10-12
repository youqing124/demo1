package com.offcn.service;

import java.util.List;

import javax.jws.WebService;

import com.offcn.po.Mobileinfotable;
@WebService
public interface MobileinfotableService {

	
	public void insertV(Mobileinfotable mobileinfotable);
	
	public Mobileinfotable getAreaById(String name);
	
	
	
	
	
	
	
	
	
}
