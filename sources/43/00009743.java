package org.reactnative.camera;

import android.media.CamcorderProfile;
import android.os.Build;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[][] f43315a = {new String[]{"string", "Artist"}, new String[]{"int", "BitsPerSample"}, new String[]{"int", "Compression"}, new String[]{"string", "Copyright"}, new String[]{"string", "DateTime"}, new String[]{"string", "ImageDescription"}, new String[]{"int", "ImageLength"}, new String[]{"int", "ImageWidth"}, new String[]{"int", "JPEGInterchangeFormat"}, new String[]{"int", "JPEGInterchangeFormatLength"}, new String[]{"string", "Make"}, new String[]{"string", "Model"}, new String[]{"int", "Orientation"}, new String[]{"int", "PhotometricInterpretation"}, new String[]{"int", "PlanarConfiguration"}, new String[]{"double", "PrimaryChromaticities"}, new String[]{"double", "ReferenceBlackWhite"}, new String[]{"int", "ResolutionUnit"}, new String[]{"int", "RowsPerStrip"}, new String[]{"int", "SamplesPerPixel"}, new String[]{"string", "Software"}, new String[]{"int", "StripByteCounts"}, new String[]{"int", "StripOffsets"}, new String[]{"int", "TransferFunction"}, new String[]{"double", "WhitePoint"}, new String[]{"double", "XResolution"}, new String[]{"double", "YCbCrCoefficients"}, new String[]{"int", "YCbCrPositioning"}, new String[]{"int", "YCbCrSubSampling"}, new String[]{"double", "YResolution"}, new String[]{"double", "ApertureValue"}, new String[]{"double", "BrightnessValue"}, new String[]{"string", "CFAPattern"}, new String[]{"int", "ColorSpace"}, new String[]{"string", "ComponentsConfiguration"}, new String[]{"double", "CompressedBitsPerPixel"}, new String[]{"int", "Contrast"}, new String[]{"int", "CustomRendered"}, new String[]{"string", "DateTimeDigitized"}, new String[]{"string", "DateTimeOriginal"}, new String[]{"string", "DeviceSettingDescription"}, new String[]{"double", "DigitalZoomRatio"}, new String[]{"string", "ExifVersion"}, new String[]{"double", "ExposureBiasValue"}, new String[]{"double", "ExposureIndex"}, new String[]{"int", "ExposureMode"}, new String[]{"int", "ExposureProgram"}, new String[]{"double", "ExposureTime"}, new String[]{"double", "FNumber"}, new String[]{"string", "FileSource"}, new String[]{"int", "Flash"}, new String[]{"double", "FlashEnergy"}, new String[]{"string", "FlashpixVersion"}, new String[]{"double", "FocalLength"}, new String[]{"int", "FocalLengthIn35mmFilm"}, new String[]{"int", "FocalPlaneResolutionUnit"}, new String[]{"double", "FocalPlaneXResolution"}, new String[]{"double", "FocalPlaneYResolution"}, new String[]{"int", "GainControl"}, new String[]{"int", "ISOSpeedRatings"}, new String[]{"string", "ImageUniqueID"}, new String[]{"int", "LightSource"}, new String[]{"string", "MakerNote"}, new String[]{"double", "MaxApertureValue"}, new String[]{"int", "MeteringMode"}, new String[]{"int", "NewSubfileType"}, new String[]{"string", "OECF"}, new String[]{"int", "PixelXDimension"}, new String[]{"int", "PixelYDimension"}, new String[]{"string", "RelatedSoundFile"}, new String[]{"int", "Saturation"}, new String[]{"int", "SceneCaptureType"}, new String[]{"string", "SceneType"}, new String[]{"int", "SensingMethod"}, new String[]{"int", "Sharpness"}, new String[]{"double", "ShutterSpeedValue"}, new String[]{"string", "SpatialFrequencyResponse"}, new String[]{"string", "SpectralSensitivity"}, new String[]{"int", "SubfileType"}, new String[]{"string", "SubSecTime"}, new String[]{"string", "SubSecTimeDigitized"}, new String[]{"string", "SubSecTimeOriginal"}, new String[]{"int", "SubjectArea"}, new String[]{"double", "SubjectDistance"}, new String[]{"int", "SubjectDistanceRange"}, new String[]{"int", "SubjectLocation"}, new String[]{"string", "UserComment"}, new String[]{"int", "WhiteBalance"}, new String[]{"int", "GPSAltitudeRef"}, new String[]{"string", "GPSAreaInformation"}, new String[]{"double", "GPSDOP"}, new String[]{"string", "GPSDateStamp"}, new String[]{"double", "GPSDestBearing"}, new String[]{"string", "GPSDestBearingRef"}, new String[]{"double", "GPSDestDistance"}, new String[]{"string", "GPSDestDistanceRef"}, new String[]{"double", "GPSDestLatitude"}, new String[]{"string", "GPSDestLatitudeRef"}, new String[]{"double", "GPSDestLongitude"}, new String[]{"string", "GPSDestLongitudeRef"}, new String[]{"int", "GPSDifferential"}, new String[]{"double", "GPSImgDirection"}, new String[]{"string", "GPSImgDirectionRef"}, new String[]{"string", "GPSLatitudeRef"}, new String[]{"string", "GPSLongitudeRef"}, new String[]{"string", "GPSMapDatum"}, new String[]{"string", "GPSMeasureMode"}, new String[]{"string", "GPSProcessingMethod"}, new String[]{"string", "GPSSatellites"}, new String[]{"double", "GPSSpeed"}, new String[]{"string", "GPSSpeedRef"}, new String[]{"string", "GPSStatus"}, new String[]{"string", "GPSTimeStamp"}, new String[]{"double", "GPSTrack"}, new String[]{"string", "GPSTrackRef"}, new String[]{"string", "GPSVersionID"}, new String[]{"string", "InteroperabilityIndex"}, new String[]{"int", "ThumbnailImageLength"}, new String[]{"int", "ThumbnailImageWidth"}, new String[]{"int", "DNGVersion"}, new String[]{"int", "DefaultCropSize"}, new String[]{"int", "PreviewImageStart"}, new String[]{"int", "PreviewImageLength"}, new String[]{"int", "AspectFrame"}, new String[]{"int", "SensorBottomBorder"}, new String[]{"int", "SensorLeftBorder"}, new String[]{"int", "SensorRightBorder"}, new String[]{"int", "SensorTopBorder"}, new String[]{"int", "ISO"}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableArray f43317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f43318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReactContext f43319d;

        a(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr, ReactContext reactContext) {
            this.f43316a = viewGroup;
            this.f43317b = writableArray;
            this.f43318c = bArr;
            this.f43319d = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43319d.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.c.b(this.f43316a.getId(), this.f43317b, this.f43318c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c80.b f43321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43322c;

        b(ViewGroup viewGroup, c80.b bVar, ReactContext reactContext) {
            this.f43320a = viewGroup;
            this.f43321b = bVar;
            this.f43322c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43322c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.b.b(this.f43320a.getId(), this.f43321b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.zxing.j f43324b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43325c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43326d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ byte[] f43327e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ReactContext f43328f;

        c(ViewGroup viewGroup, com.google.zxing.j jVar, int i11, int i12, byte[] bArr, ReactContext reactContext) {
            this.f43323a = viewGroup;
            this.f43324b = jVar;
            this.f43325c = i11;
            this.f43326d = i12;
            this.f43327e = bArr;
            this.f43328f = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43328f.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.a.b(this.f43323a.getId(), this.f43324b, this.f43325c, this.f43326d, this.f43327e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableArray f43330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43331c;

        d(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.f43329a = viewGroup;
            this.f43330b = writableArray;
            this.f43331c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43331c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.l.c(this.f43329a.getId(), this.f43330b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.reactnative.camera.e$e  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class RunnableC0866e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43334c;

        RunnableC0866e(ViewGroup viewGroup, String str, ReactContext reactContext) {
            this.f43332a = viewGroup;
            this.f43333b = str;
            this.f43334c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43334c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.d.b(this.f43332a.getId(), this.f43333b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f43336b;

        f(ViewGroup viewGroup, ReactContext reactContext) {
            this.f43335a = viewGroup;
            this.f43336b = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43336b.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.e.a(this.f43335a.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMap f43338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43339c;

        g(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.f43337a = viewGroup;
            this.f43338b = writableMap;
            this.f43339c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43339c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.h.b(this.f43337a.getId(), this.f43338b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f43341b;

        h(ViewGroup viewGroup, ReactContext reactContext) {
            this.f43340a = viewGroup;
            this.f43341b = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43341b.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.i.a(this.f43340a.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMap f43343b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43344c;

        i(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.f43342a = viewGroup;
            this.f43343b = writableMap;
            this.f43344c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43344c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.k.b(this.f43342a.getId(), this.f43343b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f43346b;

        j(ViewGroup viewGroup, ReactContext reactContext) {
            this.f43345a = viewGroup;
            this.f43346b = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43346b.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.j.a(this.f43345a.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43348b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43349c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43350d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ReactContext f43351e;

        k(ViewGroup viewGroup, boolean z11, int i11, int i12, ReactContext reactContext) {
            this.f43347a = viewGroup;
            this.f43348b = z11;
            this.f43349c = i11;
            this.f43350d = i12;
            this.f43351e = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43351e.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.m.b(this.f43347a.getId(), this.f43348b, this.f43349c, this.f43350d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableArray f43353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43354c;

        l(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.f43352a = viewGroup;
            this.f43353b = writableArray;
            this.f43354c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43354c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.g.b(this.f43352a.getId(), this.f43353b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f43355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g80.b f43356b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactContext f43357c;

        m(ViewGroup viewGroup, g80.b bVar, ReactContext reactContext) {
            this.f43355a = viewGroup;
            this.f43356b = bVar;
            this.f43357c = reactContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((UIManagerModule) this.f43357c.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(d80.f.b(this.f43355a.getId(), this.f43356b));
        }
    }

    public static void a(androidx.exifinterface.media.a aVar) {
        for (String[] strArr : f43315a) {
            aVar.d0(strArr[1], null);
        }
        aVar.d0("GPSLatitude", null);
        aVar.d0("GPSLongitude", null);
        aVar.d0("GPSAltitude", null);
    }

    public static void b(ViewGroup viewGroup, com.google.zxing.j jVar, int i11, int i12, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new c(viewGroup, jVar, i11, i12, bArr, reactContext));
    }

    public static void c(ViewGroup viewGroup, c80.b bVar) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new b(viewGroup, bVar, reactContext));
    }

    public static void d(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new a(viewGroup, writableArray, bArr, reactContext));
    }

    public static void e(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new f(viewGroup, reactContext));
    }

    public static void f(ViewGroup viewGroup, g80.b bVar) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new m(viewGroup, bVar, reactContext));
    }

    public static void g(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new l(viewGroup, writableArray, reactContext));
    }

    public static void h(ViewGroup viewGroup, String str) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC0866e(viewGroup, str, reactContext));
    }

    public static void i(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new g(viewGroup, writableMap, reactContext));
    }

    public static void j(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new h(viewGroup, reactContext));
    }

    public static void k(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new j(viewGroup, reactContext));
    }

    public static void l(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new i(viewGroup, writableMap, reactContext));
    }

    public static void m(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new d(viewGroup, writableArray, reactContext));
    }

    public static void n(ViewGroup viewGroup, boolean z11, int i11, int i12) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new k(viewGroup, z11, i11, i12, reactContext));
    }

    public static CamcorderProfile o(int i11) {
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        int p11 = p(i11);
        if (CamcorderProfile.hasProfile(p11)) {
            camcorderProfile = CamcorderProfile.get(p11);
            if (i11 == 4) {
                camcorderProfile.videoFrameWidth = 640;
            }
        }
        return camcorderProfile;
    }

    private static int p(int i11) {
        if (i11 == 0) {
            return Build.VERSION.SDK_INT >= 21 ? 8 : 6;
        } else if (i11 != 1) {
            if (i11 != 2) {
                return (i11 == 3 || i11 == 4) ? 4 : 1;
            }
            return 5;
        } else {
            return 6;
        }
    }

    public static int q(int i11, int i12, int i13) {
        if (i12 == 1) {
            return (i13 + i11) % 360;
        }
        return ((i13 - i11) + (s(i11) ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0)) % 360;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r8.equals("string") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.react.bridge.WritableMap r(androidx.exifinterface.media.a r12) {
        /*
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String[][] r1 = org.reactnative.camera.e.f43315a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L9:
            r5 = 0
            r7 = 1
            if (r4 >= r2) goto L63
            r8 = r1[r4]
            r9 = r8[r7]
            java.lang.String r10 = r12.g(r9)
            if (r10 == 0) goto L60
            r8 = r8[r3]
            r8.hashCode()
            r10 = -1
            int r11 = r8.hashCode()
            switch(r11) {
                case -1325958191: goto L3b;
                case -891985903: goto L32;
                case 104431: goto L27;
                default: goto L25;
            }
        L25:
            r7 = r10
            goto L45
        L27:
            java.lang.String r7 = "int"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L30
            goto L25
        L30:
            r7 = 2
            goto L45
        L32:
            java.lang.String r11 = "string"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L45
            goto L25
        L3b:
            java.lang.String r7 = "double"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L44
            goto L25
        L44:
            r7 = r3
        L45:
            switch(r7) {
                case 0: goto L59;
                case 1: goto L51;
                case 2: goto L49;
                default: goto L48;
            }
        L48:
            goto L60
        L49:
            int r5 = r12.i(r9, r3)
            r0.putInt(r9, r5)
            goto L60
        L51:
            java.lang.String r5 = r12.g(r9)
            r0.putString(r9, r5)
            goto L60
        L59:
            double r5 = r12.h(r9, r5)
            r0.putDouble(r9, r5)
        L60:
            int r4 = r4 + 1
            goto L9
        L63:
            double[] r1 = r12.m()
            if (r1 == 0) goto L80
            r2 = r1[r3]
            java.lang.String r4 = "GPSLatitude"
            r0.putDouble(r4, r2)
            r2 = r1[r7]
            java.lang.String r1 = "GPSLongitude"
            r0.putDouble(r1, r2)
            double r1 = r12.f(r5)
            java.lang.String r12 = "GPSAltitude"
            r0.putDouble(r12, r1)
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.e.r(androidx.exifinterface.media.a):com.facebook.react.bridge.WritableMap");
    }

    private static boolean s(int i11) {
        return i11 == 90 || i11 == 270;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r4.equals("string") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(androidx.exifinterface.media.a r9, com.facebook.react.bridge.ReadableMap r10) {
        /*
            java.lang.String[][] r0 = org.reactnative.camera.e.f43315a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L6b
            r4 = r0[r3]
            r5 = 1
            r6 = r4[r5]
            boolean r7 = r10.hasKey(r6)
            if (r7 == 0) goto L68
            r4 = r4[r2]
            r4.hashCode()
            r7 = -1
            int r8 = r4.hashCode()
            switch(r8) {
                case -1325958191: goto L35;
                case -891985903: goto L2c;
                case 104431: goto L21;
                default: goto L1f;
            }
        L1f:
            r5 = r7
            goto L3f
        L21:
            java.lang.String r5 = "int"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2a
            goto L1f
        L2a:
            r5 = 2
            goto L3f
        L2c:
            java.lang.String r8 = "string"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L3f
            goto L1f
        L35:
            java.lang.String r5 = "double"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
            goto L1f
        L3e:
            r5 = r2
        L3f:
            switch(r5) {
                case 0: goto L5a;
                case 1: goto L52;
                case 2: goto L43;
                default: goto L42;
            }
        L42:
            goto L68
        L43:
            int r4 = r10.getInt(r6)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r9.d0(r6, r4)
            r10.getInt(r6)
            goto L68
        L52:
            java.lang.String r4 = r10.getString(r6)
            r9.d0(r6, r4)
            goto L68
        L5a:
            double r4 = r10.getDouble(r6)
            java.lang.String r4 = java.lang.Double.toString(r4)
            r9.d0(r6, r4)
            r10.getDouble(r6)
        L68:
            int r3 = r3 + 1
            goto L5
        L6b:
            java.lang.String r0 = "GPSLatitude"
            boolean r1 = r10.hasKey(r0)
            if (r1 == 0) goto L86
            java.lang.String r1 = "GPSLongitude"
            boolean r2 = r10.hasKey(r1)
            if (r2 == 0) goto L86
            double r2 = r10.getDouble(r0)
            double r0 = r10.getDouble(r1)
            r9.f0(r2, r0)
        L86:
            java.lang.String r0 = "GPSAltitude"
            boolean r1 = r10.hasKey(r0)
            if (r1 == 0) goto L95
            double r0 = r10.getDouble(r0)
            r9.c0(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.e.t(androidx.exifinterface.media.a, com.facebook.react.bridge.ReadableMap):void");
    }
}