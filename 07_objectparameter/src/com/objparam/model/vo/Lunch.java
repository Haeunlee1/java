package com.objparam.model.vo;

public class Lunch{

	private String menu;
	private int price;
	private String place;
	private String check;

	public Lunch(){}
	public Lunch(String menu, int price, String place){
		this.menu=menu;
		this.price=price;
		this.place=place;
	}

	public void setMenu(String menu){
		this.menu=menu;
	}
	public String getMenu(){
		return menu;
	}

	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}

	public void setPlace(String place){
		this.place=place;
	}
	public String getPlace(){
		return place;
	}


	public void checkTest(){
		check+=10;
		System.out.println("check : "+check);
	}
	
	public void setCheck(String check){
		this.check=check;
	}
}