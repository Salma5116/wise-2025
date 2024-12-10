public class UniTest {

    public static void main(String[] args) {
        Course grdlprg = new Course("Grundlagen der Programmierung", 20);
        grdlprg.setDay("Tuesday");
        grdlprg.setBlock("B4");
        grdlprg.setRaum("238");
        grdlprg.print();
        Professor majuntke = new Professor("Majuntke");
        grdlprg.setTeacher(majuntke);
        //grdlprg.printParticipants();


        Student s = new Student();
        grdlprg.addStudent(s);
        //grdlprg.addStudent(s);
       // grdlprg.printParticipants();
        grdlprg.removeStudent(s);
        //grdlprg.printParticipants();

        GradeBookImpl gradeBook = new GradeBookImpl();
        gradeBook.addGrade("B1.1", "Grundlagen der Programmierung", 1.0);
        gradeBook.addGrade("B1.2", "Rechnernetze", 1.0);
        gradeBook.printGradeBook();
        


    }
    
}
