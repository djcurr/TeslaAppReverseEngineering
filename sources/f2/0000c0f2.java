package y0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a */
    private final n2.a0 f58619a;

    /* renamed from: b */
    private final n2.a0 f58620b;

    /* renamed from: c */
    private final n2.a0 f58621c;

    /* renamed from: d */
    private final n2.a0 f58622d;

    /* renamed from: e */
    private final n2.a0 f58623e;

    /* renamed from: f */
    private final n2.a0 f58624f;

    /* renamed from: g */
    private final n2.a0 f58625g;

    /* renamed from: h */
    private final n2.a0 f58626h;

    /* renamed from: i */
    private final n2.a0 f58627i;

    /* renamed from: j */
    private final n2.a0 f58628j;

    /* renamed from: k */
    private final n2.a0 f58629k;

    /* renamed from: l */
    private final n2.a0 f58630l;

    /* renamed from: m */
    private final n2.a0 f58631m;

    public r1(n2.a0 h12, n2.a0 h22, n2.a0 h32, n2.a0 h42, n2.a0 h52, n2.a0 h62, n2.a0 subtitle1, n2.a0 subtitle2, n2.a0 body1, n2.a0 body2, n2.a0 button, n2.a0 caption, n2.a0 overline) {
        kotlin.jvm.internal.s.g(h12, "h1");
        kotlin.jvm.internal.s.g(h22, "h2");
        kotlin.jvm.internal.s.g(h32, "h3");
        kotlin.jvm.internal.s.g(h42, "h4");
        kotlin.jvm.internal.s.g(h52, "h5");
        kotlin.jvm.internal.s.g(h62, "h6");
        kotlin.jvm.internal.s.g(subtitle1, "subtitle1");
        kotlin.jvm.internal.s.g(subtitle2, "subtitle2");
        kotlin.jvm.internal.s.g(body1, "body1");
        kotlin.jvm.internal.s.g(body2, "body2");
        kotlin.jvm.internal.s.g(button, "button");
        kotlin.jvm.internal.s.g(caption, "caption");
        kotlin.jvm.internal.s.g(overline, "overline");
        this.f58619a = h12;
        this.f58620b = h22;
        this.f58621c = h32;
        this.f58622d = h42;
        this.f58623e = h52;
        this.f58624f = h62;
        this.f58625g = subtitle1;
        this.f58626h = subtitle2;
        this.f58627i = body1;
        this.f58628j = body2;
        this.f58629k = button;
        this.f58630l = caption;
        this.f58631m = overline;
    }

    public static /* synthetic */ r1 b(r1 r1Var, n2.a0 a0Var, n2.a0 a0Var2, n2.a0 a0Var3, n2.a0 a0Var4, n2.a0 a0Var5, n2.a0 a0Var6, n2.a0 a0Var7, n2.a0 a0Var8, n2.a0 a0Var9, n2.a0 a0Var10, n2.a0 a0Var11, n2.a0 a0Var12, n2.a0 a0Var13, int i11, Object obj) {
        return r1Var.a((i11 & 1) != 0 ? r1Var.f58619a : a0Var, (i11 & 2) != 0 ? r1Var.f58620b : a0Var2, (i11 & 4) != 0 ? r1Var.f58621c : a0Var3, (i11 & 8) != 0 ? r1Var.f58622d : a0Var4, (i11 & 16) != 0 ? r1Var.f58623e : a0Var5, (i11 & 32) != 0 ? r1Var.f58624f : a0Var6, (i11 & 64) != 0 ? r1Var.f58625g : a0Var7, (i11 & 128) != 0 ? r1Var.f58626h : a0Var8, (i11 & 256) != 0 ? r1Var.f58627i : a0Var9, (i11 & 512) != 0 ? r1Var.f58628j : a0Var10, (i11 & 1024) != 0 ? r1Var.f58629k : a0Var11, (i11 & 2048) != 0 ? r1Var.f58630l : a0Var12, (i11 & 4096) != 0 ? r1Var.f58631m : a0Var13);
    }

    public final r1 a(n2.a0 h12, n2.a0 h22, n2.a0 h32, n2.a0 h42, n2.a0 h52, n2.a0 h62, n2.a0 subtitle1, n2.a0 subtitle2, n2.a0 body1, n2.a0 body2, n2.a0 button, n2.a0 caption, n2.a0 overline) {
        kotlin.jvm.internal.s.g(h12, "h1");
        kotlin.jvm.internal.s.g(h22, "h2");
        kotlin.jvm.internal.s.g(h32, "h3");
        kotlin.jvm.internal.s.g(h42, "h4");
        kotlin.jvm.internal.s.g(h52, "h5");
        kotlin.jvm.internal.s.g(h62, "h6");
        kotlin.jvm.internal.s.g(subtitle1, "subtitle1");
        kotlin.jvm.internal.s.g(subtitle2, "subtitle2");
        kotlin.jvm.internal.s.g(body1, "body1");
        kotlin.jvm.internal.s.g(body2, "body2");
        kotlin.jvm.internal.s.g(button, "button");
        kotlin.jvm.internal.s.g(caption, "caption");
        kotlin.jvm.internal.s.g(overline, "overline");
        return new r1(h12, h22, h32, h42, h52, h62, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public final n2.a0 c() {
        return this.f58627i;
    }

    public final n2.a0 d() {
        return this.f58628j;
    }

    public final n2.a0 e() {
        return this.f58629k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            return kotlin.jvm.internal.s.c(this.f58619a, r1Var.f58619a) && kotlin.jvm.internal.s.c(this.f58620b, r1Var.f58620b) && kotlin.jvm.internal.s.c(this.f58621c, r1Var.f58621c) && kotlin.jvm.internal.s.c(this.f58622d, r1Var.f58622d) && kotlin.jvm.internal.s.c(this.f58623e, r1Var.f58623e) && kotlin.jvm.internal.s.c(this.f58624f, r1Var.f58624f) && kotlin.jvm.internal.s.c(this.f58625g, r1Var.f58625g) && kotlin.jvm.internal.s.c(this.f58626h, r1Var.f58626h) && kotlin.jvm.internal.s.c(this.f58627i, r1Var.f58627i) && kotlin.jvm.internal.s.c(this.f58628j, r1Var.f58628j) && kotlin.jvm.internal.s.c(this.f58629k, r1Var.f58629k) && kotlin.jvm.internal.s.c(this.f58630l, r1Var.f58630l) && kotlin.jvm.internal.s.c(this.f58631m, r1Var.f58631m);
        }
        return false;
    }

    public final n2.a0 f() {
        return this.f58630l;
    }

    public final n2.a0 g() {
        return this.f58620b;
    }

    public final n2.a0 h() {
        return this.f58622d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f58619a.hashCode() * 31) + this.f58620b.hashCode()) * 31) + this.f58621c.hashCode()) * 31) + this.f58622d.hashCode()) * 31) + this.f58623e.hashCode()) * 31) + this.f58624f.hashCode()) * 31) + this.f58625g.hashCode()) * 31) + this.f58626h.hashCode()) * 31) + this.f58627i.hashCode()) * 31) + this.f58628j.hashCode()) * 31) + this.f58629k.hashCode()) * 31) + this.f58630l.hashCode()) * 31) + this.f58631m.hashCode();
    }

    public final n2.a0 i() {
        return this.f58623e;
    }

    public final n2.a0 j() {
        return this.f58624f;
    }

    public final n2.a0 k() {
        return this.f58625g;
    }

    public String toString() {
        return "Typography(h1=" + this.f58619a + ", h2=" + this.f58620b + ", h3=" + this.f58621c + ", h4=" + this.f58622d + ", h5=" + this.f58623e + ", h6=" + this.f58624f + ", subtitle1=" + this.f58625g + ", subtitle2=" + this.f58626h + ", body1=" + this.f58627i + ", body2=" + this.f58628j + ", button=" + this.f58629k + ", caption=" + this.f58630l + ", overline=" + this.f58631m + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ r1(r2.e eVar, n2.a0 a0Var, n2.a0 a0Var2, n2.a0 a0Var3, n2.a0 a0Var4, n2.a0 a0Var5, n2.a0 a0Var6, n2.a0 a0Var7, n2.a0 a0Var8, n2.a0 a0Var9, n2.a0 a0Var10, n2.a0 a0Var11, n2.a0 a0Var12, n2.a0 a0Var13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? r2.e.f49078a.a() : eVar, (i11 & 2) != 0 ? new n2.a0(0L, x2.s.f(96), r2.l.f49091b.b(), null, null, null, null, x2.s.d(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var, (i11 & 4) != 0 ? new n2.a0(0L, x2.s.f(60), r2.l.f49091b.b(), null, null, null, null, x2.s.d(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var2, (i11 & 8) != 0 ? new n2.a0(0L, x2.s.f(48), r2.l.f49091b.d(), null, null, null, null, x2.s.f(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var3, (i11 & 16) != 0 ? new n2.a0(0L, x2.s.f(34), r2.l.f49091b.d(), null, null, null, null, x2.s.d(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var4, (i11 & 32) != 0 ? new n2.a0(0L, x2.s.f(24), r2.l.f49091b.d(), null, null, null, null, x2.s.f(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var5, (i11 & 64) != 0 ? new n2.a0(0L, x2.s.f(20), r2.l.f49091b.c(), null, null, null, null, x2.s.d(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var6, (i11 & 128) != 0 ? new n2.a0(0L, x2.s.f(16), r2.l.f49091b.d(), null, null, null, null, x2.s.d(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var7, (i11 & 256) != 0 ? new n2.a0(0L, x2.s.f(14), r2.l.f49091b.c(), null, null, null, null, x2.s.d(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var8, (i11 & 512) != 0 ? new n2.a0(0L, x2.s.f(16), r2.l.f49091b.d(), null, null, null, null, x2.s.d(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var9, (i11 & 1024) != 0 ? new n2.a0(0L, x2.s.f(14), r2.l.f49091b.d(), null, null, null, null, x2.s.d(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var10, (i11 & 2048) != 0 ? new n2.a0(0L, x2.s.f(14), r2.l.f49091b.c(), null, null, null, null, x2.s.d(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var11, (i11 & 4096) != 0 ? new n2.a0(0L, x2.s.f(12), r2.l.f49091b.d(), null, null, null, null, x2.s.d(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var12, (i11 & PKIFailureInfo.certRevoked) != 0 ? new n2.a0(0L, x2.s.f(10), r2.l.f49091b.d(), null, null, null, null, x2.s.d(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : a0Var13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r1(r2.e r2, n2.a0 r3, n2.a0 r4, n2.a0 r5, n2.a0 r6, n2.a0 r7, n2.a0 r8, n2.a0 r9, n2.a0 r10, n2.a0 r11, n2.a0 r12, n2.a0 r13, n2.a0 r14, n2.a0 r15) {
        /*
            r1 = this;
            java.lang.String r0 = "defaultFontFamily"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "h1"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "h2"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "h3"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "h4"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "h5"
            kotlin.jvm.internal.s.g(r7, r0)
            java.lang.String r0 = "h6"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "subtitle1"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "subtitle2"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "body1"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "body2"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "button"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "caption"
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "overline"
            kotlin.jvm.internal.s.g(r15, r0)
            n2.a0 r3 = y0.s1.a(r3, r2)
            n2.a0 r4 = y0.s1.a(r4, r2)
            n2.a0 r5 = y0.s1.a(r5, r2)
            n2.a0 r6 = y0.s1.a(r6, r2)
            n2.a0 r7 = y0.s1.a(r7, r2)
            n2.a0 r8 = y0.s1.a(r8, r2)
            n2.a0 r9 = y0.s1.a(r9, r2)
            n2.a0 r10 = y0.s1.a(r10, r2)
            n2.a0 r11 = y0.s1.a(r11, r2)
            n2.a0 r12 = y0.s1.a(r12, r2)
            n2.a0 r13 = y0.s1.a(r13, r2)
            n2.a0 r14 = y0.s1.a(r14, r2)
            n2.a0 r15 = y0.s1.a(r15, r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.r1.<init>(r2.e, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0, n2.a0):void");
    }
}