package a0;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.l;
import androidx.camera.core.n0;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final g[] f63c;

    /* renamed from: d  reason: collision with root package name */
    private static final g[] f64d;

    /* renamed from: e  reason: collision with root package name */
    private static final g[] f65e;

    /* renamed from: f  reason: collision with root package name */
    static final g[] f66f;

    /* renamed from: g  reason: collision with root package name */
    private static final g[] f67g;

    /* renamed from: h  reason: collision with root package name */
    static final g[][] f68h;

    /* renamed from: i  reason: collision with root package name */
    static final HashSet<String> f69i;

    /* renamed from: a  reason: collision with root package name */
    private final List<Map<String, d>> f70a;

    /* renamed from: b  reason: collision with root package name */
    private final ByteOrder f71b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f73b;

        static {
            int[] iArr = new int[c.values().length];
            f73b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[l.values().length];
            f72a = iArr2;
            try {
                iArr2[l.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72a[l.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72a[l.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f74c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f75d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f76e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f  reason: collision with root package name */
        static final List<HashMap<String, g>> f77f = Collections.list(new a());

        /* renamed from: a  reason: collision with root package name */
        final List<Map<String, d>> f78a = Collections.list(new C0004b(this));

        /* renamed from: b  reason: collision with root package name */
        private final ByteOrder f79b;

        /* loaded from: classes.dex */
        class a implements Enumeration<HashMap<String, g>> {

            /* renamed from: a  reason: collision with root package name */
            int f80a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap<String, g> nextElement() {
                g[] gVarArr;
                HashMap<String, g> hashMap = new HashMap<>();
                for (g gVar : e.f68h[this.f80a]) {
                    hashMap.put(gVar.f92b, gVar);
                }
                this.f80a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f80a < e.f68h.length;
            }
        }

        /* renamed from: a0.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0004b implements Enumeration<Map<String, d>> {

            /* renamed from: a  reason: collision with root package name */
            int f81a = 0;

            C0004b(b bVar) {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, d> nextElement() {
                this.f81a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f81a < e.f68h.length;
            }
        }

        /* loaded from: classes.dex */
        class c implements Enumeration<Map<String, d>> {

            /* renamed from: a  reason: collision with root package name */
            final Enumeration<Map<String, d>> f82a;

            c() {
                this.f82a = Collections.enumeration(b.this.f78a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, d> nextElement() {
                return new HashMap(this.f82a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f82a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f79b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b11 = b(split[0]);
                if (((Integer) b11.first).intValue() == 2) {
                    return b11;
                }
                for (int i11 = 1; i11 < split.length; i11++) {
                    Pair<Integer, Integer> b12 = b(split[i11]);
                    int intValue = (((Integer) b12.first).equals(b11.first) || ((Integer) b12.second).equals(b11.first)) ? ((Integer) b11.first).intValue() : -1;
                    int intValue2 = (((Integer) b11.second).intValue() == -1 || !(((Integer) b12.first).equals(b11.second) || ((Integer) b12.second).equals(b11.second))) ? -1 : ((Integer) b11.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        b11 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        b11 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return b11;
            } else if (str.contains("/")) {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i12 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i12 < 0 || parseLong > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            if (i12 < 0) {
                                return new Pair<>(9, -1);
                            }
                            return new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused2) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused3) {
                    return new Pair<>(2, -1);
                }
            }
        }

        private void d(String str, String str2, List<Map<String, d>> list) {
            for (Map<String, d> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x018a, code lost:
            if (r7 != r0) goto L100;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, a0.d>> r20) {
            /*
                Method dump skipped, instructions count: 772
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.e.b.e(java.lang.String, java.lang.String, java.util.List):void");
        }

        public e a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new e(this.f79b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f78a);
            return this;
        }

        public b f(long j11) {
            return c("ExposureTime", String.valueOf(j11 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(l lVar) {
            int i11;
            if (lVar == l.UNKNOWN) {
                return this;
            }
            int i12 = a.f72a[lVar.ordinal()];
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 2) {
                i11 = 32;
            } else if (i12 != 3) {
                n0.m("ExifData", "Unknown flash state: " + lVar);
                return this;
            } else {
                i11 = 1;
            }
            if ((i11 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i11));
        }

        public b h(float f11) {
            return c("FocalLength", new h(f11 * 1000.0f, 1000L).toString());
        }

        public b i(int i11) {
            return c("ImageLength", String.valueOf(i11));
        }

        public b j(int i11) {
            return c("ImageWidth", String.valueOf(i11));
        }

        public b k(int i11) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min((int) Settings.DEFAULT_INITIAL_WINDOW_SIZE, i11)));
        }

        public b l(float f11) {
            return c("FNumber", String.valueOf(f11));
        }

        public b m(int i11) {
            int i12;
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 90) {
                i12 = 6;
            } else if (i11 == 180) {
                i12 = 3;
            } else if (i11 != 270) {
                n0.m("ExifData", "Unexpected orientation value: " + i11 + ". Must be one of 0, 90, 180, 270.");
                i12 = 0;
            } else {
                i12 = 8;
            }
            return c("Orientation", String.valueOf(i12));
        }

        public b n(c cVar) {
            String valueOf;
            int i11 = a.f73b[cVar.ordinal()];
            if (i11 != 1) {
                valueOf = i11 != 2 ? null : String.valueOf(1);
            } else {
                valueOf = String.valueOf(0);
            }
            return c("WhiteBalance", valueOf);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        g[] gVarArr = {new g("ImageWidth", 256, 3, 4), new g("ImageLength", 257, 3, 4), new g("Make", 271, 2), new g("Model", 272, 2), new g("Orientation", 274, 3), new g("XResolution", 282, 5), new g("YResolution", 283, 5), new g("ResolutionUnit", 296, 3), new g("Software", 305, 2), new g("DateTime", 306, 2), new g("YCbCrPositioning", 531, 3), new g("SubIFDPointer", 330, 4), new g("ExifIFDPointer", 34665, 4), new g("GPSInfoIFDPointer", 34853, 4)};
        f63c = gVarArr;
        g[] gVarArr2 = {new g("ExposureTime", 33434, 5), new g("FNumber", 33437, 5), new g("ExposureProgram", 34850, 3), new g("PhotographicSensitivity", 34855, 3), new g("SensitivityType", 34864, 3), new g("ExifVersion", 36864, 2), new g("DateTimeOriginal", 36867, 2), new g("DateTimeDigitized", 36868, 2), new g("ComponentsConfiguration", 37121, 7), new g("ShutterSpeedValue", 37377, 10), new g("ApertureValue", 37378, 5), new g("BrightnessValue", 37379, 10), new g("ExposureBiasValue", 37380, 10), new g("MaxApertureValue", 37381, 5), new g("MeteringMode", 37383, 3), new g("LightSource", 37384, 3), new g("Flash", 37385, 3), new g("FocalLength", 37386, 5), new g("SubSecTime", 37520, 2), new g("SubSecTimeOriginal", 37521, 2), new g("SubSecTimeDigitized", 37522, 2), new g("FlashpixVersion", 40960, 7), new g("ColorSpace", 40961, 3), new g("PixelXDimension", 40962, 3, 4), new g("PixelYDimension", 40963, 3, 4), new g("InteroperabilityIFDPointer", 40965, 4), new g("FocalPlaneResolutionUnit", 41488, 3), new g("SensingMethod", 41495, 3), new g("FileSource", 41728, 7), new g("SceneType", 41729, 7), new g("CustomRendered", 41985, 3), new g("ExposureMode", 41986, 3), new g("WhiteBalance", 41987, 3), new g("SceneCaptureType", 41990, 3), new g("Contrast", 41992, 3), new g("Saturation", 41993, 3), new g("Sharpness", 41994, 3)};
        f64d = gVarArr2;
        g[] gVarArr3 = {new g("GPSVersionID", 0, 1), new g("GPSLatitudeRef", 1, 2), new g("GPSLatitude", 2, 5, 10), new g("GPSLongitudeRef", 3, 2), new g("GPSLongitude", 4, 5, 10), new g("GPSAltitudeRef", 5, 1), new g("GPSAltitude", 6, 5), new g("GPSTimeStamp", 7, 5), new g("GPSSpeedRef", 12, 2), new g("GPSTrackRef", 14, 2), new g("GPSImgDirectionRef", 16, 2), new g("GPSDestBearingRef", 23, 2), new g("GPSDestDistanceRef", 25, 2)};
        f65e = gVarArr3;
        f66f = new g[]{new g("SubIFDPointer", 330, 4), new g("ExifIFDPointer", 34665, 4), new g("GPSInfoIFDPointer", 34853, 4), new g("InteroperabilityIFDPointer", 40965, 4)};
        g[] gVarArr4 = {new g("InteroperabilityIndex", 1, 2)};
        f67g = gVarArr4;
        f68h = new g[][]{gVarArr, gVarArr2, gVarArr3, gVarArr4};
        f69i = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    e(ByteOrder byteOrder, List<Map<String, d>> list) {
        v3.h.i(list.size() == f68h.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f71b = byteOrder;
        this.f70a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, d> b(int i11) {
        int length = f68h.length;
        v3.h.c(i11, 0, length, "Invalid IFD index: " + i11 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f70a.get(i11);
    }

    public ByteOrder c() {
        return this.f71b;
    }
}