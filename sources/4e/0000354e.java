package com.google.android.libraries.places.widget;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.app.d;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgr;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Objects;

/* loaded from: classes3.dex */
public class AutocompleteActivity extends d implements PlaceSelectionListener {
    public static final int RESULT_ERROR = 2;
    static boolean zza = true;
    private int zzb;
    private int zzc;
    private boolean zzd;

    public AutocompleteActivity() {
        super(R.layout.places_autocomplete_activity);
        this.zzd = false;
    }

    private final void zzc(int i11, Place place, Status status) {
        try {
            Intent intent = new Intent();
            if (place != null) {
                intent.putExtra("places/selected_place", place);
            }
            intent.putExtra("places/status", status);
            setResult(i11, intent);
            finish();
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            zzig.zzi(Places.isInitialized(), "Places must be initialized.");
            if (zza) {
                zzig.zzi(getCallingActivity() != null, "Cannot find caller. startActivityForResult should be used.");
            }
            zzgr zzgrVar = (zzgr) getIntent().getParcelableExtra("places/AutocompleteOptions");
            Objects.requireNonNull(zzgrVar);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = zzgrVar.zzh().ordinal();
            if (ordinal == 0) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_fullscreen;
                this.zzc = R.style.PlacesAutocompleteFullscreen;
            } else if (ordinal == 1) {
                this.zzb = R.layout.places_autocomplete_impl_fragment_overlay;
                this.zzc = R.style.PlacesAutocompleteOverlay;
            }
            getSupportFragmentManager().j1(new com.google.android.libraries.places.widget.internal.ui.zzh(this.zzb, this, zzgrVar));
            setTheme(this.zzc);
            super.onCreate(bundle);
            final AutocompleteImplFragment autocompleteImplFragment = (AutocompleteImplFragment) getSupportFragmentManager().g0(R.id.places_autocomplete_content);
            zzig.zzh(autocompleteImplFragment != null);
            autocompleteImplFragment.zzh(this);
            final View findViewById = findViewById(16908290);
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.widget.zza
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return AutocompleteActivity.this.zzb(autocompleteImplFragment, findViewById, view, motionEvent);
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzb
                {
                    AutocompleteActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutocompleteActivity.this.zza(view);
                }
            });
            if (zzgrVar.zzj().isEmpty()) {
                zzc(2, null, new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."));
            }
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onError(@RecentlyNonNull Status status) {
        zzc(true != status.isCanceled() ? 2 : 0, null, status);
    }

    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
    public void onPlaceSelected(@RecentlyNonNull Place place) {
        zzc(-1, place, Status.RESULT_SUCCESS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(View view) {
        if (this.zzd) {
            zzc(0, null, new Status(16));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzb(AutocompleteImplFragment autocompleteImplFragment, View view, View view2, MotionEvent motionEvent) {
        this.zzd = false;
        View view3 = autocompleteImplFragment.getView();
        if (view3 != null && motionEvent.getY() > view3.getBottom()) {
            this.zzd = true;
            view.performClick();
            return true;
        }
        return false;
    }
}