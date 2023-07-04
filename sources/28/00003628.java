package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.g;
import tk.a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f15380k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final Paint f15381l0;
    private tk.a A;
    private CharSequence B;
    private CharSequence C;
    private boolean D;
    private boolean F;
    private Bitmap G;
    private Paint H;
    private float I;
    private float J;
    private int[] K;
    private boolean L;
    private final TextPaint M;
    private final TextPaint N;
    private TimeInterpolator O;
    private TimeInterpolator P;
    private float Q;
    private float R;
    private float S;
    private ColorStateList T;
    private float U;
    private float V;
    private float W;
    private ColorStateList X;
    private float Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f15382a;

    /* renamed from: a0  reason: collision with root package name */
    private StaticLayout f15383a0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15384b;

    /* renamed from: b0  reason: collision with root package name */
    private float f15385b0;

    /* renamed from: c  reason: collision with root package name */
    private float f15386c;

    /* renamed from: c0  reason: collision with root package name */
    private float f15387c0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15388d;

    /* renamed from: d0  reason: collision with root package name */
    private float f15389d0;

    /* renamed from: e  reason: collision with root package name */
    private float f15390e;

    /* renamed from: e0  reason: collision with root package name */
    private float f15391e0;

    /* renamed from: f  reason: collision with root package name */
    private float f15392f;

    /* renamed from: f0  reason: collision with root package name */
    private CharSequence f15393f0;

    /* renamed from: g  reason: collision with root package name */
    private int f15394g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f15396h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f15398i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f15400j;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f15406o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f15407p;

    /* renamed from: q  reason: collision with root package name */
    private float f15408q;

    /* renamed from: r  reason: collision with root package name */
    private float f15409r;

    /* renamed from: s  reason: collision with root package name */
    private float f15410s;

    /* renamed from: t  reason: collision with root package name */
    private float f15411t;

    /* renamed from: u  reason: collision with root package name */
    private float f15412u;

    /* renamed from: v  reason: collision with root package name */
    private float f15413v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f15414w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f15415x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f15416y;

    /* renamed from: z  reason: collision with root package name */
    private tk.a f15417z;

    /* renamed from: k  reason: collision with root package name */
    private int f15402k = 16;

    /* renamed from: l  reason: collision with root package name */
    private int f15403l = 16;

    /* renamed from: m  reason: collision with root package name */
    private float f15404m = 15.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f15405n = 15.0f;
    private boolean E = true;

    /* renamed from: g0  reason: collision with root package name */
    private int f15395g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    private float f15397h0 = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i0  reason: collision with root package name */
    private float f15399i0 = 1.0f;

    /* renamed from: j0  reason: collision with root package name */
    private int f15401j0 = g.f15438n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0276a implements a.InterfaceC1155a {
        C0276a() {
        }

        @Override // tk.a.InterfaceC1155a
        public void a(Typeface typeface) {
            a.this.Q(typeface);
        }
    }

    static {
        f15380k0 = Build.VERSION.SDK_INT < 18;
        f15381l0 = null;
    }

    public a(View view) {
        this.f15382a = view;
        TextPaint textPaint = new TextPaint((int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f15398i = new Rect();
        this.f15396h = new Rect();
        this.f15400j = new RectF();
        this.f15392f = e();
    }

    private void A(float f11) {
        if (this.f15388d) {
            this.f15400j.set(f11 < this.f15392f ? this.f15396h : this.f15398i);
            return;
        }
        this.f15400j.left = F(this.f15396h.left, this.f15398i.left, f11, this.O);
        this.f15400j.top = F(this.f15408q, this.f15409r, f11, this.O);
        this.f15400j.right = F(this.f15396h.right, this.f15398i.right, f11, this.O);
        this.f15400j.bottom = F(this.f15396h.bottom, this.f15398i.bottom, f11, this.O);
    }

    private static boolean B(float f11, float f12) {
        return Math.abs(f11 - f12) < 0.001f;
    }

    private boolean C() {
        return a0.F(this.f15382a) == 1;
    }

    private boolean E(CharSequence charSequence, boolean z11) {
        return (z11 ? t3.f.f51618d : t3.f.f51617c).a(charSequence, 0, charSequence.length());
    }

    private static float F(float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return gk.a.a(f11, f12, f13);
    }

    private static boolean J(Rect rect, int i11, int i12, int i13, int i14) {
        return rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14;
    }

    private void N(float f11) {
        this.f15387c0 = f11;
        a0.n0(this.f15382a);
    }

    private boolean R(Typeface typeface) {
        tk.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f15414w != typeface) {
            this.f15414w = typeface;
            return true;
        }
        return false;
    }

    private void U(float f11) {
        this.f15389d0 = f11;
        a0.n0(this.f15382a);
    }

    private boolean Y(Typeface typeface) {
        tk.a aVar = this.f15417z;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f15415x != typeface) {
            this.f15415x = typeface;
            return true;
        }
        return false;
    }

    private static int a(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.argb((int) ((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), (int) ((Color.red(i11) * f12) + (Color.red(i12) * f11)), (int) ((Color.green(i11) * f12) + (Color.green(i12) * f11)), (int) ((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    private void a0(float f11) {
        h(f11);
        boolean z11 = f15380k0 && this.I != 1.0f;
        this.F = z11;
        if (z11) {
            n();
        }
        a0.n0(this.f15382a);
    }

    private void b(boolean z11) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        float f11 = this.J;
        i(this.f15405n, z11);
        CharSequence charSequence = this.C;
        if (charSequence != null && (staticLayout2 = this.f15383a0) != null) {
            this.f15393f0 = TextUtils.ellipsize(charSequence, this.M, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f15393f0;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (charSequence2 != null) {
            TextPaint textPaint = new TextPaint(this.M);
            if (Build.VERSION.SDK_INT >= 21) {
                textPaint.setLetterSpacing(this.Y);
            }
            CharSequence charSequence3 = this.f15393f0;
            this.f15385b0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
        } else {
            this.f15385b0 = BitmapDescriptorFactory.HUE_RED;
        }
        int b11 = androidx.core.view.e.b(this.f15403l, this.D ? 1 : 0);
        int i11 = b11 & 112;
        if (i11 == 48) {
            this.f15409r = this.f15398i.top;
        } else if (i11 != 80) {
            this.f15409r = this.f15398i.centerY() - ((this.M.descent() - this.M.ascent()) / 2.0f);
        } else {
            this.f15409r = this.f15398i.bottom + this.M.ascent();
        }
        int i12 = b11 & 8388615;
        if (i12 == 1) {
            this.f15411t = this.f15398i.centerX() - (this.f15385b0 / 2.0f);
        } else if (i12 != 5) {
            this.f15411t = this.f15398i.left;
        } else {
            this.f15411t = this.f15398i.right - this.f15385b0;
        }
        i(this.f15404m, z11);
        float height = this.f15383a0 != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f15383a0;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        CharSequence charSequence4 = this.C;
        float measureText = charSequence4 != null ? this.M.measureText(charSequence4, 0, charSequence4.length()) : 0.0f;
        StaticLayout staticLayout4 = this.f15383a0;
        if (staticLayout4 != null && this.f15395g0 > 1) {
            measureText = staticLayout4.getWidth();
        }
        StaticLayout staticLayout5 = this.f15383a0;
        if (staticLayout5 != null) {
            f12 = this.f15395g0 > 1 ? staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0);
        }
        this.f15391e0 = f12;
        int b12 = androidx.core.view.e.b(this.f15402k, this.D ? 1 : 0);
        int i13 = b12 & 112;
        if (i13 == 48) {
            this.f15408q = this.f15396h.top;
        } else if (i13 != 80) {
            this.f15408q = this.f15396h.centerY() - (height / 2.0f);
        } else {
            this.f15408q = (this.f15396h.bottom - height) + this.M.descent();
        }
        int i14 = b12 & 8388615;
        if (i14 == 1) {
            this.f15410s = this.f15396h.centerX() - (measureText / 2.0f);
        } else if (i14 != 5) {
            this.f15410s = this.f15396h.left;
        } else {
            this.f15410s = this.f15396h.right - measureText;
        }
        j();
        a0(f11);
    }

    private void c() {
        g(this.f15386c);
    }

    private float d(float f11) {
        float f12 = this.f15392f;
        if (f11 <= f12) {
            return gk.a.b(1.0f, BitmapDescriptorFactory.HUE_RED, this.f15390e, f12, f11);
        }
        return gk.a.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f12, 1.0f, f11);
    }

    private float e() {
        float f11 = this.f15390e;
        return f11 + ((1.0f - f11) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean C = C();
        return this.E ? E(charSequence, C) : C;
    }

    private void g(float f11) {
        float f12;
        A(f11);
        if (this.f15388d) {
            if (f11 < this.f15392f) {
                this.f15412u = this.f15410s;
                this.f15413v = this.f15408q;
                a0(this.f15404m);
                f12 = 0.0f;
            } else {
                this.f15412u = this.f15411t;
                this.f15413v = this.f15409r - Math.max(0, this.f15394g);
                a0(this.f15405n);
                f12 = 1.0f;
            }
        } else {
            this.f15412u = F(this.f15410s, this.f15411t, f11, this.O);
            this.f15413v = F(this.f15408q, this.f15409r, f11, this.O);
            a0(F(this.f15404m, this.f15405n, f11, this.P));
            f12 = f11;
        }
        TimeInterpolator timeInterpolator = gk.a.f27994b;
        N(1.0f - F(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f11, timeInterpolator));
        U(F(1.0f, BitmapDescriptorFactory.HUE_RED, f11, timeInterpolator));
        if (this.f15407p != this.f15406o) {
            this.M.setColor(a(v(), t(), f12));
        } else {
            this.M.setColor(t());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f13 = this.Y;
            float f14 = this.Z;
            if (f13 != f14) {
                this.M.setLetterSpacing(F(f14, f13, f11, timeInterpolator));
            } else {
                this.M.setLetterSpacing(f13);
            }
        }
        this.M.setShadowLayer(F(this.U, this.Q, f11, null), F(this.V, this.R, f11, null), F(this.W, this.S, f11, null), a(u(this.X), u(this.T), f11));
        if (this.f15388d) {
            this.M.setAlpha((int) (d(f11) * this.M.getAlpha()));
        }
        a0.n0(this.f15382a);
    }

    private boolean g0() {
        return this.f15395g0 > 1 && (!this.D || this.f15388d) && !this.F;
    }

    private void h(float f11) {
        i(f11, false);
    }

    private void i(float f11, boolean z11) {
        boolean z12;
        float f12;
        boolean z13;
        if (this.B == null) {
            return;
        }
        float width = this.f15398i.width();
        float width2 = this.f15396h.width();
        if (B(f11, this.f15405n)) {
            f12 = this.f15405n;
            this.I = 1.0f;
            Typeface typeface = this.f15416y;
            Typeface typeface2 = this.f15414w;
            if (typeface != typeface2) {
                this.f15416y = typeface2;
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            float f13 = this.f15404m;
            Typeface typeface3 = this.f15416y;
            Typeface typeface4 = this.f15415x;
            if (typeface3 != typeface4) {
                this.f15416y = typeface4;
                z12 = true;
            } else {
                z12 = false;
            }
            if (B(f11, f13)) {
                this.I = 1.0f;
            } else {
                this.I = f11 / this.f15404m;
            }
            float f14 = this.f15405n / this.f15404m;
            width = (!z11 && width2 * f14 > width) ? Math.min(width / f14, width2) : width2;
            f12 = f13;
            z13 = z12;
        }
        if (width > BitmapDescriptorFactory.HUE_RED) {
            z13 = this.J != f12 || this.L || z13;
            this.J = f12;
            this.L = false;
        }
        if (this.C == null || z13) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.f15416y);
            this.M.setLinearText(this.I != 1.0f);
            this.D = f(this.B);
            StaticLayout k11 = k(g0() ? this.f15395g0 : 1, width, this.D);
            this.f15383a0 = k11;
            this.C = k11.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    private StaticLayout k(int i11, float f11, boolean z11) {
        StaticLayout staticLayout;
        try {
            staticLayout = g.c(this.B, this.M, (int) f11).e(TextUtils.TruncateAt.END).h(z11).d(Layout.Alignment.ALIGN_NORMAL).g(false).j(i11).i(this.f15397h0, this.f15399i0).f(this.f15401j0).a();
        } catch (g.a e11) {
            Log.e("CollapsingTextHelper", e11.getCause().getMessage(), e11);
            staticLayout = null;
        }
        return (StaticLayout) v3.h.f(staticLayout);
    }

    private void m(Canvas canvas, float f11, float f12) {
        int alpha = this.M.getAlpha();
        canvas.translate(f11, f12);
        float f13 = alpha;
        this.M.setAlpha((int) (this.f15389d0 * f13));
        this.f15383a0.draw(canvas);
        this.M.setAlpha((int) (this.f15387c0 * f13));
        int lineBaseline = this.f15383a0.getLineBaseline(0);
        CharSequence charSequence = this.f15393f0;
        float f14 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f14, this.M);
        if (this.f15388d) {
            return;
        }
        String trim = this.f15393f0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f15383a0.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f14, (Paint) this.M);
    }

    private void n() {
        if (this.G != null || this.f15396h.isEmpty() || TextUtils.isEmpty(this.C)) {
            return;
        }
        g(BitmapDescriptorFactory.HUE_RED);
        int width = this.f15383a0.getWidth();
        int height = this.f15383a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f15383a0.draw(new Canvas(this.G));
        if (this.H == null) {
            this.H = new Paint(3);
        }
    }

    private float r(int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) - (this.f15385b0 / 2.0f);
        }
        return ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) ? this.D ? this.f15398i.left : this.f15398i.right - this.f15385b0 : this.D ? this.f15398i.right - this.f15385b0 : this.f15398i.left;
    }

    private float s(RectF rectF, int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) + (this.f15385b0 / 2.0f);
        }
        return ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) ? this.D ? rectF.left + this.f15385b0 : this.f15398i.right : this.D ? this.f15398i.right : rectF.left + this.f15385b0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f15406o);
    }

    private void y(TextPaint textPaint) {
        textPaint.setTextSize(this.f15405n);
        textPaint.setTypeface(this.f15414w);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Y);
        }
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f15404m);
        textPaint.setTypeface(this.f15415x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Z);
        }
    }

    public final boolean D() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f15407p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f15406o) != null && colorStateList.isStateful());
    }

    void G() {
        this.f15384b = this.f15398i.width() > 0 && this.f15398i.height() > 0 && this.f15396h.width() > 0 && this.f15396h.height() > 0;
    }

    public void H() {
        I(false);
    }

    public void I(boolean z11) {
        if ((this.f15382a.getHeight() <= 0 || this.f15382a.getWidth() <= 0) && !z11) {
            return;
        }
        b(z11);
        c();
    }

    public void K(int i11, int i12, int i13, int i14) {
        if (J(this.f15398i, i11, i12, i13, i14)) {
            return;
        }
        this.f15398i.set(i11, i12, i13, i14);
        this.L = true;
        G();
    }

    public void L(Rect rect) {
        K(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void M(int i11) {
        tk.d dVar = new tk.d(this.f15382a.getContext(), i11);
        if (dVar.i() != null) {
            this.f15407p = dVar.i();
        }
        if (dVar.j() != BitmapDescriptorFactory.HUE_RED) {
            this.f15405n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f52324a;
        if (colorStateList != null) {
            this.T = colorStateList;
        }
        this.R = dVar.f52328e;
        this.S = dVar.f52329f;
        this.Q = dVar.f52330g;
        this.Y = dVar.f52332i;
        tk.a aVar = this.A;
        if (aVar != null) {
            aVar.c();
        }
        this.A = new tk.a(new C0276a(), dVar.e());
        dVar.h(this.f15382a.getContext(), this.A);
        H();
    }

    public void O(ColorStateList colorStateList) {
        if (this.f15407p != colorStateList) {
            this.f15407p = colorStateList;
            H();
        }
    }

    public void P(int i11) {
        if (this.f15403l != i11) {
            this.f15403l = i11;
            H();
        }
    }

    public void Q(Typeface typeface) {
        if (R(typeface)) {
            H();
        }
    }

    public void S(int i11, int i12, int i13, int i14) {
        if (J(this.f15396h, i11, i12, i13, i14)) {
            return;
        }
        this.f15396h.set(i11, i12, i13, i14);
        this.L = true;
        G();
    }

    public void T(Rect rect) {
        S(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void V(ColorStateList colorStateList) {
        if (this.f15406o != colorStateList) {
            this.f15406o = colorStateList;
            H();
        }
    }

    public void W(int i11) {
        if (this.f15402k != i11) {
            this.f15402k = i11;
            H();
        }
    }

    public void X(float f11) {
        if (this.f15404m != f11) {
            this.f15404m = f11;
            H();
        }
    }

    public void Z(float f11) {
        float a11 = p3.a.a(f11, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (a11 != this.f15386c) {
            this.f15386c = a11;
            c();
        }
    }

    public void b0(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        H();
    }

    public final boolean c0(int[] iArr) {
        this.K = iArr;
        if (D()) {
            H();
            return true;
        }
        return false;
    }

    public void d0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.B, charSequence)) {
            this.B = charSequence;
            this.C = null;
            j();
            H();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.P = timeInterpolator;
        H();
    }

    public void f0(Typeface typeface) {
        boolean R = R(typeface);
        boolean Y = Y(typeface);
        if (R || Y) {
            H();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.C == null || !this.f15384b) {
            return;
        }
        boolean z11 = true;
        float lineStart = (this.f15412u + (this.f15395g0 > 1 ? this.f15383a0.getLineStart(0) : this.f15383a0.getLineLeft(0))) - (this.f15391e0 * 2.0f);
        this.M.setTextSize(this.J);
        float f11 = this.f15412u;
        float f12 = this.f15413v;
        if (!this.F || this.G == null) {
            z11 = false;
        }
        float f13 = this.I;
        if (f13 != 1.0f && !this.f15388d) {
            canvas.scale(f13, f13, f11, f12);
        }
        if (z11) {
            canvas.drawBitmap(this.G, f11, f12, this.H);
            canvas.restoreToCount(save);
            return;
        }
        if (g0() && (!this.f15388d || this.f15386c > this.f15392f)) {
            m(canvas, lineStart, f12);
        } else {
            canvas.translate(f11, f12);
            this.f15383a0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i11, int i12) {
        this.D = f(this.B);
        rectF.left = r(i11, i12);
        rectF.top = this.f15398i.top;
        rectF.right = s(rectF, i11, i12);
        rectF.bottom = this.f15398i.top + q();
    }

    public ColorStateList p() {
        return this.f15407p;
    }

    public float q() {
        y(this.N);
        return -this.N.ascent();
    }

    public int t() {
        return u(this.f15407p);
    }

    public float w() {
        z(this.N);
        return -this.N.ascent();
    }

    public float x() {
        return this.f15386c;
    }
}