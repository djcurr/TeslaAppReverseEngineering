package l8;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.adyen.checkout.components.model.payments.request.Address;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.stripe.android.model.PaymentMethod;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static b f37105b = new b();

    /* renamed from: a  reason: collision with root package name */
    public f f37106a;

    public static String A() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String B(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String C() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x001f -> B:13:0x001f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String D(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r1 < r2) goto Lf
            goto L1f
        Lf:
            r2 = 26
            if (r1 < r2) goto L1c
            r1 = 28
            if (r3 < r1) goto L1c
            java.lang.String r3 = android.os.Build.getSerial()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1c:
            java.lang.String r3 = android.os.Build.SERIAL     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            if (r3 != 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.D(android.content.Context):java.lang.String");
    }

    public static String E() {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb2.append("00:");
            for (int i11 = 0; i11 < 7; i11++) {
                sb2.append(new File(strArr[i11]).exists() ? "1" : "0");
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String F(Context context) {
        try {
            long j11 = 0;
            if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                for (int i11 = 0; i11 < 5; i11++) {
                    long j12 = -1;
                    try {
                        j12 = new File(strArr[i11]).lastModified();
                    } catch (Throwable unused) {
                    }
                    j11 = Math.max(j12, j11);
                }
                return "1:" + j11;
            }
            return "0:0";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String G() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00");
        sb2.append(":");
        for (int i11 = 0; i11 <= 0; i11++) {
            try {
                Class.forName(strArr[0]);
                sb2.append("1");
            } catch (Throwable unused) {
                sb2.append("0");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String H(android.content.Context r3) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "status"
            int r3 = r3.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 2
            if (r3 == r1) goto L22
            r1 = 5
            if (r3 != r1) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L2d
            java.lang.String r3 = "1"
            goto L2f
        L2d:
            java.lang.String r3 = "0"
        L2f:
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            return r3
        L3f:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.H(android.content.Context):java.lang.String");
    }

    public static String I() {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb2.append("00:");
        for (String str : linkedHashMap.keySet()) {
            LineNumberReader lineNumberReader = null;
            char c11 = '0';
            try {
                LineNumberReader lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader2.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c11 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        lineNumberReader = lineNumberReader2;
                        sb2.append('0');
                        if (lineNumberReader != null) {
                            lineNumberReader.close();
                        }
                    }
                }
                sb2.append(c11);
                try {
                    lineNumberReader2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        }
        return sb2.toString();
    }

    public static String J(Context context) {
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                return (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String K() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", SdkAction.ACTION_TYPE);
        linkedHashMap.put("MODEL", SdkAction.ACTION_TYPE);
        for (String str : linkedHashMap.keySet()) {
            char c11 = '0';
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                if (lowerCase != null && lowerCase.contains(str3)) {
                    c11 = '1';
                }
            } catch (Throwable unused) {
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public static String L() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", SdkAction.ACTION_TYPE);
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", SdkAction.ACTION_TYPE);
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c11 = '0';
            String str2 = (String) linkedHashMap.get(str);
            String e11 = x9.a.e(str, "");
            if (e11 != null && e11.contains(str2)) {
                c11 = '1';
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public static String M() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, PKIFailureInfo.certRevoked);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileReader = null;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (Throwable unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Throwable unused4) {
                }
            }
            if (fileReader == null) {
                return "";
            }
            try {
                fileReader.close();
                return "";
            } catch (Throwable unused5) {
                return "";
            }
        }
        if (x9.a.c(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r0 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String N() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L41
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e
        L11:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3a
            boolean r4 = x9.a.c(r2)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L11
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L11
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            if (r4 <= r5) goto L11
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L11
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3f
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L49
        L3e:
            r0 = r2
        L3f:
            r2 = r3
            goto L42
        L41:
            r0 = r2
        L42:
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.lang.Throwable -> L47
        L47:
            if (r0 == 0) goto L4c
        L49:
            r0.close()     // Catch: java.lang.Throwable -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.N():java.lang.String");
    }

    private String O() {
        String a11 = d.a("ip");
        if (a11 != null) {
            return a11;
        }
        if (this.f37106a.isBackgroundRunning()) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements() && a11 == null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            a11 = nextElement.getHostAddress().toString();
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String str = a11 != null ? a11 : "";
        d.b("ip", str);
        return str;
    }

    public static b c(f fVar) {
        b bVar = f37105b;
        bVar.f37106a = fVar;
        return bVar;
    }

    public static boolean d(Context context, String str) {
        return !(context.getPackageManager().checkPermission(str, context.getPackageName()) == 0);
    }

    public static String e() {
        long j11;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j11 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    public static String g() {
        long j11;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j11 = statFs.getBlockSize() * statFs.getAvailableBlocks();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r2 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i() {
        /*
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
            r1 = 1
            r5 = r1
        L1b:
            r6 = 100
            if (r5 >= r6) goto L46
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L46
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L44
            if (r7 < 0) goto L41
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: java.lang.Throwable -> L44
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L44
            goto L46
        L41:
            int r5 = r5 + 1
            goto L1b
        L44:
            r1 = r4
            goto L51
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L49
        L49:
            r3.close()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L4d:
            r3 = r1
            goto L51
        L4f:
            r2 = r1
            r3 = r2
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L56
        L56:
            if (r3 == 0) goto L5b
            r3.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()     // Catch: java.lang.Throwable -> L60
        L60:
            if (r0 != 0) goto L64
            java.lang.String r0 = ""
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.i():java.lang.String");
    }

    public static String k() {
        String M = M();
        return !x9.a.c(M) ? M : N();
    }

    public static String m() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    String[] split = bufferedReader.readLine().split(":\\s+", 2);
                    if (split != null && split.length > 1) {
                        String str = split[1];
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (Throwable unused4) {
                            return "";
                        }
                    }
                } catch (Throwable unused5) {
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader.close();
                    return "";
                }
            } catch (Throwable unused7) {
                bufferedReader = null;
            }
        } catch (Throwable unused8) {
            bufferedReader = null;
        }
    }

    public static String n(Context context) {
        int i11 = 0;
        try {
            i11 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i11 == 1 ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String o() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L25
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L2a
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L2a
            long r2 = (long) r1
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L34
            goto L34
        L29:
            r0 = r1
        L2a:
            r1 = r4
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.lang.Throwable -> L32
        L32:
            if (r0 == 0) goto L37
        L34:
            r0.close()     // Catch: java.lang.Throwable -> L37
        L37:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.o():java.lang.String");
    }

    public static String p(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i11 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i11));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String q() {
        long j11;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j11 = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String r(android.content.Context r3) {
        /*
            if (r3 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            r0 = -1
            java.util.List r3 = r3.getSensorList(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = x9.a.i(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.r(android.content.Context):java.lang.String");
    }

    public static String s() {
        long j11;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j11 = statFs.getBlockSize() * statFs.getBlockCount();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    public static String t(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String u() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String v(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + Marker.ANY_MARKER + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String w() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String x(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.widthPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String y() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String z(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.heightPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String a() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String b(Context context) {
        String subscriberId = this.f37106a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String a11 = d.a("imsi");
        if (a11 != null) {
            return a11;
        }
        if (this.f37106a.isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
                if (telephonyManager != null) {
                    a11 = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
        }
        if (a11 == null) {
            a11 = "";
        }
        d.b("imsi", a11);
        return a11;
    }

    public final synchronized String f(Context context) {
        String a11 = d.a("NetworkOperatorName");
        if (a11 != null) {
            return a11;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
                if (telephonyManager != null) {
                    a11 = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        a11 = (a11 == null || Address.ADDRESS_NULL_PLACEHOLDER.equals(a11)) ? "" : "";
        d.b("NetworkOperatorName", a11);
        return a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r0.length() == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String h(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "SimSerial"
            java.lang.String r0 = l8.d.a(r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto Lb
            monitor-exit(r2)
            return r0
        Lb:
            l8.f r1 = r2.f37106a     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isBackgroundRunning()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L17
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L17:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = d(r3, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L23
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L23:
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L39
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r3.getSimSerialNumber()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L37
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L39
        L37:
            java.lang.String r0 = ""
        L39:
            java.lang.String r3 = "SimSerial"
            l8.d.b(r3, r0)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r2)
            return r0
        L40:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.h(android.content.Context):java.lang.String");
    }

    public final synchronized String j(Context context) {
        String str;
        String androidId = this.f37106a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String a11 = d.a("ANDROIDID");
        if (a11 != null) {
            return a11;
        }
        if (this.f37106a.isBackgroundRunning()) {
            return "";
        }
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        d.b("ANDROIDID", str);
        return str;
    }

    public final String l(Context context) {
        try {
            String J = J(context);
            String O = O();
            if (x9.a.f(J) && x9.a.f(O)) {
                return J + ":" + O();
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}