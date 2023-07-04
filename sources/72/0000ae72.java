package qt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum a implements p {
    COMMAND_TYPE_OK(0),
    COMMAND_TYPE_ERROR_RESPONSE(1031),
    COMMAND_TYPE_DEVICE_CONNECTED(1044),
    COMMAND_TYPE_DEVICE_DISCONNECTED(1046),
    COMMAND_TYPE_SIGNED_COMMAND(1047),
    COMMAND_TYPE_SIGNED_COMMAND_RESPONSE(1048),
    COMMAND_TYPE_SIGNED_COMMAND_ERROR(1049),
    COMMAND_TYPE_STREAMING_CONFIG(1056),
    COMMAND_TYPE_GET_VAULT(1059),
    COMMAND_TYPE_SAVE_VAULT(1060);
    
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
            if (i11 != 0) {
                if (i11 != 1031) {
                    if (i11 != 1044) {
                        if (i11 != 1056) {
                            if (i11 != 1059) {
                                if (i11 != 1060) {
                                    switch (i11) {
                                        case 1046:
                                            return a.COMMAND_TYPE_DEVICE_DISCONNECTED;
                                        case 1047:
                                            return a.COMMAND_TYPE_SIGNED_COMMAND;
                                        case 1048:
                                            return a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE;
                                        case 1049:
                                            return a.COMMAND_TYPE_SIGNED_COMMAND_ERROR;
                                        default:
                                            return null;
                                    }
                                }
                                return a.COMMAND_TYPE_SAVE_VAULT;
                            }
                            return a.COMMAND_TYPE_GET_VAULT;
                        }
                        return a.COMMAND_TYPE_STREAMING_CONFIG;
                    }
                    return a.COMMAND_TYPE_DEVICE_CONNECTED;
                }
                return a.COMMAND_TYPE_ERROR_RESPONSE;
            }
            return a.COMMAND_TYPE_OK;
        }
    }

    static {
        a aVar;
        ADAPTER = new com.squareup.wire.a<a>(m0.b(a.class), o.PROTO_3, aVar) { // from class: qt.a.a
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