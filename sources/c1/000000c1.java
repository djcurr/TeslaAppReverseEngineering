package ak;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.l;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a */
    public static final int f477a;

    /* renamed from: b */
    public static final String f478b;

    /* renamed from: c */
    public static final String f479c;

    /* renamed from: d */
    public static final String f480d;

    /* renamed from: e */
    public static final String f481e;

    /* renamed from: f */
    public static final byte[] f482f;

    /* renamed from: g */
    private static final Pattern f483g;

    /* renamed from: h */
    private static final Pattern f484h;

    /* renamed from: i */
    private static final Pattern f485i;

    /* renamed from: j */
    private static HashMap<String, String> f486j;

    /* renamed from: k */
    private static final String[] f487k;

    /* renamed from: l */
    private static final String[] f488l;

    /* renamed from: m */
    private static final int[] f489m;

    /* renamed from: n */
    private static final int[] f490n;

    static {
        int i11;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i11 = 31;
        } else {
            i11 = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        f477a = i11;
        String str2 = Build.DEVICE;
        f478b = str2;
        String str3 = Build.MANUFACTURER;
        f479c = str3;
        String str4 = Build.MODEL;
        f480d = str4;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i11);
        f481e = sb2.toString();
        f482f = new byte[0];
        f483g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f484h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f485i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f487k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f488l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f489m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f490n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 133, 168, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 176, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 190, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 143, 136, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, CipherSuite.TLS_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 184, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 160, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 188, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 150, 145, 152, 159, 138, 141, 132, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static Handler A(Handler.Callback callback) {
        return w(P(), callback);
    }

    public static <T> T[] A0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    private static HashMap<String, String> B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f487k.length);
        int i11 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f487k;
            if (i11 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i11], strArr[i11 + 1]);
            i11 += 2;
        }
    }

    public static <T> T[] B0(T[] tArr, int i11) {
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    public static Uri C(Uri uri) {
        String R0 = R0(uri.getPath());
        if (R0 == null) {
            return uri;
        }
        Matcher matcher = f485i.matcher(R0);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static <T> T[] C0(T[] tArr, int i11, int i12) {
        a.a(i11 >= 0);
        a.a(i12 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i11, i12);
    }

    public static String D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long D0(String str) {
        Matcher matcher = f483g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new ParserException(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
        }
        int i11 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i11 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i11 != 0 ? timeInMillis - (i11 * 60000) : timeInMillis;
    }

    public static String E(byte[] bArr) {
        return new String(bArr, com.google.common.base.f.f15920c);
    }

    public static long E0(String str) {
        Matcher matcher = f484h.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static String F(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, com.google.common.base.f.f15920c);
    }

    public static boolean F0(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static int G(int i11) {
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i12 = f477a;
                return (i12 < 23 && i12 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static boolean G0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int H(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i12 : Integer.reverseBytes(i12);
    }

    public static <T> void H0(List<T> list, int i11, int i12) {
        if (i11 < 0 || i12 > list.size() || i11 > i12) {
            throw new IllegalArgumentException();
        }
        if (i11 != i12) {
            list.subList(i11, i12).clear();
        }
    }

    public static byte[] I(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
        }
        return bArr;
    }

    public static long I0(long j11, long j12, long j13) {
        int i11 = (j13 > j12 ? 1 : (j13 == j12 ? 0 : -1));
        if (i11 >= 0 && j13 % j12 == 0) {
            return j11 / (j13 / j12);
        }
        if (i11 >= 0 || j12 % j13 != 0) {
            return (long) (j11 * (j12 / j13));
        }
        return j11 * (j12 / j13);
    }

    public static int J(String str, int i11) {
        int i12 = 0;
        for (String str2 : N0(str)) {
            if (i11 == r.n(str2)) {
                i12++;
            }
        }
        return i12;
    }

    public static long[] J0(List<Long> list, long j11, long j12) {
        int size = list.size();
        long[] jArr = new long[size];
        int i11 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        int i12 = 0;
        if (i11 >= 0 && j12 % j11 == 0) {
            long j13 = j12 / j11;
            while (i12 < size) {
                jArr[i12] = list.get(i12).longValue() / j13;
                i12++;
            }
        } else if (i11 >= 0 || j11 % j12 != 0) {
            double d11 = j11 / j12;
            while (i12 < size) {
                jArr[i12] = (long) (list.get(i12).longValue() * d11);
                i12++;
            }
        } else {
            long j14 = j11 / j12;
            while (i12 < size) {
                jArr[i12] = list.get(i12).longValue() * j14;
                i12++;
            }
        }
        return jArr;
    }

    public static String K(String str, int i11) {
        String[] N0 = N0(str);
        if (N0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : N0) {
            if (i11 == r.n(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static void K0(long[] jArr, long j11, long j12) {
        int i11 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        int i12 = 0;
        if (i11 >= 0 && j12 % j11 == 0) {
            long j13 = j12 / j11;
            while (i12 < jArr.length) {
                jArr[i12] = jArr[i12] / j13;
                i12++;
            }
        } else if (i11 < 0 && j11 % j12 == 0) {
            long j14 = j11 / j12;
            while (i12 < jArr.length) {
                jArr[i12] = jArr[i12] * j14;
                i12++;
            }
        } else {
            double d11 = j11 / j12;
            while (i12 < jArr.length) {
                jArr[i12] = (long) (jArr[i12] * d11);
                i12++;
            }
        }
    }

    public static String L(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < objArr.length; i11++) {
            sb2.append(objArr[i11].getClass().getSimpleName());
            if (i11 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static String[] L0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String M(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return T0(networkCountryIso);
            }
        }
        return T0(Locale.getDefault().getCountry());
    }

    public static String[] M0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Point N(Context context) {
        return O(context, ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay());
    }

    public static String[] N0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : L0(str.trim(), "(\\s*,\\s*)");
    }

    public static Point O(Context context, Display display) {
        String j02;
        int i11 = f477a;
        if (i11 <= 29 && display.getDisplayId() == 0 && s0(context)) {
            if ("Sony".equals(f479c) && f480d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i11 < 28) {
                j02 = j0("sys.display-size");
            } else {
                j02 = j0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(j02)) {
                try {
                    String[] L0 = L0(j02.trim(), "x");
                    if (L0.length == 2) {
                        int parseInt = Integer.parseInt(L0[0]);
                        int parseInt2 = Integer.parseInt(L0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(j02);
                o.c("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i12 = f477a;
        if (i12 >= 23) {
            S(display, point);
        } else if (i12 >= 17) {
            R(display, point);
        } else {
            Q(display, point);
        }
        return point;
    }

    public static long O0(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        return ((j11 ^ j14) & (j12 ^ j11)) < 0 ? j13 : j14;
    }

    public static Looper P() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static byte[] P0(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void Q(Display display, Point point) {
        display.getSize(point);
    }

    public static long Q0(int i11, int i12) {
        return S0(i12) | (S0(i11) << 32);
    }

    private static void R(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String R0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    private static void S(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long S0(int i11) {
        return i11 & 4294967295L;
    }

    public static UUID T(String str) {
        String R0 = R0(str);
        R0.hashCode();
        char c11 = 65535;
        switch (R0.hashCode()) {
            case -1860423953:
                if (R0.equals("playready")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (R0.equals("widevine")) {
                    c11 = 1;
                    break;
                }
                break;
            case 790309106:
                if (R0.equals("clearkey")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return ci.b.f9157e;
            case 1:
                return ci.b.f9156d;
            case 2:
                return ci.b.f9155c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static String T0(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    public static String U(Locale locale) {
        return f477a >= 21 ? V(locale) : locale.toString();
    }

    public static CharSequence U0(CharSequence charSequence, int i11) {
        return charSequence.length() <= i11 ? charSequence : charSequence.subSequence(0, i11);
    }

    private static String V(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void V0(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    public static long W(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 * f11);
    }

    private static int X(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return f477a >= 29 ? 9 : 0;
        }
    }

    public static int Y(Context context) {
        ConnectivityManager connectivityManager;
        int i11 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return X(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    public static long Z(long j11) {
        if (j11 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j11 + SystemClock.elapsedRealtime();
    }

    public static int a0(int i11) {
        if (i11 != 8) {
            if (i11 != 16) {
                return i11 != 24 ? i11 != 32 ? 0 : 805306368 : PKIFailureInfo.duplicateCertReq;
            }
            return 2;
        }
        return 3;
    }

    public static long b(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        return ((j11 ^ j14) & (j12 ^ j14)) < 0 ? j13 : j14;
    }

    public static ci.i b0(int i11, int i12, int i13) {
        return new i.b().e0("audio/raw").H(i12).f0(i13).Y(i11).E();
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c0(int i11, int i12) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 268435456) {
                        if (i11 == 536870912) {
                            return i12 * 3;
                        }
                        if (i11 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i12 * 4;
            }
            return i12;
        }
        return i12 * 2;
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Collections.binarySearch(list, t11);
        if (binarySearch < 0) {
            i11 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t11) == 0);
            i11 = z11 ? binarySearch - 1 : binarySearch;
        }
        return z12 ? Math.min(list.size() - 1, i11) : i11;
    }

    public static long d0(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 / f11);
    }

    public static int e(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i11 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j11);
            i11 = z11 ? binarySearch - 1 : binarySearch;
        }
        return z12 ? Math.min(jArr.length - 1, i11) : i11;
    }

    public static int e0(int i11) {
        if (i11 != 13) {
            switch (i11) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static int f(p pVar, long j11, boolean z11, boolean z12) {
        int i11;
        int c11 = pVar.c() - 1;
        int i12 = 0;
        while (i12 <= c11) {
            int i13 = (i12 + c11) >>> 1;
            if (pVar.b(i13) < j11) {
                i12 = i13 + 1;
            } else {
                c11 = i13 - 1;
            }
        }
        if (z11 && (i11 = c11 + 1) < pVar.c() && pVar.b(i11) == j11) {
            return i11;
        }
        if (z12 && c11 == -1) {
            return 0;
        }
        return c11;
    }

    public static String f0(StringBuilder sb2, Formatter formatter, long j11) {
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        String str = j11 < 0 ? "-" : "";
        long abs = (Math.abs(j11) + 500) / 1000;
        long j12 = abs % 60;
        long j13 = (abs / 60) % 60;
        long j14 = abs / 3600;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    public static <T extends Comparable<? super T>> int g(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Collections.binarySearch(list, t11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t11) == 0);
            i11 = z11 ? binarySearch + 1 : binarySearch;
        }
        return z12 ? Math.max(0, i11) : i11;
    }

    public static String[] g0() {
        String[] h02 = h0();
        for (int i11 = 0; i11 < h02.length; i11++) {
            h02[i11] = y0(h02[i11]);
        }
        return h02;
    }

    public static int h(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i11);
            i12 = z11 ? binarySearch + 1 : binarySearch;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    private static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f477a >= 24 ? i0(configuration) : new String[]{U(configuration.locale)};
    }

    public static int i(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j11);
            i11 = z11 ? binarySearch + 1 : binarySearch;
        }
        return z12 ? Math.max(0, i11) : i11;
    }

    private static String[] i0(Configuration configuration) {
        return L0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T> T j(T t11) {
        return t11;
    }

    private static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            String valueOf = String.valueOf(str);
            o.d("Util", valueOf.length() != 0 ? "Failed to read system property ".concat(valueOf) : new String("Failed to read system property "), e11);
            return null;
        }
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static String k0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = CallerData.NA;
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        sb2.append(str3);
        sb2.append(") ");
        sb2.append("ExoPlayerLib/2.13.2");
        return sb2.toString();
    }

    public static int l(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    public static byte[] l0(String str) {
        return str.getBytes(com.google.common.base.f.f15920c);
    }

    public static long m(long j11, long j12) {
        return ((j11 + j12) - 1) / j12;
    }

    public static int m0(String str) {
        String R0 = R0(str);
        if (R0.endsWith(".mpd")) {
            return 0;
        }
        if (R0.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f485i.matcher(R0);
        if (matcher.matches()) {
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return group.contains("format=m3u8-aapl") ? 2 : 1;
            }
            return 1;
        }
        return 3;
    }

    public static void n(com.google.android.exoplayer2.upstream.a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean n0(v vVar, v vVar2, Inflater inflater) {
        if (vVar.a() <= 0) {
            return false;
        }
        if (vVar2.b() < vVar.a()) {
            vVar2.c(vVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(vVar.d(), vVar.e(), vVar.a());
        int i11 = 0;
        while (true) {
            try {
                i11 += inflater.inflate(vVar2.d(), i11, vVar2.b() - i11);
                if (inflater.finished()) {
                    vVar2.N(i11);
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i11 == vVar2.b()) {
                    vVar2.c(vVar2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean o0(int i11) {
        return i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    public static int p(long j11, long j12) {
        int i11 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    public static boolean p0(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    public static float q(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    public static boolean q0(int i11) {
        return i11 == 10 || i11 == 13;
    }

    public static int r(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    public static boolean r0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Action.FILE_ATTRIBUTE.equals(scheme);
    }

    public static long s(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    public static boolean s0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean t(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Thread t0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int u(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f489m[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    public static int u0(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static int v(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f490n[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    private static String v0(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = f488l;
            if (i11 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i11])) {
                String valueOf = String.valueOf(strArr[i11 + 1]);
                String valueOf2 = String.valueOf(str.substring(strArr[i11].length()));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            i11 += 2;
        }
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static <T> void w0(List<T> list, int i11, int i12, int i13) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i14 = (i12 - i11) - 1; i14 >= 0; i14--) {
            arrayDeque.addFirst(list.remove(i11 + i14));
        }
        list.addAll(Math.min(i13, list.size()), arrayDeque);
    }

    public static Handler x() {
        return y(null);
    }

    public static ExecutorService x0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ak.j0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread t02;
                t02 = k0.t0(str, runnable);
                return t02;
            }
        });
    }

    public static Handler y(Handler.Callback callback) {
        return w((Looper) a.h(Looper.myLooper()), callback);
    }

    public static String y0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', CoreConstants.DASH_CHAR);
        if (!replace.isEmpty() && !RequestHeadersFactory.UNDETERMINED_LANGUAGE.equals(replace)) {
            str = replace;
        }
        String R0 = R0(str);
        String str2 = M0(R0, "-")[0];
        if (f486j == null) {
            f486j = B();
        }
        String str3 = f486j.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(R0.substring(str2.length()));
            R0 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || IntegerTokenConverter.CONVERTER_KEY.equals(str2) || "zh".equals(str2)) ? v0(R0) : R0;
    }

    public static Handler z() {
        return A(null);
    }

    public static <T> T[] z0(T[] tArr, T t11) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t11;
        return (T[]) k(copyOf);
    }
}