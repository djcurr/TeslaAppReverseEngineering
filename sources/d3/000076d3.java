package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class r0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private int f31191e;

    /* renamed from: f  reason: collision with root package name */
    private int f31192f;

    /* renamed from: g  reason: collision with root package name */
    private Inflater f31193g;

    /* renamed from: j  reason: collision with root package name */
    private int f31196j;

    /* renamed from: k  reason: collision with root package name */
    private int f31197k;

    /* renamed from: l  reason: collision with root package name */
    private long f31198l;

    /* renamed from: a  reason: collision with root package name */
    private final u f31187a = new u();

    /* renamed from: b  reason: collision with root package name */
    private final CRC32 f31188b = new CRC32();

    /* renamed from: c  reason: collision with root package name */
    private final b f31189c = new b(this, null);

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f31190d = new byte[512];

    /* renamed from: h  reason: collision with root package name */
    private c f31194h = c.HEADER;

    /* renamed from: i  reason: collision with root package name */
    private boolean f31195i = false;

    /* renamed from: m  reason: collision with root package name */
    private int f31199m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f31200n = 0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f31201o = true;

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31202a;

        static {
            int[] iArr = new int[c.values().length];
            f31202a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31202a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31202a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31202a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31202a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31202a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31202a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31202a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31202a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31202a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int readUnsignedByte;
            if (r0.this.f31192f - r0.this.f31191e > 0) {
                readUnsignedByte = r0.this.f31190d[r0.this.f31191e] & 255;
                r0.j(r0.this, 1);
            } else {
                readUnsignedByte = r0.this.f31187a.readUnsignedByte();
            }
            r0.this.f31188b.update(readUnsignedByte);
            r0.C(r0.this, 1);
            return readUnsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return j() | (j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (r0.this.f31192f - r0.this.f31191e) + r0.this.f31187a.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i11) {
            int i12;
            int i13 = r0.this.f31192f - r0.this.f31191e;
            if (i13 > 0) {
                int min = Math.min(i13, i11);
                r0.this.f31188b.update(r0.this.f31190d, r0.this.f31191e, min);
                r0.j(r0.this, min);
                i12 = i11 - min;
            } else {
                i12 = i11;
            }
            if (i12 > 0) {
                byte[] bArr = new byte[512];
                int i14 = 0;
                while (i14 < i12) {
                    int min2 = Math.min(i12 - i14, 512);
                    r0.this.f31187a.d1(bArr, 0, min2);
                    r0.this.f31188b.update(bArr, 0, min2);
                    i14 += min2;
                }
            }
            r0.C(r0.this, i11);
        }

        /* synthetic */ b(r0 r0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    static /* synthetic */ int C(r0 r0Var, int i11) {
        int i12 = r0Var.f31199m + i11;
        r0Var.f31199m = i12;
        return i12;
    }

    private boolean C0() {
        if ((this.f31196j & 16) == 16) {
            if (this.f31189c.g()) {
                this.f31194h = c.HEADER_CRC;
                return true;
            }
            return false;
        }
        this.f31194h = c.HEADER_CRC;
        return true;
    }

    private boolean D0() {
        if ((this.f31196j & 2) == 2) {
            if (this.f31189c.k() < 2) {
                return false;
            }
            if ((((int) this.f31188b.getValue()) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == this.f31189c.j()) {
                this.f31194h = c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
        this.f31194h = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean F0() {
        int k11 = this.f31189c.k();
        int i11 = this.f31197k;
        if (k11 < i11) {
            return false;
        }
        this.f31189c.l(i11);
        this.f31194h = c.HEADER_NAME;
        return true;
    }

    private boolean G0() {
        if ((this.f31196j & 4) == 4) {
            if (this.f31189c.k() < 2) {
                return false;
            }
            this.f31197k = this.f31189c.j();
            this.f31194h = c.HEADER_EXTRA;
            return true;
        }
        this.f31194h = c.HEADER_NAME;
        return true;
    }

    private boolean I0() {
        if ((this.f31196j & 8) == 8) {
            if (this.f31189c.g()) {
                this.f31194h = c.HEADER_COMMENT;
                return true;
            }
            return false;
        }
        this.f31194h = c.HEADER_COMMENT;
        return true;
    }

    private boolean J() {
        com.google.common.base.u.v(this.f31193g != null, "inflater is null");
        com.google.common.base.u.v(this.f31191e == this.f31192f, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f31187a.f(), 512);
        if (min == 0) {
            return false;
        }
        this.f31191e = 0;
        this.f31192f = min;
        this.f31187a.d1(this.f31190d, 0, min);
        this.f31193g.setInput(this.f31190d, this.f31191e, min);
        this.f31194h = c.INFLATING;
        return true;
    }

    private boolean J0() {
        if (this.f31193g != null && this.f31189c.k() <= 18) {
            this.f31193g.end();
            this.f31193g = null;
        }
        if (this.f31189c.k() < 8) {
            return false;
        }
        if (this.f31188b.getValue() == this.f31189c.i() && this.f31198l == this.f31189c.i()) {
            this.f31188b.reset();
            this.f31194h = c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    private int e0(byte[] bArr, int i11, int i12) {
        com.google.common.base.u.v(this.f31193g != null, "inflater is null");
        try {
            int totalIn = this.f31193g.getTotalIn();
            int inflate = this.f31193g.inflate(bArr, i11, i12);
            int totalIn2 = this.f31193g.getTotalIn() - totalIn;
            this.f31199m += totalIn2;
            this.f31200n += totalIn2;
            this.f31191e += totalIn2;
            this.f31188b.update(bArr, i11, inflate);
            if (this.f31193g.finished()) {
                this.f31198l = this.f31193g.getBytesWritten() & 4294967295L;
                this.f31194h = c.TRAILER;
            } else if (this.f31193g.needsInput()) {
                this.f31194h = c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e11) {
            throw new DataFormatException("Inflater data format exception: " + e11.getMessage());
        }
    }

    static /* synthetic */ int j(r0 r0Var, int i11) {
        int i12 = r0Var.f31191e + i11;
        r0Var.f31191e = i12;
        return i12;
    }

    private boolean p0() {
        Inflater inflater = this.f31193g;
        if (inflater == null) {
            this.f31193g = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f31188b.reset();
        int i11 = this.f31192f;
        int i12 = this.f31191e;
        int i13 = i11 - i12;
        if (i13 > 0) {
            this.f31193g.setInput(this.f31190d, i12, i13);
            this.f31194h = c.INFLATING;
        } else {
            this.f31194h = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean u0() {
        if (this.f31189c.k() < 10) {
            return false;
        }
        if (this.f31189c.j() == 35615) {
            if (this.f31189c.h() == 8) {
                this.f31196j = this.f31189c.h();
                this.f31189c.l(6);
                this.f31194h = c.HEADER_EXTRA_LEN;
                return true;
            }
            throw new ZipException("Unsupported compression method");
        }
        throw new ZipException("Not in GZIP format");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(u1 u1Var) {
        com.google.common.base.u.v(!this.f31195i, "GzipInflatingBuffer is closed");
        this.f31187a.g(u1Var);
        this.f31201o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L() {
        int i11 = this.f31199m;
        this.f31199m = 0;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R() {
        int i11 = this.f31200n;
        this.f31200n = 0;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        com.google.common.base.u.v(!this.f31195i, "GzipInflatingBuffer is closed");
        return (this.f31189c.k() == 0 && this.f31194h == c.HEADER) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f31195i) {
            return;
        }
        this.f31195i = true;
        this.f31187a.close();
        Inflater inflater = this.f31193g;
        if (inflater != null) {
            inflater.end();
            this.f31193g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r6.f31194h != io.grpc.internal.r0.c.HEADER) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r6.f31189c.k() >= 10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        r6.f31201o = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int n0(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f31195i
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            com.google.common.base.u.v(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L77
            int r4 = r9 - r3
            if (r4 <= 0) goto L77
            int[] r2 = io.grpc.internal.r0.a.f31202a
            io.grpc.internal.r0$c r5 = r6.f31194h
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L72;
                case 2: goto L6d;
                case 3: goto L68;
                case 4: goto L63;
                case 5: goto L5e;
                case 6: goto L59;
                case 7: goto L54;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            io.grpc.internal.r0$c r9 = r6.f31194h
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.J0()
            goto Lc
        L3d:
            boolean r2 = r6.J()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.e0(r7, r2, r4)
            int r3 = r3 + r2
            io.grpc.internal.r0$c r2 = r6.f31194h
            io.grpc.internal.r0$c r4 = io.grpc.internal.r0.c.TRAILER
            if (r2 != r4) goto Lb
            boolean r2 = r6.J0()
            goto Lc
        L54:
            boolean r2 = r6.p0()
            goto Lc
        L59:
            boolean r2 = r6.D0()
            goto Lc
        L5e:
            boolean r2 = r6.C0()
            goto Lc
        L63:
            boolean r2 = r6.I0()
            goto Lc
        L68:
            boolean r2 = r6.F0()
            goto Lc
        L6d:
            boolean r2 = r6.G0()
            goto Lc
        L72:
            boolean r2 = r6.u0()
            goto Lc
        L77:
            if (r2 == 0) goto L8b
            io.grpc.internal.r0$c r7 = r6.f31194h
            io.grpc.internal.r0$c r8 = io.grpc.internal.r0.c.HEADER
            if (r7 != r8) goto L8a
            io.grpc.internal.r0$b r7 = r6.f31189c
            int r7 = io.grpc.internal.r0.b.d(r7)
            r8 = 10
            if (r7 >= r8) goto L8a
            goto L8b
        L8a:
            r1 = r0
        L8b:
            r6.f31201o = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.r0.n0(byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t0() {
        com.google.common.base.u.v(!this.f31195i, "GzipInflatingBuffer is closed");
        return this.f31201o;
    }
}