package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TeacherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teachId;
	private String salary;
	private String teacherName;

	// foreign key
//	@ManyToOne
//	@JoinColumn(name="fkey_dept")
//	private DepartmentEntity department;

	// all args constructor
	// could have a problem later
	public TeacherEntity(int teachId, String salary, String teacherName) {
		this.teachId = teachId;
		this.salary = salary;
		this.teacherName = teacherName;
	}

	// default constructor
	public TeacherEntity() {

	}

	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
