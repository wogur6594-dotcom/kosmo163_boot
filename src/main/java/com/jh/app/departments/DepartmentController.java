package com.jh.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //컨트롤러는 Controller
@RequestMapping("/department/*") 	//어떤 URL이 왔을때 실행할것인가
public class DepartmentController {
	
	//DAO로 가는 중간엔 Service가 있다
	
	@Autowired //선언만 하면 null이니까 주입
	private DepartmentService departmentService;
	
	//전체 목록 list
//	@RequestMapping(value = "list", method = RequestMethod.GET) // list URL이 왔을때 GET이 왔을떄
	@GetMapping("list") //GET메서드로 실행, POST로 왔을떈 PostMapping
	public void list() throws Exception {
		System.out.println("Controller List");
		List<DepartmentDTO> ar = departmentService.list();
		//반복문 for(초기식; 조건식; 증감식){}
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));			
//		}
		
		
		// 향상된 for문 -요즘 대부분 씀
		//for(꺼낸 데이터타입 변수명:collection){}
		for(DepartmentDTO dto:ar) {
			System.out.println(dto);
		}

	}
	
	
}
