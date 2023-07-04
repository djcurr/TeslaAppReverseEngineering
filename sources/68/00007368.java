package hj;

import ak.k0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class k extends e {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f29298j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f29299k;

    public k(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, int i11, ci.i iVar, int i12, Object obj, byte[] bArr) {
        super(aVar, bVar, i11, iVar, i12, obj, -9223372036854775807L, -9223372036854775807L);
        k kVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = k0.f482f;
            kVar = this;
        } else {
            kVar = this;
            bArr2 = bArr;
        }
        kVar.f29298j = bArr2;
    }

    private void i(int i11) {
        byte[] bArr = this.f29298j;
        if (bArr.length < i11 + 16384) {
            this.f29298j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        try {
            this.f29262i.i(this.f29255b);
            int i11 = 0;
            int i12 = 0;
            while (i11 != -1 && !this.f29299k) {
                i(i12);
                i11 = this.f29262i.read(this.f29298j, i12, 16384);
                if (i11 != -1) {
                    i12 += i11;
                }
            }
            if (!this.f29299k) {
                g(this.f29298j, i12);
            }
        } finally {
            k0.n(this.f29262i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.f29299k = true;
    }

    protected abstract void g(byte[] bArr, int i11);

    public byte[] h() {
        return this.f29298j;
    }
}