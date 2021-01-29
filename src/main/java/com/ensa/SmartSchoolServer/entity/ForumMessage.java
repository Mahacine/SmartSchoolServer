package com.ensa.SmartSchoolServer.entity;

import lombok.Data;

@Data
public class ForumMessage {

	private int id;
	private String content;
	private String messageWriter;
}
