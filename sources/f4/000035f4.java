package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    static final int f15255f = s.k().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    final l f15256a;

    /* renamed from: b  reason: collision with root package name */
    final d<?> f15257b;

    /* renamed from: c  reason: collision with root package name */
    private Collection<Long> f15258c;

    /* renamed from: d  reason: collision with root package name */
    c f15259d;

    /* renamed from: e  reason: collision with root package name */
    final a f15260e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar, d<?> dVar, a aVar) {
        this.f15256a = lVar;
        this.f15257b = dVar;
        this.f15260e = aVar;
        this.f15258c = dVar.v1();
    }

    private void e(Context context) {
        if (this.f15259d == null) {
            this.f15259d = new c(context);
        }
    }

    private boolean h(long j11) {
        Iterator<Long> it2 = this.f15257b.v1().iterator();
        while (it2.hasNext()) {
            if (s.a(j11) == s.a(it2.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j11) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f15260e.f().e0(j11)) {
            textView.setEnabled(true);
            if (h(j11)) {
                bVar = this.f15259d.f15177b;
            } else if (s.i().getTimeInMillis() == j11) {
                bVar = this.f15259d.f15178c;
            } else {
                bVar = this.f15259d.f15176a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f15259d.f15182g;
        }
        bVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j11) {
        if (l.c(j11).equals(this.f15256a)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.f15256a.g(j11)) - materialCalendarGridView.getFirstVisiblePosition()), j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i11) {
        return b() + (i11 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f15256a.e();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i11) {
        if (i11 < this.f15256a.e() || i11 > i()) {
            return null;
        }
        return Long.valueOf(this.f15256a.f(j(i11)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = fk.h.f26471m
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f15256a
            int r2 = r8.f15252e
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f15256a
            long r7 = r8.f(r7)
            com.google.android.material.datepicker.l r3 = r5.f15256a
            int r3 = r3.f15250c
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.d()
            int r4 = r4.f15250c
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i11) {
        return i11 % this.f15256a.f15251d == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i11) {
        return (i11 + 1) % this.f15256a.f15251d == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15256a.f15252e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11 / this.f15256a.f15251d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return (this.f15256a.e() + this.f15256a.f15252e) - 1;
    }

    int j(int i11) {
        return (i11 - this.f15256a.e()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l11 : this.f15258c) {
            l(materialCalendarGridView, l11.longValue());
        }
        d<?> dVar = this.f15257b;
        if (dVar != null) {
            for (Long l12 : dVar.v1()) {
                l(materialCalendarGridView, l12.longValue());
            }
            this.f15258c = this.f15257b.v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(int i11) {
        return i11 >= b() && i11 <= i();
    }
}