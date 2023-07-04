package org.spongycastle.crypto.tls;

import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes4.dex */
public class HashAlgorithm {
    public static final short md5 = 1;
    public static final short none = 0;
    public static final short sha1 = 2;
    public static final short sha224 = 3;
    public static final short sha256 = 4;
    public static final short sha384 = 5;
    public static final short sha512 = 6;

    public static String getName(short s11) {
        switch (s11) {
            case 0:
                return PermissionsResponse.SCOPE_NONE;
            case 1:
                return "md5";
            case 2:
                return "sha1";
            case 3:
                return "sha224";
            case 4:
                return "sha256";
            case 5:
                return "sha384";
            case 6:
                return "sha512";
            default:
                return "UNKNOWN";
        }
    }

    public static String getText(short s11) {
        return getName(s11) + "(" + ((int) s11) + ")";
    }

    public static boolean isPrivate(short s11) {
        return 224 <= s11 && s11 <= 255;
    }
}