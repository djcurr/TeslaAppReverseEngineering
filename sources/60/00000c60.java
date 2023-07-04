package bc;

import com.drew.lang.BufferBoundsException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f7608b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7609c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<byte[]> f7610d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7611e;

    /* renamed from: f  reason: collision with root package name */
    private long f7612f;

    public j(InputStream inputStream) {
        this(inputStream, 2048, -1L);
    }

    @Override // bc.i
    public byte b(int i11) {
        int i12 = this.f7609c;
        int i13 = i11 / i12;
        return this.f7610d.get(i13)[i11 % i12];
    }

    @Override // bc.i
    public byte[] c(int i11, int i12) {
        x(i11, i12);
        byte[] bArr = new byte[i12];
        int i13 = 0;
        while (i12 != 0) {
            int i14 = this.f7609c;
            int i15 = i11 / i14;
            int i16 = i11 % i14;
            int min = Math.min(i12, i14 - i16);
            System.arraycopy(this.f7610d.get(i15), i16, bArr, i13, min);
            i12 -= min;
            i11 += min;
            i13 += min;
        }
        return bArr;
    }

    @Override // bc.i
    public long k() {
        long j11 = this.f7612f;
        if (j11 != -1) {
            return j11;
        }
        y(Integer.MAX_VALUE, 1);
        return this.f7612f;
    }

    @Override // bc.i
    protected void x(int i11, int i12) {
        if (i11 < 0) {
            throw new BufferBoundsException(String.format("Attempt to read from buffer using a negative index (%d)", Integer.valueOf(i11)));
        }
        if (i12 < 0) {
            throw new BufferBoundsException("Number of requested bytes must be zero or greater");
        }
        if ((i11 + i12) - 1 <= 2147483647L) {
            if (!y(i11, i12)) {
                throw new BufferBoundsException(i11, i12, this.f7612f);
            }
            return;
        }
        throw new BufferBoundsException(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    protected boolean y(int i11, int i12) {
        int i13;
        if (i11 < 0 || i12 < 0) {
            return false;
        }
        long j11 = (i11 + i12) - 1;
        if (j11 > 2147483647L) {
            return false;
        }
        int i14 = (int) j11;
        if (this.f7611e) {
            return ((long) i14) < this.f7612f;
        }
        int i15 = i14 / this.f7609c;
        while (i15 >= this.f7610d.size()) {
            byte[] bArr = new byte[this.f7609c];
            int i16 = 0;
            while (!this.f7611e && i16 != (i13 = this.f7609c)) {
                int read = this.f7608b.read(bArr, i16, i13 - i16);
                if (read == -1) {
                    this.f7611e = true;
                    int size = (this.f7610d.size() * this.f7609c) + i16;
                    long j12 = this.f7612f;
                    if (j12 == -1) {
                        this.f7612f = size;
                    } else {
                        int i17 = (j12 > size ? 1 : (j12 == size ? 0 : -1));
                    }
                    if (i14 >= this.f7612f) {
                        this.f7610d.add(bArr);
                        return false;
                    }
                } else {
                    i16 += read;
                }
            }
            this.f7610d.add(bArr);
        }
        return true;
    }

    public j(InputStream inputStream, int i11, long j11) {
        this.f7610d = new ArrayList<>();
        Objects.requireNonNull(inputStream);
        if (i11 > 0) {
            this.f7609c = i11;
            this.f7608b = inputStream;
            this.f7612f = j11;
            return;
        }
        throw new IllegalArgumentException("chunkLength must be greater than zero");
    }
}