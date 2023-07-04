package pl;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class a implements p {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f46630d = new C0995a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f46631a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46632b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46633c;

    /* renamed from: pl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0995a extends ThreadLocal<Cipher> {
        C0995a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return m.f46674f.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public a(byte[] bArr, int i11) {
        w.a(bArr.length);
        this.f46631a = new SecretKeySpec(bArr, "AES");
        int blockSize = f46630d.get().getBlockSize();
        this.f46633c = blockSize;
        if (i11 >= 12 && i11 <= blockSize) {
            this.f46632b = i11;
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    private void b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, byte[] bArr3, boolean z11) {
        Cipher cipher = f46630d.get();
        byte[] bArr4 = new byte[this.f46633c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f46632b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z11) {
            cipher.init(1, this.f46631a, ivParameterSpec);
        } else {
            cipher.init(2, this.f46631a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i11, i12, bArr2, i13) != i12) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // pl.p
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f46632b;
        if (length >= i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            int length2 = bArr.length;
            int i12 = this.f46632b;
            byte[] bArr3 = new byte[length2 - i12];
            b(bArr, i12, bArr.length - i12, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // pl.p
    public byte[] encrypt(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f46632b;
        if (length <= Integer.MAX_VALUE - i11) {
            byte[] bArr2 = new byte[bArr.length + i11];
            byte[] c11 = u.c(i11);
            System.arraycopy(c11, 0, bArr2, 0, this.f46632b);
            b(bArr, 0, bArr.length, bArr2, this.f46632b, c11, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f46632b));
    }
}