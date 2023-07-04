package m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f37806a;

    /* renamed from: b  reason: collision with root package name */
    private g<o3.b, MenuItem> f37807b;

    /* renamed from: c  reason: collision with root package name */
    private g<o3.c, SubMenu> f37808c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f37806a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof o3.b) {
            o3.b bVar = (o3.b) menuItem;
            if (this.f37807b == null) {
                this.f37807b = new g<>();
            }
            MenuItem menuItem2 = this.f37807b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f37806a, bVar);
                this.f37807b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof o3.c) {
            o3.c cVar = (o3.c) subMenu;
            if (this.f37808c == null) {
                this.f37808c = new g<>();
            }
            SubMenu subMenu2 = this.f37808c.get(cVar);
            if (subMenu2 == null) {
                f fVar = new f(this.f37806a, cVar);
                this.f37808c.put(cVar, fVar);
                return fVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        g<o3.b, MenuItem> gVar = this.f37807b;
        if (gVar != null) {
            gVar.clear();
        }
        g<o3.c, SubMenu> gVar2 = this.f37808c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i11) {
        if (this.f37807b == null) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f37807b.size()) {
            if (this.f37807b.k(i12).getGroupId() == i11) {
                this.f37807b.m(i12);
                i12--;
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i11) {
        if (this.f37807b == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f37807b.size(); i12++) {
            if (this.f37807b.k(i12).getItemId() == i11) {
                this.f37807b.m(i12);
                return;
            }
        }
    }
}