public class MathCourse extends Course implements Onsiteable{
    public MathCourse(String nameOfCourse, int duration, String instructor) {
        super(nameOfCourse, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("provedenie urok Math");
    }

    @Override
    public void arrangeClassroom() {
        System.out.println("Организация класса для урока математики");
    }
}
