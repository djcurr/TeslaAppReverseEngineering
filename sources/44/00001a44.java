package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a extends c {
    private float Q2;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f12596g2;

    /* renamed from: i3  reason: collision with root package name */
    private boolean f12597i3;

    /* renamed from: p2  reason: collision with root package name */
    private boolean f12598p2;

    /* renamed from: x2  reason: collision with root package name */
    private float f12599x2;

    /* renamed from: y2  reason: collision with root package name */
    private int f12600y2;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.f12596g2 = false;
        this.f12598p2 = false;
        this.f12599x2 = BitmapDescriptorFactory.HUE_RED;
        this.f12600y2 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Q2 = motionEvent.getX();
            this.f12597i3 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.Q2);
            if (this.f12597i3 || abs > this.f12600y2) {
                this.f12597i3 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (B(motionEvent) && super.onInterceptTouchEvent(motionEvent)) {
            i.a(this, motionEvent);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f12596g2) {
            return;
        }
        this.f12596g2 = true;
        setProgressViewOffset(this.f12599x2);
        setRefreshing(this.f12598p2);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void setProgressViewOffset(float f11) {
        this.f12599x2 = f11;
        if (this.f12596g2) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(p.c(f11)) - progressCircleDiameter, Math.round(p.c(f11 + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z11) {
        this.f12598p2 = z11;
        if (this.f12596g2) {
            super.setRefreshing(z11);
        }
    }
}