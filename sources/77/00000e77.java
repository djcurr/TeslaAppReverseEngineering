package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum z2 implements com.squareup.wire.p {
    TPMS_ADV_TYPE_SEMI(0),
    TPMS_ADV_TYPE_PASS_CAR_10000ms(1),
    TPMS_ADV_TYPE_PASS_CAR_3000ms(2);
    
    public static final ProtoAdapter<z2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return z2.TPMS_ADV_TYPE_PASS_CAR_3000ms;
                }
                return z2.TPMS_ADV_TYPE_PASS_CAR_10000ms;
            }
            return z2.TPMS_ADV_TYPE_SEMI;
        }
    }

    static {
        z2 z2Var;
        ADAPTER = new com.squareup.wire.a<z2>(kotlin.jvm.internal.m0.b(z2.class), com.squareup.wire.o.PROTO_3, z2Var) { // from class: bu.z2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public z2 d(int i11) {
                return z2.Companion.a(i11);
            }
        };
    }

    z2(int i11) {
        this.value = i11;
    }

    public static final z2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}