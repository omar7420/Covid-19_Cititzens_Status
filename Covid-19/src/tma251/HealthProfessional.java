package tma251;

class HealthProfessional {
    private int profCivilIdNumber;
    private String name;
    private int experienceInYears;
    
    public HealthProfessional(int profCivilIdNumber, String name, int experienceInYears) {
        this.profCivilIdNumber = profCivilIdNumber;
        this.name = name;
        this.experienceInYears = experienceInYears;
    }

    public int getProfCivilIdNumber() {
        return profCivilIdNumber;
    }

    public void setProfCivilIdNumber(int profCivilIdNumber) {
        this.profCivilIdNumber = profCivilIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    @Override
    public String toString() {
        return "{" +
                "\n"+ "profCivilIdNumber=" + profCivilIdNumber +
                "\n"+ ", name=" + name +
                "\n"+ ", experienceInYears=" +experienceInYears + '}';
    }

    
}
