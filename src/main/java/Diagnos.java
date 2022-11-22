public class Diagnos {
    private boolean isPatientPositiveToGood;
    private boolean isOk;
    private int numberOfD;

    public Diagnos(boolean isPatientPositiveToGood, boolean isOk, int numberOfD) {
        this.isPatientPositiveToGood = isPatientPositiveToGood;
        this.isOk = isOk;
        this.numberOfD = numberOfD;
    }

    public Diagnos() {
    }

    public boolean isPatientPositiveToGood() {
        return isPatientPositiveToGood;
    }

    public void setPatientPositiveToGood(boolean patientPositiveToGood) {
        isPatientPositiveToGood = patientPositiveToGood;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public int getNumberOfD() {
        return numberOfD;
    }

    public void setNumberOfD(int numberOfD) {
        this.numberOfD = numberOfD;
    }
}
