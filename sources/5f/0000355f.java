package com.google.android.libraries.places.widget.internal.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.internal.zzgb;
import java.util.List;

/* loaded from: classes3.dex */
final class zzn extends AnimatorListenerAdapter {
    final /* synthetic */ View zza;
    final /* synthetic */ RecyclerView.e0 zzb;
    final /* synthetic */ ViewPropertyAnimator zzc;
    final /* synthetic */ zzo zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzo zzoVar, View view, RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator) {
        this.zzd = zzoVar;
        this.zza = view;
        this.zzb = e0Var;
        this.zzc = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        try {
            zzo.zzf(this.zza);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        List list;
        try {
            this.zzc.setListener(null);
            this.zzd.dispatchAddFinished(this.zzb);
            list = this.zzd.zzc;
            list.remove(this.zzb);
            this.zzd.zze();
            this.zzc.setStartDelay(0L);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        try {
            this.zza.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.zzd.dispatchAddStarting(this.zzb);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}