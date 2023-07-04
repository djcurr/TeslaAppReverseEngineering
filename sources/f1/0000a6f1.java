package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum h implements p {
    INITIAL_STATE(0),
    FETCHING_USER_TOKEN(1),
    WEBSOCKET_CONNECTING(2),
    FETCHING_VEHICLE_TOKEN(3),
    WAKING_VEHICLE(4),
    FETCHING_SESSION_INFO(5),
    READY(6);
    
    public static final ProtoAdapter<h> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(int i11) {
            switch (i11) {
                case 0:
                    return h.INITIAL_STATE;
                case 1:
                    return h.FETCHING_USER_TOKEN;
                case 2:
                    return h.WEBSOCKET_CONNECTING;
                case 3:
                    return h.FETCHING_VEHICLE_TOKEN;
                case 4:
                    return h.WAKING_VEHICLE;
                case 5:
                    return h.FETCHING_SESSION_INFO;
                case 6:
                    return h.READY;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar;
        ADAPTER = new com.squareup.wire.a<h>(m0.b(h.class), o.PROTO_3, hVar) { // from class: ot.h.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public h d(int i11) {
                return h.Companion.a(i11);
            }
        };
    }

    h(int i11) {
        this.value = i11;
    }

    public static final h fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}