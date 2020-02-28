package com.multipleInheritance.withInterfaces;

public interface Vehicle {

	default String headlightOn() {
		return "head light On.";
	}

	default String headlightOff() {
		return "head light off.";
	}
}
