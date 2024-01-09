package zerocell;

import com.creditdatamw.zerocell.annotation.Column;

public class TestData {

    @Column(name = "TC#", index = 0)
    private String tcNumber;
    @Column(name = "Browser", index = 1)
    private String browser;
    @Column(name = "FullName", index = 2)
    private String fullName;
    @Column(name = "Age", index = 3, converterClass = StringToIntegerConverter.class)
    private int age;
    @Column(name = "PhoneNumber", index = 4, converterClass = PhoneNumberProcessor.class)
    private String phoneNumber;

    @Override
    public String toString() {
        return "TestData{" +
                "tcNumber='" + tcNumber + '\'' +
                ", browser='" + browser + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // getters to get access to private fields

    public String getTcNumber() {
        return tcNumber;
    }

    public String getBrowser() {
        return browser;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
