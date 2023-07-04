package com.plaid.internal.core.ui_components.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.ac;
import com.plaid.internal.zb;
import com.plaid.link.R;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f18470a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f18471b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(Context context) {
        super(context);
        s.g(context, "context");
        this.f18470a = new Paint();
        this.f18471b = new ac();
        this.f18472c = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f18471b.setCallback(this);
        if (attributeSet == null) {
            a(new zb.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr…ShimmerFrameLayout, 0, 0)");
        try {
            int i11 = R.styleable.ShimmerFrameLayout_shimmer_colored;
            zb.b a11 = ((obtainStyledAttributes.hasValue(i11) && obtainStyledAttributes.getBoolean(i11, false)) ? new zb.c() : new zb.a()).a(obtainStyledAttributes);
            s.e(a11);
            a(a11.a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        s.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f18472c) {
            this.f18471b.draw(canvas);
        }
    }

    public final zb getShimmer() {
        return this.f18471b.f18180f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18471b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f18471b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 == 0) {
            this.f18471b.a();
        } else {
            a();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        s.g(who, "who");
        return super.verifyDrawable(who) || who == this.f18471b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.g(context, "context");
        this.f18470a = new Paint();
        this.f18471b = new ac();
        this.f18472c = true;
        a(context, attributeSet);
    }

    public final ShimmerFrameLayout a(zb zbVar) {
        boolean isStarted;
        ValueAnimator valueAnimator;
        ac acVar = this.f18471b;
        acVar.f18180f = zbVar;
        if (zbVar != null) {
            acVar.f18176b.setXfermode(new PorterDuffXfermode(zbVar.f19981p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        acVar.b();
        if (acVar.f18180f != null) {
            ValueAnimator valueAnimator2 = acVar.f18179e;
            if (valueAnimator2 == null) {
                isStarted = false;
            } else {
                isStarted = valueAnimator2.isStarted();
                valueAnimator2.cancel();
                valueAnimator2.removeAllUpdateListeners();
            }
            zb zbVar2 = acVar.f18180f;
            if (zbVar2 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, ((float) (zbVar2.f19985t / zbVar2.f19984s)) + 1.0f);
                ofFloat.setRepeatMode(zbVar2.f19983r);
                ofFloat.setStartDelay(zbVar2.f19986u);
                ofFloat.setRepeatCount(zbVar2.f19982q);
                ofFloat.setDuration(zbVar2.f19984s + zbVar2.f19985t);
                ofFloat.addUpdateListener(acVar.f18175a);
                acVar.f18179e = ofFloat;
            }
            if (isStarted && (valueAnimator = acVar.f18179e) != null) {
                valueAnimator.start();
            }
        }
        acVar.invalidateSelf();
        if (zbVar != null && zbVar.f19979n) {
            setLayerType(2, this.f18470a);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.f18470a = new Paint();
        this.f18471b = new ac();
        this.f18472c = true;
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.g(context, "context");
        this.f18470a = new Paint();
        this.f18471b = new ac();
        this.f18472c = true;
        a(context, attributeSet);
    }

    public final void a() {
        ValueAnimator valueAnimator;
        ac acVar = this.f18471b;
        ValueAnimator valueAnimator2 = acVar.f18179e;
        if (!(valueAnimator2 == null ? false : valueAnimator2.isStarted()) || (valueAnimator = acVar.f18179e) == null) {
            return;
        }
        valueAnimator.cancel();
    }
}