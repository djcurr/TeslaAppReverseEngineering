package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum s1 implements com.squareup.wire.p {
    NFCSEC_DEVICEPUBKEY_STATE_NONE(0),
    NFCSEC_DEVICEPUBKEY_STATE_RETRIEVED(1),
    NFCSEC_DEVICEPUBKEY_STATE_NOT_RETRIEVED(2);
    
    public static final ProtoAdapter<s1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return s1.NFCSEC_DEVICEPUBKEY_STATE_NOT_RETRIEVED;
                }
                return s1.NFCSEC_DEVICEPUBKEY_STATE_RETRIEVED;
            }
            return s1.NFCSEC_DEVICEPUBKEY_STATE_NONE;
        }
    }

    static {
        s1 s1Var;
        ADAPTER = new com.squareup.wire.a<s1>(kotlin.jvm.internal.m0.b(s1.class), com.squareup.wire.o.PROTO_3, s1Var) { // from class: bu.s1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public s1 d(int i11) {
                return s1.Companion.a(i11);
            }
        };
    }

    s1(int i11) {
        this.value = i11;
    }

    public static final s1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}