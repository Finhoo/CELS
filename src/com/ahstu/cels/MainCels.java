/**
 * 
 */
package com.ahstu.cels;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.controller.SimpleContrller;

/**
 * @description ���������
 * @author ������
 * @createDate ����3:07:31
 * @version ver1.0
 * 
 */
public class MainCels {
	//�������
	public static void main(String[] args) {
		IController c = new SimpleContrller();
		c.start();
	}
}
