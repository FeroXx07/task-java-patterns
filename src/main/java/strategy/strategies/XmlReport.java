package strategy.strategies;

import strategy.ReportData;

public class XmlReport implements ReportStrategy {
    private static final String FILE_EXTENSION = ".xml";

    @Override
    public String generate(ReportData reportData) {
        String lineSeparator = System.lineSeparator();
        String tabSpace = "\t";
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>").append(lineSeparator);
        builder.append("<resources>").append(lineSeparator);
        builder.append(tabSpace).append("<string-array name=\"data\">").append(lineSeparator);

        reportData.data().forEach(line -> {
            builder.append(tabSpace).append(tabSpace).append("<item>").append(line).append("</item>").append(lineSeparator);
        });

        builder.append(tabSpace).append("</string-array>").append(lineSeparator);
        builder.append("</resources>").append(lineSeparator);

        return builder.toString();
    }

    @Override
    public String getExtension() {
        return FILE_EXTENSION;
    }
}
