package lv;

import bu.p2;
import bu.y1;

/* loaded from: classes6.dex */
public enum b {
    OK,
    WAIT,
    ERROR;

    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37746a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f37747b;

        static {
            int[] iArr = new int[p2.values().length];
            f37747b = iArr;
            try {
                iArr[p2.SIGNEDMESSAGE_INFORMATION_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37747b[p2.SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[y1.values().length];
            f37746a = iArr2;
            try {
                iArr2[y1.OPERATIONSTATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37746a[y1.OPERATIONSTATUS_WAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37746a[y1.OPERATIONSTATUS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static String fromMessageInformation(p2 p2Var) {
        int i11 = a.f37747b[p2Var.ordinal()];
        return i11 != 1 ? i11 != 2 ? "PHONE_KEY_COMMAND_FAILURE" : "PHONE_KEY_NOT_ON_WHITELIST" : "PHONE_KEY_COMMAND_NO_ERROR";
    }

    public static b fromOperationStatus(y1 y1Var) {
        int i11 = a.f37746a[y1Var.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return ERROR;
            }
            return WAIT;
        }
        return OK;
    }
}