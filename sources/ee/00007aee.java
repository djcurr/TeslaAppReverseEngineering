package j10;

import ch.qos.logback.core.CoreConstants;
import f10.k;
import java.util.Set;
import k20.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import w00.s0;
import wz.w0;
import wz.y0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final k f33079a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33080b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33081c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<s0> f33082d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f33083e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(k howThisTypeIsUsed, b flexibility, boolean z11, Set<? extends s0> set, k0 k0Var) {
        s.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        s.g(flexibility, "flexibility");
        this.f33079a = howThisTypeIsUsed;
        this.f33080b = flexibility;
        this.f33081c = z11;
        this.f33082d = set;
        this.f33083e = k0Var;
    }

    public static /* synthetic */ a b(a aVar, k kVar, b bVar, boolean z11, Set set, k0 k0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = aVar.f33079a;
        }
        if ((i11 & 2) != 0) {
            bVar = aVar.f33080b;
        }
        b bVar2 = bVar;
        if ((i11 & 4) != 0) {
            z11 = aVar.f33081c;
        }
        boolean z12 = z11;
        Set<s0> set2 = set;
        if ((i11 & 8) != 0) {
            set2 = aVar.f33082d;
        }
        Set set3 = set2;
        if ((i11 & 16) != 0) {
            k0Var = aVar.f33083e;
        }
        return aVar.a(kVar, bVar2, z12, set3, k0Var);
    }

    public final a a(k howThisTypeIsUsed, b flexibility, boolean z11, Set<? extends s0> set, k0 k0Var) {
        s.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        s.g(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z11, set, k0Var);
    }

    public final k0 c() {
        return this.f33083e;
    }

    public final b d() {
        return this.f33080b;
    }

    public final k e() {
        return this.f33079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f33079a == aVar.f33079a && this.f33080b == aVar.f33080b && this.f33081c == aVar.f33081c && s.c(this.f33082d, aVar.f33082d) && s.c(this.f33083e, aVar.f33083e);
        }
        return false;
    }

    public final Set<s0> f() {
        return this.f33082d;
    }

    public final boolean g() {
        return this.f33081c;
    }

    public final a h(k0 k0Var) {
        return b(this, null, null, false, null, k0Var, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f33079a.hashCode() * 31) + this.f33080b.hashCode()) * 31;
        boolean z11 = this.f33081c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        Set<s0> set = this.f33082d;
        int hashCode2 = (i12 + (set == null ? 0 : set.hashCode())) * 31;
        k0 k0Var = this.f33083e;
        return hashCode2 + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final a i(b flexibility) {
        s.g(flexibility, "flexibility");
        return b(this, null, flexibility, false, null, null, 29, null);
    }

    public final a j(s0 typeParameter) {
        s.g(typeParameter, "typeParameter");
        Set<s0> set = this.f33082d;
        return b(this, null, null, false, set != null ? y0.n(set, typeParameter) : w0.c(typeParameter), null, 23, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f33079a + ", flexibility=" + this.f33080b + ", isForAnnotationParameter=" + this.f33081c + ", visitedTypeParameters=" + this.f33082d + ", defaultType=" + this.f33083e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a(k kVar, b bVar, boolean z11, Set set, k0 k0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i11 & 2) != 0 ? b.INFLEXIBLE : bVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : set, (i11 & 16) != 0 ? null : k0Var);
    }
}