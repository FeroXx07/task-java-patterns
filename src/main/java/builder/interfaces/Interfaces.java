package builder.interfaces;

interface ProgressiveMenuBuilder {
    StarterCourseBuilder withStarter(String starter);
}
interface StarterCourseBuilder {
    StarterCourseBuilder isVegan();
    StarterCourseBuilder isGlutenFree();
    MainCourseBuilder withMainCourse(String mainCourse);
}

interface MainCourseBuilder {
    MainCourseBuilder isVegan();
    MainCourseBuilder isGlutenFree();
    MainCourseBuilder withSupplement(String supplement);
    DessertBuilder withDessert(String dessert);
    CoffeeBuilder withCoffee(String coffee);
}

interface DessertBuilder {
    DrinksBuilder withDrink(String drink);
}

interface CoffeeBuilder {
    DrinksBuilder withDrink(String drink);
}

interface DrinksBuilder {
    Menu build();
}
