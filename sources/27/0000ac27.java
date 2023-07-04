package q00;

import java.util.List;
import w00.v0;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final g0 f47130b = new g0();

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.renderer.c f47129a = kotlin.reflect.jvm.internal.impl.renderer.c.f35080b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<v0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47131a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(v0 it2) {
            g0 g0Var = g0.f47130b;
            kotlin.jvm.internal.s.f(it2, "it");
            k20.d0 type = it2.getType();
            kotlin.jvm.internal.s.f(type, "it.type");
            return g0Var.h(type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<v0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47132a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(v0 it2) {
            g0 g0Var = g0.f47130b;
            kotlin.jvm.internal.s.f(it2, "it");
            k20.d0 type = it2.getType();
            kotlin.jvm.internal.s.f(type, "it.type");
            return g0Var.h(type);
        }
    }

    private g0() {
    }

    private final void a(StringBuilder sb2, w00.l0 l0Var) {
        if (l0Var != null) {
            k20.d0 type = l0Var.getType();
            kotlin.jvm.internal.s.f(type, "receiver.type");
            sb2.append(h(type));
            sb2.append(".");
        }
    }

    private final void b(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        w00.l0 i11 = l0.i(aVar);
        w00.l0 N = aVar.N();
        a(sb2, i11);
        boolean z11 = (i11 == null || N == null) ? false : true;
        if (z11) {
            sb2.append("(");
        }
        a(sb2, N);
        if (z11) {
            sb2.append(")");
        }
    }

    private final String c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        if (aVar instanceof w00.i0) {
            return g((w00.i0) aVar);
        }
        if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return d((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    public final String d(kotlin.reflect.jvm.internal.impl.descriptors.e descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        g0 g0Var = f47130b;
        g0Var.b(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f47129a;
        u10.f name = descriptor.getName();
        kotlin.jvm.internal.s.f(name, "descriptor.name");
        sb2.append(cVar.v(name, true));
        List<v0> h11 = descriptor.h();
        kotlin.jvm.internal.s.f(h11, "descriptor.valueParameters");
        wz.e0.j0(h11, sb2, ", ", "(", ")", 0, null, a.f47131a, 48, null);
        sb2.append(": ");
        k20.d0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.s.e(returnType);
        kotlin.jvm.internal.s.f(returnType, "descriptor.returnType!!");
        sb2.append(g0Var.h(returnType));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String e(kotlin.reflect.jvm.internal.impl.descriptors.e invoke) {
        kotlin.jvm.internal.s.g(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        g0 g0Var = f47130b;
        g0Var.b(sb2, invoke);
        List<v0> h11 = invoke.h();
        kotlin.jvm.internal.s.f(h11, "invoke.valueParameters");
        wz.e0.j0(h11, sb2, ", ", "(", ")", 0, null, b.f47132a, 48, null);
        sb2.append(" -> ");
        k20.d0 returnType = invoke.getReturnType();
        kotlin.jvm.internal.s.e(returnType);
        kotlin.jvm.internal.s.f(returnType, "invoke.returnType!!");
        sb2.append(g0Var.h(returnType));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String f(q parameter) {
        kotlin.jvm.internal.s.g(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = f0.f47127a[parameter.getKind().ordinal()];
        if (i11 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i11 == 2) {
            sb2.append("instance parameter");
        } else if (i11 == 3) {
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f47130b.c(parameter.k().mo212y()));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String g(w00.i0 descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.L() ? "var " : "val ");
        g0 g0Var = f47130b;
        g0Var.b(sb2, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f47129a;
        u10.f name = descriptor.getName();
        kotlin.jvm.internal.s.f(name, "descriptor.name");
        sb2.append(cVar.v(name, true));
        sb2.append(": ");
        k20.d0 type = descriptor.getType();
        kotlin.jvm.internal.s.f(type, "descriptor.type");
        sb2.append(g0Var.h(type));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String h(k20.d0 type) {
        kotlin.jvm.internal.s.g(type, "type");
        return f47129a.w(type);
    }
}