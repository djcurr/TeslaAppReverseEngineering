package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum k implements p {
    VEHICLE(0),
    ENERGY(1),
    SPLASH_SCREEN(2),
    ONBOARDING_SCREEN(3),
    PRE_DELIVERY(4),
    NON_OWNER(5),
    VEHICLE_SERVICE(6);
    
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
                    return k.VEHICLE;
                case 1:
                    return k.ENERGY;
                case 2:
                    return k.SPLASH_SCREEN;
                case 3:
                    return k.ONBOARDING_SCREEN;
                case 4:
                    return k.PRE_DELIVERY;
                case 5:
                    return k.NON_OWNER;
                case 6:
                    return k.VEHICLE_SERVICE;
                default:
                    return null;
            }
        }
    }

    static {
        k kVar;
        ADAPTER = new com.squareup.wire.a<k>(m0.b(k.class), o.PROTO_3, kVar) { // from class: tt.k.a
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