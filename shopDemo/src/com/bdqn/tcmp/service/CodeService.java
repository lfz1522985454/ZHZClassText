package com.bdqn.tcmp.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bdqn.tcmp.dto.CodeDTO;
import com.bdqn.tcmp.entity.Code;

public interface CodeService {
	/**
	 * �̻���ѯ ���ռ����ѯȫ��
	 * @return
	 */
	List<Map<String,Object>> SelectCodeAll(Integer levelID);
	
	/**
	 * �����û�
	 * @param code
	 * @return ������Ӱ������
	 */
	int IntegerCode(Code code);
	
	/**
	 * �������ķ�ҳ��ѯ
	 * @param dto
	 * @return
	 */
	List<Code> SelectCodePage(CodeDTO dto);
	/**
	 * ��ҳ����������
	 * @return ��Ӱ������
	 */
	int selectCount();
	
	
	/**
	 * ɾ���̻���Ϣ
	 * @param id
	 * @return
	 */
	boolean deleteCode(@Param("codeId")Integer codeId);
	
	/**
	 * ����������ѯ
	 * @param dto
	 * @return
	 */
	List<Code> SelectCodeWhere(CodeDTO dto);
	
	/**
	 * ����������ȡId
	 * @param codeId
	 * @return
	 */
	Code selectCodeById(@Param("codeId")Integer codeId);
	
	/**
	 * �޸�
	 * @param code
	 * @return
	 */
	boolean updateCode(Code code);
}
