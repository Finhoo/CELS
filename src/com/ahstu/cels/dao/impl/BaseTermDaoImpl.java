/**
 * 
 */
package com.ahstu.cels.dao.impl;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���������
 * @author ������
 * @createDate ����4:59:21
 * @ version ver1.0
 */
public class BaseTermDaoImpl implements IBaseTermDao {
	/**
	 * ��������еĵ��ʵ������ļ�
	 */
	private static final String WORD_FILE = "datas/dic/w.dic";
	/**
	 * ��������еĴʻ�������ļ�
	 */
	private static final String VOCABULAR_FILE = "datas/dic/v.dic";
	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllWords()
	 */
	@Override
	public List<Word> getAllWords() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllVocabulars()
	 */
	@Override
	public List<Vocabular> getAllVocabulars() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#persist(java.util.Map, boolean)
	 */
	@Override
	public void persist(Map<String, String> data, boolean en2cn) {
		// TODO Auto-generated method stub

	}

}
