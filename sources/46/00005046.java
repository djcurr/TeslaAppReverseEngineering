package com.stripe.android.link.ui.verification;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import c1.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkAppBarKt;
import com.stripe.android.model.ConsumerSession;
import f2.z;
import h00.l;
import h00.p;
import h2.a;
import j1.c;
import kotlin.jvm.internal.u;
import o1.f;
import p0.a;
import p0.e0;
import p0.h;
import p0.j;
import vz.b0;
import x2.d;
import x2.g;
import x2.q;
import y0.b1;
import y0.h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerificationDialogKt$LinkVerificationDialog$1$1$1$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ LinkAccount $account;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ o0<Boolean> $openDialog$delegate;
    final /* synthetic */ l<Boolean, b0> $verificationCallback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ LinkAccount $account;
        final /* synthetic */ NonFallbackInjector $injector;
        final /* synthetic */ o0<Boolean> $openDialog$delegate;
        final /* synthetic */ l<Boolean, b0> $verificationCallback;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03731 extends u implements p<i, Integer, b0> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ LinkAccount $account;
            final /* synthetic */ NonFallbackInjector $injector;
            final /* synthetic */ o0<Boolean> $openDialog$delegate;
            final /* synthetic */ l<Boolean, b0> $verificationCallback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03731(LinkAccount linkAccount, o0<Boolean> o0Var, l<? super Boolean, b0> lVar, int i11, NonFallbackInjector nonFallbackInjector) {
                super(2);
                this.$account = linkAccount;
                this.$openDialog$delegate = o0Var;
                this.$verificationCallback = lVar;
                this.$$dirty = i11;
                this.$injector = nonFallbackInjector;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [c1.i, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v11 */
            public final void invoke(i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                LinkAccount linkAccount = this.$account;
                o0<Boolean> o0Var = this.$openDialog$delegate;
                l<Boolean, b0> lVar = this.$verificationCallback;
                NonFallbackInjector nonFallbackInjector = this.$injector;
                iVar.x(-1113030915);
                f.a aVar = f.f42062f1;
                z a11 = h.a(a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
                iVar.x(1376089394);
                d dVar = (d) iVar.A(l0.d());
                q qVar = (q) iVar.A(l0.i());
                y1 y1Var = (y1) iVar.A(l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(aVar);
                if (!(iVar.k() instanceof e)) {
                    c1.h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a12);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a13 = a2.a(iVar);
                a2.c(a13, a11, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(276693625);
                j jVar = j.f45341a;
                String email = linkAccount.getEmail();
                iVar.x(-3686552);
                boolean O = iVar.O(o0Var) | iVar.O(lVar);
                Object y11 = iVar.y();
                if (O || y11 == i.f8486a.a()) {
                    y11 = new VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1$1$1$1$1(lVar, o0Var);
                    iVar.p(y11);
                }
                iVar.N();
                LinkAppBarKt.LinkAppBar(email, (h00.a) y11, iVar, 0);
                int i12 = R.string.verification_header_prefilled;
                int i13 = R.string.verification_message;
                iVar.x(-3686552);
                boolean O2 = iVar.O(o0Var) | iVar.O(lVar);
                Object y12 = iVar.y();
                if (O2 || y12 == i.f8486a.a()) {
                    y12 = new VerificationDialogKt$LinkVerificationDialog$1$1$1$2$1$1$1$2$1(lVar, o0Var);
                    iVar.p(y12);
                }
                iVar.N();
                VerificationScreenKt.VerificationBody(i12, i13, false, linkAccount, nonFallbackInjector, y12, iVar, (ConsumerSession.$stable << 9) | 384, 0);
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LinkAccount linkAccount, o0<Boolean> o0Var, l<? super Boolean, b0> lVar, int i11, NonFallbackInjector nonFallbackInjector) {
            super(2);
            this.$account = linkAccount;
            this.$openDialog$delegate = o0Var;
            this.$verificationCallback = lVar;
            this.$$dirty = i11;
            this.$injector = nonFallbackInjector;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                b1.b(p0.u.h(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(16)), h0.f58131a.b(iVar, 8).d(), 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, c.b(iVar, -819893148, true, new C03731(this.$account, this.$openDialog$delegate, this.$verificationCallback, this.$$dirty, this.$injector)), iVar, 1572870, 60);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationDialogKt$LinkVerificationDialog$1$1$1$2(LinkAccount linkAccount, o0<Boolean> o0Var, l<? super Boolean, b0> lVar, int i11, NonFallbackInjector nonFallbackInjector) {
        super(2);
        this.$account = linkAccount;
        this.$openDialog$delegate = o0Var;
        this.$verificationCallback = lVar;
        this.$$dirty = i11;
        this.$injector = nonFallbackInjector;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, c.b(iVar, -819892406, true, new AnonymousClass1(this.$account, this.$openDialog$delegate, this.$verificationCallback, this.$$dirty, this.$injector)), iVar, 48, 1);
        }
    }
}