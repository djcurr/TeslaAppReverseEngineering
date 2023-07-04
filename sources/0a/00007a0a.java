package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Object> f32696a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final int f32697b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(int i11) {
        this.f32697b = i11;
    }

    private List<Object> a(Collection<?> collection, d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(d(it2.next(), d0Var));
        }
        return arrayList;
    }

    private List<Object> b(Object[] objArr, d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, d0Var));
        }
        return arrayList;
    }

    private Map<String, Object> c(Map<?, ?> map, d0 d0Var) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), d(obj2, d0Var));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public Object d(Object obj, d0 d0Var) {
        Object e11;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (this.f32696a.contains(obj)) {
            d0Var.c(f3.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f32696a.add(obj);
        try {
            if (this.f32696a.size() > this.f32697b) {
                this.f32696a.remove(obj);
                d0Var.c(f3.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    e11 = b((Object[]) obj, d0Var);
                } else if (obj instanceof Collection) {
                    e11 = a((Collection) obj, d0Var);
                } else if (obj instanceof Map) {
                    e11 = c((Map) obj, d0Var);
                } else {
                    e11 = e(obj, d0Var);
                }
                obj2 = e11;
            } catch (Exception e12) {
                d0Var.b(f3.INFO, "Not serializing object due to throwing sub-path.", e12);
            }
            return obj2;
        } finally {
            this.f32696a.remove(obj);
        }
    }

    public Map<String, Object> e(Object obj, d0 d0Var) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, d(field.get(obj), d0Var));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    d0Var.c(f3.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return hashMap;
    }
}