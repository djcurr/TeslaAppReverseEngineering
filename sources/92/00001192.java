package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormatInfo;

/* loaded from: classes.dex */
public class IntegerTokenConverter extends DynamicConverter<Object> implements MonoTypedConverter {
    public static final String CONVERTER_KEY = "i";

    public String convert(int i11) {
        String num = Integer.toString(i11);
        FormatInfo formattingInfo = getFormattingInfo();
        if (formattingInfo == null) {
            return num;
        }
        int min = formattingInfo.getMin();
        StringBuilder sb2 = new StringBuilder();
        for (int length = num.length(); length < min; length++) {
            sb2.append('0');
        }
        sb2.append(num);
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj) {
        if (obj != null) {
            if (obj instanceof Integer) {
                return convert(((Integer) obj).intValue());
            }
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
        throw new IllegalArgumentException("Null argument forbidden");
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj) {
        return obj instanceof Integer;
    }
}