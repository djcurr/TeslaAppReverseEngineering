package com.stripe.android.link;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.Navigator;
import h00.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.LinkActivity$onCreate$3$onGlobalLayout$1", f = "LinkActivity.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class LinkActivity$onCreate$3$onGlobalLayout$1 extends l implements p<o0, d<? super b0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LinkActivity this$0;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            iArr[AccountStatus.Verified.ordinal()] = 1;
            iArr[AccountStatus.NeedsVerification.ordinal()] = 2;
            iArr[AccountStatus.VerificationStarted.ordinal()] = 3;
            iArr[AccountStatus.SignedOut.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$3$onGlobalLayout$1(LinkActivity linkActivity, d<? super LinkActivity$onCreate$3$onGlobalLayout$1> dVar) {
        super(2, dVar);
        this.this$0 = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new LinkActivity$onCreate$3$onGlobalLayout$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((LinkActivity$onCreate$3$onGlobalLayout$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkActivityViewModel viewModel;
        LinkActivityViewModel viewModel2;
        Navigator navigator;
        LinkScreen linkScreen;
        LinkActivityContract.Args starterArgs;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            viewModel = this.this$0.getViewModel();
            Navigator navigator2 = viewModel.getNavigator();
            viewModel2 = this.this$0.getViewModel();
            e<AccountStatus> accountStatus = viewModel2.getLinkAccountManager().getAccountStatus();
            this.L$0 = navigator2;
            this.label = 1;
            Object r11 = g.r(accountStatus, this);
            if (r11 == d11) {
                return d11;
            }
            navigator = navigator2;
            obj = r11;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            navigator = (Navigator) this.L$0;
            r.b(obj);
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[((AccountStatus) obj).ordinal()];
        if (i12 == 1) {
            linkScreen = LinkScreen.Wallet.INSTANCE;
        } else if (i12 == 2 || i12 == 3) {
            linkScreen = LinkScreen.Verification.INSTANCE;
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            starterArgs = this.this$0.getStarterArgs();
            linkScreen = new LinkScreen.SignUp(starterArgs.getCustomerEmail$link_release());
        }
        navigator.navigateTo(linkScreen, true);
        return b0.f54756a;
    }
}