package lk.ac.pdn.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String id;
	private String title;
	private int numberOfCredits;
	private String description;
	private List<Course> prerequisits = new ArrayList<Course>();
	
	public Course(String id) {
		this.id = id;
	}
	
	public Course(String id, String title, int numberOfCredits) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfCredits = numberOfCredits;
	}

	public void addPrerequisit(Course c) {
		prerequisits.add(c);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
