package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Column(name = "emp_id")
	// column id, generated value
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;

	private String fullName;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;

	public User() {

	}

	public User(String fullName, String email, String password, int age, double salary,
			String city) {
		//this.emp_id = emp_id;
		this.fullName = fullName;
		this.email = email;
		this.setPassword(password);
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [emp_id=" + emp_id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", age=" + age + ", salary=" + salary + ", city=" + city + "]";
	}

	

}

