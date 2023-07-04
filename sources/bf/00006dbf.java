package f70;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class z extends p implements r70.c {

    /* renamed from: c  reason: collision with root package name */
    private final x f26047c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26048d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f26049e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f26050f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final x f26051a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f26052b = null;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f26053c = null;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f26054d = null;

        public b(x xVar) {
            this.f26051a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f26054d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f26053c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f26052b = a0.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f26051a.f());
        x xVar = bVar.f26051a;
        this.f26047c = xVar;
        Objects.requireNonNull(xVar, "params == null");
        int h11 = xVar.h();
        byte[] bArr = bVar.f26054d;
        if (bArr != null) {
            if (bArr.length == h11 + h11) {
                this.f26048d = 0;
                this.f26049e = a0.g(bArr, 0, h11);
                this.f26050f = a0.g(bArr, h11 + 0, h11);
                return;
            } else if (bArr.length != h11 + 4 + h11) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f26048d = r70.i.a(bArr, 0);
                this.f26049e = a0.g(bArr, 4, h11);
                this.f26050f = a0.g(bArr, 4 + h11, h11);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f26048d = xVar.e().a();
        } else {
            this.f26048d = 0;
        }
        byte[] bArr2 = bVar.f26052b;
        if (bArr2 == null) {
            this.f26049e = new byte[h11];
        } else if (bArr2.length != h11) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f26049e = bArr2;
        }
        byte[] bArr3 = bVar.f26053c;
        if (bArr3 == null) {
            this.f26050f = new byte[h11];
        } else if (bArr3.length != h11) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f26050f = bArr3;
        }
    }

    public x c() {
        return this.f26047c;
    }

    public byte[] d() {
        return a0.c(this.f26050f);
    }

    public byte[] e() {
        return a0.c(this.f26049e);
    }

    public byte[] f() {
        byte[] bArr;
        int h11 = this.f26047c.h();
        int i11 = this.f26048d;
        int i12 = 0;
        if (i11 != 0) {
            bArr = new byte[h11 + 4 + h11];
            r70.i.f(i11, bArr, 0);
            i12 = 4;
        } else {
            bArr = new byte[h11 + h11];
        }
        a0.e(bArr, this.f26049e, i12);
        a0.e(bArr, this.f26050f, i12 + h11);
        return bArr;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        return f();
    }
}