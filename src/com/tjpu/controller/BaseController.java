package com.tjpu.controller;

/**
 * 
 * this is a baseController,which is used to response to string by characterEncoding utf-8 or other
 * 
 * @author guohu
 * @date 2016.12.6
 */
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class BaseController {

	public void writeStringToResponse(HttpServletResponse response, String content) {
		try {
			response.setCharacterEncoding("utf-8");
			PrintWriter pw = response.getWriter();
			pw.write(content);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
