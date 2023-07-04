package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzcm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11 = zzcn.zza;
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}