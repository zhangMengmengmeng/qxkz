package com.zm.service;


import java.util.List;

import com.zm.bean.SysRole;
import com.zm.bean.vo.RoleVO;




public interface RoleService {
	
	List<RoleVO> find() throws Exception;
	
	SysRole findRoleByUserId(String userId) throws Exception;
	

}
