package jl;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import pl.m;
import pl.u;
import pl.v;
import pl.w;

/* loaded from: classes3.dex */
public final class a implements hl.a {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f33884b = new C0617a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f33885a;

    /* renamed from: jl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0617a extends ThreadLocal<Cipher> {
        C0617a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f46674f.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public a(byte[] bArr) {
        w.a(bArr.length);
        this.f33885a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec c(byte[] bArr, int i11, int i12) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i11, i12);
        } catch (ClassNotFoundException unused) {
            if (v.b()) {
                return new IvParameterSpec(bArr, i11, i12);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // hl.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] c11 = u.c(12);
            System.arraycopy(c11, 0, bArr3, 0, 12);
            AlgorithmParameterSpec b11 = b(c11);
            ThreadLocal<Cipher> threadLocal = f33884b;
            threadLocal.get().init(1, this.f33885a, b11);
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
            ThreadLocal<Cipher> threadLocal = f33884b;
            threadLocal.get().init(2, this.f33885a, c11);
            if (bArr2 != null && bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}