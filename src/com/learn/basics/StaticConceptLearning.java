package com.learn.basics;

import java.util.Arrays;

public class StaticConceptLearning {

	public static void main(String[] args) {
		TourPack mumbaiTour = new TourPack();
		String[] places = {"National Park", "Essel World"};
		mumbaiTour.setLocation(places);
		mumbaiTour.setTickets("5");
		TourPack.setPrice(7000);
		System.out.println("mumbaiTour"+ mumbaiTour + "price" + TourPack.price);
		TourPack puneTour = new TourPack();
		TourPack.setPrice(8000);
		System.out.println("puneTour" + puneTour+ "price" + TourPack.price);
	}

}

class TourPack{
	
	String[] location;
	static int price;
	String tickets;
	
	@Override
	public String toString() {
		return "TourPack [location=" + Arrays.toString(location) + ", tickets=" + tickets + "]";
	}
	public int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		TourPack.price = price;
	}
	public String[] getLocation() {
		return location;
	}
	public void setLocation(String[] location) {
		this.location = location;
	}
	
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	
}

