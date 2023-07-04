package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import v3.h;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f5973g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f5974h = new i4.b();

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f5975i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f5976a;

    /* renamed from: b  reason: collision with root package name */
    private float f5977b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f5978c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f5979d;

    /* renamed from: e  reason: collision with root package name */
    float f5980e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5981f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5982a;

        a(c cVar) {
            this.f5982a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f5982a);
            b.this.b(floatValue, this.f5982a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0103b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5984a;

        C0103b(c cVar) {
            this.f5984a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f5984a, true);
            this.f5984a.A();
            this.f5984a.l();
            b bVar = b.this;
            if (bVar.f5981f) {
                bVar.f5981f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f5984a.x(false);
                return;
            }
            bVar.f5980e += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f5980e = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f5986a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f5987b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f5988c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f5989d;

        /* renamed from: e  reason: collision with root package name */
        float f5990e;

        /* renamed from: f  reason: collision with root package name */
        float f5991f;

        /* renamed from: g  reason: collision with root package name */
        float f5992g;

        /* renamed from: h  reason: collision with root package name */
        float f5993h;

        /* renamed from: i  reason: collision with root package name */
        int[] f5994i;

        /* renamed from: j  reason: collision with root package name */
        int f5995j;

        /* renamed from: k  reason: collision with root package name */
        float f5996k;

        /* renamed from: l  reason: collision with root package name */
        float f5997l;

        /* renamed from: m  reason: collision with root package name */
        float f5998m;

        /* renamed from: n  reason: collision with root package name */
        boolean f5999n;

        /* renamed from: o  reason: collision with root package name */
        Path f6000o;

        /* renamed from: p  reason: collision with root package name */
        float f6001p;

        /* renamed from: q  reason: collision with root package name */
        float f6002q;

        /* renamed from: r  reason: collision with root package name */
        int f6003r;

        /* renamed from: s  reason: collision with root package name */
        int f6004s;

        /* renamed from: t  reason: collision with root package name */
        int f6005t;

        /* renamed from: u  reason: collision with root package name */
        int f6006u;

        c() {
            Paint paint = new Paint();
            this.f5987b = paint;
            Paint paint2 = new Paint();
            this.f5988c = paint2;
            Paint paint3 = new Paint();
            this.f5989d = paint3;
            this.f5990e = BitmapDescriptorFactory.HUE_RED;
            this.f5991f = BitmapDescriptorFactory.HUE_RED;
            this.f5992g = BitmapDescriptorFactory.HUE_RED;
            this.f5993h = 5.0f;
            this.f6001p = 1.0f;
            this.f6005t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f5996k = this.f5990e;
            this.f5997l = this.f5991f;
            this.f5998m = this.f5992g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5986a;
            float f11 = this.f6002q;
            float f12 = (this.f5993h / 2.0f) + f11;
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                f12 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f6003r * this.f6001p) / 2.0f, this.f5993h / 2.0f);
            }
            rectF.set(rect.centerX() - f12, rect.centerY() - f12, rect.centerX() + f12, rect.centerY() + f12);
            float f13 = this.f5990e;
            float f14 = this.f5992g;
            float f15 = (f13 + f14) * 360.0f;
            float f16 = ((this.f5991f + f14) * 360.0f) - f15;
            this.f5987b.setColor(this.f6006u);
            this.f5987b.setAlpha(this.f6005t);
            float f17 = this.f5993h / 2.0f;
            rectF.inset(f17, f17);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5989d);
            float f18 = -f17;
            rectF.inset(f18, f18);
            canvas.drawArc(rectF, f15, f16, false, this.f5987b);
            b(canvas, f15, f16, rectF);
        }

        void b(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.f5999n) {
                Path path = this.f6000o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f6000o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f6000o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f6000o.lineTo(this.f6003r * this.f6001p, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.f6000o;
                float f13 = this.f6001p;
                path3.lineTo((this.f6003r * f13) / 2.0f, this.f6004s * f13);
                this.f6000o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f6003r * this.f6001p) / 2.0f), rectF.centerY() + (this.f5993h / 2.0f));
                this.f6000o.close();
                this.f5988c.setColor(this.f6006u);
                this.f5988c.setAlpha(this.f6005t);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f6000o, this.f5988c);
                canvas.restore();
            }
        }

        int c() {
            return this.f6005t;
        }

        float d() {
            return this.f5991f;
        }

        int e() {
            return this.f5994i[f()];
        }

        int f() {
            return (this.f5995j + 1) % this.f5994i.length;
        }

        float g() {
            return this.f5990e;
        }

        int h() {
            return this.f5994i[this.f5995j];
        }

        float i() {
            return this.f5997l;
        }

        float j() {
            return this.f5998m;
        }

        float k() {
            return this.f5996k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f5996k = BitmapDescriptorFactory.HUE_RED;
            this.f5997l = BitmapDescriptorFactory.HUE_RED;
            this.f5998m = BitmapDescriptorFactory.HUE_RED;
            y(BitmapDescriptorFactory.HUE_RED);
            v(BitmapDescriptorFactory.HUE_RED);
            w(BitmapDescriptorFactory.HUE_RED);
        }

        void n(int i11) {
            this.f6005t = i11;
        }

        void o(float f11, float f12) {
            this.f6003r = (int) f11;
            this.f6004s = (int) f12;
        }

        void p(float f11) {
            if (f11 != this.f6001p) {
                this.f6001p = f11;
            }
        }

        void q(float f11) {
            this.f6002q = f11;
        }

        void r(int i11) {
            this.f6006u = i11;
        }

        void s(ColorFilter colorFilter) {
            this.f5987b.setColorFilter(colorFilter);
        }

        void t(int i11) {
            this.f5995j = i11;
            this.f6006u = this.f5994i[i11];
        }

        void u(int[] iArr) {
            this.f5994i = iArr;
            t(0);
        }

        void v(float f11) {
            this.f5991f = f11;
        }

        void w(float f11) {
            this.f5992g = f11;
        }

        void x(boolean z11) {
            if (this.f5999n != z11) {
                this.f5999n = z11;
            }
        }

        void y(float f11) {
            this.f5990e = f11;
        }

        void z(float f11) {
            this.f5993h = f11;
            this.f5987b.setStrokeWidth(f11);
        }
    }

    public b(Context context) {
        this.f5978c = ((Context) h.f(context)).getResources();
        c cVar = new c();
        this.f5976a = cVar;
        cVar.u(f5975i);
        k(2.5f);
        m();
    }

    private void a(float f11, c cVar) {
        n(f11, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f11));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor(cVar.j() / 0.8f) + 1.0d)) - cVar.j()) * f11));
    }

    private int c(float f11, int i11, int i12) {
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        return ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & 255) - i16))));
    }

    private void h(float f11) {
        this.f5977b = f11;
    }

    private void i(float f11, float f12, float f13, float f14) {
        c cVar = this.f5976a;
        float f15 = this.f5978c.getDisplayMetrics().density;
        cVar.z(f12 * f15);
        cVar.q(f11 * f15);
        cVar.t(0);
        cVar.o(f13 * f15, f14 * f15);
    }

    private void m() {
        c cVar = this.f5976a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5973g);
        ofFloat.addListener(new C0103b(cVar));
        this.f5979d = ofFloat;
    }

    void b(float f11, c cVar, boolean z11) {
        float interpolation;
        float f12;
        if (this.f5981f) {
            a(f11, cVar);
        } else if (f11 != 1.0f || z11) {
            float j11 = cVar.j();
            if (f11 < 0.5f) {
                interpolation = cVar.k();
                f12 = (f5974h.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k11 = cVar.k() + 0.79f;
                interpolation = k11 - (((1.0f - f5974h.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = k11;
            }
            cVar.y(interpolation);
            cVar.v(f12);
            cVar.w(j11 + (0.20999998f * f11));
            h((f11 + this.f5980e) * 216.0f);
        }
    }

    public void d(boolean z11) {
        this.f5976a.x(z11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5977b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5976a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f11) {
        this.f5976a.p(f11);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f5976a.u(iArr);
        this.f5976a.t(0);
        invalidateSelf();
    }

    public void g(float f11) {
        this.f5976a.w(f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5976a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5979d.isRunning();
    }

    public void j(float f11, float f12) {
        this.f5976a.y(f11);
        this.f5976a.v(f12);
        invalidateSelf();
    }

    public void k(float f11) {
        this.f5976a.z(f11);
        invalidateSelf();
    }

    public void l(int i11) {
        if (i11 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f11, c cVar) {
        if (f11 > 0.75f) {
            cVar.r(c((f11 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f5976a.n(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5976a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5979d.cancel();
        this.f5976a.A();
        if (this.f5976a.d() != this.f5976a.g()) {
            this.f5981f = true;
            this.f5979d.setDuration(666L);
            this.f5979d.start();
            return;
        }
        this.f5976a.t(0);
        this.f5976a.m();
        this.f5979d.setDuration(1332L);
        this.f5979d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5979d.cancel();
        h(BitmapDescriptorFactory.HUE_RED);
        this.f5976a.x(false);
        this.f5976a.t(0);
        this.f5976a.m();
        invalidateSelf();
    }
}