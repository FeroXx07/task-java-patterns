package strategy;

import strategy.strategies.ReportStrategy;

import java.util.Optional;

public class ReportGenerator {
    private ReportStrategy strategy;

    public void setStrategy(ReportStrategy newStrategy) {
        strategy = newStrategy;
    }

    public Optional<ReportStrategy> getStrategy(){
        return Optional.ofNullable(strategy);
    }

    public String generate(ReportData data){
        validateStrategyNotNull(strategy);
        return strategy.generate(data);
    }

    private void validateStrategyNotNull(ReportStrategy strategy){
        if (strategy == null){
            throw new RuntimeException("Strategy can not be null at the generation of report.");
        }
    }
}
