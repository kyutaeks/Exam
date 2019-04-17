package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.DBConnector;
import com.dao.AddrDAO;

public class AddrDAOImpl implements AddrDAO {
	public static String selectAddrListSql = "select * from (select rownum as rown, addr.* from(select * from address order by ad_num) addr where rownum<=100) where rown>=1";
	private static String selectAddr = "select * from address where 1=1 and ad_num=?";

	@Override
	public List<Map<String, String>> selectAddrList(Map<String, String> addr) {
		try {
			PreparedStatement ps = DBConnector.getCon().prepareStatement(selectAddrListSql);
			ResultSet rs = ps.executeQuery();
			List<Map<String, String>> addrList = new ArrayList<>();
			while (rs.next()) {
				Map<String, String> address = new HashMap<>();
				address.put("ad_num", rs.getString("ad_num"));
				address.put("ad_sido", rs.getString("ad_sido"));
				address.put("ad_gugun", rs.getString("ad_gugun"));
				address.put("ad_dong", rs.getString("ad_dong"));
				address.put("ad_lee", rs.getString("ad_lee"));
				address.put("ad_bunji", rs.getString("ad_bunji"));
				address.put("ad_ho", rs.getString("ad_ho"));
				address.put("ad_roadcode", rs.getString("ad_roadcode"));
				address.put("ad_isbase", rs.getString("ad_roadcode"));
				address.put("ad_orgnum", rs.getString("ad_orgnum"));
				address.put("ad_subnum", rs.getString("ad_subnum"));
				address.put("ad_jinum", rs.getString("ad_jinum"));

				addrList.add(address);

			}
			return addrList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Map<String, String> selectAddr(Map<String, String> addr) {
		PreparedStatement ps ;
		try {
			ps = DBConnector.getCon().prepareStatement(selectAddr);
			ps.setString(1, addr.get("ad_num"));
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, String> address = new HashMap<>();
				address.put("ad_num", rs.getString("ad_num"));
				address.put("ad_sido", rs.getString("ad_sido"));
				address.put("ad_gugun", rs.getString("ad_gugun"));
				address.put("ad_dong", rs.getString("ad_dong"));
				address.put("ad_lee", rs.getString("ad_lee"));
				address.put("ad_bunji", rs.getString("ad_bunji"));
				address.put("ad_ho", rs.getString("ad_ho"));
				address.put("ad_roadcode", rs.getString("ad_roadcode"));
				address.put("ad_isbase", rs.getString("ad_isbase"));
				address.put("ad_orgnum", rs.getString("ad_orgnum"));
				address.put("ad_subnum", rs.getString("ad_subnum"));
				address.put("ad_jinum", rs.getString("ad_jinum"));
				return address;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int updateAddr(Map<String, String> addr) {
		return 0;
	}

	@Override
	public int deleteAddr(Map<String, String> addr) {
		return 0;
	}

	public static void main(String[] args) {
		AddrDAO adao = new AddrDAOImpl();
		Map<String, String> map = new HashMap<>();
		map.put("ad_num", "1");
		System.out.println(adao.selectAddrList(null));
		System.out.println(adao.selectAddr(map));
	}
}
