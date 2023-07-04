package com.stripe.android.link.account;

import com.stripe.android.link.model.AccountStatus;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.e;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1", f = "LinkAccountManager.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkAccountManager$special$$inlined$transform$1 extends l implements p<kotlinx.coroutines.flow.f<? super AccountStatus>, d<? super b0>, Object> {
    final /* synthetic */ e $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    /* renamed from: com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {
        final /* synthetic */ kotlinx.coroutines.flow.f<AccountStatus> $$this$flow;
        final /* synthetic */ LinkAccountManager this$0;

        @f(c = "com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1", f = "LinkAccountManager.kt", l = {229, 237, 223}, m = "emit")
        /* renamed from: com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03711 extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C03711(d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(kotlinx.coroutines.flow.f fVar, LinkAccountManager linkAccountManager) {
            this.this$0 = linkAccountManager;
            this.$$this$flow = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0104 A[RETURN] */
        @Override // kotlinx.coroutines.flow.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r13, zz.d<? super vz.b0> r14) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, zz.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$special$$inlined$transform$1(e eVar, d dVar, LinkAccountManager linkAccountManager) {
        super(2, dVar);
        this.$this_transform = eVar;
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        LinkAccountManager$special$$inlined$transform$1 linkAccountManager$special$$inlined$transform$1 = new LinkAccountManager$special$$inlined$transform$1(this.$this_transform, dVar, this.this$0);
        linkAccountManager$special$$inlined$transform$1.L$0 = obj;
        return linkAccountManager$special$$inlined$transform$1;
    }

    @Override // h00.p
    public final Object invoke(kotlinx.coroutines.flow.f<? super AccountStatus> fVar, d<? super b0> dVar) {
        return ((LinkAccountManager$special$$inlined$transform$1) create(fVar, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            e eVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((kotlinx.coroutines.flow.f) this.L$0, this.this$0);
            this.label = 1;
            if (eVar.collect(anonymousClass1, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            r.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return b0.f54756a;
    }
}