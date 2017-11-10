package yong.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MapsDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ArrayList<MapsDTO> mapcode(){
		try {
			conn = yong.db.YongDB.getConn();
			String sql ="select * from test_maps";
			ps= conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<MapsDTO> arr = new ArrayList<MapsDTO>();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String name = rs.getString("name");
				int xbar = rs.getInt("xbar");
				int ybar = rs.getInt("ybar");
				
				MapsDTO dto = new MapsDTO(idx, name, xbar, ybar);
				
				arr.add(dto);
			}
			return arr;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
