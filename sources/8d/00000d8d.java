package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum k implements com.squareup.wire.p {
    AUTHENTICATIONREASON_NOT_DOCUMENTED(0),
    AUTHENTICATIONREASON_IDENTIFICATION(1),
    AUTHENTICATIONREASON_POWER_ON_VEHICLE_REQUEST(2),
    AUTHENTICATIONREASON_GTW_REQUEST(3),
    AUTHENTICATIONREASON_UI_UNLOCK_PASSIVE_AUTH(4),
    AUTHENTICATIONREASON_PASSIVE_UNLOCK_EXTERIOR_HANDLE_PULL(5),
    AUTHENTICATIONREASON_PASSIVE_UNLOCK_INTERIOR_HANDLE_PULL(6),
    AUTHENTICATIONREASON_PASSIVE_UNLOCK_AUTOPRESENT_DOOR(7),
    AUTHENTICATIONREASON_ENTERED_HIGHER_AUTH_ZONE(8),
    AUTHENTICATIONREASON_WALK_UP_UNLOCK(9),
    AUTHENTICATIONREASON_IMMOBILIZER(10);
    
    public static final ProtoAdapter<k> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(int i11) {
            switch (i11) {
                case 0:
                    return k.AUTHENTICATIONREASON_NOT_DOCUMENTED;
                case 1:
                    return k.AUTHENTICATIONREASON_IDENTIFICATION;
                case 2:
                    return k.AUTHENTICATIONREASON_POWER_ON_VEHICLE_REQUEST;
                case 3:
                    return k.AUTHENTICATIONREASON_GTW_REQUEST;
                case 4:
                    return k.AUTHENTICATIONREASON_UI_UNLOCK_PASSIVE_AUTH;
                case 5:
                    return k.AUTHENTICATIONREASON_PASSIVE_UNLOCK_EXTERIOR_HANDLE_PULL;
                case 6:
                    return k.AUTHENTICATIONREASON_PASSIVE_UNLOCK_INTERIOR_HANDLE_PULL;
                case 7:
                    return k.AUTHENTICATIONREASON_PASSIVE_UNLOCK_AUTOPRESENT_DOOR;
                case 8:
                    return k.AUTHENTICATIONREASON_ENTERED_HIGHER_AUTH_ZONE;
                case 9:
                    return k.AUTHENTICATIONREASON_WALK_UP_UNLOCK;
                case 10:
                    return k.AUTHENTICATIONREASON_IMMOBILIZER;
                default:
                    return null;
            }
        }
    }

    static {
        k kVar;
        ADAPTER = new com.squareup.wire.a<k>(kotlin.jvm.internal.m0.b(k.class), com.squareup.wire.o.PROTO_3, kVar) { // from class: bu.k.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public k d(int i11) {
                return k.Companion.a(i11);
            }
        };
    }

    k(int i11) {
        this.value = i11;
    }

    public static final k fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}