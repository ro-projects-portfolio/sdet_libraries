package zerocell;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class ReadWithDPTest {

    @Test(dataProvider = "excelData")
    public void TC1(TestData data) {

        System.out.println(data.getTcNumber());
        System.out.println(data.getBrowser());
        System.out.println(data.getFullName());
        System.out.println(data.getAge());
        System.out.println(data.getPhoneNumber());

    }

    @Test(dataProvider = "excelData")
    public void TC2(TestData data) {

        System.out.println(data.getTcNumber());
        System.out.println(data.getBrowser());
        System.out.println(data.getFullName());
        System.out.println(data.getAge());
        System.out.println(data.getPhoneNumber());

    }

    @DataProvider
    public Object[][] excelData (Method method) {

        List<TestData> collect = ExcelReader.getTestData()
                .stream()
                .filter(e -> e.getTcNumber().equalsIgnoreCase(method.getName())) // filter for specific test
                .collect(Collectors.toList());;

        Object[][] data = new Object[collect.size()][1];
        for (int i = 0; i < collect.size(); i++) {
            data[i][0] = collect.get(i);
        }

        return data;
    }
}
