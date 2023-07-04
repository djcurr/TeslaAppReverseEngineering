package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zziy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AutocompletePrediction implements Parcelable {

    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public AutocompletePrediction build() {
            AutocompletePrediction zze = zze();
            setPlaceTypes(zziy.zzk(zze.getPlaceTypes()));
            List zzd = zze.zzd();
            if (zzd != null) {
                zza(zziy.zzk(zzd));
            }
            List zze2 = zze.zze();
            if (zze2 != null) {
                zzc(zziy.zzk(zze2));
            }
            List zzf = zze.zzf();
            if (zzf != null) {
                zzd(zziy.zzk(zzf));
            }
            return zze();
        }

        @RecentlyNullable
        public abstract Integer getDistanceMeters();

        @RecentlyNonNull
        public abstract String getFullText();

        @RecentlyNonNull
        public abstract List<Place.Type> getPlaceTypes();

        @RecentlyNonNull
        public abstract String getPrimaryText();

        @RecentlyNonNull
        public abstract String getSecondaryText();

        @RecentlyNonNull
        public abstract Builder setDistanceMeters(Integer num);

        @RecentlyNonNull
        public abstract Builder setFullText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setPlaceTypes(@RecentlyNonNull List<Place.Type> list);

        @RecentlyNonNull
        public abstract Builder setPrimaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setSecondaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder zza(List list);

        @RecentlyNonNull
        public abstract Builder zzc(List list);

        @RecentlyNonNull
        public abstract Builder zzd(List list);

        abstract AutocompletePrediction zze();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzd zzdVar = new zzd();
        zzdVar.zzb(str);
        zzdVar.setPlaceTypes(new ArrayList());
        zzdVar.setFullText("");
        zzdVar.setPrimaryText("");
        zzdVar.setSecondaryText("");
        return zzdVar;
    }

    private static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zzbb zzbbVar = (zzbb) it2.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzbbVar.zzb(), zzbbVar.zzb() + zzbbVar.zza(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNullable
    public abstract Integer getDistanceMeters();

    @RecentlyNonNull
    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNonNull
    public abstract List<Place.Type> getPlaceTypes();

    @RecentlyNonNull
    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    public abstract String zza();

    public abstract String zzb();

    public abstract String zzc();

    public abstract List zzd();

    public abstract List zze();

    public abstract List zzf();
}