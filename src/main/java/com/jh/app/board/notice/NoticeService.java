package com.jh.app.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.app.page.Pager;

@Service
public class NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	public List<NoticeDTO> list(Pager pager) throws Exception {

		pager.makePageNumber(noticeMapper.getCount(pager));

		return noticeMapper.list(pager);

	}
	// 게시물 아래 페이지 선택 버튼

	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.detail(noticeDTO);
	}

	public int create(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.create(noticeDTO);
	}

	public int delete(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.delete(noticeDTO);
	}

}
