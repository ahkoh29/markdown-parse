import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        ArrayList<String> result = new ArrayList<String>();
        result.add("https://something.com");
        result.add("some-page.html");

        
	    String contents = Files.readString(Path.of("./test-file.md"));
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals(result, links);
    }
}