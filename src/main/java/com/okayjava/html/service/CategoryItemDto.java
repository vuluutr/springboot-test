package com.okayjava.html.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryItemDto {
	private String name;
	private int type;
	
	public CategoryItemDto(String name, int type) {
		this.name = name;
		this.type = type;
	}
}
