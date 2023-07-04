package h50;

import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.o;

/* loaded from: classes5.dex */
public class b implements o {

    /* renamed from: a  reason: collision with root package name */
    private k f28898a;

    /* renamed from: b  reason: collision with root package name */
    private int f28899b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f28900c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f28901d;

    public b(k kVar, int i11, byte[] bArr, byte[] bArr2) {
        this.f28898a = kVar;
        this.f28899b = i11;
        this.f28900c = bArr;
        this.f28901d = bArr2;
    }

    public k a() {
        return this.f28898a;
    }

    public byte[] b() {
        return this.f28901d;
    }

    public int c() {
        return this.f28899b;
    }

    public byte[] d() {
        return this.f28900c;
    }
}