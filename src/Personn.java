import java.time.LocalDate;

public class Personn {
    String firstname;
    String lastname;
    long cardnumber;
    LocalDate ofbirth;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public LocalDate getOfbirth() {
        return ofbirth;
    }

    public void setOfbirth(LocalDate ofbirth) {
        this.ofbirth = ofbirth;
    }
}
