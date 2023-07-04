package va;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class s extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final va.a f54453a;

    /* renamed from: b  reason: collision with root package name */
    private final q f54454b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<s> f54455c;

    /* renamed from: d  reason: collision with root package name */
    private s f54456d;

    /* renamed from: e  reason: collision with root package name */
    private com.bumptech.glide.k f54457e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f54458f;

    /* loaded from: classes.dex */
    private class a implements q {
        a() {
        }

        @Override // va.q
        public Set<com.bumptech.glide.k> a() {
            Set<s> e11 = s.this.e();
            HashSet hashSet = new HashSet(e11.size());
            for (s sVar : e11) {
                if (sVar.h() != null) {
                    hashSet.add(sVar.h());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        this(new va.a());
    }

    private void a(s sVar) {
        this.f54455c.add(sVar);
    }

    private Fragment g() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f54458f;
    }

    private static androidx.fragment.app.q k(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean l(Fragment fragment) {
        Fragment g11 = g();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(g11)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void m(Context context, androidx.fragment.app.q qVar) {
        q();
        s s11 = com.bumptech.glide.c.e(context).o().s(qVar);
        this.f54456d = s11;
        if (equals(s11)) {
            return;
        }
        this.f54456d.a(this);
    }

    private void n(s sVar) {
        this.f54455c.remove(sVar);
    }

    private void q() {
        s sVar = this.f54456d;
        if (sVar != null) {
            sVar.n(this);
            this.f54456d = null;
        }
    }

    Set<s> e() {
        s sVar = this.f54456d;
        if (sVar == null) {
            return Collections.emptySet();
        }
        if (equals(sVar)) {
            return Collections.unmodifiableSet(this.f54455c);
        }
        HashSet hashSet = new HashSet();
        for (s sVar2 : this.f54456d.e()) {
            if (l(sVar2.g())) {
                hashSet.add(sVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public va.a f() {
        return this.f54453a;
    }

    public com.bumptech.glide.k h() {
        return this.f54457e;
    }

    public q i() {
        return this.f54454b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Fragment fragment) {
        androidx.fragment.app.q k11;
        this.f54458f = fragment;
        if (fragment == null || fragment.getContext() == null || (k11 = k(fragment)) == null) {
            return;
        }
        m(fragment.getContext(), k11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        androidx.fragment.app.q k11 = k(this);
        if (k11 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            m(getContext(), k11);
        } catch (IllegalStateException e11) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e11);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f54453a.c();
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f54458f = null;
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f54453a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f54453a.e();
    }

    public void p(com.bumptech.glide.k kVar) {
        this.f54457e = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + g() + "}";
    }

    public s(va.a aVar) {
        this.f54454b = new a();
        this.f54455c = new HashSet();
        this.f54453a = aVar;
    }
}