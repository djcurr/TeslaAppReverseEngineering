package e10;

import e10.u;
import java.util.Map;
import wz.s0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final u10.c f24487a;

    /* renamed from: b  reason: collision with root package name */
    private static final u10.c f24488b;

    /* renamed from: c  reason: collision with root package name */
    private static final b0<u> f24489c;

    /* renamed from: d  reason: collision with root package name */
    private static final u f24490d;

    static {
        Map l11;
        u10.c cVar = new u10.c("org.jspecify.nullness");
        f24487a = cVar;
        u10.c cVar2 = new u10.c("org.checkerframework.checker.nullness.compatqual");
        f24488b = cVar2;
        u10.c cVar3 = new u10.c("org.jetbrains.annotations");
        u.a aVar = u.f24491d;
        u10.c cVar4 = new u10.c("androidx.annotation.RecentlyNullable");
        e0 e0Var = e0.WARN;
        vz.i iVar = new vz.i(1, 6);
        e0 e0Var2 = e0.STRICT;
        l11 = s0.l(vz.v.a(cVar3, aVar.a()), vz.v.a(new u10.c("androidx.annotation"), aVar.a()), vz.v.a(new u10.c("android.support.annotation"), aVar.a()), vz.v.a(new u10.c("android.annotation"), aVar.a()), vz.v.a(new u10.c("com.android.annotations"), aVar.a()), vz.v.a(new u10.c("org.eclipse.jdt.annotation"), aVar.a()), vz.v.a(new u10.c("org.checkerframework.checker.nullness.qual"), aVar.a()), vz.v.a(cVar2, aVar.a()), vz.v.a(new u10.c("javax.annotation"), aVar.a()), vz.v.a(new u10.c("edu.umd.cs.findbugs.annotations"), aVar.a()), vz.v.a(new u10.c("io.reactivex.annotations"), aVar.a()), vz.v.a(cVar4, new u(e0Var, null, null, 4, null)), vz.v.a(new u10.c("androidx.annotation.RecentlyNonNull"), new u(e0Var, null, null, 4, null)), vz.v.a(new u10.c("lombok"), aVar.a()), vz.v.a(cVar, new u(e0Var, iVar, e0Var2)), vz.v.a(new u10.c("io.reactivex.rxjava3.annotations"), new u(e0Var, new vz.i(1, 7), e0Var2)));
        f24489c = new c0(l11);
        f24490d = new u(e0Var, null, null, 4, null);
    }

    public static final x a(vz.i configuredKotlinVersion) {
        e0 c11;
        kotlin.jvm.internal.s.g(configuredKotlinVersion, "configuredKotlinVersion");
        u uVar = f24490d;
        if (uVar.d() != null && uVar.d().compareTo(configuredKotlinVersion) <= 0) {
            c11 = uVar.b();
        } else {
            c11 = uVar.c();
        }
        e0 e0Var = c11;
        return new x(e0Var, c(e0Var), null, 4, null);
    }

    public static /* synthetic */ x b(vz.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = vz.i.f54764e;
        }
        return a(iVar);
    }

    public static final e0 c(e0 globalReportLevel) {
        kotlin.jvm.internal.s.g(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == e0.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final e0 d(u10.c annotationFqName) {
        kotlin.jvm.internal.s.g(annotationFqName, "annotationFqName");
        return g(annotationFqName, b0.f24427a.a(), null, 4, null);
    }

    public static final u10.c e() {
        return f24487a;
    }

    public static final e0 f(u10.c annotation, b0<? extends e0> configuredReportLevels, vz.i configuredKotlinVersion) {
        kotlin.jvm.internal.s.g(annotation, "annotation");
        kotlin.jvm.internal.s.g(configuredReportLevels, "configuredReportLevels");
        kotlin.jvm.internal.s.g(configuredKotlinVersion, "configuredKotlinVersion");
        e0 a11 = configuredReportLevels.a(annotation);
        if (a11 == null) {
            u a12 = f24489c.a(annotation);
            if (a12 == null) {
                return e0.IGNORE;
            }
            if (a12.d() != null && a12.d().compareTo(configuredKotlinVersion) <= 0) {
                return a12.b();
            }
            return a12.c();
        }
        return a11;
    }

    public static /* synthetic */ e0 g(u10.c cVar, b0 b0Var, vz.i iVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            iVar = vz.i.f54764e;
        }
        return f(cVar, b0Var, iVar);
    }
}