package q30;

import kotlin.jvm.internal.s;
import okio.f;
import okio.u;
import okio.z;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a */
    private static final byte[] f47365a = okio.b.a("0123456789abcdef");

    public static final f.a a(f commonReadAndWriteUnsafe, f.a unsafeCursor) {
        s.g(commonReadAndWriteUnsafe, "$this$commonReadAndWriteUnsafe");
        s.g(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.f42647a == null) {
            unsafeCursor.f42647a = commonReadAndWriteUnsafe;
            unsafeCursor.f42648b = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte[] b() {
        return f47365a;
    }

    public static final boolean c(z segment, int i11, byte[] bytes, int i12, int i13) {
        s.g(segment, "segment");
        s.g(bytes, "bytes");
        int i14 = segment.f42703c;
        byte[] bArr = segment.f42701a;
        while (i12 < i13) {
            if (i11 == i14) {
                segment = segment.f42706f;
                s.e(segment);
                byte[] bArr2 = segment.f42701a;
                bArr = bArr2;
                i11 = segment.f42702b;
                i14 = segment.f42703c;
            }
            if (bArr[i11] != bytes[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final String d(f readUtf8Line, long j11) {
        s.g(readUtf8Line, "$this$readUtf8Line");
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (readUtf8Line.J(j12) == ((byte) 13)) {
                String w02 = readUtf8Line.w0(j12);
                readUtf8Line.skip(2L);
                return w02;
            }
        }
        String w03 = readUtf8Line.w0(j11);
        readUtf8Line.skip(1L);
        return w03;
    }

    public static final int e(f selectPrefix, u options, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        z zVar;
        s.g(selectPrefix, "$this$selectPrefix");
        s.g(options, "options");
        z zVar2 = selectPrefix.f42645a;
        if (zVar2 == null) {
            return z11 ? -2 : -1;
        }
        byte[] bArr = zVar2.f42701a;
        int i15 = zVar2.f42702b;
        int i16 = zVar2.f42703c;
        int[] h11 = options.h();
        z zVar3 = zVar2;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = h11[i18];
            int i22 = i19 + 1;
            int i23 = h11[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (zVar3 == null) {
                break;
            }
            if (i21 >= 0) {
                i11 = i15 + 1;
                int i24 = bArr[i15] & 255;
                int i25 = i22 + i21;
                while (i22 != i25) {
                    if (i24 == h11[i22]) {
                        i12 = h11[i22 + i21];
                        if (i11 == i16) {
                            zVar3 = zVar3.f42706f;
                            s.e(zVar3);
                            i11 = zVar3.f42702b;
                            bArr = zVar3.f42701a;
                            i16 = zVar3.f42703c;
                            if (zVar3 == zVar2) {
                                zVar3 = null;
                            }
                        }
                    } else {
                        i22++;
                    }
                }
                return i17;
            }
            int i26 = i22 + (i21 * (-1));
            while (true) {
                int i27 = i15 + 1;
                int i28 = i22 + 1;
                if ((bArr[i15] & 255) != h11[i22]) {
                    return i17;
                }
                boolean z12 = i28 == i26;
                if (i27 == i16) {
                    s.e(zVar3);
                    z zVar4 = zVar3.f42706f;
                    s.e(zVar4);
                    i14 = zVar4.f42702b;
                    byte[] bArr2 = zVar4.f42701a;
                    i13 = zVar4.f42703c;
                    if (zVar4 != zVar2) {
                        zVar = zVar4;
                        bArr = bArr2;
                    } else if (!z12) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        zVar = null;
                    }
                } else {
                    z zVar5 = zVar3;
                    i13 = i16;
                    i14 = i27;
                    zVar = zVar5;
                }
                if (z12) {
                    i12 = h11[i28];
                    i11 = i14;
                    i16 = i13;
                    zVar3 = zVar;
                    break;
                }
                i15 = i14;
                i16 = i13;
                i22 = i28;
                zVar3 = zVar;
            }
            if (i12 >= 0) {
                return i12;
            }
            i18 = -i12;
            i15 = i11;
        }
        if (z11) {
            return -2;
        }
        return i17;
    }

    public static /* synthetic */ int f(f fVar, u uVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return e(fVar, uVar, z11);
    }
}