
public class Employee {
	
	private String fullName;
    private int salary;
    private int experience;
    
	public Employee(String fullName, int salary, int experience) {
		this.fullName = fullName;
		this.salary = salary;
		this.experience = experience;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}


	@Override
	public String toString() {
		return fullName+"  "+ salary + "$"+"  "+ experience + " years";
	}

}
