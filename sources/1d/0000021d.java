package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class e implements o3.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f1396a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f1397b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1398c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1399d;

    /* renamed from: e  reason: collision with root package name */
    private a f1400e;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1408m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f1409n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f1410o;

    /* renamed from: p  reason: collision with root package name */
    View f1411p;

    /* renamed from: x  reason: collision with root package name */
    private g f1419x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1421z;

    /* renamed from: l  reason: collision with root package name */
    private int f1407l = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1412q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1413r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1414s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1415t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1416u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f1417v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f1418w = new CopyOnWriteArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private boolean f1420y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f1401f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f1402g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1403h = true;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f1404i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f1405j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private boolean f1406k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean d(g gVar);
    }

    public e(Context context) {
        this.f1396a = context;
        this.f1397b = context.getResources();
        b0(true);
    }

    private static int B(int i11) {
        int i12 = ((-65536) & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = A;
            if (i12 < iArr.length) {
                return (i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i11, boolean z11) {
        if (i11 < 0 || i11 >= this.f1401f.size()) {
            return;
        }
        this.f1401f.remove(i11);
        if (z11) {
            K(true);
        }
    }

    private void W(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f1411p = view;
            this.f1409n = null;
            this.f1410o = null;
        } else {
            if (i11 > 0) {
                this.f1409n = C.getText(i11);
            } else if (charSequence != null) {
                this.f1409n = charSequence;
            }
            if (i12 > 0) {
                this.f1410o = androidx.core.content.b.getDrawable(u(), i12);
            } else if (drawable != null) {
                this.f1410o = drawable;
            }
            this.f1411p = null;
        }
        K(false);
    }

    private void b0(boolean z11) {
        boolean z12 = true;
        this.f1399d = (z11 && this.f1397b.getConfiguration().keyboard != 1 && c0.e(ViewConfiguration.get(this.f1396a), this.f1396a)) ? false : false;
    }

    private g g(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new g(this, i11, i12, i13, i14, charSequence, i15);
    }

    private void i(boolean z11) {
        if (this.f1418w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
        while (it2.hasNext()) {
            WeakReference<j> next = it2.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1418w.remove(next);
            } else {
                jVar.f(z11);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f1418w.isEmpty()) {
            return false;
        }
        boolean e11 = jVar != null ? jVar.e(mVar) : false;
        Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
        while (it2.hasNext()) {
            WeakReference<j> next = it2.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f1418w.remove(next);
            } else if (!e11) {
                e11 = jVar2.e(mVar);
            }
        }
        return e11;
    }

    private static int n(ArrayList<g> arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f1415t;
    }

    Resources C() {
        return this.f1397b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (this.f1403h) {
            this.f1402g.clear();
            int size = this.f1401f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f1401f.get(i11);
                if (gVar.isVisible()) {
                    this.f1402g.add(gVar);
                }
            }
            this.f1403h = false;
            this.f1406k = true;
            return this.f1402g;
        }
        return this.f1402g;
    }

    public boolean F() {
        return this.f1420y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f1398c;
    }

    public boolean H() {
        return this.f1399d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f1406k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f1403h = true;
        K(true);
    }

    public void K(boolean z11) {
        if (!this.f1412q) {
            if (z11) {
                this.f1403h = true;
                this.f1406k = true;
            }
            i(z11);
            return;
        }
        this.f1413r = true;
        if (z11) {
            this.f1414s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i11) {
        return M(menuItem, null, i11);
    }

    public boolean M(MenuItem menuItem, j jVar, int i11) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k11 = gVar.k();
        androidx.core.view.b a11 = gVar.a();
        boolean z11 = a11 != null && a11.a();
        if (gVar.j()) {
            k11 |= gVar.expandActionView();
            if (k11) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z11) {
            if ((i11 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z11) {
                a11.f(mVar);
            }
            k11 |= j(mVar, jVar);
            if (!k11) {
                e(true);
            }
        } else if ((i11 & 1) == 0) {
            e(true);
        }
        return k11;
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
        while (it2.hasNext()) {
            WeakReference<j> next = it2.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1418w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (findItem = findItem(i12)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1400e = aVar;
    }

    public e S(int i11) {
        this.f1407l = i11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1401f.size();
        d0();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1401f.get(i11);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e U(int i11) {
        W(0, null, i11, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e X(int i11) {
        W(i11, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i11, int i12, int i13, CharSequence charSequence) {
        int B = B(i13);
        g g11 = g(i11, i12, i13, B, charSequence, this.f1407l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1408m;
        if (contextMenuInfo != null) {
            g11.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f1401f;
        arrayList.add(n(arrayList, B), g11);
        K(true);
        return g11;
    }

    public void a0(boolean z11) {
        this.f1421z = z11;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f1396a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1396a);
    }

    public void c(j jVar, Context context) {
        this.f1418w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.f1406k = true;
    }

    public void c0() {
        this.f1412q = false;
        if (this.f1413r) {
            this.f1413r = false;
            K(this.f1414s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f1419x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1401f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1410o = null;
        this.f1409n = null;
        this.f1411p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1400e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f1412q) {
            return;
        }
        this.f1412q = true;
        this.f1413r = false;
        this.f1414s = false;
    }

    public final void e(boolean z11) {
        if (this.f1416u) {
            return;
        }
        this.f1416u = true;
        Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
        while (it2.hasNext()) {
            WeakReference<j> next = it2.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1418w.remove(next);
            } else {
                jVar.a(this, z11);
            }
        }
        this.f1416u = false;
    }

    public boolean f(g gVar) {
        boolean z11 = false;
        if (!this.f1418w.isEmpty() && this.f1419x == gVar) {
            d0();
            Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
            while (it2.hasNext()) {
                WeakReference<j> next = it2.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f1418w.remove(next);
                } else {
                    z11 = jVar.h(this, gVar);
                    if (z11) {
                        break;
                    }
                }
            }
            c0();
            if (z11) {
                this.f1419x = null;
            }
        }
        return z11;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        MenuItem findItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1401f.get(i12);
            if (gVar.getItemId() == i11) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i11)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return this.f1401f.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1400e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1421z) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1401f.get(i11).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return p(i11, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z11 = false;
        if (this.f1418w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
        while (it2.hasNext()) {
            WeakReference<j> next = it2.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1418w.remove(next);
            } else {
                z11 = jVar.c(this, gVar);
                if (z11) {
                    break;
                }
            }
        }
        c0();
        if (z11) {
            this.f1419x = gVar;
        }
        return z11;
    }

    public int l(int i11) {
        return m(i11, 0);
    }

    public int m(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (this.f1401f.get(i12).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public int o(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f1401f.get(i12).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    g p(int i11, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<g> arrayList = this.f1417v;
        arrayList.clear();
        q(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = arrayList.get(i12);
            if (G) {
                numericShortcut = gVar.getAlphabeticShortcut();
            } else {
                numericShortcut = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (G && numericShortcut == '\b' && i11 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return L(findItem(i11), i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        g p11 = p(i11, keyEvent);
        boolean L = p11 != null ? L(p11, i12) : false;
        if ((i12 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<g> list, int i11, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            int size = this.f1401f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f1401f.get(i12);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i11, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i11 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f1406k) {
            Iterator<WeakReference<j>> it2 = this.f1418w.iterator();
            boolean z11 = false;
            while (it2.hasNext()) {
                WeakReference<j> next = it2.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f1418w.remove(next);
                } else {
                    z11 |= jVar.g();
                }
            }
            if (z11) {
                this.f1404i.clear();
                this.f1405j.clear();
                int size = E.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = E.get(i11);
                    if (gVar.l()) {
                        this.f1404i.add(gVar);
                    } else {
                        this.f1405j.add(gVar);
                    }
                }
            } else {
                this.f1404i.clear();
                this.f1405j.clear();
                this.f1405j.addAll(E());
            }
            this.f1406k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        int l11 = l(i11);
        if (l11 >= 0) {
            int size = this.f1401f.size() - l11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || this.f1401f.get(l11).getGroupId() != i11) {
                    break;
                }
                N(l11, false);
                i12 = i13;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        N(o(i11), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f1404i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.f1401f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1401f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.t(z12);
                gVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.f1420y = z11;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.f1401f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1401f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        int size = this.f1401f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1401f.get(i12);
            if (gVar.getGroupId() == i11 && gVar.y(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f1398c = z11;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1401f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1396a;
    }

    public g v() {
        return this.f1419x;
    }

    public Drawable w() {
        return this.f1410o;
    }

    public CharSequence x() {
        return this.f1409n;
    }

    public View y() {
        return this.f1411p;
    }

    public ArrayList<g> z() {
        r();
        return this.f1405j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return a(0, 0, 0, this.f1397b.getString(i11));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f1397b.getString(i11));
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        g gVar = (g) a(i11, i12, i13, charSequence);
        m mVar = new m(this.f1396a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f1397b.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f1397b.getString(i14));
    }
}