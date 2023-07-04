package qv;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;
import vz.v;
import wz.e0;
import wz.s0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class k extends SimpleAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final a f48560e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f48561a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f48562b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48563c;

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayout f48564d;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: qv.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public enum EnumC1045a {
            LABEL,
            VALUE
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, String>> a(Context context, String countryCode) {
            Map l11;
            List d11;
            List<Map<String, String>> i11;
            List<vz.p> H0;
            int t11;
            List<Map<String, String>> y02;
            Map l12;
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            l11 = s0.l(v.a(EnumC1045a.LABEL.toString(), context.getResources().getString(t.f48680a)), v.a(EnumC1045a.VALUE.toString(), ""));
            d11 = wz.v.d(l11);
            if (kotlin.jvm.internal.s.c(countryCode, "US")) {
                String[] stringArray = context.getResources().getStringArray(n.f48640b);
                kotlin.jvm.internal.s.f(stringArray, "context.resources.getStr…array.database_us_states)");
                String[] stringArray2 = context.getResources().getStringArray(n.f48639a);
                kotlin.jvm.internal.s.f(stringArray2, "context.resources.getStr….database_us_state_codes)");
                H0 = wz.p.H0(stringArray, stringArray2);
                t11 = x.t(H0, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (vz.p pVar : H0) {
                    l12 = s0.l(v.a(EnumC1045a.LABEL.toString(), pVar.c()), v.a(EnumC1045a.VALUE.toString(), pVar.d()));
                    arrayList.add(l12);
                }
                y02 = e0.y0(d11, arrayList);
                return y02;
            }
            i11 = w.i();
            return i11;
        }

        public final void b(Spinner spinner, String value, h00.l<? super String, b0> listener) {
            kotlin.jvm.internal.s.g(spinner, "<this>");
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(listener, "listener");
            SpinnerAdapter adapter = spinner.getAdapter();
            k kVar = adapter instanceof k ? (k) adapter : null;
            if (kVar == null) {
                return;
            }
            int i11 = r.f48657l;
            Object tag = spinner.getTag(i11);
            b bVar = tag instanceof b ? (b) tag : null;
            if (bVar == null) {
                bVar = new b(kVar);
            }
            bVar.a(null);
            spinner.setSelection(kVar.f48562b.indexOf(value));
            bVar.a(listener);
            spinner.setOnItemSelectedListener(bVar);
            spinner.setTag(i11, bVar);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f48565a;

        /* renamed from: b  reason: collision with root package name */
        private h00.l<? super String, b0> f48566b;

        public b(k adapter) {
            kotlin.jvm.internal.s.g(adapter, "adapter");
            this.f48565a = adapter.f48562b;
        }

        public final void a(h00.l<? super String, b0> lVar) {
            this.f48566b = lVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            h00.l<? super String, b0> lVar = this.f48566b;
            if (lVar == null) {
                return;
            }
            lVar.invoke(this.f48565a.get(i11));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            h00.l<? super String, b0> lVar = this.f48566b;
            if (lVar == null) {
                return;
            }
            lVar.invoke("");
        }
    }

    public /* synthetic */ k(Context context, String str, List<Map<String, String>> list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? f48560e.a(context, str) : list);
    }

    private final int b(Context context, int i11) {
        TypedValue c11 = c(context, i11);
        int i12 = c11.resourceId;
        if (i12 == 0) {
            i12 = c11.data;
        }
        return androidx.core.content.b.getColor(context, i12);
    }

    private final TypedValue c(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue;
    }

    @Override // android.widget.SimpleAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (i11 == 0) {
            return this.f48564d;
        }
        View dropDownView = kotlin.jvm.internal.s.c(view, this.f48564d) ? super.getDropDownView(i11, null, viewGroup) : super.getDropDownView(i11, view, viewGroup);
        dropDownView.setPadding(this.f48563c, dropDownView.getPaddingTop(), dropDownView.getPaddingRight(), dropDownView.getPaddingBottom());
        kotlin.jvm.internal.s.f(dropDownView, "when (convertView) {\n   …ght, paddingBottom)\n    }");
        return dropDownView;
    }

    @Override // android.widget.SimpleAdapter, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i11, view, viewGroup);
        view2.setPadding(0, 0, 0, 0);
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (view2 instanceof TextView) {
            if (i11 == 0) {
                try {
                    Context context = ((TextView) view2).getContext();
                    kotlin.jvm.internal.s.f(context, "context");
                    ((TextView) view2).setTextColor(b(context, 16842906));
                } catch (RuntimeException unused) {
                }
            } else {
                Object item = getItem(i11);
                Map map = item instanceof Map ? (Map) item : null;
                if (map != null) {
                    Object obj = map.get(a.EnumC1045a.VALUE.toString());
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        ((TextView) view2).setText(str);
                    }
                }
            }
        }
        kotlin.jvm.internal.s.f(view2, "super.getView(position, …}\n        }\n      }\n    }");
        return view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String countryCode, List<? extends Map<String, String>> data) {
        super(context, data, s.f48679h, new String[]{a.EnumC1045a.LABEL.toString()}, new int[]{16908308});
        int t11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        kotlin.jvm.internal.s.g(data, "data");
        this.f48561a = context;
        t11 = x.t(data, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            String str = (String) ((Map) it2.next()).get(a.EnumC1045a.VALUE.toString());
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        this.f48562b = arrayList;
        this.f48563c = this.f48561a.getResources().getDimensionPixelSize(p.f48643a);
        LinearLayout linearLayout = new LinearLayout(this.f48561a);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        b0 b0Var = b0.f54756a;
        this.f48564d = linearLayout;
    }
}