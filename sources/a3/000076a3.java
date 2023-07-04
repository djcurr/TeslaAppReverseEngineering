package io.grpc.internal;

import io.grpc.c0;
import io.grpc.f;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes5.dex */
final class n extends io.grpc.f {

    /* renamed from: a  reason: collision with root package name */
    private final o f31081a;

    /* renamed from: b  reason: collision with root package name */
    private final k2 f31082b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31083a;

        static {
            int[] iArr = new int[f.a.values().length];
            f31083a = iArr;
            try {
                iArr[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31083a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31083a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, k2 k2Var) {
        this.f31081a = (o) com.google.common.base.u.p(oVar, "tracer");
        this.f31082b = (k2) com.google.common.base.u.p(k2Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f31081a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(io.grpc.g0 g0Var, f.a aVar, String str) {
        Level f11 = f(aVar);
        if (o.f31096e.isLoggable(f11)) {
            o.d(g0Var, f11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(io.grpc.g0 g0Var, f.a aVar, String str, Object... objArr) {
        Level f11 = f(aVar);
        if (o.f31096e.isLoggable(f11)) {
            o.d(g0Var, f11, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int i11 = a.f31083a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return Level.FINE;
        }
        if (i11 != 3) {
            return Level.FINEST;
        }
        return Level.FINER;
    }

    private static c0.b g(f.a aVar) {
        int i11 = a.f31083a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return c0.b.CT_INFO;
            }
            return c0.b.CT_WARNING;
        }
        return c0.b.CT_ERROR;
    }

    private void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f31081a.f(new c0.a().b(str).c(g(aVar)).e(this.f31082b.a()).a());
    }

    @Override // io.grpc.f
    public void a(f.a aVar, String str) {
        d(this.f31081a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // io.grpc.f
    public void b(f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || o.f31096e.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}