package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements o3.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f37787a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37788b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37789c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f37790d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f37791e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f37792f;

    /* renamed from: g  reason: collision with root package name */
    private char f37793g;

    /* renamed from: i  reason: collision with root package name */
    private char f37795i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f37797k;

    /* renamed from: l  reason: collision with root package name */
    private Context f37798l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f37799m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f37800n;

    /* renamed from: h  reason: collision with root package name */
    private int f37794h = 4096;

    /* renamed from: j  reason: collision with root package name */
    private int f37796j = 4096;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f37801o = null;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f37802p = null;

    /* renamed from: q  reason: collision with root package name */
    private boolean f37803q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f37804r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f37805s = 16;

    public a(Context context, int i11, int i12, int i13, int i14, CharSequence charSequence) {
        this.f37798l = context;
        this.f37787a = i12;
        this.f37788b = i11;
        this.f37789c = i14;
        this.f37790d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f37797k;
        if (drawable != null) {
            if (this.f37803q || this.f37804r) {
                Drawable r11 = n3.a.r(drawable);
                this.f37797k = r11;
                Drawable mutate = r11.mutate();
                this.f37797k = mutate;
                if (this.f37803q) {
                    n3.a.o(mutate, this.f37801o);
                }
                if (this.f37804r) {
                    n3.a.p(this.f37797k, this.f37802p);
                }
            }
        }
    }

    @Override // o3.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // o3.b
    public o3.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // o3.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: d */
    public o3.b setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: e */
    public o3.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // o3.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: f */
    public o3.b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o3.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // o3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f37796j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f37795i;
    }

    @Override // o3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f37799m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f37788b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f37797k;
    }

    @Override // o3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f37801o;
    }

    @Override // o3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f37802p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f37792f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f37787a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f37794h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f37793g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f37789c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f37790d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f37791e;
        return charSequence != null ? charSequence : this.f37790d;
    }

    @Override // o3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f37800n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // o3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f37805s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f37805s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f37805s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f37805s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        this.f37795i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        this.f37805s = (z11 ? 1 : 0) | (this.f37805s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        this.f37805s = (z11 ? 2 : 0) | (this.f37805s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        this.f37805s = (z11 ? 16 : 0) | (this.f37805s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f37797k = drawable;
        c();
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f37801o = colorStateList;
        this.f37803q = true;
        c();
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f37802p = mode;
        this.f37804r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f37792f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        this.f37793g = c11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f37793g = c11;
        this.f37795i = Character.toLowerCase(c12);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public void setShowAsAction(int i11) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f37790d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f37791e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        this.f37805s = (this.f37805s & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f37795i = Character.toLowerCase(c11);
        this.f37796j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public o3.b setContentDescription(CharSequence charSequence) {
        this.f37799m = charSequence;
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        this.f37793g = c11;
        this.f37794h = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        this.f37790d = this.f37798l.getResources().getString(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public o3.b setTooltipText(CharSequence charSequence) {
        this.f37800n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f37797k = androidx.core.content.b.getDrawable(this.f37798l, i11);
        c();
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f37793g = c11;
        this.f37794h = KeyEvent.normalizeMetaState(i11);
        this.f37795i = Character.toLowerCase(c12);
        this.f37796j = KeyEvent.normalizeMetaState(i12);
        return this;
    }
}