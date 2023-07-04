package mx;

import io.grpc.internal.u1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class k extends io.grpc.internal.c {

    /* renamed from: a  reason: collision with root package name */
    private final okio.f f39623a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(okio.f fVar) {
        this.f39623a = fVar;
    }

    private void g() {
    }

    @Override // io.grpc.internal.u1
    public void A1(OutputStream outputStream, int i11) {
        this.f39623a.N1(outputStream, i11);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39623a.a();
    }

    @Override // io.grpc.internal.u1
    public void d1(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            int read = this.f39623a.read(bArr, i11, i12);
            if (read == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i12 + " bytes");
            }
            i12 -= read;
            i11 += read;
        }
    }

    @Override // io.grpc.internal.u1
    public int f() {
        return (int) this.f39623a.P0();
    }

    @Override // io.grpc.internal.u1
    public void o0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        try {
            g();
            return this.f39623a.readByte() & 255;
        } catch (EOFException e11) {
            throw new IndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i11) {
        try {
            this.f39623a.skip(i11);
        } catch (EOFException e11) {
            throw new IndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // io.grpc.internal.u1
    public u1 y(int i11) {
        okio.f fVar = new okio.f();
        fVar.write(this.f39623a, i11);
        return new k(fVar);
    }
}