package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum n0 implements com.squareup.wire.p {
    DEVICE_MOTION_UNKNOWN(0),
    DEVICE_MOTION_STATIONARY(1),
    DEVICE_MOTION_WALKING(2),
    DEVICE_MOTION_RUNNING(3),
    DEVICE_MOTION_AUTOMOTIVE(4),
    DEVICE_MOTION_CYCLING(5);
    
    public static final ProtoAdapter<n0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    return null;
                                }
                                return n0.DEVICE_MOTION_CYCLING;
                            }
                            return n0.DEVICE_MOTION_AUTOMOTIVE;
                        }
                        return n0.DEVICE_MOTION_RUNNING;
                    }
                    return n0.DEVICE_MOTION_WALKING;
                }
                return n0.DEVICE_MOTION_STATIONARY;
            }
            return n0.DEVICE_MOTION_UNKNOWN;
        }
    }

    static {
        n0 n0Var;
        ADAPTER = new com.squareup.wire.a<n0>(kotlin.jvm.internal.m0.b(n0.class), com.squareup.wire.o.PROTO_3, n0Var) { // from class: bu.n0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public n0 d(int i11) {
                return n0.Companion.a(i11);
            }
        };
    }

    n0(int i11) {
        this.value = i11;
    }

    public static final n0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}