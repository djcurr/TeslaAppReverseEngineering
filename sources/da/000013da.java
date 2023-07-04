package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f8.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v7.p;

/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback, Animatable {
    private boolean A;

    /* renamed from: a */
    private final Matrix f9994a = new Matrix();

    /* renamed from: b */
    private v7.d f9995b;

    /* renamed from: c */
    private final h8.e f9996c;

    /* renamed from: d */
    private float f9997d;

    /* renamed from: e */
    private boolean f9998e;

    /* renamed from: f */
    private boolean f9999f;

    /* renamed from: g */
    private boolean f10000g;

    /* renamed from: h */
    private final ArrayList<o> f10001h;

    /* renamed from: i */
    private final ValueAnimator.AnimatorUpdateListener f10002i;

    /* renamed from: j */
    private z7.b f10003j;

    /* renamed from: k */
    private String f10004k;

    /* renamed from: l */
    private v7.b f10005l;

    /* renamed from: m */
    private z7.a f10006m;

    /* renamed from: n */
    v7.a f10007n;

    /* renamed from: o */
    p f10008o;

    /* renamed from: p */
    private boolean f10009p;

    /* renamed from: q */
    private d8.c f10010q;

    /* renamed from: t */
    private int f10011t;

    /* renamed from: w */
    private boolean f10012w;

    /* renamed from: x */
    private boolean f10013x;

    /* renamed from: y */
    private boolean f10014y;

    /* renamed from: z */
    private boolean f10015z;

    /* renamed from: com.airbnb.lottie.a$a */
    /* loaded from: classes.dex */
    public class C0189a implements o {

        /* renamed from: a */
        final /* synthetic */ String f10016a;

        C0189a(String str) {
            a.this = r1;
            this.f10016a = str;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.b0(this.f10016a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements o {

        /* renamed from: a */
        final /* synthetic */ int f10018a;

        /* renamed from: b */
        final /* synthetic */ int f10019b;

        b(int i11, int i12) {
            a.this = r1;
            this.f10018a = i11;
            this.f10019b = i12;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.a0(this.f10018a, this.f10019b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements o {

        /* renamed from: a */
        final /* synthetic */ int f10021a;

        c(int i11) {
            a.this = r1;
            this.f10021a = i11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.T(this.f10021a);
        }
    }

    /* loaded from: classes.dex */
    public class d implements o {

        /* renamed from: a */
        final /* synthetic */ float f10023a;

        d(float f11) {
            a.this = r1;
            this.f10023a = f11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.h0(this.f10023a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements o {

        /* renamed from: a */
        final /* synthetic */ a8.e f10025a;

        /* renamed from: b */
        final /* synthetic */ Object f10026b;

        /* renamed from: c */
        final /* synthetic */ i8.c f10027c;

        e(a8.e eVar, Object obj, i8.c cVar) {
            a.this = r1;
            this.f10025a = eVar;
            this.f10026b = obj;
            this.f10027c = cVar;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.d(this.f10025a, this.f10026b, this.f10027c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
            a.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a.this.f10010q != null) {
                a.this.f10010q.K(a.this.f9996c.h());
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements o {
        g() {
            a.this = r1;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.L();
        }
    }

    /* loaded from: classes.dex */
    public class h implements o {
        h() {
            a.this = r1;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.P();
        }
    }

    /* loaded from: classes.dex */
    public class i implements o {

        /* renamed from: a */
        final /* synthetic */ int f10032a;

        i(int i11) {
            a.this = r1;
            this.f10032a = i11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.c0(this.f10032a);
        }
    }

    /* loaded from: classes.dex */
    public class j implements o {

        /* renamed from: a */
        final /* synthetic */ float f10034a;

        j(float f11) {
            a.this = r1;
            this.f10034a = f11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.e0(this.f10034a);
        }
    }

    /* loaded from: classes.dex */
    public class k implements o {

        /* renamed from: a */
        final /* synthetic */ int f10036a;

        k(int i11) {
            a.this = r1;
            this.f10036a = i11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.X(this.f10036a);
        }
    }

    /* loaded from: classes.dex */
    public class l implements o {

        /* renamed from: a */
        final /* synthetic */ float f10038a;

        l(float f11) {
            a.this = r1;
            this.f10038a = f11;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.Z(this.f10038a);
        }
    }

    /* loaded from: classes.dex */
    public class m implements o {

        /* renamed from: a */
        final /* synthetic */ String f10040a;

        m(String str) {
            a.this = r1;
            this.f10040a = str;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.d0(this.f10040a);
        }
    }

    /* loaded from: classes.dex */
    public class n implements o {

        /* renamed from: a */
        final /* synthetic */ String f10042a;

        n(String str) {
            a.this = r1;
            this.f10042a = str;
        }

        @Override // com.airbnb.lottie.a.o
        public void a(v7.d dVar) {
            a.this.Y(this.f10042a);
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void a(v7.d dVar);
    }

    public a() {
        h8.e eVar = new h8.e();
        this.f9996c = eVar;
        this.f9997d = 1.0f;
        this.f9998e = true;
        this.f9999f = false;
        this.f10000g = false;
        this.f10001h = new ArrayList<>();
        f fVar = new f();
        this.f10002i = fVar;
        this.f10011t = 255;
        this.f10015z = true;
        this.A = false;
        eVar.addUpdateListener(fVar);
    }

    private boolean e() {
        return this.f9998e || this.f9999f;
    }

    private float f(Rect rect) {
        return rect.width() / rect.height();
    }

    private boolean g() {
        v7.d dVar = this.f9995b;
        return dVar == null || getBounds().isEmpty() || f(getBounds()) == f(dVar.b());
    }

    private void h() {
        d8.c cVar = new d8.c(this, v.b(this.f9995b), this.f9995b.k(), this.f9995b);
        this.f10010q = cVar;
        if (this.f10013x) {
            cVar.I(true);
        }
    }

    private void k(Canvas canvas) {
        if (!g()) {
            l(canvas);
        } else {
            m(canvas);
        }
    }

    private void l(Canvas canvas) {
        float f11;
        d8.c cVar = this.f10010q;
        v7.d dVar = this.f9995b;
        if (cVar == null || dVar == null) {
            return;
        }
        int i11 = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / dVar.b().width();
        float height = bounds.height() / dVar.b().height();
        if (this.f10015z) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                f11 = 1.0f / min;
                width /= f11;
                height /= f11;
            } else {
                f11 = 1.0f;
            }
            if (f11 > 1.0f) {
                i11 = canvas.save();
                float width2 = bounds.width() / 2.0f;
                float height2 = bounds.height() / 2.0f;
                float f12 = width2 * min;
                float f13 = min * height2;
                canvas.translate(width2 - f12, height2 - f13);
                canvas.scale(f11, f11, f12, f13);
            }
        }
        this.f9994a.reset();
        this.f9994a.preScale(width, height);
        cVar.g(canvas, this.f9994a, this.f10011t);
        if (i11 > 0) {
            canvas.restoreToCount(i11);
        }
    }

    private void m(Canvas canvas) {
        float f11;
        d8.c cVar = this.f10010q;
        v7.d dVar = this.f9995b;
        if (cVar == null || dVar == null) {
            return;
        }
        float f12 = this.f9997d;
        float y11 = y(canvas, dVar);
        if (f12 > y11) {
            f11 = this.f9997d / y11;
        } else {
            y11 = f12;
            f11 = 1.0f;
        }
        int i11 = -1;
        if (f11 > 1.0f) {
            i11 = canvas.save();
            float width = dVar.b().width() / 2.0f;
            float height = dVar.b().height() / 2.0f;
            float f13 = width * y11;
            float f14 = height * y11;
            canvas.translate((E() * width) - f13, (E() * height) - f14);
            canvas.scale(f11, f11, f13, f14);
        }
        this.f9994a.reset();
        this.f9994a.preScale(y11, y11);
        cVar.g(canvas, this.f9994a, this.f10011t);
        if (i11 > 0) {
            canvas.restoreToCount(i11);
        }
    }

    private Context r() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private z7.a s() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f10006m == null) {
            this.f10006m = new z7.a(getCallback(), this.f10007n);
        }
        return this.f10006m;
    }

    private z7.b v() {
        if (getCallback() == null) {
            return null;
        }
        z7.b bVar = this.f10003j;
        if (bVar != null && !bVar.b(r())) {
            this.f10003j = null;
        }
        if (this.f10003j == null) {
            this.f10003j = new z7.b(getCallback(), this.f10004k, this.f10005l, this.f9995b.j());
        }
        return this.f10003j;
    }

    private float y(Canvas canvas, v7.d dVar) {
        return Math.min(canvas.getWidth() / dVar.b().width(), canvas.getHeight() / dVar.b().height());
    }

    public v7.l A() {
        v7.d dVar = this.f9995b;
        if (dVar != null) {
            return dVar.n();
        }
        return null;
    }

    public float B() {
        return this.f9996c.h();
    }

    public int C() {
        return this.f9996c.getRepeatCount();
    }

    public int D() {
        return this.f9996c.getRepeatMode();
    }

    public float E() {
        return this.f9997d;
    }

    public float F() {
        return this.f9996c.m();
    }

    public p G() {
        return this.f10008o;
    }

    public Typeface H(String str, String str2) {
        z7.a s11 = s();
        if (s11 != null) {
            return s11.b(str, str2);
        }
        return null;
    }

    public boolean I() {
        h8.e eVar = this.f9996c;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public boolean J() {
        return this.f10014y;
    }

    public void K() {
        this.f10001h.clear();
        this.f9996c.o();
    }

    public void L() {
        if (this.f10010q == null) {
            this.f10001h.add(new g());
            return;
        }
        if (e() || C() == 0) {
            this.f9996c.p();
        }
        if (e()) {
            return;
        }
        T((int) (F() < BitmapDescriptorFactory.HUE_RED ? z() : x()));
        this.f9996c.g();
    }

    public void M() {
        this.f9996c.removeAllListeners();
    }

    public void N() {
        this.f9996c.removeAllUpdateListeners();
        this.f9996c.addUpdateListener(this.f10002i);
    }

    public List<a8.e> O(a8.e eVar) {
        if (this.f10010q == null) {
            h8.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f10010q.d(eVar, 0, arrayList, new a8.e(new String[0]));
        return arrayList;
    }

    public void P() {
        if (this.f10010q == null) {
            this.f10001h.add(new h());
            return;
        }
        if (e() || C() == 0) {
            this.f9996c.t();
        }
        if (e()) {
            return;
        }
        T((int) (F() < BitmapDescriptorFactory.HUE_RED ? z() : x()));
        this.f9996c.g();
    }

    public void Q(boolean z11) {
        this.f10014y = z11;
    }

    public boolean R(v7.d dVar) {
        if (this.f9995b == dVar) {
            return false;
        }
        this.A = false;
        j();
        this.f9995b = dVar;
        h();
        this.f9996c.v(dVar);
        h0(this.f9996c.getAnimatedFraction());
        l0(this.f9997d);
        Iterator it2 = new ArrayList(this.f10001h).iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            if (oVar != null) {
                oVar.a(dVar);
            }
            it2.remove();
        }
        this.f10001h.clear();
        dVar.v(this.f10012w);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
            return true;
        }
        return true;
    }

    public void S(v7.a aVar) {
        z7.a aVar2 = this.f10006m;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }

    public void T(int i11) {
        if (this.f9995b == null) {
            this.f10001h.add(new c(i11));
        } else {
            this.f9996c.w(i11);
        }
    }

    public void U(boolean z11) {
        this.f9999f = z11;
    }

    public void V(v7.b bVar) {
        this.f10005l = bVar;
        z7.b bVar2 = this.f10003j;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }

    public void W(String str) {
        this.f10004k = str;
    }

    public void X(int i11) {
        if (this.f9995b == null) {
            this.f10001h.add(new k(i11));
        } else {
            this.f9996c.x(i11 + 0.99f);
        }
    }

    public void Y(String str) {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            this.f10001h.add(new n(str));
            return;
        }
        a8.h l11 = dVar.l(str);
        if (l11 != null) {
            X((int) (l11.f348b + l11.f349c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void Z(float f11) {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            this.f10001h.add(new l(f11));
        } else {
            X((int) h8.g.k(dVar.p(), this.f9995b.f(), f11));
        }
    }

    public void a0(int i11, int i12) {
        if (this.f9995b == null) {
            this.f10001h.add(new b(i11, i12));
        } else {
            this.f9996c.y(i11, i12 + 0.99f);
        }
    }

    public void b0(String str) {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            this.f10001h.add(new C0189a(str));
            return;
        }
        a8.h l11 = dVar.l(str);
        if (l11 != null) {
            int i11 = (int) l11.f348b;
            a0(i11, ((int) l11.f349c) + i11);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.f9996c.addListener(animatorListener);
    }

    public void c0(int i11) {
        if (this.f9995b == null) {
            this.f10001h.add(new i(i11));
        } else {
            this.f9996c.z(i11);
        }
    }

    public <T> void d(a8.e eVar, T t11, i8.c<T> cVar) {
        d8.c cVar2 = this.f10010q;
        if (cVar2 == null) {
            this.f10001h.add(new e(eVar, t11, cVar));
            return;
        }
        boolean z11 = true;
        if (eVar == a8.e.f342c) {
            cVar2.c(t11, cVar);
        } else if (eVar.d() != null) {
            eVar.d().c(t11, cVar);
        } else {
            List<a8.e> O = O(eVar);
            for (int i11 = 0; i11 < O.size(); i11++) {
                O.get(i11).d().c(t11, cVar);
            }
            z11 = true ^ O.isEmpty();
        }
        if (z11) {
            invalidateSelf();
            if (t11 == v7.j.E) {
                h0(B());
            }
        }
    }

    public void d0(String str) {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            this.f10001h.add(new m(str));
            return;
        }
        a8.h l11 = dVar.l(str);
        if (l11 != null) {
            c0((int) l11.f348b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.A = false;
        v7.c.a("Drawable#draw");
        if (this.f10000g) {
            try {
                k(canvas);
            } catch (Throwable th2) {
                h8.d.b("Lottie crashed in draw!", th2);
            }
        } else {
            k(canvas);
        }
        v7.c.b("Drawable#draw");
    }

    public void e0(float f11) {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            this.f10001h.add(new j(f11));
        } else {
            c0((int) h8.g.k(dVar.p(), this.f9995b.f(), f11));
        }
    }

    public void f0(boolean z11) {
        if (this.f10013x == z11) {
            return;
        }
        this.f10013x = z11;
        d8.c cVar = this.f10010q;
        if (cVar != null) {
            cVar.I(z11);
        }
    }

    public void g0(boolean z11) {
        this.f10012w = z11;
        v7.d dVar = this.f9995b;
        if (dVar != null) {
            dVar.v(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10011t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            return -1;
        }
        return (int) (dVar.b().height() * E());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        v7.d dVar = this.f9995b;
        if (dVar == null) {
            return -1;
        }
        return (int) (dVar.b().width() * E());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0(float f11) {
        if (this.f9995b == null) {
            this.f10001h.add(new d(f11));
            return;
        }
        v7.c.a("Drawable#setProgress");
        this.f9996c.w(this.f9995b.h(f11));
        v7.c.b("Drawable#setProgress");
    }

    public void i() {
        this.f10001h.clear();
        this.f9996c.cancel();
    }

    public void i0(int i11) {
        this.f9996c.setRepeatCount(i11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.A) {
            return;
        }
        this.A = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return I();
    }

    public void j() {
        if (this.f9996c.isRunning()) {
            this.f9996c.cancel();
        }
        this.f9995b = null;
        this.f10010q = null;
        this.f10003j = null;
        this.f9996c.f();
        invalidateSelf();
    }

    public void j0(int i11) {
        this.f9996c.setRepeatMode(i11);
    }

    public void k0(boolean z11) {
        this.f10000g = z11;
    }

    public void l0(float f11) {
        this.f9997d = f11;
    }

    public void m0(float f11) {
        this.f9996c.A(f11);
    }

    public void n(boolean z11) {
        if (this.f10009p == z11) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            h8.d.c("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f10009p = z11;
        if (this.f9995b != null) {
            h();
        }
    }

    public void n0(Boolean bool) {
        this.f9998e = bool.booleanValue();
    }

    public boolean o() {
        return this.f10009p;
    }

    public void o0(p pVar) {
    }

    public void p() {
        this.f10001h.clear();
        this.f9996c.g();
    }

    public boolean p0() {
        return this.f9995b.c().p() > 0;
    }

    public v7.d q() {
        return this.f9995b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f10011t = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h8.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        L();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        p();
    }

    public int t() {
        return (int) this.f9996c.i();
    }

    public Bitmap u(String str) {
        z7.b v11 = v();
        if (v11 != null) {
            return v11.a(str);
        }
        v7.d dVar = this.f9995b;
        v7.f fVar = dVar == null ? null : dVar.j().get(str);
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public String w() {
        return this.f10004k;
    }

    public float x() {
        return this.f9996c.k();
    }

    public float z() {
        return this.f9996c.l();
    }
}