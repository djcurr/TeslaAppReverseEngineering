package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import yj.k;

/* loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f14419a;

    /* renamed from: b  reason: collision with root package name */
    private b f14420b;

    /* renamed from: c  reason: collision with root package name */
    private float f14421c;

    /* renamed from: d  reason: collision with root package name */
    private int f14422d;

    /* loaded from: classes3.dex */
    public interface b {
        void a(float f11, float f12, boolean z11);
    }

    /* loaded from: classes3.dex */
    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f14423a;

        /* renamed from: b  reason: collision with root package name */
        private float f14424b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14425c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14426d;

        private c() {
        }

        public void a(float f11, float f12, boolean z11) {
            this.f14423a = f11;
            this.f14424b = f12;
            this.f14425c = z11;
            if (this.f14426d) {
                return;
            }
            this.f14426d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14426d = false;
            if (AspectRatioFrameLayout.this.f14420b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f14420b.a(this.f14423a, this.f14424b, this.f14425c);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14422d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f59607a, 0, 0);
            try {
                this.f14422d = obtainStyledAttributes.getInt(k.f59608b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14419a = new c();
    }

    public int getResizeMode() {
        return this.f14422d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f14421c <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.f14421c / f15) - 1.0f;
        if (Math.abs(f16) <= 0.01f) {
            this.f14419a.a(this.f14421c, f15, false);
            return;
        }
        int i13 = this.f14422d;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = this.f14421c;
                } else if (i13 == 4) {
                    if (f16 > BitmapDescriptorFactory.HUE_RED) {
                        f11 = this.f14421c;
                    } else {
                        f12 = this.f14421c;
                    }
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.f14421c;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > BitmapDescriptorFactory.HUE_RED) {
            f12 = this.f14421c;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.f14421c;
            measuredWidth = (int) (f14 * f11);
        }
        this.f14419a.a(this.f14421c, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f14421c != f11) {
            this.f14421c = f11;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f14420b = bVar;
    }

    public void setResizeMode(int i11) {
        if (this.f14422d != i11) {
            this.f14422d = i11;
            requestLayout();
        }
    }
}