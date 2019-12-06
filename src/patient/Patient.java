package patient;

public class Patient extends Person{

    private BloodType blood;

    public Patient(String name, int age, double weigth, Gender gender) {
        super(name, age, weigth, gender);
    }

    public Patient(String name, int age, double weigth, Gender gender, BloodType blood) {
        super(name, age, weigth, gender);
        this.blood = blood;
    }

    public BloodType getBlood() {
        return blood;
    }

    public void setBlood(BloodType blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "Patient [blood=" + blood + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getWeigth()="
                + getWeight() + ", getGender()=" + getGender() + "]";
    }



}
