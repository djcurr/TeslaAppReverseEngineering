package com.airbnb.android.react.maps;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.Arrays;
import java.util.List;
import zn.b;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    private TileOverlayOptions f9789a;

    /* renamed from: b  reason: collision with root package name */
    private TileOverlay f9790b;

    /* renamed from: c  reason: collision with root package name */
    private zn.b f9791c;

    /* renamed from: d  reason: collision with root package name */
    private List<zn.c> f9792d;

    /* renamed from: e  reason: collision with root package name */
    private zn.a f9793e;

    /* renamed from: f  reason: collision with root package name */
    private Double f9794f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f9795g;

    public e(Context context) {
        super(context);
    }

    private TileOverlayOptions f() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        if (this.f9791c == null) {
            b.C1387b i11 = new b.C1387b().i(this.f9792d);
            Integer num = this.f9795g;
            if (num != null) {
                i11.h(num.intValue());
            }
            Double d11 = this.f9794f;
            if (d11 != null) {
                i11.g(d11.doubleValue());
            }
            zn.a aVar = this.f9793e;
            if (aVar != null) {
                i11.f(aVar);
            }
            this.f9791c = i11.e();
        }
        tileOverlayOptions.tileProvider(this.f9791c);
        return tileOverlayOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9790b.remove();
    }

    public void d(GoogleMap googleMap) {
        Log.d("AirMapHeatmap", "ADD TO MAP");
        this.f9790b = googleMap.addTileOverlay(getHeatmapOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9790b;
    }

    public TileOverlayOptions getHeatmapOptions() {
        if (this.f9789a == null) {
            this.f9789a = f();
        }
        return this.f9789a;
    }

    public void setGradient(zn.a aVar) {
        this.f9793e = aVar;
        zn.b bVar = this.f9791c;
        if (bVar != null) {
            bVar.h(aVar);
        }
        TileOverlay tileOverlay = this.f9790b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(double d11) {
        this.f9794f = new Double(d11);
        zn.b bVar = this.f9791c;
        if (bVar != null) {
            bVar.i(d11);
        }
        TileOverlay tileOverlay = this.f9790b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setPoints(zn.c[] cVarArr) {
        List<zn.c> asList = Arrays.asList(cVarArr);
        this.f9792d = asList;
        zn.b bVar = this.f9791c;
        if (bVar != null) {
            bVar.k(asList);
        }
        TileOverlay tileOverlay = this.f9790b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setRadius(int i11) {
        this.f9795g = new Integer(i11);
        zn.b bVar = this.f9791c;
        if (bVar != null) {
            bVar.j(i11);
        }
        TileOverlay tileOverlay = this.f9790b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }
}