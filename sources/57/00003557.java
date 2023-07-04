package com.google.android.libraries.places.widget.internal.ui;

import androidx.activity.e;
import com.google.android.libraries.places.internal.zzhl;

/* loaded from: classes3.dex */
final class zzf extends e {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(AutocompleteImplFragment autocompleteImplFragment, boolean z11) {
        super(true);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.activity.e
    public final void handleOnBackPressed() {
        zzhl zzhlVar;
        zzhlVar = this.zza.zze;
        zzhlVar.zzj();
    }
}