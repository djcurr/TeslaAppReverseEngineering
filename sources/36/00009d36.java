package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class HeartbeatMessageType {
    public static final short heartbeat_request = 1;
    public static final short heartbeat_response = 2;

    public static boolean isValid(short s11) {
        return s11 >= 1 && s11 <= 2;
    }
}