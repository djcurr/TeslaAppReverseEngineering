package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: x1  reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f1630x1 = new a(Float.class, "thumbPos");

    /* renamed from: y1  reason: collision with root package name */
    private static final int[] f1631y1 = {16842912};
    private int A;
    float B;
    private int C;
    private int E;
    private int F;
    private int G;
    private int H;
    private int K;
    private int L;
    private final TextPaint O;
    private ColorStateList P;
    private Layout Q;
    private Layout R;
    private TransformationMethod T;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f1632a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f1633b;

    /* renamed from: b1  reason: collision with root package name */
    ObjectAnimator f1634b1;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f1635c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1636d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1637e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1638f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f1639g;

    /* renamed from: g1  reason: collision with root package name */
    private final x f1640g1;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f1641h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1642i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1643j;

    /* renamed from: k  reason: collision with root package name */
    private int f1644k;

    /* renamed from: l  reason: collision with root package name */
    private int f1645l;

    /* renamed from: m  reason: collision with root package name */
    private int f1646m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1647n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f1648o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1649p;

    /* renamed from: p1  reason: collision with root package name */
    private final Rect f1650p1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1651q;

    /* renamed from: t  reason: collision with root package name */
    private int f1652t;

    /* renamed from: w  reason: collision with root package name */
    private int f1653w;

    /* renamed from: x  reason: collision with root package name */
    private float f1654x;

    /* renamed from: y  reason: collision with root package name */
    private float f1655y;

    /* renamed from: z  reason: collision with root package name */
    private VelocityTracker f1656z;

    /* loaded from: classes.dex */
    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.B);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f11) {
            switchCompat.setThumbPosition(f11.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private void a(boolean z11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1630x1, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        this.f1634b1 = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1634b1.setAutoCancel(true);
        }
        this.f1634b1.start();
    }

    private void b() {
        Drawable drawable = this.f1632a;
        if (drawable != null) {
            if (this.f1636d || this.f1637e) {
                Drawable mutate = n3.a.r(drawable).mutate();
                this.f1632a = mutate;
                if (this.f1636d) {
                    n3.a.o(mutate, this.f1633b);
                }
                if (this.f1637e) {
                    n3.a.p(this.f1632a, this.f1635c);
                }
                if (this.f1632a.isStateful()) {
                    this.f1632a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1638f;
        if (drawable != null) {
            if (this.f1642i || this.f1643j) {
                Drawable mutate = n3.a.r(drawable).mutate();
                this.f1638f = mutate;
                if (this.f1642i) {
                    n3.a.o(mutate, this.f1639g);
                }
                if (this.f1643j) {
                    n3.a.p(this.f1638f, this.f1641h);
                }
                if (this.f1638f.isStateful()) {
                    this.f1638f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f1634b1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
    }

    private boolean g(float f11, float f12) {
        if (this.f1632a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1632a.getPadding(this.f1650p1);
        int i11 = this.H;
        int i12 = this.f1653w;
        int i13 = i11 - i12;
        int i14 = (this.G + thumbOffset) - i12;
        Rect rect = this.f1650p1;
        return f11 > ((float) i14) && f11 < ((float) ((((this.F + i14) + rect.left) + rect.right) + i12)) && f12 > ((float) i13) && f12 < ((float) (this.L + i12));
    }

    private boolean getTargetCheckedState() {
        return this.B > 0.5f;
    }

    private int getThumbOffset() {
        float f11;
        if (a1.b(this)) {
            f11 = 1.0f - this.B;
        } else {
            f11 = this.B;
        }
        return (int) ((f11 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1638f;
        if (drawable != null) {
            Rect rect2 = this.f1650p1;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1632a;
            if (drawable2 != null) {
                rect = c0.d(drawable2);
            } else {
                rect = c0.f1735c;
            }
            return ((((this.C - this.F) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.T;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.O;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1649p;
            if (charSequence == null) {
                charSequence = getResources().getString(g.h.f27162b);
            }
            androidx.core.view.a0.M0(this, charSequence);
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1648o;
            if (charSequence == null) {
                charSequence = getResources().getString(g.h.f27163c);
            }
            androidx.core.view.a0.M0(this, charSequence);
        }
    }

    private void m(int i11, int i12) {
        Typeface typeface;
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        l(typeface, i12);
    }

    private void n(MotionEvent motionEvent) {
        this.f1652t = 0;
        boolean z11 = true;
        boolean z12 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z12) {
            this.f1656z.computeCurrentVelocity(1000);
            float xVelocity = this.f1656z.getXVelocity();
            if (Math.abs(xVelocity) > this.A) {
                if (!a1.b(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
                    z11 = false;
                }
            } else {
                z11 = getTargetCheckedState();
            }
        } else {
            z11 = isChecked;
        }
        if (z11 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z11);
        e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i11;
        int i12;
        Rect rect2 = this.f1650p1;
        int i13 = this.G;
        int i14 = this.H;
        int i15 = this.K;
        int i16 = this.L;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f1632a;
        if (drawable != null) {
            rect = c0.d(drawable);
        } else {
            rect = c0.f1735c;
        }
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i17 = rect2.left;
            thumbOffset += i17;
            if (rect != null) {
                int i18 = rect.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rect.top;
                int i21 = rect2.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = rect.right;
                int i23 = rect2.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rect.bottom;
                int i25 = rect2.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                    this.f1638f.setBounds(i13, i11, i15, i12);
                }
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f1638f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f1632a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i26 = thumbOffset - rect2.left;
            int i27 = thumbOffset + this.F + rect2.right;
            this.f1632a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                n3.a.l(background, i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f11, f12);
        }
        Drawable drawable = this.f1632a;
        if (drawable != null) {
            n3.a.k(drawable, f11, f12);
        }
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null) {
            n3.a.k(drawable2, f11, f12);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1632a;
        boolean z11 = false;
        if (drawable != null && drawable.isStateful()) {
            z11 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null && drawable2.isStateful()) {
            z11 |= drawable2.setState(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!a1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1646m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (a1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1646m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1651q;
    }

    public boolean getSplitTrack() {
        return this.f1647n;
    }

    public int getSwitchMinWidth() {
        return this.f1645l;
    }

    public int getSwitchPadding() {
        return this.f1646m;
    }

    public CharSequence getTextOff() {
        return this.f1649p;
    }

    public CharSequence getTextOn() {
        return this.f1648o;
    }

    public Drawable getThumbDrawable() {
        return this.f1632a;
    }

    public int getThumbTextPadding() {
        return this.f1644k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1633b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1635c;
    }

    public Drawable getTrackDrawable() {
        return this.f1638f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1639g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1641h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1632a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1634b1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1634b1.end();
        this.f1634b1 = null;
    }

    public void k(Context context, int i11) {
        u0 t11 = u0.t(context, i11, g.j.G2);
        ColorStateList c11 = t11.c(g.j.K2);
        if (c11 != null) {
            this.P = c11;
        } else {
            this.P = getTextColors();
        }
        int f11 = t11.f(g.j.H2, 0);
        if (f11 != 0) {
            float f12 = f11;
            if (f12 != this.O.getTextSize()) {
                this.O.setTextSize(f12);
                requestLayout();
            }
        }
        m(t11.k(g.j.I2, -1), t11.k(g.j.J2, -1));
        if (t11.a(g.j.R2, false)) {
            this.T = new k.a(getContext());
        } else {
            this.T = null;
        }
        t11.w();
    }

    public void l(Typeface typeface, int i11) {
        Typeface create;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (i11 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i11);
            } else {
                create = Typeface.create(typeface, i11);
            }
            setSwitchTypeface(create);
            int i12 = (~(create != null ? create.getStyle() : 0)) & i11;
            this.O.setFakeBoldText((i12 & 1) != 0);
            TextPaint textPaint = this.O;
            if ((i12 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint.setTextSkewX(f11);
            return;
        }
        this.O.setFakeBoldText(false);
        this.O.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setSwitchTypeface(typeface);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1631y1);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1650p1;
        Drawable drawable = this.f1638f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.H;
        int i12 = this.L;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f1632a;
        if (drawable != null) {
            if (this.f1647n && drawable2 != null) {
                Rect d11 = c0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d11.left;
                rect.right -= d11.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.Q : this.R;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.P;
            if (colorStateList != null) {
                this.O.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.O.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i13 + i14) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1648o : this.f1649p;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int width;
        int i16;
        int i17;
        int paddingTop;
        int i18;
        super.onLayout(z11, i11, i12, i13, i14);
        int i19 = 0;
        if (this.f1632a != null) {
            Rect rect = this.f1650p1;
            Drawable drawable = this.f1638f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d11 = c0.d(this.f1632a);
            i15 = Math.max(0, d11.left - rect.left);
            i19 = Math.max(0, d11.right - rect.right);
        } else {
            i15 = 0;
        }
        if (a1.b(this)) {
            i16 = getPaddingLeft() + i15;
            width = ((this.C + i16) - i15) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i16 = (width - this.C) + i15 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i17 = this.E;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i17 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i17 = this.E;
        } else {
            i18 = getHeight() - getPaddingBottom();
            paddingTop = i18 - this.E;
            this.G = i16;
            this.H = paddingTop;
            this.L = i18;
            this.K = width;
        }
        i18 = i17 + paddingTop;
        this.G = i16;
        this.H = paddingTop;
        this.L = i18;
        this.K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        if (this.f1651q) {
            if (this.Q == null) {
                this.Q = h(this.f1648o);
            }
            if (this.R == null) {
                this.R = h(this.f1649p);
            }
        }
        Rect rect = this.f1650p1;
        Drawable drawable = this.f1632a;
        int i15 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f1632a.getIntrinsicWidth() - rect.left) - rect.right;
            i14 = this.f1632a.getIntrinsicHeight();
        } else {
            i13 = 0;
            i14 = 0;
        }
        this.F = Math.max(this.f1651q ? Math.max(this.Q.getWidth(), this.R.getWidth()) + (this.f1644k * 2) : 0, i13);
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f1638f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f1632a;
        if (drawable3 != null) {
            Rect d11 = c0.d(drawable3);
            i16 = Math.max(i16, d11.left);
            i17 = Math.max(i17, d11.right);
        }
        int max = Math.max(this.f1645l, (this.F * 2) + i16 + i17);
        int max2 = Math.max(i15, i14);
        this.C = max;
        this.E = max2;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1648o : this.f1649p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1656z
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f1652t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1654x
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.a1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.B
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.B
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1654x = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1654x
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1653w
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1655y
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1653w
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1652t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1654x = r0
            r6.f1655y = r3
            return r1
        L89:
            int r0 = r6.f1652t
            if (r0 != r2) goto L94
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1652t = r0
            android.view.VelocityTracker r0 = r6.f1656z
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1652t = r1
            r6.f1654x = r0
            r6.f1655y = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean isChecked = isChecked();
        if (isChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() != null && androidx.core.view.a0.a0(this)) {
            a(isChecked);
            return;
        }
        d();
        setThumbPosition(isChecked ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.p(this, callback));
    }

    public void setShowText(boolean z11) {
        if (this.f1651q != z11) {
            this.f1651q = z11;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z11) {
        this.f1647n = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.f1645l = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.f1646m = i11;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.O.getTypeface() == null || this.O.getTypeface().equals(typeface)) && (this.O.getTypeface() != null || typeface == null)) {
            return;
        }
        this.O.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1649p = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1648o = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1632a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1632a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f11) {
        this.B = f11;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(h.a.d(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.f1644k = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1633b = colorStateList;
        this.f1636d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1635c = mode;
        this.f1637e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1638f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1638f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(h.a.d(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1639g = colorStateList;
        this.f1642i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1641h = mode;
        this.f1643j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1632a || drawable == this.f1638f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.K);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1633b = null;
        this.f1635c = null;
        this.f1636d = false;
        this.f1637e = false;
        this.f1639g = null;
        this.f1641h = null;
        this.f1642i = false;
        this.f1643j = false;
        this.f1656z = VelocityTracker.obtain();
        this.f1650p1 = new Rect();
        p0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.O = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = g.j.f27267r2;
        u0 v11 = u0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, v11.r(), i11, 0);
        Drawable g11 = v11.g(g.j.f27282u2);
        this.f1632a = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        Drawable g12 = v11.g(g.j.D2);
        this.f1638f = g12;
        if (g12 != null) {
            g12.setCallback(this);
        }
        this.f1648o = v11.p(g.j.f27272s2);
        this.f1649p = v11.p(g.j.f27277t2);
        this.f1651q = v11.a(g.j.f27287v2, true);
        this.f1644k = v11.f(g.j.A2, 0);
        this.f1645l = v11.f(g.j.f27297x2, 0);
        this.f1646m = v11.f(g.j.f27302y2, 0);
        this.f1647n = v11.a(g.j.f27292w2, false);
        ColorStateList c11 = v11.c(g.j.B2);
        if (c11 != null) {
            this.f1633b = c11;
            this.f1636d = true;
        }
        PorterDuff.Mode e11 = c0.e(v11.k(g.j.C2, -1), null);
        if (this.f1635c != e11) {
            this.f1635c = e11;
            this.f1637e = true;
        }
        if (this.f1636d || this.f1637e) {
            b();
        }
        ColorStateList c12 = v11.c(g.j.E2);
        if (c12 != null) {
            this.f1639g = c12;
            this.f1642i = true;
        }
        PorterDuff.Mode e12 = c0.e(v11.k(g.j.F2, -1), null);
        if (this.f1641h != e12) {
            this.f1641h = e12;
            this.f1643j = true;
        }
        if (this.f1642i || this.f1643j) {
            c();
        }
        int n11 = v11.n(g.j.f27307z2, 0);
        if (n11 != 0) {
            k(context, n11);
        }
        x xVar = new x(this);
        this.f1640g1 = xVar;
        xVar.m(attributeSet, i11);
        v11.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1653w = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}