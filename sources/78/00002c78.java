package com.google.android.gms.internal.vision;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhs {
    private static final zzhs zzzw = new zzhs();
    private final zzhx zzzx;
    private final ConcurrentMap<Class<?>, zzhw<?>> zzzy = new ConcurrentHashMap();

    private zzhs() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzhx zzhxVar = null;
        for (int i11 = 0; i11 <= 0; i11++) {
            zzhxVar = zzr(strArr[0]);
            if (zzhxVar != null) {
                break;
            }
        }
        this.zzzx = zzhxVar == null ? new zzgu() : zzhxVar;
    }

    public static zzhs zzgl() {
        return zzzw;
    }

    private static zzhx zzr(String str) {
        try {
            return (zzhx) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> zzhw<T> zzf(Class<T> cls) {
        zzga.zza(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzhw<T> zzhwVar = (zzhw<T>) this.zzzy.get(cls);
        if (zzhwVar == null) {
            zzhw<T> zze = this.zzzx.zze(cls);
            zzga.zza(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            zzga.zza(zze, "schema");
            zzhw<T> zzhwVar2 = (zzhw<T>) this.zzzy.putIfAbsent(cls, zze);
            return zzhwVar2 != null ? zzhwVar2 : zze;
        }
        return zzhwVar;
    }

    public final <T> zzhw<T> zzs(T t11) {
        return zzf(t11.getClass());
    }
}