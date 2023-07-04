package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private int f4576a;

    /* renamed from: b  reason: collision with root package name */
    private int f4577b;

    public t(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f4576a | this.f4577b;
    }

    public void b(View view, View view2, int i11) {
        c(view, view2, i11, 0);
    }

    public void c(View view, View view2, int i11, int i12) {
        if (i12 == 1) {
            this.f4577b = i11;
        } else {
            this.f4576a = i11;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i11) {
        if (i11 == 1) {
            this.f4577b = 0;
        } else {
            this.f4576a = 0;
        }
    }
}