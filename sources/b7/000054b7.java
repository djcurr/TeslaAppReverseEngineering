package com.stripe.android.paymentsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes6.dex */
public final class BottomSheetController {
    private final f0<Boolean> _shouldFinish;
    private final BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
    private final LiveData<Boolean> shouldFinish;

    public BottomSheetController(BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        kotlin.jvm.internal.s.g(bottomSheetBehavior, "bottomSheetBehavior");
        this.bottomSheetBehavior = bottomSheetBehavior;
        f0<Boolean> f0Var = new f0<>(Boolean.FALSE);
        this._shouldFinish = f0Var;
        LiveData<Boolean> a11 = o0.a(f0Var);
        kotlin.jvm.internal.s.f(a11, "distinctUntilChanged(this)");
        this.shouldFinish = a11;
    }

    public final void expand() {
        this.bottomSheetBehavior.B0(3);
    }

    public final LiveData<Boolean> getShouldFinish$paymentsheet_release() {
        return this.shouldFinish;
    }

    public final void hide() {
        if (this.bottomSheetBehavior.g0() == 5) {
            this._shouldFinish.setValue(Boolean.TRUE);
        } else {
            this.bottomSheetBehavior.B0(5);
        }
    }

    public final void setup() {
        this.bottomSheetBehavior.u0(true);
        this.bottomSheetBehavior.p0(false);
        this.bottomSheetBehavior.B0(5);
        this.bottomSheetBehavior.z0(-1);
        this.bottomSheetBehavior.S(new BottomSheetBehavior.f() { // from class: com.stripe.android.paymentsheet.BottomSheetController$setup$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float f11) {
                kotlin.jvm.internal.s.g(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int i11) {
                BottomSheetBehavior bottomSheetBehavior;
                f0 f0Var;
                kotlin.jvm.internal.s.g(bottomSheet, "bottomSheet");
                if (i11 == 3) {
                    bottomSheetBehavior = BottomSheetController.this.bottomSheetBehavior;
                    bottomSheetBehavior.r0(false);
                } else if (i11 != 5) {
                } else {
                    f0Var = BottomSheetController.this._shouldFinish;
                    f0Var.setValue(Boolean.TRUE);
                }
            }
        });
    }
}