package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import l.b;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f35947a;

    /* renamed from: b  reason: collision with root package name */
    final b f35948b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f35949a;

        /* renamed from: b  reason: collision with root package name */
        final Context f35950b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f35951c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final androidx.collection.g<Menu, Menu> f35952d = new androidx.collection.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f35950b = context;
            this.f35949a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f35952d.get(menu);
            if (menu2 == null) {
                m.d dVar = new m.d(this.f35950b, (o3.a) menu);
                this.f35952d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // l.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f35949a.onActionItemClicked(e(bVar), new m.c(this.f35950b, (o3.b) menuItem));
        }

        @Override // l.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f35949a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // l.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f35949a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // l.b.a
        public void d(b bVar) {
            this.f35949a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f35951c.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = this.f35951c.get(i11);
                if (fVar != null && fVar.f35948b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f35950b, bVar);
            this.f35951c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f35947a = context;
        this.f35948b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f35948b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f35948b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new m.d(this.f35947a, (o3.a) this.f35948b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f35948b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f35948b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f35948b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f35948b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f35948b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f35948b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f35948b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f35948b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f35948b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f35948b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f35948b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z11) {
        this.f35948b.s(z11);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i11) {
        this.f35948b.n(i11);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i11) {
        this.f35948b.q(i11);
    }
}