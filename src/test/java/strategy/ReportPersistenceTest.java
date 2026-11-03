package strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class ReportPersistenceTest {

    @Test
    void verifyGeneratesFile(@TempDir Path tempDirectory) {

        ReportPersistence reportPersistence = new ReportPersistence(tempDirectory);
        reportPersistence.saveToFile("SAMPLE", ".anything");

        Path tempFile = tempDirectory.resolve( "report.anything");
        assertThat(Files.exists(tempFile)).isTrue();
    }
}