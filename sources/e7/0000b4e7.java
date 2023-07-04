package ta;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import ta.g;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a */
    private final a f51819a;

    /* renamed from: b */
    private boolean f51820b;

    /* renamed from: c */
    private boolean f51821c;

    /* renamed from: d */
    private boolean f51822d;

    /* renamed from: e */
    private boolean f51823e;

    /* renamed from: f */
    private int f51824f;

    /* renamed from: g */
    private int f51825g;

    /* renamed from: h */
    private boolean f51826h;

    /* renamed from: i */
    private Paint f51827i;

    /* renamed from: j */
    private Rect f51828j;

    /* renamed from: k */
    private List<androidx.vectordrawable.graphics.drawable.b> f51829k;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final g f51830a;

        a(g gVar) {
            this.f51830a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, fa.a aVar, ha.h<Bitmap> hVar, int i11, int i12, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.e(context), aVar, i11, i12, hVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f51828j == null) {
            this.f51828j = new Rect();
        }
        return this.f51828j;
    }

    private Paint h() {
        if (this.f51827i == null) {
            this.f51827i = new Paint(2);
        }
        return this.f51827i;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f51829k;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f51829k.get(i11).a(this);
            }
        }
    }

    private void l() {
        this.f51824f = 0;
    }

    private void n() {
        bb.j.a(!this.f51822d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f51819a.f51830a.f() == 1) {
            invalidateSelf();
        } else if (this.f51820b) {
        } else {
            this.f51820b = true;
            this.f51819a.f51830a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f51820b = false;
        this.f51819a.f51830a.s(this);
    }

    @Override // ta.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f51824f++;
        }
        int i11 = this.f51825g;
        if (i11 == -1 || this.f51824f < i11) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f51819a.f51830a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f51822d) {
            return;
        }
        if (this.f51826h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f51826h = false;
        }
        canvas.drawBitmap(this.f51819a.f51830a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f51819a.f51830a.e();
    }

    public int f() {
        return this.f51819a.f51830a.f();
    }

    public int g() {
        return this.f51819a.f51830a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f51819a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f51819a.f51830a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f51819a.f51830a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f51819a.f51830a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f51820b;
    }

    public void k() {
        this.f51822d = true;
        this.f51819a.f51830a.a();
    }

    public void m(ha.h<Bitmap> hVar, Bitmap bitmap) {
        this.f51819a.f51830a.o(hVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f51826h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        h().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        bb.j.a(!this.f51822d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f51823e = z11;
        if (!z11) {
            o();
        } else if (this.f51821c) {
            n();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f51821c = true;
        l();
        if (this.f51823e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f51821c = false;
        o();
    }

    c(a aVar) {
        this.f51823e = true;
        this.f51825g = -1;
        this.f51819a = (a) bb.j.d(aVar);
    }
}