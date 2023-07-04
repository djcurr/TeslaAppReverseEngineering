package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    public final zzad zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzad zzc(Iterator it2) {
        while (it2.hasNext()) {
            super.zza(it2.next());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(int i11) {
        super(4);
    }
}