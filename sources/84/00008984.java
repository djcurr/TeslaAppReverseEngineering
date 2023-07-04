package n2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n2.a;
import r2.d;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final a f40400a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f40401b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a.b<p>> f40402c;

    /* renamed from: d  reason: collision with root package name */
    private final int f40403d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f40404e;

    /* renamed from: f  reason: collision with root package name */
    private final int f40405f;

    /* renamed from: g  reason: collision with root package name */
    private final x2.d f40406g;

    /* renamed from: h  reason: collision with root package name */
    private final x2.q f40407h;

    /* renamed from: i  reason: collision with root package name */
    private final d.a f40408i;

    /* renamed from: j  reason: collision with root package name */
    private final long f40409j;

    private v(a aVar, a0 a0Var, List<a.b<p>> list, int i11, boolean z11, int i12, x2.d dVar, x2.q qVar, d.a aVar2, long j11) {
        this.f40400a = aVar;
        this.f40401b = a0Var;
        this.f40402c = list;
        this.f40403d = i11;
        this.f40404e = z11;
        this.f40405f = i12;
        this.f40406g = dVar;
        this.f40407h = qVar;
        this.f40408i = aVar2;
        this.f40409j = j11;
    }

    public /* synthetic */ v(a aVar, a0 a0Var, List list, int i11, boolean z11, int i12, x2.d dVar, x2.q qVar, d.a aVar2, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, a0Var, list, i11, z11, i12, dVar, qVar, aVar2, j11);
    }

    public final v a(a text, a0 style, List<a.b<p>> placeholders, int i11, boolean z11, int i12, x2.d density, x2.q layoutDirection, d.a resourceLoader, long j11) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        return new v(text, style, placeholders, i11, z11, i12, density, layoutDirection, resourceLoader, j11, null);
    }

    public final long c() {
        return this.f40409j;
    }

    public final x2.d d() {
        return this.f40406g;
    }

    public final x2.q e() {
        return this.f40407h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return kotlin.jvm.internal.s.c(this.f40400a, vVar.f40400a) && kotlin.jvm.internal.s.c(this.f40401b, vVar.f40401b) && kotlin.jvm.internal.s.c(this.f40402c, vVar.f40402c) && this.f40403d == vVar.f40403d && this.f40404e == vVar.f40404e && w2.k.d(g(), vVar.g()) && kotlin.jvm.internal.s.c(this.f40406g, vVar.f40406g) && this.f40407h == vVar.f40407h && kotlin.jvm.internal.s.c(this.f40408i, vVar.f40408i) && x2.b.g(c(), vVar.c());
        }
        return false;
    }

    public final int f() {
        return this.f40403d;
    }

    public final int g() {
        return this.f40405f;
    }

    public final List<a.b<p>> h() {
        return this.f40402c;
    }

    public int hashCode() {
        return (((((((((((((((((this.f40400a.hashCode() * 31) + this.f40401b.hashCode()) * 31) + this.f40402c.hashCode()) * 31) + this.f40403d) * 31) + Boolean.hashCode(this.f40404e)) * 31) + w2.k.e(g())) * 31) + this.f40406g.hashCode()) * 31) + this.f40407h.hashCode()) * 31) + this.f40408i.hashCode()) * 31) + x2.b.q(c());
    }

    public final d.a i() {
        return this.f40408i;
    }

    public final boolean j() {
        return this.f40404e;
    }

    public final a0 k() {
        return this.f40401b;
    }

    public final a l() {
        return this.f40400a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f40400a) + ", style=" + this.f40401b + ", placeholders=" + this.f40402c + ", maxLines=" + this.f40403d + ", softWrap=" + this.f40404e + ", overflow=" + ((Object) w2.k.f(g())) + ", density=" + this.f40406g + ", layoutDirection=" + this.f40407h + ", resourceLoader=" + this.f40408i + ", constraints=" + ((Object) x2.b.r(c())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}