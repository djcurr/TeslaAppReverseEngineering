package jt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum g implements p {
    SUCCESS(0),
    REPORT_TYPE(1),
    RETRY_COUNT(2),
    REASON(3),
    UUID(4),
    RESPONSE_COMMAND_ID(5),
    RESPONSE_REQUEST_ID(6),
    RESPONSE_STATUS_CODE(7),
    CONNECTION_ID_UUID_STRING(8),
    ERROR(9),
    COMMAND_ID(10),
    TRANSPORT(11),
    REFRESHED_DATA(12),
    DURATION_S(13),
    COMMAND(14),
    COMMAND_RESULT(15),
    FOREGROUND_SESSION_ID(16),
    PRESENT(17),
    BYTES(18),
    SOUND(19),
    BADGE(20),
    ALERT(21),
    CRITICAL(22),
    DEVICE_MOTION_AVAILABILITY(23),
    TIME_SINCE_PROCESS_START(24),
    LEVEL(25),
    DEVICE_MOTION_STATIONARY_AGE(26),
    DEVICE_MOTION_MOVING_AGE(27),
    SCREEN_BRIGHTNESS(28);
    
    public static final ProtoAdapter<g> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i11) {
            switch (i11) {
                case 0:
                    return g.SUCCESS;
                case 1:
                    return g.REPORT_TYPE;
                case 2:
                    return g.RETRY_COUNT;
                case 3:
                    return g.REASON;
                case 4:
                    return g.UUID;
                case 5:
                    return g.RESPONSE_COMMAND_ID;
                case 6:
                    return g.RESPONSE_REQUEST_ID;
                case 7:
                    return g.RESPONSE_STATUS_CODE;
                case 8:
                    return g.CONNECTION_ID_UUID_STRING;
                case 9:
                    return g.ERROR;
                case 10:
                    return g.COMMAND_ID;
                case 11:
                    return g.TRANSPORT;
                case 12:
                    return g.REFRESHED_DATA;
                case 13:
                    return g.DURATION_S;
                case 14:
                    return g.COMMAND;
                case 15:
                    return g.COMMAND_RESULT;
                case 16:
                    return g.FOREGROUND_SESSION_ID;
                case 17:
                    return g.PRESENT;
                case 18:
                    return g.BYTES;
                case 19:
                    return g.SOUND;
                case 20:
                    return g.BADGE;
                case 21:
                    return g.ALERT;
                case 22:
                    return g.CRITICAL;
                case 23:
                    return g.DEVICE_MOTION_AVAILABILITY;
                case 24:
                    return g.TIME_SINCE_PROCESS_START;
                case 25:
                    return g.LEVEL;
                case 26:
                    return g.DEVICE_MOTION_STATIONARY_AGE;
                case 27:
                    return g.DEVICE_MOTION_MOVING_AGE;
                case 28:
                    return g.SCREEN_BRIGHTNESS;
                default:
                    return null;
            }
        }
    }

    static {
        g gVar;
        ADAPTER = new com.squareup.wire.a<g>(m0.b(g.class), o.PROTO_3, gVar) { // from class: jt.g.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g d(int i11) {
                return g.Companion.a(i11);
            }
        };
    }

    g(int i11) {
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}