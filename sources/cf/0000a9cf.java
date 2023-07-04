package p4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p4.b0;
import wz.s0;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45979b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, String> f45980c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b0<? extends p>> f45981a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<? extends b0<?>> navigatorClass) {
            kotlin.jvm.internal.s.g(navigatorClass, "navigatorClass");
            String str = (String) c0.f45980c.get(navigatorClass);
            if (str == null) {
                b0.b bVar = (b0.b) navigatorClass.getAnnotation(b0.b.class);
                str = bVar == null ? null : bVar.value();
                if (b(str)) {
                    c0.f45980c.put(navigatorClass, str);
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.p("No @Navigator.Name annotation found for ", navigatorClass.getSimpleName()).toString());
                }
            }
            kotlin.jvm.internal.s.e(str);
            return str;
        }

        public final boolean b(String str) {
            if (str != null) {
                if (str.length() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public b0<? extends p> b(String name, b0<? extends p> navigator) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(navigator, "navigator");
        if (f45979b.b(name)) {
            b0<? extends p> b0Var = this.f45981a.get(name);
            if (kotlin.jvm.internal.s.c(b0Var, navigator)) {
                return navigator;
            }
            boolean z11 = false;
            if (b0Var != null && b0Var.c()) {
                z11 = true;
            }
            if (!z11) {
                if (!navigator.c()) {
                    return this.f45981a.put(name, navigator);
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + b0Var).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0<? extends p> c(b0<? extends p> navigator) {
        kotlin.jvm.internal.s.g(navigator, "navigator");
        return b(f45979b.a(navigator.getClass()), navigator);
    }

    public final <T extends b0<?>> T d(Class<T> navigatorClass) {
        kotlin.jvm.internal.s.g(navigatorClass, "navigatorClass");
        return (T) e(f45979b.a(navigatorClass));
    }

    public <T extends b0<?>> T e(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        if (f45979b.b(name)) {
            b0<? extends p> b0Var = this.f45981a.get(name);
            if (b0Var != null) {
                return b0Var;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final Map<String, b0<? extends p>> f() {
        Map<String, b0<? extends p>> v11;
        v11 = s0.v(this.f45981a);
        return v11;
    }
}