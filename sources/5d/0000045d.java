package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class c0 implements p1 {

    /* renamed from: a  reason: collision with root package name */
    private final View f2855a;

    /* renamed from: b  reason: collision with root package name */
    private ActionMode f2856b;

    /* renamed from: c  reason: collision with root package name */
    private final j2.c f2857c;

    /* renamed from: d  reason: collision with root package name */
    private r1 f2858d;

    public c0(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        this.f2855a = view;
        this.f2857c = new j2.c(null, null, null, null, null, 31, null);
        this.f2858d = r1.Hidden;
    }

    @Override // androidx.compose.ui.platform.p1
    public void a(s1.h rect, h00.a<vz.b0> aVar, h00.a<vz.b0> aVar2, h00.a<vz.b0> aVar3, h00.a<vz.b0> aVar4) {
        ActionMode startActionMode;
        kotlin.jvm.internal.s.g(rect, "rect");
        this.f2857c.j(rect);
        this.f2857c.f(aVar);
        this.f2857c.g(aVar3);
        this.f2857c.h(aVar2);
        this.f2857c.i(aVar4);
        ActionMode actionMode = this.f2856b;
        if (actionMode != null) {
            if (actionMode == null) {
                return;
            }
            actionMode.invalidate();
            return;
        }
        this.f2858d = r1.Shown;
        if (Build.VERSION.SDK_INT >= 23) {
            startActionMode = q1.f3051a.a(this.f2855a, new j2.a(this.f2857c), 1);
        } else {
            startActionMode = this.f2855a.startActionMode(new j2.b(this.f2857c));
        }
        this.f2856b = startActionMode;
    }

    @Override // androidx.compose.ui.platform.p1
    public r1 getStatus() {
        return this.f2858d;
    }

    @Override // androidx.compose.ui.platform.p1
    public void hide() {
        this.f2858d = r1.Hidden;
        ActionMode actionMode = this.f2856b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f2856b = null;
    }
}