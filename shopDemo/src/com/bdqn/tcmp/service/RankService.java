package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.bdqn.tcmp.dto.RankDTO;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.util.Page;

public interface RankService {

	/**
	 * 收银账单
	 * @return
	 */
	List<Rank> selectRankAll();
	
	/**
	 * 进账/增加
	 * @param rank
	 * @return 
	 */
	int insertRankMoney(Rank rank);
	

	/**
	 * 流水账单分页查询
	 * @param dto
	 * @return
	 */
	List<Rank> selectRankByPage(RankDTO dto); 
	
	/**
	 * 返回总行数
	 * @return
	 */
	int selectRankCount();
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<Rank> selectRankPage(RankDTO dto); 
	/**
	 * 删除账单
	 * @param rankId
	 * @return
	 */
	boolean deleteRank(@Param("rankId")Integer rankId);
	
	/**
	 * 获取主键ID
	 * @param rankId
	 * @return
	 */
	Rank selectByID(@Param("rankId")Integer rankId);
	
	/**
	 * 修改流水账单接口
	 * @param rank
	 * @return
	 */
	boolean updateRankMoney(Rank rank);
}
