package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
class g extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f15185d;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f15186a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15187b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15188c;

    static {
        f15185d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar k11 = s.k();
        this.f15186a = k11;
        this.f15187b = k11.getMaximum(7);
        this.f15188c = k11.getFirstDayOfWeek();
    }

    private int b(int i11) {
        int i12 = i11 + this.f15188c;
        int i13 = this.f15187b;
        return i12 > i13 ? i12 - i13 : i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i11) {
        if (i11 >= this.f15187b) {
            return null;
        }
        return Integer.valueOf(b(i11));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15187b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(fk.h.f26472n, viewGroup, false);
        }
        this.f15186a.set(7, b(i11));
        textView.setText(this.f15186a.getDisplayName(7, f15185d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(fk.i.f26490j), this.f15186a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}