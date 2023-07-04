package pl;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class c implements hl.a {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f46640b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f46641a;

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f46674f.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public c(byte[] bArr) {
        w.a(bArr.length);
        this.f46641a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i11, int i12) {
        if (v.b() && v.a() <= 19) {
            return new IvParameterSpec(bArr, i11, i12);
        }
        return new GCMParameterSpec(128, bArr, i11, i12);
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] c11 = u.c(12);
            System.arraycopy(c11, 0, bArr3, 0, 12);
            AlgorithmParameterSpec b11 = b(c11);
            ThreadLocal<Cipher> threadLocal = f46640b;
            threadLocal.get().init(1, this.f46641a, b11);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // hl.a
    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c11 = c(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = f46640b;
            threadLocal.get().init(2, this.f46641a, c11);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}