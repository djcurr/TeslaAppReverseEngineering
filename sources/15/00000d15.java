package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum c1 implements com.squareup.wire.p {
    INFORMATION_REQUEST_TYPE_GET_STATUS(0),
    INFORMATION_REQUEST_TYPE_GET_TOKEN(1),
    INFORMATION_REQUEST_TYPE_GET_COUNTER(2),
    INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY(3),
    INFORMATION_REQUEST_TYPE_GET_SESSION_DATA(4),
    INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO(5),
    INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO(6),
    INFORMATION_REQUEST_TYPE_GET_VEHICLE_INFO(7),
    INFORMATION_REQUEST_TYPE_GET_KEYSTATUS_INFO(8),
    INFORMATION_REQUEST_TYPE_GET_ACTIVE_KEY(9),
    INFORMATION_REQUEST_TYPE_GET_CAPABILITIES(16);
    
    public static final ProtoAdapter<c1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c1 a(int i11) {
            if (i11 != 16) {
                switch (i11) {
                    case 0:
                        return c1.INFORMATION_REQUEST_TYPE_GET_STATUS;
                    case 1:
                        return c1.INFORMATION_REQUEST_TYPE_GET_TOKEN;
                    case 2:
                        return c1.INFORMATION_REQUEST_TYPE_GET_COUNTER;
                    case 3:
                        return c1.INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY;
                    case 4:
                        return c1.INFORMATION_REQUEST_TYPE_GET_SESSION_DATA;
                    case 5:
                        return c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO;
                    case 6:
                        return c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO;
                    case 7:
                        return c1.INFORMATION_REQUEST_TYPE_GET_VEHICLE_INFO;
                    case 8:
                        return c1.INFORMATION_REQUEST_TYPE_GET_KEYSTATUS_INFO;
                    case 9:
                        return c1.INFORMATION_REQUEST_TYPE_GET_ACTIVE_KEY;
                    default:
                        return null;
                }
            }
            return c1.INFORMATION_REQUEST_TYPE_GET_CAPABILITIES;
        }
    }

    static {
        c1 c1Var;
        ADAPTER = new com.squareup.wire.a<c1>(kotlin.jvm.internal.m0.b(c1.class), com.squareup.wire.o.PROTO_3, c1Var) { // from class: bu.c1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c1 d(int i11) {
                return c1.Companion.a(i11);
            }
        };
    }

    c1(int i11) {
        this.value = i11;
    }

    public static final c1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}