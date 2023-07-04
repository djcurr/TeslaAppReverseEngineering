package f70;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class t extends q implements r70.c {

    /* renamed from: c  reason: collision with root package name */
    private final r f26013c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26014d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f26015e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f26016f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final r f26017a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f26018b = null;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f26019c = null;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f26020d = null;

        public b(r rVar) {
            this.f26017a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f26020d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f26019c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f26018b = a0.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f26017a.e());
        r rVar = bVar.f26017a;
        this.f26013c = rVar;
        Objects.requireNonNull(rVar, "params == null");
        int f11 = rVar.f();
        byte[] bArr = bVar.f26020d;
        if (bArr != null) {
            if (bArr.length == f11 + f11) {
                this.f26014d = 0;
                this.f26015e = a0.g(bArr, 0, f11);
                this.f26016f = a0.g(bArr, f11 + 0, f11);
                return;
            } else if (bArr.length != f11 + 4 + f11) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f26014d = r70.i.a(bArr, 0);
                this.f26015e = a0.g(bArr, 4, f11);
                this.f26016f = a0.g(bArr, 4 + f11, f11);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f26014d = rVar.d().a();
        } else {
            this.f26014d = 0;
        }
        byte[] bArr2 = bVar.f26018b;
        if (bArr2 == null) {
            this.f26015e = new byte[f11];
        } else if (bArr2.length != f11) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f26015e = bArr2;
        }
        byte[] bArr3 = bVar.f26019c;
        if (bArr3 == null) {
            this.f26016f = new byte[f11];
        } else if (bArr3.length != f11) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.f26016f = bArr3;
        }
    }

    public r c() {
        return this.f26013c;
    }

    public byte[] d() {
        return a0.c(this.f26016f);
    }

    public byte[] e() {
        return a0.c(this.f26015e);
    }

    public byte[] f() {
        byte[] bArr;
        int f11 = this.f26013c.f();
        int i11 = this.f26014d;
        int i12 = 0;
        if (i11 != 0) {
            bArr = new byte[f11 + 4 + f11];
            r70.i.f(i11, bArr, 0);
            i12 = 4;
        } else {
            bArr = new byte[f11 + f11];
        }
        a0.e(bArr, this.f26015e, i12);
        a0.e(bArr, this.f26016f, i12 + f11);
        return bArr;
    }

    @Override // r70.c
    public byte[] getEncoded() {
        return f();
    }
}