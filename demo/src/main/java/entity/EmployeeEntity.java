package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	@Column(name = "emp_id")
	// column id, generated value
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;

	private String firstName;
	private String email;
	private double salary;
	private String city;

	public EmployeeEntity() {

	}

	public EmployeeEntity(String firstName, String email, double salary,
			String city) {
		//this.emp_id = emp_id;
		this.firstName = firstName;
		this.email = email;
		this.salary = salary;
		this.city = city;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "EmployeeEntity [emp_id=" + emp_id + ", firstName=" + firstName + ", email=" + email + 
				", salary=" + salary + ", city=" + city + "]";
	}

}
