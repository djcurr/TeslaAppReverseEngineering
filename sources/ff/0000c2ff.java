package yt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public enum c implements p {
    MESSAGEFAULT_ERROR_NONE(0),
    MESSAGEFAULT_ERROR_BUSY(1),
    MESSAGEFAULT_ERROR_TIMEOUT(2),
    MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID(3),
    MESSAGEFAULT_ERROR_INACTIVE_KEY(4),
    MESSAGEFAULT_ERROR_INVALID_SIGNATURE(5),
    MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER(6),
    MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES(7),
    MESSAGEFAULT_ERROR_INVALID_DOMAINS(8),
    MESSAGEFAULT_ERROR_INVALID_COMMAND(9),
    MESSAGEFAULT_ERROR_DECODING(10),
    MESSAGEFAULT_ERROR_INTERNAL(11),
    MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION(12),
    MESSAGEFAULT_ERROR_BAD_PARAMETER(13),
    MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL(14),
    MESSAGEFAULT_ERROR_INCORRECT_EPOCH(15),
    MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH(16),
    MESSAGEFAULT_ERROR_TIME_EXPIRED(17),
    MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY(18),
    MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA(19),
    MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG(20),
    MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED(21),
    MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED(22),
    MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS(23);
    
    public static final ProtoAdapter<c> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(int i11) {
            switch (i11) {
                case 0:
                    return c.MESSAGEFAULT_ERROR_NONE;
                case 1:
                    return c.MESSAGEFAULT_ERROR_BUSY;
                case 2:
                    return c.MESSAGEFAULT_ERROR_TIMEOUT;
                case 3:
                    return c.MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID;
                case 4:
                    return c.MESSAGEFAULT_ERROR_INACTIVE_KEY;
                case 5:
                    return c.MESSAGEFAULT_ERROR_INVALID_SIGNATURE;
                case 6:
                    return c.MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER;
                case 7:
                    return c.MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES;
                case 8:
                    return c.MESSAGEFAULT_ERROR_INVALID_DOMAINS;
                case 9:
                    return c.MESSAGEFAULT_ERROR_INVALID_COMMAND;
                case 10:
                    return c.MESSAGEFAULT_ERROR_DECODING;
                case 11:
                    return c.MESSAGEFAULT_ERROR_INTERNAL;
                case 12:
                    return c.MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION;
                case 13:
                    return c.MESSAGEFAULT_ERROR_BAD_PARAMETER;
                case 14:
                    return c.MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL;
                case 15:
                    return c.MESSAGEFAULT_ERROR_INCORRECT_EPOCH;
                case 16:
                    return c.MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH;
                case 17:
                    return c.MESSAGEFAULT_ERROR_TIME_EXPIRED;
                case 18:
                    return c.MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY;
                case 19:
                    return c.MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA;
                case 20:
                    return c.MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG;
                case 21:
                    return c.MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED;
                case 22:
                    return c.MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED;
                case 23:
                    return c.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS;
                default:
                    return null;
            }
        }
    }

    static {
        c cVar;
        ADAPTER = new com.squareup.wire.a<c>(m0.b(c.class), o.PROTO_3, cVar) { // from class: yt.c.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c d(int i11) {
                return c.Companion.a(i11);
            }
        };
    }

    c(int i11) {
        this.value = i11;
    }

    public static final c fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}