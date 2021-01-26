package bean;

import java.util.List;

public class Member {	//1 bean 클래스
	private String id;
	private String name;
	private int age;
	private String gender;
	private List<Board> boardBeans;

	// getter, setter, 생성자, tostring 구현
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public List<Board> getBoardBeans() {
		return boardBeans;
	}

	public void setBoardBeans(List<Board> boardBeans) {
		this.boardBeans = boardBeans;
	}

	public Member(String id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Member() {
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", boardBeans="
				+ boardBeans + "]";
	}

	public Member(String id, String name, int age, String gender, List<Board> boardBeans) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.boardBeans = boardBeans;
	}

	
}
