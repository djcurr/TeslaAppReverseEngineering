package com.stripe.android.link.model;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p4.e0;
import p4.x;
import vz.b0;

/* loaded from: classes6.dex */
final class Navigator$navigateTo$1$1 extends u implements l<x, b0> {
    final /* synthetic */ boolean $clearBackStack;
    final /* synthetic */ p4.u $navController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.model.Navigator$navigateTo$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<e0, b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(e0 e0Var) {
            invoke2(e0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(e0 popUpTo) {
            s.g(popUpTo, "$this$popUpTo");
            popUpTo.c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Navigator$navigateTo$1$1(boolean z11, p4.u uVar) {
        super(1);
        this.$clearBackStack = z11;
        this.$navController = uVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(x xVar) {
        invoke2(xVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(x navigate) {
        s.g(navigate, "$this$navigate");
        if (this.$clearBackStack) {
            navigate.g(this.$navController.v().first().f().m(), AnonymousClass1.INSTANCE);
        }
    }
}