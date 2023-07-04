package k20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class c0 implements w0, m20.h {

    /* renamed from: a  reason: collision with root package name */
    private d0 f34225a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<d0> f34226b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34227c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> {
        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final k0 mo12invoke(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return c0.this.m(kotlinTypeRefiner).c();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f34229a;

        public b(h00.l lVar) {
            this.f34229a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            d0 it2 = (d0) t11;
            h00.l lVar = this.f34229a;
            kotlin.jvm.internal.s.f(it2, "it");
            String obj = lVar.mo12invoke(it2).toString();
            d0 it3 = (d0) t12;
            h00.l lVar2 = this.f34229a;
            kotlin.jvm.internal.s.f(it3, "it");
            a11 = yz.b.a(obj, lVar2.mo12invoke(it3).toString());
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<d0, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34230a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String mo12invoke(d0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<d0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<d0, Object> f34231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.l<? super d0, ? extends Object> lVar) {
            super(1);
            this.f34231a = lVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(d0 it2) {
            h00.l<d0, Object> lVar = this.f34231a;
            kotlin.jvm.internal.s.f(it2, "it");
            return lVar.mo12invoke(it2).toString();
        }
    }

    public c0(Collection<? extends d0> typesToIntersect) {
        kotlin.jvm.internal.s.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<d0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f34226b = linkedHashSet;
        this.f34227c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String f(c0 c0Var, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = c.f34230a;
        }
        return c0Var.e(lVar);
    }

    @Override // k20.w0
    public Collection<d0> a() {
        return this.f34226b;
    }

    public final d20.h b() {
        return d20.n.f23492c.a("member scope for intersection type", this.f34226b);
    }

    public final k0 c() {
        List i11;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        i11 = wz.w.i();
        return e0.k(b11, this, i11, false, b(), new a());
    }

    public final d0 d() {
        return this.f34225a;
    }

    public final String e(h00.l<? super d0, ? extends Object> getProperTypeRelatedToStringify) {
        List G0;
        String l02;
        kotlin.jvm.internal.s.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        G0 = wz.e0.G0(this.f34226b, new b(getProperTypeRelatedToStringify));
        l02 = wz.e0.l0(G0, " & ", "{", "}", 0, null, new d(getProperTypeRelatedToStringify), 24, null);
        return l02;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return kotlin.jvm.internal.s.c(this.f34226b, ((c0) obj).f34226b);
        }
        return false;
    }

    @Override // k20.w0
    /* renamed from: g */
    public c0 mo154m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        int t11;
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<d0> a11 = a();
        t11 = wz.x.t(a11, 10);
        ArrayList arrayList = new ArrayList(t11);
        boolean z11 = false;
        for (d0 d0Var : a11) {
            arrayList.add(d0Var.J0(kotlinTypeRefiner));
            z11 = true;
        }
        c0 c0Var = null;
        if (z11) {
            d0 d11 = d();
            c0Var = new c0(arrayList).h(d11 != null ? d11.J0(kotlinTypeRefiner) : null);
        }
        return c0Var == null ? this : c0Var;
    }

    @Override // k20.w0
    public List<w00.s0> getParameters() {
        List<w00.s0> i11;
        i11 = wz.w.i();
        return i11;
    }

    public final c0 h(d0 d0Var) {
        return new c0(this.f34226b, d0Var);
    }

    public int hashCode() {
        return this.f34227c;
    }

    @Override // k20.w0
    public t00.h l() {
        t00.h l11 = this.f34226b.iterator().next().H0().l();
        kotlin.jvm.internal.s.f(l11, "intersectedTypes.iterato…xt().constructor.builtIns");
        return l11;
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
        return f(this, null, 1, null);
    }

    private c0(Collection<? extends d0> collection, d0 d0Var) {
        this(collection);
        this.f34225a = d0Var;
    }
}