package com.ensa.SmartSchoolServer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.SmartSchoolServer.entity.Notice;
import com.ensa.SmartSchoolServer.service.NoticeService;

@RestController
@RequestMapping(value="/notice",method= {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET,RequestMethod.DELETE})
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "/getNotices",method=RequestMethod.GET)
	public List<Notice> getProfessors() {
		return noticeService.getNotices();
	}
	
	@RequestMapping(value = "/getNoticeByTitle",method=RequestMethod.POST)
	public Notice getNoticeByTitle(String title) {
		return noticeService.getNoticeByTitle(title);
	}
	
	@RequestMapping(value = "/getNoticeByPublicationDate",method=RequestMethod.POST)
	public Notice getNoticeByPublicationDate(String publicationDate) {
		return noticeService.getNoticeByPublicationDate(publicationDate);
	}
	
	@RequestMapping(value = "/updateTitle",method=RequestMethod.PUT)
	public boolean updateTitle(Notice notice, String title) {
		return noticeService.updateTitle(notice,title);
	}
	
	@RequestMapping(value = "/delete",method=RequestMethod.DELETE)
	public boolean delete(Notice notice) {
		return noticeService.delete(notice);
	}
	
	@RequestMapping(value = "/create",method=RequestMethod.POST)
	public boolean create(Notice notice) {
		return noticeService.create(notice);
	}
	
}
