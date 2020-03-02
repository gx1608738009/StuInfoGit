package entity;

public class StuInfo {
	private int stuNo;
	private String stuName;
	private int gender;
	private int age;
	private String email;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StuInfo(int stuNo, String stuName, int gender, int age, String email) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}
	public StuInfo() {
		super();
	}
	
}
