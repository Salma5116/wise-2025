public class UniTest {

    public static void main(String[] args) {
        Course grdlprg = new Course("Grundlagen der Programmierung", 20);
        grdlprg.setDay("Tuesday");
        grdlprg.setBlock("B4");
        grdlprg.setRaum("238");
        grdlprg.print();
        //grdlprg.printParticipants();

        Student s = new Student();
        grdlprg.addStudent(s);
        //grdlprg.addStudent(s);
        grdlprg.printParticipants();
        grdlprg.removeStudent(s);
        grdlprg.printParticipants();
        


    }
    
}
