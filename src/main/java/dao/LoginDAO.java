package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class LoginDAO extends DAO {
	public User search(String name, String password) throws Exception {
		User user = null;
		
		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement("select * from user where name=? and password=?;");
		st.setString(1, name);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
		return user;
	}

}
