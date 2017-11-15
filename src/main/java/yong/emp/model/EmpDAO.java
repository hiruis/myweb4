package yong.emp.model;

import java.util.*;

public interface EmpDAO {

		public int empAdd(EmpDTO dto);
		public List<EmpDTO> empList();
		public int empDel(EmpDTO dto);
		public List<EmpDTO> empSearch(EmpDTO dto);
		
		public EmpDTO empUpdateList(EmpDTO dto);
		public int empUpdate(EmpDTO dto);
}
