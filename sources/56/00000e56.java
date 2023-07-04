package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum x1 implements com.squareup.wire.p {
    NFCSEC_VEHICLEPUBKEY_STATE_NONE(0),
    NFCSEC_VEHICLEPUBKEY_STATE_RETRIEVED(1),
    NFCSEC_VEHICLEPUBKEY_STATE_NOT_RETRIEVED(2);
    
    public static final ProtoAdapter<x1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return x1.NFCSEC_VEHICLEPUBKEY_STATE_NOT_RETRIEVED;
                }
                return x1.NFCSEC_VEHICLEPUBKEY_STATE_RETRIEVED;
            }
            return x1.NFCSEC_VEHICLEPUBKEY_STATE_NONE;
        }
    }

    static {
        x1 x1Var;
        ADAPTER = new com.squareup.wire.a<x1>(kotlin.jvm.internal.m0.b(x1.class), com.squareup.wire.o.PROTO_3, x1Var) { // from class: bu.x1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public x1 d(int i11) {
                return x1.Companion.a(i11);
            }
        };
    }

    x1(int i11) {
        this.value = i11;
    }

    public static final x1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}