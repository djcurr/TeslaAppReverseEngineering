package pd;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import md.k;

/* loaded from: classes.dex */
public class h extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    final PooledByteBuffer f46429a;

    /* renamed from: b  reason: collision with root package name */
    int f46430b;

    /* renamed from: c  reason: collision with root package name */
    int f46431c;

    public h(PooledByteBuffer pooledByteBuffer) {
        k.b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f46429a = (PooledByteBuffer) k.g(pooledByteBuffer);
        this.f46430b = 0;
        this.f46431c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f46429a.size() - this.f46430b;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f46431c = this.f46430b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f46429a;
        int i11 = this.f46430b;
        this.f46430b = i11 + 1;
        return pooledByteBuffer.n(i11) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f46430b = this.f46431c;
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        k.b(Boolean.valueOf(j11 >= 0));
        int min = Math.min((int) j11, available());
        this.f46430b += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i12 <= 0) {
                return 0;
            }
            int min = Math.min(available, i12);
            this.f46429a.h(this.f46430b, bArr, i11, min);
            this.f46430b += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i11 + "; regionLength=" + i12);
    }
}