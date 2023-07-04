package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private CircleOptions f9762a;

    /* renamed from: b  reason: collision with root package name */
    private Circle f9763b;

    /* renamed from: c  reason: collision with root package name */
    private LatLng f9764c;

    /* renamed from: d  reason: collision with root package name */
    private double f9765d;

    /* renamed from: e  reason: collision with root package name */
    private int f9766e;

    /* renamed from: f  reason: collision with root package name */
    private int f9767f;

    /* renamed from: g  reason: collision with root package name */
    private float f9768g;

    /* renamed from: h  reason: collision with root package name */
    private float f9769h;

    public b(Context context) {
        super(context);
    }

    private CircleOptions f() {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(this.f9764c);
        circleOptions.radius(this.f9765d);
        circleOptions.fillColor(this.f9767f);
        circleOptions.strokeColor(this.f9766e);
        circleOptions.strokeWidth(this.f9768g);
        circleOptions.zIndex(this.f9769h);
        return circleOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9763b.remove();
    }

    public void d(GoogleMap googleMap) {
        this.f9763b = googleMap.addCircle(getCircleOptions());
    }

    public CircleOptions getCircleOptions() {
        if (this.f9762a == null) {
            this.f9762a = f();
        }
        return this.f9762a;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9763b;
    }

    public void setCenter(LatLng latLng) {
        this.f9764c = latLng;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setCenter(latLng);
        }
    }

    public void setFillColor(int i11) {
        this.f9767f = i11;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setFillColor(i11);
        }
    }

    public void setRadius(double d11) {
        this.f9765d = d11;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setRadius(d11);
        }
    }

    public void setStrokeColor(int i11) {
        this.f9766e = i11;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setStrokeColor(i11);
        }
    }

    public void setStrokeWidth(float f11) {
        this.f9768g = f11;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setStrokeWidth(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f9769h = f11;
        Circle circle = this.f9763b;
        if (circle != null) {
            circle.setZIndex(f11);
        }
    }
}