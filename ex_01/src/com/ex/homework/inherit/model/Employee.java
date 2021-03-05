package com.ex.homework.inherit.model;

import java.util.Objects;

public class Employee extends Person {
	
	private String dp;
	private String job;
	private int salary;

	public Employee(){}

	public Employee(String name, int age, String gender, String dp, String job, int salary){
		super(name, age, gender);
		this.dp=dp;
		this.job=job;
		this.salary=salary;
	} 

	
	public Employee(String dp, String job, int salary) {
		super();
		this.dp = dp;
		this.job = job;
		this.salary = salary;
	}

	public void setDp(String dp){
		this.dp=dp;
	}
	public String getDp(){
		return dp;
	}

	public void setJob(String job){
		this.job=job;
	}
	public String getJob(){
		return job;
	}

	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}
	
	@Override
	//toString 오버라이딩
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+dp+" "+job+" "+salary;
	}

	@Override
	//equals오버라이딩
	//전부 같게하기
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			if(super.getName().equals(e.getName())&&super.getAge()==e.getAge()&&super.getGender().equals(e.getGender())
					&&getDp().equals(e.getDp())&&getJob().equals(e.getJob())&&getSalary()==e.getSalary());
				return true;
		}
		return false;
	}
	
	@Override
	//hashCode
	public int hashCode() {
		return Objects.hash(getName(),getAge(),getGender(),dp,job,salary);
	}
}
