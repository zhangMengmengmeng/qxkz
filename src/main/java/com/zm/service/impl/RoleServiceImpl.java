package com.zm.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zm.bean.SysRole;
import com.zm.bean.SysUserRole;
import com.zm.bean.SysUserRoleExample;
import com.zm.bean.vo.RoleVO;
import com.zm.mapper.SysRoleMapper;
import com.zm.mapper.SysRolePermissionMapper;
import com.zm.mapper.SysUserRoleMapper;
import com.zm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	SysRoleMapper sysRoleMapper;
	
	@Autowired
	SysUserRoleMapper sysUserRoleMapper;
	
	@Autowired
	SysRolePermissionMapper sysRolePermissionMapper;
	



	@Override
	public SysRole findRoleByUserId(String userId) throws Exception{
		SysUserRoleExample example = new SysUserRoleExample();
		SysUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andSysUserIdEqualTo(userId);
		SysUserRole sysUserRole = sysUserRoleMapper.selectByExample(example).get(0);
		SysRole sysRole = sysRoleMapper.selectByPrimaryKey(sysUserRole.getSysRoleId());
		return sysRole;
	}




	@Override
	public List<RoleVO> find() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
