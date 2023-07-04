package bc;

import com.drew.lang.BufferBoundsException;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f7590b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7591c;

    public a(byte[] bArr) {
        this(bArr, 0);
    }

    @Override // bc.i
    public byte b(int i11) {
        x(i11, 1);
        return this.f7590b[i11 + this.f7591c];
    }

    @Override // bc.i
    public byte[] c(int i11, int i12) {
        x(i11, i12);
        byte[] bArr = new byte[i12];
        System.arraycopy(this.f7590b, i11 + this.f7591c, bArr, 0, i12);
        return bArr;
    }

    @Override // bc.i
    public long k() {
        return this.f7590b.length - this.f7591c;
    }

    @Override // bc.i
    protected void x(int i11, int i12) {
        if (!y(i11, i12)) {
            throw new BufferBoundsException(z(i11), i12, this.f7590b.length);
        }
    }

    protected boolean y(int i11, int i12) {
        return i12 >= 0 && i11 >= 0 && (((long) i11) + ((long) i12)) - 1 < k();
    }

    public int z(int i11) {
        return i11 + this.f7591c;
    }

    public a(byte[] bArr, int i11) {
        Objects.requireNonNull(bArr);
        if (i11 >= 0) {
            this.f7590b = bArr;
            this.f7591c = i11;
            return;
        }
        throw new IllegalArgumentException("Must be zero or greater");
    }
}