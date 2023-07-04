package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum z0 implements com.squareup.wire.p {
    IMU_REQUEST_NONE(0),
    IMU_REQUEST_GET_SLEEP_STATE(1),
    IMU_REQUEST_ENABLE_CONTINUOUS_ACTIVITY_UPDATE(2),
    IMU_REQUEST_DISABLE_CONTINUOUS_ACTIVITY_UPDATE(3);
    
    public static final ProtoAdapter<z0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return z0.IMU_REQUEST_DISABLE_CONTINUOUS_ACTIVITY_UPDATE;
                    }
                    return z0.IMU_REQUEST_ENABLE_CONTINUOUS_ACTIVITY_UPDATE;
                }
                return z0.IMU_REQUEST_GET_SLEEP_STATE;
            }
            return z0.IMU_REQUEST_NONE;
        }
    }

    static {
        z0 z0Var;
        ADAPTER = new com.squareup.wire.a<z0>(kotlin.jvm.internal.m0.b(z0.class), com.squareup.wire.o.PROTO_3, z0Var) { // from class: bu.z0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public z0 d(int i11) {
                return z0.Companion.a(i11);
            }
        };
    }

    z0(int i11) {
        this.value = i11;
    }

    public static final z0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}