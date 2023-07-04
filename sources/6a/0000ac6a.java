package q00;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import n00.l;
import q00.d0;
import w00.v0;

/* loaded from: classes5.dex */
public final class q implements n00.l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ n00.m[] f47226f = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(q.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(q.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final d0.a f47227a;

    /* renamed from: b  reason: collision with root package name */
    private final d0.a f47228b;

    /* renamed from: c  reason: collision with root package name */
    private final f<?> f47229c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47230d;

    /* renamed from: e  reason: collision with root package name */
    private final l.a f47231e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends Annotation>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<? extends Annotation> mo11invoke() {
            return l0.e(q.this.r());
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<Type> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Type mo11invoke() {
            w00.g0 r11 = q.this.r();
            if ((r11 instanceof w00.l0) && kotlin.jvm.internal.s.c(l0.i(q.this.k().mo212y()), r11) && q.this.k().mo212y().getKind() == b.a.FAKE_OVERRIDE) {
                w00.i mo223b = q.this.k().mo212y().mo223b();
                Objects.requireNonNull(mo223b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> p11 = l0.p((w00.c) mo223b);
                if (p11 != null) {
                    return p11;
                }
                throw new b0("Cannot determine receiver Java type of inherited declaration: " + r11);
            }
            return q.this.k().v().a().get(q.this.getIndex());
        }
    }

    public q(f<?> callable, int i11, l.a kind, h00.a<? extends w00.g0> computeDescriptor) {
        kotlin.jvm.internal.s.g(callable, "callable");
        kotlin.jvm.internal.s.g(kind, "kind");
        kotlin.jvm.internal.s.g(computeDescriptor, "computeDescriptor");
        this.f47229c = callable;
        this.f47230d = i11;
        this.f47231e = kind;
        this.f47227a = d0.c(computeDescriptor);
        this.f47228b = d0.c(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w00.g0 r() {
        return (w00.g0) this.f47227a.b(this, f47226f[0]);
    }

    @Override // n00.l
    public boolean b() {
        w00.g0 r11 = r();
        return (r11 instanceof v0) && ((v0) r11).q0() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (kotlin.jvm.internal.s.c(this.f47229c, qVar.f47229c) && getIndex() == qVar.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        return (List) this.f47228b.b(this, f47226f[1]);
    }

    @Override // n00.l
    public int getIndex() {
        return this.f47230d;
    }

    @Override // n00.l
    public l.a getKind() {
        return this.f47231e;
    }

    @Override // n00.l
    public String getName() {
        w00.g0 r11 = r();
        if (!(r11 instanceof v0)) {
            r11 = null;
        }
        v0 v0Var = (v0) r11;
        if (v0Var == null || v0Var.mo223b().c0()) {
            return null;
        }
        u10.f name = v0Var.getName();
        kotlin.jvm.internal.s.f(name, "valueParameter.name");
        if (name.g()) {
            return null;
        }
        return name.b();
    }

    @Override // n00.l
    public n00.p getType() {
        k20.d0 type = r().getType();
        kotlin.jvm.internal.s.f(type, "descriptor.type");
        return new x(type, new b());
    }

    public int hashCode() {
        return (this.f47229c.hashCode() * 31) + Integer.valueOf(getIndex()).hashCode();
    }

    public final f<?> k() {
        return this.f47229c;
    }

    @Override // n00.l
    public boolean q() {
        w00.g0 r11 = r();
        if (!(r11 instanceof v0)) {
            r11 = null;
        }
        v0 v0Var = (v0) r11;
        if (v0Var != null) {
            return a20.a.a(v0Var);
        }
        return false;
    }

    public String toString() {
        return g0.f47130b.f(this);
    }
}