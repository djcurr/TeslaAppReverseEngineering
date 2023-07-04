package org.godotengine.godot;

import java.util.HashMap;

/* loaded from: classes5.dex */
public class Dictionary extends HashMap<String, Object> {
    protected String[] keys_cache;

    public String[] get_keys() {
        String[] strArr = new String[size()];
        int i11 = 0;
        for (String str : keySet()) {
            strArr[i11] = str;
            i11++;
        }
        return strArr;
    }

    public Object[] get_values() {
        Object[] objArr = new Object[size()];
        int i11 = 0;
        for (String str : keySet()) {
            objArr[i11] = get(str);
            i11++;
        }
        return objArr;
    }

    public void set_keys(String[] strArr) {
        this.keys_cache = strArr;
    }

    public void set_values(Object[] objArr) {
        int i11 = 0;
        for (String str : this.keys_cache) {
            put(str, objArr[i11]);
            i11++;
        }
        this.keys_cache = null;
    }
}