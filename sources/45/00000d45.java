package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bu.f0 */
/* loaded from: classes6.dex */
public enum ClosureState implements com.squareup.wire.p {
    CLOSURESTATE_CLOSED(0),
    CLOSURESTATE_OPEN(1),
    CLOSURESTATE_AJAR(2),
    CLOSURESTATE_UNKNOWN(3),
    CLOSURESTATE_FAILED_UNLATCH(4);
    
    public static final ProtoAdapter<ClosureState> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* renamed from: bu.f0$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClosureState a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return ClosureState.CLOSURESTATE_FAILED_UNLATCH;
                        }
                        return ClosureState.CLOSURESTATE_UNKNOWN;
                    }
                    return ClosureState.CLOSURESTATE_AJAR;
                }
                return ClosureState.CLOSURESTATE_OPEN;
            }
            return ClosureState.CLOSURESTATE_CLOSED;
        }
    }

    static {
        ClosureState closureState;
        ADAPTER = new com.squareup.wire.a<ClosureState>(kotlin.jvm.internal.m0.b(ClosureState.class), com.squareup.wire.o.PROTO_3, closureState) { // from class: bu.f0.a
            @Override // com.squareup.wire.a
            /* renamed from: f  reason: avoid collision after fix types in other method */
            public ClosureState d(int i11) {
                return ClosureState.Companion.a(i11);
            }
        };
    }

    ClosureState(int i11) {
        this.value = i11;
    }

    public static final ClosureState fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}