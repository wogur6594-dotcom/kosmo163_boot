package com.jh.app.board.notice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jh.app.page.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("list") // Get으로 list가 왔을때
	public ModelAndView list(Pager pager, ModelAndView mv) throws Exception {
		List<NoticeDTO> ar = noticeService.list(pager);

		mv.addObject("list", ar);
		mv.setViewName("board/list");

		return mv;

	}

	@GetMapping("detail")
	public String detail(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.detail(noticeDTO);
		model.addAttribute("d", noticeDTO);

		return "board/detail";
	}

	@GetMapping("create")
	public void create() {

	}

	@PostMapping("create")
	public String create(NoticeDTO noticeDTO) throws Exception {

		int result = noticeService.create(noticeDTO);

		return "redirect:./list";
	}

	@PostMapping("delete")
	public String delete(NoticeDTO noticeDTO) throws Exception {
		noticeService.delete(noticeDTO);
		return "redirect:./list";
	}

}
