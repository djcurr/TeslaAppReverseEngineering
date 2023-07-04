package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum u1 implements com.squareup.wire.p {
    NFCSE_REQUEST_NONE(0),
    NFCSE_REQUEST_REFETCH_SESSION_INFO(1),
    NFCSE_REQUEST_DISABLE_INSECURE_COMMANDS(2),
    NFCSE_REQUEST_GET_CURRENT_STATE(3);
    
    public static final ProtoAdapter<u1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return u1.NFCSE_REQUEST_GET_CURRENT_STATE;
                    }
                    return u1.NFCSE_REQUEST_DISABLE_INSECURE_COMMANDS;
                }
                return u1.NFCSE_REQUEST_REFETCH_SESSION_INFO;
            }
            return u1.NFCSE_REQUEST_NONE;
        }
    }

    static {
        u1 u1Var;
        ADAPTER = new com.squareup.wire.a<u1>(kotlin.jvm.internal.m0.b(u1.class), com.squareup.wire.o.PROTO_3, u1Var) { // from class: bu.u1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public u1 d(int i11) {
                return u1.Companion.a(i11);
            }
        };
    }

    u1(int i11) {
        this.value = i11;
    }

    public static final u1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}