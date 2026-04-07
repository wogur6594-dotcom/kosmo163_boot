package com.jh.app.department;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 객체 생성
public class DepartmentDAO {

	@Autowired
	private SqlSession session;

	// final = 상수로 써라. 상수면 대문자
	private final String NAMESPACE = "com.jh.app.department.DepartmentDAO.";

	// 어느 namespace의 어떤 id를 가진 쿼리 태크를 실행 할 것인가?

	public List<DepartmentDTO> list() {
		// 사용하려는 mapper의 namespace.id 명
		// 1개 또는 0개면 selectOne 사용

		return session.selectList(NAMESPACE + "list");
	}

	public DepartmentDTO detail(String num) {
		return session.selectOne(NAMESPACE + "detail", num);

	}

	public int create(DepartmentDTO departmentDTO) {
		return session.insert(NAMESPACE + "create", departmentDTO);
	}

	public int delete(DepartmentDTO departmentDTO) {
		return session.delete(NAMESPACE + "delete", departmentDTO);
	}

	public int update(DepartmentDTO departmentDTO) {
		return session.update(NAMESPACE + "update", departmentDTO);
	}

}
