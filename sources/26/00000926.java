package androidx.transition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private Context f6219a;

    /* renamed from: b  reason: collision with root package name */
    private int f6220b = -1;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f6221c;

    /* renamed from: d  reason: collision with root package name */
    private View f6222d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f6223e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f6224f;

    public u(ViewGroup viewGroup, View view) {
        this.f6221c = viewGroup;
        this.f6222d = view;
    }

    public static u c(ViewGroup viewGroup) {
        return (u) viewGroup.getTag(s.f6212f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(ViewGroup viewGroup, u uVar) {
        viewGroup.setTag(s.f6212f, uVar);
    }

    public void a() {
        if (this.f6220b > 0 || this.f6222d != null) {
            d().removeAllViews();
            if (this.f6220b > 0) {
                LayoutInflater.from(this.f6219a).inflate(this.f6220b, this.f6221c);
            } else {
                this.f6221c.addView(this.f6222d);
            }
        }
        Runnable runnable = this.f6223e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f6221c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f6221c) != this || (runnable = this.f6224f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup d() {
        return this.f6221c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f6220b > 0;
    }
}