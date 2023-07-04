package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
abstract class p<S> extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedHashSet<o<S>> f15270a = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(o<S> oVar) {
        return this.f15270a.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f15270a.clear();
    }
}