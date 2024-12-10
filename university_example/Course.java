public class Course{

    //Attribute
    private String name;
    private int maxNrParticipants;
    private String day;
    private String block;
    private String raum;
    private Teacher teacher = null;
    private Student[] participants = null;


    //Konstruktor
    public Course(String name, int maxNrParticipants){
        this.name = name;
        this.maxNrParticipants = maxNrParticipants;
        this.participants = new Student[maxNrParticipants];
    }

    //Operationen

    public void print(){
        System.out.println(name);
        System.out.println(day);
        System.out.println(block);
        System.out.println(raum);
    }

    public void addStudent(Student s){
        for (int i = 0; i< participants.length; i++){
            if(participants[i] == null){
                participants[i] = s;
                break;
        }
    }
    }

    public void removeStudent(Student s){
        for (int i = 0; i < participants.length; i++){
            if (participants[i] == s){
                participants[i] = null;
            }
        }
    }

    public void printParticipants(){
        for (int i = 0; i < participants.length; i++){
            System.out.println("Stelle "+i + " "+ participants[i]);
        }
    }


    



    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the maxNrParticipants
     */
    public int getMaxNrParticipants() {
        return maxNrParticipants;
    }

    /**
     * @param maxNrParticipants the maxNrParticipants to set
     */
    public void setMaxNrParticipants(int maxNrParticipants) {
        this.maxNrParticipants = maxNrParticipants;
    }

    /**
     * @return String return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return String return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(String block) {
        this.block = block;
    }

    /**
     * @return String return the raum
     */
    public String getRaum() {
        return raum;
    }

    /**
     * @param raum the raum to set
     */
    public void setRaum(String raum) {
        this.raum = raum;
    }

    /**
     * @return Teacher return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return Student[] return the participants
     */
    public Student[] getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(Student[] participants) {
        this.participants = participants;
    }

}