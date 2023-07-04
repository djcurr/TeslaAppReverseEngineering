package sd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f50390a;

    /* renamed from: b  reason: collision with root package name */
    private int f50391b;

    /* renamed from: c  reason: collision with root package name */
    private int f50392c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(bArr);
        this.f50390a = bArr;
    }

    private int a() {
        int i11 = this.f50391b;
        byte[] bArr = this.f50390a;
        if (i11 >= bArr.length) {
            return -1;
        }
        this.f50391b = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i11);
            this.f50392c = this.f50391b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f50391b = this.f50392c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int read = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (read != -1) {
            return read;
        }
        int i13 = 0;
        if (i12 == 0) {
            return 0;
        }
        while (i13 < i12) {
            int a11 = a();
            if (a11 == -1) {
                break;
            }
            bArr[i11 + i13] = (byte) a11;
            i13++;
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}