package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class NameType {
    public static final short host_name = 0;

    public static boolean isValid(short s11) {
        return s11 == 0;
    }
}