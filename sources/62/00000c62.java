package bc;

import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7615b;

    /* renamed from: c  reason: collision with root package name */
    private int f7616c;

    public l(byte[] bArr) {
        this(bArr, 0);
    }

    @Override // bc.m
    public int a() {
        return this.f7615b.length - this.f7616c;
    }

    @Override // bc.m
    public byte b() {
        int i11 = this.f7616c;
        byte[] bArr = this.f7615b;
        if (i11 < bArr.length) {
            this.f7616c = i11 + 1;
            return bArr[i11];
        }
        throw new EOFException("End of data reached.");
    }

    @Override // bc.m
    public void c(byte[] bArr, int i11, int i12) {
        int i13 = this.f7616c;
        int i14 = i13 + i12;
        byte[] bArr2 = this.f7615b;
        if (i14 <= bArr2.length) {
            System.arraycopy(bArr2, i13, bArr, i11, i12);
            this.f7616c += i12;
            return;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // bc.m
    public byte[] d(int i11) {
        int i12 = this.f7616c;
        int i13 = i12 + i11;
        byte[] bArr = this.f7615b;
        if (i13 <= bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i12, bArr2, 0, i11);
            this.f7616c += i11;
            return bArr2;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // bc.m
    public long l() {
        return this.f7616c;
    }

    @Override // bc.m
    public void t(long j11) {
        if (j11 >= 0) {
            int i11 = this.f7616c;
            if (i11 + j11 <= this.f7615b.length) {
                this.f7616c = (int) (i11 + j11);
                return;
            }
            throw new EOFException("End of data reached.");
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // bc.m
    public boolean u(long j11) {
        if (j11 >= 0) {
            int i11 = (int) (this.f7616c + j11);
            this.f7616c = i11;
            byte[] bArr = this.f7615b;
            if (i11 > bArr.length) {
                this.f7616c = bArr.length;
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    public l(byte[] bArr, int i11) {
        Objects.requireNonNull(bArr);
        this.f7615b = bArr;
        this.f7616c = i11;
    }
}