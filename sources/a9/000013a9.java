package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public class h extends c implements p {

    /* renamed from: a  reason: collision with root package name */
    private GroundOverlayOptions f9828a;

    /* renamed from: b  reason: collision with root package name */
    private GroundOverlay f9829b;

    /* renamed from: c  reason: collision with root package name */
    private LatLngBounds f9830c;

    /* renamed from: d  reason: collision with root package name */
    private float f9831d;

    /* renamed from: e  reason: collision with root package name */
    private BitmapDescriptor f9832e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9833f;

    /* renamed from: g  reason: collision with root package name */
    private float f9834g;

    /* renamed from: h  reason: collision with root package name */
    private float f9835h;

    /* renamed from: i  reason: collision with root package name */
    private final q f9836i;

    /* renamed from: j  reason: collision with root package name */
    private GoogleMap f9837j;

    public h(Context context) {
        super(context);
        this.f9836i = new q(context, getResources(), this);
    }

    private GroundOverlayOptions f() {
        GroundOverlayOptions groundOverlayOptions = this.f9828a;
        if (groundOverlayOptions != null) {
            return groundOverlayOptions;
        }
        GroundOverlayOptions groundOverlayOptions2 = new GroundOverlayOptions();
        BitmapDescriptor bitmapDescriptor = this.f9832e;
        if (bitmapDescriptor != null) {
            groundOverlayOptions2.image(bitmapDescriptor);
        } else {
            groundOverlayOptions2.image(BitmapDescriptorFactory.defaultMarker());
            groundOverlayOptions2.visible(false);
        }
        groundOverlayOptions2.positionFromBounds(this.f9830c);
        groundOverlayOptions2.zIndex(this.f9834g);
        groundOverlayOptions2.bearing(this.f9831d);
        return groundOverlayOptions2;
    }

    private GroundOverlay getGroundOverlay() {
        GroundOverlayOptions groundOverlayOptions;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            return groundOverlay;
        }
        if (this.f9837j == null || (groundOverlayOptions = getGroundOverlayOptions()) == null) {
            return null;
        }
        return this.f9837j.addGroundOverlay(groundOverlayOptions);
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9837j = null;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.remove();
            this.f9829b = null;
            this.f9828a = null;
        }
    }

    public void d(GoogleMap googleMap) {
        GroundOverlayOptions groundOverlayOptions = getGroundOverlayOptions();
        if (groundOverlayOptions != null) {
            GroundOverlay addGroundOverlay = googleMap.addGroundOverlay(groundOverlayOptions);
            this.f9829b = addGroundOverlay;
            addGroundOverlay.setClickable(this.f9833f);
            return;
        }
        this.f9837j = googleMap;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9829b;
    }

    public GroundOverlayOptions getGroundOverlayOptions() {
        if (this.f9828a == null) {
            this.f9828a = f();
        }
        return this.f9828a;
    }

    public void setBearing(float f11) {
        this.f9831d = f11;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.setBearing(f11);
        }
    }

    public void setBounds(ReadableArray readableArray) {
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(readableArray.getArray(0).getDouble(0), readableArray.getArray(0).getDouble(1)), new LatLng(readableArray.getArray(1).getDouble(0), readableArray.getArray(1).getDouble(1)));
        this.f9830c = latLngBounds;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.setPositionFromBounds(latLngBounds);
        }
    }

    @Override // com.airbnb.android.react.maps.p
    public void setIconBitmap(Bitmap bitmap) {
    }

    @Override // com.airbnb.android.react.maps.p
    public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.f9832e = bitmapDescriptor;
    }

    public void setImage(String str) {
        this.f9836i.f(str);
    }

    public void setTappable(boolean z11) {
        this.f9833f = z11;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.setClickable(z11);
        }
    }

    public void setTransparency(float f11) {
        this.f9835h = f11;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.setTransparency(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f9834g = f11;
        GroundOverlay groundOverlay = this.f9829b;
        if (groundOverlay != null) {
            groundOverlay.setZIndex(f11);
        }
    }

    @Override // com.airbnb.android.react.maps.p
    public void update() {
        GroundOverlay groundOverlay = getGroundOverlay();
        this.f9829b = groundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setVisible(true);
            this.f9829b.setImage(this.f9832e);
            this.f9829b.setTransparency(this.f9835h);
            this.f9829b.setClickable(this.f9833f);
        }
    }
}