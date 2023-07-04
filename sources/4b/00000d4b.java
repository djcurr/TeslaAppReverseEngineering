package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum f2 implements com.squareup.wire.p {
    RCI_CONTROL_NONE(0),
    RCI_CONTROL_TURN_OFF(1);
    
    public static final ProtoAdapter<f2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return f2.RCI_CONTROL_TURN_OFF;
            }
            return f2.RCI_CONTROL_NONE;
        }
    }

    static {
        f2 f2Var;
        ADAPTER = new com.squareup.wire.a<f2>(kotlin.jvm.internal.m0.b(f2.class), com.squareup.wire.o.PROTO_3, f2Var) { // from class: bu.f2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public f2 d(int i11) {
                return f2.Companion.a(i11);
            }
        };
    }

    f2(int i11) {
        this.value = i11;
    }

    public static final f2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}