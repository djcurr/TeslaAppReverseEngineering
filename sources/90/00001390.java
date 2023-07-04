package com.airbnb.android.react.maps;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@fg.a(name = AirMapModule.NAME)
/* loaded from: classes.dex */
public class AirMapModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AirMapModule";
    private static final String SNAPSHOT_FORMAT_JPG = "jpg";
    private static final String SNAPSHOT_FORMAT_PNG = "png";
    private static final String SNAPSHOT_RESULT_BASE64 = "base64";
    private static final String SNAPSHOT_RESULT_FILE = "file";

    /* loaded from: classes.dex */
    class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9735b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f9736c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f9737d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f9738e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f9739f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9740g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Bitmap.CompressFormat f9741h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ double f9742i;

        /* renamed from: com.airbnb.android.react.maps.AirMapModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0187a implements GoogleMap.SnapshotReadyCallback {
            C0187a() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
            public void onSnapshotReady(Bitmap bitmap) {
                if (bitmap == null) {
                    a.this.f9735b.reject("Failed to generate bitmap, snapshot = null");
                    return;
                }
                if (a.this.f9736c.intValue() != 0 && a.this.f9737d.intValue() != 0 && (a.this.f9736c.intValue() != bitmap.getWidth() || a.this.f9737d.intValue() != bitmap.getHeight())) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, a.this.f9736c.intValue(), a.this.f9737d.intValue(), true);
                }
                if (a.this.f9738e.equals("file")) {
                    try {
                        File createTempFile = File.createTempFile("AirMapSnapshot", "." + a.this.f9739f, a.this.f9740g.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        a aVar = a.this;
                        bitmap.compress(aVar.f9741h, (int) (aVar.f9742i * 100.0d), fileOutputStream);
                        AirMapModule.closeQuietly(fileOutputStream);
                        a.this.f9735b.resolve(Uri.fromFile(createTempFile).toString());
                    } catch (Exception e11) {
                        a.this.f9735b.reject(e11);
                    }
                } else if (a.this.f9738e.equals("base64")) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    a aVar2 = a.this;
                    bitmap.compress(aVar2.f9741h, (int) (aVar2.f9742i * 100.0d), byteArrayOutputStream);
                    AirMapModule.closeQuietly(byteArrayOutputStream);
                    a.this.f9735b.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                }
            }
        }

        a(AirMapModule airMapModule, int i11, Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d11) {
            this.f9734a = i11;
            this.f9735b = promise;
            this.f9736c = num;
            this.f9737d = num2;
            this.f9738e = str;
            this.f9739f = str2;
            this.f9740g = reactApplicationContext;
            this.f9741h = compressFormat;
            this.f9742i = d11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9734a);
            if (lVar == null) {
                this.f9735b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = lVar.f9870a;
            if (googleMap == null) {
                this.f9735b.reject("AirMapView.map is not valid");
            } else {
                googleMap.snapshot(new C0187a());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9745b;

        b(AirMapModule airMapModule, int i11, Promise promise) {
            this.f9744a = i11;
            this.f9745b = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9744a);
            if (lVar == null) {
                this.f9745b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = lVar.f9870a;
            if (googleMap == null) {
                this.f9745b.reject("AirMapView.map is not valid");
                return;
            }
            CameraPosition cameraPosition = googleMap.getCameraPosition();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("latitude", cameraPosition.target.latitude);
            writableNativeMap.putDouble("longitude", cameraPosition.target.longitude);
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putMap("center", writableNativeMap);
            writableNativeMap2.putDouble("heading", cameraPosition.bearing);
            writableNativeMap2.putDouble("zoom", cameraPosition.zoom);
            writableNativeMap2.putDouble("pitch", cameraPosition.tilt);
            this.f9745b.resolve(writableNativeMap2);
        }
    }

    /* loaded from: classes.dex */
    class c implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f9748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9749d;

        c(AirMapModule airMapModule, int i11, Promise promise, ReadableMap readableMap, ReactApplicationContext reactApplicationContext) {
            this.f9746a = i11;
            this.f9747b = promise;
            this.f9748c = readableMap;
            this.f9749d = reactApplicationContext;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9746a);
            if (lVar == null) {
                this.f9747b.reject("AirMapView not found");
            } else if (lVar.f9870a == null) {
                this.f9747b.reject("AirMapView.map is not valid");
            } else {
                ReadableMap readableMap = this.f9748c;
                if (readableMap != null && readableMap.hasKey("latitude") && this.f9748c.hasKey("longitude")) {
                    try {
                        Address address = new Geocoder(this.f9749d).getFromLocation(this.f9748c.getDouble("latitude"), this.f9748c.getDouble("longitude"), 1).get(0);
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("name", address.getFeatureName());
                        writableNativeMap.putString(PlaceTypes.LOCALITY, address.getLocality());
                        writableNativeMap.putString("thoroughfare", address.getThoroughfare());
                        writableNativeMap.putString("subThoroughfare", address.getSubThoroughfare());
                        writableNativeMap.putString("subLocality", address.getSubLocality());
                        writableNativeMap.putString("administrativeArea", address.getAdminArea());
                        writableNativeMap.putString("subAdministrativeArea", address.getSubAdminArea());
                        writableNativeMap.putString("postalCode", address.getPostalCode());
                        writableNativeMap.putString("countryCode", address.getCountryCode());
                        writableNativeMap.putString("country", address.getCountryName());
                        this.f9747b.resolve(writableNativeMap);
                        return;
                    } catch (IOException unused) {
                        this.f9747b.reject("Can not get address location");
                        return;
                    }
                }
                this.f9747b.reject("Invalid coordinate format");
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LatLng f9752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f9753d;

        d(AirMapModule airMapModule, int i11, Promise promise, LatLng latLng, double d11) {
            this.f9750a = i11;
            this.f9751b = promise;
            this.f9752c = latLng;
            this.f9753d = d11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9750a);
            if (lVar == null) {
                this.f9751b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = lVar.f9870a;
            if (googleMap == null) {
                this.f9751b.reject("AirMapView.map is not valid");
                return;
            }
            Point screenLocation = googleMap.getProjection().toScreenLocation(this.f9752c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("x", screenLocation.x / this.f9753d);
            writableNativeMap.putDouble("y", screenLocation.y / this.f9753d);
            this.f9751b.resolve(writableNativeMap);
        }
    }

    /* loaded from: classes.dex */
    class e implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9755b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Point f9756c;

        e(AirMapModule airMapModule, int i11, Promise promise, Point point) {
            this.f9754a = i11;
            this.f9755b = promise;
            this.f9756c = point;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9754a);
            if (lVar == null) {
                this.f9755b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = lVar.f9870a;
            if (googleMap == null) {
                this.f9755b.reject("AirMapView.map is not valid");
                return;
            }
            LatLng fromScreenLocation = googleMap.getProjection().fromScreenLocation(this.f9756c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("latitude", fromScreenLocation.latitude);
            writableNativeMap.putDouble("longitude", fromScreenLocation.longitude);
            this.f9755b.resolve(writableNativeMap);
        }
    }

    /* loaded from: classes.dex */
    class f implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9757a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9758b;

        f(AirMapModule airMapModule, int i11, Promise promise) {
            this.f9757a = i11;
            this.f9758b = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            l lVar = (l) mVar.resolveView(this.f9757a);
            if (lVar == null) {
                this.f9758b.reject("AirMapView not found");
            } else if (lVar.f9870a == null) {
                this.f9758b.reject("AirMapView.map is not valid");
            } else {
                double[][] mapBoundaries = lVar.getMapBoundaries();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                writableNativeMap2.putDouble("longitude", mapBoundaries[0][0]);
                writableNativeMap2.putDouble("latitude", mapBoundaries[0][1]);
                writableNativeMap3.putDouble("longitude", mapBoundaries[1][0]);
                writableNativeMap3.putDouble("latitude", mapBoundaries[1][1]);
                writableNativeMap.putMap("northEast", writableNativeMap2);
                writableNativeMap.putMap("southWest", writableNativeMap3);
                this.f9758b.resolve(writableNativeMap);
            }
        }
    }

    public AirMapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @ReactMethod
    public void coordinateForPoint(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d11 = reactApplicationContext.getResources().getDisplayMetrics().density;
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new e(this, i11, promise, new Point(readableMap.hasKey("x") ? (int) (readableMap.getDouble("x") * d11) : 0, readableMap.hasKey("y") ? (int) (readableMap.getDouble("y") * d11) : 0)));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void getAddressFromCoordinates(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new c(this, i11, promise, readableMap, reactApplicationContext));
    }

    @ReactMethod
    public void getCamera(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(this, i11, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("legalNotice", "This license information is displayed in Settings > Google > Open Source on any device running Google Play services.");
        return hashMap;
    }

    @ReactMethod
    public void getMapBoundaries(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new f(this, i11, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void pointForCoordinate(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new d(this, i11, promise, new LatLng(readableMap.hasKey("latitude") ? readableMap.getDouble("latitude") : 0.0d, readableMap.hasKey("longitude") ? readableMap.getDouble("longitude") : 0.0d), reactApplicationContext.getResources().getDisplayMetrics().density));
    }

    @ReactMethod
    public void takeSnapshot(int i11, ReadableMap readableMap, Promise promise) {
        Bitmap.CompressFormat compressFormat;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        String string = readableMap.hasKey("format") ? readableMap.getString("format") : SNAPSHOT_FORMAT_PNG;
        if (string.equals(SNAPSHOT_FORMAT_PNG)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = string.equals(SNAPSHOT_FORMAT_JPG) ? Bitmap.CompressFormat.JPEG : null;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        double d11 = readableMap.hasKey(ImagePickerConstants.OPTION_QUALITY) ? readableMap.getDouble(ImagePickerConstants.OPTION_QUALITY) : 1.0d;
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new a(this, i11, promise, Integer.valueOf(readableMap.hasKey(Snapshot.WIDTH) ? (int) (displayMetrics.density * readableMap.getDouble(Snapshot.WIDTH)) : 0), Integer.valueOf(readableMap.hasKey(Snapshot.HEIGHT) ? (int) (displayMetrics.density * readableMap.getDouble(Snapshot.HEIGHT)) : 0), readableMap.hasKey("result") ? readableMap.getString("result") : "file", string, reactApplicationContext, compressFormat2, d11));
    }
}