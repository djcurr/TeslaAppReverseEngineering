package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class CertChainType {
    public static final short individual_certs = 0;
    public static final short pkipath = 1;

    public static boolean isValid(short s11) {
        return s11 >= 0 && s11 <= 1;
    }
}