package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum d implements com.squareup.wire.p {
    ACTIVITY_NONE(0),
    ACTIVITY_STATIONARY(1),
    ACTIVITY_MOTION(2),
    ACTIVITY_SIGNIFICANT_MOTION(3);
    
    public static final ProtoAdapter<d> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return d.ACTIVITY_SIGNIFICANT_MOTION;
                    }
                    return d.ACTIVITY_MOTION;
                }
                return d.ACTIVITY_STATIONARY;
            }
            return d.ACTIVITY_NONE;
        }
    }

    static {
        d dVar;
        ADAPTER = new com.squareup.wire.a<d>(kotlin.jvm.internal.m0.b(d.class), com.squareup.wire.o.PROTO_3, dVar) { // from class: bu.d.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d d(int i11) {
                return d.Companion.a(i11);
            }
        };
    }

    d(int i11) {
        this.value = i11;
    }

    public static final d fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}