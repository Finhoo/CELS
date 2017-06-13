/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���word��Vocabulary�����ݷ��ʲ���
 * @author ������
 * @createDate ����11:35:33
 * @ version ver1.0
 */
public interface IBaseTermDao {
	// 1. �����еĵ���
	List<Word> getAllWords();
	
	// 2. �����еĴʻ�
	List<Vocabular> getAllVocabulars();
	
	//�־û���Ӣ�Ļ��������
	
	void persist(Map<String, String> data, boolean en2cn);
}
