package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum u implements com.squareup.wire.p {
    BLE_PRESENCE_NOT_PRESENT(0),
    BLE_PRESENCE_PRESENT(1);
    
    public static final ProtoAdapter<u> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return u.BLE_PRESENCE_PRESENT;
            }
            return u.BLE_PRESENCE_NOT_PRESENT;
        }
    }

    static {
        u uVar;
        ADAPTER = new com.squareup.wire.a<u>(kotlin.jvm.internal.m0.b(u.class), com.squareup.wire.o.PROTO_3, uVar) { // from class: bu.u.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public u d(int i11) {
                return u.Companion.a(i11);
            }
        };
    }

    u(int i11) {
        this.value = i11;
    }

    public static final u fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}