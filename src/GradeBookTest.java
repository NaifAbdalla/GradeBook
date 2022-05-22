import java.util.Arrays;

public class GradeBookTest {

    public static void main(String[] args){

        double[] array = {69,75.5,84,72,36.7};
        GradeBook gradeBook = new GradeBook("CS151",array);
        System.out.println(gradeBook.getMaximum());
        System.out.println(gradeBook.getMinimum());
        System.out.println(gradeBook.getAverage());
    }
}
