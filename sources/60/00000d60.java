package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum h implements com.squareup.wire.p {
    APP_DEVICE_INFO_REQUEST_NONE(0),
    APP_DEVICE_INFO_REQUEST_GET_MODEL_NUMBER(1);
    
    public static final ProtoAdapter<h> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return h.APP_DEVICE_INFO_REQUEST_GET_MODEL_NUMBER;
            }
            return h.APP_DEVICE_INFO_REQUEST_NONE;
        }
    }

    static {
        h hVar;
        ADAPTER = new com.squareup.wire.a<h>(kotlin.jvm.internal.m0.b(h.class), com.squareup.wire.o.PROTO_3, hVar) { // from class: bu.h.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public h d(int i11) {
                return h.Companion.a(i11);
            }
        };
    }

    h(int i11) {
        this.value = i11;
    }

    public static final h fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}