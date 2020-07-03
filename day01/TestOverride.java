public class TestOverride {
	public static void main(String[] args) {
		Student stu1 = new Student("gzhang", 23, "Professor");
		Student stu2 = new Student("liling", 21, "Assistant");
		Student stu3 = new Student("gzhang", 23, "Professor");

		System.out.println("student info: " + stu1 + ", " + stu2);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1.equals(stu3));
	}
}

class Person {
	public String name;
	public int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	public String title;

	Student(String name, int age, String title) {
		super(name, age);
		this.title = title;
	}

	public String toString() {
		return "Name(" + name + "), Age(" + age + "), Title(" + title + ")";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student cmpStu = (Student)obj;
			return cmpStu.age == this.age;
		}
		
		return false;
	}
}