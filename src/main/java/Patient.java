public class Patient {
    private String name;
    private int id;
    private boolean hasDiagnos;


    public Patient(String name, int id, boolean hasDiagnos) {
        this.name = name;
        this.id = id;
        this.hasDiagnos = hasDiagnos;
    }

    public Patient() {
    }

    public Diagnos getDiagnose(){
        setHasDiagnos(true);
        return  new Builder().createDiagnos();
    }

    public Analises getAnalisis() {
        return new Builder().createAnalises();
    }

    public Treatment haveTreatment() {
        if (hasDiagnos) {
            return new Builder().createTreatment();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasDiagnos() {
        return hasDiagnos;
    }

    public void setHasDiagnos(boolean hasDiagnos) {
        this.hasDiagnos = hasDiagnos;
    }
}
