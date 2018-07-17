package com.bdqn.tcmp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.bdqn.tcmp.dto.RankDTO;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.util.Page;

public interface RankService {

	/**
	 * �����˵�
	 * @return
	 */
	List<Rank> selectRankAll();
	
	/**
	 * ����/����
	 * @param rank
	 * @return 
	 */
	int insertRankMoney(Rank rank);
	

	/**
	 * ��ˮ�˵���ҳ��ѯ
	 * @param dto
	 * @return
	 */
	List<Rank> selectRankByPage(RankDTO dto); 
	
	/**
	 * ����������
	 * @return
	 */
	int selectRankCount();
	
	/**
	 * ��ҳ��ѯ
	 * @param page
	 * @return
	 */
	List<Rank> selectRankPage(RankDTO dto); 
	/**
	 * ɾ���˵�
	 * @param rankId
	 * @return
	 */
	boolean deleteRank(@Param("rankId")Integer rankId);
	
	/**
	 * ��ȡ����ID
	 * @param rankId
	 * @return
	 */
	Rank selectByID(@Param("rankId")Integer rankId);
	
	/**
	 * �޸���ˮ�˵��ӿ�
	 * @param rank
	 * @return
	 */
	boolean updateRankMoney(Rank rank);
}
