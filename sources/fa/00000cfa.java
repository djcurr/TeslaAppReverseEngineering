package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum a4 implements com.squareup.wire.p {
    WHITELISTKEYPERMISSION_ADD_TO_WHITELIST(0),
    WHITELISTKEYPERMISSION_LOCAL_UNLOCK(1),
    WHITELISTKEYPERMISSION_LOCAL_DRIVE(2),
    WHITELISTKEYPERMISSION_REMOTE_UNLOCK(3),
    WHITELISTKEYPERMISSION_REMOTE_DRIVE(4),
    WHITELISTKEYPERMISSION_CHANGE_PERMISSIONS(5),
    WHITELISTKEYPERMISSION_REMOVE_FROM_WHITELIST(6),
    WHITELISTKEYPERMISSION_REMOVE_SELF_FROM_WHITELIST(7),
    WHITELISTKEYPERMISSION_MODIFY_FLEET_RESERVED_SLOTS(8),
    WHITELISTKEYPERMISSION_UNKNOWN(31);
    
    public static final ProtoAdapter<a4> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a4 a(int i11) {
            if (i11 != 31) {
                switch (i11) {
                    case 0:
                        return a4.WHITELISTKEYPERMISSION_ADD_TO_WHITELIST;
                    case 1:
                        return a4.WHITELISTKEYPERMISSION_LOCAL_UNLOCK;
                    case 2:
                        return a4.WHITELISTKEYPERMISSION_LOCAL_DRIVE;
                    case 3:
                        return a4.WHITELISTKEYPERMISSION_REMOTE_UNLOCK;
                    case 4:
                        return a4.WHITELISTKEYPERMISSION_REMOTE_DRIVE;
                    case 5:
                        return a4.WHITELISTKEYPERMISSION_CHANGE_PERMISSIONS;
                    case 6:
                        return a4.WHITELISTKEYPERMISSION_REMOVE_FROM_WHITELIST;
                    case 7:
                        return a4.WHITELISTKEYPERMISSION_REMOVE_SELF_FROM_WHITELIST;
                    case 8:
                        return a4.WHITELISTKEYPERMISSION_MODIFY_FLEET_RESERVED_SLOTS;
                    default:
                        return null;
                }
            }
            return a4.WHITELISTKEYPERMISSION_UNKNOWN;
        }
    }

    static {
        a4 a4Var;
        ADAPTER = new com.squareup.wire.a<a4>(kotlin.jvm.internal.m0.b(a4.class), com.squareup.wire.o.PROTO_3, a4Var) { // from class: bu.a4.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a4 d(int i11) {
                return a4.Companion.a(i11);
            }
        };
    }

    a4(int i11) {
        this.value = i11;
    }

    public static final a4 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}