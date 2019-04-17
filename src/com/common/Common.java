package com.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Common {
	public static String getCmd(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String cmd = request.getParameter("cmd");
		if (cmd == null) {
			cmd = uri.substring(uri.lastIndexOf("/") + 1);
		}
		return cmd;
	}

	public static void goPage(HttpServletRequest request, HttpServletResponse response, String url)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	public static Map<String, String> getSingleMap(HttpServletRequest request) {
		Map<String, String> pMap = new HashMap<>();
		Map<String, String[]> map = request.getParameterMap();
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key)[0];
			pMap.put(key, value);
		}
		return pMap;
	}
}