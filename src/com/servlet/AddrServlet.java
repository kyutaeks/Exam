package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.Common;
import com.service.AddrService;
import com.service.impl.AddrServiceImpl;

@WebServlet(urlPatterns = { "/addr/list", "/addr/one" })
public class AddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AddrService as = new AddrServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String cmd = Common.getCmd(request);
		String url = "/views/addr/" + cmd;
		if ("list".equals(cmd)) {
			Map<String, String> addr = Common.getSingleMap(request);
			List<Map<String, String>> addrList = as.selectAddrList(addr);
			request.setAttribute("list", addrList);
		} else if ("one".equals(cmd)) {
			Map<String, String> addr = Common.getSingleMap(request);
			Map<String, String> map = as.selectAddr(addr);
			request.setAttribute("view", map);
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
