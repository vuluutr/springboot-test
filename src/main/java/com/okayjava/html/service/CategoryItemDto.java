package com.okayjava.html.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryItemDto {
	private String name;
	private int type;
	private String url;
	
	public CategoryItemDto(String name, int type, String url) {
		this.name = name;
		this.type = type;
		this.url = url;
	}
}
