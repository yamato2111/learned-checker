package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.DataFromDB;

public class WordsDAO extends DAO {
	public DataFromDB search(String keyword) throws Exception {
		
		DataFromDB dbdata = new DataFromDB();
		
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("select * from words where name like ?;");
		st.setString(1, keyword);
		ResultSet rs = st.executeQuery();
		
		if (rs.next()) {
			dbdata.setName(rs.getString("name"));
			dbdata.setLv(rs.getInt("Lv"));
			dbdata.setLesson(rs.getInt("lesson"));
			dbdata.setPart(rs.getInt("part"));
			dbdata.setNumber(rs.getInt("DBnumber"));
			dbdata.setIsExists(true);
		} else {
			dbdata.setIsExists(false);
		}
		
		st.close();
		con.close();
		
		return dbdata;
	}
}
