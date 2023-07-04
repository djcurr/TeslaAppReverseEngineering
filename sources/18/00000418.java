package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final e IMPL;
    private final d mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f2676a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void b(int i11, int i12, int i13, int i14) {
            CardView.this.mShadowBounds.set(i11, i12, i13, i14);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f2676a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable e() {
            return this.f2676a;
        }

        @Override // androidx.cardview.widget.d
        public void f(int i11, int i12) {
            CardView cardView = CardView.this;
            if (i11 > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i11);
            }
            CardView cardView2 = CardView.this;
            if (i12 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i12);
            }
        }

        @Override // androidx.cardview.widget.d
        public boolean g() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View h() {
            return CardView.this;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            IMPL = new b();
        } else if (i11 >= 17) {
            IMPL = new androidx.cardview.widget.a();
        } else {
            IMPL = new c();
        }
        IMPL.l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.e(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.i(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.d(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        e eVar = IMPL;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.m(this.mCardViewDelegate)), View.MeasureSpec.getSize(i11)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i12 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i12)), mode2);
            }
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        IMPL.n(this.mCardViewDelegate, ColorStateList.valueOf(i11));
    }

    public void setCardElevation(float f11) {
        IMPL.c(this.mCardViewDelegate, f11);
    }

    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.mContentPadding.set(i11, i12, i13, i14);
        IMPL.k(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f11) {
        IMPL.o(this.mCardViewDelegate, f11);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i11) {
        this.mUserSetMinHeight = i11;
        super.setMinimumHeight(i11);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i11) {
        this.mUserSetMinWidth = i11;
        super.setMinimumWidth(i11);
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z11;
            IMPL.g(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f11) {
        IMPL.a(this.mCardViewDelegate, f11);
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.mCompatPadding != z11) {
            this.mCompatPadding = z11;
            IMPL.j(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.f33007a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a();
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.e.f33014a, i11, j0.d.f33013a);
        int i12 = j0.e.f33017d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(j0.b.f33009b);
            } else {
                color = getResources().getColor(j0.b.f33008a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(j0.e.f33018e, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = obtainStyledAttributes.getDimension(j0.e.f33019f, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = obtainStyledAttributes.getDimension(j0.e.f33020g, BitmapDescriptorFactory.HUE_RED);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(j0.e.f33022i, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(j0.e.f33021h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33023j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33025l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33027n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33026m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33024k, dimensionPixelSize);
        float f11 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33015b, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(j0.e.f33016c, 0);
        obtainStyledAttributes.recycle();
        IMPL.h(aVar, context, colorStateList, dimension, dimension2, f11);
    }
}