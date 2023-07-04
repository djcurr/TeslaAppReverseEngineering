package a0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class d {

    /* renamed from: d  reason: collision with root package name */
    static final Charset f57d = StandardCharsets.US_ASCII;

    /* renamed from: e  reason: collision with root package name */
    static final String[] f58e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f59f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a  reason: collision with root package name */
    public final int f60a;

    /* renamed from: b  reason: collision with root package name */
    public final int f61b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f62c;

    d(int i11, int i12, byte[] bArr) {
        this(i11, i12, -1L, bArr);
    }

    public static d a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f57d);
        return new d(1, bytes.length, bytes);
    }

    public static d b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d11 : dArr) {
            wrap.putDouble(d11);
        }
        return new d(12, dArr.length, wrap.array());
    }

    public static d c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i11 : iArr) {
            wrap.putInt(i11);
        }
        return new d(9, iArr.length, wrap.array());
    }

    public static d d(h[] hVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[10] * hVarArr.length]);
        wrap.order(byteOrder);
        for (h hVar : hVarArr) {
            wrap.putInt((int) hVar.b());
            wrap.putInt((int) hVar.a());
        }
        return new d(10, hVarArr.length, wrap.array());
    }

    public static d e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f57d);
        return new d(2, bytes.length, bytes);
    }

    public static d f(long j11, ByteOrder byteOrder) {
        return g(new long[]{j11}, byteOrder);
    }

    public static d g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j11 : jArr) {
            wrap.putInt((int) j11);
        }
        return new d(4, jArr.length, wrap.array());
    }

    public static d h(h[] hVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[5] * hVarArr.length]);
        wrap.order(byteOrder);
        for (h hVar : hVarArr) {
            wrap.putInt((int) hVar.b());
            wrap.putInt((int) hVar.a());
        }
        return new d(5, hVarArr.length, wrap.array());
    }

    public static d i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f59f[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i11 : iArr) {
            wrap.putShort((short) i11);
        }
        return new d(3, iArr.length, wrap.array());
    }

    public int j() {
        return f59f[this.f60a] * this.f61b;
    }

    public String toString() {
        return "(" + f58e[this.f60a] + ", data length:" + this.f62c.length + ")";
    }

    d(int i11, int i12, long j11, byte[] bArr) {
        this.f60a = i11;
        this.f61b = i12;
        this.f62c = bArr;
    }
}