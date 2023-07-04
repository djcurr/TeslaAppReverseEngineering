package f70;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class s extends q implements r70.c {

    /* renamed from: c  reason: collision with root package name */
    private final r f25996c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f25997d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f25998e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f25999f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f26000g;

    /* renamed from: h  reason: collision with root package name */
    private volatile long f26001h;

    /* renamed from: i  reason: collision with root package name */
    private volatile f70.b f26002i;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final r f26003a;

        /* renamed from: b  reason: collision with root package name */
        private long f26004b = 0;

        /* renamed from: c  reason: collision with root package name */
        private long f26005c = -1;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f26006d = null;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f26007e = null;

        /* renamed from: f  reason: collision with root package name */
        private byte[] f26008f = null;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f26009g = null;

        /* renamed from: h  reason: collision with root package name */
        private f70.b f26010h = null;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f26011i = null;

        /* renamed from: j  reason: collision with root package name */
        private x f26012j = null;

        public b(r rVar) {
            this.f26003a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(f70.b bVar) {
            if (bVar.b() == 0) {
                this.f26010h = new f70.b(bVar, (1 << this.f26003a.a()) - 1);
            } else {
                this.f26010h = bVar;
            }
            return this;
        }

        public b m(long j11) {
            this.f26004b = j11;
            return this;
        }

        public b n(long j11) {
            this.f26005c = j11;
            return this;
        }

        public b o(byte[] bArr) {
            this.f26008f = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f26009g = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f26007e = a0.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f26006d = a0.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f26003a.e());
        r rVar = bVar.f26003a;
        this.f25996c = rVar;
        Objects.requireNonNull(rVar, "params == null");
        int f11 = rVar.f();
        byte[] bArr = bVar.f26011i;
        if (bArr != null) {
            Objects.requireNonNull(bVar.f26012j, "xmss == null");
            int a11 = rVar.a();
            int i11 = (a11 + 7) / 8;
            this.f26001h = a0.a(bArr, 0, i11);
            if (!a0.l(a11, this.f26001h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i12 = i11 + 0;
            this.f25997d = a0.g(bArr, i12, f11);
            int i13 = i12 + f11;
            this.f25998e = a0.g(bArr, i13, f11);
            int i14 = i13 + f11;
            this.f25999f = a0.g(bArr, i14, f11);
            int i15 = i14 + f11;
            this.f26000g = a0.g(bArr, i15, f11);
            int i16 = i15 + f11;
            try {
                this.f26002i = ((f70.b) a0.f(a0.g(bArr, i16, bArr.length - i16), f70.b.class)).f(bVar.f26012j.g());
                return;
            } catch (IOException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalArgumentException(e12.getMessage(), e12);
            }
        }
        this.f26001h = bVar.f26004b;
        byte[] bArr2 = bVar.f26006d;
        if (bArr2 == null) {
            this.f25997d = new byte[f11];
        } else if (bArr2.length != f11) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f25997d = bArr2;
        }
        byte[] bArr3 = bVar.f26007e;
        if (bArr3 == null) {
            this.f25998e = new byte[f11];
        } else if (bArr3.length != f11) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f25998e = bArr3;
        }
        byte[] bArr4 = bVar.f26008f;
        if (bArr4 == null) {
            this.f25999f = new byte[f11];
        } else if (bArr4.length != f11) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f25999f = bArr4;
        }
        byte[] bArr5 = bVar.f26009g;
        if (bArr5 == null) {
            this.f26000g = new byte[f11];
        } else if (bArr5.length != f11) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.f26000g = bArr5;
        }
        f70.b bVar2 = bVar.f26010h;
        if (bVar2 == null) {
            bVar2 = (!a0.l(rVar.a(), bVar.f26004b) || bArr4 == null || bArr2 == null) ? new f70.b(bVar.f26005c + 1) : new f70.b(rVar, bVar.f26004b, bArr4, bArr2);
        }
        this.f26002i = bVar2;
        if (bVar.f26005c >= 0 && bVar.f26005c != this.f26002i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r c() {
        return this.f25996c;
    }

    public byte[] d() {
        byte[] p11;
        synchronized (this) {
            int f11 = this.f25996c.f();
            int a11 = (this.f25996c.a() + 7) / 8;
            byte[] bArr = new byte[a11 + f11 + f11 + f11 + f11];
            a0.e(bArr, a0.q(this.f26001h, a11), 0);
            int i11 = a11 + 0;
            a0.e(bArr, this.f25997d, i11);
            int i12 = i11 + f11;
            a0.e(bArr, this.f25998e, i12);
            int i13 = i12 + f11;
            a0.e(bArr, this.f25999f, i13);
            a0.e(bArr, this.f26000g, i13 + f11);
            try {
                p11 = org.bouncycastle.util.a.p(bArr, a0.p(this.f26002i));
            } catch (IOException e11) {
                throw new IllegalStateException("error serializing bds state: " + e11.getMessage(), e11);
            }
        }
        return p11;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        byte[] d11;
        synchronized (this) {
            d11 = d();
        }
        return d11;
    }
}