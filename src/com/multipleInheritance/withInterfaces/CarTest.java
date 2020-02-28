package com.multipleInheritance.withInterfaces;

public class CarTest {

	public static void main(String[] args) {
		
		//Car car = new Car();
		Alarm al = new Alarm() {
		};
		System.out.println(al.turnAlarmOff());
		//System.out.println(car.headlightOff());
	}

}
