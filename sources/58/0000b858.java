package v00;

import j20.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.l0;
import w00.n0;
import w00.p;
import w00.s0;
import w00.v0;
import wz.v;
import wz.w;
import y00.g0;

/* loaded from: classes5.dex */
public final class a extends d20.e {

    /* renamed from: e  reason: collision with root package name */
    public static final C1208a f53783e = new C1208a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final u10.f f53784f;

    /* renamed from: v00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1208a {
        private C1208a() {
        }

        public /* synthetic */ C1208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u10.f a() {
            return a.f53784f;
        }
    }

    static {
        u10.f f11 = u10.f.f("clone");
        s.f(f11, "identifier(\"clone\")");
        f53784f = f11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n storageManager, w00.c containingClass) {
        super(storageManager, containingClass);
        s.g(storageManager, "storageManager");
        s.g(containingClass, "containingClass");
    }

    @Override // d20.e
    protected List<kotlin.reflect.jvm.internal.impl.descriptors.e> i() {
        List<? extends s0> i11;
        List<v0> i12;
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> d11;
        g0 h12 = g0.h1(l(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), f53784f, b.a.DECLARATION, n0.f55303a);
        l0 E0 = l().E0();
        i11 = w.i();
        i12 = w.i();
        h12.N0(null, E0, i11, i12, a20.a.g(l()).i(), kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN, p.f55307c);
        d11 = v.d(h12);
        return d11;
    }
}