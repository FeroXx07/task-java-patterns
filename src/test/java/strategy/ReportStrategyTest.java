package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.strategies.HtmlReport;
import strategy.strategies.JsonReport;
import strategy.strategies.ReportStrategy;
import strategy.strategies.XmlReport;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReportStrategyTest {

    ReportData data;
    String lineSep;


    @BeforeEach
    void setUp() {
        data = new ReportData(List.of("Apples: 2", "Today is monday!", "Let's meet friday"));
        lineSep = System.lineSeparator();
    }

    @Test
    void shouldHtmlReportGiveExpected() {
        ReportStrategy strategy = new HtmlReport();
        assertThat(strategy.generate(data)).isEqualToNormalizingNewlines("""
                <p>Apples: 2</p>
                <p>Today is monday!</p>
                <p>Let's meet friday</p>
                """);
    }

    @Test
    void shouldJsonReportGiveExpected() {
        ReportStrategy strategy = new JsonReport();
        assertThat(strategy.generate(data)).isEqualToNormalizingNewlines("""
                {
                  "Report Data": [
                    "Apples: 2",
                    "Today is monday!",
                    "Let's meet friday"
                  ]
                }""");
    }

    @Test
    void shouldXMLReportGiveExpected() {
        ReportStrategy strategy = new XmlReport();
        assertThat(strategy.generate(data)).isEqualToNormalizingNewlines("""
                <?xml version="1.0" encoding="utf-8"?>
                <resources>
                \t<string-array name="data">
                \t\t<item>Apples: 2</item>
                \t\t<item>Today is monday!</item>
                \t\t<item>Let's meet friday</item>
                \t</string-array>
                </resources>""");
    }
}