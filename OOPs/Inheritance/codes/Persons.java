package OOPs.Inheritance.codes;

public class Persons {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        if (this.age < 0 && this.age > 100) {
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (firstName.isEmpty() && !(lastName.isEmpty())) {
            return lastName;

        }
        if (lastName.isEmpty() && !(firstName.isEmpty())) {
            return firstName;

        }
        return firstName + lastName;
    }

    public static void main(String[] args) {
        Persons o = new Persons();
        o.age = -1;
        System.out.println(o.isTeen());
    }

}
