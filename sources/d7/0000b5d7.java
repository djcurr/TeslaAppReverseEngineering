package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum h implements p {
    OWNER_API_REQUEST(0),
    REALM_GET(1),
    REALM_SET(2),
    CURRENT_MEMORY_USAGE_BYTES(3),
    BATTERY_LEVEL(4),
    WEBCAM_FRAME_COUNT(5),
    WEBCAM_BYTES_STREAMED(6),
    BYTES(7);
    
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
            switch (i11) {
                case 0:
                    return h.OWNER_API_REQUEST;
                case 1:
                    return h.REALM_GET;
                case 2:
                    return h.REALM_SET;
                case 3:
                    return h.CURRENT_MEMORY_USAGE_BYTES;
                case 4:
                    return h.BATTERY_LEVEL;
                case 5:
                    return h.WEBCAM_FRAME_COUNT;
                case 6:
                    return h.WEBCAM_BYTES_STREAMED;
                case 7:
                    return h.BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar;
        ADAPTER = new com.squareup.wire.a<h>(m0.b(h.class), o.PROTO_3, hVar) { // from class: tt.h.a
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