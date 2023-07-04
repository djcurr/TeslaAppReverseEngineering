package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgp;
import com.google.android.libraries.places.internal.zzgq;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzgu;
import com.google.android.libraries.places.internal.zziy;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* loaded from: classes3.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final f0 zza;
    private final f0 zzb;
    private zzgq zzc;
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
        this.zza = new f0();
        this.zzb = new f0();
        this.zzc = zzgr.zzn(AutocompleteActivityMode.OVERLAY, zziy.zzm(), zzgp.FRAGMENT);
    }

    @RecentlyNonNull
    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    public static /* synthetic */ void zzd(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    private final void zze() {
        Intent build = new Autocomplete.IntentBuilder(this.zzc.zzm()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    private final void zzf(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.getValue()) ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    if (Log.isLoggable("Places", 5)) {
                        Log.w("Places", "No PlaceSelectionListener is set. No result will be delivered.");
                    }
                } else if (intent == null) {
                    if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Intent data was null.");
                    }
                } else if (i12 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else {
                    placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                }
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzgr zzgrVar = (zzgr) bundle.getParcelable("options");
                if (zzgrVar == null) {
                    return;
                }
                if (this.zza.getValue() == 0) {
                    this.zza.postValue(zzgrVar.zzm());
                }
                if (this.zzb.getValue() == 0) {
                    this.zzb.postValue(zzgrVar.zzl());
                }
                this.zzc = zzgrVar.zzg();
            } catch (Error | RuntimeException e11) {
                zzgb.zzb(e11);
                throw e11;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzm());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        final View findViewById = view.findViewById(R.id.places_autocomplete_search_button);
        final View findViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        editText.setHint(zzgu.zzc(requireContext(), R.string.places_autocomplete_search_hint));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            {
                AutocompleteSupportFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zza(view2);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            {
                AutocompleteSupportFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.zzb(view2);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzg
            {
                AutocompleteSupportFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutocompleteSupportFragment.this.setText(null);
            }
        });
        zzf(findViewById2);
        this.zza.observe(getViewLifecycleOwner(), new g0() { // from class: com.google.android.libraries.places.widget.zzh
            {
                AutocompleteSupportFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.this.zzc(editText, findViewById2, (CharSequence) obj);
            }
        });
        this.zzb.observe(getViewLifecycleOwner(), new g0() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                AutocompleteSupportFragment.zzd(editText, findViewById, (CharSequence) obj);
            }
        });
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setActivityMode(@RecentlyNonNull AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzf(autocompleteActivityMode);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull List<String> list) {
        this.zzc.zza(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzn(str);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setHint(CharSequence charSequence) {
        try {
            if (charSequence == null) {
                String string = getString(R.string.places_autocomplete_search_hint);
                this.zzc.zzb(string);
                this.zzb.postValue(string);
            } else {
                this.zzc.zzb(charSequence.toString());
                this.zzb.postValue(charSequence);
            }
            return this;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zzd(locationBias);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zze(locationRestriction);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setPlaceFields(@RecentlyNonNull List<Place.Field> list) {
        this.zzc.zzh(list);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        try {
            this.zzc.zzc(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.postValue(charSequence);
            return this;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @RecentlyNonNull
    @Deprecated
    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setTypesFilter(@RecentlyNonNull List<String> list) {
        this.zzc.zzl(list);
        return this;
    }

    public final /* synthetic */ void zza(View view) {
        zze();
    }

    public final /* synthetic */ void zzb(View view) {
        zze();
    }

    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zzf(view);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @RecentlyNonNull
    public AutocompleteSupportFragment setCountries(@RecentlyNonNull String... strArr) {
        this.zzc.zza(zziy.zzl(strArr));
        return this;
    }
}