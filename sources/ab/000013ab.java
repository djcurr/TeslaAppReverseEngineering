package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class j extends c {

    /* renamed from: a  reason: collision with root package name */
    private PolylineOptions f9848a;

    /* renamed from: b  reason: collision with root package name */
    private Polyline f9849b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLng> f9850c;

    /* renamed from: d  reason: collision with root package name */
    private int f9851d;

    /* renamed from: e  reason: collision with root package name */
    private float f9852e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9853f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9854g;

    /* renamed from: h  reason: collision with root package name */
    private float f9855h;

    /* renamed from: i  reason: collision with root package name */
    private Cap f9856i;

    /* renamed from: j  reason: collision with root package name */
    private ReadableArray f9857j;

    /* renamed from: k  reason: collision with root package name */
    private List<PatternItem> f9858k;

    public j(Context context) {
        super(context);
        this.f9856i = new RoundCap();
    }

    private void f() {
        PatternItem dash;
        if (this.f9857j == null) {
            Polyline polyline = this.f9849b;
            if (polyline != null) {
                polyline.setPattern(null);
                return;
            }
            return;
        }
        this.f9858k = new ArrayList(this.f9857j.size());
        for (int i11 = 0; i11 < this.f9857j.size(); i11++) {
            float f11 = (float) this.f9857j.getDouble(i11);
            if (i11 % 2 != 0) {
                this.f9858k.add(new Gap(f11));
            } else {
                if (this.f9856i instanceof RoundCap) {
                    dash = new Dot();
                } else {
                    dash = new Dash(f11);
                }
                this.f9858k.add(dash);
            }
        }
        Polyline polyline2 = this.f9849b;
        if (polyline2 != null) {
            polyline2.setPattern(this.f9858k);
        }
    }

    private PolylineOptions g() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(this.f9850c);
        polylineOptions.color(this.f9851d);
        polylineOptions.width(this.f9852e);
        polylineOptions.geodesic(this.f9854g);
        polylineOptions.zIndex(this.f9855h);
        polylineOptions.startCap(this.f9856i);
        polylineOptions.endCap(this.f9856i);
        polylineOptions.pattern(this.f9858k);
        return polylineOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9849b.remove();
    }

    public void d(GoogleMap googleMap) {
        Polyline addPolyline = googleMap.addPolyline(getPolylineOptions());
        this.f9849b = addPolyline;
        addPolyline.setClickable(this.f9853f);
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9849b;
    }

    public PolylineOptions getPolylineOptions() {
        if (this.f9848a == null) {
            this.f9848a = g();
        }
        return this.f9848a;
    }

    public void setColor(int i11) {
        this.f9851d = i11;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setColor(i11);
        }
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f9850c = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            this.f9850c.add(i11, new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setPoints(this.f9850c);
        }
    }

    public void setGeodesic(boolean z11) {
        this.f9854g = z11;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setGeodesic(z11);
        }
    }

    public void setLineCap(Cap cap) {
        this.f9856i = cap;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setStartCap(cap);
            this.f9849b.setEndCap(cap);
        }
        f();
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.f9857j = readableArray;
        f();
    }

    public void setTappable(boolean z11) {
        this.f9853f = z11;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setClickable(z11);
        }
    }

    public void setWidth(float f11) {
        this.f9852e = f11;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setWidth(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f9855h = f11;
        Polyline polyline = this.f9849b;
        if (polyline != null) {
            polyline.setZIndex(f11);
        }
    }
}