package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.h;
import com.android.volley.j;
import com.android.volley.k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdd {
    private final j zza;

    public zzdd(j jVar) {
        this.zza = jVar;
    }

    public static /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        ApiException zza;
        try {
            h hVar = volleyError.f10249a;
            if (hVar != null) {
                int i11 = hVar.f10283a;
                if (i11 == 400) {
                    zza = new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i11 == 403) {
                    zza = new ApiException(new Status((int) PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                }
                taskCompletionSource.trySetException(zza);
            }
            zza = zzcr.zza(volleyError);
            taskCompletionSource.trySetException(zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public static /* synthetic */ void zzc(zzds zzdsVar, TaskCompletionSource taskCompletionSource, Bitmap bitmap) {
        try {
            zzdsVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzdsVar.zza());
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final Task zzb(zzdf zzdfVar, zzds zzdsVar) {
        TaskCompletionSource taskCompletionSource;
        String zzc = zzdfVar.zzc();
        Map zzd = zzdfVar.zzd();
        CancellationToken zza = zzdfVar.zza();
        if (zza != null) {
            taskCompletionSource = new TaskCompletionSource(zza);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        final TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        final zzdc zzdcVar = new zzdc(this, zzc, new k.b(taskCompletionSource2, null) { // from class: com.google.android.libraries.places.internal.zzcz
            public final /* synthetic */ TaskCompletionSource zza;

            @Override // com.android.volley.k.b
            public final void onResponse(Object obj) {
                zzdd.zzc(zzds.this, this.zza, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new k.a() { // from class: com.google.android.libraries.places.internal.zzda
            @Override // com.android.volley.k.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzdd.zza(TaskCompletionSource.this, volleyError);
            }
        }, zzd);
        if (zza != null) {
            zza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzdb
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    com.android.volley.toolbox.k.this.cancel();
                }
            });
        }
        this.zza.a(zzdcVar);
        return taskCompletionSource2.getTask();
    }
}