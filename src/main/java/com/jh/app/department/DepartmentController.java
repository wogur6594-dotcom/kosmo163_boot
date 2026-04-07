package com.jh.app.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("list")
	// 리퀘스트 대신 인터페이스 모델 모델=jsp로 운반 해주는 객체, 생명주기는 리퀘스트와 같다
	public ModelAndView list(ModelAndView mv) {
		List<DepartmentDTO> ar = departmentService.list();

		// request와 비슷한 역할, Spring이 제공
		mv.addObject("list", ar);
		mv.setViewName("department/list");

		return mv;
	}

	@GetMapping("detail")
	// 파라미터에서 num으로 오는걸 받기 위해 @RequestParam(name = "num") String num
	public void detail(@RequestParam(name = "num") String num, Model model) {
		DepartmentDTO departmentDTO = departmentService.detail(num);
		model.addAttribute("d", departmentDTO);
	}

	@GetMapping("create") // URL정보와 JSP의 경로가 같다면 void로 리턴
	public void create() {
	}

	@PostMapping("create")
	public String create(DepartmentDTO departmentDTO) {

		// 서비스에 리턴하는게 int 니까 선언
		int result = departmentService.create(departmentDTO);
		System.out.println("희망값 : 1 , 실제값 : " + result);

		// redirect - 포워드로 안가고 리다이렉트로
		return "redirect:./list";

	}

	@PostMapping("delete")
	public String delete(DepartmentDTO departmentDTO) {

		int result = departmentService.delete(departmentDTO);
		System.out.println("희망값 : 1 , 실제값 : " + result);

		return "redirect:./list";
	}

	@GetMapping("update")
	public void update(DepartmentDTO departmentDTO, Model model) {
		departmentDTO = departmentService.detail(departmentDTO.getDepartmentNo());
		model.addAttribute("d", departmentDTO);
		// URL과 리턴 경로가 같으면 리턴 안써도 됨
	}

	@PostMapping("update")
	public String update(DepartmentDTO departmentDTO) {

		int result = departmentService.update(departmentDTO);

		return "redirect:./list";

	}

}
