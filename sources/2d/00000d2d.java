package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum d3 implements com.squareup.wire.p {
    TP_NOTIFY_REASON_UNKNOWN(0),
    TP_NOTIFY_REASON_LOW_PRESSURE(1),
    TP_NOTIFY_REASON_PT_VALUE_UPDATE(2),
    TP_NOTIFY_REASON_WHEEL_MOVING(3),
    TP_NOTIFY_REASON_WHEEL_ROTATION_DIRECTION_CALCULATION_READY(4),
    TP_NOTIFY_REASON_LF(5),
    TP_NOTIFY_REASON_FAULT(6);
    
    public static final ProtoAdapter<d3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d3 a(int i11) {
            switch (i11) {
                case 0:
                    return d3.TP_NOTIFY_REASON_UNKNOWN;
                case 1:
                    return d3.TP_NOTIFY_REASON_LOW_PRESSURE;
                case 2:
                    return d3.TP_NOTIFY_REASON_PT_VALUE_UPDATE;
                case 3:
                    return d3.TP_NOTIFY_REASON_WHEEL_MOVING;
                case 4:
                    return d3.TP_NOTIFY_REASON_WHEEL_ROTATION_DIRECTION_CALCULATION_READY;
                case 5:
                    return d3.TP_NOTIFY_REASON_LF;
                case 6:
                    return d3.TP_NOTIFY_REASON_FAULT;
                default:
                    return null;
            }
        }
    }

    static {
        d3 d3Var;
        ADAPTER = new com.squareup.wire.a<d3>(kotlin.jvm.internal.m0.b(d3.class), com.squareup.wire.o.PROTO_3, d3Var) { // from class: bu.d3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d3 d(int i11) {
                return d3.Companion.a(i11);
            }
        };
    }

    d3(int i11) {
        this.value = i11;
    }

    public static final d3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}