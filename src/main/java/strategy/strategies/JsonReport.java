package strategy.strategies;

import strategy.ReportData;

public class JsonReport implements ReportStrategy {
    private static final String FILE_EXTENSION = ".json";

    @Override
    public String generate(ReportData reportData) {
        String lineSeparator = System.lineSeparator();
        String tabSpace = "\t";
        String doubleWhiteSpace = "  ";
        String quadrupleWhiteSpace = "    ";
        StringBuilder builder = new StringBuilder();

        builder.append("{").append(lineSeparator);
        builder.append(doubleWhiteSpace).append("\"Report Data\": [").append(lineSeparator);

        reportData.data().forEach(line -> {
            builder.append(quadrupleWhiteSpace).append("\"").append(line).append("\"");
            if (line != reportData.data().getLast()){
                builder.append(",");
            }
            builder.append(lineSeparator);
        });

        builder.append(doubleWhiteSpace).append("]").append(lineSeparator);
        builder.append("}");

        return builder.toString();
    }

    @Override
    public String getExtension() {
        return FILE_EXTENSION;
    }
}
