/**
 * 
 */
package test.com.ahstu.cels.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;
import com.ahstu.cels.service.impl.BaseTermServiceImpl;

/**
 * @description ���������
 * @author ������
 * @createDate ����9:41:38
 * @ version ver1.0
 */
public class BaseTermServiceImplTest {
	private IBaseTermService service = new BaseTermServiceImpl();
	
	@Test
	public void testgetAllWords() {
		Map<Character, List<Word>> result = service.getAllWords();
		//
		if (null != result) {
			Set<Character> keys = result.keySet();
			for (Character key : keys) {
				//ͨ��key����ȡvalue
				List<Word> values = result.get(key);
				//
				System.out.printf("����ĸΪ��%s �ĵ����У� \n", key);
				for (Word w : values) {
					System.out.println("\t"+w);
				}
				System.out.println("\n С�ƣ� "+values.size()+" ��.");
			}
		}
	}
}
