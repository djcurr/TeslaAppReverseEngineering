package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum a0 implements com.squareup.wire.p {
    CERTIFICATE_STATUS_NONE(0),
    CERITFICATE_STATUS_NOT_WRITTEN(1),
    CERTIFICATE_STATUS_WRITTEN(2);
    
    public static final ProtoAdapter<a0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return a0.CERTIFICATE_STATUS_WRITTEN;
                }
                return a0.CERITFICATE_STATUS_NOT_WRITTEN;
            }
            return a0.CERTIFICATE_STATUS_NONE;
        }
    }

    static {
        a0 a0Var;
        ADAPTER = new com.squareup.wire.a<a0>(kotlin.jvm.internal.m0.b(a0.class), com.squareup.wire.o.PROTO_3, a0Var) { // from class: bu.a0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a0 d(int i11) {
                return a0.Companion.a(i11);
            }
        };
    }

    a0(int i11) {
        this.value = i11;
    }

    public static final a0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}