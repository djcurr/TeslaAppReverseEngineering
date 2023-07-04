package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import com.teslamotors.plugins.ble.Peripheral;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum g implements p {
    STATUS_CODE_OK(0),
    STATUS_CODE_INVALID_MESSAGE(1),
    STATUS_CODE_INVALID_TOKEN(2),
    STATUS_CODE_PUBLISH_FAILED(3),
    STATUS_CODE_PERMISSION_DENIED_NO_TOKEN(4),
    STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN(5),
    STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED(6),
    STATUS_CODE_SERVER_ACK(1202),
    STATUS_CODE_TOO_MANY_REQUESTS(1429),
    STATUS_CODE_CLIENT_ACK(2202),
    STATUS_CODE_INTERNAL_ERROR(2500),
    STATUS_CODE_APPLICATION_OK(3200),
    STATUS_CODE_APPLICATION_ACK(3202),
    STATUS_CODE_APPLICATION_ERROR(Peripheral.PERIPHERAL_DISCONNECTION_TIMEOUT);
    
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
            if (i11 != 1202) {
                if (i11 != 1429) {
                    if (i11 != 2202) {
                        if (i11 != 2500) {
                            if (i11 != 3200) {
                                if (i11 != 3202) {
                                    if (i11 != 3500) {
                                        switch (i11) {
                                            case 0:
                                                return g.STATUS_CODE_OK;
                                            case 1:
                                                return g.STATUS_CODE_INVALID_MESSAGE;
                                            case 2:
                                                return g.STATUS_CODE_INVALID_TOKEN;
                                            case 3:
                                                return g.STATUS_CODE_PUBLISH_FAILED;
                                            case 4:
                                                return g.STATUS_CODE_PERMISSION_DENIED_NO_TOKEN;
                                            case 5:
                                                return g.STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN;
                                            case 6:
                                                return g.STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED;
                                            default:
                                                return null;
                                        }
                                    }
                                    return g.STATUS_CODE_APPLICATION_ERROR;
                                }
                                return g.STATUS_CODE_APPLICATION_ACK;
                            }
                            return g.STATUS_CODE_APPLICATION_OK;
                        }
                        return g.STATUS_CODE_INTERNAL_ERROR;
                    }
                    return g.STATUS_CODE_CLIENT_ACK;
                }
                return g.STATUS_CODE_TOO_MANY_REQUESTS;
            }
            return g.STATUS_CODE_SERVER_ACK;
        }
    }

    static {
        g gVar;
        ADAPTER = new com.squareup.wire.a<g>(m0.b(g.class), o.PROTO_3, gVar) { // from class: qt.g.a
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