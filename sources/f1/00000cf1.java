package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum a1 implements com.squareup.wire.p {
    IMU_STATE_NOT_CONFIGURED(0),
    IMU_STATE_ACTIVITY(1),
    IMU_STATE_INACTIVITY(2);
    
    public static final ProtoAdapter<a1> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a1 a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return null;
                    }
                    return a1.IMU_STATE_INACTIVITY;
                }
                return a1.IMU_STATE_ACTIVITY;
            }
            return a1.IMU_STATE_NOT_CONFIGURED;
        }
    }

    static {
        a1 a1Var;
        ADAPTER = new com.squareup.wire.a<a1>(kotlin.jvm.internal.m0.b(a1.class), com.squareup.wire.o.PROTO_3, a1Var) { // from class: bu.a1.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a1 d(int i11) {
                return a1.Companion.a(i11);
            }
        };
    }

    a1(int i11) {
        this.value = i11;
    }

    public static final a1 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}