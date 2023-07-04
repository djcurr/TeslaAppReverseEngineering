package com.stripe.android.link.model;

import androidx.lifecycle.f0;
import androidx.lifecycle.l0;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkScreen;
import h00.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import p4.i;
import p4.u;
import vz.b0;

/* loaded from: classes6.dex */
public final class Navigator {
    private u navigationController;
    private l<? super LinkActivityResult, b0> onDismiss;

    public static /* synthetic */ b0 dismiss$default(Navigator navigator, LinkActivityResult linkActivityResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkActivityResult = LinkActivityResult.Canceled.INSTANCE;
        }
        return navigator.dismiss(linkActivityResult);
    }

    public static /* synthetic */ b0 navigateTo$default(Navigator navigator, LinkScreen linkScreen, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return navigator.navigateTo(linkScreen, z11);
    }

    public final b0 dismiss(LinkActivityResult result) {
        s.g(result, "result");
        l<? super LinkActivityResult, b0> lVar = this.onDismiss;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(result);
        return b0.f54756a;
    }

    public final u getNavigationController() {
        return this.navigationController;
    }

    public final l<LinkActivityResult, b0> getOnDismiss() {
        return this.onDismiss;
    }

    public final <T> e<T> getResultFlow(String key) {
        i y11;
        l0 i11;
        f0<T> d11;
        s.g(key, "key");
        u uVar = this.navigationController;
        if (uVar == null || (y11 = uVar.y()) == null || (i11 = y11.i()) == null || (d11 = i11.d(key)) == null) {
            return null;
        }
        return androidx.lifecycle.l.a(d11);
    }

    public final b0 navigateTo(LinkScreen target, boolean z11) {
        s.g(target, "target");
        u uVar = this.navigationController;
        if (uVar == null) {
            return null;
        }
        uVar.J(target.getRoute(), new Navigator$navigateTo$1$1(z11, uVar));
        return b0.f54756a;
    }

    public final b0 onBack() {
        u uVar = this.navigationController;
        if (uVar == null) {
            return null;
        }
        if (!uVar.Q()) {
            dismiss$default(this, null, 1, null);
        }
        return b0.f54756a;
    }

    public final void setNavigationController(u uVar) {
        this.navigationController = uVar;
    }

    public final void setOnDismiss(l<? super LinkActivityResult, b0> lVar) {
        this.onDismiss = lVar;
    }

    public final b0 setResult(String key, Object value) {
        i E;
        l0 i11;
        s.g(key, "key");
        s.g(value, "value");
        u uVar = this.navigationController;
        if (uVar == null || (E = uVar.E()) == null || (i11 = E.i()) == null) {
            return null;
        }
        i11.h(key, value);
        return b0.f54756a;
    }
}