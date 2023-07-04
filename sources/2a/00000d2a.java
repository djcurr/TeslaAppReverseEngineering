package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum d2 implements com.squareup.wire.p {
    PUBLIC_KEY_STATUS_NONE(0),
    PUBLIC_KEY_STATUS_NOT_WRITTEN(1),
    PUBLIC_KEY_STATUS_WRITTEN(2);
    
    public static final ProtoAdapter<d2> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d2 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return d2.PUBLIC_KEY_STATUS_WRITTEN;
                }
                return d2.PUBLIC_KEY_STATUS_NOT_WRITTEN;
            }
            return d2.PUBLIC_KEY_STATUS_NONE;
        }
    }

    static {
        d2 d2Var;
        ADAPTER = new com.squareup.wire.a<d2>(kotlin.jvm.internal.m0.b(d2.class), com.squareup.wire.o.PROTO_3, d2Var) { // from class: bu.d2.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d2 d(int i11) {
                return d2.Companion.a(i11);
            }
        };
    }

    d2(int i11) {
        this.value = i11;
    }

    public static final d2 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}