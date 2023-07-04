package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum c4 implements com.squareup.wire.p {
    WHITELISTOPERATION_INFORMATION_NONE(0),
    WHITELISTOPERATION_INFORMATION_UNDOCUMENTED_ERROR(1),
    WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_REMOVE_ONESELF(2),
    WHITELISTOPERATION_INFORMATION_KEYFOB_SLOTS_FULL(3),
    WHITELISTOPERATION_INFORMATION_WHITELIST_FULL(4),
    WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_ADD(5),
    WHITELISTOPERATION_INFORMATION_INVALID_PUBLIC_KEY(6),
    WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_REMOVE(7),
    WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_CHANGE_PERMISSIONS(8),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ELEVATE_OTHER_ABOVE_ONESELF(9),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_DEMOTE_SUPERIOR_TO_ONESELF(10),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_REMOVE_OWN_PERMISSIONS(11),
    WHITELISTOPERATION_INFORMATION_PUBLIC_KEY_NOT_ON_WHITELIST(12),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_THAT_IS_ALREADY_ON_THE_WHITELIST(13),
    WHITELISTOPERATION_INFORMATION_NOT_ALLOWED_TO_ADD_UNLESS_ON_READER(14),
    WHITELISTOPERATION_INFORMATION_FM_MODIFYING_OUTSIDE_OF_F_MODE(15),
    WHITELISTOPERATION_INFORMATION_FM_ATTEMPTING_TO_ADD_PERMANENT_KEY(16),
    WHITELISTOPERATION_INFORMATION_FM_ATTEMPTING_TO_REMOVE_PERMANENT_KEY(17),
    WHITELISTOPERATION_INFORMATION_KEYCHAIN_WHILE_FS_FULL(18),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_WITHOUT_ROLE(19),
    WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_WITH_SERVICE_ROLE(20),
    WHITELISTOPERATION_INFORMATION_NON_SERVICE_KEY_ATTEMPTING_TO_ADD_SERVICE_TECH(21),
    WHITELISTOPERATION_INFORMATION_SERVICE_KEY_ATTEMPTING_TO_ADD_SERVICE_TECH_OUTSIDE_SERVICE_MODE(22);
    
    public static final ProtoAdapter<c4> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c4 a(int i11) {
            switch (i11) {
                case 0:
                    return c4.WHITELISTOPERATION_INFORMATION_NONE;
                case 1:
                    return c4.WHITELISTOPERATION_INFORMATION_UNDOCUMENTED_ERROR;
                case 2:
                    return c4.WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_REMOVE_ONESELF;
                case 3:
                    return c4.WHITELISTOPERATION_INFORMATION_KEYFOB_SLOTS_FULL;
                case 4:
                    return c4.WHITELISTOPERATION_INFORMATION_WHITELIST_FULL;
                case 5:
                    return c4.WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_ADD;
                case 6:
                    return c4.WHITELISTOPERATION_INFORMATION_INVALID_PUBLIC_KEY;
                case 7:
                    return c4.WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_REMOVE;
                case 8:
                    return c4.WHITELISTOPERATION_INFORMATION_NO_PERMISSION_TO_CHANGE_PERMISSIONS;
                case 9:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ELEVATE_OTHER_ABOVE_ONESELF;
                case 10:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_DEMOTE_SUPERIOR_TO_ONESELF;
                case 11:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_REMOVE_OWN_PERMISSIONS;
                case 12:
                    return c4.WHITELISTOPERATION_INFORMATION_PUBLIC_KEY_NOT_ON_WHITELIST;
                case 13:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_THAT_IS_ALREADY_ON_THE_WHITELIST;
                case 14:
                    return c4.WHITELISTOPERATION_INFORMATION_NOT_ALLOWED_TO_ADD_UNLESS_ON_READER;
                case 15:
                    return c4.WHITELISTOPERATION_INFORMATION_FM_MODIFYING_OUTSIDE_OF_F_MODE;
                case 16:
                    return c4.WHITELISTOPERATION_INFORMATION_FM_ATTEMPTING_TO_ADD_PERMANENT_KEY;
                case 17:
                    return c4.WHITELISTOPERATION_INFORMATION_FM_ATTEMPTING_TO_REMOVE_PERMANENT_KEY;
                case 18:
                    return c4.WHITELISTOPERATION_INFORMATION_KEYCHAIN_WHILE_FS_FULL;
                case 19:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_WITHOUT_ROLE;
                case 20:
                    return c4.WHITELISTOPERATION_INFORMATION_ATTEMPTING_TO_ADD_KEY_WITH_SERVICE_ROLE;
                case 21:
                    return c4.WHITELISTOPERATION_INFORMATION_NON_SERVICE_KEY_ATTEMPTING_TO_ADD_SERVICE_TECH;
                case 22:
                    return c4.WHITELISTOPERATION_INFORMATION_SERVICE_KEY_ATTEMPTING_TO_ADD_SERVICE_TECH_OUTSIDE_SERVICE_MODE;
                default:
                    return null;
            }
        }
    }

    static {
        c4 c4Var;
        ADAPTER = new com.squareup.wire.a<c4>(kotlin.jvm.internal.m0.b(c4.class), com.squareup.wire.o.PROTO_3, c4Var) { // from class: bu.c4.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c4 d(int i11) {
                return c4.Companion.a(i11);
            }
        };
    }

    c4(int i11) {
        this.value = i11;
    }

    public static final c4 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}