package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.AccountBeans;

public class logintest {
	//データベース接続に使用する情報
	final String jdbcId = "loginTest";
	final String jdbcPass = "MD_VsZ61@k9]YEng";
	final String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";

	//ログインアカウントを探す
	public AccountBeans findAccount(AccountBeans ad) {
		
		//戻り値の用意
		AccountBeans returnAb = new AccountBeans();
		
		//データベースへ接続
		try(Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
			
			String sql ="SELECT loginId, pass, name, roleId FROM account WHERE loginId = ? AND pass = ?";
			PreparedStatement ps= con.prepareStatement(sql);
			
			ps.setString(1, ad.getLoginId());
			ps.setString(2, ad.getPass());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				//見つかったアカウント情報を戻り値にセット
				returnAb.setLoginId(rs.getString("loginID"));
				returnAb.setPass(rs.getString("pass"));
				returnAb.setName(rs.getString("neme"));
				returnAb.setRole(rs.getInt("roleId"));
				
				} else {
					//アカウントがなければnullを返す
					return null;
					
				}
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return returnAb;
		
	}

}
