package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzed;

/* loaded from: classes3.dex */
public abstract class zzed<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzhg {
    protected abstract BuilderType zza(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhg
    public final /* synthetic */ zzhg zza(zzhf zzhfVar) {
        if (zzfb().getClass().isInstance(zzhfVar)) {
            return zza((zzed<MessageType, BuilderType>) ((zzec) zzhfVar));
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: zzcg */
    public abstract BuilderType clone();
}