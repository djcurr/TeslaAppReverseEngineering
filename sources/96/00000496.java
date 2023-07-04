package androidx.compose.ui.platform;

import java.util.List;

/* loaded from: classes.dex */
public final class k1 implements h2.g0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2993a;

    /* renamed from: b  reason: collision with root package name */
    private final List<k1> f2994b;

    /* renamed from: c  reason: collision with root package name */
    private Float f2995c;

    /* renamed from: d  reason: collision with root package name */
    private Float f2996d;

    /* renamed from: e  reason: collision with root package name */
    private l2.i f2997e;

    /* renamed from: f  reason: collision with root package name */
    private l2.i f2998f;

    public k1(int i11, List<k1> allScopes, Float f11, Float f12, l2.i iVar, l2.i iVar2) {
        kotlin.jvm.internal.s.g(allScopes, "allScopes");
        this.f2993a = i11;
        this.f2994b = allScopes;
        this.f2995c = f11;
        this.f2996d = f12;
        this.f2997e = iVar;
        this.f2998f = iVar2;
    }

    public final l2.i a() {
        return this.f2997e;
    }

    public final Float b() {
        return this.f2995c;
    }

    public final Float c() {
        return this.f2996d;
    }

    public final int d() {
        return this.f2993a;
    }

    public final l2.i e() {
        return this.f2998f;
    }

    public final void f(l2.i iVar) {
        this.f2997e = iVar;
    }

    public final void g(Float f11) {
        this.f2995c = f11;
    }

    public final void h(Float f11) {
        this.f2996d = f11;
    }

    public final void i(l2.i iVar) {
        this.f2998f = iVar;
    }

    @Override // h2.g0
    public boolean isValid() {
        return this.f2994b.contains(this);
    }
}