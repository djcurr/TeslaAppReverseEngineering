package t9;

import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes.dex */
public enum f {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, PermissionsResponse.SCOPE_NONE);
    

    /* renamed from: a  reason: collision with root package name */
    public int f51778a;

    /* renamed from: b  reason: collision with root package name */
    public String f51779b;

    f(int i11, String str) {
        this.f51778a = i11;
        this.f51779b = str;
    }

    public final int a() {
        return this.f51778a;
    }

    public final String b() {
        return this.f51779b;
    }

    public static f a(int i11) {
        f[] values;
        for (f fVar : values()) {
            if (fVar.a() == i11) {
                return fVar;
            }
        }
        return NONE;
    }
}