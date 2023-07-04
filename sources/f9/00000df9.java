package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum r0 implements com.squareup.wire.p {
    GENEALOGYREQUEST_NONE(0),
    GENEALOGYREQUEST_READ(1),
    GENEALOGYREQUEST_KEYFOBINFO_READ(2),
    GENEALOGYREQUEST_TPWHEELUNITINFO_READ(3);
    
    public static final ProtoAdapter<r0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r0 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return r0.GENEALOGYREQUEST_TPWHEELUNITINFO_READ;
                    }
                    return r0.GENEALOGYREQUEST_KEYFOBINFO_READ;
                }
                return r0.GENEALOGYREQUEST_READ;
            }
            return r0.GENEALOGYREQUEST_NONE;
        }
    }

    static {
        r0 r0Var;
        ADAPTER = new com.squareup.wire.a<r0>(kotlin.jvm.internal.m0.b(r0.class), com.squareup.wire.o.PROTO_3, r0Var) { // from class: bu.r0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public r0 d(int i11) {
                return r0.Companion.a(i11);
            }
        };
    }

    r0(int i11) {
        this.value = i11;
    }

    public static final r0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}