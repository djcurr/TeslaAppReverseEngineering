package com.google.android.libraries.places.widget.internal.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.q;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzgb;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzr extends q {
    private int zza;
    private boolean zzb;
    private final zzb zzc;

    public zzr(zzb zzbVar, byte[] bArr) {
        super(new zzq(null));
        this.zzb = true;
        this.zzc = zzbVar;
    }

    @Override // androidx.recyclerview.widget.q
    public final void submitList(List list) {
        try {
            int i11 = 0;
            this.zzb = (this.zza != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                i11 = list.size();
            }
            this.zza = i11;
            super.submitList(list);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zza */
    public final zzt onCreateViewHolder(ViewGroup viewGroup, int i11) {
        try {
            return new zzt(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false), null);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: zzb */
    public final void onBindViewHolder(zzt zztVar, int i11) {
        try {
            zztVar.zza((AutocompletePrediction) getItem(i11), this.zzb);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}