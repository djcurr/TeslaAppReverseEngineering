package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum y0 implements com.squareup.wire.p {
    HANDLE_PULLED_FRONT_DRIVER_DOOR(0),
    HANDLE_PULLED_FRONT_PASSENGER_DOOR(1),
    HANDLE_PULLED_REAR_DRIVER_DOOR(2),
    HANDLE_PULLED_REAR_PASSENGER_DOOR(3),
    HANDLE_PULLED_TRUNK(4),
    HANDLE_PULLED_CHARGE_PORT(5),
    HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR(6),
    HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR(7),
    HANDLE_PULLED_OTHER(8);
    
    public static final ProtoAdapter<y0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y0 a(int i11) {
            switch (i11) {
                case 0:
                    return y0.HANDLE_PULLED_FRONT_DRIVER_DOOR;
                case 1:
                    return y0.HANDLE_PULLED_FRONT_PASSENGER_DOOR;
                case 2:
                    return y0.HANDLE_PULLED_REAR_DRIVER_DOOR;
                case 3:
                    return y0.HANDLE_PULLED_REAR_PASSENGER_DOOR;
                case 4:
                    return y0.HANDLE_PULLED_TRUNK;
                case 5:
                    return y0.HANDLE_PULLED_CHARGE_PORT;
                case 6:
                    return y0.HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR;
                case 7:
                    return y0.HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR;
                case 8:
                    return y0.HANDLE_PULLED_OTHER;
                default:
                    return null;
            }
        }
    }

    static {
        y0 y0Var;
        ADAPTER = new com.squareup.wire.a<y0>(kotlin.jvm.internal.m0.b(y0.class), com.squareup.wire.o.PROTO_3, y0Var) { // from class: bu.y0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public y0 d(int i11) {
                return y0.Companion.a(i11);
            }
        };
    }

    y0(int i11) {
        this.value = i11;
    }

    public static final y0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}