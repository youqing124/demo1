package com.offcn.pio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.po.Mobileinfotable;
import com.offcn.service.MobileinfotableService;

public class TestExcel {

	
	
	
	
	
	public static void main(String[] args) throws Exception, InvalidFormatException, FileNotFoundException, IOException {
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:beans.xml");
		MobileinfotableService mobileinfotableServiceImpl=(MobileinfotableService) app.getBean("mobileinfotableServiceImpl");
		Workbook workbook=WorkbookFactory.create(new FileInputStream("D:\\JavaSE\\10月份\\day005\\Mobile.xls"));
		
		 int sheetnum=workbook.getNumberOfSheets();
         for(int q=0;q<sheetnum;q++){
        Sheet sheet=workbook.getSheetAt(q);
		int rownum=sheet.getPhysicalNumberOfRows();
       for(int i=1;i<rownum;i++){
		Row row=sheet.getRow(i);
    		//System.out.println(row.getCell(0).getNumericCellValue());
    		//System.out.println(row.getCell(1).getStringCellValue());
    		
    		
    		Mobileinfotable mobile=new Mobileinfotable();
    		mobile.setId((int)row.getCell(0).getNumericCellValue());
    		mobile.setMobileNumber(row.getCell(1).getStringCellValue());
    		mobile.setMobileArea(row.getCell(2).getStringCellValue());
    		mobile.setMobileType(row.getCell(3).getStringCellValue());
    		mobile.setAreaCode(row.getCell(4).getStringCellValue());
    		mobile.setPostCode(row.getCell(5).getStringCellValue());
    		mobileinfotableServiceImpl.insertV(mobile);

            } 
        }
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testWrite() throws IOException{
		//1、创建工作簿对象
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		//2、基于工作簿来创建工作表
		
		XSSFSheet sheet=workbook.createSheet("工作表1");
		
		//3、创建行
		
		XSSFRow row=sheet.createRow(0);
		
		//4、创建单元格
		
		XSSFCell cell=row.createCell(2);
		
		cell.setCellValue("JAVA0612学习班");
		
		workbook.write(new FileOutputStream("d:\\chart\\3.xlsx"));
		workbook.close();
	}
	
}
