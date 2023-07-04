package ol;

import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes3.dex */
public enum i0 implements a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final a0.d<i0> internalValueMap = new a0.d<i0>() { // from class: ol.i0.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* renamed from: a */
        public i0 findValueByNumber(int i11) {
            return i0.forNumber(i11);
        }
    };
    private final int value;

    /* loaded from: classes3.dex */
    private static final class b implements a0.e {

        /* renamed from: a  reason: collision with root package name */
        static final a0.e f42725a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a0.e
        public boolean isInRange(int i11) {
            return i0.forNumber(i11) != null;
        }
    }

    i0(int i11) {
        this.value = i11;
    }

    public static i0 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public static a0.d<i0> internalGetValueMap() {
        return internalValueMap;
    }

    public static a0.e internalGetVerifier() {
        return b.f42725a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i0 valueOf(int i11) {
        return forNumber(i11);
    }
}