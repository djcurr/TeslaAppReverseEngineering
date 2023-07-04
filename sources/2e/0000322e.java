package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzaev;
import com.google.android.libraries.places.internal.zzaey;

/* loaded from: classes3.dex */
public class zzaev<MessageType extends zzaey<MessageType, BuilderType>, BuilderType extends zzaev<MessageType, BuilderType>> extends zzadp<MessageType, BuilderType> {
    protected zzaey zza;
    private final zzaey zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaev(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzL()) {
            this.zza = messagetype.zzy();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.libraries.places.internal.zzadp
    /* renamed from: zzp */
    public final zzaev zzo() {
        zzaev zzaevVar = (zzaev) this.zzb.zzb(5, null, null);
        zzaevVar.zza = zzs();
        return zzaevVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzq() {
        /*
            r5 = this;
            com.google.android.libraries.places.internal.zzaey r0 = r5.zzs()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzb(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.libraries.places.internal.zzago r3 = com.google.android.libraries.places.internal.zzago.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.libraries.places.internal.zzagr r3 = r3.zzb(r4)
            boolean r3 = r3.zzh(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzb(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.libraries.places.internal.zzahh r1 = new com.google.android.libraries.places.internal.zzahh
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaev.zzq():com.google.android.libraries.places.internal.zzaey");
    }

    @Override // com.google.android.libraries.places.internal.zzagf
    /* renamed from: zzr */
    public MessageType zzs() {
        if (this.zza.zzL()) {
            this.zza.zzG();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzagh
    public final /* bridge */ /* synthetic */ zzagg zzt() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzu() {
        if (this.zza.zzL()) {
            return;
        }
        zzv();
    }

    protected void zzv() {
        zzaey zzy = this.zzb.zzy();
        zzago.zza().zzb(zzy.getClass()).zze(zzy, this.zza);
        this.zza = zzy;
    }
}