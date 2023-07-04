package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum g implements p {
    UNDEFINED(0),
    DRIVER_FRONT_DOOR(1),
    DRIVER_REAR_DOOR(2),
    PASSENGER_FRONT_DOOR(3),
    PASSENGER_REAR_DOOR(4);
    
    public static final ProtoAdapter<g> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return null;
                            }
                            return g.PASSENGER_REAR_DOOR;
                        }
                        return g.PASSENGER_FRONT_DOOR;
                    }
                    return g.DRIVER_REAR_DOOR;
                }
                return g.DRIVER_FRONT_DOOR;
            }
            return g.UNDEFINED;
        }
    }

    static {
        g gVar;
        ADAPTER = new com.squareup.wire.a<g>(m0.b(g.class), o.PROTO_3, gVar) { // from class: ot.g.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g d(int i11) {
                return g.Companion.a(i11);
            }
        };
    }

    g(int i11) {
        this.value = i11;
    }

    public static final g fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}