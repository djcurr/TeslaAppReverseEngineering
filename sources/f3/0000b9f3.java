package va;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p implements Handler.Callback {

    /* renamed from: j  reason: collision with root package name */
    private static final b f54440j = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile com.bumptech.glide.k f54441a;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f54444d;

    /* renamed from: e  reason: collision with root package name */
    private final b f54445e;

    /* renamed from: i  reason: collision with root package name */
    private final k f54449i;

    /* renamed from: b  reason: collision with root package name */
    final Map<FragmentManager, o> f54442b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<androidx.fragment.app.q, s> f54443c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f54446f = new androidx.collection.a<>();

    /* renamed from: g  reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f54447g = new androidx.collection.a<>();

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f54448h = new Bundle();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // va.p.b
        public com.bumptech.glide.k a(com.bumptech.glide.c cVar, l lVar, q qVar, Context context) {
            return new com.bumptech.glide.k(cVar, lVar, qVar, context);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.c cVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, com.bumptech.glide.f fVar) {
        this.f54445e = bVar == null ? f54440j : bVar;
        this.f54444d = new Handler(Looper.getMainLooper(), this);
        this.f54449i = b(fVar);
    }

    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.f fVar) {
        if (com.bumptech.glide.load.resource.bitmap.r.f10789h && com.bumptech.glide.load.resource.bitmap.r.f10788g) {
            if (fVar.a(d.C0199d.class)) {
                return new i();
            }
            return new j();
        }
        return new g();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private void d(FragmentManager fragmentManager, androidx.collection.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        e(fragmentManager, aVar);
    }

    @Deprecated
    private void e(FragmentManager fragmentManager, androidx.collection.a<View, android.app.Fragment> aVar) {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            this.f54448h.putInt(Action.KEY_ATTRIBUTE, i11);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f54448h, Action.KEY_ATTRIBUTE);
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                if (Build.VERSION.SDK_INT >= 17) {
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            i11 = i12;
        }
    }

    private static void f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                f(fragment.getChildFragmentManager().s0(), map);
            }
        }
    }

    @Deprecated
    private android.app.Fragment g(View view, Activity activity) {
        this.f54447g.clear();
        d(activity.getFragmentManager(), this.f54447g);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f54447g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f54447g.clear();
        return fragment;
    }

    private Fragment h(View view, androidx.fragment.app.h hVar) {
        this.f54446f.clear();
        f(hVar.getSupportFragmentManager().s0(), this.f54446f);
        View findViewById = hVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f54446f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f54446f.clear();
        return fragment;
    }

    @Deprecated
    private com.bumptech.glide.k i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z11) {
        o r11 = r(fragmentManager, fragment);
        com.bumptech.glide.k e11 = r11.e();
        if (e11 == null) {
            e11 = this.f54445e.a(com.bumptech.glide.c.e(context), r11.c(), r11.f(), context);
            if (z11) {
                e11.onStart();
            }
            r11.k(e11);
        }
        return e11;
    }

    private com.bumptech.glide.k p(Context context) {
        if (this.f54441a == null) {
            synchronized (this) {
                if (this.f54441a == null) {
                    this.f54441a = this.f54445e.a(com.bumptech.glide.c.e(context.getApplicationContext()), new va.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f54441a;
    }

    private o r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null) {
            o oVar2 = this.f54442b.get(fragmentManager);
            if (oVar2 == null) {
                o oVar3 = new o();
                oVar3.j(fragment);
                this.f54442b.put(fragmentManager, oVar3);
                fragmentManager.beginTransaction().add(oVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f54444d.obtainMessage(1, fragmentManager).sendToTarget();
                return oVar3;
            }
            return oVar2;
        }
        return oVar;
    }

    private s t(androidx.fragment.app.q qVar, Fragment fragment) {
        s sVar = (s) qVar.h0("com.bumptech.glide.manager");
        if (sVar == null) {
            s sVar2 = this.f54443c.get(qVar);
            if (sVar2 == null) {
                s sVar3 = new s();
                sVar3.o(fragment);
                this.f54443c.put(qVar, sVar3);
                qVar.m().e(sVar3, "com.bumptech.glide.manager").i();
                this.f54444d.obtainMessage(2, qVar).sendToTarget();
                return sVar3;
            }
            return sVar2;
        }
        return sVar;
    }

    private static boolean u(Context context) {
        Activity c11 = c(context);
        return c11 == null || !c11.isFinishing();
    }

    private com.bumptech.glide.k v(Context context, androidx.fragment.app.q qVar, Fragment fragment, boolean z11) {
        s t11 = t(qVar, fragment);
        com.bumptech.glide.k h11 = t11.h();
        if (h11 == null) {
            h11 = this.f54445e.a(com.bumptech.glide.c.e(context), t11.f(), t11.i(), context);
            if (z11) {
                h11.onStart();
            }
            t11.p(h11);
        }
        return h11;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i11 = message.what;
        Object obj3 = null;
        boolean z11 = true;
        if (i11 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f54442b.remove(obj);
        } else if (i11 == 2) {
            obj = (androidx.fragment.app.q) message.obj;
            remove = this.f54443c.remove(obj);
        } else {
            z11 = false;
            obj2 = null;
            if (z11 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z11;
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z11) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z11;
    }

    public com.bumptech.glide.k j(Activity activity) {
        if (bb.k.q()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.h) {
            return o((androidx.fragment.app.h) activity);
        }
        a(activity);
        this.f54449i.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @Deprecated
    public com.bumptech.glide.k k(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!bb.k.q() && Build.VERSION.SDK_INT >= 17) {
                if (fragment.getActivity() != null) {
                    this.f54449i.a(fragment.getActivity());
                }
                return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public com.bumptech.glide.k l(Context context) {
        if (context != null) {
            if (bb.k.r() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.h) {
                    return o((androidx.fragment.app.h) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public com.bumptech.glide.k m(View view) {
        if (bb.k.q()) {
            return l(view.getContext().getApplicationContext());
        }
        bb.j.d(view);
        bb.j.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c11 = c(view.getContext());
        if (c11 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c11 instanceof androidx.fragment.app.h) {
            androidx.fragment.app.h hVar = (androidx.fragment.app.h) c11;
            Fragment h11 = h(view, hVar);
            return h11 != null ? n(h11) : o(hVar);
        }
        android.app.Fragment g11 = g(view, c11);
        if (g11 == null) {
            return j(c11);
        }
        return k(g11);
    }

    public com.bumptech.glide.k n(Fragment fragment) {
        bb.j.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (bb.k.q()) {
            return l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f54449i.a(fragment.getActivity());
        }
        return v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public com.bumptech.glide.k o(androidx.fragment.app.h hVar) {
        if (bb.k.q()) {
            return l(hVar.getApplicationContext());
        }
        a(hVar);
        this.f54449i.a(hVar);
        return v(hVar, hVar.getSupportFragmentManager(), null, u(hVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s s(androidx.fragment.app.q qVar) {
        return t(qVar, null);
    }
}