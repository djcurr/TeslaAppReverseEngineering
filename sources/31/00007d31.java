package k20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34322e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34323a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.r0 f34324b;

    /* renamed from: c  reason: collision with root package name */
    private final List<y0> f34325c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<w00.s0, y0> f34326d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t0 a(t0 t0Var, w00.r0 typeAliasDescriptor, List<? extends y0> arguments) {
            int t11;
            List V0;
            Map t12;
            kotlin.jvm.internal.s.g(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.s.g(arguments, "arguments");
            List<w00.s0> parameters = typeAliasDescriptor.i().getParameters();
            kotlin.jvm.internal.s.f(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            t11 = wz.x.t(parameters, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (w00.s0 s0Var : parameters) {
                arrayList.add(s0Var.a());
            }
            V0 = wz.e0.V0(arrayList, arguments);
            t12 = wz.s0.t(V0);
            return new t0(t0Var, typeAliasDescriptor, arguments, t12, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t0(t0 t0Var, w00.r0 r0Var, List<? extends y0> list, Map<w00.s0, ? extends y0> map) {
        this.f34323a = t0Var;
        this.f34324b = r0Var;
        this.f34325c = list;
        this.f34326d = map;
    }

    public /* synthetic */ t0(t0 t0Var, w00.r0 r0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0Var, r0Var, list, map);
    }

    public final List<y0> a() {
        return this.f34325c;
    }

    public final w00.r0 b() {
        return this.f34324b;
    }

    public final y0 c(w0 constructor) {
        kotlin.jvm.internal.s.g(constructor, "constructor");
        w00.e n11 = constructor.n();
        if (n11 instanceof w00.s0) {
            return this.f34326d.get(n11);
        }
        return null;
    }

    public final boolean d(w00.r0 descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (!kotlin.jvm.internal.s.c(this.f34324b, descriptor)) {
            t0 t0Var = this.f34323a;
            if (!(t0Var == null ? false : t0Var.d(descriptor))) {
                return false;
            }
        }
        return true;
    }
}