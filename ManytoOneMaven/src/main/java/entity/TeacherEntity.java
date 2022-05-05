package entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(targetEntity = CohortEntity.class)
	private Set cohortSet;

	// foreign key
//	@ManyToOne
//	@JoinColumn(name="fkey_dept")
//	private DepartmentEntity department;

	// all args constructor
	// could have a problem later
	public TeacherEntity(int teachId, String salary, String teacherName, Set cohortSet) {
		this.teachId = teachId;
		this.salary = salary;
		this.teacherName = teacherName;
		this.cohortSet = cohortSet;
	}

	// default constructor
	public TeacherEntity() {

	}

	public Set getCohortSet() {
		return cohortSet;
	}

	public void setCohortSet(Set cohortSet) {
		this.cohortSet = cohortSet;
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
