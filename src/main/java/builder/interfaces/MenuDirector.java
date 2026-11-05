package builder.interfaces;

public class MenuDirector {

    public void buildExecutiveMenu(MenuBuilder menuBuilder){
        menuBuilder
            .withStarter("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
            .withMainCourse("Filet de Vedella")
                .withSupplement("Guarnició extra")
            .withDessert("Mousse de xocolata")
            .withDrink("Vi Negre")
            .build();
    }

    public void buildKidsMenu(MenuBuilder menuBuilder){
        menuBuilder
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();
    }

    public void buildHalfMenu(MenuBuilder menuBuilder){
        menuBuilder
                .withMainCourse("Risotto de bolets")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();
    }
}
