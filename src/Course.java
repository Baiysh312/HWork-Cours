public abstract class Course {
    private String nameOfCourse;
    private int duration;
    private String instructor;

    public Course(String nameOfCourse, int duration, String instructor) {
        this.nameOfCourse = nameOfCourse;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public abstract void conductClass();
    public void startCourse(){
        System.out.println("kurs "+nameOfCourse+" nachinaetsia");
    }


}
