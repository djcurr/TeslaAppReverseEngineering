package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.internal.measurement.zzjz;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzjv<MessageType extends zzjz<MessageType, BuilderType>, BuilderType extends zzjv<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    protected zzjz zza;
    protected boolean zzb = false;
    private final zzjz zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjv(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzjz) messagetype.zzl(4, null, null);
    }

    private static final void zza(zzjz zzjzVar, zzjz zzjzVar2) {
        zzlo.zza().zzb(zzjzVar.getClass()).zzg(zzjzVar, zzjzVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaC() {
        zzjz zzjzVar = (zzjz) this.zza.zzl(4, null, null);
        zza(zzjzVar, this.zza);
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    protected final /* synthetic */ zzig zzap(zzih zzihVar) {
        zzaw((zzjz) zzihVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzaq(byte[] bArr, int i11, int i12) {
        zzax(bArr, 0, i12, zzjl.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzar(byte[] bArr, int i11, int i12, zzjl zzjlVar) {
        zzax(bArr, 0, i12, zzjlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    /* renamed from: zzav */
    public final zzjv zzao() {
        zzjv zzjvVar = (zzjv) this.zzc.zzl(5, null, null);
        zzjvVar.zzaw(zzaA());
        return zzjvVar;
    }

    public final zzjv zzaw(zzjz zzjzVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zza(this.zza, zzjzVar);
        return this;
    }

    public final zzjv zzax(byte[] bArr, int i11, int i12, zzjl zzjlVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        try {
            zzlo.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i12, new zzik(zzjlVar));
            return this;
        } catch (zzkj e11) {
            throw e11;
        } catch (IOException e12) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkj.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzay() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzjz r0 = r5.zzaA()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.zzlo r3 = com.google.android.gms.internal.measurement.zzlo.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzlr r3 = r3.zzb(r4)
            boolean r3 = r3.zzj(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzmh r1 = new com.google.android.gms.internal.measurement.zzmh
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjv.zzay():com.google.android.gms.internal.measurement.zzjz");
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    /* renamed from: zzaz */
    public MessageType zzaA() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzjz zzjzVar = this.zza;
        zzlo.zza().zzb(zzjzVar.getClass()).zzf(zzjzVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final /* synthetic */ zzlg zzbJ() {
        return this.zzc;
    }
}