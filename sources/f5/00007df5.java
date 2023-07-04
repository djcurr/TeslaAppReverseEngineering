package kj;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
class a implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f34674a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f34675b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f34676c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f34677d;

    public a(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        this.f34674a = aVar;
        this.f34675b = bArr;
        this.f34676c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void b(zj.n nVar) {
        ak.a.e(nVar);
        this.f34674a.b(nVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Map<String, List<String>> c() {
        return this.f34674a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.f34677d != null) {
            this.f34677d = null;
            this.f34674a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final long i(com.google.android.exoplayer2.upstream.b bVar) {
        try {
            Cipher o11 = o();
            try {
                o11.init(2, new SecretKeySpec(this.f34675b, "AES"), new IvParameterSpec(this.f34676c));
                zj.h hVar = new zj.h(this.f34674a, bVar);
                this.f34677d = new CipherInputStream(hVar, o11);
                hVar.g();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e11) {
                throw new RuntimeException(e11);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Uri m() {
        return this.f34674a.m();
    }

    protected Cipher o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // zj.f
    public final int read(byte[] bArr, int i11, int i12) {
        ak.a.e(this.f34677d);
        int read = this.f34677d.read(bArr, i11, i12);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}