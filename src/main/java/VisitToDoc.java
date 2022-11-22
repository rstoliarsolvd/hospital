public class VisitToDoc {
    private Analises analises;
    private Patient patient;
    private Diagnos diagnos;
    private Doctor doctor;
    private Treatment treatment;

    public VisitToDoc(Analises analises, Patient patient, Diagnos diagnos, Doctor doctor, Treatment treatment) {
        this.analises = analises;
        this.patient = patient;
        this.diagnos = diagnos;
        this.doctor = doctor;
        this.treatment = treatment;
    }


    public VisitToDoc() {
    }

    public void checkPatient(Patient patient) {
        if (patient.isHasDiagnos()) {
            System.out.println("Your diagnos is - " + patient.getDiagnose().toString());

            Treatment treatment = patient.haveTreatment();
            System.out.println("So your Treatment is following" + treatment);

        } else {
            System.out.println("'First get analises");
            Analises analises = patient.getAnalisis();
            System.out.println("your analisis are - " + analises.toString());
            Diagnos diagnos = patient.getDiagnose();
            System.out.println("According to your analisis you are fine -" + diagnos.isOk());
            if (diagnos.isOk()) {
                System.out.println(doctor.toString() + " said  - You don't need medcine, you are fine");
            } else {
                System.out.println("sorry budy");
                System.out.println("Your diagnos is - " + patient.getDiagnose().toString());
                Treatment treatment = patient.haveTreatment();
                System.out.println("So your Treatment is following" + treatment);
            }
        }
    }
//
//    public Analises getAnalises() {
//        return analises;
//    }
//
//    public void setAnalises(Analises analises) {
//        this.analises = analises;
//    }
//
//    public Patient getPatient() {
//        return patient;
//    }
//
//    public Patient getThePatient() {
//        return new Builder().createPatient();
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
//
//    public Diagnos getDiagnos() {
//        return diagnos;
//    }
//
//    public void setDiagnos(Diagnos diagnos) {
//        this.diagnos = diagnos;
//    }
//
//    public Doctor getDoctor() {
//        return doctor;
//    }
//
//    public Doctor getTheDoctor() {
//        return new Builder().createDoctor();
//    }
//
//    public void setDoctor(Doctor doctor) {
//        this.doctor = doctor;
//    }
//
//    public Treatment getTreatment() {
//        return treatment;
//    }
//
//    public void setTreatment(Treatment treatment) {
//        this.treatment = treatment;
//    }
    }