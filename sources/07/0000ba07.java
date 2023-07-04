package vd;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f54476a;

    /* renamed from: b  reason: collision with root package name */
    public static b f54477b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f54478c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f54479d;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f54480e;

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f54481f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f54482g;

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f54483h;

    static {
        f54476a = Build.VERSION.SDK_INT <= 17;
        e();
        f54477b = null;
        f54478c = false;
        f54479d = a("RIFF");
        f54480e = a("WEBP");
        f54481f = a("VP8 ");
        f54482g = a("VP8L");
        f54483h = a("VP8X");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }

    public static boolean b(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f54483h) && ((bArr[i11 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i11, int i12) {
        return i12 >= 21 && j(bArr, i11 + 12, f54483h);
    }

    public static boolean d(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f54483h) && ((bArr[i11 + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    private static boolean e() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 17) {
            return false;
        }
        if (i11 == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f54482g);
    }

    public static boolean g(byte[] bArr, int i11) {
        return j(bArr, i11 + 12, f54481f);
    }

    public static boolean h(byte[] bArr, int i11, int i12) {
        return i12 >= 20 && j(bArr, i11, f54479d) && j(bArr, i11 + 8, f54480e);
    }

    public static b i() {
        if (f54478c) {
            return f54477b;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f54478c = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i11, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i11 > bArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            if (bArr[i12 + i11] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }
}