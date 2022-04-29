package com.woori.web.dto;

public class WriteDTO {
	/*
	 * 글쓰기 할때만 필요한 DTO
	 * 제목, 내용, 글쓴이 = id = 세션
	 */
	private String title, content, lid;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}
	
}
