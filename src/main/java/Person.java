import java.util.Objects;

public class Person {
    private String gender;
    private String birthdate;
    private String dni;

    public Person(String gender, String birthdate, String dni) {
        this.gender = gender;
        this.birthdate = birthdate;
        this.dni = dni;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(gender, person.gender) && Objects.equals(birthdate, person.birthdate) && Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, birthdate, dni);
    }

    @Override
    public String toString() {
        return "the person with dni "+getDni()+" was born on the "+getBirthdate()+" and her/his gender is "+getGender();
    }
}
