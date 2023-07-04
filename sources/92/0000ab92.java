package pt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum a implements p {
    GENERICERROR_NONE(0),
    GENERICERROR_UNKNOWN(1),
    GENERICERROR_CLOSURES_OPEN(2),
    GENERICERROR_ALREADY_ON(3),
    GENERICERROR_DISABLED_FOR_USER_COMMAND(4),
    GENERICERROR_VEHICLE_NOT_IN_PARK(5),
    GENERICERROR_UNAUTHORIZED(6),
    GENERICERROR_NOT_ALLOWED_OVER_TRANSPORT(7);
    
    public static final ProtoAdapter<a> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i11) {
            switch (i11) {
                case 0:
                    return a.GENERICERROR_NONE;
                case 1:
                    return a.GENERICERROR_UNKNOWN;
                case 2:
                    return a.GENERICERROR_CLOSURES_OPEN;
                case 3:
                    return a.GENERICERROR_ALREADY_ON;
                case 4:
                    return a.GENERICERROR_DISABLED_FOR_USER_COMMAND;
                case 5:
                    return a.GENERICERROR_VEHICLE_NOT_IN_PARK;
                case 6:
                    return a.GENERICERROR_UNAUTHORIZED;
                case 7:
                    return a.GENERICERROR_NOT_ALLOWED_OVER_TRANSPORT;
                default:
                    return null;
            }
        }
    }

    static {
        a aVar;
        ADAPTER = new com.squareup.wire.a<a>(m0.b(a.class), o.PROTO_3, aVar) { // from class: pt.a.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a d(int i11) {
                return a.Companion.a(i11);
            }
        };
    }

    a(int i11) {
        this.value = i11;
    }

    public static final a fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}