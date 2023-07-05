package com.okayjava.html.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ManagementTOPServiceImpl implements ManagementTOPService{

	@Override
	public ManagementTOPDto getInit() {
		AdministratorMenuDto adminMenu = new AdministratorMenuDto();
	    List<CategoryItemDto> systemModelEdit = new ArrayList<>();
	    List<CategoryItemDto> other = new ArrayList<>();
	    
	    systemModelEdit.add(new CategoryItemDto("カテゴリ管理", 0));
	    systemModelEdit.add(new CategoryItemDto("システム管理",0));
	    systemModelEdit.add(new CategoryItemDto("モデル管理",1));
	    systemModelEdit.add(new CategoryItemDto("カテゴリ・モデル関連付け",0));
	    systemModelEdit.add(new CategoryItemDto("カテゴリ管理（海外）",2));
	    systemModelEdit.add(new CategoryItemDto("モデル管理",1));
	    systemModelEdit.add(new CategoryItemDto("タグ管理",0));
	    systemModelEdit.add(new CategoryItemDto("タグ・モデル関連付け",0));
	    other.add(new CategoryItemDto("会社グループ管理",0));
	    other.add(new CategoryItemDto("会社一覧",1));
	    other.add(new CategoryItemDto("管理ユーザ",1));
	    other.add(new CategoryItemDto("ヘルプ",0));
	    adminMenu.setSystemModelEdit(systemModelEdit);
	    adminMenu.setOther(other);
	    
		ModelerMenuDto modelMenu = new ModelerMenuDto();
	    List<CategoryItemDto> menuControl = new ArrayList<>();
	    List<CategoryItemDto> other1 = new ArrayList<>();
	    menuControl.add(new CategoryItemDto("アクセス制御",0));
	    menuControl.add(new CategoryItemDto("運用規制",0));
	    menuControl.add(new CategoryItemDto("モデル利用組織（海外）",2));
	    menuControl.add(new CategoryItemDto("モデル利用者（海外）",2));
	    other1.add(new CategoryItemDto("お知らせ",0));
	    other1.add(new CategoryItemDto("利用レポート",0));
	    modelMenu.setMenuControl(menuControl);
	    modelMenu.setOther(other1);
	    
	    ManagementTOPDto managementTOP = new ManagementTOPDto();
	    managementTOP.setModelerMenu(modelMenu);
	    managementTOP.setAdministrationMenu(adminMenu);
	    
		return managementTOP;
	}
}
