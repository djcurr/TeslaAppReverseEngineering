package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum p implements com.squareup.wire.p {
    BLE_ADDITIONAL_TRIM_APPLIED_NONE(0),
    BLE_ADDITIONAL_TRIM_APPLIED_APPLIED(1),
    BLE_ADDITIONAL_TRIM_APPLIED_NOT_APPLIED(2);
    
    public static final ProtoAdapter<p> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return p.BLE_ADDITIONAL_TRIM_APPLIED_NOT_APPLIED;
                }
                return p.BLE_ADDITIONAL_TRIM_APPLIED_APPLIED;
            }
            return p.BLE_ADDITIONAL_TRIM_APPLIED_NONE;
        }
    }

    static {
        p pVar;
        ADAPTER = new com.squareup.wire.a<p>(kotlin.jvm.internal.m0.b(p.class), com.squareup.wire.o.PROTO_3, pVar) { // from class: bu.p.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public p d(int i11) {
                return p.Companion.a(i11);
            }
        };
    }

    p(int i11) {
        this.value = i11;
    }

    public static final p fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}