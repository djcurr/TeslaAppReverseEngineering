package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.EncodingException;
import lm.b;
import lm.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzda implements f {
    private boolean zza = false;
    private boolean zzb = false;
    private b zzc;
    private final zzcw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzda(zzcw zzcwVar) {
        this.zzd = zzcwVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final f add(double d11) {
        zzb();
        this.zzd.zza(this.zzc, d11, this.zzb);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(b bVar, boolean z11) {
        this.zza = false;
        this.zzc = bVar;
        this.zzb = z11;
    }

    public final f add(float f11) {
        zzb();
        this.zzd.zzb(this.zzc, f11, this.zzb);
        return this;
    }

    public final f add(int i11) {
        zzb();
        this.zzd.zzd(this.zzc, i11, this.zzb);
        return this;
    }

    public final f add(long j11) {
        zzb();
        this.zzd.zze(this.zzc, j11, this.zzb);
        return this;
    }

    @Override // lm.f
    public final f add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // lm.f
    public final f add(boolean z11) {
        zzb();
        this.zzd.zzd(this.zzc, z11 ? 1 : 0, this.zzb);
        return this;
    }

    public final f add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}