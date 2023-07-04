package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class ThrowableProxyUtil {
    private static final int BUILDER_CAPACITY = 2048;
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb2 = new StringBuilder(2048);
        recursiveAppend(sb2, null, 1, iThrowableProxy);
        return sb2.toString();
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th2, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        throwableProxy.commonFrames = throwableProxy2 != null ? findNumberOfCommonFrames(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.stackTraceElementProxyArray = steArrayToStepArray(stackTrace);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i11 = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
                i11++;
                length--;
            }
        }
        return i11;
    }

    public static void indent(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append('\t');
        }
    }

    private static void recursiveAppend(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb2, str, i11, iThrowableProxy);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb2, i11, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb2, CoreConstants.SUPPRESSED, i11 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb2, CoreConstants.CAUSED_BY, i11, iThrowableProxy.getCause());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i11 = 0; i11 < length; i11++) {
            stackTraceElementProxyArr[i11] = new StackTraceElementProxy(stackTraceElementArr[i11]);
        }
        return stackTraceElementProxyArr;
    }

    private static void subjoinExceptionMessage(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        sb2.append(iThrowableProxy.getClassName());
        sb2.append(": ");
        sb2.append(iThrowableProxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb2.append(CoreConstants.CAUSED_BY);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    private static void subjoinFirstLine(StringBuilder sb2, String str, int i11, IThrowableProxy iThrowableProxy) {
        indent(sb2, i11 - 1);
        if (str != null) {
            sb2.append(str);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb2.append(CoreConstants.WRAPPED_BY);
        }
        subjoinExceptionMessage(sb2, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb2.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb2.append(classPackagingData.getCodeLocation());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(classPackagingData.getVersion());
        sb2.append(']');
    }

    public static void subjoinSTEP(StringBuilder sb2, StackTraceElementProxy stackTraceElementProxy) {
        sb2.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb2, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb2, int i11, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i12 = 0; i12 < stackTraceElementProxyArray.length - commonFrames; i12++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i12];
            indent(sb2, i11);
            subjoinSTEP(sb2, stackTraceElementProxy);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb2, i11);
            sb2.append("... ");
            sb2.append(commonFrames);
            sb2.append(" common frames omitted");
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void subjoinSTEPArray(StringBuilder sb2, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb2, 1, iThrowableProxy);
    }
}