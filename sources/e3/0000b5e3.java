package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum l implements p {
    IOS_DID_FINISH_LAUNCHING(0),
    ANDROID_APPLICATION_ON_CREATE(1),
    JS_STARTUP(2),
    APP_LAUNCH_GATE(3),
    IOS_TIME_TO_INTERACTIVE(4),
    APP_IN_FOREGROUND(5),
    ANDROID_INITIALIZER(6),
    ANDROID_TIME_TO_INTERACTIVE(7),
    GODOT_INITIALIZATION(10),
    COMMAND(11),
    BLUETOOTH_COMMAND(12),
    HERMES_COMMAND(13),
    OAPI_COMMAND(14),
    WEBCAM_CONNECT(15),
    WEBCAM_TIME_TO_FIRST_FRAME(16),
    DISK_USAGE(17),
    WEBCAM_SESSION(18),
    WEBCAM_CREATE_SESSION(19),
    COMMANDS_IN_SESSION(20),
    SUMMON_CONNECTION(21),
    VEHICLEDATA_SUBSCRIPTION_SESSION(22),
    SUMMON_WEBRTC_CONNECT(23),
    CACHED_DATA_SESSION(24),
    REALM_WRITE(25),
    FIRST_PRODUCT_ON_SCREEN(26),
    WAKE_TO_FRESH_DATA(27),
    ENERGY_GRAPH_SCREEN_FETCH_DATA(28),
    ENERGY_GRAPH_SCREEN_RENDER(29),
    ANDROID_BLESERVICE_LAUNCH_TIME(30);
    
    public static final ProtoAdapter<l> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int i11) {
            switch (i11) {
                case 0:
                    return l.IOS_DID_FINISH_LAUNCHING;
                case 1:
                    return l.ANDROID_APPLICATION_ON_CREATE;
                case 2:
                    return l.JS_STARTUP;
                case 3:
                    return l.APP_LAUNCH_GATE;
                case 4:
                    return l.IOS_TIME_TO_INTERACTIVE;
                case 5:
                    return l.APP_IN_FOREGROUND;
                case 6:
                    return l.ANDROID_INITIALIZER;
                case 7:
                    return l.ANDROID_TIME_TO_INTERACTIVE;
                case 8:
                case 9:
                default:
                    return null;
                case 10:
                    return l.GODOT_INITIALIZATION;
                case 11:
                    return l.COMMAND;
                case 12:
                    return l.BLUETOOTH_COMMAND;
                case 13:
                    return l.HERMES_COMMAND;
                case 14:
                    return l.OAPI_COMMAND;
                case 15:
                    return l.WEBCAM_CONNECT;
                case 16:
                    return l.WEBCAM_TIME_TO_FIRST_FRAME;
                case 17:
                    return l.DISK_USAGE;
                case 18:
                    return l.WEBCAM_SESSION;
                case 19:
                    return l.WEBCAM_CREATE_SESSION;
                case 20:
                    return l.COMMANDS_IN_SESSION;
                case 21:
                    return l.SUMMON_CONNECTION;
                case 22:
                    return l.VEHICLEDATA_SUBSCRIPTION_SESSION;
                case 23:
                    return l.SUMMON_WEBRTC_CONNECT;
                case 24:
                    return l.CACHED_DATA_SESSION;
                case 25:
                    return l.REALM_WRITE;
                case 26:
                    return l.FIRST_PRODUCT_ON_SCREEN;
                case 27:
                    return l.WAKE_TO_FRESH_DATA;
                case 28:
                    return l.ENERGY_GRAPH_SCREEN_FETCH_DATA;
                case 29:
                    return l.ENERGY_GRAPH_SCREEN_RENDER;
                case 30:
                    return l.ANDROID_BLESERVICE_LAUNCH_TIME;
            }
        }
    }

    static {
        l lVar;
        ADAPTER = new com.squareup.wire.a<l>(m0.b(l.class), o.PROTO_3, lVar) { // from class: tt.l.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public l d(int i11) {
                return l.Companion.a(i11);
            }
        };
    }

    l(int i11) {
        this.value = i11;
    }

    public static final l fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}