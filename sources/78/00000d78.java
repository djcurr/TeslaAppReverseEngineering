package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum i2 implements com.squareup.wire.p {
    RESETTRACKER_COMMAND_NONE(0),
    RESETTRACKER_COMMAND_GET_STATS(1),
    RESETTRACKER_COMMAND_CLEAR_STATS(2);
    
    public static final ProtoAdapter<i2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return i2.RESETTRACKER_COMMAND_CLEAR_STATS;
                }
                return i2.RESETTRACKER_COMMAND_GET_STATS;
            }
            return i2.RESETTRACKER_COMMAND_NONE;
        }
    }

    static {
        i2 i2Var;
        ADAPTER = new com.squareup.wire.a<i2>(kotlin.jvm.internal.m0.b(i2.class), com.squareup.wire.o.PROTO_3, i2Var) { // from class: bu.i2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public i2 d(int i11) {
                return i2.Companion.a(i11);
            }
        };
    }

    i2(int i11) {
        this.value = i11;
    }

    public static final i2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}