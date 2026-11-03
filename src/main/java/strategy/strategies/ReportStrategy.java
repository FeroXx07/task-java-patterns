package strategy.strategies;

import strategy.ReportData;

public interface ReportStrategy {
    String generate(ReportData data);
    String getExtension();
}
