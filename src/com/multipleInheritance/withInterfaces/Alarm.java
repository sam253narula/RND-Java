package com.multipleInheritance.withInterfaces;

public interface Alarm {

	 default String turnAlarmOn() {
		return "Turning the alarm on.";
	 }

	default String turnAlarmOff() {
		return "Turning the alarm off.";
	}
	//showing changes to commit example
}
