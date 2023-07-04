package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum u3 implements com.squareup.wire.p {
    VEHICLELOCKSTATE_UNLOCKED(0),
    VEHICLELOCKSTATE_LOCKED(1),
    VEHICLELOCKSTATE_INTERNAL_LOCKED(2),
    VEHICLELOCKSTATE_SELECTIVE_UNLOCKED(3);
    
    public static final ProtoAdapter<u3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u3 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return u3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED;
                    }
                    return u3.VEHICLELOCKSTATE_INTERNAL_LOCKED;
                }
                return u3.VEHICLELOCKSTATE_LOCKED;
            }
            return u3.VEHICLELOCKSTATE_UNLOCKED;
        }
    }

    static {
        u3 u3Var;
        ADAPTER = new com.squareup.wire.a<u3>(kotlin.jvm.internal.m0.b(u3.class), com.squareup.wire.o.PROTO_3, u3Var) { // from class: bu.u3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public u3 d(int i11) {
                return u3.Companion.a(i11);
            }
        };
    }

    u3(int i11) {
        this.value = i11;
    }

    public static final u3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}