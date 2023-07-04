package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum m implements p {
    TRANSPORT_NONE(0),
    TRANSPORT_OWNER_API(1),
    TRANSPORT_HERMES(2),
    TRANSPORT_BLUETOOTH(3);
    
    public static final ProtoAdapter<m> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return m.TRANSPORT_BLUETOOTH;
                    }
                    return m.TRANSPORT_HERMES;
                }
                return m.TRANSPORT_OWNER_API;
            }
            return m.TRANSPORT_NONE;
        }
    }

    static {
        m mVar;
        ADAPTER = new com.squareup.wire.a<m>(m0.b(m.class), o.PROTO_3, mVar) { // from class: ot.m.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public m d(int i11) {
                return m.Companion.a(i11);
            }
        };
    }

    m(int i11) {
        this.value = i11;
    }

    public static final m fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}