package strategy.strategies;

import strategy.ReportData;

public class JsonReport implements ReportStrategy {
    private static final String FILE_EXTENSION = ".json";

    @Override
    public String generate(ReportData reportData) {
        String lineSeparator = System.lineSeparator();
        StringBuilder builder = new StringBuilder();

        builder.append("{").append(lineSeparator);
        builder.append("\"Report Data\": [");

        reportData.data().forEach(line -> {
            builder.append("\"").append(line).append("\"");
            if (line != reportData.data().getLast()){
                builder.append(",");
            }
        });

        builder.append("]").append(lineSeparator);
        builder.append("}").append(lineSeparator);

        return builder.toString();
    }

    @Override
    public String getExtension() {
        return FILE_EXTENSION;
    }
}
