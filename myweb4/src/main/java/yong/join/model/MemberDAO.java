package yong.join.model;

public interface MemberDAO {
	public int memberJoin(MemberDTO dto);
	public int memberIdchk(String id);
	public int memberLogin(MemberDTO dto);
}
