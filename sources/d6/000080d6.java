package kt;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum q implements com.squareup.wire.p {
    StwHeatLevel_Unknown(0),
    StwHeatLevel_Off(1),
    StwHeatLevel_Low(2),
    StwHeatLevel_High(3);
    
    public static final ProtoAdapter<q> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return q.StwHeatLevel_High;
                    }
                    return q.StwHeatLevel_Low;
                }
                return q.StwHeatLevel_Off;
            }
            return q.StwHeatLevel_Unknown;
        }
    }

    static {
        q qVar;
        ADAPTER = new com.squareup.wire.a<q>(m0.b(q.class), com.squareup.wire.o.PROTO_3, qVar) { // from class: kt.q.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public q d(int i11) {
                return q.Companion.a(i11);
            }
        };
    }

    q(int i11) {
        this.value = i11;
    }

    public static final q fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}