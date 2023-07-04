package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzct;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.vision.L;

@Keep
/* loaded from: classes3.dex */
public class VisionClearcutLogger {
    private final ClearcutLogger zzbw;
    private boolean zzbx = true;

    public VisionClearcutLogger(Context context) {
        this.zzbw = new ClearcutLogger(context, "VISION", null);
    }

    public final void zzb(int i11, zzdu zzduVar) {
        int zzeq = zzduVar.zzeq();
        byte[] bArr = new byte[zzeq];
        zzjt.zza(zzduVar, bArr, 0, zzeq);
        if (i11 >= 0 && i11 <= 3) {
            try {
                if (this.zzbx) {
                    this.zzbw.newEvent(bArr).setEventCode(i11).log();
                    return;
                }
                zzdu zzduVar2 = new zzdu();
                try {
                    zzjt.zza(zzduVar2, bArr);
                    L.zzc("Would have logged:\n%s", zzduVar2.toString());
                    return;
                } catch (Exception e11) {
                    L.zza(e11, "Parsing error", new Object[0]);
                    return;
                }
            } catch (Exception e12) {
                zzct.zza(e12);
                L.zza(e12, "Failed to log", new Object[0]);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Illegal event code: ");
        sb2.append(i11);
        String sb3 = sb2.toString();
        Object[] objArr = new Object[0];
        if (L.isLoggable(4)) {
            Log.i("Vision", String.format(sb3, objArr));
        }
    }
}