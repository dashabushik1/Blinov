package chapter3.task1.patient;

public class Main {

    public static void main(String[] args) {

        Patient[] patients = new Patient[]{
                new Patient(1L, "Petrov", "Oleg", "Ivanovich", "Minsk, Saksaganskogo street, 31",
                        "6789087", "Flu", 34),
                new Patient(2L, "Ivanov", "Pavel", "Olegovich", "Minsk, Peremogy avenue, 45",
                        "2346710", "Flu", 67),
                new Patient(3L, "Sidorov", "Ilya", "Petrovich", "Minsk, Peremogy avenue, 12",
                        "7899000", "Broken leg", 54),
                new Patient(4L, "Kruglova", "Olga", "Alekseevna", "Minsk, Kotlyarevskogo street, 4",
                        "8907890", "Laryngitis", 55),
                new Patient(5L, "Ovsyannik", "Darya", "Alekseevna", "Minsk, Volodarskogo street, 47",
                        "5684090", "Bronchitis", 77),
                new Patient(6L, "Alegrova", "Polina", "Olegovna", "Minsk, Kazinca street, 8",
                        "1232323", "Laryngitis", 65),
        };

        Patient[] patientsByTheGivenDiagnosis = findPatientsByTheGivenDiagnosis(patients, "Laryngitis");
        System.out.println("List of patients with Laryngitis diagnosis are: ");
        for (int i = 0; i < patientsByTheGivenDiagnosis.length; i++) {
            System.out.println(patientsByTheGivenDiagnosis[i].getSurname() + " " + patientsByTheGivenDiagnosis[i].getName() +
                    " " + patientsByTheGivenDiagnosis[i].getPatronymic() + ": " + patientsByTheGivenDiagnosis[i].getDiagnosis());
        }

        Patient[] patientsByMedicalCardNumbersInTheGivenRange = findPatientsByCardNumberInTheGivenRange(patients, 50, 70);
        System.out.println("\nList of patients whose medical card number int the range from 50 to 70 are: ");
        for (int i = 0; i < patientsByMedicalCardNumbersInTheGivenRange.length; i++) {
            System.out.println(patientsByMedicalCardNumbersInTheGivenRange[i].getSurname() + " " + patientsByMedicalCardNumbersInTheGivenRange[i].getName() +
                    " " + patientsByMedicalCardNumbersInTheGivenRange[i].getPatronymic() + ": " + patientsByMedicalCardNumbersInTheGivenRange[i].getMedical_card_number());
        }

    }

    private static Patient[] findPatientsByTheGivenDiagnosis(Patient[] patients, String diagnosis) {
        Patient[] expectedPatientsByDiagnosis = new Patient[patients.length];
        int diagnosisIndex = 0;
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                expectedPatientsByDiagnosis[diagnosisIndex] = patient;
                diagnosisIndex++;
            }
        }
        Patient[] actualPatientsByDiagnosis = new Patient[diagnosisIndex];
        for (int i = 0; i < diagnosisIndex; i++) {
            actualPatientsByDiagnosis[i] = expectedPatientsByDiagnosis[i];
        }
        return actualPatientsByDiagnosis;
    }

    private static Patient[] findPatientsByCardNumberInTheGivenRange(Patient[] patients, int min, int max) {
        Patient[] expectedPatientsByMedicalCardNumbers = new Patient[patients.length];
        int cardNumberIndex = 0;
        for (Patient patient : patients) {
            if ((patient.getMedical_card_number() > min) && (patient.getMedical_card_number() < max)) {
                expectedPatientsByMedicalCardNumbers[cardNumberIndex] = patient;
                cardNumberIndex++;
            }
        }
        Patient[] actualPatientsByMedicalCardNumbers = new Patient[cardNumberIndex];
        for (int i = 0; i < cardNumberIndex; i++) {
            actualPatientsByMedicalCardNumbers[i] = expectedPatientsByMedicalCardNumbers[i];
        }
        return actualPatientsByMedicalCardNumbers;
    }
}
