package f9;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* loaded from: classes.dex */
public class d {
    public static String a() {
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] a11 = c.a((int) (System.currentTimeMillis() / 1000));
        byte[] a12 = c.a((int) System.nanoTime());
        byte[] a13 = c.a(nextInt);
        byte[] a14 = c.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a11, 0, bArr, 0, 4);
        System.arraycopy(a12, 0, bArr, 4, 4);
        System.arraycopy(a13, 0, bArr, 8, 4);
        System.arraycopy(a14, 0, bArr, 12, 4);
        return b.e(bArr, 2);
    }

    public static String b(Context context) {
        String c11 = f.b(null) ? c() : null;
        return f.b(c11) ? a() : c11;
    }

    public static String c() {
        String a11 = g.a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(a11)) {
            a11 = g.a("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(a11) ? e() : a11;
    }

    public static String d(Context context) {
        return "";
    }

    public static String e() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}