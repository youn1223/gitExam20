package album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import album.model.AlbumDao;

@Controller
public class AlbumDeleteController {

	private final String command = "delete.ab";
	private final String gotoPage = "redirect:/list.ab";

	@Autowired
	AlbumDao albumDao;
	//albumList.jsp에서 삭제
	// youn1223 추가
	// youn1223 추가
	//youn1223 수정
	// youn1223 수정
	// kim 한번 더 수정
	// kim 한번 더 수정
	@RequestMapping(command)
	public String doAction(@RequestParam(value="num",required = true ) int num) {


		// 한줄 삭제
		int cnt = albumDao.deleteAlbum(num);
		return gotoPage;
	}
} 