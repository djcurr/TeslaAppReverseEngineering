package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.f;
import androidx.fragment.app.strictmode.a;
import androidx.fragment.app.z;
import androidx.lifecycle.p;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.savedstate.SavedStateRegistry;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class q {
    private static boolean N = false;
    private androidx.activity.result.d<String[]> A;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private ArrayList<androidx.fragment.app.a> H;
    private ArrayList<Boolean> I;
    private ArrayList<Fragment> J;
    private t K;
    private a.c L;

    /* renamed from: b */
    private boolean f4905b;

    /* renamed from: d */
    ArrayList<androidx.fragment.app.a> f4907d;

    /* renamed from: e */
    private ArrayList<Fragment> f4908e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4910g;

    /* renamed from: m */
    private ArrayList<l> f4916m;

    /* renamed from: q */
    private androidx.fragment.app.m<?> f4920q;

    /* renamed from: r */
    private androidx.fragment.app.j f4921r;

    /* renamed from: s */
    private Fragment f4922s;

    /* renamed from: t */
    Fragment f4923t;

    /* renamed from: y */
    private androidx.activity.result.d<Intent> f4928y;

    /* renamed from: z */
    private androidx.activity.result.d<androidx.activity.result.f> f4929z;

    /* renamed from: a */
    private final ArrayList<m> f4904a = new ArrayList<>();

    /* renamed from: c */
    private final y f4906c = new y();

    /* renamed from: f */
    private final androidx.fragment.app.n f4909f = new androidx.fragment.app.n(this);

    /* renamed from: h */
    private final androidx.activity.e f4911h = new a(false);

    /* renamed from: i */
    private final AtomicInteger f4912i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, androidx.fragment.app.c> f4913j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Bundle> f4914k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    private final Map<String, Object> f4915l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final o f4917n = new o(this);

    /* renamed from: o */
    private final CopyOnWriteArrayList<u> f4918o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    int f4919p = -1;

    /* renamed from: u */
    private androidx.fragment.app.l f4924u = null;

    /* renamed from: v */
    private androidx.fragment.app.l f4925v = new b();

    /* renamed from: w */
    private h0 f4926w = null;

    /* renamed from: x */
    private h0 f4927x = new c(this);
    ArrayDeque<k> B = new ArrayDeque<>();
    private Runnable M = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11) {
            super(z11);
            q.this = r1;
        }

        @Override // androidx.activity.e
        public void handleOnBackPressed() {
            q.this.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.fragment.app.l {
        b() {
            q.this = r1;
        }

        @Override // androidx.fragment.app.l
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return q.this.t0().b(q.this.t0().f(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements h0 {
        c(q qVar) {
        }

        @Override // androidx.fragment.app.h0
        public g0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.Z(true);
        }
    }

    /* loaded from: classes.dex */
    public class e implements u {

        /* renamed from: a */
        final /* synthetic */ Fragment f4933a;

        e(q qVar, Fragment fragment) {
            this.f4933a = fragment;
        }

        @Override // androidx.fragment.app.u
        public void a(q qVar, Fragment fragment) {
            this.f4933a.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.activity.result.b<androidx.activity.result.a> {
        f() {
            q.this = r1;
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            k pollFirst = q.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4937a;
            int i11 = pollFirst.f4938b;
            Fragment i12 = q.this.f4906c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i12.onActivityResult(i11, aVar.b(), aVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class g implements androidx.activity.result.b<androidx.activity.result.a> {
        g() {
            q.this = r1;
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            k pollFirst = q.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4937a;
            int i11 = pollFirst.f4938b;
            Fragment i12 = q.this.f4906c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i12.onActivityResult(i11, aVar.b(), aVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<Map<String, Boolean>> {
        h() {
            q.this = r1;
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
            }
            k pollFirst = q.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4937a;
            int i12 = pollFirst.f4938b;
            Fragment i13 = q.this.f4906c.i(str);
            if (i13 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i13.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends f.a<androidx.activity.result.f, androidx.activity.result.a> {
        i() {
        }

        @Override // f.a
        /* renamed from: a */
        public Intent createIntent(Context context, androidx.activity.result.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a11 = fVar.a();
            if (a11 != null && (bundleExtra = a11.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a11.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a11.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new f.b(fVar.d()).b(null).c(fVar.c(), fVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (q.G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.a
        /* renamed from: b */
        public androidx.activity.result.a parseResult(int i11, Intent intent) {
            return new androidx.activity.result.a(i11, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        @Deprecated
        public void onFragmentActivityCreated(q qVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(q qVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(q qVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(q qVar, Fragment fragment) {
        }

        public void onFragmentDetached(q qVar, Fragment fragment) {
        }

        public void onFragmentPaused(q qVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(q qVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(q qVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(q qVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(q qVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(q qVar, Fragment fragment) {
        }

        public void onFragmentStopped(q qVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(q qVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(q qVar, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n implements m {

        /* renamed from: a */
        final String f4939a;

        /* renamed from: b */
        final int f4940b;

        /* renamed from: c */
        final int f4941c;

        n(String str, int i11, int i12) {
            q.this = r1;
            this.f4939a = str;
            this.f4940b = i11;
            this.f4941c = i12;
        }

        @Override // androidx.fragment.app.q.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = q.this.f4923t;
            if (fragment == null || this.f4940b >= 0 || this.f4939a != null || !fragment.getChildFragmentManager().W0()) {
                return q.this.Y0(arrayList, arrayList2, this.f4939a, this.f4940b, this.f4941c);
            }
            return false;
        }
    }

    public static Fragment A0(View view) {
        Object tag = view.getTag(g4.b.f27700a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean G0(int i11) {
        return N || Log.isLoggable("FragmentManager", i11);
    }

    private boolean H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.n();
    }

    private void K(Fragment fragment) {
        if (fragment == null || !fragment.equals(e0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public /* synthetic */ Bundle N0() {
        Bundle bundle = new Bundle();
        Parcelable g12 = g1();
        if (g12 != null) {
            bundle.putParcelable("android:support:fragments", g12);
        }
        return bundle;
    }

    private void R(int i11) {
        try {
            this.f4905b = true;
            this.f4906c.d(i11);
            R0(i11, false);
            for (g0 g0Var : s()) {
                g0Var.j();
            }
            this.f4905b = false;
            Z(true);
        } catch (Throwable th2) {
            this.f4905b = false;
            throw th2;
        }
    }

    private void U() {
        if (this.G) {
            this.G = false;
            o1();
        }
    }

    private void W() {
        for (g0 g0Var : s()) {
            g0Var.j();
        }
    }

    private boolean X0(String str, int i11, int i12) {
        Z(false);
        Y(true);
        Fragment fragment = this.f4923t;
        if (fragment == null || i11 >= 0 || str != null || !fragment.getChildFragmentManager().W0()) {
            boolean Y0 = Y0(this.H, this.I, str, i11, i12);
            if (Y0) {
                this.f4905b = true;
                try {
                    b1(this.H, this.I);
                } finally {
                    p();
                }
            }
            p1();
            U();
            this.f4906c.b();
            return Y0;
        }
        return true;
    }

    private void Y(boolean z11) {
        if (!this.f4905b) {
            if (this.f4920q == null) {
                if (this.F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f4920q.g().getLooper()) {
                if (!z11) {
                    o();
                }
                if (this.H == null) {
                    this.H = new ArrayList<>();
                    this.I = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void b0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        while (i11 < i12) {
            androidx.fragment.app.a aVar = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue()) {
                aVar.z(-1);
                aVar.E();
            } else {
                aVar.z(1);
                aVar.D();
            }
            i11++;
        }
    }

    private void b1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                if (!arrayList.get(i11).f5012r) {
                    if (i12 != i11) {
                        c0(arrayList, arrayList2, i12, i11);
                    }
                    i12 = i11 + 1;
                    if (arrayList2.get(i11).booleanValue()) {
                        while (i12 < size && arrayList2.get(i12).booleanValue() && !arrayList.get(i12).f5012r) {
                            i12++;
                        }
                    }
                    c0(arrayList, arrayList2, i11, i12);
                    i11 = i12 - 1;
                }
                i11++;
            }
            if (i12 != size) {
                c0(arrayList, arrayList2, i12, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        boolean z11 = arrayList.get(i11).f5012r;
        ArrayList<Fragment> arrayList3 = this.J;
        if (arrayList3 == null) {
            this.J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.J.addAll(this.f4906c.o());
        Fragment x02 = x0();
        boolean z12 = false;
        for (int i13 = i11; i13 < i12; i13++) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            if (!arrayList2.get(i13).booleanValue()) {
                x02 = aVar.F(this.J, x02);
            } else {
                x02 = aVar.I(this.J, x02);
            }
            z12 = z12 || aVar.f5003i;
        }
        this.J.clear();
        if (!z11 && this.f4919p >= 1) {
            for (int i14 = i11; i14 < i12; i14++) {
                Iterator<z.a> it2 = arrayList.get(i14).f4997c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f5015b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f4906c.r(u(fragment));
                    }
                }
            }
        }
        b0(arrayList, arrayList2, i11, i12);
        boolean booleanValue = arrayList2.get(i12 - 1).booleanValue();
        for (int i15 = i11; i15 < i12; i15++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i15);
            if (booleanValue) {
                for (int size = aVar2.f4997c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f4997c.get(size).f5015b;
                    if (fragment2 != null) {
                        u(fragment2).m();
                    }
                }
            } else {
                Iterator<z.a> it3 = aVar2.f4997c.iterator();
                while (it3.hasNext()) {
                    Fragment fragment3 = it3.next().f5015b;
                    if (fragment3 != null) {
                        u(fragment3).m();
                    }
                }
            }
        }
        R0(this.f4919p, true);
        for (g0 g0Var : t(arrayList, i11, i12)) {
            g0Var.r(booleanValue);
            g0Var.p();
            g0Var.g();
        }
        while (i11 < i12) {
            androidx.fragment.app.a aVar3 = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue() && aVar3.f4772v >= 0) {
                aVar3.f4772v = -1;
            }
            aVar3.H();
            i11++;
        }
        if (z12) {
            d1();
        }
    }

    private void d1() {
        if (this.f4916m != null) {
            for (int i11 = 0; i11 < this.f4916m.size(); i11++) {
                this.f4916m.get(i11).a();
            }
        }
    }

    private int f0(String str, int i11, boolean z11) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4907d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i11 < 0) {
            if (z11) {
                return 0;
            }
            return this.f4907d.size() - 1;
        }
        int size = this.f4907d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f4907d.get(size);
            if ((str != null && str.equals(aVar.G())) || (i11 >= 0 && i11 == aVar.f4772v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z11) {
            if (size == this.f4907d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f4907d.get(size - 1);
            if ((str == null || !str.equals(aVar2.G())) && (i11 < 0 || i11 != aVar2.f4772v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public static int f1(int i11) {
        if (i11 != 4097) {
            if (i11 != 8194) {
                if (i11 != 8197) {
                    if (i11 != 4099) {
                        return i11 != 4100 ? 0 : 8197;
                    }
                    return 4099;
                }
                return 4100;
            }
            return 4097;
        }
        return 8194;
    }

    public static q j0(View view) {
        Fragment k02 = k0(view);
        if (k02 != null) {
            if (k02.isAdded()) {
                return k02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + k02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        androidx.fragment.app.h hVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof androidx.fragment.app.h) {
                hVar = (androidx.fragment.app.h) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (hVar != null) {
            return hVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment k0(View view) {
        while (view != null) {
            Fragment A0 = A0(view);
            if (A0 != null) {
                return A0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void l0() {
        for (g0 g0Var : s()) {
            g0Var.k();
        }
    }

    private boolean m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4904a) {
            if (this.f4904a.isEmpty()) {
                return false;
            }
            int size = this.f4904a.size();
            boolean z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                z11 |= this.f4904a.get(i11).a(arrayList, arrayList2);
            }
            this.f4904a.clear();
            this.f4920q.g().removeCallbacks(this.M);
            return z11;
        }
    }

    private void m1(Fragment fragment) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i11 = g4.b.f27702c;
        if (q02.getTag(i11) == null) {
            q02.setTag(i11, fragment);
        }
        ((Fragment) q02.getTag(i11)).setPopDirection(fragment.getPopDirection());
    }

    private void o() {
        if (M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private t o0(Fragment fragment) {
        return this.K.k(fragment);
    }

    private void o1() {
        for (x xVar : this.f4906c.k()) {
            U0(xVar);
        }
    }

    private void p() {
        this.f4905b = false;
        this.I.clear();
        this.H.clear();
    }

    private void p1() {
        synchronized (this.f4904a) {
            boolean z11 = true;
            if (!this.f4904a.isEmpty()) {
                this.f4911h.setEnabled(true);
            } else {
                this.f4911h.setEnabled((n0() <= 0 || !K0(this.f4922s)) ? false : false);
            }
        }
    }

    private void q() {
        androidx.fragment.app.m<?> mVar = this.f4920q;
        boolean z11 = true;
        if (mVar instanceof u0) {
            z11 = this.f4906c.p().o();
        } else if (mVar.f() instanceof Activity) {
            z11 = true ^ ((Activity) this.f4920q.f()).isChangingConfigurations();
        }
        if (z11) {
            for (androidx.fragment.app.c cVar : this.f4913j.values()) {
                for (String str : cVar.f4802a) {
                    this.f4906c.p().h(str);
                }
            }
        }
    }

    private ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4921r.d()) {
            View c11 = this.f4921r.c(fragment.mContainerId);
            if (c11 instanceof ViewGroup) {
                return (ViewGroup) c11;
            }
        }
        return null;
    }

    private Set<g0> s() {
        HashSet hashSet = new HashSet();
        for (x xVar : this.f4906c.k()) {
            ViewGroup viewGroup = xVar.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(g0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<g0> t(ArrayList<androidx.fragment.app.a> arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            Iterator<z.a> it2 = arrayList.get(i11).f4997c.iterator();
            while (it2.hasNext()) {
                Fragment fragment = it2.next().f5015b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(g0.n(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    public void A() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        R(1);
    }

    public boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f4919p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z11 = false;
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null && J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z11 = true;
            }
        }
        if (this.f4908e != null) {
            for (int i11 = 0; i11 < this.f4908e.size(); i11++) {
                Fragment fragment2 = this.f4908e.get(i11);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4908e = arrayList;
        return z11;
    }

    public t0 B0(Fragment fragment) {
        return this.K.n(fragment);
    }

    public void C() {
        this.F = true;
        Z(true);
        W();
        q();
        R(-1);
        this.f4920q = null;
        this.f4921r = null;
        this.f4922s = null;
        if (this.f4910g != null) {
            this.f4911h.remove();
            this.f4910g = null;
        }
        androidx.activity.result.d<Intent> dVar = this.f4928y;
        if (dVar != null) {
            dVar.d();
            this.f4929z.d();
            this.A.d();
        }
    }

    void C0() {
        Z(true);
        if (this.f4911h.isEnabled()) {
            W0();
        } else {
            this.f4910g.d();
        }
    }

    public void D() {
        R(1);
    }

    public void D0(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m1(fragment);
    }

    public void E() {
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void E0(Fragment fragment) {
        if (fragment.mAdded && H0(fragment)) {
            this.C = true;
        }
    }

    public void F(boolean z11) {
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z11);
            }
        }
    }

    public boolean F0() {
        return this.F;
    }

    public void G(Fragment fragment) {
        Iterator<u> it2 = this.f4918o.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, fragment);
        }
    }

    public void H() {
        for (Fragment fragment : this.f4906c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.H();
            }
        }
    }

    public boolean I(MenuItem menuItem) {
        if (this.f4919p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public void J(Menu menu) {
        if (this.f4919p < 1) {
            return;
        }
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        q qVar = fragment.mFragmentManager;
        return fragment.equals(qVar.x0()) && K0(qVar.f4922s);
    }

    public void L() {
        R(5);
    }

    public boolean L0(int i11) {
        return this.f4919p >= i11;
    }

    public void M(boolean z11) {
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z11);
            }
        }
    }

    public boolean M0() {
        return this.D || this.E;
    }

    public boolean N(Menu menu) {
        boolean z11 = false;
        if (this.f4919p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null && J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    public void O() {
        p1();
        K(this.f4923t);
    }

    public void O0(Fragment fragment, String[] strArr, int i11) {
        if (this.A != null) {
            this.B.addLast(new k(fragment.mWho, i11));
            this.A.b(strArr);
            return;
        }
        this.f4920q.k(fragment, strArr, i11);
    }

    public void P() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        R(7);
    }

    public void P0(Fragment fragment, Intent intent, int i11, Bundle bundle) {
        if (this.f4928y != null) {
            this.B.addLast(new k(fragment.mWho, i11));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f4928y.b(intent);
            return;
        }
        this.f4920q.m(fragment, intent, i11, bundle);
    }

    public void Q() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        R(5);
    }

    public void Q0(Fragment fragment, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        Intent intent2;
        if (this.f4929z != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (G0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            androidx.activity.result.f a11 = new f.b(intentSender).b(intent2).c(i13, i12).a();
            this.B.addLast(new k(fragment.mWho, i11));
            if (G0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.f4929z.b(a11);
            return;
        }
        this.f4920q.n(fragment, intentSender, i11, intent, i12, i13, i14, bundle);
    }

    void R0(int i11, boolean z11) {
        androidx.fragment.app.m<?> mVar;
        if (this.f4920q == null && i11 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z11 || i11 != this.f4919p) {
            this.f4919p = i11;
            this.f4906c.t();
            o1();
            if (this.C && (mVar = this.f4920q) != null && this.f4919p == 7) {
                mVar.o();
                this.C = false;
            }
        }
    }

    public void S() {
        this.E = true;
        this.K.q(true);
        R(4);
    }

    public void S0() {
        if (this.f4920q == null) {
            return;
        }
        this.D = false;
        this.E = false;
        this.K.q(false);
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void T() {
        R(2);
    }

    public void T0(FragmentContainerView fragmentContainerView) {
        View view;
        for (x xVar : this.f4906c.k()) {
            Fragment k11 = xVar.k();
            if (k11.mContainerId == fragmentContainerView.getId() && (view = k11.mView) != null && view.getParent() == null) {
                k11.mContainer = fragmentContainerView;
                xVar.b();
            }
        }
    }

    public void U0(x xVar) {
        Fragment k11 = xVar.k();
        if (k11.mDeferStart) {
            if (this.f4905b) {
                this.G = true;
                return;
            }
            k11.mDeferStart = false;
            xVar.m();
        }
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4906c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4908e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f4908e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f4907d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f4907d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4912i.get());
        synchronized (this.f4904a) {
            int size3 = this.f4904a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size3; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f4904a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4920q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4921r);
        if (this.f4922s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4922s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4919p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.F);
        if (this.C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.C);
        }
    }

    public void V0(int i11, int i12, boolean z11) {
        if (i11 >= 0) {
            X(new n(null, i11, i12), z11);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i11);
    }

    public boolean W0() {
        return X0(null, -1, 0);
    }

    public void X(m mVar, boolean z11) {
        if (!z11) {
            if (this.f4920q == null) {
                if (this.F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            o();
        }
        synchronized (this.f4904a) {
            if (this.f4920q == null) {
                if (!z11) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f4904a.add(mVar);
            h1();
        }
    }

    boolean Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i11, int i12) {
        int f02 = f0(str, i11, (i12 & 1) != 0);
        if (f02 < 0) {
            return false;
        }
        for (int size = this.f4907d.size() - 1; size >= f02; size--) {
            arrayList.add(this.f4907d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean Z(boolean z11) {
        Y(z11);
        boolean z12 = false;
        while (m0(this.H, this.I)) {
            this.f4905b = true;
            try {
                b1(this.H, this.I);
                p();
                z12 = true;
            } catch (Throwable th2) {
                p();
                throw th2;
            }
        }
        p1();
        U();
        this.f4906c.b();
        return z12;
    }

    public void Z0(j jVar, boolean z11) {
        this.f4917n.o(jVar, z11);
    }

    public void a0(m mVar, boolean z11) {
        if (z11 && (this.f4920q == null || this.F)) {
            return;
        }
        Y(z11);
        if (mVar.a(this.H, this.I)) {
            this.f4905b = true;
            try {
                b1(this.H, this.I);
            } finally {
                p();
            }
        }
        p1();
        U();
        this.f4906c.b();
    }

    public void a1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z11 = !fragment.isInBackStack();
        if (!fragment.mDetached || z11) {
            this.f4906c.u(fragment);
            if (H0(fragment)) {
                this.C = true;
            }
            fragment.mRemoving = true;
            m1(fragment);
        }
    }

    public void c1(Fragment fragment) {
        this.K.p(fragment);
    }

    public boolean d0() {
        boolean Z = Z(true);
        l0();
        return Z;
    }

    public void e(androidx.fragment.app.a aVar) {
        if (this.f4907d == null) {
            this.f4907d = new ArrayList<>();
        }
        this.f4907d.add(aVar);
    }

    public Fragment e0(String str) {
        return this.f4906c.f(str);
    }

    public void e1(Parcelable parcelable) {
        s sVar;
        ArrayList<w> arrayList;
        x xVar;
        if (parcelable == null || (arrayList = (sVar = (s) parcelable).f4943a) == null) {
            return;
        }
        this.f4906c.x(arrayList);
        this.f4906c.v();
        Iterator<String> it2 = sVar.f4944b.iterator();
        while (it2.hasNext()) {
            w B = this.f4906c.B(it2.next(), null);
            if (B != null) {
                Fragment j11 = this.K.j(B.f4972b);
                if (j11 != null) {
                    if (G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j11);
                    }
                    xVar = new x(this.f4917n, this.f4906c, j11, B);
                } else {
                    xVar = new x(this.f4917n, this.f4906c, this.f4920q.f().getClassLoader(), r0(), B);
                }
                Fragment k11 = xVar.k();
                k11.mFragmentManager = this;
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k11.mWho + "): " + k11);
                }
                xVar.o(this.f4920q.f().getClassLoader());
                this.f4906c.r(xVar);
                xVar.t(this.f4919p);
            }
        }
        for (Fragment fragment : this.K.m()) {
            if (!this.f4906c.c(fragment.mWho)) {
                if (G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + sVar.f4944b);
                }
                this.K.p(fragment);
                fragment.mFragmentManager = this;
                x xVar2 = new x(this.f4917n, this.f4906c, fragment);
                xVar2.t(1);
                xVar2.m();
                fragment.mRemoving = true;
                xVar2.m();
            }
        }
        this.f4906c.w(sVar.f4945c);
        if (sVar.f4946d != null) {
            this.f4907d = new ArrayList<>(sVar.f4946d.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = sVar.f4946d;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a b11 = bVarArr[i11].b(this);
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + b11.f4772v + "): " + b11);
                    PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
                    b11.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4907d.add(b11);
                i11++;
            }
        } else {
            this.f4907d = null;
        }
        this.f4912i.set(sVar.f4947e);
        String str = sVar.f4948f;
        if (str != null) {
            Fragment e02 = e0(str);
            this.f4923t = e02;
            K(e02);
        }
        ArrayList<String> arrayList2 = sVar.f4949g;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                this.f4913j.put(arrayList2.get(i12), sVar.f4950h.get(i12));
            }
        }
        ArrayList<String> arrayList3 = sVar.f4951i;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                Bundle bundle = sVar.f4952j.get(i13);
                bundle.setClassLoader(this.f4920q.f().getClassLoader());
                this.f4914k.put(arrayList3.get(i13), bundle);
            }
        }
        this.B = new ArrayDeque<>(sVar.f4953k);
    }

    public x f(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            androidx.fragment.app.strictmode.a.h(fragment, str);
        }
        if (G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        x u11 = u(fragment);
        fragment.mFragmentManager = this;
        this.f4906c.r(u11);
        if (!fragment.mDetached) {
            this.f4906c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H0(fragment)) {
                this.C = true;
            }
        }
        return u11;
    }

    public void g(u uVar) {
        this.f4918o.add(uVar);
    }

    public Fragment g0(int i11) {
        return this.f4906c.g(i11);
    }

    public Parcelable g1() {
        int size;
        l0();
        W();
        Z(true);
        this.D = true;
        this.K.q(true);
        ArrayList<String> y11 = this.f4906c.y();
        ArrayList<w> m11 = this.f4906c.m();
        androidx.fragment.app.b[] bVarArr = null;
        if (m11.isEmpty()) {
            if (G0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> z11 = this.f4906c.z();
        ArrayList<androidx.fragment.app.a> arrayList = this.f4907d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i11 = 0; i11 < size; i11++) {
                bVarArr[i11] = new androidx.fragment.app.b(this.f4907d.get(i11));
                if (G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i11 + ": " + this.f4907d.get(i11));
                }
            }
        }
        s sVar = new s();
        sVar.f4943a = m11;
        sVar.f4944b = y11;
        sVar.f4945c = z11;
        sVar.f4946d = bVarArr;
        sVar.f4947e = this.f4912i.get();
        Fragment fragment = this.f4923t;
        if (fragment != null) {
            sVar.f4948f = fragment.mWho;
        }
        sVar.f4949g.addAll(this.f4913j.keySet());
        sVar.f4950h.addAll(this.f4913j.values());
        sVar.f4951i.addAll(this.f4914k.keySet());
        sVar.f4952j.addAll(this.f4914k.values());
        sVar.f4953k = new ArrayList<>(this.B);
        return sVar;
    }

    public void h(l lVar) {
        if (this.f4916m == null) {
            this.f4916m = new ArrayList<>();
        }
        this.f4916m.add(lVar);
    }

    public Fragment h0(String str) {
        return this.f4906c.h(str);
    }

    void h1() {
        synchronized (this.f4904a) {
            boolean z11 = true;
            if (this.f4904a.size() != 1) {
                z11 = false;
            }
            if (z11) {
                this.f4920q.g().removeCallbacks(this.M);
                this.f4920q.g().post(this.M);
                p1();
            }
        }
    }

    public void i(Fragment fragment) {
        this.K.c(fragment);
    }

    public Fragment i0(String str) {
        return this.f4906c.i(str);
    }

    public void i1(Fragment fragment, boolean z11) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || !(q02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) q02).setDrawDisappearingViewsLast(!z11);
    }

    public int j() {
        return this.f4912i.getAndIncrement();
    }

    public void j1(androidx.fragment.app.l lVar) {
        this.f4924u = lVar;
    }

    public void k(androidx.fragment.app.m<?> mVar, androidx.fragment.app.j jVar, Fragment fragment) {
        String str;
        if (this.f4920q == null) {
            this.f4920q = mVar;
            this.f4921r = jVar;
            this.f4922s = fragment;
            if (fragment != null) {
                g(new e(this, fragment));
            } else if (mVar instanceof u) {
                g((u) mVar);
            }
            if (this.f4922s != null) {
                p1();
            }
            if (mVar instanceof androidx.activity.f) {
                androidx.activity.f fVar = (androidx.activity.f) mVar;
                OnBackPressedDispatcher onBackPressedDispatcher = fVar.getOnBackPressedDispatcher();
                this.f4910g = onBackPressedDispatcher;
                androidx.lifecycle.v vVar = fVar;
                if (fragment != null) {
                    vVar = fragment;
                }
                onBackPressedDispatcher.b(vVar, this.f4911h);
            }
            if (fragment != null) {
                this.K = fragment.mFragmentManager.o0(fragment);
            } else if (mVar instanceof u0) {
                this.K = t.l(((u0) mVar).getViewModelStore());
            } else {
                this.K = new t(false);
            }
            this.K.q(M0());
            this.f4906c.A(this.K);
            androidx.fragment.app.m<?> mVar2 = this.f4920q;
            if ((mVar2 instanceof androidx.savedstate.c) && fragment == null) {
                SavedStateRegistry savedStateRegistry = ((androidx.savedstate.c) mVar2).getSavedStateRegistry();
                savedStateRegistry.d("android:support:fragments", new SavedStateRegistry.b() { // from class: androidx.fragment.app.p
                    {
                        q.this = this;
                    }

                    @Override // androidx.savedstate.SavedStateRegistry.b
                    public final Bundle a() {
                        Bundle N0;
                        N0 = q.this.N0();
                        return N0;
                    }
                });
                Bundle a11 = savedStateRegistry.a("android:support:fragments");
                if (a11 != null) {
                    e1(a11.getParcelable("android:support:fragments"));
                }
            }
            androidx.fragment.app.m<?> mVar3 = this.f4920q;
            if (mVar3 instanceof androidx.activity.result.e) {
                ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.e) mVar3).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f4928y = activityResultRegistry.j(str2 + "StartActivityForResult", new f.f(), new f());
                this.f4929z = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new i(), new g());
                this.A = activityResultRegistry.j(str2 + "RequestPermissions", new f.d(), new h());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void k1(Fragment fragment, p.c cVar) {
        if (fragment.equals(e0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void l(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4906c.a(fragment);
            if (G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H0(fragment)) {
                this.C = true;
            }
        }
    }

    public void l1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(e0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f4923t;
        this.f4923t = fragment;
        K(fragment2);
        K(this.f4923t);
    }

    public z m() {
        return new androidx.fragment.app.a(this);
    }

    boolean n() {
        boolean z11 = false;
        for (Fragment fragment : this.f4906c.l()) {
            if (fragment != null) {
                z11 = H0(fragment);
                continue;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public int n0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4907d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void n1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public androidx.fragment.app.j p0() {
        return this.f4921r;
    }

    public final void r(String str) {
        this.f4914k.remove(str);
        if (G0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public androidx.fragment.app.l r0() {
        androidx.fragment.app.l lVar = this.f4924u;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f4922s;
        if (fragment != null) {
            return fragment.mFragmentManager.r0();
        }
        return this.f4925v;
    }

    public List<Fragment> s0() {
        return this.f4906c.o();
    }

    public androidx.fragment.app.m<?> t0() {
        return this.f4920q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4922s;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4922s)));
            sb2.append("}");
        } else {
            androidx.fragment.app.m<?> mVar = this.f4920q;
            if (mVar != null) {
                sb2.append(mVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4920q)));
                sb2.append("}");
            } else {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public x u(Fragment fragment) {
        x n11 = this.f4906c.n(fragment.mWho);
        if (n11 != null) {
            return n11;
        }
        x xVar = new x(this.f4917n, this.f4906c, fragment);
        xVar.o(this.f4920q.f().getClassLoader());
        xVar.t(this.f4919p);
        return xVar;
    }

    public LayoutInflater.Factory2 u0() {
        return this.f4909f;
    }

    public void v(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4906c.u(fragment);
            if (H0(fragment)) {
                this.C = true;
            }
            m1(fragment);
        }
    }

    public o v0() {
        return this.f4917n;
    }

    public void w() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        R(4);
    }

    public Fragment w0() {
        return this.f4922s;
    }

    public void x() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        R(0);
    }

    public Fragment x0() {
        return this.f4923t;
    }

    public void y(Configuration configuration) {
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public h0 y0() {
        h0 h0Var = this.f4926w;
        if (h0Var != null) {
            return h0Var;
        }
        Fragment fragment = this.f4922s;
        if (fragment != null) {
            return fragment.mFragmentManager.y0();
        }
        return this.f4927x;
    }

    public boolean z(MenuItem menuItem) {
        if (this.f4919p < 1) {
            return false;
        }
        for (Fragment fragment : this.f4906c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public a.c z0() {
        return this.L;
    }

    /* loaded from: classes.dex */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a */
        String f4937a;

        /* renamed from: b */
        int f4938b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i11) {
                return new k[i11];
            }
        }

        k(String str, int i11) {
            this.f4937a = str;
            this.f4938b = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f4937a);
            parcel.writeInt(this.f4938b);
        }

        k(Parcel parcel) {
            this.f4937a = parcel.readString();
            this.f4938b = parcel.readInt();
        }
    }
}