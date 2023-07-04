package p0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    private final float f45426a;

    /* renamed from: b  reason: collision with root package name */
    private final float f45427b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45428c;

    /* renamed from: d  reason: collision with root package name */
    private final float f45429d;

    private x(float f11, float f12, float f13, float f14) {
        this.f45426a = f11;
        this.f45427b = f12;
        this.f45428c = f13;
        this.f45429d = f14;
    }

    public /* synthetic */ x(float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14);
    }

    @Override // p0.w
    public float a() {
        return e();
    }

    @Override // p0.w
    public float b(x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        return layoutDirection == x2.q.Ltr ? f() : g();
    }

    @Override // p0.w
    public float c(x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        return layoutDirection == x2.q.Ltr ? g() : f();
    }

    @Override // p0.w
    public float d() {
        return h();
    }

    public final float e() {
        return this.f45429d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            return x2.g.h(g(), xVar.g()) && x2.g.h(h(), xVar.h()) && x2.g.h(f(), xVar.f()) && x2.g.h(e(), xVar.e());
        }
        return false;
    }

    public final float f() {
        return this.f45428c;
    }

    public final float g() {
        return this.f45426a;
    }

    public final float h() {
        return this.f45427b;
    }

    public int hashCode() {
        return (((((x2.g.i(g()) * 31) + x2.g.i(h())) * 31) + x2.g.i(f())) * 31) + x2.g.i(e());
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) x2.g.k(g())) + ", top=" + ((Object) x2.g.k(h())) + ", end=" + ((Object) x2.g.k(f())) + ", bottom=" + ((Object) x2.g.k(e())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}