package io.grpc.internal;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.grpc.internal.j2;
import io.grpc.l;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public class k1 implements Closeable, y {

    /* renamed from: a  reason: collision with root package name */
    private b f31007a;

    /* renamed from: b  reason: collision with root package name */
    private int f31008b;

    /* renamed from: c  reason: collision with root package name */
    private final h2 f31009c;

    /* renamed from: d  reason: collision with root package name */
    private final n2 f31010d;

    /* renamed from: e  reason: collision with root package name */
    private io.grpc.u f31011e;

    /* renamed from: f  reason: collision with root package name */
    private r0 f31012f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f31013g;

    /* renamed from: h  reason: collision with root package name */
    private int f31014h;

    /* renamed from: k  reason: collision with root package name */
    private boolean f31017k;

    /* renamed from: l  reason: collision with root package name */
    private u f31018l;

    /* renamed from: n  reason: collision with root package name */
    private long f31020n;

    /* renamed from: q  reason: collision with root package name */
    private int f31023q;

    /* renamed from: i  reason: collision with root package name */
    private e f31015i = e.HEADER;

    /* renamed from: j  reason: collision with root package name */
    private int f31016j = 5;

    /* renamed from: m  reason: collision with root package name */
    private u f31019m = new u();

    /* renamed from: o  reason: collision with root package name */
    private boolean f31021o = false;

    /* renamed from: p  reason: collision with root package name */
    private int f31022p = -1;

    /* renamed from: t  reason: collision with root package name */
    private boolean f31024t = false;

    /* renamed from: w  reason: collision with root package name */
    private volatile boolean f31025w = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31026a;

        static {
            int[] iArr = new int[e.values().length];
            f31026a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31026a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(j2.a aVar);

        void b(int i11);

        void c(Throwable th2);

        void d(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c implements j2.a {

        /* renamed from: a  reason: collision with root package name */
        private InputStream f31027a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            InputStream inputStream = this.f31027a;
            this.f31027a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f31027a = inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum e {
        HEADER,
        BODY
    }

    public k1(b bVar, io.grpc.u uVar, int i11, h2 h2Var, n2 n2Var) {
        this.f31007a = (b) com.google.common.base.u.p(bVar, "sink");
        this.f31011e = (io.grpc.u) com.google.common.base.u.p(uVar, "decompressor");
        this.f31008b = i11;
        this.f31009c = (h2) com.google.common.base.u.p(h2Var, "statsTraceCtx");
        this.f31010d = (n2) com.google.common.base.u.p(n2Var, "transportTracer");
    }

    private InputStream C() {
        io.grpc.u uVar = this.f31011e;
        if (uVar != l.b.f31488a) {
            try {
                return new d(uVar.b(v1.c(this.f31018l, true)), this.f31008b, this.f31009c);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
        throw io.grpc.f1.f30570n.r("Can't decode compressed gRPC message as compression not configured").d();
    }

    private InputStream D() {
        this.f31009c.f(this.f31018l.f());
        return v1.c(this.f31018l, true);
    }

    private boolean J() {
        return isClosed() || this.f31024t;
    }

    private boolean L() {
        r0 r0Var = this.f31012f;
        if (r0Var != null) {
            return r0Var.t0();
        }
        return this.f31019m.f() == 0;
    }

    private void R() {
        this.f31009c.e(this.f31022p, this.f31023q, -1L);
        this.f31023q = 0;
        InputStream C = this.f31017k ? C() : D();
        this.f31018l = null;
        this.f31007a.a(new c(C, null));
        this.f31015i = e.HEADER;
        this.f31016j = 5;
    }

    private void a() {
        if (this.f31021o) {
            return;
        }
        this.f31021o = true;
        while (true) {
            try {
                if (this.f31025w || this.f31020n <= 0 || !e0()) {
                    break;
                }
                int i11 = a.f31026a[this.f31015i.ordinal()];
                if (i11 == 1) {
                    a0();
                } else if (i11 == 2) {
                    R();
                    this.f31020n--;
                } else {
                    throw new AssertionError("Invalid state: " + this.f31015i);
                }
            } finally {
                this.f31021o = false;
            }
        }
        if (this.f31025w) {
            close();
            return;
        }
        if (this.f31024t && L()) {
            close();
        }
    }

    private void a0() {
        int readUnsignedByte = this.f31018l.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.f31017k = (readUnsignedByte & 1) != 0;
            int readInt = this.f31018l.readInt();
            this.f31016j = readInt;
            if (readInt >= 0 && readInt <= this.f31008b) {
                int i11 = this.f31022p + 1;
                this.f31022p = i11;
                this.f31009c.d(i11);
                this.f31010d.d();
                this.f31015i = e.BODY;
                return;
            }
            throw io.grpc.f1.f30568l.r(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f31008b), Integer.valueOf(this.f31016j))).d();
        }
        throw io.grpc.f1.f30570n.r("gRPC frame header malformed: reserved bits not zero").d();
    }

    private boolean e0() {
        int i11;
        int i12 = 0;
        try {
            if (this.f31018l == null) {
                this.f31018l = new u();
            }
            int i13 = 0;
            i11 = 0;
            while (true) {
                try {
                    int f11 = this.f31016j - this.f31018l.f();
                    if (f11 <= 0) {
                        if (i13 > 0) {
                            this.f31007a.b(i13);
                            if (this.f31015i == e.BODY) {
                                if (this.f31012f != null) {
                                    this.f31009c.g(i11);
                                    this.f31023q += i11;
                                } else {
                                    this.f31009c.g(i13);
                                    this.f31023q += i13;
                                }
                            }
                        }
                        return true;
                    } else if (this.f31012f != null) {
                        try {
                            byte[] bArr = this.f31013g;
                            if (bArr == null || this.f31014h == bArr.length) {
                                this.f31013g = new byte[Math.min(f11, (int) PKIFailureInfo.badSenderNonce)];
                                this.f31014h = 0;
                            }
                            int n02 = this.f31012f.n0(this.f31013g, this.f31014h, Math.min(f11, this.f31013g.length - this.f31014h));
                            i13 += this.f31012f.L();
                            i11 += this.f31012f.R();
                            if (n02 == 0) {
                                if (i13 > 0) {
                                    this.f31007a.b(i13);
                                    if (this.f31015i == e.BODY) {
                                        if (this.f31012f != null) {
                                            this.f31009c.g(i11);
                                            this.f31023q += i11;
                                        } else {
                                            this.f31009c.g(i13);
                                            this.f31023q += i13;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f31018l.g(v1.f(this.f31013g, this.f31014h, n02));
                            this.f31014h += n02;
                        } catch (IOException e11) {
                            throw new RuntimeException(e11);
                        } catch (DataFormatException e12) {
                            throw new RuntimeException(e12);
                        }
                    } else if (this.f31019m.f() == 0) {
                        if (i13 > 0) {
                            this.f31007a.b(i13);
                            if (this.f31015i == e.BODY) {
                                if (this.f31012f != null) {
                                    this.f31009c.g(i11);
                                    this.f31023q += i11;
                                } else {
                                    this.f31009c.g(i13);
                                    this.f31023q += i13;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(f11, this.f31019m.f());
                        i13 += min;
                        this.f31018l.g(this.f31019m.y(min));
                    }
                } catch (Throwable th2) {
                    int i14 = i13;
                    th = th2;
                    i12 = i14;
                    if (i12 > 0) {
                        this.f31007a.b(i12);
                        if (this.f31015i == e.BODY) {
                            if (this.f31012f != null) {
                                this.f31009c.g(i11);
                                this.f31023q += i11;
                            } else {
                                this.f31009c.g(i12);
                                this.f31023q += i12;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i11 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.y
    public void close() {
        if (isClosed()) {
            return;
        }
        u uVar = this.f31018l;
        boolean z11 = true;
        boolean z12 = uVar != null && uVar.f() > 0;
        try {
            r0 r0Var = this.f31012f;
            if (r0Var != null) {
                if (!z12 && !r0Var.a0()) {
                    z11 = false;
                }
                this.f31012f.close();
                z12 = z11;
            }
            u uVar2 = this.f31019m;
            if (uVar2 != null) {
                uVar2.close();
            }
            u uVar3 = this.f31018l;
            if (uVar3 != null) {
                uVar3.close();
            }
            this.f31012f = null;
            this.f31019m = null;
            this.f31018l = null;
            this.f31007a.d(z12);
        } catch (Throwable th2) {
            this.f31012f = null;
            this.f31019m = null;
            this.f31018l = null;
            throw th2;
        }
    }

    @Override // io.grpc.internal.y
    public void g(int i11) {
        com.google.common.base.u.e(i11 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f31020n += i11;
        a();
    }

    public boolean isClosed() {
        return this.f31019m == null && this.f31012f == null;
    }

    @Override // io.grpc.internal.y
    public void j(int i11) {
        this.f31008b = i11;
    }

    @Override // io.grpc.internal.y
    public void l(io.grpc.u uVar) {
        com.google.common.base.u.v(this.f31012f == null, "Already set full stream decompressor");
        this.f31011e = (io.grpc.u) com.google.common.base.u.p(uVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.y
    public void m(u1 u1Var) {
        com.google.common.base.u.p(u1Var, MessageExtension.FIELD_DATA);
        boolean z11 = true;
        try {
            if (!J()) {
                r0 r0Var = this.f31012f;
                if (r0Var != null) {
                    r0Var.D(u1Var);
                } else {
                    this.f31019m.g(u1Var);
                }
                z11 = false;
                a();
            }
        } finally {
            if (z11) {
                u1Var.close();
            }
        }
    }

    public void n0(r0 r0Var) {
        com.google.common.base.u.v(this.f31011e == l.b.f31488a, "per-message decompressor already set");
        com.google.common.base.u.v(this.f31012f == null, "full stream decompressor already set");
        this.f31012f = (r0) com.google.common.base.u.p(r0Var, "Can't pass a null full stream decompressor");
        this.f31019m = null;
    }

    @Override // io.grpc.internal.y
    public void p() {
        if (isClosed()) {
            return;
        }
        if (L()) {
            close();
        } else {
            this.f31024t = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(b bVar) {
        this.f31007a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t0() {
        this.f31025w = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final int f31028a;

        /* renamed from: b  reason: collision with root package name */
        private final h2 f31029b;

        /* renamed from: c  reason: collision with root package name */
        private long f31030c;

        /* renamed from: d  reason: collision with root package name */
        private long f31031d;

        /* renamed from: e  reason: collision with root package name */
        private long f31032e;

        d(InputStream inputStream, int i11, h2 h2Var) {
            super(inputStream);
            this.f31032e = -1L;
            this.f31028a = i11;
            this.f31029b = h2Var;
        }

        private void a() {
            long j11 = this.f31031d;
            long j12 = this.f31030c;
            if (j11 > j12) {
                this.f31029b.f(j11 - j12);
                this.f31030c = this.f31031d;
            }
        }

        private void g() {
            long j11 = this.f31031d;
            int i11 = this.f31028a;
            if (j11 > i11) {
                throw io.grpc.f1.f30568l.r(String.format("Decompressed gRPC message exceeds maximum size %d", Integer.valueOf(i11))).d();
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.f31032e = this.f31031d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f31031d++;
            }
            g();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f31032e != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f31031d = this.f31032e;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j11) {
            long skip = ((FilterInputStream) this).in.skip(j11);
            this.f31031d += skip;
            g();
            a();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int read = ((FilterInputStream) this).in.read(bArr, i11, i12);
            if (read != -1) {
                this.f31031d += read;
            }
            g();
            a();
            return read;
        }
    }
}