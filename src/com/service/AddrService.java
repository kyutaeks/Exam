package com.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface AddrService {
	public List<Map<String, String>> selectAddrList(Map<String, String> addr);

	public Map<String, String> selectAddr(Map<String, String> addr);

	public int insertAddr(Map<String, String> addr);

	public int updateAddr(Map<String, String> addr);

	public int deleteAddr(Map<String, String> addr);


}
