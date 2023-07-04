package com.adyen.threeds2.internal.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.adyen.threeds2.R;

/* loaded from: classes.dex */
public class c extends e {
    public static c a() {
        return new c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setCancelable(false);
        return layoutInflater.inflate(R.layout.a3ds2_widget_progress_dialog, viewGroup, false);
    }
}