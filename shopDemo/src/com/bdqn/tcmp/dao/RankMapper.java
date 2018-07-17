package com.bdqn.tcmp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.RankDTO;
import com.bdqn.tcmp.entity.Rank;
import com.bdqn.tcmp.util.Page;

public interface RankMapper {

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
	 * @param dto ������
	 * @return
	 */
	List<Rank> selectRankByPage(RankDTO dto); 
	
	
	/**
	 * ��ҳ��ѯ
	 * @param page
	 * @return
	 */
	List<Rank> selectRankPage(RankDTO dto); 
	/**
	 * ����������
	 * @return
	 */
	int selectRankCount();
	
	/**
	 * ɾ���˵�
	 * @param rankId
	 * @return
	 */
	int deleteRank(@Param("rankId")Integer rankId);
	
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
	int updateRankMoney(Rank rank);
}
