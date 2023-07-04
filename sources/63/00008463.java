package lt;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum r1 implements com.squareup.wire.p {
    RemoteNavTripOrderReplace(0),
    RemoteNavTripOrderPrepend(1),
    RemoteNavTripOrderAppend(2);
    
    public static final ProtoAdapter<r1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return r1.RemoteNavTripOrderAppend;
                }
                return r1.RemoteNavTripOrderPrepend;
            }
            return r1.RemoteNavTripOrderReplace;
        }
    }

    static {
        r1 r1Var;
        ADAPTER = new com.squareup.wire.a<r1>(kotlin.jvm.internal.m0.b(r1.class), com.squareup.wire.o.PROTO_3, r1Var) { // from class: lt.r1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public r1 d(int i11) {
                return r1.Companion.a(i11);
            }
        };
    }

    r1(int i11) {
        this.value = i11;
    }

    public static final r1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}