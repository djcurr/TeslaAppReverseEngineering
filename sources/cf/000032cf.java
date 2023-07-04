package com.google.android.libraries.places.internal;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.toolbox.l;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcx {
    private final j zza;
    private final zzej zzb;

    public zzcx(j jVar, zzej zzejVar, byte[] bArr) {
        this.zza = jVar;
        this.zzb = zzejVar;
    }

    public static /* synthetic */ void zzc(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        try {
            taskCompletionSource.trySetException(zzcr.zza(volleyError));
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final Task zza(zzdf zzdfVar, final Class cls) {
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
        final zzcw zzcwVar = new zzcw(this, 0, zzc, null, new k.b() { // from class: com.google.android.libraries.places.internal.zzct
            {
                zzcx.this = this;
            }

            @Override // com.android.volley.k.b
            public final void onResponse(Object obj) {
                zzcx.this.zzb(cls, taskCompletionSource2, (JSONObject) obj);
            }
        }, new k.a() { // from class: com.google.android.libraries.places.internal.zzcu
            @Override // com.android.volley.k.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzcx.zzc(TaskCompletionSource.this, volleyError);
            }
        }, zzd);
        if (zza != null) {
            zza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzcv
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    l.this.cancel();
                }
            });
        }
        this.zza.a(zzcwVar);
        return taskCompletionSource2.getTask();
    }

    public final /* synthetic */ void zzb(Class cls, TaskCompletionSource taskCompletionSource, JSONObject jSONObject) {
        try {
            try {
                taskCompletionSource.trySetResult((zzdg) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzdh e11) {
                taskCompletionSource.trySetException(new ApiException(new Status(8, e11.getMessage())));
            }
        } catch (Error | RuntimeException e12) {
            zzgb.zzb(e12);
            throw e12;
        }
    }
}