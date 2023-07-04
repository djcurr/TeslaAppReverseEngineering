package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum k3 implements com.squareup.wire.p {
    UWB_AVAILABILITY_UNKNOWN(0),
    UWB_AVAILABILITY_AVAILABLE(1),
    UWB_AVAILABILITY_UNAVAILABLE_UNSUPPORTED_DEVICE(2),
    UWB_AVAILABILITY_UNAVAILABLE_PERMISSION_DENIED(3),
    UWB_AVAILABILITY_UNAVAILABLE(4);
    
    public static final ProtoAdapter<k3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k3 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return k3.UWB_AVAILABILITY_UNAVAILABLE;
                        }
                        return k3.UWB_AVAILABILITY_UNAVAILABLE_PERMISSION_DENIED;
                    }
                    return k3.UWB_AVAILABILITY_UNAVAILABLE_UNSUPPORTED_DEVICE;
                }
                return k3.UWB_AVAILABILITY_AVAILABLE;
            }
            return k3.UWB_AVAILABILITY_UNKNOWN;
        }
    }

    static {
        k3 k3Var;
        ADAPTER = new com.squareup.wire.a<k3>(kotlin.jvm.internal.m0.b(k3.class), com.squareup.wire.o.PROTO_3, k3Var) { // from class: bu.k3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public k3 d(int i11) {
                return k3.Companion.a(i11);
            }
        };
    }

    k3(int i11) {
        this.value = i11;
    }

    public static final k3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}