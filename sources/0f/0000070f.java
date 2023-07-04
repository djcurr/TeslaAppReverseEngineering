package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.s0;
import wz.x0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f4957a = new a();

    /* renamed from: b */
    private static c f4958b = c.f4959d;

    /* renamed from: androidx.fragment.app.strictmode.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0082a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Violation violation);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d */
        public static final c f4959d;

        /* renamed from: a */
        private final Set<EnumC0082a> f4960a;

        /* renamed from: b */
        private final b f4961b;

        /* renamed from: c */
        private final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> f4962c;

        /* renamed from: androidx.fragment.app.strictmode.a$c$a */
        /* loaded from: classes.dex */
        public static final class C0083a {
            private C0083a() {
            }

            public /* synthetic */ C0083a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Set d11;
            Map i11;
            new C0083a(null);
            d11 = x0.d();
            i11 = s0.i();
            f4959d = new c(d11, null, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends EnumC0082a> flags, b bVar, Map<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            s.g(flags, "flags");
            s.g(allowedViolations, "allowedViolations");
            this.f4960a = flags;
            this.f4961b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f4962c = linkedHashMap;
        }

        public final Set<EnumC0082a> a() {
            return this.f4960a;
        }

        public final b b() {
            return this.f4961b;
        }

        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> c() {
            return this.f4962c;
        }
    }

    private a() {
    }

    public static /* synthetic */ void a(c cVar, Violation violation) {
        e(cVar, violation);
    }

    public static /* synthetic */ void b(String str, Violation violation) {
        f(str, violation);
    }

    private final c c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                q parentFragmentManager = fragment.getParentFragmentManager();
                s.f(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.z0() != null) {
                    c z02 = parentFragmentManager.z0();
                    s.e(z02);
                    s.f(z02, "fragmentManager.strictModePolicy!!");
                    return z02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f4958b;
    }

    private final void d(final c cVar, final Violation violation) {
        Fragment a11 = violation.a();
        final String name = a11.getClass().getName();
        if (cVar.a().contains(EnumC0082a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", s.p("Policy violation in ", name), violation);
        }
        if (cVar.b() != null) {
            q(a11, new Runnable() { // from class: h4.a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.strictmode.a.a(cVar, violation);
                }
            });
        }
        if (cVar.a().contains(EnumC0082a.PENALTY_DEATH)) {
            q(a11, new Runnable() { // from class: h4.b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.strictmode.a.b(name, violation);
                }
            });
        }
    }

    public static final void e(c policy, Violation violation) {
        s.g(policy, "$policy");
        s.g(violation, "$violation");
        policy.b().a(violation);
    }

    public static final void f(String str, Violation violation) {
        s.g(violation, "$violation");
        Log.e("FragmentStrictMode", s.p("Policy violation with PENALTY_DEATH in ", str), violation);
        throw violation;
    }

    private final void g(Violation violation) {
        if (q.G0(3)) {
            Log.d("FragmentManager", s.p("StrictMode violation in ", violation.a().getClass().getName()), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment, String previousFragmentId) {
        s.g(fragment, "fragment");
        s.g(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        a aVar = f4957a;
        aVar.g(fragmentReuseViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_FRAGMENT_REUSE) && aVar.r(c11, fragment.getClass(), fragmentReuseViolation.getClass())) {
            aVar.d(c11, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        s.g(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        a aVar = f4957a;
        aVar.g(fragmentTagUsageViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_FRAGMENT_TAG_USAGE) && aVar.r(c11, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            aVar.d(c11, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment) {
        s.g(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        a aVar = f4957a;
        aVar.g(getRetainInstanceUsageViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_RETAIN_INSTANCE_USAGE) && aVar.r(c11, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            aVar.d(c11, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(Fragment fragment) {
        s.g(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        a aVar = f4957a;
        aVar.g(getTargetFragmentRequestCodeUsageViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_TARGET_FRAGMENT_USAGE) && aVar.r(c11, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            aVar.d(c11, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(Fragment fragment) {
        s.g(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        a aVar = f4957a;
        aVar.g(getTargetFragmentUsageViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_TARGET_FRAGMENT_USAGE) && aVar.r(c11, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            aVar.d(c11, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(Fragment fragment) {
        s.g(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        a aVar = f4957a;
        aVar.g(setRetainInstanceUsageViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_RETAIN_INSTANCE_USAGE) && aVar.r(c11, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            aVar.d(c11, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(Fragment violatingFragment, Fragment targetFragment, int i11) {
        s.g(violatingFragment, "violatingFragment");
        s.g(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i11);
        a aVar = f4957a;
        aVar.g(setTargetFragmentUsageViolation);
        c c11 = aVar.c(violatingFragment);
        if (c11.a().contains(EnumC0082a.DETECT_TARGET_FRAGMENT_USAGE) && aVar.r(c11, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            aVar.d(c11, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(Fragment fragment, boolean z11) {
        s.g(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z11);
        a aVar = f4957a;
        aVar.g(setUserVisibleHintViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_SET_USER_VISIBLE_HINT) && aVar.r(c11, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            aVar.d(c11, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(Fragment fragment, ViewGroup container) {
        s.g(fragment, "fragment");
        s.g(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        a aVar = f4957a;
        aVar.g(wrongFragmentContainerViolation);
        c c11 = aVar.c(fragment);
        if (c11.a().contains(EnumC0082a.DETECT_WRONG_FRAGMENT_CONTAINER) && aVar.r(c11, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            aVar.d(c11, wrongFragmentContainerViolation);
        }
    }

    private final void q(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g11 = fragment.getParentFragmentManager().t0().g();
            s.f(g11, "fragment.parentFragmentManager.host.handler");
            if (s.c(g11.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                g11.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean r(c cVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean T;
        Set<Class<? extends Violation>> set = cVar.c().get(cls);
        if (set == null) {
            return true;
        }
        if (!s.c(cls2.getSuperclass(), Violation.class)) {
            T = e0.T(set, cls2.getSuperclass());
            if (T) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}