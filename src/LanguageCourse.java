public class LanguageCourse extends Course implements Onlineable{

    public LanguageCourse(String nameOfCourse, int duration, String instructor) {
        super(nameOfCourse, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("provedenie urok Language");
    }

    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к курсу программирования");
    }
}
