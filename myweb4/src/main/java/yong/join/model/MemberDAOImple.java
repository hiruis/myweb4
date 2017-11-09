package yong.join.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOImple implements MemberDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public int memberJoin(MemberDTO dto) {
		try {
			conn = yong.db.YongDB.getConn();
			String sql ="insert into jsp_member values(jsp_member_idx.nextval,?,?,?,?,?,sysdate)";
			ps= conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getPwd());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());
			int count = ps.executeUpdate();
			return count;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally {
			try {
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public int memberIdchk(String id) {
		try {
			conn = yong.db.YongDB.getConn();
			String sql ="select count(*) cnt from jsp_member where id=?";
			ps= conn.prepareStatement(sql);
			ps.setString(1,id);
			
			rs = ps.executeQuery();
			
			rs.next();
			int count = rs.getInt("cnt");
			return count;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
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
