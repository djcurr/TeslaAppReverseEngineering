package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum e3 implements com.squareup.wire.p {
    TP_NOTIFYTRACKER_COMMAND_NONE(0),
    TP_NOTIFYTRACKER_COMMAND_GET_STATS(1),
    TP_NOTIFYTRACKER_COMMAND_CLEAR_STATS(2);
    
    public static final ProtoAdapter<e3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e3 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return e3.TP_NOTIFYTRACKER_COMMAND_CLEAR_STATS;
                }
                return e3.TP_NOTIFYTRACKER_COMMAND_GET_STATS;
            }
            return e3.TP_NOTIFYTRACKER_COMMAND_NONE;
        }
    }

    static {
        e3 e3Var;
        ADAPTER = new com.squareup.wire.a<e3>(kotlin.jvm.internal.m0.b(e3.class), com.squareup.wire.o.PROTO_3, e3Var) { // from class: bu.e3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e3 d(int i11) {
                return e3.Companion.a(i11);
            }
        };
    }

    e3(int i11) {
        this.value = i11;
    }

    public static final e3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}