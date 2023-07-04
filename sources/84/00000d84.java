package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum j1 implements com.squareup.wire.p {
    LRDETECTIONRESULT_ERROR_MAXCNT(0),
    LRDETECTIONRESULT_ERROR_NEGPERIOD(1),
    LRDETECTIONRESULT_ERROR_LONGPERIOD(2),
    LRDETECTIONRESULT_LEFT(3),
    LRDETECTIONRESULT_RIGHT(4);
    
    public static final ProtoAdapter<j1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return j1.LRDETECTIONRESULT_RIGHT;
                        }
                        return j1.LRDETECTIONRESULT_LEFT;
                    }
                    return j1.LRDETECTIONRESULT_ERROR_LONGPERIOD;
                }
                return j1.LRDETECTIONRESULT_ERROR_NEGPERIOD;
            }
            return j1.LRDETECTIONRESULT_ERROR_MAXCNT;
        }
    }

    static {
        j1 j1Var;
        ADAPTER = new com.squareup.wire.a<j1>(kotlin.jvm.internal.m0.b(j1.class), com.squareup.wire.o.PROTO_3, j1Var) { // from class: bu.j1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public j1 d(int i11) {
                return j1.Companion.a(i11);
            }
        };
    }

    j1(int i11) {
        this.value = i11;
    }

    public static final j1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}