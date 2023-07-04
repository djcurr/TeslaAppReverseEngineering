package bu;

import com.squareup.wire.ProtoAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public enum s3 implements com.squareup.wire.p {
    UPDATER_STATUS_CODE_ERROR(0),
    UPDATER_STATUS_CODE_WAIT(1),
    UPDATER_STATUS_CODE_BLOCK_STAGED(2),
    UPDATER_STATUS_CODE_IMAGE_STAGED(3),
    UPDATER_STATUS_CODE_CRC_CHECK_SUCCESS(4),
    UPDATER_STATUS_CODE_CRC_CHECK_FAIL(5),
    UPDATER_STATUS_CODE_HASH_FAIL(6),
    UPDATER_STATUS_CODE_SIGNATURE_FAIL(7),
    UPDATER_STATUS_CODE_ERROR_HASH_RESTORE_FAIL(8),
    UPDATER_STATUS_CODE_LOCATION_SET(9);
    
    public static final ProtoAdapter<s3> ADAPTER;
    public static final b Companion = new b(null);
    private final int value;

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s3 a(int i11) {
            switch (i11) {
                case 0:
                    return s3.UPDATER_STATUS_CODE_ERROR;
                case 1:
                    return s3.UPDATER_STATUS_CODE_WAIT;
                case 2:
                    return s3.UPDATER_STATUS_CODE_BLOCK_STAGED;
                case 3:
                    return s3.UPDATER_STATUS_CODE_IMAGE_STAGED;
                case 4:
                    return s3.UPDATER_STATUS_CODE_CRC_CHECK_SUCCESS;
                case 5:
                    return s3.UPDATER_STATUS_CODE_CRC_CHECK_FAIL;
                case 6:
                    return s3.UPDATER_STATUS_CODE_HASH_FAIL;
                case 7:
                    return s3.UPDATER_STATUS_CODE_SIGNATURE_FAIL;
                case 8:
                    return s3.UPDATER_STATUS_CODE_ERROR_HASH_RESTORE_FAIL;
                case 9:
                    return s3.UPDATER_STATUS_CODE_LOCATION_SET;
                default:
                    return null;
            }
        }
    }

    static {
        s3 s3Var;
        ADAPTER = new com.squareup.wire.a<s3>(kotlin.jvm.internal.m0.b(s3.class), com.squareup.wire.o.PROTO_3, s3Var) { // from class: bu.s3.a
            @Override // com.squareup.wire.a
            /* renamed from: f */
            public s3 d(int i11) {
                return s3.Companion.a(i11);
            }
        };
    }

    s3(int i11) {
        this.value = i11;
    }

    public static final s3 fromValue(int i11) {
        return Companion.a(i11);
    }

    @Override // com.squareup.wire.p
    public int getValue() {
        return this.value;
    }
}