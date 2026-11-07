package builder.interfaces;

interface ProgressiveMenuBuilder {
    StarterCourseStage withStarter(String starter);
}
interface StarterCourseStage {
    StarterCourseStage isStarterVegan();
    StarterCourseStage isStarterGlutenFree();
    MainCourseStage withMainCourse(String mainCourse);
}

interface MainCourseStage {
    MainCourseStage isMainCourseVegan();
    MainCourseStage isMainCourseGlutenFree();
    MainCourseStage withSupplement(String supplement);
    PostMainCourseStage withCoffee(String coffee);
    PostMainCourseStage withDessert(String dessert);
    FinalMenuStage withDrink(String drinks);
}

interface PostMainCourseStage {
    FinalMenuStage withDrink(String drinks);
}

interface FinalMenuStage {
    Menu build();
}

