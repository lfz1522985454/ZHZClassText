package com.bdqn.tcmp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.tcmp.dao.RankMapper;
import com.bdqn.tcmp.dto.RankDTO;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.service.RankService;
import com.bdqn.tcmp.util.Page;

@Service("rankService")
public class RankServiceImpl implements RankService {

	@Resource
	private RankMapper rankMapper;

	public List<Rank> selectRankAll() {
		// TODO Auto-generated method stub
		return this.rankMapper.selectRankAll();
	}

	public int insertRankMoney(Rank rank) {
		// TODO Auto-generated method stub
		return this.rankMapper.insertRankMoney(rank);
	}

	public int selectRankCount() {
		// TODO Auto-generated method stub
		return this.rankMapper.selectRankCount();
	}

	public List<Rank> selectRankByPage(RankDTO dto) {
		// TODO Auto-generated method stub
		return this.rankMapper.selectRankByPage(dto);
	}

	public boolean deleteRank(Integer rankId) {
		// TODO Auto-generated method stub
		return this.rankMapper.deleteRank(rankId) > 0 ? true : false;
	}

	public List<Rank> selectRankPage(RankDTO dto) {
		// TODO Auto-generated method stub
		return this.rankMapper.selectRankPage(dto);
	}

	public Rank selectByID(Integer rankId) {
		// TODO Auto-generated method stub
		return this.rankMapper.selectByID(rankId);
	}

	public boolean updateRankMoney(Rank rank) {
		// TODO Auto-generated method stub
		return this.rankMapper.updateRankMoney(rank) > 0 ? true : false;
	}

}
