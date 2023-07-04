package va;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final va.a f54433a;

    /* renamed from: b  reason: collision with root package name */
    private final q f54434b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<o> f54435c;

    /* renamed from: d  reason: collision with root package name */
    private com.bumptech.glide.k f54436d;

    /* renamed from: e  reason: collision with root package name */
    private o f54437e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f54438f;

    /* loaded from: classes.dex */
    private class a implements q {
        a() {
        }

        @Override // va.q
        public Set<com.bumptech.glide.k> a() {
            Set<o> b11 = o.this.b();
            HashSet hashSet = new HashSet(b11.size());
            for (o oVar : b11) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new va.a());
    }

    private void a(o oVar) {
        this.f54435c.add(oVar);
    }

    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f54438f;
    }

    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        o q11 = com.bumptech.glide.c.e(activity).o().q(activity);
        this.f54437e = q11;
        if (equals(q11)) {
            return;
        }
        this.f54437e.a(this);
    }

    private void i(o oVar) {
        this.f54435c.remove(oVar);
    }

    private void l() {
        o oVar = this.f54437e;
        if (oVar != null) {
            oVar.i(this);
            this.f54437e = null;
        }
    }

    Set<o> b() {
        if (equals(this.f54437e)) {
            return Collections.unmodifiableSet(this.f54435c);
        }
        if (this.f54437e != null && Build.VERSION.SDK_INT >= 17) {
            HashSet hashSet = new HashSet();
            for (o oVar : this.f54437e.b()) {
                if (g(oVar.getParentFragment())) {
                    hashSet.add(oVar);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public va.a c() {
        return this.f54433a;
    }

    public com.bumptech.glide.k e() {
        return this.f54436d;
    }

    public q f() {
        return this.f54434b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.f54438f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f54436d = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e11) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e11);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f54433a.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f54433a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f54433a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    o(va.a aVar) {
        this.f54434b = new a();
        this.f54435c = new HashSet();
        this.f54433a = aVar;
    }
}