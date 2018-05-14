package 答答租车系统2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("欢迎使用答答租车系统");
		System.out.println("请问您是否要租车");
		System.out.println("1."+"是"+" "+"2."+"否");
		Scanner o=new Scanner(System.in);
		int k=o.nextInt();
		if(k==1) {
			System.out.println("您可以租用的车以及价目表如下所示：");
			Car[] carList= {new Boxcar(1,"松花江",400,4),new Boxcar(2,"依维柯",1000,20),new Peoplecar(3,"奥迪A4",500,4),new Peoplecar(4,"马自达6",400,4),new Pika(5,"皮卡6",450,4,2)};//构造函数的另类表达方式
			System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");
			for(Car car:carList) {
				if(car instanceof Boxcar) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"元/天\t"+((Boxcar)car).getBoxNumber()+"吨");
				}
				if(car instanceof Peoplecar) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"元/天\t"+((Peoplecar)car).getPersonNumber()+"人");
				}
				if(car instanceof Pika) {
					System.out.println(car.getCarNumber()+"\t"+car.getCarName()+"\t"+car.getCarPay()+"元/天\t"+((Pika)car).getBoxNumber()+"吨"+"\t"+((Pika)car).getPersonNumber()+"人");
				}
			}
			System.out.println("请输入您要租车的数量：");
			int n=o.nextInt();
			int[] Zuche=new int[n];
			for(int i=0;i<n;i++) {
				int j=i+1;
				System.out.println("请输入第"+j+"辆车的编号：");
				Zuche[i]=o.nextInt();
			}
			System.out.println("请输入租车天数：");
			int day=o.nextInt();
			System.out.println("您的账单：");
			System.out.println("*****载人的车辆有：");
			int zairen=0;
			int zaihuo=0;
			int pay=0;
			for(int i=0;i<n;i++) {
				if(Zuche[i]==3) {
					System.out.print("奥迪A4"+"\t");
					zairen=zairen+4;
					pay=pay+500;
				}else if(Zuche[i]==4) {
					System.out.print("马自达6"+"\t");
					zairen=zairen+4;
					pay=pay+400;
				}else if(Zuche[i]==5) {
					System.out.print("皮卡6"+"\t");
					zairen=zairen+4;
					pay=pay+450;
				}
			}
			if(zairen!=0) {
				System.out.println("载人数量为"+zairen+"人");
			}else {
				System.out.println("您没有租载人车辆！");
			}
			System.out.println("*****载货车辆有：");
			for(int i=0;i<n;i++) {
				if(Zuche[i]==1) {
					System.out.print("松花江"+"\t");
					zaihuo=zaihuo+4;
					pay=pay+400;
				}else if(Zuche[i]==2) {
					System.out.print("依维柯"+"\t");
					zaihuo=zaihuo+20;
					pay=pay+1000;
				}else if(Zuche[i]==5) {
					System.out.print("皮卡6"+"\t");
					zaihuo=zaihuo+2;
				}
			}
			if(zaihuo!=0) {
				System.out.println("载货数量为"+zaihuo+"吨");
			}else {
				System.out.println("您没有租载货车辆！");
			}
			System.out.println("*****总花费：");
			System.out.println(day*pay+"元");
		}else if(k==2) {
			System.out.println("感谢您使用本产品！");
		}else {
			System.out.println("您输入的信息有误！请重新输入！");
		}
	}
}
