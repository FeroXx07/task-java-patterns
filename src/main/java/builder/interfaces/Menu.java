package builder.interfaces;

public class Menu {
    private final String starter;
    private final String mainCourse;
    private final String mainCourseSupplement;
    private final String dessert;
    private final String coffee;
    private final String drink;

    private final boolean isStarterVegan;
    private final boolean isMainCourseVegan;

    private final boolean isStarterGlutenFree;
    private final boolean isMainCourseGlutenFree;

    public Menu(String starter, String mainCourse, String mainCourseSupplement,
                String dessert, String coffee, String drink, boolean isStarterVegan,
                boolean isMainCourseVegan, boolean isStarterGlutenFree, boolean isMainCourseGlutenFree) {
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.mainCourseSupplement = mainCourseSupplement;
        this.dessert = dessert;
        this.coffee = coffee;
        this.drink = drink;
        this.isStarterVegan = isStarterVegan;
        this.isMainCourseVegan = isMainCourseVegan;
        this.isStarterGlutenFree = isStarterGlutenFree;
        this.isMainCourseGlutenFree = isMainCourseGlutenFree;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", mainCourseSupplement='" + mainCourseSupplement + '\'' +
                ", dessert='" + dessert + '\'' +
                ", coffee='" + coffee + '\'' +
                ", drink='" + drink + '\'' +
                ", isStarterVegan=" + isStarterVegan +
                ", isMainCourseVegan=" + isMainCourseVegan +
                ", isStarterGlutenFree=" + isStarterGlutenFree +
                ", isMainCourseGlutenFree=" + isMainCourseGlutenFree +
                '}';
    }
}
