package pl;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class d implements hl.d {

    /* renamed from: c  reason: collision with root package name */
    private static final Collection<Integer> f46642c = Arrays.asList(64);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f46643d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f46644e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    private final r f46645a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46646b;

    public d(byte[] bArr) {
        if (f46642c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f46646b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f46645a = new r(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    private byte[] c(byte[]... bArr) {
        byte[] e11;
        if (bArr.length == 0) {
            return this.f46645a.a(f46644e, 16);
        }
        byte[] a11 = this.f46645a.a(f46643d, 16);
        for (int i11 = 0; i11 < bArr.length - 1; i11++) {
            a11 = g.e(e.b(a11), this.f46645a.a(bArr[i11] == null ? new byte[0] : bArr[i11], 16));
        }
        byte[] bArr2 = bArr[bArr.length - 1];
        if (bArr2.length >= 16) {
            e11 = g.f(bArr2, a11);
        } else {
            e11 = g.e(e.a(bArr2), e.b(a11));
        }
        return this.f46645a.a(e11, 16);
    }

    @Override // hl.d
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a11 = m.f46674f.a("AES/CTR/NoPadding");
            byte[] c11 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c11.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a11.init(1, new SecretKeySpec(this.f46646b, "AES"), new IvParameterSpec(bArr3));
            return g.a(c11, a11.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // hl.d
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a11 = m.f46674f.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a11.init(2, new SecretKeySpec(this.f46646b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a11.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && v.b()) {
                doFinal = new byte[0];
            }
            if (g.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}