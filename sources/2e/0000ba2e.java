package vn;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* loaded from: classes2.dex */
public class b extends Observable {

    /* renamed from: a  reason: collision with root package name */
    private final String f54546a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f54547b;

    /* renamed from: c  reason: collision with root package name */
    private c f54548c;

    public b(c cVar, String str, Map<String, String> map) {
        this.f54548c = cVar;
        this.f54546a = str;
        if (map == null) {
            this.f54547b = new HashMap();
        } else {
            this.f54547b = map;
        }
    }

    public c a() {
        return this.f54548c;
    }

    public String b() {
        return this.f54546a;
    }

    public Iterable c() {
        return this.f54547b.entrySet();
    }

    public String d(String str) {
        return this.f54547b.get(str);
    }

    public boolean e() {
        return this.f54548c != null;
    }

    public boolean f(String str) {
        return this.f54547b.containsKey(str);
    }
}