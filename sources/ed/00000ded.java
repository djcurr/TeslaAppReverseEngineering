package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum q1 implements com.squareup.wire.p {
    MLXWAKEPERIOD_2_MS(0),
    MLXWAKEPERIOD_3_MS(1),
    MLXWAKEPERIOD_5_MS(2),
    MLXWAKEPERIOD_15_MS(3),
    MLXWAKEPERIOD_30_MS(4),
    MLXWAKEPERIOD_50_MS(5),
    MLXWAKEPERIOD_100_MS(6),
    MLXWAKEPERIOD_150_MS(7),
    MLXWAKEPERIOD_250_MS(8),
    MLXWAKEPERIOD_500_MS(9),
    MLXWAKEPERIOD_1_S(10),
    MLXWAKEPERIOD_2_S(11),
    MLXWAKEPERIOD_2_5_S(12),
    MLXWAKEPERIOD_3_S(13),
    MLXWAKEPERIOD_4_S(14),
    MLXWAKEPERIOD_5_S(15),
    MLXWAKEPERIOD_6_S(16),
    MLXWAKEPERIOD_7_S(17),
    MLXWAKEPERIOD_8_S(18),
    MLXWAKEPERIOD_9_S(19),
    MLXWAKEPERIOD_10_S(20),
    MLXWAKEPERIOD_11_S(21),
    MLXWAKEPERIOD_12_S(22),
    MLXWAKEPERIOD_15_S(23),
    MLXWAKEPERIOD_20_S(24),
    MLXWAKEPERIOD_30_S(25),
    MLXWAKEPERIOD_1_M(26),
    MLXWAKEPERIOD_2_M(27),
    MLXWAKEPERIOD_3_M(28),
    MLXWAKEPERIOD_4_M(29),
    MLXWAKEPERIOD_5_M(30),
    MLXWAKEPERIOD_10_M(31),
    MLXWAKEPERIOD_16_M(32),
    MLXWAKEPERIOD_NOT_SET(33);
    
    public static final ProtoAdapter<q1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q1 a(int i11) {
            switch (i11) {
                case 0:
                    return q1.MLXWAKEPERIOD_2_MS;
                case 1:
                    return q1.MLXWAKEPERIOD_3_MS;
                case 2:
                    return q1.MLXWAKEPERIOD_5_MS;
                case 3:
                    return q1.MLXWAKEPERIOD_15_MS;
                case 4:
                    return q1.MLXWAKEPERIOD_30_MS;
                case 5:
                    return q1.MLXWAKEPERIOD_50_MS;
                case 6:
                    return q1.MLXWAKEPERIOD_100_MS;
                case 7:
                    return q1.MLXWAKEPERIOD_150_MS;
                case 8:
                    return q1.MLXWAKEPERIOD_250_MS;
                case 9:
                    return q1.MLXWAKEPERIOD_500_MS;
                case 10:
                    return q1.MLXWAKEPERIOD_1_S;
                case 11:
                    return q1.MLXWAKEPERIOD_2_S;
                case 12:
                    return q1.MLXWAKEPERIOD_2_5_S;
                case 13:
                    return q1.MLXWAKEPERIOD_3_S;
                case 14:
                    return q1.MLXWAKEPERIOD_4_S;
                case 15:
                    return q1.MLXWAKEPERIOD_5_S;
                case 16:
                    return q1.MLXWAKEPERIOD_6_S;
                case 17:
                    return q1.MLXWAKEPERIOD_7_S;
                case 18:
                    return q1.MLXWAKEPERIOD_8_S;
                case 19:
                    return q1.MLXWAKEPERIOD_9_S;
                case 20:
                    return q1.MLXWAKEPERIOD_10_S;
                case 21:
                    return q1.MLXWAKEPERIOD_11_S;
                case 22:
                    return q1.MLXWAKEPERIOD_12_S;
                case 23:
                    return q1.MLXWAKEPERIOD_15_S;
                case 24:
                    return q1.MLXWAKEPERIOD_20_S;
                case 25:
                    return q1.MLXWAKEPERIOD_30_S;
                case 26:
                    return q1.MLXWAKEPERIOD_1_M;
                case 27:
                    return q1.MLXWAKEPERIOD_2_M;
                case 28:
                    return q1.MLXWAKEPERIOD_3_M;
                case 29:
                    return q1.MLXWAKEPERIOD_4_M;
                case 30:
                    return q1.MLXWAKEPERIOD_5_M;
                case 31:
                    return q1.MLXWAKEPERIOD_10_M;
                case 32:
                    return q1.MLXWAKEPERIOD_16_M;
                case 33:
                    return q1.MLXWAKEPERIOD_NOT_SET;
                default:
                    return null;
            }
        }
    }

    static {
        q1 q1Var;
        ADAPTER = new com.squareup.wire.a<q1>(kotlin.jvm.internal.m0.b(q1.class), com.squareup.wire.o.PROTO_3, q1Var) { // from class: bu.q1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public q1 d(int i11) {
                return q1.Companion.a(i11);
            }
        };
    }

    q1(int i11) {
        this.value = i11;
    }

    public static final q1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}