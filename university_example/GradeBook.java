public interface GradeBook {

    /**
     * Fügt eine Note für ein bestimmtes Modul hinzu
     *
     * @param id        Id des Moduls.
     * @param subject   Das Modul.
     * @param score     Die Note.
     */
    void addGrade(String id, String subject, double score);

    /**
     * Aktualisiert die Note eines bestimmten Moduls
     *
     * @param id        Id des Moduls.
     * @param score     Die Note.
     */
    void updateGrade(String id, double score);

    /**
     * Berechnet den Durchschnitt aller Noten eines Studierenden.
     *
     * @return Der Durchschnitt der Noten, oder -1.0, falls der Studierende nicht
     *         existiert.
     */
    double calculateAverage();

    /**
     * Gibt das gesamte Notenbuch in einer formatierten Ausgabe aus.
     */
    void printGradeBook();


}