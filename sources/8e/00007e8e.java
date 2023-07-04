package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.List;
import java.util.Map;
import k20.d0;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import t00.k;
import vz.v;
import w00.x;
import wz.s0;
import wz.w;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a */
    private static final u10.f f34937a;

    /* renamed from: b */
    private static final u10.f f34938b;

    /* renamed from: c */
    private static final u10.f f34939c;

    /* renamed from: d */
    private static final u10.f f34940d;

    /* renamed from: e */
    private static final u10.f f34941e;

    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.l<x, d0> {

        /* renamed from: a */
        final /* synthetic */ t00.h f34942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t00.h hVar) {
            super(1);
            this.f34942a = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final d0 invoke(x module) {
            s.g(module, "module");
            k0 l11 = module.l().l(k1.INVARIANT, this.f34942a.W());
            s.f(l11, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return l11;
        }
    }

    static {
        u10.f f11 = u10.f.f("message");
        s.f(f11, "identifier(\"message\")");
        f34937a = f11;
        u10.f f12 = u10.f.f("replaceWith");
        s.f(f12, "identifier(\"replaceWith\")");
        f34938b = f12;
        u10.f f13 = u10.f.f("level");
        s.f(f13, "identifier(\"level\")");
        f34939c = f13;
        u10.f f14 = u10.f.f("expression");
        s.f(f14, "identifier(\"expression\")");
        f34940d = f14;
        u10.f f15 = u10.f.f("imports");
        s.f(f15, "identifier(\"imports\")");
        f34941e = f15;
    }

    public static final c a(t00.h hVar, String message, String replaceWith, String level) {
        List i11;
        Map l11;
        Map l12;
        s.g(hVar, "<this>");
        s.g(message, "message");
        s.g(replaceWith, "replaceWith");
        s.g(level, "level");
        u10.c cVar = k.a.f51346p;
        u10.f fVar = f34941e;
        i11 = w.i();
        l11 = s0.l(v.a(f34940d, new y10.v(replaceWith)), v.a(fVar, new y10.b(i11, new a(hVar))));
        j jVar = new j(hVar, cVar, l11);
        u10.c cVar2 = k.a.f51344n;
        u10.f fVar2 = f34939c;
        u10.b m11 = u10.b.m(k.a.f51345o);
        s.f(m11, "topLevel(StandardNames.FqNames.deprecationLevel)");
        u10.f f11 = u10.f.f(level);
        s.f(f11, "identifier(level)");
        l12 = s0.l(v.a(f34937a, new y10.v(message)), v.a(f34938b, new y10.a(jVar)), v.a(fVar2, new y10.j(m11, f11)));
        return new j(hVar, cVar2, l12);
    }

    public static /* synthetic */ c b(t00.h hVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "WARNING";
        }
        return a(hVar, str, str2, str3);
    }
}