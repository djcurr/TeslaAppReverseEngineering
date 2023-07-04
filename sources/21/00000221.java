package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;

/* loaded from: classes.dex */
public final class g implements o3.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a */
    private final int f1426a;

    /* renamed from: b */
    private final int f1427b;

    /* renamed from: c */
    private final int f1428c;

    /* renamed from: d */
    private final int f1429d;

    /* renamed from: e */
    private CharSequence f1430e;

    /* renamed from: f */
    private CharSequence f1431f;

    /* renamed from: g */
    private Intent f1432g;

    /* renamed from: h */
    private char f1433h;

    /* renamed from: j */
    private char f1435j;

    /* renamed from: l */
    private Drawable f1437l;

    /* renamed from: n */
    e f1439n;

    /* renamed from: o */
    private m f1440o;

    /* renamed from: p */
    private Runnable f1441p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1442q;

    /* renamed from: r */
    private CharSequence f1443r;

    /* renamed from: s */
    private CharSequence f1444s;

    /* renamed from: z */
    private int f1451z;

    /* renamed from: i */
    private int f1434i = 4096;

    /* renamed from: k */
    private int f1436k = 4096;

    /* renamed from: m */
    private int f1438m = 0;

    /* renamed from: t */
    private ColorStateList f1445t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1446u = null;

    /* renamed from: v */
    private boolean f1447v = false;

    /* renamed from: w */
    private boolean f1448w = false;

    /* renamed from: x */
    private boolean f1449x = false;

    /* renamed from: y */
    private int f1450y = 16;
    private boolean D = false;

    /* loaded from: classes.dex */
    class a implements b.InterfaceC0075b {
        a() {
            g.this = r1;
        }

        @Override // androidx.core.view.b.InterfaceC0075b
        public void onActionProviderVisibilityChanged(boolean z11) {
            g gVar = g.this;
            gVar.f1439n.J(gVar);
        }
    }

    public g(e eVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.f1451z = 0;
        this.f1439n = eVar;
        this.f1426a = i12;
        this.f1427b = i11;
        this.f1428c = i13;
        this.f1429d = i14;
        this.f1430e = charSequence;
        this.f1451z = i15;
    }

    private static void d(StringBuilder sb2, int i11, int i12, String str) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1449x && (this.f1447v || this.f1448w)) {
            drawable = n3.a.r(drawable).mutate();
            if (this.f1447v) {
                n3.a.o(drawable, this.f1445t);
            }
            if (this.f1448w) {
                n3.a.p(drawable, this.f1446u);
            }
            this.f1449x = false;
        }
        return drawable;
    }

    public boolean A() {
        return this.f1439n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1451z & 4) == 4;
    }

    @Override // o3.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // o3.b
    public o3.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1439n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f1439n.I(this);
    }

    @Override // o3.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1451z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1439n.f(this);
        }
        return false;
    }

    @Override // o3.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1439n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f1429d;
    }

    public char g() {
        return this.f1439n.G() ? this.f1435j : this.f1433h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o3.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d11 = bVar.d(this);
            this.A = d11;
            return d11;
        }
        return null;
    }

    @Override // o3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1436k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1435j;
    }

    @Override // o3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1443r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1427b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1437l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1438m != 0) {
            Drawable d11 = h.a.d(this.f1439n.u(), this.f1438m);
            this.f1438m = 0;
            this.f1437l = d11;
            return e(d11);
        }
        return null;
    }

    @Override // o3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1445t;
    }

    @Override // o3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1446u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1432g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1426a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // o3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1434i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1433h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1428c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1440o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1430e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1431f;
        if (charSequence == null) {
            charSequence = this.f1430e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // o3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1444s;
    }

    public String h() {
        char g11 = g();
        if (g11 == 0) {
            return "";
        }
        Resources resources = this.f1439n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1439n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(g.h.f27173m));
        }
        int i11 = this.f1439n.G() ? this.f1436k : this.f1434i;
        d(sb2, i11, 65536, resources.getString(g.h.f27169i));
        d(sb2, i11, 4096, resources.getString(g.h.f27165e));
        d(sb2, i11, 2, resources.getString(g.h.f27164d));
        d(sb2, i11, 1, resources.getString(g.h.f27170j));
        d(sb2, i11, 4, resources.getString(g.h.f27172l));
        d(sb2, i11, 8, resources.getString(g.h.f27168h));
        if (g11 == '\b') {
            sb2.append(resources.getString(g.h.f27166f));
        } else if (g11 == '\n') {
            sb2.append(resources.getString(g.h.f27167g));
        } else if (g11 != ' ') {
            sb2.append(g11);
        } else {
            sb2.append(resources.getString(g.h.f27171k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1440o != null;
    }

    public CharSequence i(k.a aVar) {
        if (aVar != null && aVar.e()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // o3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1450y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1450y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1450y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f1450y & 8) == 0 : (this.f1450y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1451z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1442q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f1439n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f1441p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1432g != null) {
                try {
                    this.f1439n.u().startActivity(this.f1432g);
                    return true;
                } catch (ActivityNotFoundException e11) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e11);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f1450y & 32) == 32;
    }

    public boolean m() {
        return (this.f1450y & 4) != 0;
    }

    public boolean n() {
        return (this.f1451z & 1) == 1;
    }

    public boolean o() {
        return (this.f1451z & 2) == 2;
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: p */
    public o3.b setActionView(int i11) {
        Context u11 = this.f1439n.u();
        setActionView(LayoutInflater.from(u11).inflate(i11, (ViewGroup) new LinearLayout(u11), false));
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: q */
    public o3.b setActionView(View view) {
        int i11;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i11 = this.f1426a) > 0) {
            view.setId(i11);
        }
        this.f1439n.I(this);
        return this;
    }

    public void r(boolean z11) {
        this.D = z11;
        this.f1439n.K(false);
    }

    public void s(boolean z11) {
        int i11 = this.f1450y;
        int i12 = (z11 ? 2 : 0) | (i11 & (-3));
        this.f1450y = i12;
        if (i11 != i12) {
            this.f1439n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11) {
        if (this.f1435j == c11) {
            return this;
        }
        this.f1435j = Character.toLowerCase(c11);
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z11) {
        int i11 = this.f1450y;
        int i12 = (z11 ? 1 : 0) | (i11 & (-2));
        this.f1450y = i12;
        if (i11 != i12) {
            this.f1439n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z11) {
        if ((this.f1450y & 4) != 0) {
            this.f1439n.T(this);
        } else {
            s(z11);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.f1450y |= 16;
        } else {
            this.f1450y &= -17;
        }
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1438m = 0;
        this.f1437l = drawable;
        this.f1449x = true;
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1445t = colorStateList;
        this.f1447v = true;
        this.f1449x = true;
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1446u = mode;
        this.f1448w = true;
        this.f1449x = true;
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1432g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c11) {
        if (this.f1433h == c11) {
            return this;
        }
        this.f1433h = c11;
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1442q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12) {
        this.f1433h = c11;
        this.f1435j = Character.toLowerCase(c12);
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1451z = i11;
        this.f1439n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1430e = charSequence;
        this.f1439n.K(false);
        m mVar = this.f1440o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1431f = charSequence;
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z11) {
        if (y(z11)) {
            this.f1439n.J(this);
        }
        return this;
    }

    public void t(boolean z11) {
        this.f1450y = (z11 ? 4 : 0) | (this.f1450y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1430e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z11) {
        if (z11) {
            this.f1450y |= 32;
        } else {
            this.f1450y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // o3.b, android.view.MenuItem
    /* renamed from: w */
    public o3.b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    public void x(m mVar) {
        this.f1440o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z11) {
        int i11 = this.f1450y;
        int i12 = (z11 ? 0 : 8) | (i11 & (-9));
        this.f1450y = i12;
        return i11 != i12;
    }

    public boolean z() {
        return this.f1439n.A();
    }

    @Override // android.view.MenuItem
    public o3.b setContentDescription(CharSequence charSequence) {
        this.f1443r = charSequence;
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public o3.b setTooltipText(CharSequence charSequence) {
        this.f1444s = charSequence;
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.f1435j == c11 && this.f1436k == i11) {
            return this;
        }
        this.f1435j = Character.toLowerCase(c11);
        this.f1436k = KeyEvent.normalizeMetaState(i11);
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c11, int i11) {
        if (this.f1433h == c11 && this.f1434i == i11) {
            return this;
        }
        this.f1433h = c11;
        this.f1434i = KeyEvent.normalizeMetaState(i11);
        this.f1439n.K(false);
        return this;
    }

    @Override // o3.b, android.view.MenuItem
    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f1433h = c11;
        this.f1434i = KeyEvent.normalizeMetaState(i11);
        this.f1435j = Character.toLowerCase(c12);
        this.f1436k = KeyEvent.normalizeMetaState(i12);
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i11) {
        this.f1437l = null;
        this.f1438m = i11;
        this.f1449x = true;
        this.f1439n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i11) {
        return setTitle(this.f1439n.u().getString(i11));
    }
}