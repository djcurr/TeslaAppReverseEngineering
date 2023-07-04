package com.squareup.workflow1.ui.backstack;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;
import com.squareup.workflow1.ui.backstack.StateRegistryAggregator;
import h00.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.y0;

/* loaded from: classes2.dex */
public final class StateRegistryAggregator {

    /* renamed from: a */
    private final l<StateRegistryAggregator, b0> f20875a;

    /* renamed from: b */
    private final l<StateRegistryAggregator, b0> f20876b;

    /* renamed from: c */
    private Map<String, Bundle> f20877c;

    /* renamed from: d */
    private c f20878d;

    /* renamed from: e */
    private String f20879e;

    /* renamed from: f */
    private final StateRegistryAggregator$lifecycleObserver$1 f20880f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.workflow1.ui.backstack.StateRegistryAggregator$lifecycleObserver$1] */
    public StateRegistryAggregator(l<? super StateRegistryAggregator, b0> onWillSave, l<? super StateRegistryAggregator, b0> onRestored) {
        s.g(onWillSave, "onWillSave");
        s.g(onRestored, "onRestored");
        this.f20875a = onWillSave;
        this.f20876b = onRestored;
        this.f20880f = new androidx.lifecycle.s() { // from class: com.squareup.workflow1.ui.backstack.StateRegistryAggregator$lifecycleObserver$1
            @Override // androidx.lifecycle.s
            public void g(v source, p.b event) {
                s.g(source, "source");
                s.g(event, "event");
                if (event == p.b.ON_CREATE) {
                    if (!StateRegistryAggregator.e(StateRegistryAggregator.this)) {
                        source.getLifecycle().c(this);
                        c c11 = StateRegistryAggregator.c(StateRegistryAggregator.this);
                        s.e(c11);
                        SavedStateRegistry savedStateRegistry = c11.getSavedStateRegistry();
                        String b11 = StateRegistryAggregator.b(StateRegistryAggregator.this);
                        s.e(b11);
                        StateRegistryAggregator.f(StateRegistryAggregator.this, savedStateRegistry.a(b11));
                        return;
                    }
                    throw new IllegalStateException("Expected not to be observing lifecycle after restoration.".toString());
                }
                throw new IllegalStateException(s.p("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
            }
        };
    }

    public static /* synthetic */ Bundle a(StateRegistryAggregator stateRegistryAggregator) {
        return stateRegistryAggregator.n();
    }

    public static final /* synthetic */ String b(StateRegistryAggregator stateRegistryAggregator) {
        return stateRegistryAggregator.f20879e;
    }

    public static final /* synthetic */ c c(StateRegistryAggregator stateRegistryAggregator) {
        return stateRegistryAggregator.f20878d;
    }

    public static final /* synthetic */ boolean e(StateRegistryAggregator stateRegistryAggregator) {
        return stateRegistryAggregator.i();
    }

    public static final /* synthetic */ void f(StateRegistryAggregator stateRegistryAggregator, Bundle bundle) {
        stateRegistryAggregator.k(bundle);
    }

    public final boolean i() {
        return this.f20877c != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Bundle bundle) {
        Set<String> keySet;
        if (this.f20877c == null) {
            this.f20877c = new LinkedHashMap();
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str : keySet) {
                    Map<String, Bundle> map = this.f20877c;
                    s.e(map);
                    Bundle bundle2 = bundle.getBundle(str);
                    s.e(bundle2);
                    vz.p a11 = vz.v.a(str, bundle2);
                    map.put(a11.c(), a11.d());
                }
            }
            this.f20876b.invoke(this);
            return;
        }
        throw new IllegalStateException("Expected performRestore to be called only once.".toString());
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        Map map = this.f20877c;
        if (map != null) {
            this.f20875a.invoke(this);
            for (Map.Entry entry : map.entrySet()) {
                bundle.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
            }
        }
        return bundle;
    }

    public final void g(String key, c parentOwner) {
        s.g(key, "key");
        s.g(parentOwner, "parentOwner");
        h();
        this.f20878d = parentOwner;
        this.f20879e = key;
        if (i()) {
            return;
        }
        SavedStateRegistry savedStateRegistry = parentOwner.getSavedStateRegistry();
        s.f(savedStateRegistry, "parentOwner.savedStateRegistry");
        p lifecycle = parentOwner.getLifecycle();
        s.f(lifecycle, "parentOwner.lifecycle");
        try {
            savedStateRegistry.d(key, new SavedStateRegistry.b() { // from class: rr.g
                @Override // androidx.savedstate.SavedStateRegistry.b
                public final Bundle a() {
                    return StateRegistryAggregator.a(StateRegistryAggregator.this);
                }
            });
            lifecycle.a(this.f20880f);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Error registering StateRegistryHolder as SavedStateProvider with key \"" + key + "\" on parent SavedStateRegistryOwner " + parentOwner + ".\nYou might need to set a view ID on your BackStackContainer or wrap your BackStackScreen with a Named rendering.", e11);
        }
    }

    public final void h() {
        p lifecycle;
        SavedStateRegistry savedStateRegistry;
        c cVar = this.f20878d;
        if (cVar != null && (savedStateRegistry = cVar.getSavedStateRegistry()) != null) {
            String str = this.f20879e;
            s.e(str);
            savedStateRegistry.f(str);
        }
        c cVar2 = this.f20878d;
        if (cVar2 != null && (lifecycle = cVar2.getLifecycle()) != null) {
            lifecycle.c(this.f20880f);
        }
        this.f20878d = null;
        this.f20879e = null;
    }

    public final void j(Collection<String> retaining) {
        Set k11;
        s.g(retaining, "retaining");
        Map map = this.f20877c;
        if (map == null) {
            return;
        }
        k11 = y0.k(map.keySet(), retaining);
        wz.b0.E(map.keySet(), k11);
    }

    public final void l(String key, b controller) {
        s.g(key, "key");
        s.g(controller, "controller");
        Map map = this.f20877c;
        if (map == null) {
            return;
        }
        controller.c((Bundle) map.remove(key));
    }

    public final void m(String key, b controller) {
        s.g(key, "key");
        s.g(controller, "controller");
        Map map = this.f20877c;
        if (map == null) {
            return;
        }
        Bundle bundle = new Bundle();
        controller.d(bundle);
        vz.p a11 = vz.v.a(key, bundle);
        map.put(a11.c(), a11.d());
    }
}