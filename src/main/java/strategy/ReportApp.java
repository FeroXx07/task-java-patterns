package strategy;

import strategy.strategies.HtmlReport;
import strategy.strategies.JsonReport;
import strategy.strategies.ReportStrategy;
import strategy.strategies.XmlReport;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReportApp {

    public static void main(String[] args) throws IOException {
        Path destination = Path.of("output", "reports");

        ReportData reportData = new ReportData(List.of("Today is monday", "Worst day of the week", "Consider moving the report to Thursday"));
        ReportPersistence persistence = new ReportPersistence(destination);
        ReportGenerator generator = new ReportGenerator();

        List<ReportStrategy> strategyList = List.of(new HtmlReport(), new JsonReport(), new XmlReport());
        for (ReportStrategy currentStrategy : strategyList) {
            generator.setStrategy(currentStrategy);
            if (generator.getStrategy().isPresent())
            {
                persistence.saveToFile(generator.generate(reportData),
                        generator.getStrategy().get().getExtension());
            }
        }
    }
}
