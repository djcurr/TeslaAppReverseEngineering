package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y0 extends l1 {
    private y0(Map<String, Integer> map) {
        super(map);
    }

    public static y0 f() {
        return new y0(new ArrayMap());
    }

    public static y0 g(l1 l1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : l1Var.d()) {
            arrayMap.put(str, l1Var.c(str));
        }
        return new y0(arrayMap);
    }

    public void e(l1 l1Var) {
        Map<String, Integer> map;
        Map<String, Integer> map2 = this.f2329a;
        if (map2 == null || (map = l1Var.f2329a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void h(String str, Integer num) {
        this.f2329a.put(str, num);
    }
}