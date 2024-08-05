import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        ProgrammingCourse programming= new ProgrammingCourse("Java",8,"Jobs");
        ProgrammingCourse programming1= new ProgrammingCourse("JavaScript",8,"Jobs");

        MathCourse mathCourse= new MathCourse("vysh Mat",12,"Alex");
        MathCourse mathCourse1= new MathCourse("Math",10,"Alen");

        DesignCourse designCourse= new DesignCourse("Design",6,"Max");
        DesignCourse designCourse1= new DesignCourse("PHP",7,"Max");

        LanguageCourse languageCourse= new LanguageCourse("English",4,"Malen");
        LanguageCourse languageCourse1= new LanguageCourse("Franc",4,"Malen");

        TrainingCenter trainingCenter = new TrainingCenter();

        trainingCenter.addCourse(programming);
        trainingCenter.addCourse(programming1);
        trainingCenter.addCourse(mathCourse);
        trainingCenter.addCourse(mathCourse1);
        trainingCenter.addCourse(languageCourse);
        trainingCenter.addCourse(languageCourse1);
        trainingCenter.addCourse(designCourse);
        trainingCenter.addCourse(designCourse1);

        for (Course course: trainingCenter.getCourse()) {
            if (course instanceof MathCourse){
                ((MathCourse) course).arrangeClassroom();
                ((MathCourse) course).conductClass();
            } else if (course instanceof LanguageCourse) {
                ((LanguageCourse) course).provideOnlineAccess();
            }else {
                course.conductClass();
            }
        }
    }
}
