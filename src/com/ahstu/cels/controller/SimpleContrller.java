/**
 * 
 */
package com.ahstu.cels.controller;


import java.util.Scanner;

import com.ahstu.cels.controller.IController;
import com.ahstu.cels.view.IView;
import com.ahstu.cels.view.impl.CommandView;

/**
 * @description ���������
 * @author ������
 * @createDate ����11:10:05
 * @version ver1.0
 * 
 */
public class SimpleContrller implements IController{

	private IView view; // ʹ����ͼ
	/**
	 * Ĭ�Ϲ���������ʼ�� ��ͼʵ��
	 */
	public SimpleContrller() {
		this.view = new CommandView();
	}
	
	/* (non-Javadoc)
	 * @see com.ahstu.cels.controller.IController#start()
	 */
	@Override
	public void start() {
		int choice = -1; // �����û���ѡ��
		boolean rtnTop = false; //���������Ƿ񷵻���һ��
		boolean exist = false; //���������Ƿ��˳��ı���
		Scanner sc = new Scanner(System.in);
		//������ʾ��ӭ����
		view.description();
		//����do while ѭ����չ�ֲ˵�
		do {
			//1. ��ʾ���˵�
			view.showMianMenu();
			System.out.print("��ѡ��>");
			choice = sc.nextInt();
			
			//2. �����û���ѡ����з�֧�ж�
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subShowBaseMenu();
					//��һ�����û�ѡ��
					System.out.println("   ��ѡ��");
					choice = sc.nextInt();
					//��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// �������
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						//TODO �������б�1 -- ��������б�
						break;
					case 2:
						// ����ʻ�
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						//TODO �������б�1 -- ����ʻ��б�
						break;
					case 0:
						rtnTop = true;
						break;
					default:
						System.out.println("��������");
						break;
					}
				}
				break;

			default:
				break;
			}
			
		} while (!exist);
	}
	
}
