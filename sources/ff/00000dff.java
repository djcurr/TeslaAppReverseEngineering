package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum r2 implements com.squareup.wire.p {
    SLEEPMANAGER_COMMAND_NONE(0),
    SLEEPMANAGER_GET_STATS(1),
    SLEEPMANAGER_RESET_STATS(2);
    
    public static final ProtoAdapter<r2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return r2.SLEEPMANAGER_RESET_STATS;
                }
                return r2.SLEEPMANAGER_GET_STATS;
            }
            return r2.SLEEPMANAGER_COMMAND_NONE;
        }
    }

    static {
        r2 r2Var;
        ADAPTER = new com.squareup.wire.a<r2>(kotlin.jvm.internal.m0.b(r2.class), com.squareup.wire.o.PROTO_3, r2Var) { // from class: bu.r2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public r2 d(int i11) {
                return r2.Companion.a(i11);
            }
        };
    }

    r2(int i11) {
        this.value = i11;
    }

    public static final r2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}