package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes5.dex */
public class u extends io.grpc.internal.c {

    /* renamed from: e  reason: collision with root package name */
    private static final f<Void> f31227e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final f<Void> f31228f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final f<byte[]> f31229g = new c();

    /* renamed from: h  reason: collision with root package name */
    private static final f<ByteBuffer> f31230h = new d();

    /* renamed from: i  reason: collision with root package name */
    private static final g<OutputStream> f31231i = new e();

    /* renamed from: a  reason: collision with root package name */
    private final Deque<u1> f31232a;

    /* renamed from: b  reason: collision with root package name */
    private Deque<u1> f31233b;

    /* renamed from: c  reason: collision with root package name */
    private int f31234c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31235d;

    /* loaded from: classes5.dex */
    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(u1 u1Var, int i11, Void r32, int i12) {
            return u1Var.readUnsignedByte();
        }
    }

    /* loaded from: classes5.dex */
    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(u1 u1Var, int i11, Void r32, int i12) {
            u1Var.skipBytes(i11);
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(u1 u1Var, int i11, byte[] bArr, int i12) {
            u1Var.d1(bArr, i12, i11);
            return i12 + i11;
        }
    }

    /* loaded from: classes5.dex */
    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(u1 u1Var, int i11, ByteBuffer byteBuffer, int i12) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i11);
            u1Var.o0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(u1 u1Var, int i11, OutputStream outputStream, int i12) {
            u1Var.A1(outputStream, i11);
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    private interface f<T> extends g<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface g<T> {
        int a(u1 u1Var, int i11, T t11, int i12);
    }

    public u(int i11) {
        this.f31232a = new ArrayDeque(i11);
    }

    private <T> int C(f<T> fVar, int i11, T t11, int i12) {
        try {
            return p(fVar, i11, t11, i12);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    private void j() {
        if (this.f31235d) {
            this.f31233b.add(this.f31232a.remove());
            u1 peek = this.f31232a.peek();
            if (peek != null) {
                peek.k1();
                return;
            }
            return;
        }
        this.f31232a.remove().close();
    }

    private void l() {
        if (this.f31232a.peek().f() == 0) {
            j();
        }
    }

    private void m(u1 u1Var) {
        if (!(u1Var instanceof u)) {
            this.f31232a.add(u1Var);
            this.f31234c += u1Var.f();
            return;
        }
        u uVar = (u) u1Var;
        while (!uVar.f31232a.isEmpty()) {
            this.f31232a.add(uVar.f31232a.remove());
        }
        this.f31234c += uVar.f31234c;
        uVar.f31234c = 0;
        uVar.close();
    }

    private <T> int p(g<T> gVar, int i11, T t11, int i12) {
        a(i11);
        if (!this.f31232a.isEmpty()) {
            l();
        }
        while (i11 > 0 && !this.f31232a.isEmpty()) {
            u1 peek = this.f31232a.peek();
            int min = Math.min(i11, peek.f());
            i12 = gVar.a(peek, min, t11, i12);
            i11 -= min;
            this.f31234c -= min;
            l();
        }
        if (i11 <= 0) {
            return i12;
        }
        throw new AssertionError("Failed executing read operation");
    }

    @Override // io.grpc.internal.u1
    public void A1(OutputStream outputStream, int i11) {
        p(f31231i, i11, outputStream, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f31232a.isEmpty()) {
            this.f31232a.remove().close();
        }
        if (this.f31233b != null) {
            while (!this.f31233b.isEmpty()) {
                this.f31233b.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.u1
    public void d1(byte[] bArr, int i11, int i12) {
        C(f31229g, i12, bArr, i11);
    }

    @Override // io.grpc.internal.u1
    public int f() {
        return this.f31234c;
    }

    public void g(u1 u1Var) {
        boolean z11 = this.f31235d && this.f31232a.isEmpty();
        m(u1Var);
        if (z11) {
            this.f31232a.peek().k1();
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void k1() {
        if (this.f31233b == null) {
            this.f31233b = new ArrayDeque(Math.min(this.f31232a.size(), 16));
        }
        while (!this.f31233b.isEmpty()) {
            this.f31233b.remove().close();
        }
        this.f31235d = true;
        u1 peek = this.f31232a.peek();
        if (peek != null) {
            peek.k1();
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public boolean markSupported() {
        for (u1 u1Var : this.f31232a) {
            if (!u1Var.markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.u1
    public void o0(ByteBuffer byteBuffer) {
        C(f31230h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        return C(f31227e, 1, null, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1
    public void reset() {
        if (this.f31235d) {
            u1 peek = this.f31232a.peek();
            if (peek != null) {
                int f11 = peek.f();
                peek.reset();
                this.f31234c += peek.f() - f11;
            }
            while (true) {
                u1 pollLast = this.f31233b.pollLast();
                if (pollLast == null) {
                    return;
                }
                pollLast.reset();
                this.f31232a.addFirst(pollLast);
                this.f31234c += pollLast.f();
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i11) {
        C(f31228f, i11, null, 0);
    }

    @Override // io.grpc.internal.u1
    public u1 y(int i11) {
        u1 poll;
        int i12;
        u1 u1Var;
        if (i11 <= 0) {
            return v1.a();
        }
        a(i11);
        this.f31234c -= i11;
        u uVar = null;
        u uVar2 = null;
        while (true) {
            u1 peek = this.f31232a.peek();
            int f11 = peek.f();
            if (f11 > i11) {
                u1Var = peek.y(i11);
                i12 = 0;
            } else {
                if (this.f31235d) {
                    poll = peek.y(f11);
                    j();
                } else {
                    poll = this.f31232a.poll();
                }
                u1 u1Var2 = poll;
                i12 = i11 - f11;
                u1Var = u1Var2;
            }
            if (uVar == null) {
                uVar = u1Var;
            } else {
                if (uVar2 == null) {
                    uVar2 = new u(i12 != 0 ? Math.min(this.f31232a.size() + 2, 16) : 2);
                    uVar2.g(uVar);
                    uVar = uVar2;
                }
                uVar2.g(u1Var);
            }
            if (i12 <= 0) {
                return uVar;
            }
            i11 = i12;
        }
    }

    public u() {
        this.f31232a = new ArrayDeque();
    }
}