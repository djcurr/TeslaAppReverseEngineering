package f70;

import f70.j;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class y extends p implements r70.c {

    /* renamed from: c  reason: collision with root package name */
    private final x f26032c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f26033d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f26034e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f26035f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f26036g;

    /* renamed from: h  reason: collision with root package name */
    private volatile f70.a f26037h;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final x f26038a;

        /* renamed from: b  reason: collision with root package name */
        private int f26039b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f26040c = -1;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f26041d = null;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f26042e = null;

        /* renamed from: f  reason: collision with root package name */
        private byte[] f26043f = null;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f26044g = null;

        /* renamed from: h  reason: collision with root package name */
        private f70.a f26045h = null;

        /* renamed from: i  reason: collision with root package name */
        private byte[] f26046i = null;

        public b(x xVar) {
            this.f26038a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(f70.a aVar) {
            this.f26045h = aVar;
            return this;
        }

        public b l(int i11) {
            this.f26039b = i11;
            return this;
        }

        public b m(int i11) {
            this.f26040c = i11;
            return this;
        }

        public b n(byte[] bArr) {
            this.f26043f = a0.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f26044g = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f26042e = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f26041d = a0.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f26038a.f());
        x xVar = bVar.f26038a;
        this.f26032c = xVar;
        Objects.requireNonNull(xVar, "params == null");
        int h11 = xVar.h();
        byte[] bArr = bVar.f26046i;
        if (bArr != null) {
            int b11 = xVar.b();
            int a11 = r70.i.a(bArr, 0);
            if (!a0.l(b11, a11)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f26033d = a0.g(bArr, 4, h11);
            int i11 = 4 + h11;
            this.f26034e = a0.g(bArr, i11, h11);
            int i12 = i11 + h11;
            this.f26035f = a0.g(bArr, i12, h11);
            int i13 = i12 + h11;
            this.f26036g = a0.g(bArr, i13, h11);
            int i14 = i13 + h11;
            try {
                f70.a aVar = (f70.a) a0.f(a0.g(bArr, i14, bArr.length - i14), f70.a.class);
                if (aVar.b() != a11) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f26037h = aVar.h(bVar.f26038a.g());
                return;
            } catch (IOException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalArgumentException(e12.getMessage(), e12);
            }
        }
        byte[] bArr2 = bVar.f26041d;
        if (bArr2 == null) {
            this.f26033d = new byte[h11];
        } else if (bArr2.length != h11) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f26033d = bArr2;
        }
        byte[] bArr3 = bVar.f26042e;
        if (bArr3 == null) {
            this.f26034e = new byte[h11];
        } else if (bArr3.length != h11) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f26034e = bArr3;
        }
        byte[] bArr4 = bVar.f26043f;
        if (bArr4 == null) {
            this.f26035f = new byte[h11];
        } else if (bArr4.length != h11) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.f26035f = bArr4;
        }
        byte[] bArr5 = bVar.f26044g;
        if (bArr5 == null) {
            this.f26036g = new byte[h11];
        } else if (bArr5.length != h11) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.f26036g = bArr5;
        }
        f70.a aVar2 = bVar.f26045h;
        this.f26037h = aVar2 == null ? (bVar.f26039b >= (1 << xVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new f70.a(xVar, (1 << xVar.b()) - 1, bVar.f26039b) : new f70.a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f26039b) : aVar2;
        if (bVar.f26040c >= 0 && bVar.f26040c != this.f26037h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x c() {
        return this.f26032c;
    }

    public byte[] d() {
        byte[] p11;
        synchronized (this) {
            int h11 = this.f26032c.h();
            byte[] bArr = new byte[h11 + 4 + h11 + h11 + h11];
            r70.i.f(this.f26037h.b(), bArr, 0);
            a0.e(bArr, this.f26033d, 4);
            int i11 = 4 + h11;
            a0.e(bArr, this.f26034e, i11);
            int i12 = i11 + h11;
            a0.e(bArr, this.f26035f, i12);
            a0.e(bArr, this.f26036g, i12 + h11);
            try {
                p11 = org.bouncycastle.util.a.p(bArr, a0.p(this.f26037h));
            } catch (IOException e11) {
                throw new RuntimeException("error serializing bds state: " + e11.getMessage());
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