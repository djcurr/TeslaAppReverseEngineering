package io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a */
    private static final u1 f31248a = new c(new byte[0]);

    /* loaded from: classes5.dex */
    public class a extends n0 {
        a(u1 u1Var) {
            super(u1Var);
        }

        @Override // io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends io.grpc.internal.c {

        /* renamed from: a */
        int f31250a;

        /* renamed from: b */
        final int f31251b;

        /* renamed from: c */
        final byte[] f31252c;

        /* renamed from: d */
        int f31253d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.u1
        public void A1(OutputStream outputStream, int i11) {
            a(i11);
            outputStream.write(this.f31252c, this.f31250a, i11);
            this.f31250a += i11;
        }

        @Override // io.grpc.internal.u1
        public void d1(byte[] bArr, int i11, int i12) {
            System.arraycopy(this.f31252c, this.f31250a, bArr, i11, i12);
            this.f31250a += i12;
        }

        @Override // io.grpc.internal.u1
        public int f() {
            return this.f31251b - this.f31250a;
        }

        @Override // io.grpc.internal.u1
        /* renamed from: g */
        public c y(int i11) {
            a(i11);
            int i12 = this.f31250a;
            this.f31250a = i12 + i11;
            return new c(this.f31252c, i12, i11);
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void k1() {
            this.f31253d = this.f31250a;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.u1
        public void o0(ByteBuffer byteBuffer) {
            com.google.common.base.u.p(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            a(remaining);
            byteBuffer.put(this.f31252c, this.f31250a, remaining);
            this.f31250a += remaining;
        }

        @Override // io.grpc.internal.u1
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f31252c;
            int i11 = this.f31250a;
            this.f31250a = i11 + 1;
            return bArr[i11] & 255;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void reset() {
            int i11 = this.f31253d;
            if (i11 != -1) {
                this.f31250a = i11;
                return;
            }
            throw new InvalidMarkException();
        }

        @Override // io.grpc.internal.u1
        public void skipBytes(int i11) {
            a(i11);
            this.f31250a += i11;
        }

        c(byte[] bArr, int i11, int i12) {
            this.f31253d = -1;
            com.google.common.base.u.e(i11 >= 0, "offset must be >= 0");
            com.google.common.base.u.e(i12 >= 0, "length must be >= 0");
            int i13 = i12 + i11;
            com.google.common.base.u.e(i13 <= bArr.length, "offset + length exceeds array boundary");
            this.f31252c = (byte[]) com.google.common.base.u.p(bArr, "bytes");
            this.f31250a = i11;
            this.f31251b = i13;
        }
    }

    public static u1 a() {
        return f31248a;
    }

    public static u1 b(u1 u1Var) {
        return new a(u1Var);
    }

    public static InputStream c(u1 u1Var, boolean z11) {
        if (!z11) {
            u1Var = b(u1Var);
        }
        return new b(u1Var);
    }

    public static byte[] d(u1 u1Var) {
        com.google.common.base.u.p(u1Var, "buffer");
        int f11 = u1Var.f();
        byte[] bArr = new byte[f11];
        u1Var.d1(bArr, 0, f11);
        return bArr;
    }

    public static String e(u1 u1Var, Charset charset) {
        com.google.common.base.u.p(charset, "charset");
        return new String(d(u1Var), charset);
    }

    public static u1 f(byte[] bArr, int i11, int i12) {
        return new c(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends InputStream implements io.grpc.l0 {

        /* renamed from: a */
        private u1 f31249a;

        public b(u1 u1Var) {
            this.f31249a = (u1) com.google.common.base.u.p(u1Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f31249a.f();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31249a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            this.f31249a.k1();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f31249a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f31249a.f() == 0) {
                return -1;
            }
            return this.f31249a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f31249a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            int min = (int) Math.min(this.f31249a.f(), j11);
            this.f31249a.skipBytes(min);
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            if (this.f31249a.f() == 0) {
                return -1;
            }
            int min = Math.min(this.f31249a.f(), i12);
            this.f31249a.d1(bArr, i11, min);
            return min;
        }
    }
}