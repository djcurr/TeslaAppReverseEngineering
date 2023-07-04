package atd.c0;

import java.security.Key;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d extends SecretKeySpec {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f6782a;

    /* renamed from: b  reason: collision with root package name */
    private final Key f6783b;

    public d(byte[] bArr, b bVar) {
        super(bArr, bVar.e());
        int length = bArr.length;
        int i11 = length / 2;
        this.f6782a = new SecretKeySpec(Arrays.copyOfRange(bArr, i11, length), bVar.e());
        this.f6783b = new SecretKeySpec(Arrays.copyOfRange(bArr, 0, i11), bVar.g());
    }

    public SecretKey a() {
        return this.f6782a;
    }

    public Key b() {
        return this.f6783b;
    }

    public d(SecretKey secretKey, b bVar) {
        this(secretKey.getEncoded(), bVar);
    }
}