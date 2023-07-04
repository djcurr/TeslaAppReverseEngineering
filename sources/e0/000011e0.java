package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DatePatternToRegexUtil {
    final String datePattern;
    final int datePatternLength;
    final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<CharSequenceState> tokenize() {
        ArrayList arrayList = new ArrayList();
        CharSequenceState charSequenceState = null;
        for (int i11 = 0; i11 < this.datePatternLength; i11++) {
            char charAt = this.datePattern.charAt(i11);
            if (charSequenceState == null || charSequenceState.f9140c != charAt) {
                charSequenceState = new CharSequenceState(charAt);
                arrayList.add(charSequenceState);
            } else {
                charSequenceState.incrementOccurrences();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<CharSequenceState> list = tokenize();
        StringBuilder sb2 = new StringBuilder();
        for (CharSequenceState charSequenceState : list) {
            sb2.append(this.regexMapper.toRegex(charSequenceState));
        }
        return sb2.toString();
    }
}