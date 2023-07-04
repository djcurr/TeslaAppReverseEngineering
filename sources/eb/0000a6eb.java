package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum f implements p {
    RESULT_NONE(0),
    RESULT_SUCCESS(1),
    RESULT_SIGNED_COMMANDS_NOT_SUPPORTED(2),
    RESULT_TIMEOUT(3),
    RESULT_NOT_IN_WHITELIST(4),
    RESULT_INTERNAL_ERROR(5),
    RESULT_UNSUPPORTED_COMMAND(6),
    RESULT_UNKNOWN_ERROR(7),
    RESULT_UNAUTHORIZED(8),
    RESULT_SERVER_ERROR(9),
    RESULT_CONNECTION_ERROR(10),
    RESULT_BLUETOOTH_DISABLED(11),
    RESULT_SCAN_IN_PROGRESS(12),
    RESULT_NO_PERIPHERALS(13),
    RESULT_NOT_CONNECTED(14),
    RESULT_TRANSMISSION_FAILURE(15),
    RESULT_NO_KEYS_CREATED(16),
    RESULT_WHITELIST_FULL(17),
    RESULT_PUBLIC_KEY_NOT_FOUND(18),
    RESULT_INVALID_STATE(19),
    RESULT_NOMINAL_ERROR(20),
    RESULT_INSUFFICIENT_PRIVILEGES(21),
    RESULT_TOO_MANY_REQUESTS(22),
    RESULT_INVALID_COMMAND_REQUEST(23),
    RESULT_CAR_SERVER_ERROR(24),
    RESULT_INCORRECT_SESSION_INFO_ERROR(25),
    RESULT_APPLICATION_ERROR(26),
    RESULT_INVALID_MESSAGE_ERROR(27),
    RESULT_HERMES_INTERNAL_ERROR(28),
    RESULT_TOKEN_ERROR(29),
    RESULT_UNRECOGNIZED_ENUM_VALUE(30),
    RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE(31),
    RESULT_VEHICLE_INTERNAL_ERROR(32),
    RESULT_VEHICLE_BUSY_ERROR(33),
    RESULT_VEHICLE_WAIT_ERROR(34),
    RESULT_SESSION_INFO_RECOVERED(35),
    RESULT_VEHICLE_TIMEOUT(36),
    RESULT_MOBILE_ACCESS_DISABLED(37),
    RESULT_VEHICLE_NOT_CONNECTED(38),
    RESULT_CONFIG_HERMES_DISABLED(39),
    RESULT_CONFIG_CONNECTIVITY_DISABLED(40),
    RESULT_BAD_PARAMETER(41),
    RESULT_SIGNED_COMMANDS_REQUIRED(42),
    RESULT_FORBIDDEN(43),
    RESULT_VEHICLE_NOT_AWAKE(44),
    RESULT_NO_NETWORK(45),
    RESULT_BLE_SERVICE_DISCONNECTED(46),
    RESULT_MISSING_EMAIL(47),
    RESULT_MISSING_VIN(48),
    RESULT_MISSING_VEHICLE_DATA(49),
    RESULT_MISSING_VEHICLE_DATA_VIN(50),
    RESULT_MISSING_VEHICLE_DATA_API_VERSION(51),
    RESULT_MISSING_REQUEST_VIN(52),
    RESULT_VEHICLE_DATA_LOOKUP_FAILURE(53),
    RESULT_MESSAGE_BUILD_FAILURE(54),
    RESULT_MESSAGE_EVALUATION_FAILURE(55),
    RESULT_LEGACY_BLE_COMMAND_FAILURE(56),
    RESULT_UNSUPPORTED_KEY_VERSION(57),
    RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE(58),
    RESULT_EXCEPTION_THROWN(59),
    RESULT_DEPENDENT_SESSION_INFO_FAILURE(60),
    RESULT_WHITELIST_OPERATION_FAILURE(61);
    
    public static final ProtoAdapter<f> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(int i11) {
            switch (i11) {
                case 0:
                    return f.RESULT_NONE;
                case 1:
                    return f.RESULT_SUCCESS;
                case 2:
                    return f.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED;
                case 3:
                    return f.RESULT_TIMEOUT;
                case 4:
                    return f.RESULT_NOT_IN_WHITELIST;
                case 5:
                    return f.RESULT_INTERNAL_ERROR;
                case 6:
                    return f.RESULT_UNSUPPORTED_COMMAND;
                case 7:
                    return f.RESULT_UNKNOWN_ERROR;
                case 8:
                    return f.RESULT_UNAUTHORIZED;
                case 9:
                    return f.RESULT_SERVER_ERROR;
                case 10:
                    return f.RESULT_CONNECTION_ERROR;
                case 11:
                    return f.RESULT_BLUETOOTH_DISABLED;
                case 12:
                    return f.RESULT_SCAN_IN_PROGRESS;
                case 13:
                    return f.RESULT_NO_PERIPHERALS;
                case 14:
                    return f.RESULT_NOT_CONNECTED;
                case 15:
                    return f.RESULT_TRANSMISSION_FAILURE;
                case 16:
                    return f.RESULT_NO_KEYS_CREATED;
                case 17:
                    return f.RESULT_WHITELIST_FULL;
                case 18:
                    return f.RESULT_PUBLIC_KEY_NOT_FOUND;
                case 19:
                    return f.RESULT_INVALID_STATE;
                case 20:
                    return f.RESULT_NOMINAL_ERROR;
                case 21:
                    return f.RESULT_INSUFFICIENT_PRIVILEGES;
                case 22:
                    return f.RESULT_TOO_MANY_REQUESTS;
                case 23:
                    return f.RESULT_INVALID_COMMAND_REQUEST;
                case 24:
                    return f.RESULT_CAR_SERVER_ERROR;
                case 25:
                    return f.RESULT_INCORRECT_SESSION_INFO_ERROR;
                case 26:
                    return f.RESULT_APPLICATION_ERROR;
                case 27:
                    return f.RESULT_INVALID_MESSAGE_ERROR;
                case 28:
                    return f.RESULT_HERMES_INTERNAL_ERROR;
                case 29:
                    return f.RESULT_TOKEN_ERROR;
                case 30:
                    return f.RESULT_UNRECOGNIZED_ENUM_VALUE;
                case 31:
                    return f.RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE;
                case 32:
                    return f.RESULT_VEHICLE_INTERNAL_ERROR;
                case 33:
                    return f.RESULT_VEHICLE_BUSY_ERROR;
                case 34:
                    return f.RESULT_VEHICLE_WAIT_ERROR;
                case 35:
                    return f.RESULT_SESSION_INFO_RECOVERED;
                case 36:
                    return f.RESULT_VEHICLE_TIMEOUT;
                case 37:
                    return f.RESULT_MOBILE_ACCESS_DISABLED;
                case 38:
                    return f.RESULT_VEHICLE_NOT_CONNECTED;
                case 39:
                    return f.RESULT_CONFIG_HERMES_DISABLED;
                case 40:
                    return f.RESULT_CONFIG_CONNECTIVITY_DISABLED;
                case 41:
                    return f.RESULT_BAD_PARAMETER;
                case 42:
                    return f.RESULT_SIGNED_COMMANDS_REQUIRED;
                case 43:
                    return f.RESULT_FORBIDDEN;
                case 44:
                    return f.RESULT_VEHICLE_NOT_AWAKE;
                case 45:
                    return f.RESULT_NO_NETWORK;
                case 46:
                    return f.RESULT_BLE_SERVICE_DISCONNECTED;
                case 47:
                    return f.RESULT_MISSING_EMAIL;
                case 48:
                    return f.RESULT_MISSING_VIN;
                case 49:
                    return f.RESULT_MISSING_VEHICLE_DATA;
                case 50:
                    return f.RESULT_MISSING_VEHICLE_DATA_VIN;
                case 51:
                    return f.RESULT_MISSING_VEHICLE_DATA_API_VERSION;
                case 52:
                    return f.RESULT_MISSING_REQUEST_VIN;
                case 53:
                    return f.RESULT_VEHICLE_DATA_LOOKUP_FAILURE;
                case 54:
                    return f.RESULT_MESSAGE_BUILD_FAILURE;
                case 55:
                    return f.RESULT_MESSAGE_EVALUATION_FAILURE;
                case 56:
                    return f.RESULT_LEGACY_BLE_COMMAND_FAILURE;
                case 57:
                    return f.RESULT_UNSUPPORTED_KEY_VERSION;
                case 58:
                    return f.RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE;
                case 59:
                    return f.RESULT_EXCEPTION_THROWN;
                case 60:
                    return f.RESULT_DEPENDENT_SESSION_INFO_FAILURE;
                case 61:
                    return f.RESULT_WHITELIST_OPERATION_FAILURE;
                default:
                    return null;
            }
        }
    }

    static {
        f fVar;
        ADAPTER = new com.squareup.wire.a<f>(m0.b(f.class), o.PROTO_3, fVar) { // from class: ot.f.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public f d(int i11) {
                return f.Companion.a(i11);
            }
        };
    }

    f(int i11) {
        this.value = i11;
    }

    public static final f fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}