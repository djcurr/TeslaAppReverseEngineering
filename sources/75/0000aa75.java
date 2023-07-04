package p9;

import android.text.TextUtils;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes.dex */
public enum a {
    None(PermissionsResponse.SCOPE_NONE),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");
    

    /* renamed from: a  reason: collision with root package name */
    public String f46408a;

    a(String str) {
        this.f46408a = str;
    }

    public static a a(String str) {
        a[] values;
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        for (a aVar2 : values()) {
            if (str.startsWith(aVar2.f46408a)) {
                return aVar2;
            }
        }
        return aVar;
    }
}