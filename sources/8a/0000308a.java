package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzb = TimeUnit.MINUTES.toMillis(10);
    static long zza = SystemClock.elapsedRealtime();

    private AutoResolveHelper() {
    }

    public static Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static <TResult extends AutoResolvableResult> void resolveTask(Task<TResult> task, Activity activity, int i11) {
        zzc zza2 = zzc.zza(task);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i12 = zza2.zzc;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i12);
        bundle.putInt("requestCode", i11);
        bundle.putLong("initializationElapsedRealtime", zza);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        int i13 = zza2.zzc;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i13);
        beginTransaction.add(zzdVar, sb2.toString()).commit();
    }

    public static void zzd(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Activity activity, int i11, int i12, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i11, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i12);
        } catch (PendingIntent.CanceledException e11) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(Activity activity, int i11, Task task) {
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).startResolutionForResult(activity, i11);
                return;
            } catch (IntentSender.SendIntentException e11) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e11);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        int i12 = 1;
        if (task.isSuccessful()) {
            ((AutoResolvableResult) task.getResult()).putIntoIntent(intent);
            i12 = -1;
        } else if (exception instanceof ApiException) {
            ApiException apiException = (ApiException) exception;
            putStatusIntoIntent(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
            }
            putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
        }
        zze(activity, i11, i12, intent);
    }
}