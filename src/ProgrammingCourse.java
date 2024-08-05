public class ProgrammingCourse extends Course{
    public ProgrammingCourse(String nameOfCourse, int duration, String instructor) {
        super(nameOfCourse, duration, instructor);
    }
    @Override
    public void conductClass() {
        System.out.println("provedenie uroka progmmirovania");
    }
}
