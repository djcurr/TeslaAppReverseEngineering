package ch.qos.logback.core.util;

import java.text.DateFormatSymbols;

/* loaded from: classes.dex */
class CharSequenceToRegexMapper {
    DateFormatSymbols symbols = DateFormatSymbols.getInstance();

    static int[] findMinMaxLengthsInSymbols(String[] strArr) {
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                i11 = Math.min(i11, length);
                i12 = Math.max(i12, length);
            }
        }
        return new int[]{i11, i12};
    }

    private String getRegexForAmPms() {
        return symbolArrayToRegex(this.symbols.getAmPmStrings());
    }

    private String getRegexForLongDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getWeekdays());
    }

    private String getRegexForLongMonths() {
        return symbolArrayToRegex(this.symbols.getMonths());
    }

    private String getRegexForShortDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getShortWeekdays());
    }

    private String number(int i11) {
        return "\\d{" + i11 + "}";
    }

    private String symbolArrayToRegex(String[] strArr) {
        int[] findMinMaxLengthsInSymbols = findMinMaxLengthsInSymbols(strArr);
        return ".{" + findMinMaxLengthsInSymbols[0] + "," + findMinMaxLengthsInSymbols[1] + "}";
    }

    String getRegexForShortMonths() {
        return symbolArrayToRegex(this.symbols.getShortMonths());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String toRegex(CharSequenceState charSequenceState) {
        int i11 = charSequenceState.occurrences;
        char c11 = charSequenceState.f9140c;
        if (c11 != 'y') {
            if (c11 != 'z') {
                switch (c11) {
                    case '\'':
                        if (i11 == 1) {
                            return "";
                        }
                        throw new IllegalStateException("Too many single quotes");
                    case '.':
                        return "\\.";
                    case 'K':
                    case 'S':
                    case 'W':
                    case 'd':
                    case 'h':
                    case 'k':
                    case 'm':
                    case 's':
                    case 'w':
                        break;
                    case 'M':
                        return i11 <= 2 ? number(i11) : i11 == 3 ? getRegexForShortMonths() : getRegexForLongMonths();
                    case 'Z':
                        return "(\\+|-)\\d{4}";
                    case '\\':
                        throw new IllegalStateException("Forward slashes are not allowed");
                    case 'a':
                        return getRegexForAmPms();
                    default:
                        switch (c11) {
                            case 'D':
                            case 'F':
                            case 'H':
                                break;
                            case 'E':
                                return i11 >= 4 ? getRegexForLongDaysOfTheWeek() : getRegexForShortDaysOfTheWeek();
                            case 'G':
                                return ".*";
                            default:
                                if (i11 == 1) {
                                    return "" + c11;
                                }
                                return c11 + "{" + i11 + "}";
                        }
                }
            } else {
                return ".*";
            }
        }
        return number(i11);
    }
}