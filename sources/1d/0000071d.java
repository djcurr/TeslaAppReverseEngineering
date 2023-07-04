package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f4991a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, x> f4992b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, w> f4993c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private t f4994d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(t tVar) {
        this.f4994d = tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w B(String str, w wVar) {
        if (wVar != null) {
            return this.f4993c.put(str, wVar);
        }
        return this.f4993c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f4991a.contains(fragment)) {
            synchronized (this.f4991a) {
                this.f4991a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f4992b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f4992b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i11) {
        for (x xVar : this.f4992b.values()) {
            if (xVar != null) {
                xVar.t(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4992b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (x xVar : this.f4992b.values()) {
                printWriter.print(str);
                if (xVar != null) {
                    Fragment k11 = xVar.k();
                    printWriter.println(k11);
                    k11.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Address.ADDRESS_NULL_PLACEHOLDER);
                }
            }
        }
        int size = this.f4991a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f4991a.get(i11).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        x xVar = this.f4992b.get(str);
        if (xVar != null) {
            return xVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i11) {
        for (int size = this.f4991a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4991a.get(size);
            if (fragment != null && fragment.mFragmentId == i11) {
                return fragment;
            }
        }
        for (x xVar : this.f4992b.values()) {
            if (xVar != null) {
                Fragment k11 = xVar.k();
                if (k11.mFragmentId == i11) {
                    return k11;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f4991a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4991a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (x xVar : this.f4992b.values()) {
                if (xVar != null) {
                    Fragment k11 = xVar.k();
                    if (str.equals(k11.mTag)) {
                        return k11;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (x xVar : this.f4992b.values()) {
            if (xVar != null && (findFragmentByWho = xVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4991a.indexOf(fragment);
        for (int i11 = indexOf - 1; i11 >= 0; i11--) {
            Fragment fragment2 = this.f4991a.get(i11);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4991a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4991a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<x> k() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f4992b.values()) {
            if (xVar != null) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f4992b.values()) {
            if (xVar != null) {
                arrayList.add(xVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<w> m() {
        return new ArrayList<>(this.f4993c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x n(String str) {
        return this.f4992b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f4991a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4991a) {
            arrayList = new ArrayList(this.f4991a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t p() {
        return this.f4994d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w q(String str) {
        return this.f4993c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(x xVar) {
        Fragment k11 = xVar.k();
        if (c(k11.mWho)) {
            return;
        }
        this.f4992b.put(k11.mWho, xVar);
        if (k11.mRetainInstanceChangedWhileDetached) {
            if (k11.mRetainInstance) {
                this.f4994d.c(k11);
            } else {
                this.f4994d.p(k11);
            }
            k11.mRetainInstanceChangedWhileDetached = false;
        }
        if (q.G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(x xVar) {
        Fragment k11 = xVar.k();
        if (k11.mRetainInstance) {
            this.f4994d.p(k11);
        }
        if (this.f4992b.put(k11.mWho, null) != null && q.G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        Iterator<Fragment> it2 = this.f4991a.iterator();
        while (it2.hasNext()) {
            x xVar = this.f4992b.get(it2.next().mWho);
            if (xVar != null) {
                xVar.m();
            }
        }
        for (x xVar2 : this.f4992b.values()) {
            if (xVar2 != null) {
                xVar2.m();
                Fragment k11 = xVar2.k();
                if (k11.mRemoving && !k11.isInBackStack()) {
                    if (k11.mBeingSaved && !this.f4993c.containsKey(k11.mWho)) {
                        xVar2.r();
                    }
                    s(xVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Fragment fragment) {
        synchronized (this.f4991a) {
            this.f4991a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.f4992b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(List<String> list) {
        this.f4991a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f11 = f(str);
                if (f11 != null) {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f11);
                    }
                    a(f11);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ArrayList<w> arrayList) {
        this.f4993c.clear();
        Iterator<w> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            w next = it2.next();
            this.f4993c.put(next.f4972b, next);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f4992b.size());
        for (x xVar : this.f4992b.values()) {
            if (xVar != null) {
                Fragment k11 = xVar.k();
                xVar.r();
                arrayList.add(k11.mWho);
                if (q.G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k11 + ": " + k11.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> z() {
        synchronized (this.f4991a) {
            if (this.f4991a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4991a.size());
            Iterator<Fragment> it2 = this.f4991a.iterator();
            while (it2.hasNext()) {
                Fragment next = it2.next();
                arrayList.add(next.mWho);
                if (q.G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }
}