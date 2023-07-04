package wq;

import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes2.dex */
public enum b {
    BLUETOOTH("bluetooth"),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    NONE(PermissionsResponse.SCOPE_NONE),
    UNKNOWN("unknown"),
    WIFI("wifi"),
    WIMAX("wimax"),
    VPN("vpn");
    
    public final String label;

    b(String str) {
        this.label = str;
    }
}