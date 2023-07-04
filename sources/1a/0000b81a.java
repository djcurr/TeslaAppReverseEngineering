package us;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import m00.l;
import uu.h;
import wz.r0;

/* loaded from: classes6.dex */
public final class c {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53660a;

        static {
            int[] iArr = new int[com.tesla.logging.d.values().length];
            iArr[com.tesla.logging.d.VERBOSE.ordinal()] = 1;
            iArr[com.tesla.logging.d.INFO.ordinal()] = 2;
            iArr[com.tesla.logging.d.DEBUG.ordinal()] = 3;
            iArr[com.tesla.logging.d.ERROR.ordinal()] = 4;
            f53660a = iArr;
        }
    }

    public static final String a(ot.c cVar) {
        int i11;
        s.g(cVar, "<this>");
        String d11 = gu.c.d(cVar);
        i11 = l.i(gu.c.d(cVar).length(), 5);
        Objects.requireNonNull(d11, "null cannot be cast to non-null type java.lang.String");
        String substring = d11.substring(0, i11);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String b11 = uu.c.b(cVar);
        return "CMD[" + substring + "] [" + b11 + "]";
    }

    public static final void b(ot.c cVar, String value, g logger, com.tesla.logging.d logLevel) {
        s.g(cVar, "<this>");
        s.g(value, "value");
        s.g(logger, "logger");
        s.g(logLevel, "logLevel");
        String a11 = a(cVar);
        e(logger, logLevel, a11 + " " + value);
    }

    public static final void c(h hVar, String value, g logger, com.tesla.logging.d logLevel) {
        String D;
        String j02;
        String substring;
        String str;
        s.g(value, "value");
        s.g(logger, "logger");
        s.g(logLevel, "logLevel");
        if (hVar == null) {
            str = "CMD[null ] " + value;
        } else {
            String a11 = a(hVar.A());
            String C = hVar.C();
            String name = Thread.currentThread().getName();
            s.f(name, "name");
            D = v.D(name, "RxCachedThread", "", false, 4, null);
            j02 = w.j0(D, 10, ' ');
            s.f(j02.substring(j02.length() - 10, j02.length()), "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str = a11 + " [" + C + "] [" + ((Object) substring) + "] " + value;
        }
        e(logger, logLevel, str);
    }

    public static /* synthetic */ void d(ot.c cVar, String str, g gVar, com.tesla.logging.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = com.tesla.logging.d.INFO;
        }
        b(cVar, str, gVar, dVar);
    }

    public static final void e(g logger, com.tesla.logging.d logLevel, String msg) {
        Map f11;
        s.g(logger, "logger");
        s.g(logLevel, "logLevel");
        s.g(msg, "msg");
        int i11 = a.f53660a[logLevel.ordinal()];
        if (i11 == 1) {
            logger.l(msg);
        } else if (i11 == 2) {
            logger.i(msg);
        } else if (i11 == 3) {
            logger.a(msg);
        } else if (i11 == 4) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = logger.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, msg));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(msg));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(msg, new Object[0]);
        }
    }
}