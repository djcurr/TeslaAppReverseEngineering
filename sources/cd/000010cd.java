package ch.qos.logback.core.helpers;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ThrowableToStringArray {
    public static String[] convert(Throwable th2) {
        LinkedList linkedList = new LinkedList();
        extract(linkedList, th2, null);
        return (String[]) linkedList.toArray(new String[0]);
    }

    private static void extract(List<String> list, Throwable th2, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int findNumberOfCommonFrames = findNumberOfCommonFrames(stackTrace, stackTraceElementArr);
        list.add(formatFirstLine(th2, stackTraceElementArr));
        for (int i11 = 0; i11 < stackTrace.length - findNumberOfCommonFrames; i11++) {
            list.add("\tat " + stackTrace[i11].toString());
        }
        if (findNumberOfCommonFrames != 0) {
            list.add("\t... " + findNumberOfCommonFrames + " common frames omitted");
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            extract(list, cause, stackTrace);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i11 = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i11++;
            length--;
        }
        return i11;
    }

    private static String formatFirstLine(Throwable th2, StackTraceElement[] stackTraceElementArr) {
        String str = (stackTraceElementArr != null ? CoreConstants.CAUSED_BY : "") + th2.getClass().getName();
        if (th2.getMessage() != null) {
            return str + ": " + th2.getMessage();
        }
        return str;
    }
}