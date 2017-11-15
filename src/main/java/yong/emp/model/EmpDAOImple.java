package yong.emp.model;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;

public class EmpDAOImple implements EmpDAO {

	private SqlSessionTemplate sqlMap;

	public EmpDAOImple(SqlSessionTemplate sqlMap) {// 인자 생성자 생성
		super();
		this.sqlMap = sqlMap;
	}

	public int empAdd(EmpDTO dto) {

		int count = sqlMap.insert("empInsert", dto);
		return count;

	}

	public List<EmpDTO> empList() {

		List<EmpDTO> arr = sqlMap.selectList("empList");

		return arr;
	}

	public int empDel(EmpDTO dto) {

		int count = sqlMap.delete("empDel", dto);

		return count;
	}

	public List<EmpDTO> empSearch(EmpDTO dto) {
		List<EmpDTO> arr = sqlMap.selectList("empSearch", dto);

		return arr;
	}

	public EmpDTO empUpdateList(EmpDTO dto) {
		EmpDTO dtos = sqlMap.selectOne("empUpdateList", dto);

		return dtos;
	}

	public int empUpdate(EmpDTO dto) {
		int count = sqlMap.update("empUpdate", dto);

		return count;

	}
}
