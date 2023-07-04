package lt;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum l1 implements com.squareup.wire.p {
    OPERATIONSTATUS_OK(0),
    OPERATIONSTATUS_ERROR(1);
    
    public static final ProtoAdapter<l1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return null;
                }
                return l1.OPERATIONSTATUS_ERROR;
            }
            return l1.OPERATIONSTATUS_OK;
        }
    }

    static {
        l1 l1Var;
        ADAPTER = new com.squareup.wire.a<l1>(kotlin.jvm.internal.m0.b(l1.class), com.squareup.wire.o.PROTO_3, l1Var) { // from class: lt.l1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public l1 d(int i11) {
                return l1.Companion.a(i11);
            }
        };
    }

    l1(int i11) {
        this.value = i11;
    }

    public static final l1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}