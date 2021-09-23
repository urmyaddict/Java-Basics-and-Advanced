package com.java11.exercises;

class Student1 {
	private String studentId;
	private String name;
	private String examId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String generateExamId() {
		
		//name
		String[] arrStr = getName().split(" ");
		String idFName = arrStr[0].substring(0, 3);
		String idLName = arrStr[1].substring(0, 3);
		
		//id
		int x = Integer.parseInt(this.getStudentId());
		Integer sq = (x%10)*(x%10);
		String idSquare = sq.toString();
		
		return idFName+"-"+idLName+":"+getStudentId()+"-"+idSquare;
		
		//id
//		int lastIndex = getStudentId().length()-1;
//		Character lastChar = Character.valueOf(getStudentId().charAt(lastIndex));
//		int lastDigit = Integer.valueOf(lastChar);

	}

}

public class Exercise1_Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stud1 = new Student1();
		Student1 stud2 = new Student1();
		
		stud1.setStudentId("4596");
		stud1.setName("John Whedon");
		System.out.println(stud1.generateExamId());
		
		stud2.setStudentId("3412");
		stud2.setName("Ross Stark");
		System.out.println(stud2.generateExamId());
		
	}
}
