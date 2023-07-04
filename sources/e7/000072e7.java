package hb;

import io.realm.internal.OsSharedRealm;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.i18n.LocalizedMessage;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public final class d {
    public static int a(byte b11) {
        return b11 < 0 ? b11 + OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR : b11;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((((0 | ((bArr[0] << 24) & (-16777216))) | ((bArr[1] << Tnaf.POW_2_WIDTH) & 16711680)) | ((bArr[2] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) (0 | ((bArr[0] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB))) | (bArr[1] & 255))) / 256.0f;
    }

    public static String f(ByteBuffer byteBuffer) {
        int h11 = h(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 3; i11++) {
            sb2.append((char) (((h11 >> ((2 - i11) * 5)) & 31) + 96));
        }
        return sb2.toString();
    }

    public static String g(ByteBuffer byteBuffer, int i11) {
        byte[] bArr = new byte[i11];
        byteBuffer.get(bArr);
        return f.a(bArr);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + 0 + a(byteBuffer.get());
    }

    public static int i(ByteBuffer byteBuffer) {
        return (h(byteBuffer) << 8) + 0 + a(byteBuffer.get());
    }

    public static long j(ByteBuffer byteBuffer) {
        long j11 = byteBuffer.getInt();
        return j11 < 0 ? j11 + 4294967296L : j11;
    }

    public static long k(ByteBuffer byteBuffer) {
        long j11 = (j(byteBuffer) << 32) + 0;
        if (j11 >= 0) {
            return j11 + j(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int l(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}