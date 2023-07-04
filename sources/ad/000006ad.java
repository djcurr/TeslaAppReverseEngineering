package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.q;
import androidx.fragment.app.z;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends z implements q.m {

    /* renamed from: t */
    final q f4770t;

    /* renamed from: u */
    boolean f4771u;

    /* renamed from: v */
    int f4772v;

    /* renamed from: w */
    boolean f4773w;

    public a(q qVar) {
        super(qVar.r0(), qVar.t0() != null ? qVar.t0().f().getClassLoader() : null);
        this.f4772v = -1;
        this.f4773w = false;
        this.f4770t = qVar;
    }

    int A(boolean z11) {
        if (!this.f4771u) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
                B("  ", printWriter);
                printWriter.close();
            }
            this.f4771u = true;
            if (this.f5003i) {
                this.f4772v = this.f4770t.j();
            } else {
                this.f4772v = -1;
            }
            this.f4770t.X(this, z11);
            return this.f4772v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    public void C(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5005k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4772v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4771u);
            if (this.f5002h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5002h));
            }
            if (this.f4998d != 0 || this.f4999e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4998d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4999e));
            }
            if (this.f5000f != 0 || this.f5001g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5000f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5001g));
            }
            if (this.f5006l != 0 || this.f5007m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5006l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5007m);
            }
            if (this.f5008n != 0 || this.f5009o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5008n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5009o);
            }
        }
        if (this.f4997c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4997c.size();
        for (int i11 = 0; i11 < size; i11++) {
            z.a aVar = this.f4997c.get(i11);
            switch (aVar.f5014a) {
                case 0:
                    str2 = ActionConst.NULL;
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f5014a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i11);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f5015b);
            if (z11) {
                if (aVar.f5017d != 0 || aVar.f5018e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5017d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5018e));
                }
                if (aVar.f5019f != 0 || aVar.f5020g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5019f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5020g));
                }
            }
        }
    }

    public void D() {
        int size = this.f4997c.size();
        for (int i11 = 0; i11 < size; i11++) {
            z.a aVar = this.f4997c.get(i11);
            Fragment fragment = aVar.f5015b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4773w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f5002h);
                fragment.setSharedElementNames(this.f5010p, this.f5011q);
            }
            switch (aVar.f5014a) {
                case 1:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, false);
                    this.f4770t.f(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5014a);
                case 3:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.a1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, false);
                    this.f4770t.n1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.v(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, false);
                    this.f4770t.l(fragment);
                    break;
                case 8:
                    this.f4770t.l1(fragment);
                    break;
                case 9:
                    this.f4770t.l1(null);
                    break;
                case 10:
                    this.f4770t.k1(fragment, aVar.f5022i);
                    break;
            }
        }
    }

    public void E() {
        for (int size = this.f4997c.size() - 1; size >= 0; size--) {
            z.a aVar = this.f4997c.get(size);
            Fragment fragment = aVar.f5015b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4773w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(q.f1(this.f5002h));
                fragment.setSharedElementNames(this.f5011q, this.f5010p);
            }
            switch (aVar.f5014a) {
                case 1:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, true);
                    this.f4770t.a1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5014a);
                case 3:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.f(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.n1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, true);
                    this.f4770t.D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5017d, aVar.f5018e, aVar.f5019f, aVar.f5020g);
                    this.f4770t.i1(fragment, true);
                    this.f4770t.v(fragment);
                    break;
                case 8:
                    this.f4770t.l1(null);
                    break;
                case 9:
                    this.f4770t.l1(fragment);
                    break;
                case 10:
                    this.f4770t.k1(fragment, aVar.f5021h);
                    break;
            }
        }
    }

    public Fragment F(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i11 = 0;
        while (i11 < this.f4997c.size()) {
            z.a aVar = this.f4997c.get(i11);
            int i12 = aVar.f5014a;
            if (i12 != 1) {
                if (i12 == 2) {
                    Fragment fragment3 = aVar.f5015b;
                    int i13 = fragment3.mContainerId;
                    boolean z11 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i13) {
                            if (fragment4 == fragment3) {
                                z11 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4997c.add(i11, new z.a(9, fragment4, true));
                                    i11++;
                                    fragment2 = null;
                                }
                                z.a aVar2 = new z.a(3, fragment4, true);
                                aVar2.f5017d = aVar.f5017d;
                                aVar2.f5019f = aVar.f5019f;
                                aVar2.f5018e = aVar.f5018e;
                                aVar2.f5020g = aVar.f5020g;
                                this.f4997c.add(i11, aVar2);
                                arrayList.remove(fragment4);
                                i11++;
                            }
                        }
                    }
                    if (z11) {
                        this.f4997c.remove(i11);
                        i11--;
                    } else {
                        aVar.f5014a = 1;
                        aVar.f5016c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i12 == 3 || i12 == 6) {
                    arrayList.remove(aVar.f5015b);
                    Fragment fragment5 = aVar.f5015b;
                    if (fragment5 == fragment2) {
                        this.f4997c.add(i11, new z.a(9, fragment5));
                        i11++;
                        fragment2 = null;
                    }
                } else if (i12 != 7) {
                    if (i12 == 8) {
                        this.f4997c.add(i11, new z.a(9, fragment2, true));
                        aVar.f5016c = true;
                        i11++;
                        fragment2 = aVar.f5015b;
                    }
                }
                i11++;
            }
            arrayList.add(aVar.f5015b);
            i11++;
        }
        return fragment2;
    }

    public String G() {
        return this.f5005k;
    }

    public void H() {
        if (this.f5013s != null) {
            for (int i11 = 0; i11 < this.f5013s.size(); i11++) {
                this.f5013s.get(i11).run();
            }
            this.f5013s = null;
        }
    }

    public Fragment I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4997c.size() - 1; size >= 0; size--) {
            z.a aVar = this.f4997c.get(size);
            int i11 = aVar.f5014a;
            if (i11 != 1) {
                if (i11 != 3) {
                    switch (i11) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f5015b;
                            break;
                        case 10:
                            aVar.f5022i = aVar.f5021h;
                            break;
                    }
                }
                arrayList.add(aVar.f5015b);
            }
            arrayList.remove(aVar.f5015b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.q.m
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f5003i) {
            this.f4770t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.z
    public int h() {
        return A(false);
    }

    @Override // androidx.fragment.app.z
    public int i() {
        return A(true);
    }

    @Override // androidx.fragment.app.z
    public void j() {
        m();
        this.f4770t.a0(this, false);
    }

    @Override // androidx.fragment.app.z
    public void k() {
        m();
        this.f4770t.a0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.z
    public void n(int i11, Fragment fragment, String str, int i12) {
        super.n(i11, fragment, str, i12);
        fragment.mFragmentManager = this.f4770t;
    }

    @Override // androidx.fragment.app.z
    public z o(Fragment fragment) {
        q qVar = fragment.mFragmentManager;
        if (qVar != null && qVar != this.f4770t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.o(fragment);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4772v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4772v);
        }
        if (this.f5005k != null) {
            sb2.append(" ");
            sb2.append(this.f5005k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.z
    public z w(Fragment fragment) {
        q qVar;
        if (fragment != null && (qVar = fragment.mFragmentManager) != null && qVar != this.f4770t) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.w(fragment);
    }

    public void z(int i11) {
        z.a aVar;
        if (this.f5003i) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i11);
            }
            int size = this.f4997c.size();
            for (int i12 = 0; i12 < size; i12++) {
                Fragment fragment = this.f4997c.get(i12).f5015b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i11;
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f5015b + " to " + aVar.f5015b.mBackStackNesting);
                    }
                }
            }
        }
    }
}