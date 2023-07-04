package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    private static final Class<? extends Object>[] f3053a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a */
        final /* synthetic */ boolean f3054a;

        /* renamed from: b */
        final /* synthetic */ SavedStateRegistry f3055b;

        /* renamed from: c */
        final /* synthetic */ String f3056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, SavedStateRegistry savedStateRegistry, String str) {
            super(0);
            this.f3054a = z11;
            this.f3055b = savedStateRegistry;
            this.f3056c = str;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (this.f3054a) {
                this.f3055b.f(this.f3056c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Object, Boolean> {

        /* renamed from: a */
        public static final b f3057a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(r0.f(it2));
        }
    }

    public static /* synthetic */ Bundle a(l1.f fVar) {
        return d(fVar);
    }

    public static final p0 b(View view, androidx.savedstate.c owner) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(owner, "owner");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(o1.g.H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, owner);
    }

    public static final p0 c(String id2, androidx.savedstate.c savedStateRegistryOwner) {
        boolean z11;
        kotlin.jvm.internal.s.g(id2, "id");
        kotlin.jvm.internal.s.g(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str = ((Object) l1.f.class.getSimpleName()) + CoreConstants.COLON_CHAR + id2;
        SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        kotlin.jvm.internal.s.f(savedStateRegistry, "savedStateRegistryOwner.savedStateRegistry");
        Bundle a11 = savedStateRegistry.a(str);
        final l1.f a12 = l1.h.a(a11 == null ? null : h(a11), b.f3057a);
        try {
            savedStateRegistry.d(str, new SavedStateRegistry.b() { // from class: androidx.compose.ui.platform.q0
                @Override // androidx.savedstate.SavedStateRegistry.b
                public final Bundle a() {
                    return r0.a(l1.f.this);
                }
            });
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        }
        return new p0(a12, new a(z11, savedStateRegistry, str));
    }

    public static final Bundle d(l1.f saveableStateRegistry) {
        kotlin.jvm.internal.s.g(saveableStateRegistry, "$saveableStateRegistry");
        return g(saveableStateRegistry.b());
    }

    public static final boolean f(Object obj) {
        if (obj instanceof m1.q) {
            m1.q qVar = (m1.q) obj;
            if (qVar.d() == c1.n1.h() || qVar.d() == c1.n1.o() || qVar.d() == c1.n1.l()) {
                T value = qVar.getValue();
                if (value == 0) {
                    return true;
                }
                return f(value);
            }
            return false;
        }
        Class<? extends Object>[] clsArr = f3053a;
        int length = clsArr.length;
        int i11 = 0;
        while (i11 < length) {
            Class<? extends Object> cls = clsArr[i11];
            i11++;
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        kotlin.jvm.internal.s.f(keySet, "this.keySet()");
        for (String key : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(key);
            Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            kotlin.jvm.internal.s.f(key, "key");
            linkedHashMap.put(key, parcelableArrayList);
        }
        return linkedHashMap;
    }
}