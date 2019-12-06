package patient;

public class MainPersonApp {

    public static void main(String[] args) {
        Person person1 = new Person("Milan Pamir", 4,16, Gender.MAN);
        Person patient1 = new Patient("Lion Pars", 1,12,Gender.MAN, BloodType.O);
        Person person2 = new Patient("Nergiz",34,45,Gender.WOMEN,BloodType.AB);

        System.out.println(person1);
        System.out.println(patient1);
        System.out.println(person2);
    }
}