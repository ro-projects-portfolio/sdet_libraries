package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class PhoneNumberProcessor implements Converter<String> {

    // Custom class which is modified data
    @Override
    public String convert(String value, String s1, int i) {
        return value.startsWith("+1") ? value : "+1" + value; // ternary
    }
}
