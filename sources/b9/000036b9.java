package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.timepicker.ClockHandView;
import fk.d;
import fk.f;
import fk.h;
import fk.j;
import fk.k;
import java.util.Arrays;
import w3.c;

/* loaded from: classes3.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {

    /* renamed from: d  reason: collision with root package name */
    private final ClockHandView f15752d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f15753e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f15754f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<TextView> f15755g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.core.view.a f15756h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f15757i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f15758j;

    /* renamed from: k  reason: collision with root package name */
    private final int f15759k;

    /* renamed from: l  reason: collision with root package name */
    private final int f15760l;

    /* renamed from: m  reason: collision with root package name */
    private final int f15761m;

    /* renamed from: n  reason: collision with root package name */
    private final int f15762n;

    /* renamed from: o  reason: collision with root package name */
    private String[] f15763o;

    /* renamed from: p  reason: collision with root package name */
    private float f15764p;

    /* renamed from: q  reason: collision with root package name */
    private final ColorStateList f15765q;

    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.e(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f15752d.g()) - ClockFaceView.this.f15759k);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            int intValue = ((Integer) view.getTag(f.f26445p)).intValue();
            if (intValue > 0) {
                cVar.L0((View) ClockFaceView.this.f15755g.get(intValue - 1));
            }
            cVar.f0(c.C1263c.b(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26390z);
    }

    private void q() {
        RectF d11 = this.f15752d.d();
        for (int i11 = 0; i11 < this.f15755g.size(); i11++) {
            TextView textView = this.f15755g.get(i11);
            if (textView != null) {
                textView.getDrawingRect(this.f15753e);
                this.f15753e.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f15753e);
                this.f15754f.set(this.f15753e);
                textView.getPaint().setShader(r(d11, this.f15754f));
                textView.invalidate();
            }
        }
    }

    private RadialGradient r(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f15754f.left, rectF.centerY() - this.f15754f.top, rectF.width() * 0.5f, this.f15757i, this.f15758j, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float s(float f11, float f12, float f13) {
        return Math.max(Math.max(f11, f12), f13);
    }

    private void u(int i11) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f15755g.size();
        for (int i12 = 0; i12 < Math.max(this.f15763o.length, size); i12++) {
            TextView textView = this.f15755g.get(i12);
            if (i12 >= this.f15763o.length) {
                removeView(textView);
                this.f15755g.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f26465g, (ViewGroup) this, false);
                    this.f15755g.put(i12, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f15763o[i12]);
                textView.setTag(f.f26445p, Integer.valueOf(i12));
                a0.w0(textView, this.f15756h);
                textView.setTextColor(this.f15765q);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.f15763o[i12]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void b(float f11, boolean z11) {
        if (Math.abs(this.f15764p - f11) > 0.001f) {
            this.f15764p = f11;
            q();
        }
    }

    @Override // com.google.android.material.timepicker.b
    public void e(int i11) {
        if (i11 != d()) {
            super.e(i11);
            this.f15752d.j(d());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w3.c.P0(accessibilityNodeInfo).e0(c.b.a(1, this.f15763o.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int s11 = (int) (this.f15762n / s(this.f15760l / displayMetrics.heightPixels, this.f15761m / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(s11, 1073741824);
        setMeasuredDimension(s11, s11);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void t(String[] strArr, int i11) {
        this.f15763o = strArr;
        u(i11);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15753e = new Rect();
        this.f15754f = new RectF();
        this.f15755g = new SparseArray<>();
        this.f15758j = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.T0, i11, j.f26516t);
        Resources resources = getResources();
        ColorStateList a11 = tk.c.a(context, obtainStyledAttributes, k.V0);
        this.f15765q = a11;
        LayoutInflater.from(context).inflate(h.f26466h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f26439j);
        this.f15752d = clockHandView;
        this.f15759k = resources.getDimensionPixelSize(d.f26406j);
        int colorForState = a11.getColorForState(new int[]{16842913}, a11.getDefaultColor());
        this.f15757i = new int[]{colorForState, colorForState, a11.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = h.a.c(context, fk.c.f26392b).getDefaultColor();
        ColorStateList a12 = tk.c.a(context, obtainStyledAttributes, k.U0);
        setBackgroundColor(a12 != null ? a12.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f15756h = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        t(strArr, 0);
        this.f15760l = resources.getDimensionPixelSize(d.f26419w);
        this.f15761m = resources.getDimensionPixelSize(d.f26420x);
        this.f15762n = resources.getDimensionPixelSize(d.f26408l);
    }
}