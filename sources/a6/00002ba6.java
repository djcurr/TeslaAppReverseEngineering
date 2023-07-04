package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzv {
    private final String zza = "\n";

    private zzv(String str) {
    }

    public static zzv zza(String str) {
        return new zzv("\n");
    }

    static final CharSequence zzc(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String zzb(Iterable iterable) {
        Iterator it2 = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it2.hasNext()) {
                sb2.append(zzc(it2.next()));
                while (it2.hasNext()) {
                    sb2.append((CharSequence) this.zza);
                    sb2.append(zzc(it2.next()));
                }
            }
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}