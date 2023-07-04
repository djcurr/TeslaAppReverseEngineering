package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.nio.CharBuffer;

/* loaded from: classes.dex */
public class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b(Context context, int i11) {
        if (i11 != -1) {
            try {
                return context.getResources().getResourceEntryName(i11);
            } catch (Exception unused) {
                return CallerData.NA + i11;
            }
        }
        return "UNKNOWN";
    }

    public static String c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String d(p pVar, int i11) {
        return e(pVar, i11, -1);
    }

    public static String e(p pVar, int i11, int i12) {
        int length;
        if (i11 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = pVar.getContext().getResources().getResourceEntryName(i11);
        if (i12 != -1) {
            if (resourceEntryName.length() > i12) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() <= i12 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
                return resourceEntryName;
            }
            int length2 = (resourceEntryName.length() - i12) / length;
            return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, CoreConstants.DOT) + "_", "_");
        }
        return resourceEntryName;
    }

    public static void f(String str, String str2, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i11, stackTrace.length - 1);
        String str3 = " ";
        for (int i12 = 1; i12 <= min; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i12].getFileName() + ":" + stackTrace[i12].getLineNumber() + ") " + stackTrace[i12].getMethodName()) + str3);
        }
    }
}