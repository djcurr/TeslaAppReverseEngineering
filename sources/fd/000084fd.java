package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c extends m.b implements MenuItem {

    /* renamed from: d */
    private final o3.b f37809d;

    /* renamed from: e */
    private Method f37810e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.core.view.b {

        /* renamed from: b */
        final ActionProvider f37811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ActionProvider actionProvider) {
            super(context);
            c.this = r1;
            this.f37811b = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f37811b.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View c() {
            return this.f37811b.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f37811b.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f37811b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private b.InterfaceC0075b f37813d;

        b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f37811b.isVisible();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f37811b.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f37811b.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(b.InterfaceC0075b interfaceC0075b) {
            this.f37813d = interfaceC0075b;
            this.f37811b.setVisibilityListener(interfaceC0075b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z11) {
            b.InterfaceC0075b interfaceC0075b = this.f37813d;
            if (interfaceC0075b != null) {
                interfaceC0075b.onActionProviderVisibilityChanged(z11);
            }
        }
    }

    /* renamed from: m.c$c */
    /* loaded from: classes.dex */
    static class C0715c extends FrameLayout implements l.c {

        /* renamed from: a */
        final CollapsibleActionView f37814a;

        C0715c(View view) {
            super(view.getContext());
            this.f37814a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f37814a;
        }

        @Override // l.c
        public void b() {
            this.f37814a.onActionViewExpanded();
        }

        @Override // l.c
        public void f() {
            this.f37814a.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f37815a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            c.this = r1;
            this.f37815a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f37815a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f37815a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f37817a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            c.this = r1;
            this.f37817a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f37817a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, o3.b bVar) {
        super(context);
        if (bVar != null) {
            this.f37809d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f37809d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f37809d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b a11 = this.f37809d.a();
        if (a11 instanceof a) {
            return ((a) a11).f37811b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f37809d.getActionView();
        return actionView instanceof C0715c ? ((C0715c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f37809d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f37809d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f37809d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f37809d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f37809d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f37809d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f37809d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f37809d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f37809d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f37809d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f37809d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f37809d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f37809d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f37809d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f37809d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f37809d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f37809d.getTooltipText();
    }

    public void h(boolean z11) {
        try {
            if (this.f37810e == null) {
                this.f37810e = this.f37809d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f37810e.invoke(this.f37809d, Boolean.valueOf(z11));
        } catch (Exception e11) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f37809d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f37809d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f37809d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f37809d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f37809d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f37809d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        androidx.core.view.b aVar;
        if (Build.VERSION.SDK_INT >= 16) {
            aVar = new b(this, this.f37806a, actionProvider);
        } else {
            aVar = new a(this.f37806a, actionProvider);
        }
        o3.b bVar = this.f37809d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0715c(view);
        }
        this.f37809d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        this.f37809d.setAlphabeticShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        this.f37809d.setCheckable(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        this.f37809d.setChecked(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f37809d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        this.f37809d.setEnabled(z11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f37809d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f37809d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f37809d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f37809d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        this.f37809d.setNumericShortcut(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f37809d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f37809d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f37809d.setShortcut(c11, c12);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i11) {
        this.f37809d.setShowAsAction(i11);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i11) {
        this.f37809d.setShowAsActionFlags(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f37809d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f37809d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f37809d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        return this.f37809d.setVisible(z11);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f37809d.setAlphabeticShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f37809d.setIcon(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        this.f37809d.setNumericShortcut(c11, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f37809d.setShortcut(c11, c12, i11, i12);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        this.f37809d.setTitle(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i11) {
        this.f37809d.setActionView(i11);
        View actionView = this.f37809d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f37809d.setActionView(new C0715c(actionView));
        }
        return this;
    }
}