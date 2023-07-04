package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum e implements p {
    GET(0),
    PUT(1),
    POST(2),
    DELETE(3),
    HEAD(4),
    PATCH(5),
    OPTIONS(6),
    TRACE(7),
    CONNECT(8);
    
    public static final ProtoAdapter<e> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i11) {
            switch (i11) {
                case 0:
                    return e.GET;
                case 1:
                    return e.PUT;
                case 2:
                    return e.POST;
                case 3:
                    return e.DELETE;
                case 4:
                    return e.HEAD;
                case 5:
                    return e.PATCH;
                case 6:
                    return e.OPTIONS;
                case 7:
                    return e.TRACE;
                case 8:
                    return e.CONNECT;
                default:
                    return null;
            }
        }
    }

    static {
        e eVar;
        ADAPTER = new com.squareup.wire.a<e>(m0.b(e.class), o.PROTO_3, eVar) { // from class: tt.e.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e d(int i11) {
                return e.Companion.a(i11);
            }
        };
    }

    e(int i11) {
        this.value = i11;
    }

    public static final e fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}