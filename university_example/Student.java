public class Student extends Person{

    private String imNr;
    private String major; // could also be a class
    private int faculty;

    public Student(String imNr) {
        this.imNr = imNr;
    }

    public Student(String imNr, String major){
        this.imNr = imNr;
        this.major = major;
    }

    public Student(){
    }

    public void print(){
        System.out.println("Hey, I am of class Student");
    }
    
    public void attendLecture(String lectureName){
        System.out.println("Student attends " + lectureName);
    }

    public void attendLecture(String lectureName, int faculty){

    }

    public void learn(){
        System.out.println("Learn ...");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }


    /**
     * @return String return the imNr
     */
    public String getImNr() {
        return imNr;
    }

    /**
     * @param imNr the imNr to set
     */
    public void setImNr(String imNr) {
        this.imNr = imNr;
    }

}
