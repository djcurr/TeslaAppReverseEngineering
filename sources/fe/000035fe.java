package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class t extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f15275a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15276a;

        a(int i11) {
            this.f15276a = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f15275a.y(t.this.f15275a.p().e(l.b(this.f15276a, t.this.f15275a.r().f15249b)));
            t.this.f15275a.z(h.k.DAY);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f15278a;

        b(TextView textView) {
            super(textView);
            this.f15278a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(h<?> hVar) {
        this.f15275a = hVar;
    }

    private View.OnClickListener b(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i11) {
        return i11 - this.f15275a.p().j().f15250c;
    }

    int d(int i11) {
        return this.f15275a.p().j().f15250c + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i11) {
        int d11 = d(i11);
        String string = bVar.f15278a.getContext().getString(fk.i.f26491k);
        bVar.f15278a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d11)));
        bVar.f15278a.setContentDescription(String.format(string, Integer.valueOf(d11)));
        c q11 = this.f15275a.q();
        Calendar i12 = s.i();
        com.google.android.material.datepicker.b bVar2 = i12.get(1) == d11 ? q11.f15181f : q11.f15179d;
        for (Long l11 : this.f15275a.s().v1()) {
            i12.setTimeInMillis(l11.longValue());
            if (i12.get(1) == d11) {
                bVar2 = q11.f15180e;
            }
        }
        bVar2.d(bVar.f15278a);
        bVar.f15278a.setOnClickListener(b(d11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(fk.h.f26476r, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f15275a.p().k();
    }
}