package x1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f56710a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f56711b;

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56712c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56713d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56714e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f56715f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f56716g;

        /* renamed from: h  reason: collision with root package name */
        private final float f56717h;

        /* renamed from: i  reason: collision with root package name */
        private final float f56718i;

        public a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            super(false, false, 3, null);
            this.f56712c = f11;
            this.f56713d = f12;
            this.f56714e = f13;
            this.f56715f = z11;
            this.f56716g = z12;
            this.f56717h = f14;
            this.f56718i = f15;
        }

        public final float c() {
            return this.f56717h;
        }

        public final float d() {
            return this.f56718i;
        }

        public final float e() {
            return this.f56712c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56712c), Float.valueOf(aVar.f56712c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56713d), Float.valueOf(aVar.f56713d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56714e), Float.valueOf(aVar.f56714e)) && this.f56715f == aVar.f56715f && this.f56716g == aVar.f56716g && kotlin.jvm.internal.s.c(Float.valueOf(this.f56717h), Float.valueOf(aVar.f56717h)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56718i), Float.valueOf(aVar.f56718i));
            }
            return false;
        }

        public final float f() {
            return this.f56714e;
        }

        public final float g() {
            return this.f56713d;
        }

        public final boolean h() {
            return this.f56715f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f56712c) * 31) + Float.hashCode(this.f56713d)) * 31) + Float.hashCode(this.f56714e)) * 31;
            boolean z11 = this.f56715f;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            boolean z12 = this.f56716g;
            return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Float.hashCode(this.f56717h)) * 31) + Float.hashCode(this.f56718i);
        }

        public final boolean i() {
            return this.f56716g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f56712c + ", verticalEllipseRadius=" + this.f56713d + ", theta=" + this.f56714e + ", isMoreThanHalf=" + this.f56715f + ", isPositiveArc=" + this.f56716g + ", arcStartX=" + this.f56717h + ", arcStartY=" + this.f56718i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public static final b f56719c = new b();

        private b() {
            super(false, false, 3, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56720c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56721d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56722e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56723f;

        /* renamed from: g  reason: collision with root package name */
        private final float f56724g;

        /* renamed from: h  reason: collision with root package name */
        private final float f56725h;

        public c(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f56720c = f11;
            this.f56721d = f12;
            this.f56722e = f13;
            this.f56723f = f14;
            this.f56724g = f15;
            this.f56725h = f16;
        }

        public final float c() {
            return this.f56720c;
        }

        public final float d() {
            return this.f56722e;
        }

        public final float e() {
            return this.f56724g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56720c), Float.valueOf(cVar.f56720c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56721d), Float.valueOf(cVar.f56721d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56722e), Float.valueOf(cVar.f56722e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56723f), Float.valueOf(cVar.f56723f)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56724g), Float.valueOf(cVar.f56724g)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56725h), Float.valueOf(cVar.f56725h));
            }
            return false;
        }

        public final float f() {
            return this.f56721d;
        }

        public final float g() {
            return this.f56723f;
        }

        public final float h() {
            return this.f56725h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f56720c) * 31) + Float.hashCode(this.f56721d)) * 31) + Float.hashCode(this.f56722e)) * 31) + Float.hashCode(this.f56723f)) * 31) + Float.hashCode(this.f56724g)) * 31) + Float.hashCode(this.f56725h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f56720c + ", y1=" + this.f56721d + ", x2=" + this.f56722e + ", y2=" + this.f56723f + ", x3=" + this.f56724g + ", y3=" + this.f56725h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56726c;

        public d(float f11) {
            super(false, false, 3, null);
            this.f56726c = f11;
        }

        public final float c() {
            return this.f56726c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56726c), Float.valueOf(((d) obj).f56726c));
        }

        public int hashCode() {
            return Float.hashCode(this.f56726c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f56726c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56727c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56728d;

        public e(float f11, float f12) {
            super(false, false, 3, null);
            this.f56727c = f11;
            this.f56728d = f12;
        }

        public final float c() {
            return this.f56727c;
        }

        public final float d() {
            return this.f56728d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56727c), Float.valueOf(eVar.f56727c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56728d), Float.valueOf(eVar.f56728d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56727c) * 31) + Float.hashCode(this.f56728d);
        }

        public String toString() {
            return "LineTo(x=" + this.f56727c + ", y=" + this.f56728d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: x1.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1297f extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56729c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56730d;

        public C1297f(float f11, float f12) {
            super(false, false, 3, null);
            this.f56729c = f11;
            this.f56730d = f12;
        }

        public final float c() {
            return this.f56729c;
        }

        public final float d() {
            return this.f56730d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1297f) {
                C1297f c1297f = (C1297f) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56729c), Float.valueOf(c1297f.f56729c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56730d), Float.valueOf(c1297f.f56730d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56729c) * 31) + Float.hashCode(this.f56730d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f56729c + ", y=" + this.f56730d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56731c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56732d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56733e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56734f;

        public g(float f11, float f12, float f13, float f14) {
            super(false, true, 1, null);
            this.f56731c = f11;
            this.f56732d = f12;
            this.f56733e = f13;
            this.f56734f = f14;
        }

        public final float c() {
            return this.f56731c;
        }

        public final float d() {
            return this.f56733e;
        }

        public final float e() {
            return this.f56732d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56731c), Float.valueOf(gVar.f56731c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56732d), Float.valueOf(gVar.f56732d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56733e), Float.valueOf(gVar.f56733e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56734f), Float.valueOf(gVar.f56734f));
            }
            return false;
        }

        public final float f() {
            return this.f56734f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f56731c) * 31) + Float.hashCode(this.f56732d)) * 31) + Float.hashCode(this.f56733e)) * 31) + Float.hashCode(this.f56734f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f56731c + ", y1=" + this.f56732d + ", x2=" + this.f56733e + ", y2=" + this.f56734f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56735c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56736d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56737e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56738f;

        public h(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f56735c = f11;
            this.f56736d = f12;
            this.f56737e = f13;
            this.f56738f = f14;
        }

        public final float c() {
            return this.f56735c;
        }

        public final float d() {
            return this.f56737e;
        }

        public final float e() {
            return this.f56736d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56735c), Float.valueOf(hVar.f56735c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56736d), Float.valueOf(hVar.f56736d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56737e), Float.valueOf(hVar.f56737e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56738f), Float.valueOf(hVar.f56738f));
            }
            return false;
        }

        public final float f() {
            return this.f56738f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f56735c) * 31) + Float.hashCode(this.f56736d)) * 31) + Float.hashCode(this.f56737e)) * 31) + Float.hashCode(this.f56738f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f56735c + ", y1=" + this.f56736d + ", x2=" + this.f56737e + ", y2=" + this.f56738f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56739c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56740d;

        public i(float f11, float f12) {
            super(false, true, 1, null);
            this.f56739c = f11;
            this.f56740d = f12;
        }

        public final float c() {
            return this.f56739c;
        }

        public final float d() {
            return this.f56740d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56739c), Float.valueOf(iVar.f56739c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56740d), Float.valueOf(iVar.f56740d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56739c) * 31) + Float.hashCode(this.f56740d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f56739c + ", y=" + this.f56740d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56741c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56742d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56743e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f56744f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f56745g;

        /* renamed from: h  reason: collision with root package name */
        private final float f56746h;

        /* renamed from: i  reason: collision with root package name */
        private final float f56747i;

        public j(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            super(false, false, 3, null);
            this.f56741c = f11;
            this.f56742d = f12;
            this.f56743e = f13;
            this.f56744f = z11;
            this.f56745g = z12;
            this.f56746h = f14;
            this.f56747i = f15;
        }

        public final float c() {
            return this.f56746h;
        }

        public final float d() {
            return this.f56747i;
        }

        public final float e() {
            return this.f56741c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56741c), Float.valueOf(jVar.f56741c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56742d), Float.valueOf(jVar.f56742d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56743e), Float.valueOf(jVar.f56743e)) && this.f56744f == jVar.f56744f && this.f56745g == jVar.f56745g && kotlin.jvm.internal.s.c(Float.valueOf(this.f56746h), Float.valueOf(jVar.f56746h)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56747i), Float.valueOf(jVar.f56747i));
            }
            return false;
        }

        public final float f() {
            return this.f56743e;
        }

        public final float g() {
            return this.f56742d;
        }

        public final boolean h() {
            return this.f56744f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f56741c) * 31) + Float.hashCode(this.f56742d)) * 31) + Float.hashCode(this.f56743e)) * 31;
            boolean z11 = this.f56744f;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            boolean z12 = this.f56745g;
            return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Float.hashCode(this.f56746h)) * 31) + Float.hashCode(this.f56747i);
        }

        public final boolean i() {
            return this.f56745g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f56741c + ", verticalEllipseRadius=" + this.f56742d + ", theta=" + this.f56743e + ", isMoreThanHalf=" + this.f56744f + ", isPositiveArc=" + this.f56745g + ", arcStartDx=" + this.f56746h + ", arcStartDy=" + this.f56747i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56748c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56749d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56750e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56751f;

        /* renamed from: g  reason: collision with root package name */
        private final float f56752g;

        /* renamed from: h  reason: collision with root package name */
        private final float f56753h;

        public k(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f56748c = f11;
            this.f56749d = f12;
            this.f56750e = f13;
            this.f56751f = f14;
            this.f56752g = f15;
            this.f56753h = f16;
        }

        public final float c() {
            return this.f56748c;
        }

        public final float d() {
            return this.f56750e;
        }

        public final float e() {
            return this.f56752g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56748c), Float.valueOf(kVar.f56748c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56749d), Float.valueOf(kVar.f56749d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56750e), Float.valueOf(kVar.f56750e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56751f), Float.valueOf(kVar.f56751f)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56752g), Float.valueOf(kVar.f56752g)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56753h), Float.valueOf(kVar.f56753h));
            }
            return false;
        }

        public final float f() {
            return this.f56749d;
        }

        public final float g() {
            return this.f56751f;
        }

        public final float h() {
            return this.f56753h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f56748c) * 31) + Float.hashCode(this.f56749d)) * 31) + Float.hashCode(this.f56750e)) * 31) + Float.hashCode(this.f56751f)) * 31) + Float.hashCode(this.f56752g)) * 31) + Float.hashCode(this.f56753h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f56748c + ", dy1=" + this.f56749d + ", dx2=" + this.f56750e + ", dy2=" + this.f56751f + ", dx3=" + this.f56752g + ", dy3=" + this.f56753h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56754c;

        public l(float f11) {
            super(false, false, 3, null);
            this.f56754c = f11;
        }

        public final float c() {
            return this.f56754c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56754c), Float.valueOf(((l) obj).f56754c));
        }

        public int hashCode() {
            return Float.hashCode(this.f56754c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f56754c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56755c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56756d;

        public m(float f11, float f12) {
            super(false, false, 3, null);
            this.f56755c = f11;
            this.f56756d = f12;
        }

        public final float c() {
            return this.f56755c;
        }

        public final float d() {
            return this.f56756d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56755c), Float.valueOf(mVar.f56755c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56756d), Float.valueOf(mVar.f56756d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56755c) * 31) + Float.hashCode(this.f56756d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f56755c + ", dy=" + this.f56756d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56757c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56758d;

        public n(float f11, float f12) {
            super(false, false, 3, null);
            this.f56757c = f11;
            this.f56758d = f12;
        }

        public final float c() {
            return this.f56757c;
        }

        public final float d() {
            return this.f56758d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56757c), Float.valueOf(nVar.f56757c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56758d), Float.valueOf(nVar.f56758d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56757c) * 31) + Float.hashCode(this.f56758d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f56757c + ", dy=" + this.f56758d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56759c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56760d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56761e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56762f;

        public o(float f11, float f12, float f13, float f14) {
            super(false, true, 1, null);
            this.f56759c = f11;
            this.f56760d = f12;
            this.f56761e = f13;
            this.f56762f = f14;
        }

        public final float c() {
            return this.f56759c;
        }

        public final float d() {
            return this.f56761e;
        }

        public final float e() {
            return this.f56760d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56759c), Float.valueOf(oVar.f56759c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56760d), Float.valueOf(oVar.f56760d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56761e), Float.valueOf(oVar.f56761e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56762f), Float.valueOf(oVar.f56762f));
            }
            return false;
        }

        public final float f() {
            return this.f56762f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f56759c) * 31) + Float.hashCode(this.f56760d)) * 31) + Float.hashCode(this.f56761e)) * 31) + Float.hashCode(this.f56762f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f56759c + ", dy1=" + this.f56760d + ", dx2=" + this.f56761e + ", dy2=" + this.f56762f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56763c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56764d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56765e;

        /* renamed from: f  reason: collision with root package name */
        private final float f56766f;

        public p(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f56763c = f11;
            this.f56764d = f12;
            this.f56765e = f13;
            this.f56766f = f14;
        }

        public final float c() {
            return this.f56763c;
        }

        public final float d() {
            return this.f56765e;
        }

        public final float e() {
            return this.f56764d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56763c), Float.valueOf(pVar.f56763c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56764d), Float.valueOf(pVar.f56764d)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56765e), Float.valueOf(pVar.f56765e)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56766f), Float.valueOf(pVar.f56766f));
            }
            return false;
        }

        public final float f() {
            return this.f56766f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f56763c) * 31) + Float.hashCode(this.f56764d)) * 31) + Float.hashCode(this.f56765e)) * 31) + Float.hashCode(this.f56766f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f56763c + ", dy1=" + this.f56764d + ", dx2=" + this.f56765e + ", dy2=" + this.f56766f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56767c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56768d;

        public q(float f11, float f12) {
            super(false, true, 1, null);
            this.f56767c = f11;
            this.f56768d = f12;
        }

        public final float c() {
            return this.f56767c;
        }

        public final float d() {
            return this.f56768d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56767c), Float.valueOf(qVar.f56767c)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56768d), Float.valueOf(qVar.f56768d));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56767c) * 31) + Float.hashCode(this.f56768d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f56767c + ", dy=" + this.f56768d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56769c;

        public r(float f11) {
            super(false, false, 3, null);
            this.f56769c = f11;
        }

        public final float c() {
            return this.f56769c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56769c), Float.valueOf(((r) obj).f56769c));
        }

        public int hashCode() {
            return Float.hashCode(this.f56769c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f56769c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends f {

        /* renamed from: c  reason: collision with root package name */
        private final float f56770c;

        public s(float f11) {
            super(false, false, 3, null);
            this.f56770c = f11;
        }

        public final float c() {
            return this.f56770c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56770c), Float.valueOf(((s) obj).f56770c));
        }

        public int hashCode() {
            return Float.hashCode(this.f56770c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f56770c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private f(boolean z11, boolean z12) {
        this.f56710a = z11;
        this.f56711b = z12;
    }

    public /* synthetic */ f(boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12);
    }

    public final boolean a() {
        return this.f56710a;
    }

    public final boolean b() {
        return this.f56711b;
    }

    public /* synthetic */ f(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, null);
    }
}