package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f12209a;

    /* renamed from: b  reason: collision with root package name */
    private int f12210b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int[] f12211c;

    /* loaded from: classes3.dex */
    class a implements Comparator<View> {
        a(a1 a1Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = r0;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public a1(ViewGroup viewGroup) {
        this.f12209a = viewGroup;
    }

    public int a(int i11, int i12) {
        if (this.f12211c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList.add(this.f12209a.getChildAt(i13));
            }
            Collections.sort(arrayList, new a(this));
            this.f12211c = new int[i11];
            for (int i14 = 0; i14 < i11; i14++) {
                this.f12211c[i14] = this.f12209a.indexOfChild((View) arrayList.get(i14));
            }
        }
        return this.f12211c[i12];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f12210b++;
        }
        this.f12211c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f12210b--;
        }
        this.f12211c = null;
    }

    public boolean d() {
        return this.f12210b > 0;
    }

    public void e() {
        this.f12210b = 0;
        for (int i11 = 0; i11 < this.f12209a.getChildCount(); i11++) {
            if (ViewGroupManager.getViewZIndex(this.f12209a.getChildAt(i11)) != null) {
                this.f12210b++;
            }
        }
        this.f12211c = null;
    }
}