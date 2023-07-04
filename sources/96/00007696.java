package io.grpc.internal;

import io.grpc.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class l1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f31046a;

    /* renamed from: c  reason: collision with root package name */
    private o2 f31048c;

    /* renamed from: h  reason: collision with root package name */
    private final p2 f31053h;

    /* renamed from: i  reason: collision with root package name */
    private final h2 f31054i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31055j;

    /* renamed from: k  reason: collision with root package name */
    private int f31056k;

    /* renamed from: m  reason: collision with root package name */
    private long f31058m;

    /* renamed from: b  reason: collision with root package name */
    private int f31047b = -1;

    /* renamed from: d  reason: collision with root package name */
    private io.grpc.n f31049d = l.b.f31488a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31050e = true;

    /* renamed from: f  reason: collision with root package name */
    private final c f31051f = new c();

    /* renamed from: g  reason: collision with root package name */
    private final ByteBuffer f31052g = ByteBuffer.allocate(5);

    /* renamed from: l  reason: collision with root package name */
    private int f31057l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            write(new byte[]{(byte) i11}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            l1.this.n(bArr, i11, i12);
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void e(o2 o2Var, boolean z11, boolean z12, int i11);
    }

    public l1(d dVar, p2 p2Var, h2 h2Var) {
        this.f31046a = (d) com.google.common.base.u.p(dVar, "sink");
        this.f31053h = (p2) com.google.common.base.u.p(p2Var, "bufferAllocator");
        this.f31054i = (h2) com.google.common.base.u.p(h2Var, "statsTraceCtx");
    }

    private void e(boolean z11, boolean z12) {
        o2 o2Var = this.f31048c;
        this.f31048c = null;
        this.f31046a.e(o2Var, z11, z12, this.f31056k);
        this.f31056k = 0;
    }

    private int f(InputStream inputStream) {
        if ((inputStream instanceof io.grpc.l0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void g() {
        o2 o2Var = this.f31048c;
        if (o2Var != null) {
            o2Var.release();
            this.f31048c = null;
        }
    }

    private void i() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void j(b bVar, boolean z11) {
        int f11 = bVar.f();
        this.f31052g.clear();
        this.f31052g.put(z11 ? (byte) 1 : (byte) 0).putInt(f11);
        o2 a11 = this.f31053h.a(5);
        a11.o(this.f31052g.array(), 0, this.f31052g.position());
        if (f11 == 0) {
            this.f31048c = a11;
            return;
        }
        this.f31046a.e(a11, false, false, this.f31056k - 1);
        this.f31056k = 1;
        List list = bVar.f31059a;
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            this.f31046a.e((o2) list.get(i11), false, false, 0);
        }
        this.f31048c = (o2) list.get(list.size() - 1);
        this.f31058m = f11;
    }

    private int l(InputStream inputStream, int i11) {
        b bVar = new b();
        OutputStream compress = this.f31049d.compress(bVar);
        try {
            int o11 = o(inputStream, compress);
            compress.close();
            int i12 = this.f31047b;
            if (i12 >= 0 && o11 > i12) {
                throw io.grpc.f1.f30568l.r(String.format("message too large %d > %d", Integer.valueOf(o11), Integer.valueOf(this.f31047b))).d();
            }
            j(bVar, true);
            return o11;
        } catch (Throwable th2) {
            compress.close();
            throw th2;
        }
    }

    private int m(InputStream inputStream, int i11) {
        int i12 = this.f31047b;
        if (i12 >= 0 && i11 > i12) {
            throw io.grpc.f1.f30568l.r(String.format("message too large %d > %d", Integer.valueOf(i11), Integer.valueOf(this.f31047b))).d();
        }
        this.f31052g.clear();
        this.f31052g.put((byte) 0).putInt(i11);
        if (this.f31048c == null) {
            this.f31048c = this.f31053h.a(this.f31052g.position() + i11);
        }
        n(this.f31052g.array(), 0, this.f31052g.position());
        return o(inputStream, this.f31051f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            o2 o2Var = this.f31048c;
            if (o2Var != null && o2Var.p() == 0) {
                e(false, false);
            }
            if (this.f31048c == null) {
                this.f31048c = this.f31053h.a(i12);
            }
            int min = Math.min(i12, this.f31048c.p());
            this.f31048c.o(bArr, i11, min);
            i11 += min;
            i12 -= min;
        }
    }

    private static int o(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof io.grpc.w) {
            return ((io.grpc.w) inputStream).a(outputStream);
        }
        long b11 = dl.a.b(inputStream, outputStream);
        com.google.common.base.u.j(b11 <= 2147483647L, "Message size overflow: %s", b11);
        return (int) b11;
    }

    private int p(InputStream inputStream, int i11) {
        if (i11 != -1) {
            this.f31058m = i11;
            return m(inputStream, i11);
        }
        b bVar = new b();
        int o11 = o(inputStream, bVar);
        int i12 = this.f31047b;
        if (i12 >= 0 && o11 > i12) {
            throw io.grpc.f1.f30568l.r(String.format("message too large %d > %d", Integer.valueOf(o11), Integer.valueOf(this.f31047b))).d();
        }
        j(bVar, false);
        return o11;
    }

    @Override // io.grpc.internal.o0
    public void b(InputStream inputStream) {
        int p11;
        i();
        this.f31056k++;
        int i11 = this.f31057l + 1;
        this.f31057l = i11;
        this.f31058m = 0L;
        this.f31054i.i(i11);
        boolean z11 = this.f31050e && this.f31049d != l.b.f31488a;
        try {
            int f11 = f(inputStream);
            if (f11 != 0 && z11) {
                p11 = l(inputStream, f11);
            } else {
                p11 = p(inputStream, f11);
            }
            if (f11 != -1 && p11 != f11) {
                throw io.grpc.f1.f30570n.r(String.format("Message length inaccurate %s != %s", Integer.valueOf(p11), Integer.valueOf(f11))).d();
            }
            long j11 = p11;
            this.f31054i.k(j11);
            this.f31054i.l(this.f31058m);
            this.f31054i.j(this.f31057l, this.f31058m, j11);
        } catch (IOException e11) {
            throw io.grpc.f1.f30570n.r("Failed to frame message").q(e11).d();
        } catch (RuntimeException e12) {
            throw io.grpc.f1.f30570n.r("Failed to frame message").q(e12).d();
        }
    }

    @Override // io.grpc.internal.o0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f31055j = true;
        o2 o2Var = this.f31048c;
        if (o2Var != null && o2Var.f() == 0) {
            g();
        }
        e(true, true);
    }

    @Override // io.grpc.internal.o0
    public void flush() {
        o2 o2Var = this.f31048c;
        if (o2Var == null || o2Var.f() <= 0) {
            return;
        }
        e(false, true);
    }

    @Override // io.grpc.internal.o0
    /* renamed from: h */
    public l1 a(io.grpc.n nVar) {
        this.f31049d = (io.grpc.n) com.google.common.base.u.p(nVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.o0
    public boolean isClosed() {
        return this.f31055j;
    }

    @Override // io.grpc.internal.o0
    public void k(int i11) {
        com.google.common.base.u.v(this.f31047b == -1, "max size already set");
        this.f31047b = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final List<o2> f31059a;

        /* renamed from: b  reason: collision with root package name */
        private o2 f31060b;

        private b() {
            this.f31059a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            int i11 = 0;
            for (o2 o2Var : this.f31059a) {
                i11 += o2Var.f();
            }
            return i11;
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            o2 o2Var = this.f31060b;
            if (o2Var != null && o2Var.p() > 0) {
                this.f31060b.q((byte) i11);
            } else {
                write(new byte[]{(byte) i11}, 0, 1);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            if (this.f31060b == null) {
                o2 a11 = l1.this.f31053h.a(i12);
                this.f31060b = a11;
                this.f31059a.add(a11);
            }
            while (i12 > 0) {
                int min = Math.min(i12, this.f31060b.p());
                if (min == 0) {
                    o2 a12 = l1.this.f31053h.a(Math.max(i12, this.f31060b.f() * 2));
                    this.f31060b = a12;
                    this.f31059a.add(a12);
                } else {
                    this.f31060b.o(bArr, i11, min);
                    i11 += min;
                    i12 -= min;
                }
            }
        }
    }
}