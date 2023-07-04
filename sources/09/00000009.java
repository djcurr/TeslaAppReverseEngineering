package a0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class a extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    final OutputStream f48a;

    /* renamed from: b  reason: collision with root package name */
    private ByteOrder f49b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f48a = outputStream;
        this.f49b = byteOrder;
    }

    public void a(ByteOrder byteOrder) {
        this.f49b = byteOrder;
    }

    public void g(int i11) {
        this.f48a.write(i11);
    }

    public void j(int i11) {
        ByteOrder byteOrder = this.f49b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f48a.write((i11 >>> 0) & 255);
            this.f48a.write((i11 >>> 8) & 255);
            this.f48a.write((i11 >>> 16) & 255);
            this.f48a.write((i11 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f48a.write((i11 >>> 24) & 255);
            this.f48a.write((i11 >>> 16) & 255);
            this.f48a.write((i11 >>> 8) & 255);
            this.f48a.write((i11 >>> 0) & 255);
        }
    }

    public void l(short s11) {
        ByteOrder byteOrder = this.f49b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f48a.write((s11 >>> 0) & 255);
            this.f48a.write((s11 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f48a.write((s11 >>> 8) & 255);
            this.f48a.write((s11 >>> 0) & 255);
        }
    }

    public void m(long j11) {
        j((int) j11);
    }

    public void p(int i11) {
        l((short) i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f48a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.f48a.write(bArr, i11, i12);
    }
}