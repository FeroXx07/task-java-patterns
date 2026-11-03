package strategy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ReportGeneratorTest {

    @Test
    void shouldThrowNoStrategyGenerate() {
        ReportGenerator reportGenerator = new ReportGenerator();
        Throwable throwableA = catchThrowable(() -> reportGenerator.generate(new ReportData(List.of())));

        assertThat(throwableA)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Strategy can not be null at the generation of report.");
    }
}