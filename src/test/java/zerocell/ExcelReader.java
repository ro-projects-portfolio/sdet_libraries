package zerocell;

import com.creditdatamw.zerocell.Reader;

import java.io.File;
import java.util.List;

public final class ExcelReader {

    private static List<TestData> testData= null;

    private ExcelReader(){}

    static {
        testData = Reader.of(TestData.class)
                .from(new File("src/test/java/zerocell/TestData.xlsx")) // define path
                .sheet("Sheet1") // specify work sheet
                .skipHeaderRow(true)  // ignore Header row
                .list();
    }

    public static List<TestData> getTestData () {
        return testData;
    }

}
