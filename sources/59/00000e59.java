package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum x2 implements com.squareup.wire.p {
    TP_DATAREQUEST_NONE(0),
    TP_DATAREQUEST_PRESSURE_TEMPERATURE(1),
    TP_DATAREQUEST_NEW_SENSOR_INFO(2),
    TP_DATAREQUEST_WHEEL_ROTATION_DIRECTION(3),
    TP_DATAREQUEST_ACCEL(4),
    TP_DATAREQUEST_MOTION_DETECTION_START(5),
    TP_DATAREQUEST_READ_ALARMS(6),
    TP_DATAREQUEST_MOTION_DETECTION_STOP(7),
    TP_DATAREQUEST_READ_PUBLIC_KEY(8);
    
    public static final ProtoAdapter<x2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x2 a(int i11) {
            switch (i11) {
                case 0:
                    return x2.TP_DATAREQUEST_NONE;
                case 1:
                    return x2.TP_DATAREQUEST_PRESSURE_TEMPERATURE;
                case 2:
                    return x2.TP_DATAREQUEST_NEW_SENSOR_INFO;
                case 3:
                    return x2.TP_DATAREQUEST_WHEEL_ROTATION_DIRECTION;
                case 4:
                    return x2.TP_DATAREQUEST_ACCEL;
                case 5:
                    return x2.TP_DATAREQUEST_MOTION_DETECTION_START;
                case 6:
                    return x2.TP_DATAREQUEST_READ_ALARMS;
                case 7:
                    return x2.TP_DATAREQUEST_MOTION_DETECTION_STOP;
                case 8:
                    return x2.TP_DATAREQUEST_READ_PUBLIC_KEY;
                default:
                    return null;
            }
        }
    }

    static {
        x2 x2Var;
        ADAPTER = new com.squareup.wire.a<x2>(kotlin.jvm.internal.m0.b(x2.class), com.squareup.wire.o.PROTO_3, x2Var) { // from class: bu.x2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public x2 d(int i11) {
                return x2.Companion.a(i11);
            }
        };
    }

    x2(int i11) {
        this.value = i11;
    }

    public static final x2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}