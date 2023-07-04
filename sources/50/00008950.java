package n2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final h f40305a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40306b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40307c;

    /* renamed from: d  reason: collision with root package name */
    private int f40308d;

    /* renamed from: e  reason: collision with root package name */
    private int f40309e;

    /* renamed from: f  reason: collision with root package name */
    private float f40310f;

    /* renamed from: g  reason: collision with root package name */
    private float f40311g;

    public i(h paragraph, int i11, int i12, int i13, int i14, float f11, float f12) {
        kotlin.jvm.internal.s.g(paragraph, "paragraph");
        this.f40305a = paragraph;
        this.f40306b = i11;
        this.f40307c = i12;
        this.f40308d = i13;
        this.f40309e = i14;
        this.f40310f = f11;
        this.f40311g = f12;
    }

    public final float a() {
        return this.f40311g;
    }

    public final int b() {
        return this.f40307c;
    }

    public final int c() {
        return this.f40309e;
    }

    public final int d() {
        return this.f40307c - this.f40306b;
    }

    public final h e() {
        return this.f40305a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return kotlin.jvm.internal.s.c(this.f40305a, iVar.f40305a) && this.f40306b == iVar.f40306b && this.f40307c == iVar.f40307c && this.f40308d == iVar.f40308d && this.f40309e == iVar.f40309e && kotlin.jvm.internal.s.c(Float.valueOf(this.f40310f), Float.valueOf(iVar.f40310f)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f40311g), Float.valueOf(iVar.f40311g));
        }
        return false;
    }

    public final int f() {
        return this.f40306b;
    }

    public final int g() {
        return this.f40308d;
    }

    public final float h() {
        return this.f40310f;
    }

    public int hashCode() {
        return (((((((((((this.f40305a.hashCode() * 31) + Integer.hashCode(this.f40306b)) * 31) + Integer.hashCode(this.f40307c)) * 31) + Integer.hashCode(this.f40308d)) * 31) + Integer.hashCode(this.f40309e)) * 31) + Float.hashCode(this.f40310f)) * 31) + Float.hashCode(this.f40311g);
    }

    public final s1.h i(s1.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return hVar.r(s1.g.a(BitmapDescriptorFactory.HUE_RED, this.f40310f));
    }

    public final q0 j(q0 q0Var) {
        kotlin.jvm.internal.s.g(q0Var, "<this>");
        q0Var.i(s1.g.a(BitmapDescriptorFactory.HUE_RED, this.f40310f));
        return q0Var;
    }

    public final long k(long j11) {
        return z.b(l(y.n(j11)), l(y.i(j11)));
    }

    public final int l(int i11) {
        return i11 + this.f40306b;
    }

    public final int m(int i11) {
        return i11 + this.f40308d;
    }

    public final float n(float f11) {
        return f11 + this.f40310f;
    }

    public final long o(long j11) {
        return s1.g.a(s1.f.l(j11), s1.f.m(j11) - this.f40310f);
    }

    public final int p(int i11) {
        int m11;
        m11 = m00.l.m(i11, this.f40306b, this.f40307c);
        return m11 - this.f40306b;
    }

    public final int q(int i11) {
        return i11 - this.f40308d;
    }

    public final float r(float f11) {
        return f11 - this.f40310f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f40305a + ", startIndex=" + this.f40306b + ", endIndex=" + this.f40307c + ", startLineIndex=" + this.f40308d + ", endLineIndex=" + this.f40309e + ", top=" + this.f40310f + ", bottom=" + this.f40311g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}