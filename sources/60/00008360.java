package lq;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a */
    private final ConcurrentHashMap<Type, f<?>> f37292a;

    /* renamed from: b */
    public f<hq.c> f37293b;

    /* renamed from: c */
    public f<hq.c> f37294c;

    public e() {
        ConcurrentHashMap<Type, f<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.f37292a = concurrentHashMap;
        concurrentHashMap.put(Date.class, b.f37291c);
        concurrentHashMap.put(int[].class, a.f37277c);
        concurrentHashMap.put(Integer[].class, a.f37278d);
        concurrentHashMap.put(short[].class, a.f37277c);
        concurrentHashMap.put(Short[].class, a.f37278d);
        concurrentHashMap.put(long[].class, a.f37283i);
        concurrentHashMap.put(Long[].class, a.f37284j);
        concurrentHashMap.put(byte[].class, a.f37279e);
        concurrentHashMap.put(Byte[].class, a.f37280f);
        concurrentHashMap.put(char[].class, a.f37281g);
        concurrentHashMap.put(Character[].class, a.f37282h);
        concurrentHashMap.put(float[].class, a.f37285k);
        concurrentHashMap.put(Float[].class, a.f37286l);
        concurrentHashMap.put(double[].class, a.f37287m);
        concurrentHashMap.put(Double[].class, a.f37288n);
        concurrentHashMap.put(boolean[].class, a.f37289o);
        concurrentHashMap.put(Boolean[].class, a.f37290p);
        this.f37293b = new c(this);
        this.f37294c = new d(this);
        concurrentHashMap.put(hq.c.class, this.f37293b);
        concurrentHashMap.put(hq.b.class, this.f37293b);
        concurrentHashMap.put(hq.a.class, this.f37293b);
        concurrentHashMap.put(hq.d.class, this.f37293b);
    }
}