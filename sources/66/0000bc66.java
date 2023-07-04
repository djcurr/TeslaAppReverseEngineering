package w50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class f extends SecureRandom {

    /* renamed from: a  reason: collision with root package name */
    private final b f55636a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55637b;

    /* renamed from: c  reason: collision with root package name */
    private final SecureRandom f55638c;

    /* renamed from: d  reason: collision with root package name */
    private final c f55639d;

    /* renamed from: e  reason: collision with root package name */
    private x50.c f55640e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(SecureRandom secureRandom, c cVar, b bVar, boolean z11) {
        this.f55638c = secureRandom;
        this.f55639d = cVar;
        this.f55636a = bVar;
        this.f55637b = z11;
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            if (this.f55640e == null) {
                this.f55640e = this.f55636a.a(this.f55639d);
            }
            this.f55640e.reseed(bArr);
        }
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        return e.a(this.f55639d, i11);
    }

    @Override // java.security.SecureRandom
    public String getAlgorithm() {
        return this.f55636a.getAlgorithm();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.f55640e == null) {
                this.f55640e = this.f55636a.a(this.f55639d);
            }
            if (this.f55640e.generate(bArr, null, this.f55637b) < 0) {
                this.f55640e.reseed(null);
                this.f55640e.generate(bArr, null, this.f55637b);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j11) {
        synchronized (this) {
            SecureRandom secureRandom = this.f55638c;
            if (secureRandom != null) {
                secureRandom.setSeed(j11);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.f55638c;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }
}