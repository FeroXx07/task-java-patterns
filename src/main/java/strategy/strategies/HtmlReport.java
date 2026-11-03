package strategy.strategies;

import strategy.ReportData;

public class HtmlReport implements ReportStrategy {
    private static final String FILE_EXTENSION = ".html";

    @Override
    public String generate(ReportData reportData) {
        String lineSeparator = System.lineSeparator();
        StringBuilder builder = new StringBuilder();
        reportData.data().forEach(line ->
                serializeLine(line, builder, lineSeparator));
        return builder.toString();
    }

    private static void serializeLine(String line, StringBuilder builder, String lineSeparator) {
        builder.append("<p>").append(line).append("</p>").append(lineSeparator);
    }

    @Override
    public String getExtension() {
        return FILE_EXTENSION;
    }
}
