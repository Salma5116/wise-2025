public class GradeBookImpl implements GradeBook{

    private GradeBookEntry[] grades = new GradeBookEntry[30];

    @Override
    public void addGrade(String id, String subject, double score) {
        GradeBookEntry gbe = new GradeBookEntry(id, subject, score);
        for (int i = 0; i < grades.length; i++){
                if (grades[i] == null){
                    grades[i] = gbe;
                    break;
                }
        }
    }

    @Override
    public void updateGrade(String id, double score) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateGrade'");
    }

    @Override
    public double calculateAverage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateAverage'");
    }

    @Override
    public void printGradeBook() {
        for (int i = 0; i < grades.length; i++){
            if (grades[i] != null){
                grades[i].printEntry();
            }
        }

        
    }


    
}