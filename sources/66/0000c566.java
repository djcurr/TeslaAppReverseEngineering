package zu;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import okio.i;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f60776a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final byte[] a(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        byte[] decode = Base64.decode(str, 0);
        kotlin.jvm.internal.s.f(decode, "decode(this, Base64.DEFAULT)");
        return decode;
    }

    public static final String b(byte[] bArr, int i11) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        String encodeToString = Base64.encodeToString(bArr, i11);
        kotlin.jvm.internal.s.f(encodeToString, "encodeToString(this, flag)");
        return encodeToString;
    }

    public static /* synthetic */ String c(byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        return b(bArr, i11);
    }

    public static final String d(byte[] bArr, int i11) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        char[] cArr = new char[i11 * 2];
        if (i11 > 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                int i15 = i13 + 1;
                char[] cArr2 = f60776a;
                cArr[i13] = cArr2[(b11 >> 4) & 15];
                i13 = i15 + 1;
                cArr[i15] = cArr2[b11 & 15];
                if (i14 >= i11) {
                    break;
                }
                i12 = i14;
            }
        }
        return new String(cArr);
    }

    public static /* synthetic */ String e(byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bArr.length;
        }
        return d(bArr, i11);
    }

    public static final byte[] f(String str) {
        List<String> k12;
        int a11;
        kotlin.jvm.internal.s.g(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k12 = kotlin.text.y.k1(str, 2, 2, true);
        for (String str2 : k12) {
            a11 = kotlin.text.b.a(16);
            byteArrayOutputStream.write(Integer.parseInt(str2, a11));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.s.f(byteArray, "output.toByteArray()");
        return byteArray;
    }

    public static final okio.i g(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return i.a.h(okio.i.f42657e, f(str), 0, 0, 3, null);
    }

    public static final String h(okio.i iVar) {
        kotlin.jvm.internal.s.g(iVar, "<this>");
        String n11 = iVar.n();
        Locale US = Locale.US;
        kotlin.jvm.internal.s.f(US, "US");
        Objects.requireNonNull(n11, "null cannot be cast to non-null type java.lang.String");
        String upperCase = n11.toUpperCase(US);
        kotlin.jvm.internal.s.f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final okio.i i(UUID uuid) {
        String B;
        kotlin.jvm.internal.s.g(uuid, "<this>");
        String uuid2 = uuid.toString();
        kotlin.jvm.internal.s.f(uuid2, "this.toString()");
        B = kotlin.text.v.B(uuid2, "-", "", false);
        return g(B);
    }
}