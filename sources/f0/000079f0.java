package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Class<?>> f32610d;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f32611a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f32612b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private b f32613c = null;

    static {
        HashMap hashMap = new HashMap();
        f32610d = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public void a(List<b> list) {
        if (list != null) {
            this.f32612b.addAll(list);
        }
    }

    public Object b(String str) {
        return this.f32611a.get(str);
    }

    public List<b> c() {
        return new ArrayList(this.f32612b);
    }

    public b d() {
        return this.f32613c;
    }

    public void e(String str, Object obj) {
        this.f32611a.put(str, obj);
    }

    public void f(b bVar) {
        this.f32613c = bVar;
    }
}