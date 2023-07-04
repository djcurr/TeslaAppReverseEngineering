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
public class k extends c {

    /* renamed from: a  reason: collision with root package name */
    private TileOverlayOptions f9859a;

    /* renamed from: b  reason: collision with root package name */
    private TileOverlay f9860b;

    /* renamed from: c  reason: collision with root package name */
    private a f9861c;

    /* renamed from: d  reason: collision with root package name */
    private String f9862d;

    /* renamed from: e  reason: collision with root package name */
    private float f9863e;

    /* renamed from: f  reason: collision with root package name */
    private float f9864f;

    /* renamed from: g  reason: collision with root package name */
    private float f9865g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9866h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends UrlTileProvider {

        /* renamed from: a  reason: collision with root package name */
        private String f9867a;

        public a(int i11, int i12, String str) {
            super(i11, i12);
            this.f9867a = str;
        }

        public void a(String str) {
            this.f9867a = str;
        }

        @Override // com.google.android.gms.maps.model.UrlTileProvider
        public synchronized URL getTileUrl(int i11, int i12, int i13) {
            if (k.this.f9866h) {
                i12 = ((1 << i13) - i12) - 1;
            }
            String replace = this.f9867a.replace("{x}", Integer.toString(i11)).replace("{y}", Integer.toString(i12)).replace("{z}", Integer.toString(i13));
            if (k.this.f9864f <= BitmapDescriptorFactory.HUE_RED || i13 <= k.this.f9864f) {
                if (k.this.f9865g <= BitmapDescriptorFactory.HUE_RED || i13 >= k.this.f9865g) {
                    try {
                        return new URL(replace);
                    } catch (MalformedURLException e11) {
                        throw new AssertionError(e11);
                    }
                }
                return null;
            }
            return null;
        }
    }

    public k(Context context) {
        super(context);
    }

    private TileOverlayOptions i() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f9863e);
        a aVar = new a(256, 256, this.f9862d);
        this.f9861c = aVar;
        tileOverlayOptions.tileProvider(aVar);
        return tileOverlayOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9860b.remove();
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9860b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f9859a == null) {
            this.f9859a = i();
        }
        return this.f9859a;
    }

    public void h(GoogleMap googleMap) {
        this.f9860b = googleMap.addTileOverlay(getTileOverlayOptions());
    }

    public void setFlipY(boolean z11) {
        this.f9866h = z11;
        TileOverlay tileOverlay = this.f9860b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumZ(float f11) {
        this.f9864f = f11;
        TileOverlay tileOverlay = this.f9860b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMinimumZ(float f11) {
        this.f9865g = f11;
        TileOverlay tileOverlay = this.f9860b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setUrlTemplate(String str) {
        this.f9862d = str;
        a aVar = this.f9861c;
        if (aVar != null) {
            aVar.a(str);
        }
        TileOverlay tileOverlay = this.f9860b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setZIndex(float f11) {
        this.f9863e = f11;
        TileOverlay tileOverlay = this.f9860b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}