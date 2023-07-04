package kotlin.reflect.jvm.internal.impl.types.checker;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k20.d0;
import k20.j1;
import k20.y0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w00.s0;

/* loaded from: classes5.dex */
public final class k implements x10.b {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f35159a;

    /* renamed from: b  reason: collision with root package name */
    private h00.a<? extends List<? extends j1>> f35160b;

    /* renamed from: c  reason: collision with root package name */
    private final k f35161c;

    /* renamed from: d  reason: collision with root package name */
    private final s0 f35162d;

    /* renamed from: e  reason: collision with root package name */
    private final vz.k f35163e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<List<? extends j1>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<j1> f35164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends j1> list) {
            super(0);
            this.f35164a = list;
        }

        @Override // h00.a
        public final List<? extends j1> invoke() {
            return this.f35164a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends j1>> {
        b() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends j1> invoke() {
            h00.a aVar = k.this.f35160b;
            if (aVar == null) {
                return null;
            }
            return (List) aVar.invoke();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<List<? extends j1>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<j1> f35166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends j1> list) {
            super(0);
            this.f35166a = list;
        }

        @Override // h00.a
        public final List<? extends j1> invoke() {
            return this.f35166a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<List<? extends j1>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f35168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.f35168b = hVar;
        }

        @Override // h00.a
        public final List<? extends j1> invoke() {
            int t11;
            List<j1> a11 = k.this.a();
            h hVar = this.f35168b;
            t11 = wz.x.t(a11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (j1 j1Var : a11) {
                arrayList.add(j1Var.M0(hVar));
            }
            return arrayList;
        }
    }

    public k(y0 projection, h00.a<? extends List<? extends j1>> aVar, k kVar, s0 s0Var) {
        vz.k b11;
        kotlin.jvm.internal.s.g(projection, "projection");
        this.f35159a = projection;
        this.f35160b = aVar;
        this.f35161c = kVar;
        this.f35162d = s0Var;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new b());
        this.f35163e = b11;
    }

    private final List<j1> d() {
        return (List) this.f35163e.getValue();
    }

    @Override // k20.w0
    /* renamed from: c */
    public List<j1> a() {
        List<j1> i11;
        List<j1> d11 = d();
        if (d11 == null) {
            i11 = wz.w.i();
            return i11;
        }
        return d11;
    }

    public final void e(List<? extends j1> supertypes) {
        kotlin.jvm.internal.s.g(supertypes, "supertypes");
        this.f35160b = new c(supertypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(k.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
            k kVar = (k) obj;
            k kVar2 = this.f35161c;
            if (kVar2 == null) {
                kVar2 = this;
            }
            k kVar3 = kVar.f35161c;
            if (kVar3 != null) {
                kVar = kVar3;
            }
            return kVar2 == kVar;
        }
        return false;
    }

    @Override // k20.w0
    /* renamed from: f */
    public k m(h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 m11 = getProjection().m(kotlinTypeRefiner);
        kotlin.jvm.internal.s.f(m11, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f35160b == null ? null : new d(kotlinTypeRefiner);
        k kVar = this.f35161c;
        if (kVar == null) {
            kVar = this;
        }
        return new k(m11, dVar, kVar, this.f35162d);
    }

    @Override // k20.w0
    public List<s0> getParameters() {
        List<s0> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // x10.b
    public y0 getProjection() {
        return this.f35159a;
    }

    public int hashCode() {
        k kVar = this.f35161c;
        return kVar == null ? super.hashCode() : kVar.hashCode();
    }

    @Override // k20.w0
    public t00.h l() {
        d0 type = getProjection().getType();
        kotlin.jvm.internal.s.f(type, "projection.type");
        return n20.a.h(type);
    }

    @Override // k20.w0
    public w00.e n() {
        return null;
    }

    @Override // k20.w0
    public boolean o() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + getProjection() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ k(y0 y0Var, h00.a aVar, k kVar, s0 s0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : kVar, (i11 & 8) != 0 ? null : s0Var);
    }

    public /* synthetic */ k(y0 y0Var, List list, k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, list, (i11 & 4) != 0 ? null : kVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(y0 projection, List<? extends j1> supertypes, k kVar) {
        this(projection, new a(supertypes), kVar, null, 8, null);
        kotlin.jvm.internal.s.g(projection, "projection");
        kotlin.jvm.internal.s.g(supertypes, "supertypes");
    }
}