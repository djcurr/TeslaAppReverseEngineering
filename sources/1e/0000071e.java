package androidx.fragment.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a */
    private final l f4995a;

    /* renamed from: b */
    private final ClassLoader f4996b;

    /* renamed from: d */
    int f4998d;

    /* renamed from: e */
    int f4999e;

    /* renamed from: f */
    int f5000f;

    /* renamed from: g */
    int f5001g;

    /* renamed from: h */
    int f5002h;

    /* renamed from: i */
    boolean f5003i;

    /* renamed from: k */
    String f5005k;

    /* renamed from: l */
    int f5006l;

    /* renamed from: m */
    CharSequence f5007m;

    /* renamed from: n */
    int f5008n;

    /* renamed from: o */
    CharSequence f5009o;

    /* renamed from: p */
    ArrayList<String> f5010p;

    /* renamed from: q */
    ArrayList<String> f5011q;

    /* renamed from: s */
    ArrayList<Runnable> f5013s;

    /* renamed from: c */
    ArrayList<a> f4997c = new ArrayList<>();

    /* renamed from: j */
    boolean f5004j = true;

    /* renamed from: r */
    boolean f5012r = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f5014a;

        /* renamed from: b */
        Fragment f5015b;

        /* renamed from: c */
        boolean f5016c;

        /* renamed from: d */
        int f5017d;

        /* renamed from: e */
        int f5018e;

        /* renamed from: f */
        int f5019f;

        /* renamed from: g */
        int f5020g;

        /* renamed from: h */
        p.c f5021h;

        /* renamed from: i */
        p.c f5022i;

        public a() {
        }

        public a(int i11, Fragment fragment) {
            this.f5014a = i11;
            this.f5015b = fragment;
            this.f5016c = false;
            p.c cVar = p.c.RESUMED;
            this.f5021h = cVar;
            this.f5022i = cVar;
        }

        public a(int i11, Fragment fragment, boolean z11) {
            this.f5014a = i11;
            this.f5015b = fragment;
            this.f5016c = z11;
            p.c cVar = p.c.RESUMED;
            this.f5021h = cVar;
            this.f5022i = cVar;
        }
    }

    public z(l lVar, ClassLoader classLoader) {
        this.f4995a = lVar;
        this.f4996b = classLoader;
    }

    private Fragment l(Class<? extends Fragment> cls, Bundle bundle) {
        l lVar = this.f4995a;
        if (lVar != null) {
            ClassLoader classLoader = this.f4996b;
            if (classLoader != null) {
                Fragment instantiate = lVar.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public z b(int i11, Fragment fragment) {
        n(i11, fragment, null, 1);
        return this;
    }

    public z c(int i11, Fragment fragment, String str) {
        n(i11, fragment, str, 1);
        return this;
    }

    public z d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public z e(Fragment fragment, String str) {
        n(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f4997c.add(aVar);
        aVar.f5017d = this.f4998d;
        aVar.f5018e = this.f4999e;
        aVar.f5019f = this.f5000f;
        aVar.f5020g = this.f5001g;
    }

    public z g(String str) {
        if (this.f5004j) {
            this.f5003i = true;
            this.f5005k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public z m() {
        if (!this.f5003i) {
            this.f5004j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void n(int i11, Fragment fragment, String str, int i12) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            androidx.fragment.app.strictmode.a.h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i11 != 0) {
                if (i11 != -1) {
                    int i13 = fragment.mFragmentId;
                    if (i13 != 0 && i13 != i11) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i11);
                    }
                    fragment.mFragmentId = i11;
                    fragment.mContainerId = i11;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            f(new a(i12, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public z o(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public z p(int i11, Fragment fragment) {
        return q(i11, fragment, null);
    }

    public z q(int i11, Fragment fragment, String str) {
        if (i11 != 0) {
            n(i11, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final z r(int i11, Class<? extends Fragment> cls, Bundle bundle) {
        return s(i11, cls, bundle, null);
    }

    public final z s(int i11, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return q(i11, l(cls, bundle), str);
    }

    public z t(Runnable runnable) {
        m();
        if (this.f5013s == null) {
            this.f5013s = new ArrayList<>();
        }
        this.f5013s.add(runnable);
        return this;
    }

    public z u(int i11, int i12) {
        return v(i11, i12, 0, 0);
    }

    public z v(int i11, int i12, int i13, int i14) {
        this.f4998d = i11;
        this.f4999e = i12;
        this.f5000f = i13;
        this.f5001g = i14;
        return this;
    }

    public z w(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public z x(boolean z11) {
        this.f5012r = z11;
        return this;
    }

    public z y(int i11) {
        this.f5002h = i11;
        return this;
    }
}