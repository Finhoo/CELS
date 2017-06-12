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
public class SimpleContrller implements IController {

	private IView view; // ʹ����ͼ

	/**
	 * Ĭ�Ϲ���������ʼ�� ��ͼʵ��
	 */
	public SimpleContrller() {
		this.view = new CommandView();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ahstu.cels.controller.IController#start()
	 */
	@Override
	public void start() {
		int choice = -1; // �����û���ѡ��
		boolean rtnTop = false; // ���������Ƿ񷵻���һ��
		boolean exist = false; // ���������Ƿ��˳��ı���
		Scanner sc = new Scanner(System.in);
		// ������ʾ��ӭ����
		view.description();
		// ����do while ѭ����չ�ֲ˵�
		do {
			// 1. ��ʾ���˵�
			view.showMianMenu();
			System.out.print("��ѡ��>");
			choice = sc.nextInt();

			// 2. �����û���ѡ����з�֧�ж�
			switch (choice) {
			case 1:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subShowBaseMenu();
					// ��һ�����û�ѡ��
					System.out.println("   ��ѡ��");
					choice = sc.nextInt();
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// �������
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						// TODO �������б�1 -- ��������б�
						break;
					case 2:
						// ����ʻ�
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						// TODO �������б�1 -- ����ʻ��б�
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
			case 2:
				while (!rtnTop) {
					// 1. ����ڶ����Ӳ˵�������Ϸѧϰ��
					view.subShowBaseMenu();
					// ��һ�����û�ѡ��
					System.out.println("   ��ѡ��");
					choice = sc.nextInt();
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// ��ʾ���Ļش�Ӣ��
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ĵ�Ӣ�ġ�.....******");
						// TODO �������б�3 -- ��������б� -- Ӣ�ĵ����ĵ���Ϸ
						break;
					case 2:
						// ��ʾӢ�ģ��ش�����
						System.out.println("\n *** �����ڴ����˹��ܿ����С�Ӣ�ĵ����ġ�.....******");
						// TODO �������б�4 -- Ӣ�ĵ����ĵ���Ϸ
						break;
					case 0:
						// ������һ��
						rtnTop = true;
						break;
					default:
						System.out.println("��������");
						break;
					}
					
					break;
				}
			case 3:
				while (!rtnTop) {
					// 1. �����һ���Ӳ˵���������⡿
					view.subTestingMenu();
					// ��һ�����û�ѡ��
					System.out.println("   ��ѡ��");
					choice = sc.nextInt();
					// ��һ����֧�Ӳ˵�����
					switch (choice) {
					case 1:
						// ��ʼ����
						System.out.println("\n *** �����ڴ����˹��ܿ����С����ʡ�.....******");
						// TODO �������б�5 -- ��ʼ����
						break;
					case 2:
						// �鿴���Ե���ʷ��¼
						System.out.println("\n *** �����ڴ����˹��ܿ����С��ʻ㡿.....******");
						// TODO �������б�6 -- �鿴���Ե���ʷ��¼
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
				System.out.println("��������");
				break;
			}

		} while (!exist);
	}

}
