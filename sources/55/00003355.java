package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhl extends p0 {
    private final zzgy zza;
    private final zzho zzb;
    private final zzhp zzc;
    private Runnable zze;
    private final Handler zzd = new Handler(Looper.getMainLooper());
    private final f0 zzf = new f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhl(zzgy zzgyVar, zzho zzhoVar, zzhp zzhpVar, zzhk zzhkVar) {
        this.zza = zzgyVar;
        this.zzb = zzhoVar;
        this.zzc = zzhpVar;
    }

    private static Status zzn(Exception exc) {
        if (exc instanceof ApiException) {
            return ((ApiException) exc).getStatus();
        }
        return new Status(13, exc.getMessage());
    }

    private final void zzo(zzgt zzgtVar) {
        if (zzgtVar.equals(this.zzf.getValue())) {
            return;
        }
        this.zzf.setValue(zzgtVar);
    }

    private static boolean zzp(Status status) {
        return status.isCanceled() || status.getStatusCode() == 9012 || status.getStatusCode() == 9011;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p0
    public final void onCleared() {
        try {
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            this.zzb.zzo();
            this.zzc.zza(this.zzb);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final LiveData zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, Task task) {
        if (task.isCanceled()) {
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzp();
            List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions();
            if (autocompletePredictions.isEmpty()) {
                zzo(zzgt.zzh(str));
                return;
            } else {
                zzo(zzgt.zzj(autocompletePredictions));
                return;
            }
        }
        this.zzb.zzr();
        Status zzn = zzn(exception);
        if (zzp(zzn)) {
            zzo(zzgt.zzq(zzn));
        } else {
            zzo(zzgt.zzi(str, zzn));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(AutocompletePrediction autocompletePrediction, Task task) {
        if (task.isCanceled()) {
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzq();
            zzo(zzgt.zzn(((FetchPlaceResponse) task.getResult()).getPlace()));
            return;
        }
        this.zzb.zzs();
        Status zzn = zzn(exception);
        if (zzp(zzn)) {
            zzo(zzgt.zzq(zzn));
        } else {
            zzo(zzgt.zzm(autocompletePrediction, zzn));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(final String str) {
        this.zza.zzb(str).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzhh
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzhl.this.zzb(str, task);
            }
        });
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            this.zzf.setValue(zzgt.zzo());
        }
    }

    public final void zzf(final AutocompletePrediction autocompletePrediction, int i11) {
        this.zzb.zzu(i11);
        Task zza = this.zza.zza(autocompletePrediction);
        if (!zza.isComplete()) {
            zzo(zzgt.zzg());
        }
        zza.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzhg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzhl.this.zzc(autocompletePrediction, task);
            }
        });
    }

    public final void zzg() {
        this.zzb.zzv();
    }

    public final void zzh() {
        this.zzb.zzl();
    }

    public final void zzi() {
        this.zzb.zzm();
    }

    public final void zzj() {
        this.zzb.zzn();
        zzo(zzgt.zzl());
    }

    public final void zzk() {
        this.zzb.zzw();
        zzm("");
    }

    public final void zzl(String str) {
        this.zza.zzc();
        zzm(str);
        zzo(zzgt.zzp());
    }

    public final void zzm(final String str) {
        this.zzb.zzt(str);
        this.zzd.removeCallbacks(this.zze);
        if (str.isEmpty()) {
            this.zza.zzc();
            zzo(zzgt.zzk());
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.libraries.places.internal.zzhi
            {
                zzhl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzhl.this.zzd(str);
            }
        };
        this.zze = runnable;
        this.zzd.postDelayed(runnable, 100L);
        zzo(zzgt.zzg());
    }
}