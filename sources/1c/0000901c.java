package ol;

import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes3.dex */
public enum u implements a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final a0.d<u> internalValueMap = new a0.d<u>() { // from class: ol.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* renamed from: a */
        public u findValueByNumber(int i11) {
            return u.forNumber(i11);
        }
    };
    private final int value;

    /* loaded from: classes3.dex */
    private static final class b implements a0.e {

        /* renamed from: a  reason: collision with root package name */
        static final a0.e f42740a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a0.e
        public boolean isInRange(int i11) {
            return u.forNumber(i11) != null;
        }
    }

    u(int i11) {
        this.value = i11;
    }

    public static u forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    public static a0.d<u> internalGetValueMap() {
        return internalValueMap;
    }

    public static a0.e internalGetVerifier() {
        return b.f42740a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u valueOf(int i11) {
        return forNumber(i11);
    }
}