package builder;

public record Menu(String starter, String mainCourse, String mainCourseSupplement, String dessert, String coffee,
                   String drink, boolean isStarterVegan, boolean isMainCourseVegan, boolean isStarterGlutenFree,
                   boolean isMainCourseGlutenFree) {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Menu:\n");

        if (!starter.isBlank()) {
            sb.append("\t- Starter: ").append(starter);

            if (isStarterVegan) {
                sb.append(" (Vegan)");
            }

            if (isStarterGlutenFree) {
                sb.append(" (Gluten Free)");
            }

            sb.append("\n");
        }

        if (!mainCourse.isBlank()) {
            sb.append("\t- Starter: ").append(mainCourse);

            if (isMainCourseVegan) {
                sb.append(" (Vegan)");
            }

            if (isMainCourseGlutenFree) {
                sb.append(" (Gluten Free)");
            }

            if (!mainCourseSupplement.isBlank()) {
                sb.append(", Supplement: ").append(mainCourseSupplement);
            }
            sb.append("\n");
        }

        if (!dessert.isBlank()) {
            sb.append("\t- Dessert: ").append(dessert);
            sb.append("\n");
        } else if (!coffee.isBlank()) {
            sb.append("\t- Dessert: ").append(coffee);
            sb.append("\n");
        }

        if (!drink.isBlank()) {
            sb.append("\t- Drink: ").append(drink);
            sb.append("\n");
        }

        return sb.toString();
    }
}
