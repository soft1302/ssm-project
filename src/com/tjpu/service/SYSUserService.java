package com.tjpu.service;

import com.tjpu.pojo.SYSUser;

public interface SYSUserService {
	public SYSUser getSYSUserById(int id);

	public int insertSYSUser(SYSUser sysUser);
}
