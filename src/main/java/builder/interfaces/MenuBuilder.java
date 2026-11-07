package builder.interfaces;

public class MenuBuilder implements ProgressiveMenuBuilder, StarterCourseStage, MainCourseStage, FinalMenuStage{

    @Override
    public Menu build() {
        return null;
    }

    @Override
    public MainCourseStage isMainCourseVegan() {
        return null;
    }

    @Override
    public MainCourseStage isMainCourseGlutenFree() {
        return null;
    }

    @Override
    public MainCourseStage withSupplement(String supplement) {
        return null;
    }

    @Override
    public PostMainCourseStage withCoffee(String coffee) {
        return null;
    }

    @Override
    public PostMainCourseStage withDessert(String dessert) {
        return null;
    }

    @Override
    public FinalMenuStage withDrink(String drinks) {
        return null;
    }

    @Override
    public StarterCourseStage withStarter(String starter) {
        return null;
    }

    @Override
    public StarterCourseStage isStarterVegan() {
        return null;
    }

    @Override
    public StarterCourseStage isStarterGlutenFree() {
        return null;
    }

    @Override
    public MainCourseStage withMainCourse(String mainCourse) {
        return null;
    }
}
