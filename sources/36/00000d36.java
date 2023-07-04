package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum e0 implements com.squareup.wire.p {
    CLOSURE_MOVE_TYPE_NONE(0),
    CLOSURE_MOVE_TYPE_MOVE(1),
    CLOSURE_MOVE_TYPE_STOP(2),
    CLOSURE_MOVE_TYPE_OPEN(3),
    CLOSURE_MOVE_TYPE_CLOSE(4);
    
    public static final ProtoAdapter<e0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return e0.CLOSURE_MOVE_TYPE_CLOSE;
                        }
                        return e0.CLOSURE_MOVE_TYPE_OPEN;
                    }
                    return e0.CLOSURE_MOVE_TYPE_STOP;
                }
                return e0.CLOSURE_MOVE_TYPE_MOVE;
            }
            return e0.CLOSURE_MOVE_TYPE_NONE;
        }
    }

    static {
        e0 e0Var;
        ADAPTER = new com.squareup.wire.a<e0>(kotlin.jvm.internal.m0.b(e0.class), com.squareup.wire.o.PROTO_3, e0Var) { // from class: bu.e0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e0 d(int i11) {
                return e0.Companion.a(i11);
            }
        };
    }

    e0(int i11) {
        this.value = i11;
    }

    public static final e0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}