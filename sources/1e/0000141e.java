package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f10147a;

    /* renamed from: b  reason: collision with root package name */
    public com.alipay.apmobilesecuritysdk.b.a f10148b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* renamed from: c  reason: collision with root package name */
    public int f10149c = 4;

    public a(Context context) {
        this.f10147a = context;
    }

    public static String a(Context context) {
        String b11 = b(context);
        return x9.a.c(b11) ? h.f(context) : b11;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String a11 = i.a(str);
            if (x9.a.c(a11)) {
                String a12 = g.a(context, str);
                i.a(str, a12);
                return !x9.a.c(a12) ? a12 : "";
            }
            return a11;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                String[] split = strArr[i11].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String b(Context context) {
        try {
            String b11 = i.b();
            if (x9.a.c(b11)) {
                c b12 = d.b(context);
                if (b12 != null) {
                    i.a(b12);
                    String str = b12.f10157a;
                    if (x9.a.f(str)) {
                        return str;
                    }
                }
                b b13 = com.alipay.apmobilesecuritysdk.e.a.b(context);
                if (b13 != null) {
                    i.a(b13);
                    String str2 = b13.f10154a;
                    return x9.a.f(str2) ? str2 : "";
                }
                return "";
            }
            return b11;
        } catch (Throwable unused) {
            return "";
        }
    }

    private u8.c b(Map<String, String> map) {
        b b11;
        b c11;
        try {
            Context context = this.f10147a;
            u8.d dVar = new u8.d();
            String b12 = x9.a.b(map, "appName", "");
            String b13 = x9.a.b(map, "sessionId", "");
            String b14 = x9.a.b(map, "rpcVersion", "");
            String a11 = a(context, b12);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d11 = h.d(context);
            if (x9.a.f(b13)) {
                dVar.f53379c = b13;
            } else {
                dVar.f53379c = a11;
            }
            dVar.f53380d = securityToken;
            dVar.f53381e = d11;
            dVar.f53377a = "android";
            c c12 = d.c(context);
            String str = c12 != null ? c12.f10157a : "";
            if (x9.a.c(str) && (c11 = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str = c11.f10154a;
            }
            c b15 = d.b();
            String str2 = b15 != null ? b15.f10157a : "";
            if (x9.a.c(str2) && (b11 = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str2 = b11.f10154a;
            }
            dVar.f53383g = b14;
            if (x9.a.c(str)) {
                dVar.f53378b = str2;
            } else {
                dVar.f53378b = str;
            }
            dVar.f53382f = e.a(context, map);
            return r8.d.c(this.f10147a, this.f10148b.c()).a(dVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
            return null;
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i11 = 0; i11 < 5; i11++) {
                String str = strArr[i11];
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory, ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if (x9.a.c(b(r9.f10147a)) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[Catch: Exception -> 0x023e, TryCatch #0 {Exception -> 0x023e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e6, B:71:0x0201, B:73:0x0207, B:75:0x020d, B:79:0x0216, B:81:0x021c, B:40:0x00d6, B:42:0x00ee, B:48:0x00fb, B:49:0x010b, B:51:0x0112, B:55:0x0124, B:57:0x0174, B:59:0x017e, B:61:0x0186, B:63:0x0193, B:65:0x019d, B:67:0x01a5, B:66:0x01a1, B:60:0x0182, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:87:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201 A[Catch: Exception -> 0x023e, TryCatch #0 {Exception -> 0x023e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e6, B:71:0x0201, B:73:0x0207, B:75:0x020d, B:79:0x0216, B:81:0x021c, B:40:0x00d6, B:42:0x00ee, B:48:0x00fb, B:49:0x010b, B:51:0x0112, B:55:0x0124, B:57:0x0174, B:59:0x017e, B:61:0x0186, B:63:0x0193, B:65:0x019d, B:67:0x01a5, B:66:0x01a1, B:60:0x0182, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:87:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207 A[Catch: Exception -> 0x023e, TryCatch #0 {Exception -> 0x023e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e6, B:71:0x0201, B:73:0x0207, B:75:0x020d, B:79:0x0216, B:81:0x021c, B:40:0x00d6, B:42:0x00ee, B:48:0x00fb, B:49:0x010b, B:51:0x0112, B:55:0x0124, B:57:0x0174, B:59:0x017e, B:61:0x0186, B:63:0x0193, B:65:0x019d, B:67:0x01a5, B:66:0x01a1, B:60:0x0182, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:87:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216 A[Catch: Exception -> 0x023e, TryCatch #0 {Exception -> 0x023e, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e6, B:71:0x0201, B:73:0x0207, B:75:0x020d, B:79:0x0216, B:81:0x021c, B:40:0x00d6, B:42:0x00ee, B:48:0x00fb, B:49:0x010b, B:51:0x0112, B:55:0x0124, B:57:0x0174, B:59:0x017e, B:61:0x0186, B:63:0x0193, B:65:0x019d, B:67:0x01a5, B:66:0x01a1, B:60:0x0182, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.a.a.a(java.util.Map):int");
    }
}