package homework.Hillel;

public class Human {
	String firstName;
	String lastName;
	int age;

    public Human() {
        this.firstName = "no data";
        this.lastName = "no data";
        this.age = 0;
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}	
	