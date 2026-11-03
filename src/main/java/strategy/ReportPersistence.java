package strategy;

import strategy.strategies.ReportStrategy;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReportPersistence {
    private final Path saveDirectoryPath;

    public ReportPersistence(Path saveDirectoryPath) {
        this.saveDirectoryPath = saveDirectoryPath;
    }

    public void saveToFile(String serializedContent, String extension){
        String fileName = "report"+extension;
        Path destination = Path.of(saveDirectoryPath.toString(), fileName);
        try {
            Files.createDirectories(destination.toAbsolutePath().getParent());

            if (Files.notExists(destination)){
                Files.createFile(destination);
            }
            Files.writeString(destination, serializedContent);
        } catch (IOException exception) {
            throw new UncheckedIOException(
                    "Could not save report" + extension,
                    exception
            );
        }
    }

}
