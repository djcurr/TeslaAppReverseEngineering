package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum v1 implements com.squareup.wire.p {
    NFCSEC_SHAREDSECRET_STATE_NONE(0),
    NFCSEC_SHAREDSECRET_STATE_GENERATED(1),
    NFCSEC_SHAREDSECRET_STATE_NOT_GENERATED(2);
    
    public static final ProtoAdapter<v1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return v1.NFCSEC_SHAREDSECRET_STATE_NOT_GENERATED;
                }
                return v1.NFCSEC_SHAREDSECRET_STATE_GENERATED;
            }
            return v1.NFCSEC_SHAREDSECRET_STATE_NONE;
        }
    }

    static {
        v1 v1Var;
        ADAPTER = new com.squareup.wire.a<v1>(kotlin.jvm.internal.m0.b(v1.class), com.squareup.wire.o.PROTO_3, v1Var) { // from class: bu.v1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public v1 d(int i11) {
                return v1.Companion.a(i11);
            }
        };
    }

    v1(int i11) {
        this.value = i11;
    }

    public static final v1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}