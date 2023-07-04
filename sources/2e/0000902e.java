package ol;

import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes3.dex */
public enum z implements a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final a0.d<z> internalValueMap = new a0.d<z>() { // from class: ol.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* renamed from: a */
        public z findValueByNumber(int i11) {
            return z.forNumber(i11);
        }
    };
    private final int value;

    /* loaded from: classes3.dex */
    private static final class b implements a0.e {

        /* renamed from: a  reason: collision with root package name */
        static final a0.e f42746a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a0.e
        public boolean isInRange(int i11) {
            return z.forNumber(i11) != null;
        }
    }

    z(int i11) {
        this.value = i11;
    }

    public static z forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    public static a0.d<z> internalGetValueMap() {
        return internalValueMap;
    }

    public static a0.e internalGetVerifier() {
        return b.f42746a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z valueOf(int i11) {
        return forNumber(i11);
    }
}