package org.bouncycastle.crypto;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class j extends Permission {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f43144a;

    public j(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f43144a = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f43144a.equals(((j) obj).f43144a);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.f43144a.toString();
    }

    public int hashCode() {
        return this.f43144a.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (permission instanceof j) {
            j jVar = (j) permission;
            return getName().equals(jVar.getName()) || this.f43144a.containsAll(jVar.f43144a);
        }
        return false;
    }
}