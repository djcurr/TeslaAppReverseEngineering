package wk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    d f56024a;

    /* renamed from: b  reason: collision with root package name */
    d f56025b;

    /* renamed from: c  reason: collision with root package name */
    d f56026c;

    /* renamed from: d  reason: collision with root package name */
    d f56027d;

    /* renamed from: e  reason: collision with root package name */
    wk.c f56028e;

    /* renamed from: f  reason: collision with root package name */
    wk.c f56029f;

    /* renamed from: g  reason: collision with root package name */
    wk.c f56030g;

    /* renamed from: h  reason: collision with root package name */
    wk.c f56031h;

    /* renamed from: i  reason: collision with root package name */
    f f56032i;

    /* renamed from: j  reason: collision with root package name */
    f f56033j;

    /* renamed from: k  reason: collision with root package name */
    f f56034k;

    /* renamed from: l  reason: collision with root package name */
    f f56035l;

    /* loaded from: classes3.dex */
    public interface c {
        wk.c a(wk.c cVar);
    }

    static {
        new i(0.5f);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i11, int i12) {
        return c(context, i11, i12, 0);
    }

    private static b c(Context context, int i11, int i12, int i13) {
        return d(context, i11, i12, new wk.a(i13));
    }

    private static b d(Context context, int i11, int i12, wk.c cVar) {
        if (i12 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
            i11 = i12;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, fk.k.S2);
        try {
            int i13 = obtainStyledAttributes.getInt(fk.k.T2, 0);
            int i14 = obtainStyledAttributes.getInt(fk.k.W2, i13);
            int i15 = obtainStyledAttributes.getInt(fk.k.X2, i13);
            int i16 = obtainStyledAttributes.getInt(fk.k.V2, i13);
            int i17 = obtainStyledAttributes.getInt(fk.k.U2, i13);
            wk.c m11 = m(obtainStyledAttributes, fk.k.Y2, cVar);
            wk.c m12 = m(obtainStyledAttributes, fk.k.f26528b3, m11);
            wk.c m13 = m(obtainStyledAttributes, fk.k.f26534c3, m11);
            wk.c m14 = m(obtainStyledAttributes, fk.k.f26522a3, m11);
            return new b().A(i14, m12).E(i15, m13).w(i16, m14).s(i17, m(obtainStyledAttributes, fk.k.Z2, m11));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i11, int i12) {
        return f(context, attributeSet, i11, i12, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i11, int i12, int i13) {
        return g(context, attributeSet, i11, i12, new wk.a(i13));
    }

    public static b g(Context context, AttributeSet attributeSet, int i11, int i12, wk.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.k.f26671z2, i11, i12);
        int resourceId = obtainStyledAttributes.getResourceId(fk.k.A2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(fk.k.B2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static wk.c m(TypedArray typedArray, int i11, wk.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue == null) {
            return cVar;
        }
        int i12 = peekValue.type;
        if (i12 == 5) {
            return new wk.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i12 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f56034k;
    }

    public d i() {
        return this.f56027d;
    }

    public wk.c j() {
        return this.f56031h;
    }

    public d k() {
        return this.f56026c;
    }

    public wk.c l() {
        return this.f56030g;
    }

    public f n() {
        return this.f56035l;
    }

    public f o() {
        return this.f56033j;
    }

    public f p() {
        return this.f56032i;
    }

    public d q() {
        return this.f56024a;
    }

    public wk.c r() {
        return this.f56028e;
    }

    public d s() {
        return this.f56025b;
    }

    public wk.c t() {
        return this.f56029f;
    }

    public boolean u(RectF rectF) {
        boolean z11 = this.f56035l.getClass().equals(f.class) && this.f56033j.getClass().equals(f.class) && this.f56032i.getClass().equals(f.class) && this.f56034k.getClass().equals(f.class);
        float a11 = this.f56028e.a(rectF);
        return z11 && ((this.f56029f.a(rectF) > a11 ? 1 : (this.f56029f.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f56031h.a(rectF) > a11 ? 1 : (this.f56031h.a(rectF) == a11 ? 0 : -1)) == 0 && (this.f56030g.a(rectF) > a11 ? 1 : (this.f56030g.a(rectF) == a11 ? 0 : -1)) == 0) && ((this.f56025b instanceof j) && (this.f56024a instanceof j) && (this.f56026c instanceof j) && (this.f56027d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f11) {
        return v().o(f11).m();
    }

    public k x(wk.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().D(cVar.a(r())).H(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f56024a = bVar.f56036a;
        this.f56025b = bVar.f56037b;
        this.f56026c = bVar.f56038c;
        this.f56027d = bVar.f56039d;
        this.f56028e = bVar.f56040e;
        this.f56029f = bVar.f56041f;
        this.f56030g = bVar.f56042g;
        this.f56031h = bVar.f56043h;
        this.f56032i = bVar.f56044i;
        this.f56033j = bVar.f56045j;
        this.f56034k = bVar.f56046k;
        this.f56035l = bVar.f56047l;
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f56036a;

        /* renamed from: b  reason: collision with root package name */
        private d f56037b;

        /* renamed from: c  reason: collision with root package name */
        private d f56038c;

        /* renamed from: d  reason: collision with root package name */
        private d f56039d;

        /* renamed from: e  reason: collision with root package name */
        private wk.c f56040e;

        /* renamed from: f  reason: collision with root package name */
        private wk.c f56041f;

        /* renamed from: g  reason: collision with root package name */
        private wk.c f56042g;

        /* renamed from: h  reason: collision with root package name */
        private wk.c f56043h;

        /* renamed from: i  reason: collision with root package name */
        private f f56044i;

        /* renamed from: j  reason: collision with root package name */
        private f f56045j;

        /* renamed from: k  reason: collision with root package name */
        private f f56046k;

        /* renamed from: l  reason: collision with root package name */
        private f f56047l;

        public b() {
            this.f56036a = h.b();
            this.f56037b = h.b();
            this.f56038c = h.b();
            this.f56039d = h.b();
            this.f56040e = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56041f = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56042g = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56043h = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56044i = h.c();
            this.f56045j = h.c();
            this.f56046k = h.c();
            this.f56047l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f56023a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f55975a;
            }
            return -1.0f;
        }

        public b A(int i11, wk.c cVar) {
            return B(h.a(i11)).D(cVar);
        }

        public b B(d dVar) {
            this.f56036a = dVar;
            float n11 = n(dVar);
            if (n11 != -1.0f) {
                C(n11);
            }
            return this;
        }

        public b C(float f11) {
            this.f56040e = new wk.a(f11);
            return this;
        }

        public b D(wk.c cVar) {
            this.f56040e = cVar;
            return this;
        }

        public b E(int i11, wk.c cVar) {
            return F(h.a(i11)).H(cVar);
        }

        public b F(d dVar) {
            this.f56037b = dVar;
            float n11 = n(dVar);
            if (n11 != -1.0f) {
                G(n11);
            }
            return this;
        }

        public b G(float f11) {
            this.f56041f = new wk.a(f11);
            return this;
        }

        public b H(wk.c cVar) {
            this.f56041f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f11) {
            return C(f11).G(f11).y(f11).u(f11);
        }

        public b p(wk.c cVar) {
            return D(cVar).H(cVar).z(cVar).v(cVar);
        }

        public b q(int i11, float f11) {
            return r(h.a(i11)).o(f11);
        }

        public b r(d dVar) {
            return B(dVar).F(dVar).x(dVar).t(dVar);
        }

        public b s(int i11, wk.c cVar) {
            return t(h.a(i11)).v(cVar);
        }

        public b t(d dVar) {
            this.f56039d = dVar;
            float n11 = n(dVar);
            if (n11 != -1.0f) {
                u(n11);
            }
            return this;
        }

        public b u(float f11) {
            this.f56043h = new wk.a(f11);
            return this;
        }

        public b v(wk.c cVar) {
            this.f56043h = cVar;
            return this;
        }

        public b w(int i11, wk.c cVar) {
            return x(h.a(i11)).z(cVar);
        }

        public b x(d dVar) {
            this.f56038c = dVar;
            float n11 = n(dVar);
            if (n11 != -1.0f) {
                y(n11);
            }
            return this;
        }

        public b y(float f11) {
            this.f56042g = new wk.a(f11);
            return this;
        }

        public b z(wk.c cVar) {
            this.f56042g = cVar;
            return this;
        }

        public b(k kVar) {
            this.f56036a = h.b();
            this.f56037b = h.b();
            this.f56038c = h.b();
            this.f56039d = h.b();
            this.f56040e = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56041f = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56042g = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56043h = new wk.a(BitmapDescriptorFactory.HUE_RED);
            this.f56044i = h.c();
            this.f56045j = h.c();
            this.f56046k = h.c();
            this.f56047l = h.c();
            this.f56036a = kVar.f56024a;
            this.f56037b = kVar.f56025b;
            this.f56038c = kVar.f56026c;
            this.f56039d = kVar.f56027d;
            this.f56040e = kVar.f56028e;
            this.f56041f = kVar.f56029f;
            this.f56042g = kVar.f56030g;
            this.f56043h = kVar.f56031h;
            this.f56044i = kVar.f56032i;
            this.f56045j = kVar.f56033j;
            this.f56046k = kVar.f56034k;
            this.f56047l = kVar.f56035l;
        }
    }

    public k() {
        this.f56024a = h.b();
        this.f56025b = h.b();
        this.f56026c = h.b();
        this.f56027d = h.b();
        this.f56028e = new wk.a(BitmapDescriptorFactory.HUE_RED);
        this.f56029f = new wk.a(BitmapDescriptorFactory.HUE_RED);
        this.f56030g = new wk.a(BitmapDescriptorFactory.HUE_RED);
        this.f56031h = new wk.a(BitmapDescriptorFactory.HUE_RED);
        this.f56032i = h.c();
        this.f56033j = h.c();
        this.f56034k = h.c();
        this.f56035l = h.c();
    }
}