public class Person {

   private String firstName;
   private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void info() {
        System.out.println ("Imię: "+getFirstName()+" Nazwisko: "+getLastName());
    }

    int totalSalary(){

     return 0;

    }






}
