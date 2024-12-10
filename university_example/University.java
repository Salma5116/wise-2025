public class University{

    // Objektvariablen
    private String name;
    private String address;
    private int[] faculties = {1,2,3,4,5};
    private Student[] students;
    //Klassenvariable
    public static int nrOfStudents;

    public University(){
        students = new Student[1000];
        nrOfStudents = 1;
    }

    public void immatriculate(Student s){
        for (int i = 0; i <students.length; i++){
            if (students[i] == null){
                students[i] = s;
                String imNr = "s"+ addFillingZeros(nrOfStudents);
              //  System.out.println("Test" + imNr);
                s.setImNr(imNr);
                University.nrOfStudents++;
                break;
            }
        }
                
    }
    private String addFillingZeros(int nrOfStudents) {
        String result = String.valueOf(nrOfStudents);
        int zeroesToAdd = 6 - result.length();
        while (zeroesToAdd >0){
            result = "0" + result;
            zeroesToAdd--;
        }
        return result;

    }

                

}