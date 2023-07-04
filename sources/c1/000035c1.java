package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.f;
import fk.j;
import tk.c;
import uk.b;
import wk.d;
import wk.e;
import wk.g;
import wk.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    private static final double f15069t = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f15070a;

    /* renamed from: c  reason: collision with root package name */
    private final g f15072c;

    /* renamed from: d  reason: collision with root package name */
    private final g f15073d;

    /* renamed from: e  reason: collision with root package name */
    private int f15074e;

    /* renamed from: f  reason: collision with root package name */
    private int f15075f;

    /* renamed from: g  reason: collision with root package name */
    private int f15076g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f15077h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f15078i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f15079j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f15080k;

    /* renamed from: l  reason: collision with root package name */
    private k f15081l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f15082m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f15083n;

    /* renamed from: o  reason: collision with root package name */
    private LayerDrawable f15084o;

    /* renamed from: p  reason: collision with root package name */
    private g f15085p;

    /* renamed from: q  reason: collision with root package name */
    private g f15086q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15088s;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f15071b = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private boolean f15087r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0271a extends InsetDrawable {
        C0271a(a aVar, Drawable drawable, int i11, int i12, int i13, int i14) {
            super(drawable, i11, i12, i13, i14);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i11, int i12) {
        this.f15070a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i11, i12);
        this.f15072c = gVar;
        gVar.O(materialCardView.getContext());
        gVar.d0(-12303292);
        k.b v11 = gVar.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, fk.k.P, i11, j.f26497a);
        int i13 = fk.k.Q;
        if (obtainStyledAttributes.hasValue(i13)) {
            v11.o(obtainStyledAttributes.getDimension(i13, BitmapDescriptorFactory.HUE_RED));
        }
        this.f15073d = new g();
        R(v11.m());
        obtainStyledAttributes.recycle();
    }

    private Drawable A(Drawable drawable) {
        int ceil;
        int i11;
        if ((Build.VERSION.SDK_INT < 21) || this.f15070a.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(d());
            ceil = (int) Math.ceil(c());
            i11 = ceil2;
        } else {
            ceil = 0;
            i11 = 0;
        }
        return new C0271a(this, drawable, ceil, i11, ceil, i11);
    }

    private boolean V() {
        return this.f15070a.getPreventCornerOverlap() && !e();
    }

    private boolean W() {
        return this.f15070a.getPreventCornerOverlap() && e() && this.f15070a.getUseCompatPadding();
    }

    private float a() {
        return Math.max(Math.max(b(this.f15081l.q(), this.f15072c.H()), b(this.f15081l.s(), this.f15072c.I())), Math.max(b(this.f15081l.k(), this.f15072c.t()), b(this.f15081l.i(), this.f15072c.s())));
    }

    private void a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f15070a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f15070a.getForeground()).setDrawable(drawable);
        } else {
            this.f15070a.setForeground(A(drawable));
        }
    }

    private float b(d dVar, float f11) {
        if (dVar instanceof wk.j) {
            return (float) ((1.0d - f15069t) * f11);
        }
        return dVar instanceof e ? f11 / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private float c() {
        return this.f15070a.getMaxCardElevation() + (W() ? a() : BitmapDescriptorFactory.HUE_RED);
    }

    private void c0() {
        Drawable drawable;
        if (b.f53537a && (drawable = this.f15083n) != null) {
            ((RippleDrawable) drawable).setColor(this.f15079j);
            return;
        }
        g gVar = this.f15085p;
        if (gVar != null) {
            gVar.Y(this.f15079j);
        }
    }

    private float d() {
        return (this.f15070a.getMaxCardElevation() * 1.5f) + (W() ? a() : BitmapDescriptorFactory.HUE_RED);
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.f15072c.R();
    }

    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g h11 = h();
        this.f15085p = h11;
        h11.Y(this.f15079j);
        stateListDrawable.addState(new int[]{16842919}, this.f15085p);
        return stateListDrawable;
    }

    private Drawable g() {
        if (b.f53537a) {
            this.f15086q = h();
            return new RippleDrawable(this.f15079j, null, this.f15086q);
        }
        return f();
    }

    private g h() {
        return new g(this.f15081l);
    }

    private Drawable q() {
        if (this.f15083n == null) {
            this.f15083n = g();
        }
        if (this.f15084o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f15083n, this.f15073d, this.f15078i});
            this.f15084o = layerDrawable;
            layerDrawable.setId(2, f.B);
        }
        return this.f15084o;
    }

    private float s() {
        return this.f15070a.getPreventCornerOverlap() ? (Build.VERSION.SDK_INT < 21 || this.f15070a.getUseCompatPadding()) ? (float) ((1.0d - f15069t) * this.f15070a.getCardViewRadius()) : BitmapDescriptorFactory.HUE_RED : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.f15087r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C() {
        return this.f15088s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(TypedArray typedArray) {
        ColorStateList a11 = c.a(this.f15070a.getContext(), typedArray, fk.k.f26623r2);
        this.f15082m = a11;
        if (a11 == null) {
            this.f15082m = ColorStateList.valueOf(-1);
        }
        this.f15076g = typedArray.getDimensionPixelSize(fk.k.f26629s2, 0);
        boolean z11 = typedArray.getBoolean(fk.k.f26581k2, false);
        this.f15088s = z11;
        this.f15070a.setLongClickable(z11);
        this.f15080k = c.a(this.f15070a.getContext(), typedArray, fk.k.f26611p2);
        K(c.d(this.f15070a.getContext(), typedArray, fk.k.f26593m2));
        M(typedArray.getDimensionPixelSize(fk.k.f26605o2, 0));
        L(typedArray.getDimensionPixelSize(fk.k.f26599n2, 0));
        ColorStateList a12 = c.a(this.f15070a.getContext(), typedArray, fk.k.f26617q2);
        this.f15079j = a12;
        if (a12 == null) {
            this.f15079j = ColorStateList.valueOf(kk.a.d(this.f15070a, fk.b.f26374j));
        }
        H(c.a(this.f15070a.getContext(), typedArray, fk.k.f26587l2));
        c0();
        Z();
        d0();
        this.f15070a.setBackgroundInternal(A(this.f15072c));
        Drawable q11 = this.f15070a.isClickable() ? q() : this.f15073d;
        this.f15077h = q11;
        this.f15070a.setForeground(A(q11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int i11, int i12) {
        int i13;
        int i14;
        if (this.f15084o != null) {
            int i15 = this.f15074e;
            int i16 = this.f15075f;
            int i17 = (i11 - i15) - i16;
            int i18 = (i12 - i15) - i16;
            if ((Build.VERSION.SDK_INT < 21) || this.f15070a.getUseCompatPadding()) {
                i18 -= (int) Math.ceil(d() * 2.0f);
                i17 -= (int) Math.ceil(c() * 2.0f);
            }
            int i19 = i18;
            int i21 = this.f15074e;
            if (a0.F(this.f15070a) == 1) {
                i14 = i17;
                i13 = i21;
            } else {
                i13 = i17;
                i14 = i21;
            }
            this.f15084o.setLayerInset(2, i13, this.f15074e, i14, i19);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(boolean z11) {
        this.f15087r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.f15072c.Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(ColorStateList colorStateList) {
        g gVar = this.f15073d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.Y(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z11) {
        this.f15088s = z11;
    }

    public void J(boolean z11) {
        Drawable drawable = this.f15078i;
        if (drawable != null) {
            drawable.setAlpha(z11 ? 255 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(Drawable drawable) {
        this.f15078i = drawable;
        if (drawable != null) {
            Drawable mutate = n3.a.r(drawable).mutate();
            this.f15078i = mutate;
            n3.a.o(mutate, this.f15080k);
            J(this.f15070a.isChecked());
        }
        LayerDrawable layerDrawable = this.f15084o;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.B, this.f15078i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(int i11) {
        this.f15074e = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(int i11) {
        this.f15075f = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(ColorStateList colorStateList) {
        this.f15080k = colorStateList;
        Drawable drawable = this.f15078i;
        if (drawable != null) {
            n3.a.o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(float f11) {
        R(this.f15081l.w(f11));
        this.f15077h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(float f11) {
        this.f15072c.Z(f11);
        g gVar = this.f15073d;
        if (gVar != null) {
            gVar.Z(f11);
        }
        g gVar2 = this.f15086q;
        if (gVar2 != null) {
            gVar2.Z(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(ColorStateList colorStateList) {
        this.f15079j = colorStateList;
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(k kVar) {
        this.f15081l = kVar;
        this.f15072c.setShapeAppearanceModel(kVar);
        g gVar = this.f15072c;
        gVar.c0(!gVar.R());
        g gVar2 = this.f15073d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f15086q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f15085p;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        if (this.f15082m == colorStateList) {
            return;
        }
        this.f15082m = colorStateList;
        d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i11) {
        if (i11 == this.f15076g) {
            return;
        }
        this.f15076g = i11;
        d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(int i11, int i12, int i13, int i14) {
        this.f15071b.set(i11, i12, i13, i14);
        Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        Drawable drawable = this.f15077h;
        Drawable q11 = this.f15070a.isClickable() ? q() : this.f15073d;
        this.f15077h = q11;
        if (drawable != q11) {
            a0(q11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        int a11 = (int) ((V() || W() ? a() : BitmapDescriptorFactory.HUE_RED) - s());
        MaterialCardView materialCardView = this.f15070a;
        Rect rect = this.f15071b;
        materialCardView.g(rect.left + a11, rect.top + a11, rect.right + a11, rect.bottom + a11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        this.f15072c.X(this.f15070a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0() {
        if (!B()) {
            this.f15070a.setBackgroundInternal(A(this.f15072c));
        }
        this.f15070a.setForeground(A(this.f15077h));
    }

    void d0() {
        this.f15073d.g0(this.f15076g, this.f15082m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f15083n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i11 = bounds.bottom;
            this.f15083n.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
            this.f15083n.setBounds(bounds.left, bounds.top, bounds.right, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g j() {
        return this.f15072c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList k() {
        return this.f15072c.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f15073d.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable m() {
        return this.f15078i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f15074e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f15075f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList p() {
        return this.f15080k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.f15072c.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.f15072c.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList u() {
        return this.f15079j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k v() {
        return this.f15081l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int w() {
        ColorStateList colorStateList = this.f15082m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f15082m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y() {
        return this.f15076g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect z() {
        return this.f15071b;
    }
}