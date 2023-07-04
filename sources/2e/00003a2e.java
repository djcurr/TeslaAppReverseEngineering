package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: a */
    private final List<k> f17205a = new ArrayList();

    @Override // com.google.gson.k
    public long e() {
        if (this.f17205a.size() == 1) {
            return this.f17205a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).f17205a.equals(this.f17205a));
    }

    @Override // com.google.gson.k
    public String f() {
        if (this.f17205a.size() == 1) {
            return this.f17205a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f17205a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f17205a.iterator();
    }

    public void m(k kVar) {
        if (kVar == null) {
            kVar = l.f17206a;
        }
        this.f17205a.add(kVar);
    }

    public k n(int i11) {
        return this.f17205a.get(i11);
    }

    public int size() {
        return this.f17205a.size();
    }
}