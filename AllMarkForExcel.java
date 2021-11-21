package com.teacher.action;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Mark;
import com.teacher.entity.Mark2;
import com.teacher.entity.Message;
import com.teacher.service.Class_classService;
import com.teacher.service.MarkService;
import com.teacher.service.MessageService;
import com.teacher.service.TeacherService;

@SuppressWarnings("serial")
public class AllMarkForExcel extends ActionSupport {
	private MarkService markService;
	private Class_classService class_classService;
	private TeacherService teacherService;
	private MessageService messageService;

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public MarkService getMarkService() {
		return markService;
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}

	public Class_classService getClass_classService() {
		return class_classService;
	}

	public void setClass_classService(Class_classService classClassService) {
		class_classService = classClassService;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		List<Mark> all = markService.queryAll();
		List<Mark2> mark2 = new ArrayList<Mark2>();
		HSSFWorkbook wb = new HSSFWorkbook(); 
		HSSFSheet sheet = wb.createSheet("sheet0");  
//		//创建HSSFRow对象  
//		HSSFRow row = sheet.createRow(0);  
//		//创建HSSFCell对象  
//		HSSFCell cell=row.createCell(0);  
//		//设置单元格的值  
//		cell.setCellValue("单元格中的中文");  
//		//输出Excel文件  
//		HSSFRow row2=sheet.createRow(1);      
//	      //创建单元格并设置单元格内容  
//	      row2.createCell(0).setCellValue("姓名");  
//	      row2.createCell(1).setCellValue("班级");      
//	      row2.createCell(2).setCellValue("笔试成绩");  
		HSSFRow row = sheet.createRow(0);  
		row.createCell(0).setCellValue("评分班级");
		row.createCell(1).setCellValue("教师姓名");
		row.createCell(2).setCellValue("评分人数");
		row.createCell(3).setCellValue("所得总分");
		row.createCell(4).setCellValue("平均分");
		row.createCell(5).setCellValue("评语数");
		
		for (int i = 0; i < all.size(); i++) {
			Mark2 mark = new Mark2();
			List<Message> message = new ArrayList<Message>();
			int num = 0;
			message = messageService.queryAllByTid(all.get(i).getTea_id());
			for (int j = 0; j < message.size(); j++) {
				if (message.get(j).getCla_id() == all.get(i).getCla_id()) {
					num++;
				}
			}
			mark.setCla_name(class_classService.queryByID(
					all.get(i).getCla_id()).getCla_name());
			mark.setTea_name(teacherService.queryByID(all.get(i).getTea_id())
					.getTea_name());
			mark.setNumber(all.get(i).getNumber());
			mark.setTotal(all.get(i).getTotal());
			mark.setArg(all.get(i).getArg());
			mark.setMessage_num(num);//end
			HSSFRow row2 = sheet.createRow(i+1);  
			row2.createCell(0).setCellValue(class_classService.queryByID(
					all.get(i).getCla_id()).getCla_name());
			row2.createCell(1).setCellValue(teacherService.queryByID(all.get(i).getTea_id())
					.getTea_name());
			row2.createCell(2).setCellValue(all.get(i).getNumber());
			row2.createCell(3).setCellValue(all.get(i).getTotal());
			row2.createCell(4).setCellValue(all.get(i).getArg());
			row2.createCell(5).setCellValue(num);
			mark.setTea_id(all.get(i).getTea_id());
			mark.setCla_id(all.get(i).getCla_id());
			mark2.add(i, mark);
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allMark", mark2);

		FileOutputStream output=new FileOutputStream("d:\\workbook.xls");  
		wb.write(output);  
		output.flush();  
		return this.SUCCESS;
	}
}
