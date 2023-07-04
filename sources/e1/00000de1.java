package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum p2 implements com.squareup.wire.p {
    SIGNEDMESSAGE_INFORMATION_NONE(0),
    SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN(1),
    SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST(2),
    SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED(3),
    SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN(4),
    SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID(5),
    SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH(6),
    SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT(7),
    SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE(8),
    SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START(9),
    SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT(10),
    SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_RETRIEVE_KEY(11),
    SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_RETRIEVE_TOKEN(12),
    SIGNEDMESSAGE_INFORMATION_FAULT_SIGNATURE_TOO_SHORT(13),
    SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_IS_INCORRECT_LENGTH(14),
    SIGNEDMESSAGE_INFORMATION_FAULT_INCORRECT_EPOCH(15),
    SIGNEDMESSAGE_INFORMATION_FAULT_IV_INCORRECT_LENGTH(16),
    SIGNEDMESSAGE_INFORMATION_FAULT_TIME_EXPIRED(17),
    SIGNEDMESSAGE_INFORMATION_FAULT_NOT_PROVISIONED_WITH_IDENTITY(18),
    SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_HASH_METADATA(19);
    
    public static final ProtoAdapter<p2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p2 a(int i11) {
            switch (i11) {
                case 0:
                    return p2.SIGNEDMESSAGE_INFORMATION_NONE;
                case 1:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN;
                case 2:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST;
                case 3:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED;
                case 4:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN;
                case 5:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID;
                case 6:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH;
                case 7:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT;
                case 8:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE;
                case 9:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START;
                case 10:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT;
                case 11:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_RETRIEVE_KEY;
                case 12:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_RETRIEVE_TOKEN;
                case 13:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_SIGNATURE_TOO_SHORT;
                case 14:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_IS_INCORRECT_LENGTH;
                case 15:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_INCORRECT_EPOCH;
                case 16:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_IV_INCORRECT_LENGTH;
                case 17:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_TIME_EXPIRED;
                case 18:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_PROVISIONED_WITH_IDENTITY;
                case 19:
                    return p2.SIGNEDMESSAGE_INFORMATION_FAULT_COULD_NOT_HASH_METADATA;
                default:
                    return null;
            }
        }
    }

    static {
        p2 p2Var;
        ADAPTER = new com.squareup.wire.a<p2>(kotlin.jvm.internal.m0.b(p2.class), com.squareup.wire.o.PROTO_3, p2Var) { // from class: bu.p2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public p2 d(int i11) {
                return p2.Companion.a(i11);
            }
        };
    }

    p2(int i11) {
        this.value = i11;
    }

    public static final p2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}