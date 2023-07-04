package wk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.BitSet;
import wk.k;
import wk.l;
import wk.m;

/* loaded from: classes3.dex */
public class g extends Drawable implements n3.b, n {
    private static final String B = g.class.getSimpleName();
    private static final Paint C;
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private c f55976a;

    /* renamed from: b  reason: collision with root package name */
    private final m.g[] f55977b;

    /* renamed from: c  reason: collision with root package name */
    private final m.g[] f55978c;

    /* renamed from: d  reason: collision with root package name */
    private final BitSet f55979d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55980e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f55981f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f55982g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f55983h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f55984i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f55985j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f55986k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f55987l;

    /* renamed from: m  reason: collision with root package name */
    private k f55988m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f55989n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f55990o;

    /* renamed from: p  reason: collision with root package name */
    private final vk.a f55991p;

    /* renamed from: q  reason: collision with root package name */
    private final l.b f55992q;

    /* renamed from: t  reason: collision with root package name */
    private final l f55993t;

    /* renamed from: w  reason: collision with root package name */
    private PorterDuffColorFilter f55994w;

    /* renamed from: x  reason: collision with root package name */
    private PorterDuffColorFilter f55995x;

    /* renamed from: y  reason: collision with root package name */
    private int f55996y;

    /* renamed from: z  reason: collision with root package name */
    private final RectF f55997z;

    /* loaded from: classes3.dex */
    class a implements l.b {
        a() {
        }

        @Override // wk.l.b
        public void a(m mVar, Matrix matrix, int i11) {
            g.this.f55979d.set(i11 + 4, mVar.e());
            g.this.f55978c[i11] = mVar.f(matrix);
        }

        @Override // wk.l.b
        public void b(m mVar, Matrix matrix, int i11) {
            g.this.f55979d.set(i11, mVar.e());
            g.this.f55977b[i11] = mVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f55999a;

        b(g gVar, float f11) {
            this.f55999a = f11;
        }

        @Override // wk.k.c
        public wk.c a(wk.c cVar) {
            return cVar instanceof i ? cVar : new wk.b(this.f55999a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        C = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float F() {
        return N() ? this.f55990o.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean L() {
        c cVar = this.f55976a;
        int i11 = cVar.f56016q;
        return i11 != 1 && cVar.f56017r > 0 && (i11 == 2 || V());
    }

    private boolean M() {
        Paint.Style style = this.f55976a.f56021v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean N() {
        Paint.Style style = this.f55976a.f56021v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f55990o.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    private void P() {
        super.invalidateSelf();
    }

    private void S(Canvas canvas) {
        if (L()) {
            canvas.save();
            U(canvas);
            if (!this.A) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f55997z.width() - getBounds().width());
            int height = (int) (this.f55997z.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f55997z.width()) + (this.f55976a.f56017r * 2) + width, ((int) this.f55997z.height()) + (this.f55976a.f56017r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f11 = (getBounds().left - this.f55976a.f56017r) - width;
                float f12 = (getBounds().top - this.f55976a.f56017r) - height;
                canvas2.translate(-f11, -f12);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f11, f12, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    private static int T(int i11, int i12) {
        return (i11 * (i12 + (i12 >>> 7))) >>> 8;
    }

    private void U(Canvas canvas) {
        int B2 = B();
        int C2 = C();
        if (Build.VERSION.SDK_INT < 21 && this.A) {
            Rect clipBounds = canvas.getClipBounds();
            int i11 = this.f55976a.f56017r;
            clipBounds.inset(-i11, -i11);
            clipBounds.offset(B2, C2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(B2, C2);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z11) {
        if (z11) {
            int color = paint.getColor();
            int l11 = l(color);
            this.f55996y = l11;
            if (l11 != color) {
                return new PorterDuffColorFilter(l11, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f55976a.f56009j != 1.0f) {
            this.f55981f.reset();
            Matrix matrix = this.f55981f;
            float f11 = this.f55976a.f56009j;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f55981f);
        }
        path.computeBounds(this.f55997z, true);
    }

    private void i() {
        k y11 = E().y(new b(this, -F()));
        this.f55988m = y11;
        this.f55993t.d(y11, this.f55976a.f56010k, v(), this.f55983h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z11) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z11) {
            colorForState = l(colorForState);
        }
        this.f55996y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private boolean j0(int[] iArr) {
        boolean z11;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f55976a.f56003d == null || color2 == (colorForState2 = this.f55976a.f56003d.getColorForState(iArr, (color2 = this.f55989n.getColor())))) {
            z11 = false;
        } else {
            this.f55989n.setColor(colorForState2);
            z11 = true;
        }
        if (this.f55976a.f56004e == null || color == (colorForState = this.f55976a.f56004e.getColorForState(iArr, (color = this.f55990o.getColor())))) {
            return z11;
        }
        this.f55990o.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z11) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z11);
        }
        return f(paint, z11);
    }

    private boolean k0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f55994w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f55995x;
        c cVar = this.f55976a;
        this.f55994w = k(cVar.f56006g, cVar.f56007h, this.f55989n, true);
        c cVar2 = this.f55976a;
        this.f55995x = k(cVar2.f56005f, cVar2.f56007h, this.f55990o, false);
        c cVar3 = this.f55976a;
        if (cVar3.f56020u) {
            this.f55991p.d(cVar3.f56006g.getColorForState(getState(), 0));
        }
        return (v3.c.a(porterDuffColorFilter, this.f55994w) && v3.c.a(porterDuffColorFilter2, this.f55995x)) ? false : true;
    }

    private void l0() {
        float K = K();
        this.f55976a.f56017r = (int) Math.ceil(0.75f * K);
        this.f55976a.f56018s = (int) Math.ceil(K * 0.25f);
        k0();
        P();
    }

    public static g m(Context context, float f11) {
        int c11 = kk.a.c(context, fk.b.f26378n, g.class.getSimpleName());
        g gVar = new g();
        gVar.O(context);
        gVar.Y(ColorStateList.valueOf(c11));
        gVar.X(f11);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f55979d.cardinality() > 0) {
            Log.w(B, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f55976a.f56018s != 0) {
            canvas.drawPath(this.f55982g, this.f55991p.c());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f55977b[i11].b(this.f55991p, this.f55976a.f56017r, canvas);
            this.f55978c[i11].b(this.f55991p, this.f55976a.f56017r, canvas);
        }
        if (this.A) {
            int B2 = B();
            int C2 = C();
            canvas.translate(-B2, -C2);
            canvas.drawPath(this.f55982g, C);
            canvas.translate(B2, C2);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f55989n, this.f55982g, this.f55976a.f56000a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a11 = kVar.t().a(rectF) * this.f55976a.f56010k;
            canvas.drawRoundRect(rectF, a11, a11, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f55985j.set(u());
        float F = F();
        this.f55985j.inset(F, F);
        return this.f55985j;
    }

    public int A() {
        return this.f55996y;
    }

    public int B() {
        c cVar = this.f55976a;
        return (int) (cVar.f56018s * Math.sin(Math.toRadians(cVar.f56019t)));
    }

    public int C() {
        c cVar = this.f55976a;
        return (int) (cVar.f56018s * Math.cos(Math.toRadians(cVar.f56019t)));
    }

    public int D() {
        return this.f55976a.f56017r;
    }

    public k E() {
        return this.f55976a.f56000a;
    }

    public ColorStateList G() {
        return this.f55976a.f56006g;
    }

    public float H() {
        return this.f55976a.f56000a.r().a(u());
    }

    public float I() {
        return this.f55976a.f56000a.t().a(u());
    }

    public float J() {
        return this.f55976a.f56015p;
    }

    public float K() {
        return w() + J();
    }

    public void O(Context context) {
        this.f55976a.f56001b = new nk.a(context);
        l0();
    }

    public boolean Q() {
        nk.a aVar = this.f55976a.f56001b;
        return aVar != null && aVar.d();
    }

    public boolean R() {
        return this.f55976a.f56000a.u(u());
    }

    public boolean V() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 21 || !(R() || this.f55982g.isConvex() || i11 >= 29);
    }

    public void W(wk.c cVar) {
        setShapeAppearanceModel(this.f55976a.f56000a.x(cVar));
    }

    public void X(float f11) {
        c cVar = this.f55976a;
        if (cVar.f56014o != f11) {
            cVar.f56014o = f11;
            l0();
        }
    }

    public void Y(ColorStateList colorStateList) {
        c cVar = this.f55976a;
        if (cVar.f56003d != colorStateList) {
            cVar.f56003d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Z(float f11) {
        c cVar = this.f55976a;
        if (cVar.f56010k != f11) {
            cVar.f56010k = f11;
            this.f55980e = true;
            invalidateSelf();
        }
    }

    public void a0(int i11, int i12, int i13, int i14) {
        c cVar = this.f55976a;
        if (cVar.f56008i == null) {
            cVar.f56008i = new Rect();
        }
        this.f55976a.f56008i.set(i11, i12, i13, i14);
        invalidateSelf();
    }

    public void b0(float f11) {
        c cVar = this.f55976a;
        if (cVar.f56013n != f11) {
            cVar.f56013n = f11;
            l0();
        }
    }

    public void c0(boolean z11) {
        this.A = z11;
    }

    public void d0(int i11) {
        this.f55991p.d(i11);
        this.f55976a.f56020u = false;
        P();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f55989n.setColorFilter(this.f55994w);
        int alpha = this.f55989n.getAlpha();
        this.f55989n.setAlpha(T(alpha, this.f55976a.f56012m));
        this.f55990o.setColorFilter(this.f55995x);
        this.f55990o.setStrokeWidth(this.f55976a.f56011l);
        int alpha2 = this.f55990o.getAlpha();
        this.f55990o.setAlpha(T(alpha2, this.f55976a.f56012m));
        if (this.f55980e) {
            i();
            g(u(), this.f55982g);
            this.f55980e = false;
        }
        S(canvas);
        if (M()) {
            o(canvas);
        }
        if (N()) {
            r(canvas);
        }
        this.f55989n.setAlpha(alpha);
        this.f55990o.setAlpha(alpha2);
    }

    public void e0(int i11) {
        c cVar = this.f55976a;
        if (cVar.f56019t != i11) {
            cVar.f56019t = i11;
            P();
        }
    }

    public void f0(float f11, int i11) {
        i0(f11);
        h0(ColorStateList.valueOf(i11));
    }

    public void g0(float f11, ColorStateList colorStateList) {
        i0(f11);
        h0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f55976a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f55976a.f56016q == 2) {
            return;
        }
        if (R()) {
            outline.setRoundRect(getBounds(), H() * this.f55976a.f56010k);
            return;
        }
        g(u(), this.f55982g);
        if (this.f55982g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f55982g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f55976a.f56008i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f55986k.set(getBounds());
        g(u(), this.f55982g);
        this.f55987l.setPath(this.f55982g, this.f55986k);
        this.f55986k.op(this.f55987l, Region.Op.DIFFERENCE);
        return this.f55986k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f55993t;
        c cVar = this.f55976a;
        lVar.e(cVar.f56000a, cVar.f56010k, rectF, this.f55992q, path);
    }

    public void h0(ColorStateList colorStateList) {
        c cVar = this.f55976a;
        if (cVar.f56004e != colorStateList) {
            cVar.f56004e = colorStateList;
            onStateChange(getState());
        }
    }

    public void i0(float f11) {
        this.f55976a.f56011l = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f55980e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f55976a.f56006g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f55976a.f56005f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f55976a.f56004e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f55976a.f56003d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i11) {
        float K = K() + z();
        nk.a aVar = this.f55976a.f56001b;
        return aVar != null ? aVar.c(i11, K) : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f55976a = new c(this.f55976a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f55980e = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z11 = j0(iArr) || k0();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f55976a.f56000a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.f55990o, this.f55983h, this.f55988m, v());
    }

    public float s() {
        return this.f55976a.f56000a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        c cVar = this.f55976a;
        if (cVar.f56012m != i11) {
            cVar.f56012m = i11;
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f55976a.f56002c = colorFilter;
        P();
    }

    @Override // wk.n
    public void setShapeAppearanceModel(k kVar) {
        this.f55976a.f56000a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f55976a.f56006g = colorStateList;
        k0();
        P();
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f55976a;
        if (cVar.f56007h != mode) {
            cVar.f56007h = mode;
            k0();
            P();
        }
    }

    public float t() {
        return this.f55976a.f56000a.l().a(u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF u() {
        this.f55984i.set(getBounds());
        return this.f55984i;
    }

    public float w() {
        return this.f55976a.f56014o;
    }

    public ColorStateList x() {
        return this.f55976a.f56003d;
    }

    public float y() {
        return this.f55976a.f56010k;
    }

    public float z() {
        return this.f55976a.f56013n;
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(k.e(context, attributeSet, i11, i12).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        this.f55977b = new m.g[4];
        this.f55978c = new m.g[4];
        this.f55979d = new BitSet(8);
        this.f55981f = new Matrix();
        this.f55982g = new Path();
        this.f55983h = new Path();
        this.f55984i = new RectF();
        this.f55985j = new RectF();
        this.f55986k = new Region();
        this.f55987l = new Region();
        Paint paint = new Paint(1);
        this.f55989n = paint;
        Paint paint2 = new Paint(1);
        this.f55990o = paint2;
        this.f55991p = new vk.a();
        this.f55993t = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f55997z = new RectF();
        this.A = true;
        this.f55976a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k0();
        j0(getState());
        this.f55992q = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f56000a;

        /* renamed from: b  reason: collision with root package name */
        public nk.a f56001b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f56002c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f56003d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f56004e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f56005f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f56006g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f56007h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f56008i;

        /* renamed from: j  reason: collision with root package name */
        public float f56009j;

        /* renamed from: k  reason: collision with root package name */
        public float f56010k;

        /* renamed from: l  reason: collision with root package name */
        public float f56011l;

        /* renamed from: m  reason: collision with root package name */
        public int f56012m;

        /* renamed from: n  reason: collision with root package name */
        public float f56013n;

        /* renamed from: o  reason: collision with root package name */
        public float f56014o;

        /* renamed from: p  reason: collision with root package name */
        public float f56015p;

        /* renamed from: q  reason: collision with root package name */
        public int f56016q;

        /* renamed from: r  reason: collision with root package name */
        public int f56017r;

        /* renamed from: s  reason: collision with root package name */
        public int f56018s;

        /* renamed from: t  reason: collision with root package name */
        public int f56019t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f56020u;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f56021v;

        public c(k kVar, nk.a aVar) {
            this.f56003d = null;
            this.f56004e = null;
            this.f56005f = null;
            this.f56006g = null;
            this.f56007h = PorterDuff.Mode.SRC_IN;
            this.f56008i = null;
            this.f56009j = 1.0f;
            this.f56010k = 1.0f;
            this.f56012m = 255;
            this.f56013n = BitmapDescriptorFactory.HUE_RED;
            this.f56014o = BitmapDescriptorFactory.HUE_RED;
            this.f56015p = BitmapDescriptorFactory.HUE_RED;
            this.f56016q = 0;
            this.f56017r = 0;
            this.f56018s = 0;
            this.f56019t = 0;
            this.f56020u = false;
            this.f56021v = Paint.Style.FILL_AND_STROKE;
            this.f56000a = kVar;
            this.f56001b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f55980e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f56003d = null;
            this.f56004e = null;
            this.f56005f = null;
            this.f56006g = null;
            this.f56007h = PorterDuff.Mode.SRC_IN;
            this.f56008i = null;
            this.f56009j = 1.0f;
            this.f56010k = 1.0f;
            this.f56012m = 255;
            this.f56013n = BitmapDescriptorFactory.HUE_RED;
            this.f56014o = BitmapDescriptorFactory.HUE_RED;
            this.f56015p = BitmapDescriptorFactory.HUE_RED;
            this.f56016q = 0;
            this.f56017r = 0;
            this.f56018s = 0;
            this.f56019t = 0;
            this.f56020u = false;
            this.f56021v = Paint.Style.FILL_AND_STROKE;
            this.f56000a = cVar.f56000a;
            this.f56001b = cVar.f56001b;
            this.f56011l = cVar.f56011l;
            this.f56002c = cVar.f56002c;
            this.f56003d = cVar.f56003d;
            this.f56004e = cVar.f56004e;
            this.f56007h = cVar.f56007h;
            this.f56006g = cVar.f56006g;
            this.f56012m = cVar.f56012m;
            this.f56009j = cVar.f56009j;
            this.f56018s = cVar.f56018s;
            this.f56016q = cVar.f56016q;
            this.f56020u = cVar.f56020u;
            this.f56010k = cVar.f56010k;
            this.f56013n = cVar.f56013n;
            this.f56014o = cVar.f56014o;
            this.f56015p = cVar.f56015p;
            this.f56017r = cVar.f56017r;
            this.f56019t = cVar.f56019t;
            this.f56005f = cVar.f56005f;
            this.f56021v = cVar.f56021v;
            if (cVar.f56008i != null) {
                this.f56008i = new Rect(cVar.f56008i);
            }
        }
    }
}