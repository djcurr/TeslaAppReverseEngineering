package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class m extends c {

    /* renamed from: j  reason: collision with root package name */
    private static final double[] f9922j = {-2.003750834789244E7d, 2.003750834789244E7d};

    /* renamed from: a  reason: collision with root package name */
    private TileOverlayOptions f9923a;

    /* renamed from: b  reason: collision with root package name */
    private TileOverlay f9924b;

    /* renamed from: c  reason: collision with root package name */
    private a f9925c;

    /* renamed from: d  reason: collision with root package name */
    private String f9926d;

    /* renamed from: e  reason: collision with root package name */
    private float f9927e;

    /* renamed from: f  reason: collision with root package name */
    private float f9928f;

    /* renamed from: g  reason: collision with root package name */
    private float f9929g;

    /* renamed from: h  reason: collision with root package name */
    private int f9930h;

    /* renamed from: i  reason: collision with root package name */
    private float f9931i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends UrlTileProvider {

        /* renamed from: a  reason: collision with root package name */
        private String f9932a;

        /* renamed from: b  reason: collision with root package name */
        private int f9933b;

        /* renamed from: c  reason: collision with root package name */
        private int f9934c;

        public a(int i11, int i12, String str) {
            super(i11, i12);
            this.f9932a = str;
            this.f9933b = i11;
            this.f9934c = i12;
        }

        private double[] a(int i11, int i12, int i13) {
            double pow = 4.007501669578488E7d / Math.pow(2.0d, i13);
            return new double[]{m.f9922j[0] + (i11 * pow), m.f9922j[1] - ((i12 + 1) * pow), m.f9922j[0] + ((i11 + 1) * pow), m.f9922j[1] - (i12 * pow)};
        }

        public void b(String str) {
            this.f9932a = str;
        }

        @Override // com.google.android.gms.maps.model.UrlTileProvider
        public synchronized URL getTileUrl(int i11, int i12, int i13) {
            if (m.this.f9928f <= BitmapDescriptorFactory.HUE_RED || i13 <= m.this.f9928f) {
                if (m.this.f9929g <= BitmapDescriptorFactory.HUE_RED || i13 >= m.this.f9929g) {
                    double[] a11 = a(i11, i12, i13);
                    try {
                        return new URL(this.f9932a.replace("{minX}", Double.toString(a11[0])).replace("{minY}", Double.toString(a11[1])).replace("{maxX}", Double.toString(a11[2])).replace("{maxY}", Double.toString(a11[3])).replace("{width}", Integer.toString(this.f9933b)).replace("{height}", Integer.toString(this.f9934c)));
                    } catch (MalformedURLException e11) {
                        throw new AssertionError(e11);
                    }
                }
                return null;
            }
            return null;
        }
    }

    public m(Context context) {
        super(context);
    }

    private TileOverlayOptions i() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f9927e);
        tileOverlayOptions.transparency(1.0f - this.f9931i);
        int i11 = this.f9930h;
        a aVar = new a(i11, i11, this.f9926d);
        this.f9925c = aVar;
        tileOverlayOptions.tileProvider(aVar);
        return tileOverlayOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9924b.remove();
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9924b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f9923a == null) {
            this.f9923a = i();
        }
        return this.f9923a;
    }

    public void h(GoogleMap googleMap) {
        this.f9924b = googleMap.addTileOverlay(getTileOverlayOptions());
    }

    public void setMaximumZ(float f11) {
        this.f9928f = f11;
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMinimumZ(float f11) {
        this.f9929g = f11;
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(float f11) {
        this.f9931i = f11;
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.setTransparency(1.0f - f11);
        }
    }

    public void setTileSize(int i11) {
        this.f9930h = i11;
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setUrlTemplate(String str) {
        this.f9926d = str;
        a aVar = this.f9925c;
        if (aVar != null) {
            aVar.b(str);
        }
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setZIndex(float f11) {
        this.f9927e = f11;
        TileOverlay tileOverlay = this.f9924b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}