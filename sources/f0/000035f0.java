package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k<S> extends p<S> {

    /* renamed from: b  reason: collision with root package name */
    private int f15244b;

    /* renamed from: c  reason: collision with root package name */
    private d<S> f15245c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.material.datepicker.a f15246d;

    /* loaded from: classes3.dex */
    class a extends o<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s11) {
            Iterator<o<S>> it2 = k.this.f15270a.iterator();
            while (it2.hasNext()) {
                it2.next().a(s11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> k<T> f(d<T> dVar, int i11, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15244b = bundle.getInt("THEME_RES_ID_KEY");
        this.f15245c = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f15246d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f15245c.Z0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f15244b)), viewGroup, bundle, this.f15246d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f15244b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f15245c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15246d);
    }
}