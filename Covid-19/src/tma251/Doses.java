package tma251;

class Doses {
    private int doseID;
    private String manufacturer;
    private String time;
    private String place;
    private HealthProfessional healthProfessional;
    
    public Doses(String manufacturer, String time, String place, HealthProfessional healthProfessional) {
        this.manufacturer = manufacturer;
        this.time = time;
        this.place = place;
        this.healthProfessional = healthProfessional;
    }
    public Doses(int doseID, String manufacturer, String time, String place, HealthProfessional healthProfessional) {
        this.doseID = doseID;
        this.manufacturer = manufacturer;
        this.time = time;
        this.place = place;
        this.healthProfessional = healthProfessional;
    }

    public int getDoseID() {
        return doseID;
    }

    public void setDoseID(int doseID) {
        this.doseID = doseID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }
    @Override
    public String toString() {
        return "{" +
                "\n"+"  doseID=" + doseID +
                "\n"+", manufacturer=" + manufacturer +
                "\n"+", time=" + time +
                "\n"+", place=" + place +
                "\n"+", healthProfessional=" + healthProfessional + '}';
    }
}
