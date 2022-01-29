public class Person {

    private String name;
    private String email;
    private char gender;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setGender(char newGender) {
        this.gender = newGender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Person[name = " + getName() + ", email = " + getEmail() + ", gender = " + getGender() + "]";
    }

    public static void main(String[] args) {
    
        Person person1 = new Person();

        System.out.println(person1);

        person1.setName("person1");
        person1.setEmail("person1@gmail.com");
        person1.setGender('M');
        
        System.out.println("Name: " + person1.getName());
        System.out.println("Email: " + person1.getEmail());
        System.out.println("Gender: " + person1.getGender());
    }
}