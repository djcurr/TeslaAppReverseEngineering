package gq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class d<T> {

    /* renamed from: c  reason: collision with root package name */
    private static ConcurrentHashMap<Class<?>, d<?>> f28063c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, b> f28064a;

    /* renamed from: b  reason: collision with root package name */
    private b[] f28065b;

    private static void a(d<?> dVar, HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            b bVar = ((d) dVar).f28064a.get(entry.getValue());
            if (bVar != null) {
                hashMap2.put(entry.getValue(), bVar);
            }
        }
        ((d) dVar).f28064a.putAll(hashMap2);
    }

    public static <P> d<P> b(Class<P> cls, j jVar) {
        String concat;
        d<P> dVar = (d<P>) f28063c.get(cls);
        if (dVar != null) {
            return dVar;
        }
        b[] b11 = a.b(cls, jVar);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            concat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            concat = name.concat("AccAccess");
        }
        i iVar = new i(cls.getClassLoader());
        Class<?> cls2 = null;
        try {
            cls2 = iVar.loadClass(concat);
        } catch (ClassNotFoundException unused) {
        }
        LinkedList<Class<?>> e11 = e(cls);
        if (cls2 == null) {
            e eVar = new e(cls, b11, iVar);
            Iterator<Class<?>> it2 = e11.iterator();
            while (it2.hasNext()) {
                eVar.b(f.f28075a.get(it2.next()));
            }
            cls2 = eVar.c();
        }
        try {
            d<P> dVar2 = (d) cls2.newInstance();
            dVar2.f(b11);
            f28063c.putIfAbsent(cls, dVar2);
            Iterator<Class<?>> it3 = e11.iterator();
            while (it3.hasNext()) {
                a(dVar2, f.f28076b.get(it3.next()));
            }
            return dVar2;
        } catch (Exception e12) {
            throw new RuntimeException("Error constructing accessor class: " + concat, e12);
        }
    }

    private static LinkedList<Class<?>> e(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }

    public abstract Object c(T t11, int i11);

    public b[] d() {
        return this.f28065b;
    }

    protected void f(b[] bVarArr) {
        this.f28065b = bVarArr;
        this.f28064a = new HashMap<>();
        int length = bVarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            b bVar = bVarArr[i11];
            bVar.f28059d = i12;
            this.f28064a.put(bVar.b(), bVar);
            i11++;
            i12++;
        }
    }
}