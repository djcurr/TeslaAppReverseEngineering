package com.google.android.gms.phenotype;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzj implements Comparator<zzi> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzi zziVar, zzi zziVar2) {
        zzi zziVar3 = zziVar;
        zzi zziVar4 = zziVar2;
        int i11 = zziVar3.zzah;
        int i12 = zziVar4.zzah;
        return i11 == i12 ? zziVar3.name.compareTo(zziVar4.name) : i11 - i12;
    }
}