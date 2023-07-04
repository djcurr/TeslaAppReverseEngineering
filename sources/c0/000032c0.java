package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzci {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final FusedLocationProviderClient zzb;
    private final zzfj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci(FusedLocationProviderClient fusedLocationProviderClient, zzfj zzfjVar) {
        this.zzb = fusedLocationProviderClient;
        this.zzc = zzfjVar;
    }

    public final Task zza(CancellationToken cancellationToken) {
        Task<Location> task;
        final TaskCompletionSource taskCompletionSource;
        CurrentLocationRequest.Builder priority = new CurrentLocationRequest.Builder().setPriority(100);
        long j11 = zza;
        CurrentLocationRequest build = priority.setDurationMillis(j11).build();
        if (FusedLocationProviderClient.class.isInterface()) {
            task = this.zzb.getCurrentLocation(build, cancellationToken);
        } else {
            try {
                task = (Task) FusedLocationProviderClient.class.getMethod("getCurrentLocation", CurrentLocationRequest.class, CancellationToken.class).invoke(this.zzb, build, cancellationToken);
            } catch (ReflectiveOperationException e11) {
                throw new IllegalStateException(e11);
            }
        }
        final zzfj zzfjVar = this.zzc;
        if (cancellationToken == null) {
            taskCompletionSource = new TaskCompletionSource();
        } else {
            taskCompletionSource = new TaskCompletionSource(cancellationToken);
        }
        zzfjVar.zza(taskCompletionSource, j11, "Location timeout.");
        task.continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzfh
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Exception exception = task2.getException();
                if (task2.isSuccessful()) {
                    taskCompletionSource2.setResult(task2.getResult());
                } else if (!task2.isCanceled() && exception != null) {
                    taskCompletionSource2.setException(exception);
                }
                return taskCompletionSource2.getTask();
            }
        });
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzfi
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfj.this.zzb(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask().continueWithTask(new zzch(this));
    }
}