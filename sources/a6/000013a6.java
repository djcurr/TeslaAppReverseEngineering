package com.airbnb.android.react.maps;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import je.q;

/* loaded from: classes.dex */
public class g extends c {
    private float A;
    private float B;
    private boolean C;
    private boolean E;
    private boolean F;
    private boolean G;
    private final AirMapMarkerManager H;
    private String K;
    private final com.facebook.drawee.view.b<?> L;
    private com.facebook.datasource.c<qd.a<nf.c>> O;
    private final ge.d<nf.h> P;
    private Bitmap Q;

    /* renamed from: a  reason: collision with root package name */
    private MarkerOptions f9804a;

    /* renamed from: b  reason: collision with root package name */
    private Marker f9805b;

    /* renamed from: c  reason: collision with root package name */
    private int f9806c;

    /* renamed from: d  reason: collision with root package name */
    private int f9807d;

    /* renamed from: e  reason: collision with root package name */
    private String f9808e;

    /* renamed from: f  reason: collision with root package name */
    private LatLng f9809f;

    /* renamed from: g  reason: collision with root package name */
    private String f9810g;

    /* renamed from: h  reason: collision with root package name */
    private String f9811h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9812i;

    /* renamed from: j  reason: collision with root package name */
    private float f9813j;

    /* renamed from: k  reason: collision with root package name */
    private float f9814k;

    /* renamed from: l  reason: collision with root package name */
    private com.airbnb.android.react.maps.a f9815l;

    /* renamed from: m  reason: collision with root package name */
    private View f9816m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f9817n;

    /* renamed from: o  reason: collision with root package name */
    private float f9818o;

    /* renamed from: p  reason: collision with root package name */
    private BitmapDescriptor f9819p;

    /* renamed from: q  reason: collision with root package name */
    private Bitmap f9820q;

    /* renamed from: t  reason: collision with root package name */
    private float f9821t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9822w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f9823x;

    /* renamed from: y  reason: collision with root package name */
    private int f9824y;

    /* renamed from: z  reason: collision with root package name */
    private float f9825z;

    /* loaded from: classes.dex */
    class a extends ge.c<nf.h> {
        a() {
        }

        @Override // ge.c, ge.d
        /* renamed from: c */
        public void l(String str, nf.h hVar, Animatable animatable) {
            qd.a aVar;
            Throwable th2;
            Bitmap p11;
            try {
                aVar = (qd.a) g.this.O.g();
                if (aVar != null) {
                    try {
                        nf.c cVar = (nf.c) aVar.J();
                        if (cVar != null && (cVar instanceof nf.d) && (p11 = ((nf.d) cVar).p()) != null) {
                            Bitmap copy = p11.copy(Bitmap.Config.ARGB_8888, true);
                            g.this.f9820q = copy;
                            g.this.f9819p = BitmapDescriptorFactory.fromBitmap(copy);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        g.this.O.close();
                        if (aVar != null) {
                            qd.a.C(aVar);
                        }
                        throw th2;
                    }
                }
                g.this.O.close();
                if (aVar != null) {
                    qd.a.C(aVar);
                }
                if (g.this.H != null && g.this.K != null) {
                    g.this.H.getSharedIcon(g.this.K).e(g.this.f9819p, g.this.f9820q);
                }
                g.this.y(true);
            } catch (Throwable th4) {
                aVar = null;
                th2 = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements TypeEvaluator<LatLng> {
        b() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public LatLng evaluate(float f11, LatLng latLng, LatLng latLng2) {
            return g.this.t(f11, latLng, latLng2);
        }
    }

    public g(Context context, AirMapMarkerManager airMapMarkerManager) {
        super(context);
        this.f9818o = BitmapDescriptorFactory.HUE_RED;
        this.f9821t = BitmapDescriptorFactory.HUE_RED;
        this.f9822w = false;
        this.f9823x = false;
        this.f9824y = 0;
        this.f9825z = 1.0f;
        this.E = true;
        this.F = false;
        this.G = false;
        this.P = new a();
        this.Q = null;
        this.f9817n = context;
        this.H = airMapMarkerManager;
        com.facebook.drawee.view.b<?> e11 = com.facebook.drawee.view.b.e(p(), context);
        this.L = e11;
        e11.k();
    }

    private void B() {
        boolean z11 = this.E && this.G && this.f9805b != null;
        if (z11 == this.F) {
            return;
        }
        this.F = z11;
        if (z11) {
            w.f().e(this);
            return;
        }
        w.f().g(this);
        A();
    }

    private void C() {
        com.airbnb.android.react.maps.a aVar = this.f9815l;
        if (aVar == null || aVar.getChildCount() == 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f9817n);
        linearLayout.setOrientation(1);
        com.airbnb.android.react.maps.a aVar2 = this.f9815l;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(aVar2.f9760b, aVar2.f9761c, BitmapDescriptorFactory.HUE_RED));
        LinearLayout linearLayout2 = new LinearLayout(this.f9817n);
        linearLayout2.setOrientation(0);
        com.airbnb.android.react.maps.a aVar3 = this.f9815l;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(aVar3.f9760b, aVar3.f9761c, BitmapDescriptorFactory.HUE_RED));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.f9815l);
        this.f9816m = linearLayout;
    }

    private BitmapDescriptor getIcon() {
        if (this.G) {
            if (this.f9819p != null) {
                Bitmap o11 = o();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(this.f9820q.getWidth(), o11.getWidth()), Math.max(this.f9820q.getHeight(), o11.getHeight()), this.f9820q.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(this.f9820q, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                canvas.drawBitmap(o11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                return BitmapDescriptorFactory.fromBitmap(createBitmap);
            }
            return BitmapDescriptorFactory.fromBitmap(o());
        }
        BitmapDescriptor bitmapDescriptor = this.f9819p;
        return bitmapDescriptor != null ? bitmapDescriptor : BitmapDescriptorFactory.defaultMarker(this.f9818o);
    }

    private void n() {
        this.Q = null;
    }

    private Bitmap o() {
        int i11 = this.f9806c;
        if (i11 <= 0) {
            i11 = 100;
        }
        int i12 = this.f9807d;
        int i13 = i12 > 0 ? i12 : 100;
        buildDrawingCache();
        Bitmap bitmap = this.Q;
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() == i11 && bitmap.getHeight() == i13) {
            bitmap.eraseColor(0);
        } else {
            bitmap = Bitmap.createBitmap(i11, i13, Bitmap.Config.ARGB_8888);
            this.Q = bitmap;
        }
        draw(new Canvas(bitmap));
        return bitmap;
    }

    private ke.a p() {
        return new ke.b(getResources()).u(q.c.f33450b).v(0).a();
    }

    private MarkerOptions q(MarkerOptions markerOptions) {
        markerOptions.position(this.f9809f);
        if (this.f9812i) {
            markerOptions.anchor(this.f9813j, this.f9814k);
        }
        if (this.C) {
            markerOptions.infoWindowAnchor(this.A, this.B);
        }
        markerOptions.title(this.f9810g);
        markerOptions.snippet(this.f9811h);
        markerOptions.rotation(this.f9821t);
        markerOptions.flat(this.f9822w);
        markerOptions.draggable(this.f9823x);
        markerOptions.zIndex(this.f9824y);
        markerOptions.alpha(this.f9825z);
        markerOptions.icon(getIcon());
        return markerOptions;
    }

    private BitmapDescriptor r(String str) {
        return BitmapDescriptorFactory.fromResource(s(str));
    }

    private int s(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public void A() {
        Marker marker = this.f9805b;
        if (marker == null || marker == null) {
            return;
        }
        marker.setIcon(getIcon());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        super.addView(view, i11);
        if (!(view instanceof com.airbnb.android.react.maps.a)) {
            this.G = true;
            B();
        }
        y(true);
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        Marker marker = this.f9805b;
        if (marker == null) {
            return;
        }
        marker.remove();
        this.f9805b = null;
        B();
    }

    public View getCallout() {
        if (this.f9815l == null) {
            return null;
        }
        if (this.f9816m == null) {
            C();
        }
        if (this.f9815l.getTooltip()) {
            return this.f9816m;
        }
        return null;
    }

    public com.airbnb.android.react.maps.a getCalloutView() {
        return this.f9815l;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9805b;
    }

    public String getIdentifier() {
        return this.f9808e;
    }

    public View getInfoContents() {
        if (this.f9815l == null) {
            return null;
        }
        if (this.f9816m == null) {
            C();
        }
        if (this.f9815l.getTooltip()) {
            return null;
        }
        return this.f9816m;
    }

    public MarkerOptions getMarkerOptions() {
        if (this.f9804a == null) {
            this.f9804a = new MarkerOptions();
        }
        q(this.f9804a);
        return this.f9804a;
    }

    public void l(GoogleMap googleMap) {
        this.f9805b = googleMap.addMarker(getMarkerOptions());
        B();
    }

    public void m(LatLng latLng, Integer num) {
        b bVar = new b();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f9805b, Property.of(Marker.class, LatLng.class, "position"), bVar, latLng);
        ofObject.setDuration(num.intValue());
        ofObject.start();
    }

    @Override // com.facebook.react.views.view.g, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getChildCount() == 0 && this.G) {
            this.G = false;
            n();
            B();
            y(true);
        }
    }

    public void setCalloutView(com.airbnb.android.react.maps.a aVar) {
        this.f9815l = aVar;
    }

    public void setCoordinate(ReadableMap readableMap) {
        LatLng latLng = new LatLng(readableMap.getDouble("latitude"), readableMap.getDouble("longitude"));
        this.f9809f = latLng;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setPosition(latLng);
        }
        y(false);
    }

    public void setDraggable(boolean z11) {
        this.f9823x = z11;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setDraggable(z11);
        }
        y(false);
    }

    public void setFlat(boolean z11) {
        this.f9822w = z11;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setFlat(z11);
        }
        y(false);
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.f9820q = bitmap;
    }

    public void setIdentifier(String str) {
        this.f9808e = str;
        y(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setImage(java.lang.String r6) {
        /*
            r5 = this;
            com.airbnb.android.react.maps.AirMapMarkerManager r0 = r5.H
            r1 = 1
            if (r0 == 0) goto L27
            java.lang.String r2 = r5.K
            if (r2 == 0) goto L17
            com.airbnb.android.react.maps.AirMapMarkerManager$a r0 = r0.getSharedIcon(r2)
            r0.c(r5)
            com.airbnb.android.react.maps.AirMapMarkerManager r0 = r5.H
            java.lang.String r2 = r5.K
            r0.removeSharedIconIfEmpty(r2)
        L17:
            if (r6 == 0) goto L27
            com.airbnb.android.react.maps.AirMapMarkerManager r0 = r5.H
            com.airbnb.android.react.maps.AirMapMarkerManager$a r0 = r0.getSharedIcon(r6)
            r0.a(r5)
            boolean r0 = r0.d()
            goto L28
        L27:
            r0 = r1
        L28:
            r5.K = r6
            if (r0 != 0) goto L2d
            return
        L2d:
            if (r6 != 0) goto L37
            r6 = 0
            r5.f9819p = r6
            r5.y(r1)
            goto Lf6
        L37:
            java.lang.String r0 = "http://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "https://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "file://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "asset://"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "data:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L60
            goto Lb9
        L60:
            com.google.android.gms.maps.model.BitmapDescriptor r0 = r5.r(r6)
            r5.f9819p = r0
            if (r0 == 0) goto La6
            int r0 = r5.s(r6)
            android.content.res.Resources r2 = r5.getResources()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r2, r0)
            r5.f9820q = r2
            if (r2 != 0) goto La6
            android.content.res.Resources r2 = r5.getResources()
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            int r2 = r0.getIntrinsicWidth()
            int r3 = r0.getIntrinsicHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            r5.f9820q = r2
            int r2 = r0.getIntrinsicWidth()
            int r3 = r0.getIntrinsicHeight()
            r4 = 0
            r0.setBounds(r4, r4, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r5.f9820q
            r2.<init>(r3)
            r0.draw(r2)
        La6:
            com.airbnb.android.react.maps.AirMapMarkerManager r0 = r5.H
            if (r0 == 0) goto Lb5
            com.airbnb.android.react.maps.AirMapMarkerManager$a r6 = r0.getSharedIcon(r6)
            com.google.android.gms.maps.model.BitmapDescriptor r0 = r5.f9819p
            android.graphics.Bitmap r2 = r5.f9820q
            r6.e(r0, r2)
        Lb5:
            r5.y(r1)
            goto Lf6
        Lb9:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            com.facebook.imagepipeline.request.ImageRequestBuilder r6 = com.facebook.imagepipeline.request.ImageRequestBuilder.s(r6)
            com.facebook.imagepipeline.request.a r6 = r6.a()
            jf.h r0 = be.c.a()
            com.facebook.datasource.c r0 = r0.d(r6, r5)
            r5.O = r0
            be.e r0 = be.c.g()
            ge.b r6 = r0.C(r6)
            be.e r6 = (be.e) r6
            ge.d<nf.h> r0 = r5.P
            ge.b r6 = r6.B(r0)
            be.e r6 = (be.e) r6
            com.facebook.drawee.view.b<?> r0 = r5.L
            me.a r0 = r0.g()
            ge.b r6 = r6.b(r0)
            be.e r6 = (be.e) r6
            ge.a r6 = r6.build()
            com.facebook.drawee.view.b<?> r0 = r5.L
            r0.o(r6)
        Lf6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.maps.g.setImage(java.lang.String):void");
    }

    public void setMarkerHue(float f11) {
        this.f9818o = f11;
        y(false);
    }

    public void setOpacity(float f11) {
        this.f9825z = f11;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setAlpha(f11);
        }
        y(false);
    }

    @Override // android.view.View
    public void setRotation(float f11) {
        this.f9821t = f11;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setRotation(f11);
        }
        y(false);
    }

    public void setSnippet(String str) {
        this.f9811h = str;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setSnippet(str);
        }
        y(false);
    }

    public void setTitle(String str) {
        this.f9810g = str;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setTitle(str);
        }
        y(false);
    }

    public void setTracksViewChanges(boolean z11) {
        this.E = z11;
        B();
    }

    public void setZIndex(int i11) {
        this.f9824y = i11;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setZIndex(i11);
        }
        y(false);
    }

    public LatLng t(float f11, LatLng latLng, LatLng latLng2) {
        double d11 = latLng2.latitude;
        double d12 = latLng.latitude;
        double d13 = f11;
        double d14 = ((d11 - d12) * d13) + d12;
        double d15 = latLng2.longitude;
        double d16 = latLng.longitude;
        return new LatLng(d14, ((d15 - d16) * d13) + d16);
    }

    public void u(double d11, double d12) {
        this.f9812i = true;
        float f11 = (float) d11;
        this.f9813j = f11;
        float f12 = (float) d12;
        this.f9814k = f12;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setAnchor(f11, f12);
        }
        y(false);
    }

    public void v(double d11, double d12) {
        this.C = true;
        float f11 = (float) d11;
        this.A = f11;
        float f12 = (float) d12;
        this.B = f12;
        Marker marker = this.f9805b;
        if (marker != null) {
            marker.setInfoWindowAnchor(f11, f12);
        }
        y(false);
    }

    public void w(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
        this.f9819p = bitmapDescriptor;
        this.f9820q = bitmap;
        y(true);
    }

    public void x(int i11, int i12) {
        this.f9806c = i11;
        this.f9807d = i12;
        y(true);
    }

    public void y(boolean z11) {
        if (this.f9805b == null) {
            return;
        }
        if (z11) {
            A();
        }
        if (this.f9812i) {
            this.f9805b.setAnchor(this.f9813j, this.f9814k);
        } else {
            this.f9805b.setAnchor(0.5f, 1.0f);
        }
        if (this.C) {
            this.f9805b.setInfoWindowAnchor(this.A, this.B);
        } else {
            this.f9805b.setInfoWindowAnchor(0.5f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public boolean z() {
        if (this.F) {
            A();
            return true;
        }
        return false;
    }

    public g(Context context, MarkerOptions markerOptions, AirMapMarkerManager airMapMarkerManager) {
        super(context);
        this.f9818o = BitmapDescriptorFactory.HUE_RED;
        this.f9821t = BitmapDescriptorFactory.HUE_RED;
        this.f9822w = false;
        this.f9823x = false;
        this.f9824y = 0;
        this.f9825z = 1.0f;
        this.E = true;
        this.F = false;
        this.G = false;
        this.P = new a();
        this.Q = null;
        this.f9817n = context;
        this.H = airMapMarkerManager;
        com.facebook.drawee.view.b<?> e11 = com.facebook.drawee.view.b.e(p(), context);
        this.L = e11;
        e11.k();
        this.f9809f = markerOptions.getPosition();
        u(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        v(markerOptions.getInfoWindowAnchorU(), markerOptions.getInfoWindowAnchorV());
        setTitle(markerOptions.getTitle());
        setSnippet(markerOptions.getSnippet());
        setRotation(markerOptions.getRotation());
        setFlat(markerOptions.isFlat());
        setDraggable(markerOptions.isDraggable());
        setZIndex(Math.round(markerOptions.getZIndex()));
        setAlpha(markerOptions.getAlpha());
        this.f9819p = markerOptions.getIcon();
    }
}