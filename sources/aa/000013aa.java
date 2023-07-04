package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: a  reason: collision with root package name */
    private PolygonOptions f9838a;

    /* renamed from: b  reason: collision with root package name */
    private Polygon f9839b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLng> f9840c;

    /* renamed from: d  reason: collision with root package name */
    private List<List<LatLng>> f9841d;

    /* renamed from: e  reason: collision with root package name */
    private int f9842e;

    /* renamed from: f  reason: collision with root package name */
    private int f9843f;

    /* renamed from: g  reason: collision with root package name */
    private float f9844g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9845h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9846i;

    /* renamed from: j  reason: collision with root package name */
    private float f9847j;

    public i(Context context) {
        super(context);
    }

    private PolygonOptions f() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(this.f9840c);
        polygonOptions.fillColor(this.f9843f);
        polygonOptions.strokeColor(this.f9842e);
        polygonOptions.strokeWidth(this.f9844g);
        polygonOptions.geodesic(this.f9845h);
        polygonOptions.zIndex(this.f9847j);
        if (this.f9841d != null) {
            for (int i11 = 0; i11 < this.f9841d.size(); i11++) {
                polygonOptions.addHole(this.f9841d.get(i11));
            }
        }
        return polygonOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9839b.remove();
    }

    public void d(GoogleMap googleMap) {
        Polygon addPolygon = googleMap.addPolygon(getPolygonOptions());
        this.f9839b = addPolygon;
        addPolygon.setClickable(this.f9846i);
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9839b;
    }

    public PolygonOptions getPolygonOptions() {
        if (this.f9838a == null) {
            this.f9838a = f();
        }
        return this.f9838a;
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f9840c = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            this.f9840c.add(i11, new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setPoints(this.f9840c);
        }
    }

    public void setFillColor(int i11) {
        this.f9843f = i11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setFillColor(i11);
        }
    }

    public void setGeodesic(boolean z11) {
        this.f9845h = z11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setGeodesic(z11);
        }
    }

    public void setHoles(ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        this.f9841d = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableArray array = readableArray.getArray(i11);
            if (array.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < array.size(); i12++) {
                    ReadableMap map = array.getMap(i12);
                    arrayList.add(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
                }
                if (arrayList.size() == 3) {
                    arrayList.add((LatLng) arrayList.get(0));
                }
                this.f9841d.add(arrayList);
            }
        }
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setHoles(this.f9841d);
        }
    }

    public void setStrokeColor(int i11) {
        this.f9842e = i11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setStrokeColor(i11);
        }
    }

    public void setStrokeWidth(float f11) {
        this.f9844g = f11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setStrokeWidth(f11);
        }
    }

    public void setTappable(boolean z11) {
        this.f9846i = z11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setClickable(z11);
        }
    }

    public void setZIndex(float f11) {
        this.f9847j = f11;
        Polygon polygon = this.f9839b;
        if (polygon != null) {
            polygon.setZIndex(f11);
        }
    }
}