package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class e<K, V> {
    private final Map zza = new HashMap();

    @KeepForSdk
    protected abstract V create(K k11);

    @KeepForSdk
    public V get(K k11) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k11)) {
                return (V) this.zza.get(k11);
            }
            V create = create(k11);
            this.zza.put(k11, create);
            return create;
        }
    }
}