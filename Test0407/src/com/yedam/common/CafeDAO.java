package com.yedam.common;

import java.util.ArrayList;
import java.util.List;

import com.yedam.test0407.CafeDTO;

public class CafeDAO extends DAO{
	
	private static CafeDAO cafeDao = null;
	private CafeDAO() {
		
	}
	public static CafeDAO getInstance() {
		if(cafeDao == null) {
			cafeDao = new CafeDAO();
		}
		return cafeDao;
	}
	
	public List<CafeDTO> getCafeList(){
		
		List<CafeDTO> list = new ArrayList<>();
		CafeDTO cf = null;
		
		try {
			conn();
			String sql = "SELECT * FROM cafe";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				cf = new CafeDTO();
				cf.setCoffeeMenu(rs.getString("coffee_menu"));
				cf.setCoffeePrice(rs.getInt("coffee_price"));
				cf.setCoffeeExplain(rs.getString("coffee_explain"));
				cf.setCoffeeSales(rs.getInt("coffee_price"));
				
				list.add(cf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	public CafeDTO getCafe(String coffeeMenu) {
		CafeDTO cf = null;
		
		try {
			conn();
			String sql = "SELECT * FROM cafe WHERE coffee_menu = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cf = new CafeDTO();
				cf.setCoffeeMenu(rs.getString("coffee_menu"));
				cf.setCoffeePrice(rs.getInt("coffee_price"));
				cf.setCoffeeExplain(rs.getString("coffee_explain"));
				cf.setCoffeeSales(rs.getInt("coffee_sales"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		
		return cf;
	}
	
	public int cfAdd(CafeDTO cf) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into cafe (coffee_menu, coffee_price, coffee_explain,coffee_sales) VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cf.getCoffeeMenu());
			pstmt.setInt(2, cf.getCoffeePrice());
			pstmt.setString(3, cf.getCoffeeExplain());
			pstmt.setInt(4, cf.getCoffeeSales());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return result;
	}
	
	public int cfSalse(CafeDTO cf) {
		int result = 0;
		
		try {
			conn();
			String sql = "update cafe set coffee_sales = coffee_sales + ? where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setString(2, cf.getCoffeeMenu());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	public int cfDelete(String coffeeMenu) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from cafe where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
public List<CafeDTO> getCafeSalseAll(){
		
		List<CafeDTO> list = new ArrayList<>();
		CafeDTO cf = null;
		
		try {
			conn();
			String sql = "SELECT * FROM cafe";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				cf = new CafeDTO();
				cf.setCoffeeMenu(rs.getString("coffee_menu"));
				cf.setCoffeeSales(rs.getInt("coffee_sales"));
				cf.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(cf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
}
