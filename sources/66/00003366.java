package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class zzib {
    private final String zza;

    private zzib(String str) {
        this.zza = str;
    }

    public static zzib zzc(String str) {
        return new zzib(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence zza(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Appendable zzb(Appendable appendable, Iterator it2) {
        if (it2.hasNext()) {
            appendable.append(zza(it2.next()));
            while (it2.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zza(it2.next()));
            }
        }
        return appendable;
    }

    public final zzib zzd() {
        return new zzhz(this, this);
    }

    public final String zzf(Iterable iterable) {
        Iterator it2 = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            zzb(sb2, it2);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}