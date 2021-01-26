package com.ensa.SmartSchoolServer.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ensa.SmartSchoolServer.dao.NoticeDao;
import com.ensa.SmartSchoolServer.entity.Notice;

@Component
public class NoticeService {
	
	private NoticeDao noticeDao;
	
	@Autowired
	public NoticeService(NoticeDao noticeDao) {
		super();
		this.noticeDao = noticeDao;
	}
	
	public List<Notice> getNotices() {
		return this.noticeDao.getNotices();
	}
	
	public Notice getNoticeByTitle(String title) {
		return this.noticeDao.getNoticeByTitle(title);
	}
	
	public Notice getNoticeByPublicationDate(String publicationDate) {
		return this.noticeDao.getNoticeByPublicationDate(publicationDate);
	}
	
	public boolean create(Notice notice) {
		return this.noticeDao.create(notice);
	}
	
	public boolean updateMessage(Notice notice, String message) {
		return this.noticeDao.updateMessage(notice, message);
	}
	
	public Notice updateTitle(Notice notice, String title) {
		return this.noticeDao.updateTitle(notice, title);
	}
	
	public Notice updatePublicationDate(Notice notice, Date date) {
		return this.noticeDao.updatePublicationDate(notice, date);
	}
	
	public Notice delete(Notice notice) {
		return this.noticeDao.delete(notice);
	}

}