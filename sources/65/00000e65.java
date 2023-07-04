package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum y1 implements com.squareup.wire.p {
    OPERATIONSTATUS_OK(0),
    OPERATIONSTATUS_WAIT(1),
    OPERATIONSTATUS_ERROR(2);
    
    public static final ProtoAdapter<y1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return y1.OPERATIONSTATUS_ERROR;
                }
                return y1.OPERATIONSTATUS_WAIT;
            }
            return y1.OPERATIONSTATUS_OK;
        }
    }

    static {
        y1 y1Var;
        ADAPTER = new com.squareup.wire.a<y1>(kotlin.jvm.internal.m0.b(y1.class), com.squareup.wire.o.PROTO_3, y1Var) { // from class: bu.y1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public y1 d(int i11) {
                return y1.Companion.a(i11);
            }
        };
    }

    y1(int i11) {
        this.value = i11;
    }

    public static final y1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}