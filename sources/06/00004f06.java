package com.stripe.android.link.account;

import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.repositories.LinkRepository;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.account.LinkAccountManager$logout$1$1", f = "LinkAccountManager.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkAccountManager$logout$1$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ LinkAccount $account;
    final /* synthetic */ String $cookie;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$logout$1$1(LinkAccountManager linkAccountManager, LinkAccount linkAccount, String str, d<? super LinkAccountManager$logout$1$1> dVar) {
        super(2, dVar);
        this.this$0 = linkAccountManager;
        this.$account = linkAccount;
        this.$cookie = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new LinkAccountManager$logout$1$1(this.this$0, this.$account, this.$cookie, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((LinkAccountManager$logout$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkRepository linkRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.$account.getClientSecret();
            String str = this.$cookie;
            this.label = 1;
            if (linkRepository.mo169logout0E7RQCE(clientSecret, str, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            ((q) obj).j();
        }
        return b0.f54756a;
    }
}