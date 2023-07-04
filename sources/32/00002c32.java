package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import com.google.protobuf.Extension;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class zzfk {
    private static volatile boolean zztf = false;
    private static volatile zzfk zzth;
    private final Map<zza, zzfy.zzf<?, ?>> zztj;
    private static final Class<?> zztg = zzei();
    static final zzfk zzti = new zzfk(true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i11) {
            this.object = obj;
            this.number = i11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.number;
        }
    }

    public zzfk() {
        this.zztj = new HashMap();
    }

    public static zzfk zzeh() {
        return zzfw.zza(zzfk.class);
    }

    private static Class<?> zzei() {
        return Extension.class;
    }

    public static zzfk zzej() {
        return zzfj.zzef();
    }

    public static zzfk zzek() {
        return zzfj.zzeg();
    }

    public static zzfk zzel() {
        zzfk zzfkVar = zzth;
        if (zzfkVar == null) {
            synchronized (zzfk.class) {
                zzfkVar = zzth;
                if (zzfkVar == null) {
                    zzfkVar = zzfj.zzeh();
                    zzth = zzfkVar;
                }
            }
        }
        return zzfkVar;
    }

    public final <ContainingType extends zzhf> zzfy.zzf<ContainingType, ?> zza(ContainingType containingtype, int i11) {
        return (zzfy.zzf<ContainingType, ?>) this.zztj.get(new zza(containingtype, i11));
    }

    private zzfk(boolean z11) {
        this.zztj = Collections.emptyMap();
    }

    public final void zza(zzfy.zzf<?, ?> zzfVar) {
        this.zztj.put(new zza(zzfVar.zzwu, zzfVar.zzww.number), zzfVar);
    }
}