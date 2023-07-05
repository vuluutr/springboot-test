package com.okayjava.html.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelerMenuDto {
    private List<CategoryItemDto> menuControl;
    private List<CategoryItemDto> other;
}
