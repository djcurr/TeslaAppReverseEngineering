package a10;

import g20.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v00.f;
import vz.b0;
import w00.z;
import wz.w;
import y00.x;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f124c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final g20.j f125a;

    /* renamed from: b  reason: collision with root package name */
    private final a10.a f126b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            List i11;
            List l11;
            s.g(classLoader, "classLoader");
            j20.f fVar = new j20.f("RuntimeModuleData");
            v00.f fVar2 = new v00.f(fVar, f.a.FROM_DEPENDENCIES);
            u10.f i12 = u10.f.i("<runtime module for " + classLoader + '>');
            s.f(i12, "special(\"<runtime module for $classLoader>\")");
            x xVar = new x(i12, fVar, fVar2, null, null, null, 56, null);
            fVar2.C0(xVar);
            fVar2.H0(xVar, true);
            g gVar = new g(classLoader);
            n10.e eVar = new n10.e();
            h10.k kVar = new h10.k();
            z zVar = new z(fVar, xVar);
            h10.g c11 = l.c(classLoader, xVar, fVar, zVar, gVar, eVar, kVar, null, 128, null);
            n10.d a11 = l.a(xVar, fVar, zVar, c11, gVar, eVar);
            eVar.n(a11);
            f10.g EMPTY = f10.g.f25535a;
            s.f(EMPTY, "EMPTY");
            b20.c cVar = new b20.c(c11, EMPTY);
            kVar.c(cVar);
            ClassLoader stdlibClassLoader = b0.class.getClassLoader();
            s.f(stdlibClassLoader, "stdlibClassLoader");
            g gVar2 = new g(stdlibClassLoader);
            v00.g G0 = fVar2.G0();
            v00.g G02 = fVar2.G0();
            k.a aVar = k.a.f27416a;
            kotlin.reflect.jvm.internal.impl.types.checker.n a12 = kotlin.reflect.jvm.internal.impl.types.checker.m.f35169b.a();
            i11 = w.i();
            v00.h hVar = new v00.h(fVar, gVar2, xVar, zVar, G0, G02, aVar, a12, new c20.b(fVar, i11));
            xVar.U0(xVar);
            l11 = w.l(cVar.a(), hVar);
            xVar.O0(new y00.i(l11, s.p("CompositeProvider@RuntimeModuleData for ", xVar)));
            return new k(a11.a(), new a10.a(eVar, gVar), null);
        }
    }

    private k(g20.j jVar, a10.a aVar) {
        this.f125a = jVar;
        this.f126b = aVar;
    }

    public /* synthetic */ k(g20.j jVar, a10.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, aVar);
    }

    public final g20.j a() {
        return this.f125a;
    }

    public final w00.x b() {
        return this.f125a.p();
    }

    public final a10.a c() {
        return this.f126b;
    }
}