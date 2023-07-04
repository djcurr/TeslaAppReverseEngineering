package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum t0 implements com.squareup.wire.p {
    GENEALOGY_STATUS_NONE(0),
    GENEALOGY_STATUS_NOT_WRITTEN(1),
    GENEALOGY_STATUS_WRITE_SUCCESS(2),
    GENEALOGY_STATUS_WRITE_FAILURE(3),
    GENEALOGY_STATUS_READ_SUCCESS(4),
    GENEALOGY_STATUS_READ_FAILURE(5),
    GENEALOGY_STATUS_CRC_FAILURE(6);
    
    public static final ProtoAdapter<t0> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t0 a(int i11) {
            switch (i11) {
                case 0:
                    return t0.GENEALOGY_STATUS_NONE;
                case 1:
                    return t0.GENEALOGY_STATUS_NOT_WRITTEN;
                case 2:
                    return t0.GENEALOGY_STATUS_WRITE_SUCCESS;
                case 3:
                    return t0.GENEALOGY_STATUS_WRITE_FAILURE;
                case 4:
                    return t0.GENEALOGY_STATUS_READ_SUCCESS;
                case 5:
                    return t0.GENEALOGY_STATUS_READ_FAILURE;
                case 6:
                    return t0.GENEALOGY_STATUS_CRC_FAILURE;
                default:
                    return null;
            }
        }
    }

    static {
        t0 t0Var;
        ADAPTER = new com.squareup.wire.a<t0>(kotlin.jvm.internal.m0.b(t0.class), com.squareup.wire.o.PROTO_3, t0Var) { // from class: bu.t0.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public t0 d(int i11) {
                return t0.Companion.a(i11);
            }
        };
    }

    t0(int i11) {
        this.value = i11;
    }

    public static final t0 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}