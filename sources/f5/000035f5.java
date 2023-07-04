package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* loaded from: classes3.dex */
class n extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15261a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.material.datepicker.a f15262b;

    /* renamed from: c  reason: collision with root package name */
    private final d<?> f15263c;

    /* renamed from: d  reason: collision with root package name */
    private final h.l f15264d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15265e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f15266a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f15266a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (this.f15266a.getAdapter2().n(i11)) {
                n.this.f15264d.a(this.f15266a.getAdapter2().getItem(i11).longValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f15268a;

        /* renamed from: b  reason: collision with root package name */
        final MaterialCalendarGridView f15269b;

        b(LinearLayout linearLayout, boolean z11) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(fk.f.f26450u);
            this.f15268a = textView;
            a0.x0(textView, true);
            this.f15269b = (MaterialCalendarGridView) linearLayout.findViewById(fk.f.f26446q);
            if (z11) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l j11 = aVar.j();
        l g11 = aVar.g();
        l i11 = aVar.i();
        if (j11.compareTo(i11) <= 0) {
            if (i11.compareTo(g11) <= 0) {
                int t11 = m.f15255f * h.t(context);
                int t12 = i.q(context) ? h.t(context) : 0;
                this.f15261a = context;
                this.f15265e = t11 + t12;
                this.f15262b = aVar;
                this.f15263c = dVar;
                this.f15264d = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l b(int i11) {
        return this.f15262b.j().k(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence c(int i11) {
        return b(i11).h(this.f15261a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(l lVar) {
        return this.f15262b.j().l(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i11) {
        l k11 = this.f15262b.j().k(i11);
        bVar.f15268a.setText(k11.h(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f15269b.findViewById(fk.f.f26446q);
        if (materialCalendarGridView.getAdapter2() != null && k11.equals(materialCalendarGridView.getAdapter2().f15256a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            m mVar = new m(k11, this.f15263c, this.f15262b);
            materialCalendarGridView.setNumColumns(k11.f15251d);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i11) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(fk.h.f26474p, viewGroup, false);
        if (i.q(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f15265e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f15262b.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        return this.f15262b.j().k(i11).i();
    }
}