package com.woori.web.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.woori.web.dto.BoardDTO;
import com.woori.web.dto.LoginDTO;
import com.woori.web.dto.WriteDTO;

@Repository
public class BoardDAO {
// dao -> mybatis
	@Autowired
	private SqlSession sqlsession;

	public List<BoardDTO> boardList() {
		return sqlsession.selectList("board.boardList");
	}

	public BoardDTO detail(int bno) {
		return sqlsession.selectOne("board.detail", bno);
	}

	public void dele(int bno) {
		sqlsession.delete("board.dele", bno);
	}

	public void write(WriteDTO writeDTO) {
		sqlsession.insert("board.write", writeDTO);
	}


}
