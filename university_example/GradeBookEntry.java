
public class GradeBookEntry {

    private String id;
    private String module;
    private double grade;

    
    public GradeBookEntry(String id, String module, double grade){
        this.id = id;
        this.module = module;
        this.grade = grade;
    }

    public void printEntry(){
        System.out.println(this.id +" " +this.module +" "+ this.grade);
    }


    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * @return double return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

}
