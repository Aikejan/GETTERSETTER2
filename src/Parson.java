import java.time.LocalDate;

public class Parson {
  private   String firstName;
  private   String lastName;
  private   LocalDate year;
  private   String professional;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getYear() {
        return year;
    }

    public String getProfessional() {
        return professional;
    }
}
