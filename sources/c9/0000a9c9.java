package p4;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import p4.p;

/* loaded from: classes.dex */
public abstract class b0<D extends p> {

    /* renamed from: a  reason: collision with root package name */
    private d0 f45973a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45974b;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<i, i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0<D> f45975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f45976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f45977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0<D> b0Var, w wVar, a aVar) {
            super(1);
            this.f45975a = b0Var;
            this.f45976b = wVar;
            this.f45977c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h00.l
        /* renamed from: a */
        public final i invoke(i backStackEntry) {
            p d11;
            kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
            p f11 = backStackEntry.f();
            if (!(f11 instanceof p)) {
                f11 = null;
            }
            if (f11 != null && (d11 = this.f45975a.d(f11, backStackEntry.d(), this.f45976b, this.f45977c)) != null) {
                return kotlin.jvm.internal.s.c(d11, f11) ? backStackEntry : this.f45975a.b().a(d11, d11.f(backStackEntry.d()));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<x, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f45978a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(x xVar) {
            invoke2(xVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(x navOptions) {
            kotlin.jvm.internal.s.g(navOptions, "$this$navOptions");
            navOptions.h(true);
        }
    }

    public abstract D a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final d0 b() {
        d0 d0Var = this.f45973a;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f45974b;
    }

    public p d(D destination, Bundle bundle, w wVar, a aVar) {
        kotlin.jvm.internal.s.g(destination, "destination");
        return destination;
    }

    public void e(List<i> entries, w wVar, a aVar) {
        u20.h S;
        kotlin.jvm.internal.s.g(entries, "entries");
        S = wz.e0.S(entries);
        for (i iVar : u20.k.s(u20.k.B(S, new c(this, wVar, aVar)))) {
            b().i(iVar);
        }
    }

    public void f(d0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        this.f45973a = state;
        this.f45974b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(i backStackEntry) {
        kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
        p f11 = backStackEntry.f();
        if (!(f11 instanceof p)) {
            f11 = null;
        }
        if (f11 == null) {
            return;
        }
        d(f11, null, y.a(d.f45978a), null);
        b().f(backStackEntry);
    }

    public void h(Bundle savedState) {
        kotlin.jvm.internal.s.g(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(i popUpTo, boolean z11) {
        kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
        List<i> value = b().b().getValue();
        if (value.contains(popUpTo)) {
            ListIterator<i> listIterator = value.listIterator(value.size());
            i iVar = null;
            while (k()) {
                iVar = listIterator.previous();
                if (kotlin.jvm.internal.s.c(iVar, popUpTo)) {
                    break;
                }
            }
            if (iVar != null) {
                b().g(iVar, z11);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
    }

    public boolean k() {
        return true;
    }
}