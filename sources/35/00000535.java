package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3283a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3284b;

    /* renamed from: c  reason: collision with root package name */
    private final o f3285c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3286d;

    public g() {
        this(false, false, null, false, 15, null);
    }

    public g(boolean z11, boolean z12, o securePolicy, boolean z13) {
        s.g(securePolicy, "securePolicy");
        this.f3283a = z11;
        this.f3284b = z12;
        this.f3285c = securePolicy;
        this.f3286d = z13;
    }

    public final boolean a() {
        return this.f3283a;
    }

    public final boolean b() {
        return this.f3284b;
    }

    public final o c() {
        return this.f3285c;
    }

    public final boolean d() {
        return this.f3286d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f3283a == gVar.f3283a && this.f3284b == gVar.f3284b && this.f3285c == gVar.f3285c && this.f3286d == gVar.f3286d;
        }
        return false;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f3283a) * 31) + Boolean.hashCode(this.f3284b)) * 31) + this.f3285c.hashCode()) * 31) + Boolean.hashCode(this.f3286d);
    }

    public /* synthetic */ g(boolean z11, boolean z12, o oVar, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? o.Inherit : oVar, (i11 & 8) != 0 ? true : z13);
    }

    public /* synthetic */ g(boolean z11, boolean z12, o oVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? o.Inherit : oVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(boolean z11, boolean z12, o securePolicy) {
        this(z11, z12, securePolicy, true);
        s.g(securePolicy, "securePolicy");
    }
}