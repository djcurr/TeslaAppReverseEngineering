package rt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum a implements p {
    ROLE_NONE(0),
    ROLE_SERVICE(1),
    ROLE_OWNER(2),
    ROLE_DRIVER(3),
    ROLE_FM(4),
    ROLE_VEHICLE_MONITOR(5),
    ROLE_CHARGING_MANAGER(6),
    ROLE_SERVICE_TECH(7);
    
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
                    return a.ROLE_NONE;
                case 1:
                    return a.ROLE_SERVICE;
                case 2:
                    return a.ROLE_OWNER;
                case 3:
                    return a.ROLE_DRIVER;
                case 4:
                    return a.ROLE_FM;
                case 5:
                    return a.ROLE_VEHICLE_MONITOR;
                case 6:
                    return a.ROLE_CHARGING_MANAGER;
                case 7:
                    return a.ROLE_SERVICE_TECH;
                default:
                    return null;
            }
        }
    }

    static {
        a aVar;
        ADAPTER = new com.squareup.wire.a<a>(m0.b(a.class), o.PROTO_3, aVar) { // from class: rt.a.a
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