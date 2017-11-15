package yong.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MapsDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public int storeAdd(MapsDTO dto) {
		try {
			conn = yong.db.YongDB.getConn();
			String sql ="insert into storelist values(storelist_idx.nextval,?,?,?,?)";
			ps= conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setFloat(2, dto.getLat());
			ps.setFloat(3, dto.getLng());
			ps.setString(4, dto.getAddr());
			
			int	cnt = ps.executeUpdate();
			
			return cnt;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {}
		}
	}
	public ArrayList<MapsDTO> mapcode(){
		try {
			conn = yong.db.YongDB.getConn();
			String sql ="select * from storelist";
			ps= conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<MapsDTO> arr = new ArrayList<MapsDTO>();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				String name = rs.getString("name");
				float lat = rs.getFloat("lat");
				float lng = rs.getFloat("lng");
				String addr = rs.getString("addr");
				MapsDTO dto = new MapsDTO(idx, name, lat, lng, addr);
				
				arr.add(dto);
			}
			return arr;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
