package okio;

/* loaded from: classes5.dex */
public final class c {
    public static final boolean a(byte[] a11, int i11, byte[] b11, int i12, int i13) {
        kotlin.jvm.internal.s.g(a11, "a");
        kotlin.jvm.internal.s.g(b11, "b");
        for (int i14 = 0; i14 < i13; i14++) {
            if (a11[i14 + i11] != b11[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException("size=" + j11 + " offset=" + j12 + " byteCount=" + j13);
        }
    }

    public static final int c(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    public static final long d(long j11) {
        return ((j11 & 255) << 56) | (((-72057594037927936L) & j11) >>> 56) | ((71776119061217280L & j11) >>> 40) | ((280375465082880L & j11) >>> 24) | ((1095216660480L & j11) >>> 8) | ((4278190080L & j11) << 8) | ((16711680 & j11) << 24) | ((65280 & j11) << 40);
    }

    public static final short e(short s11) {
        int i11 = s11 & 65535;
        return (short) (((i11 & 255) << 8) | ((65280 & i11) >>> 8));
    }

    public static final String f(byte b11) {
        return new String(new char[]{q30.b.f()[(b11 >> 4) & 15], q30.b.f()[b11 & 15]});
    }

    public static final String g(int i11) {
        if (i11 == 0) {
            return "0";
        }
        int i12 = 0;
        char[] cArr = {q30.b.f()[(i11 >> 28) & 15], q30.b.f()[(i11 >> 24) & 15], q30.b.f()[(i11 >> 20) & 15], q30.b.f()[(i11 >> 16) & 15], q30.b.f()[(i11 >> 12) & 15], q30.b.f()[(i11 >> 8) & 15], q30.b.f()[(i11 >> 4) & 15], q30.b.f()[i11 & 15]};
        while (i12 < 8 && cArr[i12] == '0') {
            i12++;
        }
        return new String(cArr, i12, 8 - i12);
    }
}