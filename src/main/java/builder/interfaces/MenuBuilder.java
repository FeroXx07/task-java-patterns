package builder.interfaces;

public class MenuBuilder implements ProgressiveMenuBuilder, StarterCourseStage, MainCourseStage, PostMainCourseStage, FinalMenuStage{
    private String starter;
    private String mainCourse;
    private String mainCourseSupplement;
    private String dessert;
    private String coffee;
    private String drink;
    private boolean isStarterVegan;
    private boolean isMainCourseVegan;
    private boolean isStarterGlutenFree;
    private boolean isMainCourseGlutenFree;

    public MenuBuilder() {
        starter = "";
        mainCourse = "";
        mainCourseSupplement = "";
        dessert = "";
        coffee = "";
        drink = "";
        isStarterVegan = false;
        isMainCourseVegan = false;
        isStarterGlutenFree = false;
        isMainCourseGlutenFree = false;
    }

    @Override
    public Menu build() {
        return new Menu(starter, mainCourse, mainCourseSupplement, dessert, coffee, drink, isStarterVegan, isMainCourseVegan, isStarterGlutenFree, isMainCourseGlutenFree);
    }

    @Override
    public MainCourseStage isMainCourseVegan() {
        isMainCourseVegan = true;
        return this;
    }

    @Override
    public MainCourseStage isMainCourseGlutenFree() {
        isMainCourseGlutenFree = true;
        return this;
    }

    @Override
    public MainCourseStage withSupplement(String supplement) {
        this.mainCourseSupplement = supplement;
        return this;
    }

    @Override
    public PostMainCourseStage withCoffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    @Override
    public PostMainCourseStage withDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    @Override
    public FinalMenuStage withDrink(String drinks) {
        this.drink = drinks;
        return this;
    }

    @Override
    public StarterCourseStage withStarter(String starter) {
        this.starter = starter;
        return this;
    }

    @Override
    public StarterCourseStage isStarterVegan() {
        this.isStarterVegan = true;
        return this;
    }

    @Override
    public StarterCourseStage isStarterGlutenFree() {
        this.isStarterGlutenFree = true;
        return this;
    }

    @Override
    public MainCourseStage withMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }
}
