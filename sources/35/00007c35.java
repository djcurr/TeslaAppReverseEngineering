package jt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum d implements p {
    PREPARED_REPORT(0),
    REPORT_UPLOAD_ATTEMPTED(1),
    REPORT_EXCEEDED_MAX_RETRYS(2),
    PROCESS_UNSUBSCRIBE_MESSAGE(3),
    SET_CONNECTIVITY_SUBSCRIPTION(4),
    SEND_FILLED_REQUEST(5),
    FETCH_VEHICLE_TOKEN_ATTEMPT(6),
    FETCH_VEHICLE_TOKEN(7),
    SEND_COMMAND_ATTEMPT(8),
    SEND_COMMAND(9),
    PROCESS_SUBSCRIBE_MESSAGE(10),
    VEHICLE_ONLINE_IN_SESSION(11),
    COMMAND_CREATED(12),
    APPLE_WATCH_PAIRED(13),
    DID_RECEIVE_MEMORY_WARNING(14),
    REALM_SIZE(15),
    DAU_PUSH_NOTIFICATION_PERMISSIONS(16),
    RECEIVED_AUTH_REQUEST(17);
    
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
            switch (i11) {
                case 0:
                    return d.PREPARED_REPORT;
                case 1:
                    return d.REPORT_UPLOAD_ATTEMPTED;
                case 2:
                    return d.REPORT_EXCEEDED_MAX_RETRYS;
                case 3:
                    return d.PROCESS_UNSUBSCRIBE_MESSAGE;
                case 4:
                    return d.SET_CONNECTIVITY_SUBSCRIPTION;
                case 5:
                    return d.SEND_FILLED_REQUEST;
                case 6:
                    return d.FETCH_VEHICLE_TOKEN_ATTEMPT;
                case 7:
                    return d.FETCH_VEHICLE_TOKEN;
                case 8:
                    return d.SEND_COMMAND_ATTEMPT;
                case 9:
                    return d.SEND_COMMAND;
                case 10:
                    return d.PROCESS_SUBSCRIBE_MESSAGE;
                case 11:
                    return d.VEHICLE_ONLINE_IN_SESSION;
                case 12:
                    return d.COMMAND_CREATED;
                case 13:
                    return d.APPLE_WATCH_PAIRED;
                case 14:
                    return d.DID_RECEIVE_MEMORY_WARNING;
                case 15:
                    return d.REALM_SIZE;
                case 16:
                    return d.DAU_PUSH_NOTIFICATION_PERMISSIONS;
                case 17:
                    return d.RECEIVED_AUTH_REQUEST;
                default:
                    return null;
            }
        }
    }

    static {
        d dVar;
        ADAPTER = new com.squareup.wire.a<d>(m0.b(d.class), o.PROTO_3, dVar) { // from class: jt.d.a
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