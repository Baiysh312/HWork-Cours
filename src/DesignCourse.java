public class DesignCourse extends Course{
    public DesignCourse(String nameOfCourse, int duration, String instructor) {
        super(nameOfCourse, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("provedenie urok Design");
    }
}
