package com.offcn.service;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.dao.MobileinfotableMapper;
import com.offcn.po.Mobileinfotable;
@Service
@WebService
public class MobileinfotableServiceImpl implements MobileinfotableService {
	@Resource
	MobileinfotableMapper mobileinfotableMapper;
	
	@Override
	public void insertV(Mobileinfotable mobileinfotable) {
		// TODO Auto-generated method stub
		mobileinfotableMapper.insertV(mobileinfotable);
	}

	@Override
	public Mobileinfotable getAreaById(String name){
		// TODO Auto-generated method stub
		return mobileinfotableMapper.getAreaById(name);
	}

}
