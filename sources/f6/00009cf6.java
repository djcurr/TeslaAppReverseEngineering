package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class AlertLevel {
    public static final short fatal = 2;
    public static final short warning = 1;

    public static String getName(short s11) {
        return s11 != 1 ? s11 != 2 ? "UNKNOWN" : "fatal" : "warning";
    }

    public static String getText(short s11) {
        return getName(s11) + "(" + ((int) s11) + ")";
    }
}