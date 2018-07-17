package com.bdqn.tcmp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bdqn.tcmp.dto.RankDTO;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.service.RankService;
@Controller
@RequestMapping("/rank")
public class RankController {

	@Resource
	private RankService rankService;
	
	
	@ResponseBody
	@RequestMapping("/selAll.do")
	public Map<String, Object> selectRankAll() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rankList", rankService.selectRankAll());
		System.out.println("-------Map��ѯ�̻���ˮ���ؽ����" + JSON.toJSONString(map));
		return map;
	}
	@ResponseBody
	@RequestMapping("/add.do")
	public int insertRankMoney(Rank rank) {
//		������Ϣ
		
		return rankService.insertRankMoney(rank);
	}
	
	@RequestMapping("/selRankPage.do")
	@ResponseBody
	public Map<String, Object> selectRankPage(RankDTO dto) {
		System.out.println("�����ҳ��ѯ");
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(5);
		dto.setRowCount(this.rankService.selectRankCount());
		map.put("page", dto);
		map.put("rankPageList", this.rankService.selectRankByPage(dto));
		System.out.println(map.get("rankPageList"));
		System.out.println(JSON.toJSONString(map));
		return map;
	}
	
	@RequestMapping("/selPage.do")
	@ResponseBody
	public Map<String, Object> selectPage(RankDTO dto) {
		System.out.println("�����ҳ��ѯ");
		Map<String, Object> map = new HashMap<String, Object>();
		dto.setPageSize(10);
		dto.setRowCount(this.rankService.selectRankCount());
		map.put("page", dto);
		map.put("rankPage", this.rankService.selectRankPage(dto));
		System.out.println(map.get("rankPage"));
		System.out.println(JSON.toJSONString(map));
		return map;
	}
	
	

	/**
	 * ɾ��Controller
	 * @param rankId
	 * @return
	 */
	@RequestMapping("/deleteRank.do")
	@ResponseBody
	public boolean deleteCodeID(Integer rankId) {
		System.out.println(rankId);
		boolean isNo = this.rankService.deleteRank(rankId);
		System.out.println("============���ؽ����=============" + isNo);
		return isNo;
	}

	
	/**
	 * �޸��ã���ȡ����ID
	 * @param rankId
	 * @return
	 */
	@RequestMapping("/selRankById.do")
	@ResponseBody
	public Rank selectRandById(Integer rankId) {
		System.out.println("=======================��ȡ��������Id��"+rankId+"==================================");
		System.out.println(JSON.toJSONString(this.rankService.selectByID(rankId)));
		return this.rankService.selectByID(rankId);
	}

	
	/**
	 * �޸�Controller
	 * @param rank
	 * @return
	 */
	@RequestMapping("/updateRank.do")
	@ResponseBody
	public boolean updateRankMoney(Rank rank) {
		System.out.println(rank.toString());
		return this.rankService.updateRankMoney(rank);
	}


}
