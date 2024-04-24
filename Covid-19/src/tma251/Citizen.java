package tma251;
import java.util.ArrayList;
public class Citizen implements Comparable<Citizen> {

    private int civilIdNumber;
    private String name;
    private String city;
    private String country;
    private final ArrayList<Doses> dose = new ArrayList<>();
    
    public Citizen(int civilIdNumber, String name, String city, String country) {
        this.civilIdNumber = civilIdNumber;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    /**
     *
     * @return
     */
    public ArrayList<Doses> getDose() {
        return dose;
    }
    public void setDose(Doses dose) {
        this.dose.add(dose);
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
         this.country = country;
    } 
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCivilIdNumber() {
        return civilIdNumber;
    }
    public void setCivilIdNumber(int civilIdNumber) {
        this.civilIdNumber = civilIdNumber;
    }
    @Override
    public String toString() {
        return "{" + 
                "\n"+"civilIdNumber=" + civilIdNumber +
                "\n"+", name=" + name +
                "\n"+", city=" + city +
                "\n"+", country=" + country +
                "\n"+", dose=" + dose + '}';

    }
    @Override
    public int compareTo(Citizen o) {
        if(this.civilIdNumber>o.civilIdNumber)
        return o.civilIdNumber;
        else 
            return this.civilIdNumber;
    }
}
