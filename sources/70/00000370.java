package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: b  reason: collision with root package name */
    private static final l1 f2328b = new l1(new ArrayMap());

    /* renamed from: a  reason: collision with root package name */
    protected final Map<String, Integer> f2329a;

    /* JADX INFO: Access modifiers changed from: protected */
    public l1(Map<String, Integer> map) {
        this.f2329a = map;
    }

    public static l1 a() {
        return f2328b;
    }

    public static l1 b(l1 l1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : l1Var.d()) {
            arrayMap.put(str, l1Var.c(str));
        }
        return new l1(arrayMap);
    }

    public Integer c(String str) {
        return this.f2329a.get(str);
    }

    public Set<String> d() {
        return this.f2329a.keySet();
    }
}