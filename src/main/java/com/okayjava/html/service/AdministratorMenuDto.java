package com.okayjava.html.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorMenuDto {
    private List<CategoryItemDto> systemModelEdit;
    private List<CategoryItemDto> other;
}
