package com.jonline.module04.classes.task08;

/*
 * Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 */
public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long creditCardNumber;
	private long bankAccountNumber;

	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getPatronymic() {
		return this.patronymic;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getCreditCardNumber() {
		return this.creditCardNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public long getBankAccountNumber() {
		return this.bankAccountNumber;
	}
}
