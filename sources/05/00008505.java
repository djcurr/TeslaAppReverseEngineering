package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class f extends d implements SubMenu {

    /* renamed from: e */
    private final o3.c f37820e;

    public f(Context context, o3.c cVar) {
        super(context, cVar);
        this.f37820e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f37820e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f37820e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i11) {
        this.f37820e.setHeaderIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i11) {
        this.f37820e.setHeaderTitle(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f37820e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i11) {
        this.f37820e.setIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f37820e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f37820e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f37820e.setIcon(drawable);
        return this;
    }
}