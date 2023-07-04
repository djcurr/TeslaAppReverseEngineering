package j2;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import s1.h;
import vz.b0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private h f33114a;

    /* renamed from: b  reason: collision with root package name */
    private h00.a<b0> f33115b;

    /* renamed from: c  reason: collision with root package name */
    private h00.a<b0> f33116c;

    /* renamed from: d  reason: collision with root package name */
    private h00.a<b0> f33117d;

    /* renamed from: e  reason: collision with root package name */
    private h00.a<b0> f33118e;

    public c(h rect, h00.a<b0> aVar, h00.a<b0> aVar2, h00.a<b0> aVar3, h00.a<b0> aVar4) {
        s.g(rect, "rect");
        this.f33114a = rect;
        this.f33115b = aVar;
        this.f33116c = aVar2;
        this.f33117d = aVar3;
        this.f33118e = aVar4;
    }

    public final h a() {
        return this.f33114a;
    }

    public final boolean b(ActionMode actionMode, MenuItem menuItem) {
        s.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            h00.a<b0> aVar = this.f33115b;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            h00.a<b0> aVar2 = this.f33116c;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            h00.a<b0> aVar3 = this.f33117d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != 3) {
            return false;
        } else {
            h00.a<b0> aVar4 = this.f33118e;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final boolean c(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f33115b != null) {
                    menu.add(0, 0, 0, 17039361).setShowAsAction(1);
                }
                if (this.f33116c != null) {
                    menu.add(0, 1, 1, 17039371).setShowAsAction(1);
                }
                if (this.f33117d != null) {
                    menu.add(0, 2, 2, 17039363).setShowAsAction(1);
                }
                if (this.f33118e != null) {
                    menu.add(0, 3, 3, 17039373).setShowAsAction(1);
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void d() {
    }

    public final boolean e() {
        return false;
    }

    public final void f(h00.a<b0> aVar) {
        this.f33115b = aVar;
    }

    public final void g(h00.a<b0> aVar) {
        this.f33117d = aVar;
    }

    public final void h(h00.a<b0> aVar) {
        this.f33116c = aVar;
    }

    public final void i(h00.a<b0> aVar) {
        this.f33118e = aVar;
    }

    public final void j(h hVar) {
        s.g(hVar, "<set-?>");
        this.f33114a = hVar;
    }

    public /* synthetic */ c(h hVar, h00.a aVar, h00.a aVar2, h00.a aVar3, h00.a aVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? h.f49955e.a() : hVar, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : aVar2, (i11 & 8) != 0 ? null : aVar3, (i11 & 16) == 0 ? aVar4 : null);
    }
}