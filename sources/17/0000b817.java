package us;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import ot.f;
import uu.h;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: us.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C1202a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53659a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[f.RESULT_VEHICLE_NOT_CONNECTED.ordinal()] = 1;
            iArr[f.RESULT_VEHICLE_WAIT_ERROR.ordinal()] = 2;
            iArr[f.RESULT_INCORRECT_SESSION_INFO_ERROR.ordinal()] = 3;
            iArr[f.RESULT_VEHICLE_INTERNAL_ERROR.ordinal()] = 4;
            iArr[f.RESULT_HERMES_INTERNAL_ERROR.ordinal()] = 5;
            iArr[f.RESULT_TOKEN_ERROR.ordinal()] = 6;
            iArr[f.RESULT_VEHICLE_TIMEOUT.ordinal()] = 7;
            iArr[f.RESULT_VEHICLE_BUSY_ERROR.ordinal()] = 8;
            iArr[f.RESULT_SESSION_INFO_RECOVERED.ordinal()] = 9;
            iArr[f.RESULT_TRANSMISSION_FAILURE.ordinal()] = 10;
            iArr[f.RESULT_TIMEOUT.ordinal()] = 11;
            iArr[f.RESULT_FORBIDDEN.ordinal()] = 12;
            iArr[f.RESULT_CONFIG_HERMES_DISABLED.ordinal()] = 13;
            iArr[f.RESULT_CONFIG_CONNECTIVITY_DISABLED.ordinal()] = 14;
            iArr[f.RESULT_APPLICATION_ERROR.ordinal()] = 15;
            iArr[f.RESULT_INVALID_MESSAGE_ERROR.ordinal()] = 16;
            iArr[f.RESULT_UNRECOGNIZED_ENUM_VALUE.ordinal()] = 17;
            iArr[f.RESULT_CONNECTIVITY_SUBSCRIPTION_FAILURE.ordinal()] = 18;
            iArr[f.RESULT_WHITELIST_FULL.ordinal()] = 19;
            iArr[f.RESULT_INTERNAL_ERROR.ordinal()] = 20;
            iArr[f.RESULT_INSUFFICIENT_PRIVILEGES.ordinal()] = 21;
            iArr[f.RESULT_TOO_MANY_REQUESTS.ordinal()] = 22;
            iArr[f.RESULT_INVALID_COMMAND_REQUEST.ordinal()] = 23;
            iArr[f.RESULT_NOT_IN_WHITELIST.ordinal()] = 24;
            iArr[f.RESULT_NOMINAL_ERROR.ordinal()] = 25;
            iArr[f.RESULT_CAR_SERVER_ERROR.ordinal()] = 26;
            iArr[f.RESULT_MOBILE_ACCESS_DISABLED.ordinal()] = 27;
            iArr[f.RESULT_VEHICLE_NOT_AWAKE.ordinal()] = 28;
            iArr[f.RESULT_SUCCESS.ordinal()] = 29;
            iArr[f.RESULT_NONE.ordinal()] = 30;
            iArr[f.RESULT_BLUETOOTH_DISABLED.ordinal()] = 31;
            iArr[f.RESULT_SCAN_IN_PROGRESS.ordinal()] = 32;
            iArr[f.RESULT_NO_PERIPHERALS.ordinal()] = 33;
            iArr[f.RESULT_NOT_CONNECTED.ordinal()] = 34;
            iArr[f.RESULT_NO_KEYS_CREATED.ordinal()] = 35;
            iArr[f.RESULT_PUBLIC_KEY_NOT_FOUND.ordinal()] = 36;
            iArr[f.RESULT_INVALID_STATE.ordinal()] = 37;
            iArr[f.RESULT_SERVER_ERROR.ordinal()] = 38;
            iArr[f.RESULT_CONNECTION_ERROR.ordinal()] = 39;
            iArr[f.RESULT_SIGNED_COMMANDS_NOT_SUPPORTED.ordinal()] = 40;
            iArr[f.RESULT_SIGNED_COMMANDS_REQUIRED.ordinal()] = 41;
            iArr[f.RESULT_UNAUTHORIZED.ordinal()] = 42;
            iArr[f.RESULT_UNSUPPORTED_COMMAND.ordinal()] = 43;
            iArr[f.RESULT_UNKNOWN_ERROR.ordinal()] = 44;
            iArr[f.RESULT_BAD_PARAMETER.ordinal()] = 45;
            iArr[f.RESULT_NO_NETWORK.ordinal()] = 46;
            iArr[f.RESULT_BLE_SERVICE_DISCONNECTED.ordinal()] = 47;
            iArr[f.RESULT_MISSING_EMAIL.ordinal()] = 48;
            iArr[f.RESULT_MISSING_VIN.ordinal()] = 49;
            iArr[f.RESULT_MISSING_VEHICLE_DATA.ordinal()] = 50;
            iArr[f.RESULT_MISSING_VEHICLE_DATA_VIN.ordinal()] = 51;
            iArr[f.RESULT_MISSING_VEHICLE_DATA_API_VERSION.ordinal()] = 52;
            iArr[f.RESULT_MISSING_REQUEST_VIN.ordinal()] = 53;
            iArr[f.RESULT_VEHICLE_DATA_LOOKUP_FAILURE.ordinal()] = 54;
            iArr[f.RESULT_MESSAGE_BUILD_FAILURE.ordinal()] = 55;
            iArr[f.RESULT_MESSAGE_EVALUATION_FAILURE.ordinal()] = 56;
            iArr[f.RESULT_LEGACY_BLE_COMMAND_FAILURE.ordinal()] = 57;
            iArr[f.RESULT_UNSUPPORTED_KEY_VERSION.ordinal()] = 58;
            iArr[f.RESULT_REQUEST_TARGETS_NON_SELECTED_VEHICLE.ordinal()] = 59;
            iArr[f.RESULT_EXCEPTION_THROWN.ordinal()] = 60;
            iArr[f.RESULT_DEPENDENT_SESSION_INFO_FAILURE.ordinal()] = 61;
            iArr[f.RESULT_WHITELIST_OPERATION_FAILURE.ordinal()] = 62;
            f53659a = iArr;
        }
    }

    public static final xs.a a(f fVar, h hVar) {
        AtomicInteger w11;
        ot.c A;
        boolean z11 = ((hVar != null && (w11 = hVar.w()) != null) ? w11.get() : 3) < 3;
        switch (fVar == null ? -1 : C1202a.f53659a[fVar.ordinal()]) {
            case -1:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                return new xs.a(false, 0, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new xs.a((hVar == null || (A = hVar.A()) == null || A.f()) ? false : true, 3);
            case 2:
                return new xs.a(z11, 3);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return new xs.a(z11, 0, 2, null);
        }
    }

    public static final boolean b(f fVar) {
        s.g(fVar, "<this>");
        return fVar == f.RESULT_SUCCESS;
    }
}