package st;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum e implements p {
    ERROR_CODE_INVALID(0),
    ERROR_CODE_FEATURE_NOT_SUPPORTED(1),
    ERROR_CODE_INTERNAL(2);
    
    public static final ProtoAdapter<e> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return e.ERROR_CODE_INTERNAL;
                }
                return e.ERROR_CODE_FEATURE_NOT_SUPPORTED;
            }
            return e.ERROR_CODE_INVALID;
        }
    }

    static {
        e eVar;
        ADAPTER = new com.squareup.wire.a<e>(m0.b(e.class), o.PROTO_3, eVar) { // from class: st.e.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e d(int i11) {
                return e.Companion.a(i11);
            }
        };
    }

    e(int i11) {
        this.value = i11;
    }

    public static final e fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}