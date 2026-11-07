package builder.interfaces;

public interface StarterCourseStage {
    StarterCourseStage isStarterVegan();
    StarterCourseStage isStarterGlutenFree();
    MainCourseStage withMainCourse(String mainCourse);
}
