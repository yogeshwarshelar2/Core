package prepCall;

public class Employee {
	
	
	private String name;
	private int age;
	private Integer salar;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, Integer salar) {
		super();
		this.name = name;
		this.age = age;
		this.salar = salar;
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
	public Integer getSalar() {
		return salar;
	}
	public void setSalar(Integer salar) {
		this.salar = salar;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salar=" + salar + "]";
	}
	
	
	
	

}
