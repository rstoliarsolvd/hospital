import java.util.Random;

public class Builder {

    public Analises createAnalises() {
        Analises analises = new Analises();
        analises.setBloodPreasure(generateBlPress());
        analises.setBloodGood(generateAnyBool());
        analises.setPeeGood(generateAnyBool());
        analises.setSkinGood(generateAnyBool());

        return analises;
    }

    public static int generateBlPress() {
        return (int) (Math.random() * 150);
    }

    public static boolean generateAnyBool() {
        return (Math.random() * 2) == 0;
    }

    public static String generateAnyString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
    public static String generateShortString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public Treatment createTreatment() {
        Treatment treatment = new Treatment();
        treatment.setPill(generateAnyString());
        treatment.setPill(generateAnyString());
        treatment.setInjection(generateAnyString());
        return treatment;
    }

    public Doctor createDoctor(){
        Doctor doctor =  new Doctor();
        doctor.setName(generateShortString());
        doctor.setSpeciality(generateShortString());
        return doctor;
    }

    public Patient createPatient(){
        Patient patient = new Patient();
        patient.setName(generateShortString());
        patient.setHasDiagnos(generateAnyBool());
        patient.setId(generateBlPress());
        return patient;
    }

    public Diagnos createDiagnos(){
        Diagnos diagnos = new Diagnos();
        boolean ok = generateAnyBool();
        diagnos.setOk(ok);
              if(!ok){
                  diagnos.setPatientPositiveToGood(generateAnyBool());
                  diagnos.setNumberOfD(generateBlPress());
              }
        return diagnos;
    }
}
