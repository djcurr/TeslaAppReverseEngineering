package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.plaid.link.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q6 extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_loading_fragment, viewGroup, false);
        Objects.requireNonNull(inflate, "rootView");
        FrameLayout frameLayout = (FrameLayout) inflate;
        kotlin.jvm.internal.s.f(frameLayout, "inflate(inflater, container, false).root");
        return frameLayout;
    }
}