package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
/* loaded from: classes3.dex */
public class LifecycleCallback {
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @KeepForSdk
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @KeepForSdk
    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    @KeepForSdk
    public void onCreate(Bundle bundle) {
    }

    @KeepForSdk
    public void onDestroy() {
    }

    @KeepForSdk
    public void onResume() {
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle bundle) {
    }

    @KeepForSdk
    public void onStart() {
    }

    @KeepForSdk
    public void onStop() {
    }

    @KeepForSdk
    public static LifecycleFragment getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public static LifecycleFragment getFragment(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zzb.zzc(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}