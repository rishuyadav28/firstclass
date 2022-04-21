package firstprogram;

public class employee {
	String name;
	int id;
	int age;
	char gender;
	 
	public void initialize() {
		name="abcd";
		id=1;
		age=19;
		gender='F';
	}
	 
	public void display() {
		System.out.println("this is employee name "+ name);
		System.out.println("this is employee age "+ age);
		System.out.println("this is employee gender "+ gender);
		System.out.println("this is employee id "+ id);
	}
	 public static void main(String[] args) {
		 employee obj=new employee();
		 obj.initialize();
		 obj.display();
	 }

}

