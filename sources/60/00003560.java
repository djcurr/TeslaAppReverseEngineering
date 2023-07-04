package com.google.android.libraries.places.widget.internal.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzgb;
import i4.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzo extends g {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        this.zzc.add(e0Var);
        long moveDuration = getMoveDuration();
        int layoutPosition = e0Var.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration + (layoutPosition * 67));
        animate.setListener(new zzn(this, view, e0Var, animate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.x
    public final boolean animateAdd(RecyclerView.e0 e0Var) {
        try {
            endAnimation(e0Var);
            e0Var.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            if (((zzt) e0Var).zzb()) {
                this.zza.add(e0Var);
                return true;
            }
            this.zzb.add(e0Var);
            return true;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimation(RecyclerView.e0 e0Var) {
        try {
            super.endAnimation(e0Var);
            if (this.zza.remove(e0Var)) {
                zzf(e0Var.itemView);
                dispatchAddFinished(e0Var);
            }
            zze();
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void endAnimations() {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.zza.get(size);
                zzf(e0Var.itemView);
                dispatchAddFinished(e0Var);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((RecyclerView.e0) list.get(size2)).itemView.animate().cancel();
                } else {
                    super.endAnimations();
                    return;
                }
            }
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                return !this.zzc.isEmpty();
            }
            return true;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void runPendingAnimations() {
        try {
            for (RecyclerView.e0 e0Var : this.zzb) {
                super.animateAdd(e0Var);
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (this.zza.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.e0> arrayList = new ArrayList(this.zza);
            this.zza.clear();
            for (RecyclerView.e0 e0Var2 : arrayList) {
                View view = e0Var2.itemView;
                this.zzc.add(e0Var2);
                long moveDuration = getMoveDuration() + (e0Var2.getLayoutPosition() * 67);
                view.setTranslationY(-this.zzd);
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                ViewPropertyAnimator animate = view.animate();
                animate.cancel();
                animate.translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration);
                animate.setListener(new zzn(this, view, e0Var2, animate)).start();
            }
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}