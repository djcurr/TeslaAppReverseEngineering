package ut;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum a implements p {
    NOTIFICATION_ACTION_CLOSE_REAR_TRUNK(0),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE(1),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE(2),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE(3),
    NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE(4),
    NOTIFICATION_ACTION_CLIMATE_ON(5),
    NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE(6),
    NOTIFICATION_ACTION_CLIMATE_OFF(7),
    NOTIFICATION_ACTION_ENABLE_SENTRY(8),
    NOTIFICATION_ACTION_DISABLE_SENTRY(9),
    NOTIFICATION_ACTION_STOP_CHARGING(10),
    NOTIFICATION_ACTION_START_CHARGING(11),
    NOTIFICATION_ACTION_CLOSE_SUNROOF(12),
    NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR(13),
    NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR(14),
    NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR(15),
    NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR(16),
    NOTIFICATION_ACTION_CLOSE_ALL_DOORS(17),
    NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW(18),
    NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW(19),
    NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW(20),
    NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW(21),
    NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS(22),
    NOTIFICATION_ACTION_UPDATE_SOFTWARE(23),
    NOTIFICATION_ACTION_CANCEL_SOFTWARE(24),
    NOTIFICATION_ACTION_DOOR_LOCK(25);
    
    public static final ProtoAdapter<a> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i11) {
            switch (i11) {
                case 0:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_TRUNK;
                case 1:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE;
                case 2:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE;
                case 3:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE;
                case 4:
                    return a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE;
                case 5:
                    return a.NOTIFICATION_ACTION_CLIMATE_ON;
                case 6:
                    return a.NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE;
                case 7:
                    return a.NOTIFICATION_ACTION_CLIMATE_OFF;
                case 8:
                    return a.NOTIFICATION_ACTION_ENABLE_SENTRY;
                case 9:
                    return a.NOTIFICATION_ACTION_DISABLE_SENTRY;
                case 10:
                    return a.NOTIFICATION_ACTION_STOP_CHARGING;
                case 11:
                    return a.NOTIFICATION_ACTION_START_CHARGING;
                case 12:
                    return a.NOTIFICATION_ACTION_CLOSE_SUNROOF;
                case 13:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR;
                case 14:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR;
                case 15:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR;
                case 16:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR;
                case 17:
                    return a.NOTIFICATION_ACTION_CLOSE_ALL_DOORS;
                case 18:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW;
                case 19:
                    return a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW;
                case 20:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW;
                case 21:
                    return a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW;
                case 22:
                    return a.NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS;
                case 23:
                    return a.NOTIFICATION_ACTION_UPDATE_SOFTWARE;
                case 24:
                    return a.NOTIFICATION_ACTION_CANCEL_SOFTWARE;
                case 25:
                    return a.NOTIFICATION_ACTION_DOOR_LOCK;
                default:
                    return null;
            }
        }
    }

    static {
        a aVar;
        ADAPTER = new com.squareup.wire.a<a>(m0.b(a.class), o.PROTO_3, aVar) { // from class: ut.a.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a d(int i11) {
                return a.Companion.a(i11);
            }
        };
    }

    a(int i11) {
        this.value = i11;
    }

    public static final a fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}