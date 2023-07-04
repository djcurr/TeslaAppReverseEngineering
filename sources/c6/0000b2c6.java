package st;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum b implements p {
    CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID(0),
    CHARGE_ON_SOLAR_NO_CHARGE_REASON_POWERWALL_CHARGE_PRIORITY(1),
    CHARGE_ON_SOLAR_NO_CHARGE_REASON_INSUFFICIENT_SOLAR(2),
    CHARGE_ON_SOLAR_NO_CHARGE_REASON_GRID_EXPORT_PRIORITY(3),
    CHARGE_ON_SOLAR_NO_CHARGE_REASON_ALTERNATE_VEHICLE_CHARGE_PRIORITY(4);
    
    public static final ProtoAdapter<b> ADAPTER;
    public static final C1125b Companion = new C1125b(null);
    private final int value;

    /* renamed from: st.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1125b {
        private C1125b() {
        }

        public /* synthetic */ C1125b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_ALTERNATE_VEHICLE_CHARGE_PRIORITY;
                        }
                        return b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_GRID_EXPORT_PRIORITY;
                    }
                    return b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INSUFFICIENT_SOLAR;
                }
                return b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_POWERWALL_CHARGE_PRIORITY;
            }
            return b.CHARGE_ON_SOLAR_NO_CHARGE_REASON_INVALID;
        }
    }

    static {
        b bVar;
        ADAPTER = new com.squareup.wire.a<b>(m0.b(b.class), o.PROTO_3, bVar) { // from class: st.b.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public b d(int i11) {
                return b.Companion.a(i11);
            }
        };
    }

    b(int i11) {
        this.value = i11;
    }

    public static final b fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}