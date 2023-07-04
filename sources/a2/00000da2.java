package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum l1 implements com.squareup.wire.p {
    ERROR_UNKNOWN(0),
    ERROR_SESSION_LIMIT_EXCEEDED(1),
    ERROR_INVALID_CONFIGURATION(2),
    ERROR_RESOURCE_USAGE_TIMEOUT(3),
    ERROR_SESSION_FAILED(4),
    ERROR_UNSUPPORTED_PLATFORM(5),
    ERROR_USER_DID_NOT_ALLOW(6),
    ERROR_BLE_PEER_UNAVAILABLE(7);
    
    public static final ProtoAdapter<l1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1 a(int i11) {
            switch (i11) {
                case 0:
                    return l1.ERROR_UNKNOWN;
                case 1:
                    return l1.ERROR_SESSION_LIMIT_EXCEEDED;
                case 2:
                    return l1.ERROR_INVALID_CONFIGURATION;
                case 3:
                    return l1.ERROR_RESOURCE_USAGE_TIMEOUT;
                case 4:
                    return l1.ERROR_SESSION_FAILED;
                case 5:
                    return l1.ERROR_UNSUPPORTED_PLATFORM;
                case 6:
                    return l1.ERROR_USER_DID_NOT_ALLOW;
                case 7:
                    return l1.ERROR_BLE_PEER_UNAVAILABLE;
                default:
                    return null;
            }
        }
    }

    static {
        l1 l1Var;
        ADAPTER = new com.squareup.wire.a<l1>(kotlin.jvm.internal.m0.b(l1.class), com.squareup.wire.o.PROTO_3, l1Var) { // from class: bu.l1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public l1 d(int i11) {
                return l1.Companion.a(i11);
            }
        };
    }

    l1(int i11) {
        this.value = i11;
    }

    public static final l1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}