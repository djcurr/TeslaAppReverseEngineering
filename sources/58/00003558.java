package com.google.android.libraries.places.widget.internal.ui;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzhl;

/* loaded from: classes3.dex */
final class zzg extends RecyclerView.u {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        zzhl zzhlVar;
        EditText editText;
        if (i11 == 1) {
            try {
                zzhlVar = this.zza.zze;
                zzhlVar.zzg();
                editText = this.zza.zzg;
                editText.clearFocus();
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
    }
}