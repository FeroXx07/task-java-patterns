package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    MenuBuilder menuBuilder;

    @BeforeEach
    void setUp() {
        menuBuilder = new MenuBuilder();
        assertNotNull(menuBuilder);
    }

    @Test
    void shouldBuildMenu() {
        assertNotNull(menuBuilder.build());
    }

    @Test
    void shouldBuildEmptyMenu() {
        MenuBuilder menuBuilder = new MenuBuilder();
        Menu emptyMenu = menuBuilder.build();
        assertThat(emptyMenu);

        assertThat(emptyMenu.starter()).isBlank();
        assertThat(emptyMenu.mainCourse()).isBlank();
        assertThat(emptyMenu.mainCourseSupplement()).isBlank();
        assertThat(emptyMenu.dessert()).isBlank();
        assertThat(emptyMenu.coffee()).isBlank();
        assertThat(emptyMenu.drink()).isBlank();

        assertThat(emptyMenu.isStarterVegan()).isFalse();
        assertThat(emptyMenu.isStarterGlutenFree()).isFalse();

        assertThat(emptyMenu.isMainCourseVegan()).isFalse();
        assertThat(emptyMenu.isMainCourseGlutenFree()).isFalse();
    }

    @Test
    void shouldBuildMenuWithoutStarter() {
        MenuBuilder menuBuilder = new MenuBuilder();
        menuBuilder.withMainCourse("MAINCOURSE_PLACEHOLDER")
                .withDessert("DESSERT_PLACEHOLDER")
                .withDrink("DRINK_PLACEHOLDER")
                .build();
        Menu starterLessMenu = menuBuilder.build();
        assertThat(starterLessMenu.starter()).isEqualTo("");
        assertThat(starterLessMenu.mainCourse()).isEqualTo("MAINCOURSE_PLACEHOLDER");
        assertThat(starterLessMenu.dessert()).isEqualTo("DESSERT_PLACEHOLDER");
        assertThat(starterLessMenu.drink()).isEqualTo("DRINK_PLACEHOLDER");
    }

    @Test
    void shouldBuildMenuWithStarter() {
        MenuBuilder menuBuilder = new MenuBuilder();
        menuBuilder.withStarter("STARTER_PLACEHOLDER")
                .withMainCourse("MAINCOURSE_PLACEHOLDER")
                .withDessert("DESSERT_PLACEHOLDER")
                .withDrink("DRINK_PLACEHOLDER")
                .build();
        Menu starterMenu = menuBuilder.build();
        assertThat(starterMenu.starter()).isEqualTo("STARTER_PLACEHOLDER");
        assertThat(starterMenu.mainCourse()).isEqualTo("MAINCOURSE_PLACEHOLDER");
        assertThat(starterMenu.dessert()).isEqualTo("DESSERT_PLACEHOLDER");
        assertThat(starterMenu.drink()).isEqualTo("DRINK_PLACEHOLDER");
    }

    @Test
    void shouldNotHaveBothDessertAndCoffee() {
        MenuBuilder menuBuilder = new MenuBuilder();
        menuBuilder.withStarter("STARTER_PLACEHOLDER")
                .withMainCourse("MAINCOURSE_PLACEHOLDER")
                .withDessert("DESSERT_PLACEHOLDER")
                .withDrink("DRINK_PLACEHOLDER")
                .build();

        Menu fullMenu = menuBuilder.build();
        assertThat(fullMenu.starter()).isEqualTo("STARTER_PLACEHOLDER");
        assertThat(fullMenu.mainCourse()).isEqualTo("MAINCOURSE_PLACEHOLDER");
        assertThat(fullMenu.dessert()).isEqualTo("DESSERT_PLACEHOLDER");
        assertThat(fullMenu.drink()).isEqualTo("DRINK_PLACEHOLDER");

        assertThat(fullMenu.dessert()).isNotEqualTo(fullMenu.coffee());
    }
}