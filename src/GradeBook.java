public class GradeBook {

    private String courseName;
    private double[] grades;


    public GradeBook(String courseName, double[] grades) {
        GradeSorting.Sort(grades,0,grades.length-1);
        this.courseName = courseName;
        this.grades = grades;
    }

//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public double[] getGrades() {
//        return grades;
//    }
//
//    public void setGrades(double[] grades) {
//        this.grades = grades;
//    }

    public double getMinimum(){

        return grades[0];
    }
    public double getMaximum(){
        return grades[grades.length-1];
    }

    public double getAverage(){
        double total = 0;
        for (double grade : grades) {
            total+=grade;
        }
        return total/grades.length;
    }

//    public String outputGrades(){
//        return ;
//        ]
}
