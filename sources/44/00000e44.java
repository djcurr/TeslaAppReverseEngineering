package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum w0 implements com.squareup.wire.p {
    GET_READER_KEY_COMMAND_UNKNOWN(0),
    GET_READER_KEY_COMMAND_START_LOOKING(1),
    GET_READER_KEY_COMMAND_STOP_LOOKING(2);
    
    public static final ProtoAdapter<w0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return w0.GET_READER_KEY_COMMAND_STOP_LOOKING;
                }
                return w0.GET_READER_KEY_COMMAND_START_LOOKING;
            }
            return w0.GET_READER_KEY_COMMAND_UNKNOWN;
        }
    }

    static {
        w0 w0Var;
        ADAPTER = new com.squareup.wire.a<w0>(kotlin.jvm.internal.m0.b(w0.class), com.squareup.wire.o.PROTO_3, w0Var) { // from class: bu.w0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public w0 d(int i11) {
                return w0.Companion.a(i11);
            }
        };
    }

    w0(int i11) {
        this.value = i11;
    }

    public static final w0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}