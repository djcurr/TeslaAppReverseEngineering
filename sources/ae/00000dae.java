package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum m0 implements com.squareup.wire.p {
    DEVICE_MOTION_CONFIDENCE_UNKNOWN(0),
    DEVICE_MOTION_CONFIDENCE_LOW(1),
    DEVICE_MOTION_CONFIDENCE_MEDIUM(2),
    DEVICE_MOTION_CONFIDENCE_HIGH(3);
    
    public static final ProtoAdapter<m0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return m0.DEVICE_MOTION_CONFIDENCE_HIGH;
                    }
                    return m0.DEVICE_MOTION_CONFIDENCE_MEDIUM;
                }
                return m0.DEVICE_MOTION_CONFIDENCE_LOW;
            }
            return m0.DEVICE_MOTION_CONFIDENCE_UNKNOWN;
        }
    }

    static {
        m0 m0Var;
        ADAPTER = new com.squareup.wire.a<m0>(kotlin.jvm.internal.m0.b(m0.class), com.squareup.wire.o.PROTO_3, m0Var) { // from class: bu.m0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public m0 d(int i11) {
                return m0.Companion.a(i11);
            }
        };
    }

    m0(int i11) {
        this.value = i11;
    }

    public static final m0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}