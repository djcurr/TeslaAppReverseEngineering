package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzly {
    private static final Comparator zza = new zzlq();
    private static final Comparator zzb = new zzlr();
    private static final zzly zzc = new zzly(new zzlw(Collections.emptyList()));
    private final zzlw zzd;

    private zzly(zzlw zzlwVar) {
        this.zzd = zzlwVar;
    }

    public static zzly zza() {
        return zzc;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzly) && ((zzly) obj).zzd.equals(this.zzd);
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final String toString() {
        return this.zzd.toString();
    }
}