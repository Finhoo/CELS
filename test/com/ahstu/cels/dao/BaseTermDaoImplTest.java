/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.Word;

/**
 * @description ���������
 * @author ������
 * @createDate ����5:37:29
 * @ version ver1.0
 */
public class BaseTermDaoImplTest {
	private IBaseTermDao dao = new BaseTermDaoImpl();
	
	public void testGetAllWord() {
		List<Word> words = dao.getAllWords();
		if (words != null) {
			for (Word w: words) {
				System.out.println(w);
			}
		}
	}
}
