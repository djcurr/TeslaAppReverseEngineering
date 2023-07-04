package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.h<g> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<View> f20209a = new ArrayList<>();

    public final void a(View child, int i11) {
        s.g(child, "child");
        this.f20209a.add(i11, child);
        notifyItemInserted(i11);
    }

    public final View b(int i11) {
        View view = this.f20209a.get(i11);
        s.f(view, "childrenViews[index]");
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(g holder, int i11) {
        s.g(holder, "holder");
        FrameLayout b11 = holder.b();
        View b12 = b(i11);
        if (b11.getChildCount() > 0) {
            b11.removeAllViews();
        }
        if (b12.getParent() != null) {
            ViewParent parent = b12.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(b12);
        }
        b11.addView(b12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public g onCreateViewHolder(ViewGroup parent, int i11) {
        s.g(parent, "parent");
        return g.f20210a.a(parent);
    }

    public final void e() {
        int size = this.f20209a.size();
        this.f20209a.clear();
        notifyItemRangeRemoved(0, size);
    }

    public final void f(View child) {
        s.g(child, "child");
        g(this.f20209a.indexOf(child));
    }

    public final void g(int i11) {
        this.f20209a.remove(i11);
        notifyItemRemoved(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f20209a.size();
    }
}