package at;

import java.io.EOFException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import m00.l;
import okhttp3.Headers;
import okhttp3.Interceptor;
import wz.w;

/* loaded from: classes6.dex */
public final class i implements Interceptor {

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f6728b;

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f6729a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<String> l11;
        new a(null);
        l11 = w.l("/calendar_history", "/telemetry_history", "/upcoming_calendar_entries", "/token", "/jwt/hermes", "/tokens/v1", "/reports");
        f6728b = l11;
    }

    public i(com.tesla.logging.g logger) {
        s.g(logger, "logger");
        this.f6729a = logger;
    }

    private final boolean a(Headers headers) {
        boolean u11;
        boolean u12;
        String str = headers.get("Content-Encoding");
        if (str == null) {
            return false;
        }
        u11 = v.u(str, "identity", true);
        if (u11) {
            return false;
        }
        u12 = v.u(str, "gzip", true);
        return !u12;
    }

    private final boolean b(okio.f fVar) {
        long j11;
        try {
            okio.f fVar2 = new okio.f();
            j11 = l.j(fVar.P0(), 64L);
            fVar.m(fVar2, 0L, j11);
            int i11 = 0;
            do {
                i11++;
                if (fVar2.N0()) {
                    break;
                }
                int I0 = fVar2.I0();
                if (Character.isISOControl(I0) && !Character.isWhitespace(I0)) {
                    return false;
                }
            } while (i11 < 16);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0315  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r32) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: at.i.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}