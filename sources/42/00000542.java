package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3315a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3316b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3317c;

    /* renamed from: d  reason: collision with root package name */
    private final o f3318d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3319e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3320f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3321g;

    public n() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public n(boolean z11, boolean z12, boolean z13, o securePolicy, boolean z14, boolean z15, boolean z16) {
        s.g(securePolicy, "securePolicy");
        this.f3315a = z11;
        this.f3316b = z12;
        this.f3317c = z13;
        this.f3318d = securePolicy;
        this.f3319e = z14;
        this.f3320f = z15;
        this.f3321g = z16;
    }

    public final boolean a() {
        return this.f3320f;
    }

    public final boolean b() {
        return this.f3316b;
    }

    public final boolean c() {
        return this.f3317c;
    }

    public final boolean d() {
        return this.f3319e;
    }

    public final boolean e() {
        return this.f3315a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f3315a == nVar.f3315a && this.f3316b == nVar.f3316b && this.f3317c == nVar.f3317c && this.f3318d == nVar.f3318d && this.f3319e == nVar.f3319e && this.f3320f == nVar.f3320f && this.f3321g == nVar.f3321g;
        }
        return false;
    }

    public final o f() {
        return this.f3318d;
    }

    public final boolean g() {
        return this.f3321g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f3316b) * 31) + Boolean.hashCode(this.f3315a)) * 31) + Boolean.hashCode(this.f3316b)) * 31) + Boolean.hashCode(this.f3317c)) * 31) + this.f3318d.hashCode()) * 31) + Boolean.hashCode(this.f3319e)) * 31) + Boolean.hashCode(this.f3320f)) * 31) + Boolean.hashCode(this.f3321g);
    }

    public /* synthetic */ n(boolean z11, boolean z12, boolean z13, o oVar, boolean z14, boolean z15, boolean z16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? o.Inherit : oVar, (i11 & 16) != 0 ? true : z14, (i11 & 32) == 0 ? z15 : true, (i11 & 64) != 0 ? false : z16);
    }

    public /* synthetic */ n(boolean z11, boolean z12, boolean z13, o oVar, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? o.Inherit : oVar, (i11 & 16) != 0 ? true : z14, (i11 & 32) == 0 ? z15 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, boolean z12, boolean z13, o securePolicy, boolean z14, boolean z15) {
        this(z11, z12, z13, securePolicy, z14, z15, false);
        s.g(securePolicy, "securePolicy");
    }
}