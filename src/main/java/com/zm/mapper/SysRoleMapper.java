package com.zm.mapper;

import com.zm.bean.SysRole;
import com.zm.bean.SysRoleExample;
import com.zm.bean.SysUserRole;
import com.zm.bean.SysUserRoleExample;
import com.zm.bean.vo.RoleVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;



public interface SysRoleMapper {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

   // SysRole selectByPrimaryKey(String roleId);
    
    List<SysUserRole> selectByExample(SysUserRoleExample example);
    
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    SysRole selectByPrimaryKey(String id);
}