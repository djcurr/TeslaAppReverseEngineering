package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum g2 implements com.squareup.wire.p {
    RKE_ACTION_UNLOCK(0),
    RKE_ACTION_LOCK(1),
    RKE_ACTION_OPEN_TRUNK(2),
    RKE_ACTION_OPEN_FRUNK(3),
    RKE_ACTION_OPEN_CHARGE_PORT(4),
    RKE_ACTION_CLOSE_CHARGE_PORT(5),
    RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE(6),
    RKE_ACTION_SINGLE_PRESS_TOP(7),
    RKE_ACTION_DOUBLE_PRESS_TOP(8),
    RKE_ACTION_TRIPLE_PRESS_TOP(9),
    RKE_ACTION_HOLD_TOP(10),
    RKE_ACTION_SINGLE_PRESS_BACK(11),
    RKE_ACTION_DOUBLE_PRESS_BACK(12),
    RKE_ACTION_TRIPLE_PRESS_BACK(13),
    RKE_ACTION_HOLD_BACK(14),
    RKE_ACTION_SINGLE_PRESS_FRONT(15),
    RKE_ACTION_DOUBLE_PRESS_FRONT(16),
    RKE_ACTION_TRIPLE_PRESS_FRONT(17),
    RKE_ACTION_HOLD_FRONT(18),
    RKE_ACTION_UNKNOWN(19),
    RKE_ACTION_REMOTE_DRIVE(20),
    RKE_ACTION_SINGLE_PRESS_LEFT(21),
    RKE_ACTION_DOUBLE_PRESS_LEFT(22),
    RKE_ACTION_TRIPLE_PRESS_LEFT(23),
    RKE_ACTION_HOLD_LEFT(24),
    RKE_ACTION_SINGLE_PRESS_RIGHT(25),
    RKE_ACTION_DOUBLE_PRESS_RIGHT(26),
    RKE_ACTION_TRIPLE_PRESS_RIGHT(27),
    RKE_ACTION_HOLD_RIGHT(28),
    RKE_ACTION_AUTO_SECURE_VEHICLE(29),
    RKE_ACTION_WAKE_VEHICLE(30);
    
    public static final ProtoAdapter<g2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g2 a(int i11) {
            switch (i11) {
                case 0:
                    return g2.RKE_ACTION_UNLOCK;
                case 1:
                    return g2.RKE_ACTION_LOCK;
                case 2:
                    return g2.RKE_ACTION_OPEN_TRUNK;
                case 3:
                    return g2.RKE_ACTION_OPEN_FRUNK;
                case 4:
                    return g2.RKE_ACTION_OPEN_CHARGE_PORT;
                case 5:
                    return g2.RKE_ACTION_CLOSE_CHARGE_PORT;
                case 6:
                    return g2.RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE;
                case 7:
                    return g2.RKE_ACTION_SINGLE_PRESS_TOP;
                case 8:
                    return g2.RKE_ACTION_DOUBLE_PRESS_TOP;
                case 9:
                    return g2.RKE_ACTION_TRIPLE_PRESS_TOP;
                case 10:
                    return g2.RKE_ACTION_HOLD_TOP;
                case 11:
                    return g2.RKE_ACTION_SINGLE_PRESS_BACK;
                case 12:
                    return g2.RKE_ACTION_DOUBLE_PRESS_BACK;
                case 13:
                    return g2.RKE_ACTION_TRIPLE_PRESS_BACK;
                case 14:
                    return g2.RKE_ACTION_HOLD_BACK;
                case 15:
                    return g2.RKE_ACTION_SINGLE_PRESS_FRONT;
                case 16:
                    return g2.RKE_ACTION_DOUBLE_PRESS_FRONT;
                case 17:
                    return g2.RKE_ACTION_TRIPLE_PRESS_FRONT;
                case 18:
                    return g2.RKE_ACTION_HOLD_FRONT;
                case 19:
                    return g2.RKE_ACTION_UNKNOWN;
                case 20:
                    return g2.RKE_ACTION_REMOTE_DRIVE;
                case 21:
                    return g2.RKE_ACTION_SINGLE_PRESS_LEFT;
                case 22:
                    return g2.RKE_ACTION_DOUBLE_PRESS_LEFT;
                case 23:
                    return g2.RKE_ACTION_TRIPLE_PRESS_LEFT;
                case 24:
                    return g2.RKE_ACTION_HOLD_LEFT;
                case 25:
                    return g2.RKE_ACTION_SINGLE_PRESS_RIGHT;
                case 26:
                    return g2.RKE_ACTION_DOUBLE_PRESS_RIGHT;
                case 27:
                    return g2.RKE_ACTION_TRIPLE_PRESS_RIGHT;
                case 28:
                    return g2.RKE_ACTION_HOLD_RIGHT;
                case 29:
                    return g2.RKE_ACTION_AUTO_SECURE_VEHICLE;
                case 30:
                    return g2.RKE_ACTION_WAKE_VEHICLE;
                default:
                    return null;
            }
        }
    }

    static {
        g2 g2Var;
        ADAPTER = new com.squareup.wire.a<g2>(kotlin.jvm.internal.m0.b(g2.class), com.squareup.wire.o.PROTO_3, g2Var) { // from class: bu.g2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g2 d(int i11) {
                return g2.Companion.a(i11);
            }
        };
    }

    g2(int i11) {
        this.value = i11;
    }

    public static final g2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}