package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public interface b0 {
    void a(Drawable drawable);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(Menu menu, j.a aVar);

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    boolean i();

    void j(int i11);

    Menu k();

    int l();

    androidx.core.view.g0 m(int i11, long j11);

    ViewGroup n();

    void o(boolean z11);

    void p();

    void q(boolean z11);

    void r();

    void s(n0 n0Var);

    void setIcon(int i11);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i11);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i11);

    void u(j.a aVar, e.a aVar2);

    int v();

    void w(View view);

    void x();

    void y(Drawable drawable);
}