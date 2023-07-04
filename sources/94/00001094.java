package ch.qos.logback.classic.spi;

/* loaded from: classes.dex */
public class STEUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i11 = 0;
        if (stackTraceElementProxyArr == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
            i11++;
            length--;
        }
        return i11;
    }
}