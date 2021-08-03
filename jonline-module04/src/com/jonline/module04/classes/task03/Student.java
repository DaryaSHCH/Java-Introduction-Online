package com.jonline.module04.classes.task03;

public class Student {
	
	private String surname;
	private String initials; 
	private int groupNumber;
	private int [] studentPerformance;
	
		public void setSurname(String surname){
			this.surname = surname; 
		}
		
		public String getSurname() {
			return this.surname; 
		}
		
		public void setInitials(String initials) {
			this.initials = initials; 
		}
		
		public String getInitials() {
			return this.initials;
		}
	
		public void setGroupNumber(int groupNumber) {
			this.groupNumber = groupNumber; 
		}
		
		public int getGroupNumber() {
			return this.groupNumber; 
		}
}
