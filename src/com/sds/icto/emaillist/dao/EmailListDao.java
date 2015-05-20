package com.sds.icto.emaillist.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;
import com.sds.icto.emaillist.vo.EmailListVo;

@Repository
public class EmailListDao {
	
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;

	public void insert(EmailListVo vo) {
		sqlMapClientTemplate.insert(
				"emaillist.insert", vo );
	}

	public void delete(Long id) {
	}

	public void delete() {
	}

	@SuppressWarnings("unchecked")
	public List<EmailListVo> fetchList() {
		List<EmailListVo> list = 
			sqlMapClientTemplate.queryForList( "emaillist.list" );
		return list;
	}
}
