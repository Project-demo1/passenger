package com.example.passenger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger_details")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String age;
	private Integer source;
	private String destination;
	 Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, String name, String age,int source,String destination) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.source=source;
		this.destination=destination;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}
	public Integer getsource() {
		return source;
	}
	public void setsource(int source) {
		this.source= source;
	}
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination= destination;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + " , source="+ source +", destination=" + destination+"]";
	}
	

}


