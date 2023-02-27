package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.DataFromDb;

public class WordsDAO extends DAO {
	public List<DataFromDb> search(String table, String keyword) throws Exception {
		List<DataFromDb> list = new ArrayList<>();
		
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement("select * from noun where name like ?;");
		//st.setString(1, "%" + table + "%");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			DataFromDb dbdata = new DataFromDb();
			dbdata.setName(rs.getString("name"));
			dbdata.setLv(rs.getInt("Lv"));
			dbdata.setLesson(rs.getInt("lesson"));
			dbdata.setPart(rs.getInt("part"));
			list.add(dbdata);
		}
		
		st.close();
		con.close();
		
		return list;
	}
}
