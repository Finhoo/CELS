/**
 * 
 */
package test.com.ahstu.cels.util;

import org.junit.Test;

import com.ahstu.cels.util.InputUtil;

/**
 * @description ���������
 * @author ������
 * @createDate 2017��6��12�� ����4:02:27
 * @version ver1.0
 * 
 */
public class InputUtilTest {
   @Test
   public void testGetInt() {
	   int i=InputUtil.getInt("����������>");
	   System.out.println(i);
   }
}
