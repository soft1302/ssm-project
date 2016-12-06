package com.tjpu.dao;

import com.tjpu.pojo.SYSUser;

public interface SYSUserDao {
	public SYSUser getSYSUserById(int id);

	public int insertSYSUser(SYSUser sysUser);
}
