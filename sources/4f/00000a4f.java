package atd.c0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public abstract class b extends atd.b0.a {
    public final byte[] a(d dVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (Arrays.equals(bArr4, a(dVar, bArr, bArr3, bArr2))) {
            return a(dVar, 2, bArr, bArr2);
        }
        throw new GeneralSecurityException(atd.s0.a.a(-799541185800768L));
    }

    public final byte[] b() {
        byte[] bArr = new byte[d()];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public abstract String c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract String g();

    public abstract int h();

    public final e b(d dVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] a11 = a(dVar, 1, bArr, bArr2);
        return new e(bArr, a11, a(dVar, bArr, bArr3, a11));
    }

    private byte[] a(d dVar, int i11, byte[] bArr, byte[] bArr2) {
        SecretKey a11 = dVar.a();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance(c());
        cipher.init(i11, a11, ivParameterSpec, new SecureRandom());
        return cipher.doFinal(bArr2);
    }

    private byte[] a(d dVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] a11 = a(bArr2, bArr, bArr3);
        Mac mac = Mac.getInstance(g());
        mac.init(dVar.b());
        mac.update(a11);
        return Arrays.copyOf(mac.doFinal(), h());
    }

    private byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] c11 = atd.r0.a.a(Charset.forName(atd.s0.a.a(-799425221683776L))).c(bArr);
            byteArrayOutputStream.write(c11);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(bArr3);
            byteArrayOutputStream.write(a(c11.length));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    private byte[] a(int i11) {
        return ByteBuffer.allocate(8).putLong(i11 * 8).array();
    }
}