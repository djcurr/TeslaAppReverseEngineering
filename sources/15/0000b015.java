package r3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

@Deprecated
/* loaded from: classes.dex */
public final class m {
    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 18 || i11 >= 29) {
            return;
        }
        try {
            Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e11) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e11);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}