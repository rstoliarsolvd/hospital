public class Doctor {
    private String name;
    private String speciality;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
