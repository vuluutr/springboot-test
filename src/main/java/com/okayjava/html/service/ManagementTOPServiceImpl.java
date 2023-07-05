package com.okayjava.html.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ManagementTOPServiceImpl implements ManagementTOPService{

	@Override
	public ManagementTOPDto getInit() {
		AdministratorMenuDto adminMenu = new AdministratorMenuDto();
	    List<String> systemModelEdit = new ArrayList<>();
	    List<String> other = new ArrayList<>();
	    systemModelEdit.add("カテゴリ管理");
	    systemModelEdit.add("システム管理");
	    systemModelEdit.add("モデル管理");
	    systemModelEdit.add("カテゴリ・モデル関連付け");
	    systemModelEdit.add("カテゴリ管理（海外）");
	    systemModelEdit.add("タグ管理");
	    systemModelEdit.add("タグ・モデル関連付け");
	    other.add("会社グループ管理");
	    other.add("会社一覧");
	    other.add("管理ユーザ");
	    other.add("ヘルプ");
	    adminMenu.setSystemModelEdit(systemModelEdit);
	    adminMenu.setOther(other);
	    
		ModelerMenuDto modelMenu = new ModelerMenuDto();
	    List<String> menuControl = new ArrayList<>();
	    List<String> other1 = new ArrayList<>();
	    menuControl.add("アクセス制御");
	    menuControl.add("運用規制");
	    menuControl.add("モデル利用組織（海外）");
	    menuControl.add("モデル利用者（海外）");
	    other1.add("お知らせ");
	    other1.add("利用レポート");
	    modelMenu.setMenuControl(menuControl);
	    modelMenu.setOther(other1);
	    
	    ManagementTOPDto managementTOP = new ManagementTOPDto();
	    managementTOP.setModelerMenu(modelMenu);
	    managementTOP.setAdministrationMenu(adminMenu);
	    
		return managementTOP;
	}
}
