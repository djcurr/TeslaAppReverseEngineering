package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: a */
    private final on.h<String, k> f17207a = new on.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f17207a.equals(this.f17207a));
    }

    public int hashCode() {
        return this.f17207a.hashCode();
    }

    public void m(String str, k kVar) {
        on.h<String, k> hVar = this.f17207a;
        if (kVar == null) {
            kVar = l.f17206a;
        }
        hVar.put(str, kVar);
    }

    public void n(String str, String str2) {
        m(str, str2 == null ? l.f17206a : new o(str2));
    }

    public Set<Map.Entry<String, k>> o() {
        return this.f17207a.entrySet();
    }

    public k p(String str) {
        return this.f17207a.get(str);
    }

    public boolean q(String str) {
        return this.f17207a.containsKey(str);
    }

    public Set<String> r() {
        return this.f17207a.keySet();
    }

    public k s(String str) {
        return this.f17207a.remove(str);
    }
}