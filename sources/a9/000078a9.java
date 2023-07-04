package io.realm.internal;

import io.realm.v;

/* loaded from: classes5.dex */
public class p implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f31959a;

    public p(OsCollectionChangeSet osCollectionChangeSet) {
        boolean f11 = osCollectionChangeSet.f();
        Throwable c11 = osCollectionChangeSet.c();
        this.f31959a = c11;
        if (c11 != null) {
            v.b bVar = v.b.ERROR;
        } else if (f11) {
            v.b bVar2 = v.b.INITIAL;
        } else {
            v.b bVar3 = v.b.UPDATE;
        }
    }
}