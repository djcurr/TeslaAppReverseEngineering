package okio;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class b0 extends i {

    /* renamed from: f  reason: collision with root package name */
    private final transient byte[][] f42638f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int[] f42639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(byte[][] segments, int[] directory) {
        super(i.f42656d.h());
        kotlin.jvm.internal.s.g(segments, "segments");
        kotlin.jvm.internal.s.g(directory, "directory");
        this.f42638f = segments;
        this.f42639g = directory;
    }

    private final i J() {
        return new i(E());
    }

    @Override // okio.i
    public String B(Charset charset) {
        kotlin.jvm.internal.s.g(charset, "charset");
        return J().B(charset);
    }

    @Override // okio.i
    public i D() {
        return J().D();
    }

    @Override // okio.i
    public byte[] E() {
        byte[] bArr = new byte[z()];
        int length = I().length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = H()[length + i11];
            int i15 = H()[i11];
            int i16 = i15 - i12;
            wz.o.f(I()[i11], bArr, i13, i14, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    @Override // okio.i
    public void G(f buffer, int i11, int i12) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        int i13 = i11 + i12;
        int b11 = q30.c.b(this, i11);
        while (i11 < i13) {
            int i14 = b11 == 0 ? 0 : H()[b11 - 1];
            int i15 = H()[I().length + b11];
            int min = Math.min(i13, (H()[b11] - i14) + i14) - i11;
            int i16 = i15 + (i11 - i14);
            z zVar = new z(I()[b11], i16, i16 + min, true, false);
            z zVar2 = buffer.f42645a;
            if (zVar2 == null) {
                zVar.f42707g = zVar;
                zVar.f42706f = zVar;
                buffer.f42645a = zVar;
            } else {
                kotlin.jvm.internal.s.e(zVar2);
                z zVar3 = zVar2.f42707g;
                kotlin.jvm.internal.s.e(zVar3);
                zVar3.c(zVar);
            }
            i11 += min;
            b11++;
        }
        buffer.J0(buffer.P0() + i12);
    }

    public final int[] H() {
        return this.f42639g;
    }

    public final byte[][] I() {
        return this.f42638f;
    }

    @Override // okio.i
    public String a() {
        return J().a();
    }

    @Override // okio.i
    public i e(String algorithm) {
        kotlin.jvm.internal.s.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = I().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = H()[length + i11];
            int i14 = H()[i11];
            messageDigest.update(I()[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.s.f(digestBytes, "digestBytes");
        return new i(digestBytes);
    }

    @Override // okio.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.z() == z() && t(0, iVar, 0, z())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.i
    public int hashCode() {
        int i11 = i();
        if (i11 != 0) {
            return i11;
        }
        int length = I().length;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i12 < length) {
            int i15 = H()[length + i12];
            int i16 = H()[i12];
            byte[] bArr = I()[i12];
            int i17 = (i16 - i14) + i15;
            while (i15 < i17) {
                i13 = (i13 * 31) + bArr[i15];
                i15++;
            }
            i12++;
            i14 = i16;
        }
        v(i13);
        return i13;
    }

    @Override // okio.i
    public int k() {
        return H()[I().length - 1];
    }

    @Override // okio.i
    public String n() {
        return J().n();
    }

    @Override // okio.i
    public byte[] o() {
        return E();
    }

    @Override // okio.i
    public byte q(int i11) {
        c.b(H()[I().length - 1], i11, 1L);
        int b11 = q30.c.b(this, i11);
        return I()[b11][(i11 - (b11 == 0 ? 0 : H()[b11 - 1])) + H()[I().length + b11]];
    }

    @Override // okio.i
    public boolean t(int i11, i other, int i12, int i13) {
        kotlin.jvm.internal.s.g(other, "other");
        if (i11 < 0 || i11 > z() - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int b11 = q30.c.b(this, i11);
        while (i11 < i14) {
            int i15 = b11 == 0 ? 0 : H()[b11 - 1];
            int i16 = H()[I().length + b11];
            int min = Math.min(i14, (H()[b11] - i15) + i15) - i11;
            if (!other.u(i12, I()[b11], i16 + (i11 - i15), min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            b11++;
        }
        return true;
    }

    @Override // okio.i
    public String toString() {
        return J().toString();
    }

    @Override // okio.i
    public boolean u(int i11, byte[] other, int i12, int i13) {
        kotlin.jvm.internal.s.g(other, "other");
        if (i11 < 0 || i11 > z() - i13 || i12 < 0 || i12 > other.length - i13) {
            return false;
        }
        int i14 = i13 + i11;
        int b11 = q30.c.b(this, i11);
        while (i11 < i14) {
            int i15 = b11 == 0 ? 0 : H()[b11 - 1];
            int i16 = H()[I().length + b11];
            int min = Math.min(i14, (H()[b11] - i15) + i15) - i11;
            if (!c.a(I()[b11], i16 + (i11 - i15), other, i12, min)) {
                return false;
            }
            i12 += min;
            i11 += min;
            b11++;
        }
        return true;
    }
}