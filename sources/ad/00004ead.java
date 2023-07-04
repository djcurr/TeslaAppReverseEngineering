package com.stripe.android.link;

import c1.o0;
import h00.l;
import h00.p;
import h00.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.u;
import p0.i;
import v20.k;
import vz.b0;
import vz.r;
import y0.n0;
import zz.d;

/* loaded from: classes6.dex */
final class LinkActivity$onCreate$1$2$1$1$2$4$1$1 extends u implements l<q<? super i, ? super c1.i, ? super Integer, ? extends b0>, b0> {
    final /* synthetic */ o0<q<i, c1.i, Integer, b0>> $bottomSheetContent$delegate;
    final /* synthetic */ v20.o0 $coroutineScope;
    final /* synthetic */ n0 $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$4$1$1$1", f = "LinkActivity.kt", l = {156}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$1$2$1$1$2$4$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<v20.o0, d<? super b0>, Object> {
        final /* synthetic */ o0<q<i, c1.i, Integer, b0>> $bottomSheetContent$delegate;
        final /* synthetic */ n0 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n0 n0Var, o0<q<i, c1.i, Integer, b0>> o0Var, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$sheetState = n0Var;
            this.$bottomSheetContent$delegate = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$sheetState, this.$bottomSheetContent$delegate, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                n0 n0Var = this.$sheetState;
                this.label = 1;
                if (n0Var.N(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            this.$bottomSheetContent$delegate.setValue(null);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$2$1$1$2$4$1$1(v20.o0 o0Var, n0 n0Var, o0<q<i, c1.i, Integer, b0>> o0Var2) {
        super(1);
        this.$coroutineScope = o0Var;
        this.$sheetState = n0Var;
        this.$bottomSheetContent$delegate = o0Var2;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(q<? super i, ? super c1.i, ? super Integer, ? extends b0> qVar) {
        invoke2((q<? super i, ? super c1.i, ? super Integer, b0>) qVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(q<? super i, ? super c1.i, ? super Integer, b0> qVar) {
        if (qVar == null) {
            k.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$sheetState, this.$bottomSheetContent$delegate, null), 3, null);
        } else {
            this.$bottomSheetContent$delegate.setValue(qVar);
        }
    }
}