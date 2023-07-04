package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import v20.a2;
import v20.k;
import v20.p0;
import wz.u;
import zz.g;

/* loaded from: classes2.dex */
public final class CardAccountRangeService {
    public static final int $stable = 8;
    private AccountRange accountRange;
    private a2 accountRangeRepositoryJob;
    private final AccountRangeResultListener accountRangeResultListener;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private final e<Boolean> isLoading;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private final g workContext;

    /* loaded from: classes2.dex */
    public interface AccountRangeResultListener {
        void onAccountRangeResult(AccountRange accountRange);
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            iArr[CardBrand.Unknown.ordinal()] = 1;
            iArr[CardBrand.UnionPay.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardAccountRangeService(CardAccountRangeRepository cardAccountRangeRepository, g workContext, StaticCardAccountRanges staticCardAccountRanges, AccountRangeResultListener accountRangeResultListener) {
        s.g(cardAccountRangeRepository, "cardAccountRangeRepository");
        s.g(workContext, "workContext");
        s.g(staticCardAccountRanges, "staticCardAccountRanges");
        s.g(accountRangeResultListener, "accountRangeResultListener");
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.workContext = workContext;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.accountRangeResultListener = accountRangeResultListener;
        this.isLoading = cardAccountRangeRepository.getLoading();
    }

    public static /* synthetic */ void getAccountRangeRepositoryJob$annotations() {
    }

    private final boolean shouldQueryAccountRange(CardNumber.Unvalidated unvalidated) {
        BinRange binRange;
        if (this.accountRange == null || unvalidated.getBin() == null) {
            return true;
        }
        AccountRange accountRange = this.accountRange;
        return accountRange != null && (binRange = accountRange.getBinRange()) != null && !binRange.matches(unvalidated);
    }

    private final boolean shouldQueryRepository(AccountRange accountRange) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[accountRange.getBrand().ordinal()];
        return i11 == 1 || i11 == 2;
    }

    public final void cancelAccountRangeRepositoryJob() {
        a2 a2Var = this.accountRangeRepositoryJob;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public final AccountRange getAccountRange() {
        return this.accountRange;
    }

    public final a2 getAccountRangeRepositoryJob() {
        return this.accountRangeRepositoryJob;
    }

    public final StaticCardAccountRanges getStaticCardAccountRanges() {
        return this.staticCardAccountRanges;
    }

    public final e<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void onCardNumberChanged(CardNumber.Unvalidated cardNumber) {
        s.g(cardNumber, "cardNumber");
        List<AccountRange> filter = this.staticCardAccountRanges.filter(cardNumber);
        AccountRange accountRange = filter.size() == 1 ? (AccountRange) u.b0(filter) : null;
        if (accountRange != null && !shouldQueryRepository(accountRange)) {
            updateAccountRangeResult(accountRange);
        } else {
            queryAccountRangeRepository(cardNumber);
        }
    }

    public final /* synthetic */ void queryAccountRangeRepository(CardNumber.Unvalidated cardNumber) {
        a2 d11;
        s.g(cardNumber, "cardNumber");
        if (shouldQueryAccountRange(cardNumber)) {
            cancelAccountRangeRepositoryJob();
            this.accountRange = null;
            d11 = k.d(p0.a(this.workContext), null, null, new CardAccountRangeService$queryAccountRangeRepository$1(cardNumber, this, null), 3, null);
            this.accountRangeRepositoryJob = d11;
        }
    }

    public final void setAccountRangeRepositoryJob(a2 a2Var) {
        this.accountRangeRepositoryJob = a2Var;
    }

    public final /* synthetic */ void updateAccountRangeResult(AccountRange accountRange) {
        this.accountRange = accountRange;
        this.accountRangeResultListener.onAccountRangeResult(accountRange);
    }
}