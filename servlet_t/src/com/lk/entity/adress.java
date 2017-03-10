package com.lk.entity;

public class adress extends idEntity {
	private int address_id;
	private String address_name;
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	@Override
	public String toString() {
		return "Jdbc_address_entity [address_id=" + address_id + ", address_name=" + address_name + ", id=" + id + "]";
	}
	

}
