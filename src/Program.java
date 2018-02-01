public class Program {

    public static void main(String[] args) {

        Person[] tab = new Person[4];


        tab[0] = new Employee("Jan", "Kowalski", 3000);
        tab[1] = new Employee("Marek", "Nowak", 5000);
        tab[2] = new Director("Jan", "Kowalski", 3000, 2000);
        tab[3] = new Director("Karol", "Wilk", 11000, 1000);

        for (int i = 0; i < tab.length; i++) {
            tab[i].info();
        }

        System.out.println();
        System.out.println("Suma wynagrodzeń: " + sumaWynagrodzen(tab));

        int kwota=2500;
        System.out.println();
        System.out.println(powyzejKwoty(tab,kwota)+ "  osoby zarabiają powyżej " +kwota);



    }


    static int powyzejKwoty(Person[] tab, int kwota) {

        int suma = 0;

        for (Person person : tab) {

            if (person.totalSalary() > kwota)
                suma++;
        }

        return suma;
    }




    static int sumaWynagrodzen(Person[] tab) {

        int suma = 0;

        for (int i = 0; i < tab.length; i++) {
            suma += tab[i].totalSalary();

        }
        return suma;

    }
}

