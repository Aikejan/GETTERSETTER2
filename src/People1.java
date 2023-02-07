import java.time.LocalDate;

public class People1 {

   private String ferstname;
    private String lastname;
    private long cardnumber;
    private  LocalDate ofbirth;

    public String getFerstname() {
        return ferstname;
    }

    public void setFerstname(String ferstname) {
        this.ferstname = ferstname;
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
