package com.google.android.libraries.places.widget.internal.ui;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.core.content.b;
import androidx.core.view.a0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzbx;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzgt;
import com.google.android.libraries.places.internal.zzgu;
import com.google.android.libraries.places.internal.zzgv;
import com.google.android.libraries.places.internal.zzhf;
import com.google.android.libraries.places.internal.zzhj;
import com.google.android.libraries.places.internal.zzhl;
import com.google.android.libraries.places.internal.zzho;
import com.google.android.libraries.places.internal.zzhp;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AutocompleteImplFragment extends Fragment {
    private final PlacesClient zza;
    private final zzgr zzb;
    private final zzhp zzc;
    private final zzbx zzd;
    private zzhl zze;
    private PlaceSelectionListener zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private TextView zzq;
    private TextView zzr;
    private zzr zzs;
    private final zzj zzt;

    /* JADX INFO: Access modifiers changed from: private */
    public AutocompleteImplFragment(int i11, PlacesClient placesClient, zzgr zzgrVar, zzhp zzhpVar, zzbx zzbxVar) {
        super(i11);
        this.zzt = new zzj(this, null);
        this.zza = placesClient;
        this.zzb = zzgrVar;
        this.zzc = zzhpVar;
        this.zzd = zzbxVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzho zzhoVar = new zzho(this.zzb.zzf(), this.zzb.zzh(), this.zzb.zzm(), this.zzd);
            zzhl zzhlVar = (zzhl) new s0(this, new zzhj(new zzhf(this.zza, this.zzb, zzhoVar.zzh()), zzhoVar, this.zzc)).a(zzhl.class);
            this.zze = zzhlVar;
            zzhlVar.zze(bundle);
            requireActivity().getOnBackPressedDispatcher().b(this, new zzf(this, true));
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zze.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zze.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@RecentlyNonNull View view, Bundle bundle) {
        String zzl;
        int identifier;
        try {
            this.zzg = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzh = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzi = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzj = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzl = view.findViewById(R.id.places_autocomplete_progress);
            this.zzm = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzp = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzq = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzg.addTextChangedListener(this.zzt);
            this.zzg.setOnFocusChangeListener(new zzl(null));
            EditText editText = this.zzg;
            if (TextUtils.isEmpty(this.zzb.zzl())) {
                zzl = zzgu.zzc(requireContext(), R.string.places_autocomplete_search_hint);
            } else {
                zzl = this.zzb.zzl();
            }
            editText.setHint(zzl);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = this.zzb.zzh().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && Build.VERSION.SDK_INT >= 19 && (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                    requireActivity().getWindow().addFlags(67108864);
                    a0.K0(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else {
                int zza = this.zzb.zza();
                int zzb = this.zzb.zzb();
                if (Color.alpha(zza) < 255) {
                    zza = 0;
                }
                if (zza != 0 && zzb != 0) {
                    int zza2 = zzgv.zza(zza, b.getColor(requireContext(), R.color.places_text_white_alpha_87), b.getColor(requireContext(), R.color.places_text_black_alpha_87));
                    int zza3 = zzgv.zza(zza, b.getColor(requireContext(), R.color.places_text_white_alpha_26), b.getColor(requireContext(), R.color.places_text_black_alpha_26));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(zza);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 21) {
                        Window window = requireActivity().getWindow();
                        if (!zzgv.zzc(zzb, -1, -16777216)) {
                            window.setStatusBarColor(zzb);
                        } else if (i11 >= 23) {
                            window.setStatusBarColor(zzb);
                            window.getDecorView().setSystemUiVisibility(PKIFailureInfo.certRevoked);
                        }
                    }
                    this.zzg.setTextColor(zza2);
                    this.zzg.setHintTextColor(zza3);
                    zzgv.zzb((ImageView) this.zzi, zza2);
                    zzgv.zzb((ImageView) this.zzj, zza2);
                }
            }
            this.zzi.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzd
                {
                    AutocompleteImplFragment.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzc(view2);
                }
            });
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zzc
                {
                    AutocompleteImplFragment.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzd(view2);
                }
            });
            this.zzr.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.ui.zza
                {
                    AutocompleteImplFragment.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AutocompleteImplFragment.this.zzf(view2);
                }
            });
            this.zzs = new zzr(new zzb(this), null);
            this.zzh.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzh.setItemAnimator(new zzo(getResources()));
            this.zzh.setAdapter(this.zzs);
            this.zzh.addOnScrollListener(new zzg(this));
            this.zze.zza().observe(getViewLifecycleOwner(), new g0() { // from class: com.google.android.libraries.places.widget.internal.ui.zze
                {
                    AutocompleteImplFragment.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    AutocompleteImplFragment.this.zzg((zzgt) obj);
                }
            });
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze.zzj();
    }

    public final /* synthetic */ void zzd(View view) {
        try {
            this.zze.zzk();
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i11) {
        try {
            this.zze.zzf(autocompletePrediction, i11);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final /* synthetic */ void zzf(View view) {
        try {
            this.zze.zzl(this.zzg.getText().toString());
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final /* synthetic */ void zzg(zzgt zzgtVar) {
        try {
            this.zzj.setVisibility(0);
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(0);
            this.zzo.setVisibility(8);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            switch (zzgtVar.zzf() - 1) {
                case 0:
                    if (TextUtils.isEmpty(this.zzb.zzm())) {
                        this.zzj.setVisibility(8);
                    }
                    this.zzg.requestFocus();
                    this.zzg.setText(this.zzb.zzm());
                    EditText editText = this.zzg;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzs.submitList(null);
                    this.zzj.setVisibility(8);
                    this.zzg.getText().clear();
                    return;
                case 2:
                    this.zzl.setVisibility(0);
                    return;
                case 3:
                    this.zzr.setVisibility(8);
                    this.zzm.setVisibility(0);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzq.setVisibility(0);
                    return;
                case 4:
                    this.zzs.submitList(zzgtVar.zzd());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzn.setVisibility(8);
                    this.zzp.setVisibility(0);
                    this.zzr.setVisibility(4);
                    this.zzq.setText(getString(R.string.places_autocomplete_no_results_for_query, zzgtVar.zze()));
                    this.zzq.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    PlaceSelectionListener placeSelectionListener = this.zzf;
                    Place zzc = zzgtVar.zzc();
                    Objects.requireNonNull(zzc);
                    placeSelectionListener.onPlaceSelected(zzc);
                    return;
                case 8:
                    AutocompletePrediction zzb = zzgtVar.zzb();
                    zzig.zzc(zzb, "Prediction should not be null.");
                    this.zzg.clearFocus();
                    this.zzg.removeTextChangedListener(this.zzt);
                    this.zzg.setText(zzb.getPrimaryText(null));
                    this.zzg.addTextChangedListener(this.zzt);
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzf;
                    Status zza = zzgtVar.zza();
                    Objects.requireNonNull(zza);
                    placeSelectionListener2.onError(zza);
                    return;
            }
            this.zzs.submitList(null);
            this.zzn.setVisibility(8);
            this.zzp.setVisibility(0);
            this.zzr.setVisibility(0);
            this.zzq.setText(getString(R.string.places_search_error));
            this.zzq.setVisibility(0);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    public final void zzh(@RecentlyNonNull PlaceSelectionListener placeSelectionListener) {
        this.zzf = placeSelectionListener;
    }
}