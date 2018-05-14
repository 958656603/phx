package ´ð´ð×â³µÏµÍ³2;

public class Peoplecar extends Car {
	private int personNumber;
	public Peoplecar(int carNumber,String carName,int carPay,int personNumber) {
		this.setCarNumber(carNumber);
		this.setCarName(carName);
		this.setCarPay(carPay);
		this.personNumber=personNumber;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
}
