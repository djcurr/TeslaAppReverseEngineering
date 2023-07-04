package com.airbnb.android.react.maps;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.location.Location;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.GestureDetectorCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.IndoorLevel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.TileOverlay;
import com.stripe.android.networking.FraudDetectionData;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.spongycastle.i18n.MessageBundle;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class l extends MapView implements GoogleMap.InfoWindowAdapter, GoogleMap.OnMarkerDragListener, OnMapReadyCallback, GoogleMap.OnPoiClickListener, GoogleMap.OnIndoorStateChangeListener {

    /* renamed from: x1  reason: collision with root package name */
    private static final String[] f9869x1 = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private final Map<GroundOverlay, com.airbnb.android.react.maps.h> A;
    private final Map<TileOverlay, com.airbnb.android.react.maps.e> B;
    private final Map<TileOverlay, com.airbnb.android.react.maps.d> C;
    private final GestureDetectorCompat E;
    private final AirMapManager F;
    private LifecycleEventListener G;
    private boolean H;
    private boolean K;
    private final n0 L;
    private final com.facebook.react.uimanager.events.d O;
    private com.airbnb.android.react.maps.o P;
    private v Q;
    int R;
    int T;

    /* renamed from: a  reason: collision with root package name */
    public GoogleMap f9870a;

    /* renamed from: b  reason: collision with root package name */
    private xn.f f9871b;

    /* renamed from: b1  reason: collision with root package name */
    int f9872b1;

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f9873c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f9874d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f9875e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f9876f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f9877g;

    /* renamed from: g1  reason: collision with root package name */
    int f9878g1;

    /* renamed from: h  reason: collision with root package name */
    private Integer f9879h;

    /* renamed from: i  reason: collision with root package name */
    private LatLngBounds f9880i;

    /* renamed from: j  reason: collision with root package name */
    private CameraUpdate f9881j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9882k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9883l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9884m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9885n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9886o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9887p;

    /* renamed from: p1  reason: collision with root package name */
    private final Runnable f9888p1;

    /* renamed from: q  reason: collision with root package name */
    private LatLngBounds f9889q;

    /* renamed from: t  reason: collision with root package name */
    private int f9890t;

    /* renamed from: w  reason: collision with root package name */
    private final List<com.airbnb.android.react.maps.c> f9891w;

    /* renamed from: x  reason: collision with root package name */
    private final Map<Marker, com.airbnb.android.react.maps.g> f9892x;

    /* renamed from: y  reason: collision with root package name */
    private final Map<Polyline, com.airbnb.android.react.maps.j> f9893y;

    /* renamed from: z  reason: collision with root package name */
    private final Map<Polygon, com.airbnb.android.react.maps.i> f9894z;

    /* loaded from: classes.dex */
    class a implements GoogleMap.OnGroundOverlayClickListener {
        a() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
        public void onGroundOverlayClick(GroundOverlay groundOverlay) {
            WritableMap P = l.this.P(groundOverlay.getPosition());
            P.putString("action", "overlay-press");
            l.this.F.pushEvent(l.this.L, (View) l.this.A.get(groundOverlay), "onPress", P);
        }
    }

    /* loaded from: classes.dex */
    class b implements GoogleMap.OnCameraMoveStartedListener {
        b() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
        public void onCameraMoveStarted(int i11) {
            l.this.f9890t = i11;
        }
    }

    /* loaded from: classes.dex */
    class c implements GoogleMap.OnCameraMoveListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GoogleMap f9897a;

        c(GoogleMap googleMap) {
            this.f9897a = googleMap;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
        public void onCameraMove() {
            LatLngBounds latLngBounds = this.f9897a.getProjection().getVisibleRegion().latLngBounds;
            l.this.f9889q = null;
            l.this.O.g(new t(l.this.getId(), latLngBounds, true, 1 == l.this.f9890t));
        }
    }

    /* loaded from: classes.dex */
    class d implements GoogleMap.OnCameraIdleListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GoogleMap f9899a;

        d(GoogleMap googleMap) {
            this.f9899a = googleMap;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
        public void onCameraIdle() {
            LatLngBounds latLngBounds = this.f9899a.getProjection().getVisibleRegion().latLngBounds;
            if (l.this.f9890t != 0) {
                if (l.this.f9889q == null || r.a(latLngBounds, l.this.f9889q)) {
                    l.this.f9889q = latLngBounds;
                    l.this.O.g(new t(l.this.getId(), latLngBounds, false, 1 == l.this.f9890t));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements GoogleMap.OnMapLoadedCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9901a;

        e(l lVar) {
            this.f9901a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
        public void onMapLoaded() {
            l.this.f9876f = Boolean.TRUE;
            l.this.F.pushEvent(l.this.L, this.f9901a, "onMapLoaded", new WritableNativeMap());
            l.this.E();
        }
    }

    /* loaded from: classes.dex */
    class f implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GoogleMap f9903a;

        f(GoogleMap googleMap) {
            this.f9903a = googleMap;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            l.this.G();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            if (l.this.O()) {
                this.f9903a.setMyLocationEnabled(false);
            }
            synchronized (l.this) {
                if (!l.this.K) {
                    l.this.onPause();
                }
                l.this.H = true;
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (l.this.O()) {
                this.f9903a.setMyLocationEnabled(l.this.f9882k);
                this.f9903a.setLocationSource(l.this.P);
            }
            synchronized (l.this) {
                if (!l.this.K) {
                    l.this.onResume();
                }
                l.this.H = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements GoogleMap.SnapshotReadyCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f9905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelativeLayout f9906b;

        g(l lVar, ImageView imageView, RelativeLayout relativeLayout) {
            this.f9905a = imageView;
            this.f9906b = relativeLayout;
        }

        @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
        public void onSnapshotReady(Bitmap bitmap) {
            this.f9905a.setImageBitmap(bitmap);
            this.f9905a.setVisibility(0);
            this.f9906b.setVisibility(4);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.measure(View.MeasureSpec.makeMeasureSpec(lVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(l.this.getHeight(), 1073741824));
            l lVar2 = l.this;
            lVar2.layout(lVar2.getLeft(), l.this.getTop(), l.this.getRight(), l.this.getBottom());
        }
    }

    /* loaded from: classes.dex */
    class i extends GestureDetector.SimpleOnGestureListener {
        i() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            l.this.Q(motionEvent);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            if (l.this.f9883l) {
                l.this.R(motionEvent2);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class j implements View.OnLayoutChangeListener {
        j() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (l.this.H) {
                return;
            }
            l.this.E();
        }
    }

    /* loaded from: classes.dex */
    class k implements GoogleMap.OnMyLocationChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9910a;

        k(l lVar) {
            this.f9910a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
        public void onMyLocationChange(Location location) {
            WritableMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putDouble("latitude", location.getLatitude());
            writableNativeMap2.putDouble("longitude", location.getLongitude());
            writableNativeMap2.putDouble("altitude", location.getAltitude());
            writableNativeMap2.putDouble(FraudDetectionData.KEY_TIMESTAMP, location.getTime());
            writableNativeMap2.putDouble("accuracy", location.getAccuracy());
            writableNativeMap2.putDouble("speed", location.getSpeed());
            writableNativeMap2.putDouble("heading", location.getBearing());
            if (Build.VERSION.SDK_INT >= 18) {
                writableNativeMap2.putBoolean("isFromMockProvider", location.isFromMockProvider());
            }
            writableNativeMap.putMap("coordinate", writableNativeMap2);
            l.this.F.pushEvent(l.this.L, this.f9910a, "onUserLocationChange", writableNativeMap);
        }
    }

    /* renamed from: com.airbnb.android.react.maps.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0188l implements GoogleMap.OnMarkerClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9912a;

        C0188l(l lVar) {
            this.f9912a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
            com.airbnb.android.react.maps.g M = l.this.M(marker);
            WritableMap P = l.this.P(marker.getPosition());
            P.putString("action", "marker-press");
            P.putString("id", M.getIdentifier());
            l.this.F.pushEvent(l.this.L, this.f9912a, "onMarkerPress", P);
            WritableMap P2 = l.this.P(marker.getPosition());
            P2.putString("action", "marker-press");
            P2.putString("id", M.getIdentifier());
            l.this.F.pushEvent(l.this.L, M, "onPress", P2);
            if (this.f9912a.f9884m) {
                return false;
            }
            marker.showInfoWindow();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class m implements GoogleMap.OnPolygonClickListener {
        m() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
        public void onPolygonClick(Polygon polygon) {
            WritableMap P = l.this.P(polygon.getPoints().get(0));
            P.putString("action", "polygon-press");
            l.this.F.pushEvent(l.this.L, (View) l.this.f9894z.get(polygon), "onPress", P);
        }
    }

    /* loaded from: classes.dex */
    class n implements GoogleMap.OnPolylineClickListener {
        n() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
        public void onPolylineClick(Polyline polyline) {
            WritableMap P = l.this.P(polyline.getPoints().get(0));
            P.putString("action", "polyline-press");
            l.this.F.pushEvent(l.this.L, (View) l.this.f9893y.get(polyline), "onPress", P);
        }
    }

    /* loaded from: classes.dex */
    class o implements GoogleMap.OnInfoWindowClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9916a;

        o(l lVar) {
            this.f9916a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
        public void onInfoWindowClick(Marker marker) {
            WritableMap P = l.this.P(marker.getPosition());
            P.putString("action", "callout-press");
            l.this.F.pushEvent(l.this.L, this.f9916a, "onCalloutPress", P);
            WritableMap P2 = l.this.P(marker.getPosition());
            P2.putString("action", "callout-press");
            com.airbnb.android.react.maps.g M = l.this.M(marker);
            l.this.F.pushEvent(l.this.L, M, "onCalloutPress", P2);
            WritableMap P3 = l.this.P(marker.getPosition());
            P3.putString("action", "callout-press");
            com.airbnb.android.react.maps.a calloutView = M.getCalloutView();
            if (calloutView != null) {
                l.this.F.pushEvent(l.this.L, calloutView, "onPress", P3);
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements GoogleMap.OnMapClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9918a;

        p(l lVar) {
            this.f9918a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
        public void onMapClick(LatLng latLng) {
            WritableMap P = l.this.P(latLng);
            P.putString("action", "press");
            l.this.F.pushEvent(l.this.L, this.f9918a, "onPress", P);
        }
    }

    /* loaded from: classes.dex */
    class q implements GoogleMap.OnMapLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f9920a;

        q(l lVar) {
            this.f9920a = lVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
        public void onMapLongClick(LatLng latLng) {
            l.this.P(latLng).putString("action", "long-press");
            l.this.F.pushEvent(l.this.L, this.f9920a, "onLongPress", l.this.P(latLng));
        }
    }

    public l(n0 n0Var, ReactApplicationContext reactApplicationContext, AirMapManager airMapManager, GoogleMapOptions googleMapOptions) {
        super(N(n0Var, reactApplicationContext), googleMapOptions);
        this.f9876f = Boolean.FALSE;
        this.f9877g = null;
        this.f9879h = null;
        this.f9882k = false;
        this.f9883l = false;
        this.f9884m = true;
        this.f9885n = false;
        this.f9886o = false;
        this.f9887p = false;
        this.f9890t = 0;
        this.f9891w = new ArrayList();
        this.f9892x = new HashMap();
        this.f9893y = new HashMap();
        this.f9894z = new HashMap();
        this.A = new HashMap();
        this.B = new HashMap();
        this.C = new HashMap();
        this.H = false;
        this.K = false;
        this.f9888p1 = new h();
        this.F = airMapManager;
        this.L = n0Var;
        super.onCreate(null);
        super.onResume();
        super.getMapAsync(this);
        this.P = new com.airbnb.android.react.maps.o(n0Var);
        this.E = new GestureDetectorCompat(n0Var, new i());
        addOnLayoutChangeListener(new j());
        this.O = ((UIManagerModule) n0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.Q = new v(n0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.leftMargin = 99999999;
        layoutParams.topMargin = 99999999;
        this.Q.setLayoutParams(layoutParams);
        addView(this.Q);
    }

    private void C(int i11, int i12, int i13, int i14) {
        double d11 = getResources().getDisplayMetrics().density;
        this.f9870a.setPadding(((int) (i11 * d11)) + this.R, ((int) (i12 * d11)) + this.f9872b1, ((int) (i13 * d11)) + this.T, ((int) (i14 * d11)) + this.f9878g1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.f9885n) {
            ImageView cacheImageView = getCacheImageView();
            RelativeLayout mapLoadingLayoutView = getMapLoadingLayoutView();
            cacheImageView.setVisibility(4);
            mapLoadingLayoutView.setVisibility(0);
            if (this.f9876f.booleanValue()) {
                this.f9870a.snapshot(new g(this, cacheImageView, mapLoadingLayoutView));
                return;
            }
            return;
        }
        S();
        if (this.f9876f.booleanValue()) {
            U();
        }
    }

    private static boolean F(Context context) {
        return context == null || context.getResources() == null || context.getResources().getConfiguration() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.airbnb.android.react.maps.g M(Marker marker) {
        com.airbnb.android.react.maps.g gVar = this.f9892x.get(marker);
        if (gVar != null) {
            return gVar;
        }
        for (Map.Entry<Marker, com.airbnb.android.react.maps.g> entry : this.f9892x.entrySet()) {
            if (entry.getKey().getPosition().equals(marker.getPosition()) && entry.getKey().getTitle().equals(marker.getTitle())) {
                return entry.getValue();
            }
        }
        return gVar;
    }

    private static Context N(n0 n0Var, ReactApplicationContext reactApplicationContext) {
        if (!F(reactApplicationContext.getCurrentActivity())) {
            return reactApplicationContext.getCurrentActivity();
        }
        if (F(n0Var)) {
            if (F(n0Var.getCurrentActivity())) {
                return !F(n0Var.getApplicationContext()) ? n0Var.getApplicationContext() : n0Var;
            }
            return n0Var.getCurrentActivity();
        }
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O() {
        Context context = getContext();
        String[] strArr = f9869x1;
        return androidx.core.content.c.c(context, strArr[0]) == 0 || androidx.core.content.c.c(getContext(), strArr[1]) == 0;
    }

    private void S() {
        ImageView imageView = this.f9875e;
        if (imageView != null) {
            ((ViewGroup) imageView.getParent()).removeView(this.f9875e);
            this.f9875e = null;
        }
    }

    private void U() {
        V();
        RelativeLayout relativeLayout = this.f9874d;
        if (relativeLayout != null) {
            ((ViewGroup) relativeLayout.getParent()).removeView(this.f9874d);
            this.f9874d = null;
        }
    }

    private void V() {
        ProgressBar progressBar = this.f9873c;
        if (progressBar != null) {
            ((ViewGroup) progressBar.getParent()).removeView(this.f9873c);
            this.f9873c = null;
        }
    }

    private ImageView getCacheImageView() {
        if (this.f9875e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f9875e = imageView;
            addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            this.f9875e.setVisibility(4);
        }
        return this.f9875e;
    }

    private RelativeLayout getMapLoadingLayoutView() {
        if (this.f9874d == null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.f9874d = relativeLayout;
            relativeLayout.setBackgroundColor(-3355444);
            addView(this.f9874d, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f9874d.addView(getMapLoadingProgressBar(), layoutParams);
            this.f9874d.setVisibility(4);
        }
        setLoadingBackgroundColor(this.f9877g);
        return this.f9874d;
    }

    private ProgressBar getMapLoadingProgressBar() {
        if (this.f9873c == null) {
            ProgressBar progressBar = new ProgressBar(getContext());
            this.f9873c = progressBar;
            progressBar.setIndeterminate(true);
        }
        Integer num = this.f9879h;
        if (num != null) {
            setLoadingIndicatorColor(num);
        }
        return this.f9873c;
    }

    public void A(LatLngBounds latLngBounds, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0), i11, null);
    }

    public void B(float f11, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        this.f9870a.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(googleMap.getCameraPosition()).tilt(f11).build()), i11, null);
    }

    public void D(int i11, int i12, int i13, int i14) {
        this.f9870a.setPadding(i11, i12, i13, i14);
        this.R = i11;
        this.T = i13;
        this.f9872b1 = i12;
        this.f9878g1 = i14;
    }

    public synchronized void G() {
        n0 n0Var;
        if (this.K) {
            return;
        }
        this.K = true;
        LifecycleEventListener lifecycleEventListener = this.G;
        if (lifecycleEventListener != null && (n0Var = this.L) != null) {
            n0Var.removeLifecycleEventListener(lifecycleEventListener);
            this.G = null;
        }
        if (!this.H) {
            onPause();
            this.H = true;
        }
        onDestroy();
    }

    public void H(boolean z11) {
        if (!z11 || this.f9876f.booleanValue()) {
            return;
        }
        getMapLoadingLayoutView().setVisibility(0);
    }

    public void I(ReadableArray readableArray, ReadableMap readableMap, boolean z11) {
        if (this.f9870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            builder.include(new LatLng(Double.valueOf(map.getDouble("latitude")).doubleValue(), Double.valueOf(map.getDouble("longitude")).doubleValue()));
        }
        CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
        if (readableMap != null) {
            C(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        }
        if (z11) {
            this.f9870a.animateCamera(newLatLngBounds);
        } else {
            this.f9870a.moveCamera(newLatLngBounds);
        }
        this.f9870a.setPadding(this.R, this.f9872b1, this.T, this.f9878g1);
    }

    public void J(ReadableMap readableMap, boolean z11) {
        if (this.f9870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        boolean z12 = false;
        for (com.airbnb.android.react.maps.c cVar : this.f9891w) {
            if (cVar instanceof com.airbnb.android.react.maps.g) {
                builder.include(((Marker) cVar.getFeature()).getPosition());
                z12 = true;
            }
        }
        if (z12) {
            CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
            if (readableMap != null) {
                this.f9870a.setPadding(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
            }
            if (z11) {
                this.f9870a.animateCamera(newLatLngBounds);
            } else {
                this.f9870a.moveCamera(newLatLngBounds);
            }
        }
    }

    public void K(ReadableArray readableArray, ReadableMap readableMap, boolean z11) {
        if (this.f9870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        String[] strArr = new String[readableArray.size()];
        boolean z12 = false;
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            strArr[i11] = readableArray.getString(i11);
        }
        List asList = Arrays.asList(strArr);
        for (com.airbnb.android.react.maps.c cVar : this.f9891w) {
            if (cVar instanceof com.airbnb.android.react.maps.g) {
                String identifier = ((com.airbnb.android.react.maps.g) cVar).getIdentifier();
                Marker marker = (Marker) cVar.getFeature();
                if (asList.contains(identifier)) {
                    builder.include(marker.getPosition());
                    z12 = true;
                }
            }
        }
        if (z12) {
            CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
            if (readableMap != null) {
                this.f9870a.setPadding(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
            }
            if (z11) {
                this.f9870a.animateCamera(newLatLngBounds);
            } else {
                this.f9870a.moveCamera(newLatLngBounds);
            }
        }
    }

    public View L(int i11) {
        return this.f9891w.get(i11);
    }

    public WritableMap P(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("latitude", latLng.latitude);
        writableNativeMap2.putDouble("longitude", latLng.longitude);
        writableNativeMap.putMap("coordinate", writableNativeMap2);
        Point screenLocation = this.f9870a.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble("x", screenLocation.x);
        writableNativeMap3.putDouble("y", screenLocation.y);
        writableNativeMap.putMap("position", writableNativeMap3);
        return writableNativeMap;
    }

    public void Q(MotionEvent motionEvent) {
        if (this.f9870a == null) {
            return;
        }
        this.F.pushEvent(this.L, this, "onDoublePress", P(this.f9870a.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    public void R(MotionEvent motionEvent) {
        if (this.f9870a == null) {
            return;
        }
        this.F.pushEvent(this.L, this, "onPanDrag", P(this.f9870a.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    public void T(int i11) {
        com.airbnb.android.react.maps.c remove = this.f9891w.remove(i11);
        if (remove instanceof com.airbnb.android.react.maps.g) {
            this.f9892x.remove(remove.getFeature());
        } else if (remove instanceof com.airbnb.android.react.maps.e) {
            this.B.remove(remove.getFeature());
        }
        remove.c(this.f9870a);
    }

    public void W(ReadableMap readableMap, ReadableMap readableMap2) {
        if (this.f9870a == null) {
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(Double.valueOf(readableMap.getDouble("latitude")).doubleValue(), Double.valueOf(readableMap.getDouble("longitude")).doubleValue()));
        builder.include(new LatLng(Double.valueOf(readableMap2.getDouble("latitude")).doubleValue(), Double.valueOf(readableMap2.getDouble("longitude")).doubleValue()));
        this.f9870a.setLatLngBoundsForCameraTarget(builder.build());
    }

    public void X(Object obj) {
        if (this.f9880i != null) {
            HashMap hashMap = (HashMap) obj;
            int intValue = hashMap.get(Snapshot.WIDTH) == null ? 0 : ((Float) hashMap.get(Snapshot.WIDTH)).intValue();
            int intValue2 = hashMap.get(Snapshot.HEIGHT) == null ? 0 : ((Float) hashMap.get(Snapshot.HEIGHT)).intValue();
            if (intValue > 0 && intValue2 > 0) {
                this.f9870a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f9880i, intValue, intValue2, 0));
            } else {
                this.f9870a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f9880i, 0));
            }
            this.f9880i = null;
            this.f9881j = null;
            return;
        }
        CameraUpdate cameraUpdate = this.f9881j;
        if (cameraUpdate != null) {
            this.f9870a.moveCamera(cameraUpdate);
            this.f9881j = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.E.a(motionEvent);
        int a11 = androidx.core.view.n.a(motionEvent);
        boolean z11 = false;
        if (a11 == 0) {
            ViewParent parent = getParent();
            GoogleMap googleMap = this.f9870a;
            if (googleMap != null && googleMap.getUiSettings().isScrollGesturesEnabled()) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        } else if (a11 == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public int getFeatureCount() {
        return this.f9891w.size();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        return M(marker).getInfoContents();
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        return M(marker).getCallout();
    }

    public double[][] getMapBoundaries() {
        LatLngBounds latLngBounds = this.f9870a.getProjection().getVisibleRegion().latLngBounds;
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        return new double[][]{new double[]{latLng.longitude, latLng.latitude}, new double[]{latLng2.longitude, latLng2.latitude}};
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public void onIndoorBuildingFocused() {
        IndoorBuilding focusedBuilding = this.f9870a.getFocusedBuilding();
        int i11 = 0;
        if (focusedBuilding != null) {
            List<IndoorLevel> levels = focusedBuilding.getLevels();
            WritableArray createArray = Arguments.createArray();
            for (IndoorLevel indoorLevel : levels) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i11);
                createMap.putString("name", indoorLevel.getName());
                createMap.putString("shortName", indoorLevel.getShortName());
                createArray.pushMap(createMap);
                i11++;
            }
            WritableMap createMap2 = Arguments.createMap();
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putArray("levels", createArray);
            createMap3.putInt("activeLevelIndex", focusedBuilding.getActiveLevelIndex());
            createMap3.putBoolean("underground", focusedBuilding.isUnderground());
            createMap2.putMap("IndoorBuilding", createMap3);
            this.F.pushEvent(this.L, this, "onIndoorBuildingFocused", createMap2);
            return;
        }
        WritableMap createMap4 = Arguments.createMap();
        WritableArray createArray2 = Arguments.createArray();
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putArray("levels", createArray2);
        createMap5.putInt("activeLevelIndex", 0);
        createMap5.putBoolean("underground", false);
        createMap4.putMap("IndoorBuilding", createMap5);
        this.F.pushEvent(this.L, this, "onIndoorBuildingFocused", createMap4);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        int activeLevelIndex;
        if (indoorBuilding != null && (activeLevelIndex = indoorBuilding.getActiveLevelIndex()) >= 0 && activeLevelIndex < indoorBuilding.getLevels().size()) {
            IndoorLevel indoorLevel = indoorBuilding.getLevels().get(activeLevelIndex);
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("activeLevelIndex", activeLevelIndex);
            createMap2.putString("name", indoorLevel.getName());
            createMap2.putString("shortName", indoorLevel.getShortName());
            createMap.putMap("IndoorLevel", createMap2);
            this.F.pushEvent(this.L, this, "onIndoorLevelActivated", createMap);
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        if (this.K) {
            return;
        }
        this.f9870a = googleMap;
        googleMap.setInfoWindowAdapter(this);
        this.f9870a.setOnMarkerDragListener(this);
        this.f9870a.setOnPoiClickListener(this);
        this.f9870a.setOnIndoorStateChangeListener(this);
        this.F.pushEvent(this.L, this, "onMapReady", new WritableNativeMap());
        googleMap.setOnMyLocationChangeListener(new k(this));
        googleMap.setOnMarkerClickListener(new C0188l(this));
        googleMap.setOnPolygonClickListener(new m());
        googleMap.setOnPolylineClickListener(new n());
        googleMap.setOnInfoWindowClickListener(new o(this));
        googleMap.setOnMapClickListener(new p(this));
        googleMap.setOnMapLongClickListener(new q(this));
        googleMap.setOnGroundOverlayClickListener(new a());
        googleMap.setOnCameraMoveStartedListener(new b());
        googleMap.setOnCameraMoveListener(new c(googleMap));
        googleMap.setOnCameraIdleListener(new d(googleMap));
        googleMap.setOnMapLoadedCallback(new e(this));
        f fVar = new f(googleMap);
        this.G = fVar;
        this.L.addLifecycleEventListener(fVar);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        this.F.pushEvent(this.L, this, "onMarkerDrag", P(marker.getPosition()));
        this.F.pushEvent(this.L, M(marker), "onDrag", P(marker.getPosition()));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        this.F.pushEvent(this.L, this, "onMarkerDragEnd", P(marker.getPosition()));
        this.F.pushEvent(this.L, M(marker), "onDragEnd", P(marker.getPosition()));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        this.F.pushEvent(this.L, this, "onMarkerDragStart", P(marker.getPosition()));
        this.F.pushEvent(this.L, M(marker), "onDragStart", P(marker.getPosition()));
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
    public void onPoiClick(PointOfInterest pointOfInterest) {
        WritableMap P = P(pointOfInterest.latLng);
        P.putString("placeId", pointOfInterest.placeId);
        P.putString("name", pointOfInterest.name);
        this.F.pushEvent(this.L, this, "onPoiClick", P);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f9888p1);
    }

    public void setCacheEnabled(boolean z11) {
        this.f9885n = z11;
        E();
    }

    public void setCamera(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder();
        ReadableMap map = readableMap.getMap("center");
        if (map != null) {
            builder.target(new LatLng(Double.valueOf(map.getDouble("latitude")).doubleValue(), Double.valueOf(map.getDouble("longitude")).doubleValue()));
        }
        builder.tilt((float) readableMap.getDouble("pitch"));
        builder.bearing((float) readableMap.getDouble("heading"));
        builder.zoom((float) readableMap.getDouble("zoom"));
        CameraUpdate newCameraPosition = CameraUpdateFactory.newCameraPosition(builder.build());
        if (super.getHeight() > 0 && super.getWidth() > 0) {
            this.f9870a.moveCamera(newCameraPosition);
            this.f9881j = null;
            return;
        }
        this.f9881j = newCameraPosition;
    }

    public void setHandlePanDrag(boolean z11) {
        this.f9883l = z11;
    }

    public void setIndoorActiveLevelIndex(int i11) {
        IndoorLevel indoorLevel;
        IndoorBuilding focusedBuilding = this.f9870a.getFocusedBuilding();
        if (focusedBuilding == null || i11 < 0 || i11 >= focusedBuilding.getLevels().size() || (indoorLevel = focusedBuilding.getLevels().get(i11)) == null) {
            return;
        }
        indoorLevel.activate();
    }

    public void setInitialCamera(ReadableMap readableMap) {
        if (this.f9887p || readableMap == null) {
            return;
        }
        setCamera(readableMap);
        this.f9887p = true;
    }

    public void setInitialRegion(ReadableMap readableMap) {
        if (this.f9886o || readableMap == null) {
            return;
        }
        setRegion(readableMap);
        this.f9886o = true;
    }

    public void setKmlSrc(String str) {
        String str2 = "name";
        try {
            InputStream inputStream = new com.airbnb.android.react.maps.n(this.L).execute(str).get();
            if (inputStream == null) {
                return;
            }
            xn.f fVar = new xn.f(this.f9870a, inputStream, this.L);
            this.f9871b = fVar;
            fVar.d();
            WritableMap writableNativeMap = new WritableNativeMap();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            if (this.f9871b.b() == null) {
                this.F.pushEvent(this.L, this, "onKmlReady", writableNativeMap);
                return;
            }
            xn.b next = this.f9871b.b().iterator().next();
            if (next != null && next.a() != null) {
                if (next.a().iterator().hasNext()) {
                    next = next.a().iterator().next();
                }
                Integer num = 0;
                for (xn.j jVar : next.c()) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    if (jVar.g() != null) {
                        markerOptions = jVar.h();
                    } else {
                        markerOptions.icon(BitmapDescriptorFactory.defaultMarker());
                    }
                    LatLng latLng = (LatLng) jVar.a().d();
                    String d11 = jVar.f(str2) ? jVar.d(str2) : "";
                    String d12 = jVar.f("description") ? jVar.d("description") : "";
                    markerOptions.position(latLng);
                    markerOptions.title(d11);
                    markerOptions.snippet(d12);
                    String str3 = str2;
                    com.airbnb.android.react.maps.g gVar = new com.airbnb.android.react.maps.g(this.L, markerOptions, this.F.getMarkerManager());
                    if (jVar.g() != null && jVar.g().o() != null) {
                        gVar.setImage(jVar.g().o());
                    } else if (next.f(jVar.k()) != null) {
                        gVar.setImage(next.f(jVar.k()).o());
                    }
                    String str4 = d11 + " - " + num;
                    gVar.setIdentifier(str4);
                    Integer valueOf = Integer.valueOf(num.intValue() + 1);
                    v(gVar, num.intValue());
                    WritableMap P = P(latLng);
                    P.putString("id", str4);
                    P.putString(MessageBundle.TITLE_ENTRY, d11);
                    P.putString("description", d12);
                    writableNativeArray.pushMap(P);
                    num = valueOf;
                    str2 = str3;
                }
                writableNativeMap.putArray("markers", writableNativeArray);
                this.F.pushEvent(this.L, this, "onKmlReady", writableNativeMap);
                return;
            }
            this.F.pushEvent(this.L, this, "onKmlReady", writableNativeMap);
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (InterruptedException e12) {
            e12.printStackTrace();
        } catch (ExecutionException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    public void setLoadingBackgroundColor(Integer num) {
        this.f9877g = num;
        RelativeLayout relativeLayout = this.f9874d;
        if (relativeLayout != null) {
            if (num == null) {
                relativeLayout.setBackgroundColor(-1);
            } else {
                relativeLayout.setBackgroundColor(num.intValue());
            }
        }
    }

    public void setLoadingIndicatorColor(Integer num) {
        this.f9879h = num;
        if (this.f9873c != null) {
            Integer valueOf = num == null ? Integer.valueOf(Color.parseColor("#606060")) : num;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 21) {
                ColorStateList valueOf2 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf3 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf4 = ColorStateList.valueOf(num.intValue());
                this.f9873c.setProgressTintList(valueOf2);
                this.f9873c.setSecondaryProgressTintList(valueOf3);
                this.f9873c.setIndeterminateTintList(valueOf4);
                return;
            }
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (i11 <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (this.f9873c.getIndeterminateDrawable() != null) {
                this.f9873c.getIndeterminateDrawable().setColorFilter(valueOf.intValue(), mode);
            }
            if (this.f9873c.getProgressDrawable() != null) {
                this.f9873c.getProgressDrawable().setColorFilter(valueOf.intValue(), mode);
            }
        }
    }

    public void setMoveOnMarkerPress(boolean z11) {
        this.f9884m = z11;
    }

    public void setRegion(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        Double valueOf = Double.valueOf(readableMap.getDouble("longitude"));
        Double valueOf2 = Double.valueOf(readableMap.getDouble("latitude"));
        Double valueOf3 = Double.valueOf(readableMap.getDouble("longitudeDelta"));
        Double valueOf4 = Double.valueOf(readableMap.getDouble("latitudeDelta"));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() - (valueOf3.doubleValue() / 2.0d)), new LatLng(valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() + (valueOf3.doubleValue() / 2.0d)));
        if (super.getHeight() > 0 && super.getWidth() > 0) {
            this.f9870a.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
            this.f9880i = null;
            return;
        }
        this.f9870a.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(valueOf2.doubleValue(), valueOf.doubleValue()), 10.0f));
        this.f9880i = latLngBounds;
    }

    public void setShowsMyLocationButton(boolean z11) {
        if (O() || !z11) {
            this.f9870a.getUiSettings().setMyLocationButtonEnabled(z11);
        }
    }

    public void setShowsUserLocation(boolean z11) {
        this.f9882k = z11;
        if (O()) {
            this.f9870a.setLocationSource(this.P);
            this.f9870a.setMyLocationEnabled(z11);
        }
    }

    public void setToolbarEnabled(boolean z11) {
        if (O() || !z11) {
            this.f9870a.getUiSettings().setMapToolbarEnabled(z11);
        }
    }

    public void setUserLocationFastestInterval(int i11) {
        this.P.a(i11);
    }

    public void setUserLocationPriority(int i11) {
        this.P.c(i11);
    }

    public void setUserLocationUpdateInterval(int i11) {
        this.P.b(i11);
    }

    public void v(View view, int i11) {
        if (view instanceof com.airbnb.android.react.maps.g) {
            com.airbnb.android.react.maps.g gVar = (com.airbnb.android.react.maps.g) view;
            gVar.l(this.f9870a);
            this.f9891w.add(i11, gVar);
            int visibility = gVar.getVisibility();
            gVar.setVisibility(4);
            ViewGroup viewGroup = (ViewGroup) gVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(gVar);
            }
            this.Q.addView(gVar);
            gVar.setVisibility(visibility);
            this.f9892x.put((Marker) gVar.getFeature(), gVar);
        } else if (view instanceof com.airbnb.android.react.maps.j) {
            com.airbnb.android.react.maps.j jVar = (com.airbnb.android.react.maps.j) view;
            jVar.d(this.f9870a);
            this.f9891w.add(i11, jVar);
            this.f9893y.put((Polyline) jVar.getFeature(), jVar);
        } else if (view instanceof com.airbnb.android.react.maps.d) {
            com.airbnb.android.react.maps.d dVar = (com.airbnb.android.react.maps.d) view;
            dVar.d(this.f9870a);
            this.f9891w.add(i11, dVar);
            this.C.put((TileOverlay) dVar.getFeature(), dVar);
        } else if (view instanceof com.airbnb.android.react.maps.i) {
            com.airbnb.android.react.maps.i iVar = (com.airbnb.android.react.maps.i) view;
            iVar.d(this.f9870a);
            this.f9891w.add(i11, iVar);
            this.f9894z.put((Polygon) iVar.getFeature(), iVar);
        } else if (view instanceof com.airbnb.android.react.maps.b) {
            com.airbnb.android.react.maps.b bVar = (com.airbnb.android.react.maps.b) view;
            bVar.d(this.f9870a);
            this.f9891w.add(i11, bVar);
        } else if (view instanceof com.airbnb.android.react.maps.k) {
            com.airbnb.android.react.maps.k kVar = (com.airbnb.android.react.maps.k) view;
            kVar.h(this.f9870a);
            this.f9891w.add(i11, kVar);
        } else if (view instanceof com.airbnb.android.react.maps.m) {
            com.airbnb.android.react.maps.m mVar = (com.airbnb.android.react.maps.m) view;
            mVar.h(this.f9870a);
            this.f9891w.add(i11, mVar);
        } else if (view instanceof com.airbnb.android.react.maps.f) {
            com.airbnb.android.react.maps.f fVar = (com.airbnb.android.react.maps.f) view;
            fVar.d(this.f9870a);
            this.f9891w.add(i11, fVar);
        } else if (view instanceof com.airbnb.android.react.maps.h) {
            com.airbnb.android.react.maps.h hVar = (com.airbnb.android.react.maps.h) view;
            hVar.d(this.f9870a);
            this.f9891w.add(i11, hVar);
            this.A.put((GroundOverlay) hVar.getFeature(), hVar);
        } else if (view instanceof com.airbnb.android.react.maps.e) {
            com.airbnb.android.react.maps.e eVar = (com.airbnb.android.react.maps.e) view;
            eVar.d(this.f9870a);
            this.f9891w.add(i11, eVar);
            this.B.put((TileOverlay) eVar.getFeature(), eVar);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup2.getChildCount(); i12++) {
                v(viewGroup2.getChildAt(i12), i11);
            }
        } else {
            addView(view, i11);
        }
    }

    public void w(float f11, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        this.f9870a.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(googleMap.getCameraPosition()).bearing(f11).build()), i11, null);
    }

    public void x(ReadableMap readableMap, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        CameraPosition.Builder builder = new CameraPosition.Builder(googleMap.getCameraPosition());
        if (readableMap.hasKey("zoom")) {
            builder.zoom((float) readableMap.getDouble("zoom"));
        }
        if (readableMap.hasKey("heading")) {
            builder.bearing((float) readableMap.getDouble("heading"));
        }
        if (readableMap.hasKey("pitch")) {
            builder.tilt((float) readableMap.getDouble("pitch"));
        }
        if (readableMap.hasKey("center")) {
            ReadableMap map = readableMap.getMap("center");
            builder.target(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        CameraUpdate newCameraPosition = CameraUpdateFactory.newCameraPosition(builder.build());
        if (i11 <= 0) {
            this.f9870a.moveCamera(newCameraPosition);
        } else {
            this.f9870a.animateCamera(newCameraPosition, i11, null);
        }
    }

    public void y(LatLng latLng, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng), i11, null);
    }

    public void z(LatLng latLng, float f11, float f12, int i11) {
        GoogleMap googleMap = this.f9870a;
        if (googleMap == null) {
            return;
        }
        this.f9870a.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(googleMap.getCameraPosition()).bearing(f11).tilt(f12).target(latLng).build()), i11, null);
    }
}