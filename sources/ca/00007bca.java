package ji;

import ak.k0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class e implements i {

    /* renamed from: b  reason: collision with root package name */
    private final zj.f f33722b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33723c;

    /* renamed from: d  reason: collision with root package name */
    private long f33724d;

    /* renamed from: f  reason: collision with root package name */
    private int f33726f;

    /* renamed from: g  reason: collision with root package name */
    private int f33727g;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f33725e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f33721a = new byte[4096];

    public e(zj.f fVar, long j11, long j12) {
        this.f33722b = fVar;
        this.f33724d = j11;
        this.f33723c = j12;
    }

    private void o(int i11) {
        if (i11 != -1) {
            this.f33724d += i11;
        }
    }

    private void p(int i11) {
        int i12 = this.f33726f + i11;
        byte[] bArr = this.f33725e;
        if (i12 > bArr.length) {
            this.f33725e = Arrays.copyOf(this.f33725e, k0.r(bArr.length * 2, 65536 + i12, i12 + PKIFailureInfo.signerNotTrusted));
        }
    }

    private int q(byte[] bArr, int i11, int i12) {
        int i13 = this.f33727g;
        if (i13 == 0) {
            return 0;
        }
        int min = Math.min(i13, i12);
        System.arraycopy(this.f33725e, 0, bArr, i11, min);
        u(min);
        return min;
    }

    private int r(byte[] bArr, int i11, int i12, int i13, boolean z11) {
        if (!Thread.interrupted()) {
            int read = this.f33722b.read(bArr, i11 + i13, i12 - i13);
            if (read == -1) {
                if (i13 == 0 && z11) {
                    return -1;
                }
                throw new EOFException();
            }
            return i13 + read;
        }
        throw new InterruptedIOException();
    }

    private int s(int i11) {
        int min = Math.min(this.f33727g, i11);
        u(min);
        return min;
    }

    private void u(int i11) {
        int i12 = this.f33727g - i11;
        this.f33727g = i12;
        this.f33726f = 0;
        byte[] bArr = this.f33725e;
        byte[] bArr2 = i12 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f33725e = bArr2;
    }

    @Override // ji.i
    public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
        if (l(i12, z11)) {
            System.arraycopy(this.f33725e, this.f33726f - i12, bArr, i11, i12);
            return true;
        }
        return false;
    }

    @Override // ji.i
    public void d() {
        this.f33726f = 0;
    }

    @Override // ji.i
    public boolean e(byte[] bArr, int i11, int i12, boolean z11) {
        int q11 = q(bArr, i11, i12);
        while (q11 < i12 && q11 != -1) {
            q11 = r(bArr, i11, i12, q11, z11);
        }
        o(q11);
        return q11 != -1;
    }

    @Override // ji.i
    public long f() {
        return this.f33724d + this.f33726f;
    }

    @Override // ji.i
    public void g(int i11) {
        l(i11, false);
    }

    @Override // ji.i
    public long getLength() {
        return this.f33723c;
    }

    @Override // ji.i
    public long getPosition() {
        return this.f33724d;
    }

    @Override // ji.i
    public int h(int i11) {
        int s11 = s(i11);
        if (s11 == 0) {
            byte[] bArr = this.f33721a;
            s11 = r(bArr, 0, Math.min(i11, bArr.length), 0, true);
        }
        o(s11);
        return s11;
    }

    @Override // ji.i
    public int j(byte[] bArr, int i11, int i12) {
        int min;
        p(i12);
        int i13 = this.f33727g;
        int i14 = this.f33726f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            min = r(this.f33725e, i14, i12, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f33727g += min;
        } else {
            min = Math.min(i12, i15);
        }
        System.arraycopy(this.f33725e, this.f33726f, bArr, i11, min);
        this.f33726f += min;
        return min;
    }

    @Override // ji.i
    public void k(int i11) {
        t(i11, false);
    }

    @Override // ji.i
    public boolean l(int i11, boolean z11) {
        p(i11);
        int i12 = this.f33727g - this.f33726f;
        while (i12 < i11) {
            i12 = r(this.f33725e, this.f33726f, i11, i12, z11);
            if (i12 == -1) {
                return false;
            }
            this.f33727g = this.f33726f + i12;
        }
        this.f33726f += i11;
        return true;
    }

    @Override // ji.i
    public void n(byte[] bArr, int i11, int i12) {
        a(bArr, i11, i12, false);
    }

    @Override // ji.i, zj.f
    public int read(byte[] bArr, int i11, int i12) {
        int q11 = q(bArr, i11, i12);
        if (q11 == 0) {
            q11 = r(bArr, i11, i12, 0, true);
        }
        o(q11);
        return q11;
    }

    @Override // ji.i
    public void readFully(byte[] bArr, int i11, int i12) {
        e(bArr, i11, i12, false);
    }

    public boolean t(int i11, boolean z11) {
        int s11 = s(i11);
        while (s11 < i11 && s11 != -1) {
            s11 = r(this.f33721a, -s11, Math.min(i11, this.f33721a.length + s11), s11, z11);
        }
        o(s11);
        return s11 != -1;
    }
}