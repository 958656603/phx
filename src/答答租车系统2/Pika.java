package ´ð´ð×â³µÏµÍ³2;

public class Pika extends Car {
	private int personNumber;
	private int boxNumber;
	public Pika(int carNumber,String carName,int carPay,int personNumber,int boxNumber) {
		this.setCarName(carName);
		this.setCarNumber(carNumber);
		this.setCarPay(carPay);
		this.personNumber=personNumber;
		this.boxNumber=boxNumber;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNmuber) {
		this.personNumber = personNmuber;
	}
	public int getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}
}
