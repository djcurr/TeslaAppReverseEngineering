package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CountryAdapter extends ArrayAdapter<Country> {
    private final CountryFilter countryFilter;
    private List<Country> suggestions;
    private final h00.l<ViewGroup, TextView> textViewFactory;
    private List<Country> unfilteredCountries;

    /* loaded from: classes6.dex */
    private static final class CountryFilter extends Filter {
        private final WeakReference<Activity> activityRef;
        private final CountryAdapter adapter;
        private List<Country> unfilteredCountries;

        public CountryFilter(List<Country> unfilteredCountries, CountryAdapter adapter, Activity activity) {
            kotlin.jvm.internal.s.g(unfilteredCountries, "unfilteredCountries");
            kotlin.jvm.internal.s.g(adapter, "adapter");
            this.unfilteredCountries = unfilteredCountries;
            this.adapter = adapter;
            this.activityRef = new WeakReference<>(activity);
        }

        private final List<Country> filteredSuggestedCountries(CharSequence charSequence) {
            List<Country> suggestedCountries = getSuggestedCountries(charSequence);
            return (suggestedCountries.isEmpty() || isMatch(suggestedCountries, charSequence)) ? this.unfilteredCountries : suggestedCountries;
        }

        private final List<Country> getSuggestedCountries(CharSequence charSequence) {
            boolean H;
            List<Country> list = this.unfilteredCountries;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String name = ((Country) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                kotlin.jvm.internal.s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                kotlin.jvm.internal.s.f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                H = kotlin.text.v.H(lowerCase, lowerCase2, false, 2, null);
                if (H) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final void hideKeyboard(Activity activity) {
            Object systemService = activity.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                View currentFocus = activity.getCurrentFocus();
                inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
            }
        }

        private final boolean isMatch(List<Country> list, CharSequence charSequence) {
            return list.size() == 1 && kotlin.jvm.internal.s.c(list.get(0).getName(), String.valueOf(charSequence));
        }

        public final List<Country> getUnfilteredCountries() {
            return this.unfilteredCountries;
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List<Country> filteredSuggestedCountries = charSequence == null ? null : filteredSuggestedCountries(charSequence);
            if (filteredSuggestedCountries == null) {
                filteredSuggestedCountries = this.unfilteredCountries;
            }
            filterResults.values = filteredSuggestedCountries;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults == null ? null : filterResults.values;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = this.activityRef.get();
            if (activity != null) {
                boolean z11 = false;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (kotlin.jvm.internal.s.c(((Country) it2.next()).getName(), charSequence)) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    hideKeyboard(activity);
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }

        public final void setUnfilteredCountries(List<Country> list) {
            kotlin.jvm.internal.s.g(list, "<set-?>");
            this.unfilteredCountries = list;
        }
    }

    public /* synthetic */ CountryAdapter(Context context, List list, int i11, h00.l lVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i12 & 4) != 0 ? R.layout.country_text_view : i11, lVar);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestions.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.countryFilter;
    }

    public final /* synthetic */ Country getFirstItem$payments_core_release() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i11) {
        return getItem(i11).hashCode();
    }

    public final List<Country> getUnfilteredCountries$payments_core_release() {
        return this.unfilteredCountries;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(viewGroup, "viewGroup");
        TextView invoke = view instanceof TextView ? (TextView) view : this.textViewFactory.invoke(viewGroup);
        invoke.setText(getItem(i11).getName());
        return invoke;
    }

    public final void setUnfilteredCountries$payments_core_release(List<Country> list) {
        kotlin.jvm.internal.s.g(list, "<set-?>");
        this.unfilteredCountries = list;
    }

    public final boolean updateUnfilteredCountries$payments_core_release(Set<String> allowedCountryCodes) {
        boolean u11;
        kotlin.jvm.internal.s.g(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List<Country> list = this.unfilteredCountries;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean z11 = true;
            if (it2.hasNext()) {
                Object next = it2.next();
                CountryCode component1 = ((Country) next).component1();
                if (!allowedCountryCodes.isEmpty()) {
                    for (String str : allowedCountryCodes) {
                        u11 = kotlin.text.v.u(str, component1.getValue(), true);
                        if (u11) {
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    arrayList.add(next);
                }
            } else {
                this.unfilteredCountries = arrayList;
                this.countryFilter.setUnfilteredCountries(arrayList);
                this.suggestions = this.unfilteredCountries;
                notifyDataSetChanged();
                return true;
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Country getItem(int i11) {
        return this.suggestions.get(i11);
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Country country) {
        int g02;
        g02 = wz.e0.g0(this.suggestions, country);
        return g02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountryAdapter(Context context, List<Country> unfilteredCountries, int i11, h00.l<? super ViewGroup, ? extends TextView> textViewFactory) {
        super(context, i11);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(unfilteredCountries, "unfilteredCountries");
        kotlin.jvm.internal.s.g(textViewFactory, "textViewFactory");
        this.unfilteredCountries = unfilteredCountries;
        this.textViewFactory = textViewFactory;
        this.countryFilter = new CountryFilter(this.unfilteredCountries, this, context instanceof Activity ? (Activity) context : null);
        this.suggestions = this.unfilteredCountries;
    }
}