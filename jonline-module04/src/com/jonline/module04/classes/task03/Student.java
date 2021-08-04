package com.jonline.module04.classes.task03;

public class Student {
	private String surnameAndInitials;
	private int groupNumber;
	private int[] studentProgress = new int[5];

	public Student(String surnameAndInitials, int groupNumber, int[] studentProgress) {
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.studentProgress = studentProgress;

	}

	public void setSurnameAndInitials(String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}

	public String getSurnameAndInitials() {
		return this.surnameAndInitials;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return this.groupNumber;
	}

	public void setStudentProgress(int[] studentProgress) {
		this.studentProgress = studentProgress;
	}

	public int[] getStudentProgress() {
		return this.studentProgress;
	}

	public static void printBestMarks(Student[] listStudents) {
		for (Student student : listStudents) {
			int tempCounter = 0;
			for (int mark : student.studentProgress) {
				if (mark < 9) {
					tempCounter++;
				}
			}
			if (tempCounter == 0)
				System.out.println(student.surnameAndInitials + "  " + student.groupNumber);
		}
	}
}
