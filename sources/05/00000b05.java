package atd.r0;

import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f6949c = com.adyen.threeds2.internal.b.f9630a;

    /* renamed from: a  reason: collision with root package name */
    private final Charset f6950a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6951b;

    private a(Charset charset, int i11) {
        this.f6950a = charset;
        this.f6951b = i11;
    }

    public static a a() {
        return a(f6949c, 11);
    }

    private byte[] e(String str) {
        return str.getBytes(this.f6950a);
    }

    public Charset b() {
        return this.f6950a;
    }

    public byte[] c(byte[] bArr) {
        return Base64.encode(bArr, this.f6951b);
    }

    public String d(byte[] bArr) {
        return e(c(bArr));
    }

    public static a a(Charset charset) {
        return a(charset, 11);
    }

    private String e(byte[] bArr) {
        return new String(bArr, this.f6950a);
    }

    public String b(byte[] bArr) {
        return new String(a(bArr), this.f6950a);
    }

    public String c(String str) {
        return b(str.getBytes(this.f6950a));
    }

    public String d(String str) {
        return d(str.getBytes(this.f6950a));
    }

    public static a a(Charset charset, int... iArr) {
        int i11 = 0;
        if (iArr != null) {
            int length = iArr.length;
            int i12 = 0;
            while (i11 < length) {
                i12 |= iArr[i11];
                i11++;
            }
            i11 = i12;
        }
        return new a(charset, i11);
    }

    public JSONObject b(String str) {
        return new JSONObject(c(str));
    }

    public byte[] a(byte[] bArr) {
        return Base64.decode(bArr, this.f6951b);
    }

    public byte[] a(String str) {
        return a(e(str));
    }
}