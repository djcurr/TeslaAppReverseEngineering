package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class StatusPrinter {

    /* renamed from: ps */
    private static PrintStream f9141ps = System.out;
    static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    private static void appendThrowable(StringBuilder sb2, Throwable th2) {
        String[] convert;
        for (String str : ThrowableToStringArray.convert(th2)) {
            if (!str.startsWith(CoreConstants.CAUSED_BY)) {
                sb2.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb2.append(str);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void buildStr(StringBuilder sb2, String str, Status status) {
        StringBuilder sb3;
        String str2;
        if (status.hasChildren()) {
            sb3 = new StringBuilder();
            sb3.append(str);
            str2 = "+ ";
        } else {
            sb3 = new StringBuilder();
            sb3.append(str);
            str2 = "|-";
        }
        sb3.append(str2);
        String sb4 = sb3.toString();
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb2.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb2.append(" ");
        }
        sb2.append(sb4);
        sb2.append(status);
        sb2.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb2, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it2 = status.iterator();
            while (it2.hasNext()) {
                buildStr(sb2, str + "  ", it2.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb2, List<Status> list) {
        if (list == null) {
            return;
        }
        for (Status status : list) {
            buildStr(sb2, "", status);
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void print(Context context, long j11) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j11);
            return;
        }
        PrintStream printStream = f9141ps;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j11) {
        StringBuilder sb2 = new StringBuilder();
        buildStrFromStatusList(sb2, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j11));
        f9141ps.println(sb2.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb2 = new StringBuilder();
        buildStrFromStatusList(sb2, list);
        f9141ps.println(sb2.toString());
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
                return;
            }
            return;
        }
        PrintStream printStream = f9141ps;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j11) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j11) >= 1) {
                print(statusManager, j11);
                return;
            }
            return;
        }
        PrintStream printStream = f9141ps;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void setPrintStream(PrintStream printStream) {
        f9141ps = printStream;
    }
}