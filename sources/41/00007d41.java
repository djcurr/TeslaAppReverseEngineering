package k20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class x0 extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34347b = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: k20.x0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0638a extends x0 {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Map<w0, y0> f34348c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f34349d;

            /* JADX WARN: Multi-variable type inference failed */
            C0638a(Map<w0, ? extends y0> map, boolean z11) {
                this.f34348c = map;
                this.f34349d = z11;
            }

            @Override // k20.b1
            public boolean a() {
                return this.f34349d;
            }

            @Override // k20.b1
            public boolean f() {
                return this.f34348c.isEmpty();
            }

            @Override // k20.x0
            public y0 k(w0 key) {
                kotlin.jvm.internal.s.g(key, "key");
                return this.f34348c.get(key);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ x0 e(a aVar, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return aVar.d(map, z11);
        }

        public final b1 a(d0 kotlinType) {
            kotlin.jvm.internal.s.g(kotlinType, "kotlinType");
            return b(kotlinType.H0(), kotlinType.G0());
        }

        public final b1 b(w0 typeConstructor, List<? extends y0> arguments) {
            int t11;
            List V0;
            Map t12;
            kotlin.jvm.internal.s.g(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.s.g(arguments, "arguments");
            List<w00.s0> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.s.f(parameters, "typeConstructor.parameters");
            w00.s0 s0Var = (w00.s0) wz.u.p0(parameters);
            if (s0Var != null && s0Var.P()) {
                List<w00.s0> parameters2 = typeConstructor.getParameters();
                kotlin.jvm.internal.s.f(parameters2, "typeConstructor.parameters");
                t11 = wz.x.t(parameters2, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (w00.s0 s0Var2 : parameters2) {
                    arrayList.add(s0Var2.i());
                }
                V0 = wz.e0.V0(arrayList, arguments);
                t12 = wz.s0.t(V0);
                return e(this, t12, false, 2, null);
            }
            return new b0(parameters, arguments);
        }

        public final x0 c(Map<w0, ? extends y0> map) {
            kotlin.jvm.internal.s.g(map, "map");
            return e(this, map, false, 2, null);
        }

        public final x0 d(Map<w0, ? extends y0> map, boolean z11) {
            kotlin.jvm.internal.s.g(map, "map");
            return new C0638a(map, z11);
        }
    }

    public static final b1 i(w0 w0Var, List<? extends y0> list) {
        return f34347b.b(w0Var, list);
    }

    public static final x0 j(Map<w0, ? extends y0> map) {
        return f34347b.c(map);
    }

    @Override // k20.b1
    public y0 e(d0 key) {
        kotlin.jvm.internal.s.g(key, "key");
        return k(key.H0());
    }

    public abstract y0 k(w0 w0Var);
}