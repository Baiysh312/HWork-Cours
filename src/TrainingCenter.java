public class TrainingCenter {
    public TrainingCenter() {
    }

    private Course []courses= new Course[8];

    public Course[] getCourse() {
        return courses;
    }

    public void setCourse(Course[] course) {
        this.courses = course;
    }
    private int count=0;
    public void addCourse(Course course){
        courses[count]= course;
        count++;
    }
}
