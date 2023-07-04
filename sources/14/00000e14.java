package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum t implements com.squareup.wire.p {
    BLE_CONFIG_COMMAND_TYPE_NONE(0),
    BLE_CONFIG_COMMAND_TYPE_READ(1),
    BLE_CONFIG_COMMAND_TYPE_WRITE(2);
    
    public static final ProtoAdapter<t> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return t.BLE_CONFIG_COMMAND_TYPE_WRITE;
                }
                return t.BLE_CONFIG_COMMAND_TYPE_READ;
            }
            return t.BLE_CONFIG_COMMAND_TYPE_NONE;
        }
    }

    static {
        t tVar;
        ADAPTER = new com.squareup.wire.a<t>(kotlin.jvm.internal.m0.b(t.class), com.squareup.wire.o.PROTO_3, tVar) { // from class: bu.t.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public t d(int i11) {
                return t.Companion.a(i11);
            }
        };
    }

    t(int i11) {
        this.value = i11;
    }

    public static final t fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}