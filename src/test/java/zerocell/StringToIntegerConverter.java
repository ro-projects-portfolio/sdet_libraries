package zerocell;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToIntegerConverter implements Converter<Integer> {

    // since data from Excel mostly have String format create a custom classes to convert data in format what you need
    @Override
    public Integer convert(String value, String s1, int i) {
        return Integer.parseInt(value);
    }
}
