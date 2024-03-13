package emp;

public class Employe {
	private Integer id;
	private  String name;
	private Double salary;
	
	public Employe() {
		
	}
	
	public Employe(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary = salary + salary  * percentage / 100;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
