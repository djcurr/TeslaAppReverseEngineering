package mu;

import com.tesla.logging.g;
import io.sentry.d0;
import io.sentry.f3;
import java.util.Arrays;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import zu.q;

/* loaded from: classes6.dex */
public final class a implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39459a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f39460b = g.f21878b.a("Sentry");

    /* renamed from: mu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C0762a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39461a;

        static {
            int[] iArr = new int[f3.values().length];
            iArr[f3.DEBUG.ordinal()] = 1;
            iArr[f3.INFO.ordinal()] = 2;
            iArr[f3.WARNING.ordinal()] = 3;
            iArr[f3.ERROR.ordinal()] = 4;
            iArr[f3.FATAL.ordinal()] = 5;
            f39461a = iArr;
        }
    }

    private a() {
    }

    @Override // io.sentry.d0
    public void a(f3 level, Throwable th2, String message, Object... args) {
        s.g(level, "level");
        s.g(message, "message");
        s.g(args, "args");
        q0 q0Var = q0.f34921a;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format = String.format(message, Arrays.copyOf(copyOf, copyOf.length));
        s.f(format, "java.lang.String.format(format, *args)");
        b(level, format, th2);
    }

    @Override // io.sentry.d0
    public void b(f3 level, String message, Throwable th2) {
        s.g(level, "level");
        s.g(message, "message");
        int i11 = C0762a.f39461a[level.ordinal()];
        if (i11 == 1) {
            if (q.b()) {
                f39460b.b(message, false);
            }
        } else if (i11 == 2) {
            g.k(f39460b, message, false, false, 4, null);
        } else if (i11 == 3) {
            f39460b.m(message);
        } else if (i11 == 4) {
            f39460b.d(message, th2);
        } else if (i11 != 5) {
        } else {
            f39460b.o(message);
        }
    }

    @Override // io.sentry.d0
    public void c(f3 level, String message, Object... args) {
        s.g(level, "level");
        s.g(message, "message");
        s.g(args, "args");
        q0 q0Var = q0.f34921a;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format = String.format(message, Arrays.copyOf(copyOf, copyOf.length));
        s.f(format, "java.lang.String.format(format, *args)");
        b(level, format, null);
    }

    @Override // io.sentry.d0
    public boolean d(f3 f3Var) {
        if ((f3Var == null ? -1 : C0762a.f39461a[f3Var.ordinal()]) == 1) {
            return q.b();
        }
        return q.c();
    }
}