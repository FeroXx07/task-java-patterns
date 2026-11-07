package builder.director;

import builder.Menu;
import builder.MenuBuilder;

public class MenuDirector {

    public Menu buildExecutiveMenu(MenuBuilder menuBuilder) {
        return menuBuilder
                .withStarter("Amanida Mediterrània")
                .isStarterVegan()
                .isStarterGlutenFree()
                .withMainCourse("Filet de Vedella")
                .isMainCourseVegan()
                .withSupplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();
    }

    public Menu buildKidsMenu(MenuBuilder menuBuilder) {
        return menuBuilder
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();
    }

    public Menu buildHalfMenu(MenuBuilder menuBuilder) {
        return menuBuilder
                .withMainCourse("Risotto de bolets")
                .isMainCourseVegan()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();
    }
}
