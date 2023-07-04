package t9;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import g9.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.slf4j.Marker;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    public static final String[] f51801a = {"10.1.5.1013151", "10.1.5.1013148"};

    /* renamed from: b */
    public static final char[] f51802b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f51803a;

        public a(Activity activity) {
            this.f51803a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f51803a.finish();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f51804a;

        /* renamed from: b */
        public final /* synthetic */ ConditionVariable f51805b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f51804a = runnable;
            this.f51805b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f51804a.run();
            } finally {
                this.f51805b.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final PackageInfo f51806a;

        /* renamed from: b */
        public final int f51807b;

        /* renamed from: c */
        public final String f51808c;

        public c(PackageInfo packageInfo, int i11, String str) {
            this.f51806a = packageInfo;
            this.f51807b = i11;
            this.f51808c = str;
        }

        public boolean a() {
            return this.f51806a.versionCode < this.f51807b;
        }

        public boolean b(r9.a aVar) {
            Signature[] signatureArr = this.f51806a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String m11 = m.m(aVar, signature.toByteArray());
                if (m11 != null && !TextUtils.equals(m11, this.f51808c)) {
                    c9.a.h(aVar, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", m11, this.f51808c));
                    return true;
                }
            }
            return false;
        }
    }

    public static int A(int i11) {
        return i11 / 100000;
    }

    public static String B() {
        if (com.alipay.sdk.app.a.c()) {
            return "com.eg.android.AlipayGphoneRC";
        }
        try {
            return a9.a.f355d.get(0).f27887a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static String C(Context context) {
        return "-1;-1";
    }

    public static String D(String str, String str2) {
        String string = Settings.Secure.getString(((Application) r9.b.e().c()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static Map<String, String> E(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static Map<String, String> F(r9.a aVar, String str) {
        String[] split;
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), R(aVar, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static boolean G(r9.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f49319g)) {
            return false;
        }
        return aVar.f49319g.toLowerCase().contains("auth");
    }

    public static String H(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String I(String str) {
        return (com.alipay.sdk.app.a.c() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static String J(r9.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e11) {
            c9.a.h(aVar, "biz", "rflex", e11.getClass().getSimpleName());
            return null;
        }
    }

    public static int K(String str) {
        for (int i11 = 0; i11 < 64; i11++) {
            if (str.equals(String.valueOf(f51802b[i11]))) {
                return i11;
            }
        }
        return 0;
    }

    public static DisplayMetrics L(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String M() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (matcher.matches() && matcher.groupCount() >= 4) {
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            }
            return "Unavailable";
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean N(r9.a aVar, String str) {
        try {
            int O = O(str);
            c9.a.c(aVar, "biz", "bindExt", "" + O);
            return g9.a.d().B() && (O & 2) == 2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int O(String str) {
        try {
            String w11 = g9.a.d().w();
            if (TextUtils.isEmpty(w11)) {
                return 0;
            }
            return (D(w11, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String P() {
        String M = M();
        int indexOf = M.indexOf("-");
        if (indexOf != -1) {
            M = M.substring(0, indexOf);
        }
        int indexOf2 = M.indexOf("\n");
        if (indexOf2 != -1) {
            M = M.substring(0, indexOf2);
        }
        return "Linux " + M;
    }

    public static String Q(Context context) {
        String a11 = l.a(context);
        return a11.substring(0, a11.indexOf("://"));
    }

    public static String R(r9.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            c9.a.d(aVar, "biz", "H5PayDataAnalysisError", e11);
            return "";
        }
    }

    public static String S() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String T(Context context) {
        DisplayMetrics L = L(context);
        return L.widthPixels + Marker.ANY_MARKER + L.heightPixels;
    }

    public static boolean U(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static int V() {
        try {
            return Process.myUid();
        } catch (Throwable th2) {
            e.d(th2);
            return -200;
        }
    }

    public static String W(Context context) {
        String S = S();
        String P = P();
        String H = H(context);
        String T = T(context);
        return " (" + S + ";" + P + ";" + H + ";;" + T + ")(sdk android)";
    }

    public static String X(String str) {
        return j(str, true);
    }

    public static JSONObject Y(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static boolean Z() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static int a() {
        String d11 = r9.b.e().d();
        if (TextUtils.isEmpty(d11)) {
            return -1;
        }
        String replaceAll = d11.replaceAll("=", "");
        if (replaceAll.length() >= 5) {
            replaceAll = replaceAll.substring(0, 5);
        }
        int b11 = (int) (b(replaceAll) % AbstractComponentTracker.LINGERING_TIMEOUT);
        return b11 < 0 ? b11 * (-1) : b11;
    }

    public static boolean a0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static long b(String str) {
        return c(str, 6);
    }

    public static String b0(String str) {
        try {
            Uri parse = Uri.parse(str);
            return String.format("%s%s", parse.getAuthority(), parse.getPath());
        } catch (Throwable th2) {
            e.d(th2);
            return "-";
        }
    }

    public static long c(String str, int i11) {
        int i12;
        int pow = (int) Math.pow(2.0d, i11);
        int length = str.length();
        long j11 = 0;
        int i13 = length;
        for (int i14 = 0; i14 < length; i14++) {
            j11 += Integer.parseInt(String.valueOf(K(str.substring(i14, i12)))) * ((long) Math.pow(pow, i13 - 1));
            i13--;
        }
        return j11;
    }

    public static boolean c0() {
        try {
            String[] split = g9.a.d().t().split("\\|");
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : split) {
                if (TextUtils.equals(str, str2) || TextUtils.equals(str2, "all")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e.d(th2);
            return false;
        }
    }

    public static ActivityInfo d(Context context) {
        ActivityInfo[] activityInfoArr;
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e.d(th2);
            return null;
        }
    }

    public static PackageInfo e(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static <T> T f(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String g(int i11) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb2.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb2.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb2.toString();
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int indexOf2 = TextUtils.isEmpty(str2) ? 0 : str3.indexOf(str2, indexOf);
            if (indexOf2 < 1) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j(String str, boolean z11) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (z11 && digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return n(bArr);
            }
            return n(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String k(r9.a aVar) {
        return J(aVar, "ro.build.fingerprint");
    }

    public static String l(r9.a aVar, Context context) {
        try {
            String b11 = i.b(aVar, context, "alipay_cashier_ap_fi", "");
            if (TextUtils.isEmpty(b11)) {
                try {
                    i.c(aVar, context, "alipay_cashier_ap_fi", x8.a.b("FU", System.currentTimeMillis(), new x8.d(), (short) 0, new x8.f()).a());
                    String b12 = i.b(aVar, context, "alipay_cashier_ap_fi", "");
                    if (TextUtils.isEmpty(b12)) {
                        c9.a.h(aVar, "biz", "e_regen_empty", "");
                        return "";
                    }
                    return b12;
                } catch (Exception e11) {
                    c9.a.h(aVar, "biz", "e_gen", e11.getClass().getSimpleName());
                    return "";
                }
            }
            return b11;
        } catch (Exception e12) {
            c9.a.d(aVar, "biz", "e_gen_err", e12);
            return "";
        }
    }

    public static String m(r9.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e11) {
            c9.a.d(aVar, "auth", "GetPublicKeyFromSignEx", e11);
            return null;
        }
    }

    public static String n(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(Character.forDigit((b11 & 240) >> 4, 16));
            sb2.append(Character.forDigit(b11 & 15, 16));
        }
        return sb2.toString();
    }

    public static Map<String, String> o(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.optString(next));
            } catch (Throwable th2) {
                e.d(th2);
            }
        }
        return hashMap;
    }

    public static JSONObject p(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static c q(PackageInfo packageInfo, int i11, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i11, str);
    }

    public static c r(r9.a aVar, Context context, String str, int i11, String str2) {
        PackageInfo packageInfo;
        if (com.alipay.sdk.app.a.c() && "com.eg.android.AlipayGphone".equals(str)) {
            str = "com.eg.android.AlipayGphoneRC";
        }
        try {
            packageInfo = e(context, str);
        } catch (Throwable th2) {
            c9.a.h(aVar, "auth", "GetPackageInfoEx", th2.getMessage());
            packageInfo = null;
        }
        if (x(aVar, packageInfo)) {
            return q(packageInfo, i11, str2);
        }
        return null;
    }

    public static c s(r9.a aVar, Context context, List<a.b> list) {
        c r11;
        if (list == null) {
            return null;
        }
        for (a.b bVar : list) {
            if (bVar != null && (r11 = r(aVar, context, bVar.f27887a, bVar.f27888b, bVar.f27889c)) != null && !r11.b(aVar) && !r11.a()) {
                return r11;
            }
        }
        return null;
    }

    public static void t(String str, String str2, Context context, r9.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || G(aVar) || !g9.a.d().I()) {
            return;
        }
        try {
            Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            c9.a.c(aVar, "biz", "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static boolean u(long j11, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        boolean z11 = true;
        try {
            if (j11 <= 0) {
                conditionVariable.block();
            } else {
                z11 = conditionVariable.block(j11);
            }
        } catch (Throwable unused) {
        }
        return z11;
    }

    public static boolean v(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f51801a;
            if (!TextUtils.equals(str, strArr[0])) {
                if (!TextUtils.equals(str, strArr[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean w(r9.a aVar, Context context, List<a.b> list, boolean z11) {
        try {
            for (a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.f27887a;
                    if (com.alipay.sdk.app.a.c() && "com.eg.android.AlipayGphone".equals(str)) {
                        str = "com.eg.android.AlipayGphoneRC";
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (z11) {
                                c9.a.c(aVar, "biz", "PgWltVer", packageInfo.packageName + "|" + packageInfo.versionName);
                                return true;
                            }
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "CheckLaunchAppExistEx", th2);
            return false;
        }
    }

    public static boolean x(r9.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z11 = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            c9.a.h(aVar, "auth", "NotIncludeSignatures", str);
        }
        return z11;
    }

    public static boolean y(r9.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith("alipay.com")) {
                return true;
            }
            return host.endsWith("alipay.net");
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "ckUrlErr", th2);
            return false;
        }
    }

    public static boolean z(r9.a aVar, String str, Activity activity) {
        int parseInt;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            if (!TextUtils.equals(str, "sdklite://h5quit") && !TextUtils.equals(str, h("http", "://m.alipay.com/?action=h5quit"))) {
                if (str.startsWith("sdklite://h5quit?result=")) {
                    try {
                        String substring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                        parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf("&end_code=") + 10));
                    } catch (Exception unused) {
                        a9.b.c(a9.b.h());
                    }
                    if (parseInt != a9.c.SUCCEEDED.b() && parseInt != a9.c.PAY_WAITTING.b()) {
                        a9.c b11 = a9.c.b(a9.c.FAILED.b());
                        a9.b.c(a9.b.b(b11.b(), b11.a(), ""));
                        activity.runOnUiThread(new a(activity));
                        return true;
                    }
                    if (e9.a.f25023c) {
                        StringBuilder sb2 = new StringBuilder();
                        String decode = URLDecoder.decode(str);
                        String decode2 = URLDecoder.decode(decode);
                        String str2 = decode2.substring(decode2.indexOf("sdklite://h5quit?result=") + 24, decode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                        int indexOf = decode.indexOf("&return_url=") + 12;
                        sb2.append(str2);
                        sb2.append("&return_url=");
                        sb2.append(decode.substring(indexOf, decode.indexOf("&", indexOf)));
                        sb2.append(decode.substring(decode.indexOf("&", indexOf)));
                        substring = sb2.toString();
                    } else {
                        String decode3 = URLDecoder.decode(str);
                        substring = decode3.substring(decode3.indexOf("sdklite://h5quit?result=") + 24, decode3.lastIndexOf("&end_code="));
                    }
                    a9.c b12 = a9.c.b(parseInt);
                    a9.b.c(a9.b.b(b12.b(), b12.a(), substring));
                    activity.runOnUiThread(new a(activity));
                    return true;
                }
                return false;
            }
            a9.b.c(a9.b.a());
            activity.finish();
            return true;
        }
        try {
            c s11 = s(aVar, activity, a9.a.f355d);
            if (s11 != null && !s11.a() && !s11.b(aVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }
}