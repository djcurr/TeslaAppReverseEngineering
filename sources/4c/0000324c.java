package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzafy implements zzags {
    private static final zzage zza = new zzafw();
    private final zzage zzb;

    public zzafy() {
        zzage zzageVar;
        zzage[] zzageVarArr = new zzage[2];
        zzageVarArr[0] = zzaeu.zza();
        try {
            zzageVar = (zzage) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzageVar = zza;
        }
        zzageVarArr[1] = zzageVar;
        zzafx zzafxVar = new zzafx(zzageVarArr);
        zzafh.zzf(zzafxVar, "messageInfoFactory");
        this.zzb = zzafxVar;
    }

    private static boolean zzb(zzagd zzagdVar) {
        return zzagdVar.zzc() == 1;
    }

    @Override // com.google.android.libraries.places.internal.zzags
    public final zzagr zza(Class cls) {
        zzagt.zzE(cls);
        zzagd zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzaey.class.isAssignableFrom(cls)) {
                return zzagk.zzi(zzagt.zzB(), zzaeq.zzb(), zzb.zza());
            }
            return zzagk.zzi(zzagt.zzz(), zzaeq.zza(), zzb.zza());
        } else if (zzaey.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzagj.zzi(cls, zzb, zzagm.zzb(), zzafu.zzd(), zzagt.zzB(), zzaeq.zzb(), zzagc.zzb());
            }
            return zzagj.zzi(cls, zzb, zzagm.zzb(), zzafu.zzd(), zzagt.zzB(), null, zzagc.zzb());
        } else if (zzb(zzb)) {
            return zzagj.zzi(cls, zzb, zzagm.zza(), zzafu.zzc(), zzagt.zzz(), zzaeq.zza(), zzagc.zza());
        } else {
            return zzagj.zzi(cls, zzb, zzagm.zza(), zzafu.zzc(), zzagt.zzA(), null, zzagc.zza());
        }
    }
}