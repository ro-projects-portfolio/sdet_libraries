package zerocell;

import com.creditdatamw.zerocell.Reader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
       List<TestData> testData = Reader.of(TestData.class)
                .from(new File("src/test/java/zerocell/TestData.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();

       testData.forEach(System.out::println);
    }

}
