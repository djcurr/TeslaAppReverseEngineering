package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* loaded from: classes.dex */
public class CallerData {
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];
    public static final int LINE_NA = -1;
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    public static final String NA = "?";
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";

    public static StackTraceElement[] extract(Throwable th2, String str, int i11, List<String> list) {
        if (th2 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int i12 = -1;
        for (int i13 = 0; i13 < stackTrace.length; i13++) {
            if (isInFrameworkSpace(stackTrace[i13].getClassName(), str, list)) {
                i12 = i13 + 1;
            } else if (i12 != -1) {
                break;
            }
        }
        if (i12 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i12;
        if (i11 >= length) {
            i11 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            stackTraceElementArr[i14] = stackTrace[i12 + i14];
        }
        return stackTraceElementArr;
    }

    static boolean isInFrameworkSpace(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals(LOG4J_CATEGORY) || str.startsWith(SLF4J_BOUNDARY) || isInFrameworkSpaceList(str, list);
    }

    private static boolean isInFrameworkSpaceList(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement(NA, NA, NA, -1);
    }
}