package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h<S> extends p<S> {

    /* renamed from: l  reason: collision with root package name */
    static final Object f15189l = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: m  reason: collision with root package name */
    static final Object f15190m = "NAVIGATION_PREV_TAG";

    /* renamed from: n  reason: collision with root package name */
    static final Object f15191n = "NAVIGATION_NEXT_TAG";

    /* renamed from: o  reason: collision with root package name */
    static final Object f15192o = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b  reason: collision with root package name */
    private int f15193b;

    /* renamed from: c  reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f15194c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.material.datepicker.a f15195d;

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.material.datepicker.l f15196e;

    /* renamed from: f  reason: collision with root package name */
    private k f15197f;

    /* renamed from: g  reason: collision with root package name */
    private com.google.android.material.datepicker.c f15198g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f15199h;

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f15200i;

    /* renamed from: j  reason: collision with root package name */
    private View f15201j;

    /* renamed from: k  reason: collision with root package name */
    private View f15202k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15203a;

        a(int i11) {
            this.f15203a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f15200i.smoothScrollToPosition(this.f15203a);
        }
    }

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b(h hVar) {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.e0(null);
        }
    }

    /* loaded from: classes3.dex */
    class c extends q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i11, boolean z11, int i12) {
            super(context, i11, z11);
            this.f15205a = i12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.f15205a == 0) {
                iArr[0] = h.this.f15200i.getWidth();
                iArr[1] = h.this.f15200i.getWidth();
                return;
            }
            iArr[0] = h.this.f15200i.getHeight();
            iArr[1] = h.this.f15200i.getHeight();
        }
    }

    /* loaded from: classes3.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j11) {
            if (h.this.f15195d.f().e0(j11)) {
                h.this.f15194c.F1(j11);
                Iterator<o<S>> it2 = h.this.f15270a.iterator();
                while (it2.hasNext()) {
                    it2.next().a((S) h.this.f15194c.y1());
                }
                h.this.f15200i.getAdapter().notifyDataSetChanged();
                if (h.this.f15199h != null) {
                    h.this.f15199h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f15208a = s.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f15209b = s.k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int width;
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (v3.d<Long, Long> dVar : h.this.f15194c.F0()) {
                    Long l11 = dVar.f54019a;
                    if (l11 != null && dVar.f54020b != null) {
                        this.f15208a.setTimeInMillis(l11.longValue());
                        this.f15209b.setTimeInMillis(dVar.f54020b.longValue());
                        int c11 = tVar.c(this.f15208a.get(1));
                        int c12 = tVar.c(this.f15209b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(c11);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(c12);
                        int k11 = c11 / gridLayoutManager.k();
                        int k12 = c12 / gridLayoutManager.k();
                        int i11 = k11;
                        while (i11 <= k12) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.k() * i11);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + h.this.f15198g.f15179d.c();
                                int bottom = findViewByPosition3.getBottom() - h.this.f15198g.f15179d.b();
                                int left = i11 == k11 ? findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2) : 0;
                                if (i11 == k12) {
                                    width = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, h.this.f15198g.f15183h);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            String string;
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            if (h.this.f15202k.getVisibility() == 0) {
                string = h.this.getString(fk.i.f26495o);
            } else {
                string = h.this.getString(fk.i.f26493m);
            }
            cVar.p0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f15212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f15213b;

        g(n nVar, MaterialButton materialButton) {
            this.f15212a = nVar;
            this.f15213b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                CharSequence text = this.f15213b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            int findLastVisibleItemPosition;
            if (i11 < 0) {
                findLastVisibleItemPosition = h.this.v().findFirstVisibleItemPosition();
            } else {
                findLastVisibleItemPosition = h.this.v().findLastVisibleItemPosition();
            }
            h.this.f15196e = this.f15212a.b(findLastVisibleItemPosition);
            this.f15213b.setText(this.f15212a.c(findLastVisibleItemPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC0274h implements View.OnClickListener {
        View$OnClickListenerC0274h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f15216a;

        i(n nVar) {
            this.f15216a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = h.this.v().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < h.this.f15200i.getAdapter().getItemCount()) {
                h.this.y(this.f15216a.b(findFirstVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f15218a;

        j(n nVar) {
            this.f15218a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = h.this.v().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                h.this.y(this.f15218a.b(findLastVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface l {
        void a(long j11);
    }

    private void n(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(fk.f.f26447r);
        materialButton.setTag(f15192o);
        a0.w0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(fk.f.f26449t);
        materialButton2.setTag(f15190m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(fk.f.f26448s);
        materialButton3.setTag(f15191n);
        this.f15201j = view.findViewById(fk.f.A);
        this.f15202k = view.findViewById(fk.f.f26451v);
        z(k.DAY);
        materialButton.setText(this.f15196e.h(view.getContext()));
        this.f15200i.addOnScrollListener(new g(nVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC0274h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.o o() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(Context context) {
        return context.getResources().getDimensionPixelSize(fk.d.B);
    }

    private static int u(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(fk.d.I) + resources.getDimensionPixelOffset(fk.d.J) + resources.getDimensionPixelOffset(fk.d.H);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(fk.d.D);
        int i11 = m.f15255f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(fk.d.B) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(fk.d.G)) + resources.getDimensionPixelOffset(fk.d.f26422z);
    }

    public static <T> h<T> w(com.google.android.material.datepicker.d<T> dVar, int i11, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.i());
        hVar.setArguments(bundle);
        return hVar;
    }

    private void x(int i11) {
        this.f15200i.post(new a(i11));
    }

    void A() {
        k kVar = this.f15197f;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            z(k.DAY);
        } else if (kVar == k.DAY) {
            z(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.p
    public boolean a(o<S> oVar) {
        return super.a(oVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f15193b = bundle.getInt("THEME_RES_ID_KEY");
        this.f15194c = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f15195d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15196e = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f15193b);
        this.f15198g = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l j11 = this.f15195d.j();
        if (com.google.android.material.datepicker.i.q(contextThemeWrapper)) {
            i11 = fk.h.f26475q;
            i12 = 1;
        } else {
            i11 = fk.h.f26473o;
            i12 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(u(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(fk.f.f26452w);
        a0.w0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(j11.f15251d);
        gridView.setEnabled(false);
        this.f15200i = (RecyclerView) inflate.findViewById(fk.f.f26455z);
        this.f15200i.setLayoutManager(new c(getContext(), i12, false, i12));
        this.f15200i.setTag(f15189l);
        n nVar = new n(contextThemeWrapper, this.f15194c, this.f15195d, new d());
        this.f15200i.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(fk.g.f26458c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(fk.f.A);
        this.f15199h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f15199h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f15199h.setAdapter(new t(this));
            this.f15199h.addItemDecoration(o());
        }
        if (inflate.findViewById(fk.f.f26447r) != null) {
            n(inflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.q(contextThemeWrapper)) {
            new u().b(this.f15200i);
        }
        this.f15200i.scrollToPosition(nVar.d(this.f15196e));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f15193b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f15194c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15195d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f15196e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.a p() {
        return this.f15195d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.c q() {
        return this.f15198g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.l r() {
        return this.f15196e;
    }

    public com.google.android.material.datepicker.d<S> s() {
        return this.f15194c;
    }

    LinearLayoutManager v() {
        return (LinearLayoutManager) this.f15200i.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(com.google.android.material.datepicker.l lVar) {
        n nVar = (n) this.f15200i.getAdapter();
        int d11 = nVar.d(lVar);
        int d12 = d11 - nVar.d(this.f15196e);
        boolean z11 = Math.abs(d12) > 3;
        boolean z12 = d12 > 0;
        this.f15196e = lVar;
        if (z11 && z12) {
            this.f15200i.scrollToPosition(d11 - 3);
            x(d11);
        } else if (z11) {
            this.f15200i.scrollToPosition(d11 + 3);
            x(d11);
        } else {
            x(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f15197f = kVar;
        if (kVar == k.YEAR) {
            this.f15199h.getLayoutManager().scrollToPosition(((t) this.f15199h.getAdapter()).c(this.f15196e.f15250c));
            this.f15201j.setVisibility(0);
            this.f15202k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f15201j.setVisibility(8);
            this.f15202k.setVisibility(0);
            y(this.f15196e);
        }
    }
}