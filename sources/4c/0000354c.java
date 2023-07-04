package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgp;
import com.google.android.libraries.places.internal.zzgq;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzgu;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* loaded from: classes3.dex */
public final class Autocomplete {

    /* loaded from: classes3.dex */
    public static class IntentBuilder {
        private final zzgq zza;

        public IntentBuilder(zzgr zzgrVar) {
            this.zza = zzgrVar.zzg();
        }

        public IntentBuilder(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode, @RecentlyNonNull List<Place.Field> list) {
            this.zza = zzgr.zzn(autocompleteActivityMode, list, zzgp.INTENT);
        }

        @RecentlyNonNull
        public Intent build(@RecentlyNonNull Context context) {
            try {
                Intent intent = new Intent(context, AutocompleteActivity.class);
                zzgq zzgqVar = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(16843827, typedValue, true)) {
                    zzgqVar.zzi(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(16843828, typedValue2, true)) {
                    zzgqVar.zzj(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", this.zza.zzm());
                return intent;
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }

        @RecentlyNonNull
        public IntentBuilder setCountries(@RecentlyNonNull List<String> list) {
            this.zza.zza(list);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setCountry(String str) {
            this.zza.zzn(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setHint(String str) {
            this.zza.zzb(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setInitialQuery(String str) {
            this.zza.zzc(str);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zzd(locationBias);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zze(locationRestriction);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zza.zzk(typeFilter);
            return this;
        }

        @RecentlyNonNull
        public IntentBuilder setTypesFilter(@RecentlyNonNull List<String> list) {
            this.zza.zzl(list);
            return this;
        }

        public final IntentBuilder zza(zzgp zzgpVar) {
            this.zza.zzg(zzgpVar);
            return this;
        }
    }

    private Autocomplete() {
    }

    @RecentlyNonNull
    public static Place getPlaceFromIntent(@RecentlyNonNull Intent intent) {
        return zzgu.zzb(intent);
    }

    @RecentlyNonNull
    public static Status getStatusFromIntent(@RecentlyNonNull Intent intent) {
        return zzgu.zza(intent);
    }
}