package pl;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class b implements hl.a {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f46634e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f46635f = new C0996b();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f46636a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46637b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f46638c;

    /* renamed from: d  reason: collision with root package name */
    private final int f46639d;

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f46674f.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    /* renamed from: pl.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0996b extends ThreadLocal<Cipher> {
        C0996b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f46674f.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public b(byte[] bArr, int i11) {
        if (i11 != 12 && i11 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f46639d = i11;
        w.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f46638c = secretKeySpec;
        Cipher cipher = f46634e.get();
        cipher.init(1, secretKeySpec);
        byte[] b11 = b(cipher.doFinal(new byte[16]));
        this.f46636a = b11;
        this.f46637b = b(b11);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        while (i11 < 15) {
            int i12 = i11 + 1;
            bArr2[i11] = (byte) (((bArr[i11] << 1) ^ ((bArr[i12] & 255) >>> 7)) & 255);
            i11 = i12;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    private byte[] c(Cipher cipher, int i11, byte[] bArr, int i12, int i13) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i11;
        if (i13 == 0) {
            return cipher.doFinal(e(bArr2, this.f46636a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i14 = 0;
        while (i13 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                doFinal[i15] = (byte) (doFinal[i15] ^ bArr[(i12 + i14) + i15]);
            }
            doFinal = cipher.doFinal(doFinal);
            i14 += 16;
        }
        return cipher.doFinal(e(doFinal, d(Arrays.copyOfRange(bArr, i14 + i12, i12 + i13))));
    }

    private byte[] d(byte[] bArr) {
        if (bArr.length == 16) {
            return e(bArr, this.f46636a);
        }
        byte[] copyOf = Arrays.copyOf(this.f46637b, 16);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            copyOf[i11] = (byte) (copyOf[i11] ^ bArr[i11]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f46639d;
        if (length <= (Integer.MAX_VALUE - i11) - 16) {
            byte[] bArr3 = new byte[bArr.length + i11 + 16];
            byte[] c11 = u.c(i11);
            System.arraycopy(c11, 0, bArr3, 0, this.f46639d);
            Cipher cipher = f46634e.get();
            cipher.init(1, this.f46638c);
            byte[] c12 = c(cipher, 0, c11, 0, c11.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] c13 = c(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = f46635f.get();
            cipher2.init(1, this.f46638c, new IvParameterSpec(c12));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f46639d);
            byte[] c14 = c(cipher, 2, bArr3, this.f46639d, bArr.length);
            int length2 = bArr.length + this.f46639d;
            for (int i12 = 0; i12 < 16; i12++) {
                bArr3[length2 + i12] = (byte) ((c13[i12] ^ c12[i12]) ^ c14[i12]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // hl.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f46639d) - 16;
        if (length >= 0) {
            Cipher cipher = f46634e.get();
            cipher.init(1, this.f46638c);
            byte[] c11 = c(cipher, 0, bArr, 0, this.f46639d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] c12 = c(cipher, 1, bArr3, 0, bArr3.length);
            byte[] c13 = c(cipher, 2, bArr, this.f46639d, length);
            int length2 = bArr.length - 16;
            byte b11 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                b11 = (byte) (b11 | (((bArr[length2 + i11] ^ c12[i11]) ^ c11[i11]) ^ c13[i11]));
            }
            if (b11 == 0) {
                Cipher cipher2 = f46635f.get();
                cipher2.init(1, this.f46638c, new IvParameterSpec(c11));
                return cipher2.doFinal(bArr, this.f46639d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}