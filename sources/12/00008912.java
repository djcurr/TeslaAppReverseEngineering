package n10;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o10.a;
import w00.a0;
import wz.w0;
import wz.x0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40193b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Set<a.EnumC0828a> f40194c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<a.EnumC0828a> f40195d;

    /* renamed from: e  reason: collision with root package name */
    private static final t10.e f40196e;

    /* renamed from: f  reason: collision with root package name */
    private static final t10.e f40197f;

    /* renamed from: g  reason: collision with root package name */
    private static final t10.e f40198g;

    /* renamed from: a  reason: collision with root package name */
    public g20.j f40199a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t10.e a() {
            return e.f40198g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<Collection<? extends u10.f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40200a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<u10.f> invoke() {
            List i11;
            i11 = wz.w.i();
            return i11;
        }
    }

    static {
        Set<a.EnumC0828a> c11;
        Set<a.EnumC0828a> i11;
        c11 = w0.c(a.EnumC0828a.CLASS);
        f40194c = c11;
        i11 = x0.i(a.EnumC0828a.FILE_FACADE, a.EnumC0828a.MULTIFILE_CLASS_PART);
        f40195d = i11;
        f40196e = new t10.e(1, 1, 2);
        f40197f = new t10.e(1, 1, 11);
        f40198g = new t10.e(1, 1, 13);
    }

    private final i20.e d(o oVar) {
        return e().g().d() ? i20.e.STABLE : oVar.a().j() ? i20.e.FIR_UNSTABLE : oVar.a().k() ? i20.e.IR_UNSTABLE : i20.e.STABLE;
    }

    private final g20.s<t10.e> f(o oVar) {
        if (g() || oVar.a().d().h()) {
            return null;
        }
        return new g20.s<>(oVar.a().d(), t10.e.f51549g, oVar.getLocation(), oVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return e().g().e();
    }

    private final boolean h(o oVar) {
        return !e().g().b() && oVar.a().i() && kotlin.jvm.internal.s.c(oVar.a().d(), f40197f);
    }

    private final boolean i(o oVar) {
        return (e().g().f() && (oVar.a().i() || kotlin.jvm.internal.s.c(oVar.a().d(), f40196e))) || h(oVar);
    }

    private final String[] k(o oVar, Set<? extends a.EnumC0828a> set) {
        o10.a a11 = oVar.a();
        String[] a12 = a11.a();
        if (a12 == null) {
            a12 = a11.b();
        }
        if (a12 != null && set.contains(a11.c())) {
            return a12;
        }
        return null;
    }

    public final d20.h c(a0 descriptor, o kotlinClass) {
        String[] g11;
        vz.p<t10.f, p10.l> pVar;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(kotlinClass, "kotlinClass");
        String[] k11 = k(kotlinClass, f40195d);
        if (k11 == null || (g11 = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                pVar = t10.g.m(k11, g11);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Could not read data from ", kotlinClass.getLocation()), e11);
            }
        } catch (Throwable th2) {
            if (g() || kotlinClass.a().d().h()) {
                throw th2;
            }
            pVar = null;
        }
        if (pVar == null) {
            return null;
        }
        t10.f a11 = pVar.a();
        p10.l b11 = pVar.b();
        i iVar = new i(kotlinClass, b11, a11, f(kotlinClass), i(kotlinClass), d(kotlinClass));
        return new i20.i(descriptor, b11, a11, kotlinClass.a().d(), iVar, e(), "scope for " + iVar + " in " + descriptor, b.f40200a);
    }

    public final g20.j e() {
        g20.j jVar = this.f40199a;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.s.x("components");
        return null;
    }

    public final g20.f j(o kotlinClass) {
        String[] g11;
        vz.p<t10.f, p10.c> pVar;
        kotlin.jvm.internal.s.g(kotlinClass, "kotlinClass");
        String[] k11 = k(kotlinClass, f40194c);
        if (k11 == null || (g11 = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                pVar = t10.g.i(k11, g11);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Could not read data from ", kotlinClass.getLocation()), e11);
            }
        } catch (Throwable th2) {
            if (g() || kotlinClass.a().d().h()) {
                throw th2;
            }
            pVar = null;
        }
        if (pVar == null) {
            return null;
        }
        return new g20.f(pVar.a(), pVar.b(), kotlinClass.a().d(), new q(kotlinClass, f(kotlinClass), i(kotlinClass), d(kotlinClass)));
    }

    public final w00.c l(o kotlinClass) {
        kotlin.jvm.internal.s.g(kotlinClass, "kotlinClass");
        g20.f j11 = j(kotlinClass);
        if (j11 == null) {
            return null;
        }
        return e().f().d(kotlinClass.j(), j11);
    }

    public final void m(g20.j jVar) {
        kotlin.jvm.internal.s.g(jVar, "<set-?>");
        this.f40199a = jVar;
    }

    public final void n(d components) {
        kotlin.jvm.internal.s.g(components, "components");
        m(components.a());
    }
}