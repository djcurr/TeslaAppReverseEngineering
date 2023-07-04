package ws;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f56168a = new i();

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56169a;

        static {
            int[] iArr = new int[ut.a.values().length];
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_REAR_TRUNK.ordinal()] = 1;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_ON.ordinal()] = 2;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE.ordinal()] = 3;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_OFF.ordinal()] = 4;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE.ordinal()] = 5;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE.ordinal()] = 6;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE.ordinal()] = 7;
            iArr[ut.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE.ordinal()] = 8;
            iArr[ut.a.NOTIFICATION_ACTION_DISABLE_SENTRY.ordinal()] = 9;
            iArr[ut.a.NOTIFICATION_ACTION_STOP_CHARGING.ordinal()] = 10;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_SUNROOF.ordinal()] = 11;
            iArr[ut.a.NOTIFICATION_ACTION_UPDATE_SOFTWARE.ordinal()] = 12;
            iArr[ut.a.NOTIFICATION_ACTION_CANCEL_SOFTWARE.ordinal()] = 13;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW.ordinal()] = 14;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW.ordinal()] = 15;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW.ordinal()] = 16;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW.ordinal()] = 17;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS.ordinal()] = 18;
            iArr[ut.a.NOTIFICATION_ACTION_DOOR_LOCK.ordinal()] = 19;
            iArr[ut.a.NOTIFICATION_ACTION_ENABLE_SENTRY.ordinal()] = 20;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR.ordinal()] = 21;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR.ordinal()] = 22;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR.ordinal()] = 23;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR.ordinal()] = 24;
            iArr[ut.a.NOTIFICATION_ACTION_CLOSE_ALL_DOORS.ordinal()] = 25;
            iArr[ut.a.NOTIFICATION_ACTION_START_CHARGING.ordinal()] = 26;
            f56169a = iArr;
        }
    }

    private i() {
    }

    public final nu.a a(ut.a action) {
        nu.a fVar;
        s.g(action, "action");
        switch (a.f56169a[action.ordinal()]) {
            case 1:
                return ws.a.f56160a;
            case 2:
                fVar = new f(false, 1, null);
                break;
            case 3:
                return new f(true);
            case 4:
                return e.f56164a;
            case 5:
                fVar = new c(false, 1, null);
                break;
            case 6:
                return new c(true);
            case 7:
                fVar = new d(false, 1, null);
                break;
            case 8:
                return new d(true);
            case 9:
                return j.f56170a;
            case 10:
                return l.f56172a;
            case 11:
                return h.f56167a;
            case 12:
                return m.f56173a;
            case 13:
                return b.f56161a;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return g.f56166a;
            case 19:
                return k.f56171a;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return fVar;
    }
}