package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum t1 implements com.squareup.wire.p {
    NFCSEC_INSECURE_COMMAND_STATE_NONE(0),
    NFCSEC_INSECURE_COMMAND_STATE_ENABLED(1),
    NFCSEC_INSECURE_COMMAND_STATE_DISABLED(2);
    
    public static final ProtoAdapter<t1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return t1.NFCSEC_INSECURE_COMMAND_STATE_DISABLED;
                }
                return t1.NFCSEC_INSECURE_COMMAND_STATE_ENABLED;
            }
            return t1.NFCSEC_INSECURE_COMMAND_STATE_NONE;
        }
    }

    static {
        t1 t1Var;
        ADAPTER = new com.squareup.wire.a<t1>(kotlin.jvm.internal.m0.b(t1.class), com.squareup.wire.o.PROTO_3, t1Var) { // from class: bu.t1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public t1 d(int i11) {
                return t1.Companion.a(i11);
            }
        };
    }

    t1(int i11) {
        this.value = i11;
    }

    public static final t1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}