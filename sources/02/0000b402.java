package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class e0 implements Comparable<e0> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51411a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final float f51412b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f11) {
            int i11;
            int i12;
            int floatToRawIntBits = Float.floatToRawIntBits(f11);
            int i13 = floatToRawIntBits >>> 31;
            int i14 = (floatToRawIntBits >>> 23) & 255;
            int i15 = floatToRawIntBits & 8388607;
            if (i14 == 255) {
                i11 = i15 != 0 ? 512 : 0;
                r3 = 31;
            } else {
                int i16 = (i14 - 127) + 15;
                if (i16 >= 31) {
                    r3 = 49;
                    i11 = 0;
                } else if (i16 > 0) {
                    int i17 = i15 >> 13;
                    if ((i15 & 4096) != 0) {
                        i12 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                        return (short) i12;
                    }
                    i11 = i17;
                    r3 = i16;
                } else if (i16 < -10) {
                    i11 = 0;
                } else {
                    int i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += PKIFailureInfo.certRevoked;
                    }
                    i11 = i18 >> 13;
                }
            }
            i12 = i11 | (i13 << 15) | (r3 << 10);
            return (short) i12;
        }
    }

    static {
        b((short) 5120);
        b((short) -1025);
        b((short) 31743);
        b((short) 1024);
        b((short) 1);
        b((short) 32256);
        b((short) -1024);
        b(Short.MIN_VALUE);
        b((short) 31744);
        b((short) 0);
        a(1.0f);
        a(-1.0f);
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        f51412b = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f11) {
        return b(f51411a.b(f11));
    }

    public static short b(short s11) {
        return s11;
    }

    public static final float c(short s11) {
        int i11;
        int i12;
        int i13 = s11 & 65535;
        int i14 = 32768 & i13;
        int i15 = (i13 >>> 10) & 31;
        int i16 = i13 & 1023;
        int i17 = 0;
        if (i15 != 0) {
            int i18 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i18 != 0) {
                    i18 |= 4194304;
                }
            } else {
                i11 = (i15 - 15) + 127;
            }
            int i19 = i18;
            i17 = i11;
            i12 = i19;
        } else if (i16 != 0) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            float intBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - f51412b;
            return i14 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i12 = 0;
        }
        int i21 = i12 | (i14 << 16) | (i17 << 23);
        kotlin.jvm.internal.l lVar2 = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat(i21);
    }
}