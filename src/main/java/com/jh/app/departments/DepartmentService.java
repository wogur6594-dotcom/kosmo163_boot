package com.jh.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //서비스 클래스는 Service
public class DepartmentService {
	//하나만 선언하고 여러번 호출함
	
	@Autowired //객체 주입
	private DepartmentDAO departmentDAO;
	
	
	//전체 목록 list
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("Service List");
		//DAO의 메서드 호출 참조변수명.메서드명()
		
		List<DepartmentDTO> ar = this.departmentDAO.list(); //DAO를 호출하면 Arraylist를 돌려준다 (리턴)
		
		return ar;
	}
	
	
}
