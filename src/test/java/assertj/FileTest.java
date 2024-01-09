package assertj;

import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.*;

// AssertJ provides capabilities for assertions related to files
// allowing you to verify conditions about the content, existence, and properties of files.
public class FileTest {
    // Define paths for files
    private final Path file1 = Paths.get("src/test/resources/file1.txt");
    private final Path file2 = Paths.get("src/test/resources/file2.txt");
    private final Path file3 = Paths.get("src/test/resources/file3.txt");

    @Test
    public void fileContentTest() {
        assertThat(file1).hasSameContentAs(file3);
    }

    @Test
    public void fileTest() {
        assertThat(file2)
                .hasFileName("file2.txt")
                .isRegularFile()
                .isNotNull()
                .existsNoFollowLinks()
                .hasContent("Content from file2");
    }
}
