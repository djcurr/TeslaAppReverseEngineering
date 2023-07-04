package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f14879a;

    /* renamed from: b  reason: collision with root package name */
    private int f14880b;

    /* renamed from: c  reason: collision with root package name */
    private int f14881c;

    /* renamed from: d  reason: collision with root package name */
    private int f14882d;

    /* renamed from: e  reason: collision with root package name */
    private int f14883e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14884f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14885g = true;

    public d(View view) {
        this.f14879a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f14879a;
        a0.h0(view, this.f14882d - (view.getTop() - this.f14880b));
        View view2 = this.f14879a;
        a0.g0(view2, this.f14883e - (view2.getLeft() - this.f14881c));
    }

    public int b() {
        return this.f14882d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f14880b = this.f14879a.getTop();
        this.f14881c = this.f14879a.getLeft();
    }

    public boolean d(int i11) {
        if (!this.f14885g || this.f14883e == i11) {
            return false;
        }
        this.f14883e = i11;
        a();
        return true;
    }

    public boolean e(int i11) {
        if (!this.f14884f || this.f14882d == i11) {
            return false;
        }
        this.f14882d = i11;
        a();
        return true;
    }
}