package builder.director;

import builder.Menu;
import builder.MenuBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MenuDirectorTest {
    MenuBuilder menuBuilder = null;
    MenuDirector menuDirector = null;

    @BeforeEach
    void setUp() {
        menuBuilder = new MenuBuilder();
        menuDirector = new MenuDirector();
    }

    @Test
    void buildExecutiveMenu() {
        Menu menuResult = menuDirector.buildExecutiveMenu(menuBuilder);
        assertNotNull(menuResult);
        assertThat(menuResult.starter()).isNotBlank();
        assertThat(menuResult.mainCourse()).isNotBlank();
        assertThat(menuResult.dessert()).isNotBlank();
        assertThat(menuResult.drink()).isNotBlank();

        assertThat(menuResult.isStarterVegan()).isTrue();
        assertThat(menuResult.isStarterGlutenFree()).isTrue();

        assertThat(menuResult.isMainCourseVegan()).isTrue();
        assertThat(menuResult.mainCourseSupplement()).isNotBlank();

    }

    @Test
    void buildKidsMenu() {
        Menu menuResult = menuDirector.buildKidsMenu(menuBuilder);
        assertNotNull(menuResult);
        assertThat(menuResult.starter()).isBlank();
        assertThat(menuResult.mainCourse()).isNotBlank();
        assertThat(menuResult.dessert()).isNotBlank();
        assertThat(menuResult.drink()).isNotBlank();

        assertThat(menuResult.isStarterVegan()).isFalse();
        assertThat(menuResult.isStarterGlutenFree()).isFalse();

        assertThat(menuResult.isMainCourseVegan()).isFalse();
        assertThat(menuResult.mainCourseSupplement()).isBlank();
    }

    @Test
    void buildHalfMenu() {
        Menu menuResult = menuDirector.buildHalfMenu(menuBuilder);
        assertNotNull(menuResult);
        assertThat(menuResult.starter()).isBlank();
        assertThat(menuResult.mainCourse()).isNotBlank();
        assertThat(menuResult.dessert()).isBlank();
        assertThat(menuResult.drink()).isNotBlank();

        assertThat(menuResult.isStarterVegan()).isFalse();
        assertThat(menuResult.isStarterGlutenFree()).isFalse();

        assertThat(menuResult.isMainCourseVegan()).isTrue();
        assertThat(menuResult.mainCourseSupplement()).isBlank();
    }
}