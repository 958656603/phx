package ����⳵ϵͳ2;

public class Boxcar extends Car {
	private int boxNumber;
	public Boxcar(int carNumber,String carName,int carPay,int boxNumber) {
		this.setCarNumber(carNumber);
		this.setCarName(carName);
		this.setCarPay(carPay);
		this.boxNumber=boxNumber;
	}
	public int getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}
}
