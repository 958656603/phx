package ����⳵ϵͳ2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("��ӭʹ�ô���⳵ϵͳ");
		System.out.println("�������Ƿ�Ҫ�⳵");
		System.out.println("1."+"��"+" "+"2."+"��");
		Scanner o=new Scanner(System.in);
		int k=o.nextInt();
		if(k==1) {
			System.out.println("���������õĳ��Լ���Ŀ��������ʾ��");
			Car[] carList= {new Boxcar(1,"�ɻ���",400,4),new Boxcar(2,"��ά��",1000,20),new Peoplecar(3,"�µ�A4",500,4),new Peoplecar(4,"���Դ�6",400,4),new Pika(5,"Ƥ��6",450,4,2)};//���캯���������﷽ʽ
			System.out.println("���"+"\t"+"��������"+"\t"+"���"+"\t"+"����");
			for(Car car:carList) {
				if(car instanceof Boxcar) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"Ԫ/��\t"+((Boxcar)car).getBoxNumber()+"��");
				}
				if(car instanceof Peoplecar) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"Ԫ/��\t"+((Peoplecar)car).getPersonNumber()+"��");
				}
				if(car instanceof Pika) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"Ԫ/��\t"+((Pika)car).getBoxNumber()+"��"+"\t"+((Pika)car).getPersonNumber()+"��");
				}
			}
			System.out.println("��������Ҫ�⳵��������");
			int n=o.nextInt();
			int[] Zuche=new int[n];
			for(int i=0;i<n;i++) {
				int j=i+1;
				System.out.println("�������"+j+"�����ı�ţ�");
				Zuche[i]=o.nextInt();
			}
			System.out.println("�������⳵������");
			int day=o.nextInt();
			System.out.println("�����˵���");
			System.out.println("*****���˵ĳ����У�");
			int zairen=0;
			int zaihuo=0;
			int pay=0;
			for(int i=0;i<n;i++) {
				if(Zuche[i]==3) {
					System.out.print("�µ�A4"+"\t");
					zairen=zairen+4;
					pay=pay+500;
				}else if(Zuche[i]==4) {
					System.out.print("���Դ�6"+"\t");
					zairen=zairen+4;
					pay=pay+400;
				}else if(Zuche[i]==5) {
					System.out.print("Ƥ��6"+"\t");
					zairen=zairen+4;
					pay=pay+450;
				}
			}
			if(zairen!=0) {
				System.out.println("��������Ϊ"+zairen+"��");
			}else {
				System.out.println("��û�������˳�����");
			}
			System.out.println("*****�ػ������У�");
			for(int i=0;i<n;i++) {
				if(Zuche[i]==1) {
					System.out.print("�ɻ���"+"\t");
					zaihuo=zaihuo+4;
					pay=pay+400;
				}else if(Zuche[i]==2) {
					System.out.print("��ά��"+"\t");
					zaihuo=zaihuo+20;
					pay=pay+1000;
				}else if(Zuche[i]==5) {
					System.out.print("Ƥ��6"+"\t");
					zaihuo=zaihuo+2;
				}
			}
			if(zaihuo!=0) {
				System.out.println("�ػ�����Ϊ"+zaihuo+"��");
			}else {
				System.out.println("��û�����ػ�������");
			}
			System.out.println("*****�ܻ��ѣ�");
			System.out.println(day*pay+"Ԫ");
		}else if(k==2) {
			System.out.println("��л��ʹ�ñ���Ʒ��");
		}else {
			System.out.println("���������Ϣ�������������룡");
		}
	}
}
