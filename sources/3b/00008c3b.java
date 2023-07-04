package net.time4j.tz.model;

import java.util.Comparator;

/* loaded from: classes5.dex */
enum k implements Comparator<d> {
    INSTANCE;

    @Override // java.util.Comparator
    public int compare(d dVar, d dVar2) {
        int compareTo = dVar.b(2000).compareTo(dVar2.b(2000));
        return compareTo == 0 ? dVar.f().compareTo(dVar2.f()) : compareTo;
    }
}