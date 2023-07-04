package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.a0;
import com.google.android.material.internal.l;
import fk.b;
import tk.c;
import wk.g;
import wk.k;
import wk.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    private static final boolean f15039t;

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f15040u;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f15041a;

    /* renamed from: b  reason: collision with root package name */
    private k f15042b;

    /* renamed from: c  reason: collision with root package name */
    private int f15043c;

    /* renamed from: d  reason: collision with root package name */
    private int f15044d;

    /* renamed from: e  reason: collision with root package name */
    private int f15045e;

    /* renamed from: f  reason: collision with root package name */
    private int f15046f;

    /* renamed from: g  reason: collision with root package name */
    private int f15047g;

    /* renamed from: h  reason: collision with root package name */
    private int f15048h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f15049i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f15050j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f15051k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f15052l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f15053m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15054n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15055o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15056p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15057q;

    /* renamed from: r  reason: collision with root package name */
    private LayerDrawable f15058r;

    /* renamed from: s  reason: collision with root package name */
    private int f15059s;

    static {
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        f15039t = i11 >= 21;
        if (i11 < 21 || i11 > 22) {
            z11 = false;
        }
        f15040u = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f15041a = materialButton;
        this.f15042b = kVar;
    }

    private void E(int i11, int i12) {
        int K = a0.K(this.f15041a);
        int paddingTop = this.f15041a.getPaddingTop();
        int J = a0.J(this.f15041a);
        int paddingBottom = this.f15041a.getPaddingBottom();
        int i13 = this.f15045e;
        int i14 = this.f15046f;
        this.f15046f = i12;
        this.f15045e = i11;
        if (!this.f15055o) {
            F();
        }
        a0.K0(this.f15041a, K, (paddingTop + i11) - i13, J, (paddingBottom + i12) - i14);
    }

    private void F() {
        this.f15041a.setInternalBackground(a());
        g f11 = f();
        if (f11 != null) {
            f11.X(this.f15059s);
        }
    }

    private void G(k kVar) {
        if (f15040u && !this.f15055o) {
            int K = a0.K(this.f15041a);
            int paddingTop = this.f15041a.getPaddingTop();
            int J = a0.J(this.f15041a);
            int paddingBottom = this.f15041a.getPaddingBottom();
            F();
            a0.K0(this.f15041a, K, paddingTop, J, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void I() {
        g f11 = f();
        g n11 = n();
        if (f11 != null) {
            f11.g0(this.f15048h, this.f15051k);
            if (n11 != null) {
                n11.f0(this.f15048h, this.f15054n ? kk.a.d(this.f15041a, b.f26378n) : 0);
            }
        }
    }

    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f15043c, this.f15045e, this.f15044d, this.f15046f);
    }

    private Drawable a() {
        g gVar = new g(this.f15042b);
        gVar.O(this.f15041a.getContext());
        n3.a.o(gVar, this.f15050j);
        PorterDuff.Mode mode = this.f15049i;
        if (mode != null) {
            n3.a.p(gVar, mode);
        }
        gVar.g0(this.f15048h, this.f15051k);
        g gVar2 = new g(this.f15042b);
        gVar2.setTint(0);
        gVar2.f0(this.f15048h, this.f15054n ? kk.a.d(this.f15041a, b.f26378n) : 0);
        if (f15039t) {
            g gVar3 = new g(this.f15042b);
            this.f15053m = gVar3;
            n3.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(uk.b.a(this.f15052l), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f15053m);
            this.f15058r = rippleDrawable;
            return rippleDrawable;
        }
        uk.a aVar = new uk.a(this.f15042b);
        this.f15053m = aVar;
        n3.a.o(aVar, uk.b.a(this.f15052l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f15053m});
        this.f15058r = layerDrawable;
        return J(layerDrawable);
    }

    private g g(boolean z11) {
        LayerDrawable layerDrawable = this.f15058r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f15039t) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f15058r.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
        }
        return (g) this.f15058r.getDrawable(!z11 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(ColorStateList colorStateList) {
        if (this.f15051k != colorStateList) {
            this.f15051k = colorStateList;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i11) {
        if (this.f15048h != i11) {
            this.f15048h = i11;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(ColorStateList colorStateList) {
        if (this.f15050j != colorStateList) {
            this.f15050j = colorStateList;
            if (f() != null) {
                n3.a.o(f(), this.f15050j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(PorterDuff.Mode mode) {
        if (this.f15049i != mode) {
            this.f15049i = mode;
            if (f() == null || this.f15049i == null) {
                return;
            }
            n3.a.p(f(), this.f15049i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i11, int i12) {
        Drawable drawable = this.f15053m;
        if (drawable != null) {
            drawable.setBounds(this.f15043c, this.f15045e, i12 - this.f15044d, i11 - this.f15046f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f15047g;
    }

    public int c() {
        return this.f15046f;
    }

    public int d() {
        return this.f15045e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f15058r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f15058r.getNumberOfLayers() > 2) {
            return (n) this.f15058r.getDrawable(2);
        }
        return (n) this.f15058r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f15052l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return this.f15042b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f15051k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f15048h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f15050j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f15049i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f15055o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f15057q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(TypedArray typedArray) {
        this.f15043c = typedArray.getDimensionPixelOffset(fk.k.f26634t1, 0);
        this.f15044d = typedArray.getDimensionPixelOffset(fk.k.f26640u1, 0);
        this.f15045e = typedArray.getDimensionPixelOffset(fk.k.f26646v1, 0);
        this.f15046f = typedArray.getDimensionPixelOffset(fk.k.f26652w1, 0);
        int i11 = fk.k.A1;
        if (typedArray.hasValue(i11)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            this.f15047g = dimensionPixelSize;
            y(this.f15042b.w(dimensionPixelSize));
            this.f15056p = true;
        }
        this.f15048h = typedArray.getDimensionPixelSize(fk.k.K1, 0);
        this.f15049i = l.e(typedArray.getInt(fk.k.f26670z1, -1), PorterDuff.Mode.SRC_IN);
        this.f15050j = c.a(this.f15041a.getContext(), typedArray, fk.k.f26664y1);
        this.f15051k = c.a(this.f15041a.getContext(), typedArray, fk.k.J1);
        this.f15052l = c.a(this.f15041a.getContext(), typedArray, fk.k.I1);
        this.f15057q = typedArray.getBoolean(fk.k.f26658x1, false);
        this.f15059s = typedArray.getDimensionPixelSize(fk.k.B1, 0);
        int K = a0.K(this.f15041a);
        int paddingTop = this.f15041a.getPaddingTop();
        int J = a0.J(this.f15041a);
        int paddingBottom = this.f15041a.getPaddingBottom();
        if (typedArray.hasValue(fk.k.f26628s1)) {
            s();
        } else {
            F();
        }
        a0.K0(this.f15041a, K + this.f15043c, paddingTop + this.f15045e, J + this.f15044d, paddingBottom + this.f15046f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i11) {
        if (f() != null) {
            f().setTint(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.f15055o = true;
        this.f15041a.setSupportBackgroundTintList(this.f15050j);
        this.f15041a.setSupportBackgroundTintMode(this.f15049i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(boolean z11) {
        this.f15057q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i11) {
        if (this.f15056p && this.f15047g == i11) {
            return;
        }
        this.f15047g = i11;
        this.f15056p = true;
        y(this.f15042b.w(i11));
    }

    public void v(int i11) {
        E(this.f15045e, i11);
    }

    public void w(int i11) {
        E(i11, this.f15046f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f15052l != colorStateList) {
            this.f15052l = colorStateList;
            boolean z11 = f15039t;
            if (z11 && (this.f15041a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f15041a.getBackground()).setColor(uk.b.a(colorStateList));
            } else if (z11 || !(this.f15041a.getBackground() instanceof uk.a)) {
            } else {
                ((uk.a) this.f15041a.getBackground()).setTintList(uk.b.a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(k kVar) {
        this.f15042b = kVar;
        G(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z11) {
        this.f15054n = z11;
        I();
    }
}