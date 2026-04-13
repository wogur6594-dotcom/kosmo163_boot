package com.jh.app.professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.app.page.Pager;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorMapper professorMapper;

	public List<ProfessorDTO> list(Pager pager) throws Exception {

		pager.makePageNumber(professorMapper.getCount(pager));

		pager.makeRowNumber();

		return professorMapper.list(pager);

	}
	// 게시물 아래 페이지 선택 버튼

	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception {
		return professorMapper.detail(professorDTO);
	}

	public int create(ProfessorDTO professorDTO) throws Exception {
		return professorMapper.create(professorDTO);
	}

	public int delete(ProfessorDTO professorDTO) throws Exception {
		return professorMapper.delete(professorDTO);
	}

	public int update(ProfessorDTO professorDTO) throws Exception {
		return professorMapper.update(professorDTO);
	}

}
