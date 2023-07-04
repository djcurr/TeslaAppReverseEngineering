package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.protobuf.Extension;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbt {
    private static volatile boolean zzgm = false;
    private static final Class<?> zzgn = zzam();
    static final zzbt zzgo = new zzbt(true);
    private final Map<Object, zzcg.zzf<?, ?>> zzgp;

    zzbt() {
        this.zzgp = new HashMap();
    }

    private zzbt(boolean z11) {
        this.zzgp = Collections.emptyMap();
    }

    private static Class<?> zzam() {
        return Extension.class;
    }

    public static zzbt zzan() {
        return zzbs.zzal();
    }
}