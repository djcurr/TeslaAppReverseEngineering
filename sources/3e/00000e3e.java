package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum v3 implements com.squareup.wire.p {
    VEHICLE_SLEEP_STATUS_UNKNOWN(0),
    VEHICLE_SLEEP_STATUS_AWAKE(1),
    VEHICLE_SLEEP_STATUS_ASLEEP(2);
    
    public static final ProtoAdapter<v3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v3 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return v3.VEHICLE_SLEEP_STATUS_ASLEEP;
                }
                return v3.VEHICLE_SLEEP_STATUS_AWAKE;
            }
            return v3.VEHICLE_SLEEP_STATUS_UNKNOWN;
        }
    }

    static {
        v3 v3Var;
        ADAPTER = new com.squareup.wire.a<v3>(kotlin.jvm.internal.m0.b(v3.class), com.squareup.wire.o.PROTO_3, v3Var) { // from class: bu.v3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public v3 d(int i11) {
                return v3.Companion.a(i11);
            }
        };
    }

    v3(int i11) {
        this.value = i11;
    }

    public static final v3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}