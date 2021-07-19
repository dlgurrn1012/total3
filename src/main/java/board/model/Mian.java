package board.model;

import java.util.List;

import board.dao.BoardDAO;

public class Mian {

	public static void main(String[] args) {
		BoardDAO dao=new BoardDAO();
		//new BoardDAO().list(1);
		
		BoardVO board=new BoardVO();
		board.setTitle("제목16");
		board.setContent("Content16");
		board.setWriteId("id5");
		board.setWriteName("이름5");
		int result=dao.insert(board);
		System.out.println(result);
		//dao.list(1);
		
		//리스트 출력
		
		List<BoardVO> list=dao.select();
		for(BoardVO b:list) {
			System.out.println(b);
		}
		
	}

}
