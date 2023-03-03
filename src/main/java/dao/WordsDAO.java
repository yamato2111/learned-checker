package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.DataFromDb;

public class WordsDAO extends DAO {
	public DataFromDb search(String keyword) throws Exception {
		
		DataFromDb dbdata = new DataFromDb();
		
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("select * from words where name like ?;");
		st.setString(1, keyword);
		ResultSet rs = st.executeQuery();
		
		if (rs.next()) {
			dbdata.setName(rs.getString("name"));
			dbdata.setLv(rs.getInt("Lv"));
			dbdata.setLesson(rs.getInt("lesson"));
			dbdata.setPart(rs.getInt("part"));
		} else {
			// TODO データなしの結果を返す処理
		}
		
		st.close();
		con.close();
		
		return dbdata;
	}
}
