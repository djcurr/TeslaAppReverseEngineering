package b6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import b6.h;
import b6.j;
import c6.i;
import ch.qos.logback.core.CoreConstants;
import coil.target.ImageViewTarget;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.Headers;
import v20.j0;
import vz.p;
import wz.w;

/* loaded from: classes.dex */
public final class g {
    private final Integer A;
    private final Drawable B;
    private final Integer C;
    private final Drawable D;
    private final c E;
    private final b6.b F;

    /* renamed from: a */
    private final Context f7442a;

    /* renamed from: b */
    private final Object f7443b;

    /* renamed from: c */
    private final d6.b f7444c;

    /* renamed from: d */
    private final b f7445d;

    /* renamed from: e */
    private final z5.l f7446e;

    /* renamed from: f */
    private final z5.l f7447f;

    /* renamed from: g */
    private final ColorSpace f7448g;

    /* renamed from: h */
    private final p<w5.g<?>, Class<?>> f7449h;

    /* renamed from: i */
    private final v5.f f7450i;

    /* renamed from: j */
    private final List<e6.a> f7451j;

    /* renamed from: k */
    private final Headers f7452k;

    /* renamed from: l */
    private final j f7453l;

    /* renamed from: m */
    private final androidx.lifecycle.p f7454m;

    /* renamed from: n */
    private final c6.h f7455n;

    /* renamed from: o */
    private final c6.f f7456o;

    /* renamed from: p */
    private final j0 f7457p;

    /* renamed from: q */
    private final f6.b f7458q;

    /* renamed from: r */
    private final c6.d f7459r;

    /* renamed from: s */
    private final Bitmap.Config f7460s;

    /* renamed from: t */
    private final boolean f7461t;

    /* renamed from: u */
    private final boolean f7462u;

    /* renamed from: v */
    private final coil.request.a f7463v;

    /* renamed from: w */
    private final coil.request.a f7464w;

    /* renamed from: x */
    private final coil.request.a f7465x;

    /* renamed from: y */
    private final Integer f7466y;

    /* renamed from: z */
    private final Drawable f7467z;

    /* loaded from: classes.dex */
    public interface b {
        void a(g gVar, h.a aVar);

        void b(g gVar);

        void c(g gVar, Throwable th2);

        void d(g gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g(Context context, Object obj, d6.b bVar, b bVar2, z5.l lVar, z5.l lVar2, ColorSpace colorSpace, p<? extends w5.g<?>, ? extends Class<?>> pVar, v5.f fVar, List<? extends e6.a> list, Headers headers, j jVar, androidx.lifecycle.p pVar2, c6.h hVar, c6.f fVar2, j0 j0Var, f6.b bVar3, c6.d dVar, Bitmap.Config config, boolean z11, boolean z12, coil.request.a aVar, coil.request.a aVar2, coil.request.a aVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, b6.b bVar4) {
        this.f7442a = context;
        this.f7443b = obj;
        this.f7444c = bVar;
        this.f7445d = bVar2;
        this.f7446e = lVar;
        this.f7447f = lVar2;
        this.f7448g = colorSpace;
        this.f7449h = pVar;
        this.f7450i = fVar;
        this.f7451j = list;
        this.f7452k = headers;
        this.f7453l = jVar;
        this.f7454m = pVar2;
        this.f7455n = hVar;
        this.f7456o = fVar2;
        this.f7457p = j0Var;
        this.f7458q = bVar3;
        this.f7459r = dVar;
        this.f7460s = config;
        this.f7461t = z11;
        this.f7462u = z12;
        this.f7463v = aVar;
        this.f7464w = aVar2;
        this.f7465x = aVar3;
        this.f7466y = num;
        this.f7467z = drawable;
        this.A = num2;
        this.B = drawable2;
        this.C = num3;
        this.D = drawable3;
        this.E = cVar;
        this.F = bVar4;
    }

    public static /* synthetic */ a K(g gVar, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = gVar.f7442a;
        }
        return gVar.J(context);
    }

    public final j A() {
        return this.f7453l;
    }

    public final Drawable B() {
        return g6.h.c(this, this.f7467z, this.f7466y, this.F.j());
    }

    public final z5.l C() {
        return this.f7447f;
    }

    public final c6.d D() {
        return this.f7459r;
    }

    public final c6.f E() {
        return this.f7456o;
    }

    public final c6.h F() {
        return this.f7455n;
    }

    public final d6.b G() {
        return this.f7444c;
    }

    public final List<e6.a> H() {
        return this.f7451j;
    }

    public final f6.b I() {
        return this.f7458q;
    }

    public final a J(Context context) {
        s.g(context, "context");
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (s.c(this.f7442a, gVar.f7442a) && s.c(this.f7443b, gVar.f7443b) && s.c(this.f7444c, gVar.f7444c) && s.c(this.f7445d, gVar.f7445d) && s.c(this.f7446e, gVar.f7446e) && s.c(this.f7447f, gVar.f7447f) && s.c(this.f7448g, gVar.f7448g) && s.c(this.f7449h, gVar.f7449h) && s.c(this.f7450i, gVar.f7450i) && s.c(this.f7451j, gVar.f7451j) && s.c(this.f7452k, gVar.f7452k) && s.c(this.f7453l, gVar.f7453l) && s.c(this.f7454m, gVar.f7454m) && s.c(this.f7455n, gVar.f7455n) && this.f7456o == gVar.f7456o && s.c(this.f7457p, gVar.f7457p) && s.c(this.f7458q, gVar.f7458q) && this.f7459r == gVar.f7459r && this.f7460s == gVar.f7460s && this.f7461t == gVar.f7461t && this.f7462u == gVar.f7462u && this.f7463v == gVar.f7463v && this.f7464w == gVar.f7464w && this.f7465x == gVar.f7465x && s.c(this.f7466y, gVar.f7466y) && s.c(this.f7467z, gVar.f7467z) && s.c(this.A, gVar.A) && s.c(this.B, gVar.B) && s.c(this.C, gVar.C) && s.c(this.D, gVar.D) && s.c(this.E, gVar.E) && s.c(this.F, gVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.f7461t;
    }

    public final boolean h() {
        return this.f7462u;
    }

    public int hashCode() {
        int hashCode = ((this.f7442a.hashCode() * 31) + this.f7443b.hashCode()) * 31;
        d6.b bVar = this.f7444c;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f7445d;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        z5.l lVar = this.f7446e;
        int hashCode4 = (hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        z5.l lVar2 = this.f7447f;
        int hashCode5 = (hashCode4 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.f7448g;
        int hashCode6 = (hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31;
        p<w5.g<?>, Class<?>> pVar = this.f7449h;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        v5.f fVar = this.f7450i;
        int hashCode8 = (((((((((((((((((((((((((((((((hashCode7 + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f7451j.hashCode()) * 31) + this.f7452k.hashCode()) * 31) + this.f7453l.hashCode()) * 31) + this.f7454m.hashCode()) * 31) + this.f7455n.hashCode()) * 31) + this.f7456o.hashCode()) * 31) + this.f7457p.hashCode()) * 31) + this.f7458q.hashCode()) * 31) + this.f7459r.hashCode()) * 31) + this.f7460s.hashCode()) * 31) + Boolean.hashCode(this.f7461t)) * 31) + Boolean.hashCode(this.f7462u)) * 31) + this.f7463v.hashCode()) * 31) + this.f7464w.hashCode()) * 31) + this.f7465x.hashCode()) * 31;
        Integer num = this.f7466y;
        int intValue = (hashCode8 + (num != null ? num.intValue() : 0)) * 31;
        Drawable drawable = this.f7467z;
        int hashCode9 = (intValue + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.A;
        int intValue2 = (hashCode9 + (num2 != null ? num2.intValue() : 0)) * 31;
        Drawable drawable2 = this.B;
        int hashCode10 = (intValue2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.C;
        int intValue3 = (hashCode10 + (num3 != null ? num3.intValue() : 0)) * 31;
        Drawable drawable3 = this.D;
        return ((((intValue3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode();
    }

    public final Bitmap.Config i() {
        return this.f7460s;
    }

    public final ColorSpace j() {
        return this.f7448g;
    }

    public final Context k() {
        return this.f7442a;
    }

    public final Object l() {
        return this.f7443b;
    }

    public final v5.f m() {
        return this.f7450i;
    }

    public final b6.b n() {
        return this.F;
    }

    public final c o() {
        return this.E;
    }

    public final coil.request.a p() {
        return this.f7464w;
    }

    public final j0 q() {
        return this.f7457p;
    }

    public final Drawable r() {
        return g6.h.c(this, this.B, this.A, this.F.f());
    }

    public final Drawable s() {
        return g6.h.c(this, this.D, this.C, this.F.g());
    }

    public final p<w5.g<?>, Class<?>> t() {
        return this.f7449h;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f7442a + ", data=" + this.f7443b + ", target=" + this.f7444c + ", listener=" + this.f7445d + ", memoryCacheKey=" + this.f7446e + ", placeholderMemoryCacheKey=" + this.f7447f + ", colorSpace=" + this.f7448g + ", fetcher=" + this.f7449h + ", decoder=" + this.f7450i + ", transformations=" + this.f7451j + ", headers=" + this.f7452k + ", parameters=" + this.f7453l + ", lifecycle=" + this.f7454m + ", sizeResolver=" + this.f7455n + ", scale=" + this.f7456o + ", dispatcher=" + this.f7457p + ", transition=" + this.f7458q + ", precision=" + this.f7459r + ", bitmapConfig=" + this.f7460s + ", allowHardware=" + this.f7461t + ", allowRgb565=" + this.f7462u + ", memoryCachePolicy=" + this.f7463v + ", diskCachePolicy=" + this.f7464w + ", networkCachePolicy=" + this.f7465x + ", placeholderResId=" + this.f7466y + ", placeholderDrawable=" + this.f7467z + ", errorResId=" + this.A + ", errorDrawable=" + this.B + ", fallbackResId=" + this.C + ", fallbackDrawable=" + this.D + ", defined=" + this.E + ", defaults=" + this.F + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final Headers u() {
        return this.f7452k;
    }

    public final androidx.lifecycle.p v() {
        return this.f7454m;
    }

    public final b w() {
        return this.f7445d;
    }

    public final z5.l x() {
        return this.f7446e;
    }

    public final coil.request.a y() {
        return this.f7463v;
    }

    public final coil.request.a z() {
        return this.f7465x;
    }

    public /* synthetic */ g(Context context, Object obj, d6.b bVar, b bVar2, z5.l lVar, z5.l lVar2, ColorSpace colorSpace, p pVar, v5.f fVar, List list, Headers headers, j jVar, androidx.lifecycle.p pVar2, c6.h hVar, c6.f fVar2, j0 j0Var, f6.b bVar3, c6.d dVar, Bitmap.Config config, boolean z11, boolean z12, coil.request.a aVar, coil.request.a aVar2, coil.request.a aVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, b6.b bVar4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, bVar, bVar2, lVar, lVar2, colorSpace, pVar, fVar, list, headers, jVar, pVar2, hVar, fVar2, j0Var, bVar3, dVar, config, z11, z12, aVar, aVar2, aVar3, num, drawable, num2, drawable2, num3, drawable3, cVar, bVar4);
    }

    /* loaded from: classes.dex */
    public static final class a {
        private Drawable A;
        private Integer B;
        private Drawable C;
        private Integer D;
        private Drawable E;
        private androidx.lifecycle.p F;
        private c6.h G;
        private c6.f H;

        /* renamed from: a */
        private final Context f7468a;

        /* renamed from: b */
        private b6.b f7469b;

        /* renamed from: c */
        private Object f7470c;

        /* renamed from: d */
        private d6.b f7471d;

        /* renamed from: e */
        private b f7472e;

        /* renamed from: f */
        private z5.l f7473f;

        /* renamed from: g */
        private z5.l f7474g;

        /* renamed from: h */
        private ColorSpace f7475h;

        /* renamed from: i */
        private p<? extends w5.g<?>, ? extends Class<?>> f7476i;

        /* renamed from: j */
        private v5.f f7477j;

        /* renamed from: k */
        private List<? extends e6.a> f7478k;

        /* renamed from: l */
        private Headers.Builder f7479l;

        /* renamed from: m */
        private j.a f7480m;

        /* renamed from: n */
        private androidx.lifecycle.p f7481n;

        /* renamed from: o */
        private c6.h f7482o;

        /* renamed from: p */
        private c6.f f7483p;

        /* renamed from: q */
        private j0 f7484q;

        /* renamed from: r */
        private f6.b f7485r;

        /* renamed from: s */
        private c6.d f7486s;

        /* renamed from: t */
        private Bitmap.Config f7487t;

        /* renamed from: u */
        private Boolean f7488u;

        /* renamed from: v */
        private Boolean f7489v;

        /* renamed from: w */
        private coil.request.a f7490w;

        /* renamed from: x */
        private coil.request.a f7491x;

        /* renamed from: y */
        private coil.request.a f7492y;

        /* renamed from: z */
        private Integer f7493z;

        public a(Context context) {
            List<? extends e6.a> i11;
            s.g(context, "context");
            this.f7468a = context;
            this.f7469b = b6.b.f7411m;
            this.f7470c = null;
            this.f7471d = null;
            this.f7472e = null;
            this.f7473f = null;
            this.f7474g = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7475h = null;
            }
            this.f7476i = null;
            this.f7477j = null;
            i11 = w.i();
            this.f7478k = i11;
            this.f7479l = null;
            this.f7480m = null;
            this.f7481n = null;
            this.f7482o = null;
            this.f7483p = null;
            this.f7484q = null;
            this.f7485r = null;
            this.f7486s = null;
            this.f7487t = null;
            this.f7488u = null;
            this.f7489v = null;
            this.f7490w = null;
            this.f7491x = null;
            this.f7492y = null;
            this.f7493z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
        }

        private final void d() {
            this.H = null;
        }

        private final void e() {
            this.F = null;
            this.G = null;
            this.H = null;
        }

        private final androidx.lifecycle.p f() {
            d6.b bVar = this.f7471d;
            androidx.lifecycle.p c11 = g6.c.c(bVar instanceof d6.c ? ((d6.c) bVar).getView().getContext() : this.f7468a);
            return c11 != null ? c11 : f.f7440c;
        }

        private final c6.f g() {
            c6.h hVar = this.f7482o;
            if (hVar instanceof c6.i) {
                View view = ((c6.i) hVar).getView();
                if (view instanceof ImageView) {
                    return g6.e.h((ImageView) view);
                }
            }
            d6.b bVar = this.f7471d;
            if (bVar instanceof d6.c) {
                View view2 = ((d6.c) bVar).getView();
                if (view2 instanceof ImageView) {
                    return g6.e.h((ImageView) view2);
                }
            }
            return c6.f.FILL;
        }

        private final c6.h h() {
            d6.b bVar = this.f7471d;
            return bVar instanceof d6.c ? i.a.b(c6.i.f8895a, ((d6.c) bVar).getView(), false, 2, null) : new c6.a(this.f7468a);
        }

        public final g a() {
            Context context = this.f7468a;
            Object obj = this.f7470c;
            if (obj == null) {
                obj = i.f7498a;
            }
            Object obj2 = obj;
            d6.b bVar = this.f7471d;
            b bVar2 = this.f7472e;
            z5.l lVar = this.f7473f;
            z5.l lVar2 = this.f7474g;
            ColorSpace colorSpace = this.f7475h;
            p<? extends w5.g<?>, ? extends Class<?>> pVar = this.f7476i;
            v5.f fVar = this.f7477j;
            List<? extends e6.a> list = this.f7478k;
            Headers.Builder builder = this.f7479l;
            Headers n11 = g6.e.n(builder != null ? builder.build() : null);
            s.f(n11, "headers?.build().orEmpty()");
            j.a aVar = this.f7480m;
            j m11 = g6.e.m(aVar != null ? aVar.a() : null);
            androidx.lifecycle.p pVar2 = this.f7481n;
            if (pVar2 == null) {
                pVar2 = this.F;
            }
            if (pVar2 == null) {
                pVar2 = f();
            }
            androidx.lifecycle.p pVar3 = pVar2;
            c6.h hVar = this.f7482o;
            if (hVar == null) {
                hVar = this.G;
            }
            if (hVar == null) {
                hVar = h();
            }
            c6.h hVar2 = hVar;
            c6.f fVar2 = this.f7483p;
            if (fVar2 == null) {
                fVar2 = this.H;
            }
            if (fVar2 == null) {
                fVar2 = g();
            }
            c6.f fVar3 = fVar2;
            j0 j0Var = this.f7484q;
            if (j0Var == null) {
                j0Var = this.f7469b.e();
            }
            j0 j0Var2 = j0Var;
            f6.b bVar3 = this.f7485r;
            if (bVar3 == null) {
                bVar3 = this.f7469b.l();
            }
            f6.b bVar4 = bVar3;
            c6.d dVar = this.f7486s;
            if (dVar == null) {
                dVar = this.f7469b.k();
            }
            c6.d dVar2 = dVar;
            Bitmap.Config config = this.f7487t;
            if (config == null) {
                config = this.f7469b.c();
            }
            Bitmap.Config config2 = config;
            Boolean bool = this.f7488u;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f7469b.a();
            Boolean bool2 = this.f7489v;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f7469b.b();
            coil.request.a aVar2 = this.f7490w;
            if (aVar2 == null) {
                aVar2 = this.f7469b.h();
            }
            coil.request.a aVar3 = aVar2;
            coil.request.a aVar4 = this.f7491x;
            if (aVar4 == null) {
                aVar4 = this.f7469b.d();
            }
            coil.request.a aVar5 = aVar4;
            coil.request.a aVar6 = this.f7492y;
            if (aVar6 == null) {
                aVar6 = this.f7469b.i();
            }
            return new g(context, obj2, bVar, bVar2, lVar, lVar2, colorSpace, pVar, fVar, list, n11, m11, pVar3, hVar2, fVar3, j0Var2, bVar4, dVar2, config2, booleanValue, booleanValue2, aVar3, aVar5, aVar6, this.f7493z, this.A, this.B, this.C, this.D, this.E, new c(this.f7481n, this.f7482o, this.f7483p, this.f7484q, this.f7485r, this.f7486s, this.f7487t, this.f7488u, this.f7489v, this.f7490w, this.f7491x, this.f7492y), this.f7469b, null);
        }

        public final a b(Object obj) {
            this.f7470c = obj;
            return this;
        }

        public final a c(b6.b defaults) {
            s.g(defaults, "defaults");
            this.f7469b = defaults;
            d();
            return this;
        }

        public final a i(ImageView imageView) {
            s.g(imageView, "imageView");
            return j(new ImageViewTarget(imageView));
        }

        public final a j(d6.b bVar) {
            this.f7471d = bVar;
            e();
            return this;
        }

        public a(g request, Context context) {
            s.g(request, "request");
            s.g(context, "context");
            this.f7468a = context;
            this.f7469b = request.n();
            this.f7470c = request.l();
            this.f7471d = request.G();
            this.f7472e = request.w();
            this.f7473f = request.x();
            this.f7474g = request.C();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7475h = request.j();
            }
            this.f7476i = request.t();
            this.f7477j = request.m();
            this.f7478k = request.H();
            this.f7479l = request.u().newBuilder();
            this.f7480m = request.A().e();
            this.f7481n = request.o().f();
            this.f7482o = request.o().k();
            this.f7483p = request.o().j();
            this.f7484q = request.o().e();
            this.f7485r = request.o().l();
            this.f7486s = request.o().i();
            this.f7487t = request.o().c();
            this.f7488u = request.o().a();
            this.f7489v = request.o().b();
            this.f7490w = request.o().g();
            this.f7491x = request.o().d();
            this.f7492y = request.o().h();
            this.f7493z = request.f7466y;
            this.A = request.f7467z;
            this.B = request.A;
            this.C = request.B;
            this.D = request.C;
            this.E = request.D;
            if (request.k() == context) {
                this.F = request.v();
                this.G = request.F();
                this.H = request.E();
                return;
            }
            this.F = null;
            this.G = null;
            this.H = null;
        }
    }
}