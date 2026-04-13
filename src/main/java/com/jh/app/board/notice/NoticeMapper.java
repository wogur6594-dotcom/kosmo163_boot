package com.jh.app.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jh.app.page.Pager;

@Mapper
public interface NoticeMapper {

	public Long getCount(Pager pager) throws Exception;

	// list Map<키 데이터타입, 모으려는 데이터타입(int안됨, 인티저 or 롱>
	public List<NoticeDTO> list(Pager pager) throws Exception;

	// detail
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;

	// create
	public int create(NoticeDTO noticeDTO) throws Exception;

	// update
	public int update(NoticeDTO noticeDTO) throws Exception;

	// delete
	public int delete(NoticeDTO noticeDTO) throws Exception;

}
