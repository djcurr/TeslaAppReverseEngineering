package com.adyen.threeds2.parameters;

import com.adyen.threeds2.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ConfigParameters {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f9721a = new HashMap();

    private Map<String, String> a(String str, boolean z11) {
        Map<String, String> map = this.f9721a.get(str);
        if (z11 && map == null) {
            HashMap hashMap = new HashMap();
            this.f9721a.put(str, hashMap);
            return hashMap;
        }
        return map;
    }

    public void addParam(String str, String str2, String str3) {
        Preconditions.requireNonNull("paramName", str2);
        a(str, true).put(str2, str3);
    }

    public Map<String, String> getGroup(String str) {
        return a(str, false);
    }

    public String getParamValue(String str, String str2) {
        Preconditions.requireNonNull("paramName", str2);
        Map<String, String> a11 = a(str, false);
        if (a11 != null) {
            return a11.get(str2);
        }
        return null;
    }

    public String removeParam(String str, String str2) {
        Preconditions.requireNonNull("paramName", str2);
        Map<String, String> a11 = a(str, false);
        if (a11 != null) {
            return a11.remove(str2);
        }
        return null;
    }
}