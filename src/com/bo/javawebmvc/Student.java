
package com.bo.javawebmvc;

/**
 * @author zhangbo
 * 2017年2月19日  下午9:59:10
 * 
 */
public class Student {
	private Integer id;
	private String studentName;
	private String gender;
	
	/**
	 * @param id
	 * @param studentName
	 * @param gender
	 */
	public Student(Integer id, String studentName, String gender) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.gender = gender;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
