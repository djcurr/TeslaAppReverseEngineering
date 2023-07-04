package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import wz.x0;
import wz.y0;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f45984a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.coroutines.flow.u<List<i>> f45985b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.flow.u<Set<i>> f45986c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45987d;

    /* renamed from: e  reason: collision with root package name */
    private final h0<List<i>> f45988e;

    /* renamed from: f  reason: collision with root package name */
    private final h0<Set<i>> f45989f;

    public d0() {
        List i11;
        Set d11;
        i11 = wz.w.i();
        kotlinx.coroutines.flow.u<List<i>> a11 = j0.a(i11);
        this.f45985b = a11;
        d11 = x0.d();
        kotlinx.coroutines.flow.u<Set<i>> a12 = j0.a(d11);
        this.f45986c = a12;
        this.f45988e = kotlinx.coroutines.flow.g.b(a11);
        this.f45989f = kotlinx.coroutines.flow.g.b(a12);
    }

    public abstract i a(p pVar, Bundle bundle);

    public final h0<List<i>> b() {
        return this.f45988e;
    }

    public final h0<Set<i>> c() {
        return this.f45989f;
    }

    public final boolean d() {
        return this.f45987d;
    }

    public void e(i entry) {
        Set<i> l11;
        kotlin.jvm.internal.s.g(entry, "entry");
        kotlinx.coroutines.flow.u<Set<i>> uVar = this.f45986c;
        l11 = y0.l(uVar.getValue(), entry);
        uVar.setValue(l11);
    }

    public void f(i backStackEntry) {
        List v02;
        List<i> z02;
        kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
        kotlinx.coroutines.flow.u<List<i>> uVar = this.f45985b;
        v02 = wz.e0.v0(uVar.getValue(), wz.u.n0(this.f45985b.getValue()));
        z02 = wz.e0.z0(v02, backStackEntry);
        uVar.setValue(z02);
    }

    public void g(i popUpTo, boolean z11) {
        kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f45984a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.u<List<i>> uVar = this.f45985b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : uVar.getValue()) {
                if (!(!kotlin.jvm.internal.s.c((i) obj, popUpTo))) {
                    break;
                }
                arrayList.add(obj);
            }
            uVar.setValue(arrayList);
            vz.b0 b0Var = vz.b0.f54756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(i popUpTo, boolean z11) {
        Set<i> n11;
        i iVar;
        Set<i> n12;
        boolean z12;
        kotlin.jvm.internal.s.g(popUpTo, "popUpTo");
        kotlinx.coroutines.flow.u<Set<i>> uVar = this.f45986c;
        n11 = y0.n(uVar.getValue(), popUpTo);
        uVar.setValue(n11);
        List<i> value = this.f45988e.getValue();
        ListIterator<i> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iVar = null;
                break;
            }
            iVar = listIterator.previous();
            i iVar2 = iVar;
            if (kotlin.jvm.internal.s.c(iVar2, popUpTo) || b().getValue().lastIndexOf(iVar2) >= b().getValue().lastIndexOf(popUpTo)) {
                z12 = false;
                continue;
            } else {
                z12 = true;
                continue;
            }
            if (z12) {
                break;
            }
        }
        i iVar3 = iVar;
        if (iVar3 != null) {
            kotlinx.coroutines.flow.u<Set<i>> uVar2 = this.f45986c;
            n12 = y0.n(uVar2.getValue(), iVar3);
            uVar2.setValue(n12);
        }
        g(popUpTo, z11);
    }

    public void i(i backStackEntry) {
        List<i> z02;
        kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f45984a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.u<List<i>> uVar = this.f45985b;
            z02 = wz.e0.z0(uVar.getValue(), backStackEntry);
            uVar.setValue(z02);
            vz.b0 b0Var = vz.b0.f54756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j(i backStackEntry) {
        Set<i> n11;
        Set<i> n12;
        kotlin.jvm.internal.s.g(backStackEntry, "backStackEntry");
        i iVar = (i) wz.u.p0(this.f45988e.getValue());
        if (iVar != null) {
            kotlinx.coroutines.flow.u<Set<i>> uVar = this.f45986c;
            n12 = y0.n(uVar.getValue(), iVar);
            uVar.setValue(n12);
        }
        kotlinx.coroutines.flow.u<Set<i>> uVar2 = this.f45986c;
        n11 = y0.n(uVar2.getValue(), backStackEntry);
        uVar2.setValue(n11);
        i(backStackEntry);
    }

    public final void k(boolean z11) {
        this.f45987d = z11;
    }
}