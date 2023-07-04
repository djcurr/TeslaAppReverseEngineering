package hl;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import ol.c0;
import ol.i0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    public static final byte[] f29310a = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29311a;

        static {
            int[] iArr = new int[i0.values().length];
            f29311a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29311a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29311a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29311a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        int i11 = a.f29311a[cVar.J().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.I()).array();
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return f29310a;
            }
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.I()).array();
    }
}