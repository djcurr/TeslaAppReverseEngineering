package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum n2 implements com.squareup.wire.p {
    SIGNATURE_TYPE_AES_GCM(0),
    SIGNATURE_TYPE_ECDSA(1),
    SIGNATURE_TYPE_PRESENT_KEY(2),
    SIGNATURE_TYPE_AES_GCM_TOKEN(3),
    SIGNATURE_TYPE_UNSIGNED(4);
    
    public static final ProtoAdapter<n2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return n2.SIGNATURE_TYPE_UNSIGNED;
                        }
                        return n2.SIGNATURE_TYPE_AES_GCM_TOKEN;
                    }
                    return n2.SIGNATURE_TYPE_PRESENT_KEY;
                }
                return n2.SIGNATURE_TYPE_ECDSA;
            }
            return n2.SIGNATURE_TYPE_AES_GCM;
        }
    }

    static {
        n2 n2Var;
        ADAPTER = new com.squareup.wire.a<n2>(kotlin.jvm.internal.m0.b(n2.class), com.squareup.wire.o.PROTO_3, n2Var) { // from class: bu.n2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public n2 d(int i11) {
                return n2.Companion.a(i11);
            }
        };
    }

    n2(int i11) {
        this.value = i11;
    }

    public static final n2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}