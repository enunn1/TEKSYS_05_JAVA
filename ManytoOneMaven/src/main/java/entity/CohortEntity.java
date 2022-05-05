package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cohort")
public class CohortEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cohortId;
	private String cohortName;
	private String duration;

	// default constructor
	public CohortEntity() {}

	// all args constructor
	public CohortEntity(int cohortId, String cohortName, String duration) {
		this.cohortId = cohortId;
		this.cohortName = cohortName;
		this.duration = duration;
	}

	public int getCohortId() {
		return cohortId;
	}

	public void setCohortId(int cohortId) {
		this.cohortId = cohortId;
	}

	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
