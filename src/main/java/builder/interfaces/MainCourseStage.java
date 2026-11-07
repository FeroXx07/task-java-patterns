package builder.interfaces;

public interface MainCourseStage {
    MainCourseStage isMainCourseVegan();
    MainCourseStage isMainCourseGlutenFree();
    MainCourseStage withSupplement(String supplement);
    PostMainCourseStage withCoffee(String coffee);
    PostMainCourseStage withDessert(String dessert);
    FinalMenuStage withDrink(String drinks);
}
