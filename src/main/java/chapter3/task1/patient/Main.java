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
        print(patientsByTheGivenDiagnosis);

        Patient[] patientsByMedicalCardNumbersInTheGivenRange = findPatientsByCardNumberInTheGivenRange(patients, 50, 70);
        System.out.println("\nList of patients whose medical card number int the range from 50 to 70 are: ");
        print(patientsByMedicalCardNumbersInTheGivenRange);

    }

    private static Patient[] findPatientsByTheGivenDiagnosis(Patient[] patients, String diagnosis) {
        Patient[] patientsByDiagnosis = new Patient[patients.length];
        int diagnosisIndex = 0;
        for (Patient patient : patients) {
            if (patient.getDiagnosis().toLowerCase().equals(diagnosis.toLowerCase())) {
                patientsByDiagnosis[diagnosisIndex] = patient;
                diagnosisIndex++;
            }
        }
        trim(patientsByDiagnosis, diagnosisIndex);
        return patientsByDiagnosis;
    }

    private static Patient[] findPatientsByCardNumberInTheGivenRange(Patient[] patients, int min, int max) {
        Patient[] patientsByMedicalCardNumbers = new Patient[patients.length];
        int cardNumberIndex = 0;
        for (Patient patient : patients) {
            if ((patient.getMedical_card_number() > min) && (patient.getMedical_card_number() < max)) {
                patientsByMedicalCardNumbers[cardNumberIndex] = patient;
                cardNumberIndex++;
            }
        }
        trim(patientsByMedicalCardNumbers, cardNumberIndex);
        return patientsByMedicalCardNumbers;
    }

    private static Patient[] trim(Patient[] patients, int lenght) {
        Patient[] result = new Patient[lenght];
        int j = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                result[j] = patients[i];
            }
        }
        return result;
    }

    private static void print(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i].getSurname() + " " + patients[i].getName() +
                    " " + patients[i].getPatronymic());
        }
    }
}
