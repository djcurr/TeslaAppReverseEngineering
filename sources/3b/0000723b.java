package h20;

import g20.p;
import j20.n;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import p10.m;
import w00.x;

/* loaded from: classes5.dex */
public final class c extends p implements t00.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f28774n = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(u10.c fqName, n storageManager, x module, InputStream inputStream, boolean z11) {
            q10.a aVar;
            s.g(fqName, "fqName");
            s.g(storageManager, "storageManager");
            s.g(module, "module");
            s.g(inputStream, "inputStream");
            try {
                q10.a a11 = q10.a.f47328f.a(inputStream);
                if (a11 == null) {
                    s.x("version");
                    aVar = null;
                } else {
                    aVar = a11;
                }
                if (aVar.h()) {
                    m proto = m.R(inputStream, h20.a.f28772m.e());
                    e00.b.a(inputStream, null);
                    s.f(proto, "proto");
                    return new c(fqName, storageManager, module, proto, a11, z11, null);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + q10.a.f47329g + ", actual " + a11 + ". Please update Kotlin");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    e00.b.a(inputStream, th2);
                    throw th3;
                }
            }
        }
    }

    private c(u10.c cVar, n nVar, x xVar, m mVar, q10.a aVar, boolean z11) {
        super(cVar, nVar, xVar, mVar, aVar, null);
    }

    public /* synthetic */ c(u10.c cVar, n nVar, x xVar, m mVar, q10.a aVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, xVar, mVar, aVar, z11);
    }

    @Override // y00.z, y00.j
    public String toString() {
        return "builtins package fragment for " + e() + " from " + a20.a.l(this);
    }
}