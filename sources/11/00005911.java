package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.a2;
import v20.o0;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class ChallengeActivityViewModel extends p0 {
    private final OnInactiveAwareMutableLiveData<ChallengeRequestResult> _challengeRequestResult;
    private final f0<String> _challengeText;
    private final OnInactiveAwareMutableLiveData<ChallengeResponseData> _nextScreen;
    private final f0<b0> _refreshUi;
    private final f0<ChallengeResult> _shouldFinish;
    private final f0<ChallengeAction> _submitClicked;
    private final ChallengeActionHandler challengeActionHandler;
    private final LiveData<ChallengeRequestResult> challengeRequestResult;
    private final LiveData<String> challengeText;
    private final ImageCache imageCache;
    private final ImageRepository imageRepository;
    private final LiveData<ChallengeResponseData> nextScreen;
    private final LiveData<b0> refreshUi;
    private final LiveData<ChallengeResult> shouldFinish;
    private boolean shouldRefreshUi;
    private final LiveData<ChallengeAction> submitClicked;
    private final TransactionTimer transactionTimer;
    private final a2 transactionTimerJob;

    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", f = "ChallengeActivityViewModel.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {
        int label;

        AnonymousClass1(zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                TransactionTimer transactionTimer = ChallengeActivityViewModel.this.transactionTimer;
                this.label = 1;
                if (transactionTimer.start(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final ChallengeActionHandler challengeActionHandler;
        private final ErrorReporter errorReporter;
        private final TransactionTimer transactionTimer;
        private final zz.g workContext;

        public Factory(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, zz.g workContext) {
            s.g(challengeActionHandler, "challengeActionHandler");
            s.g(transactionTimer, "transactionTimer");
            s.g(errorReporter, "errorReporter");
            s.g(workContext, "workContext");
            this.challengeActionHandler = challengeActionHandler;
            this.transactionTimer = transactionTimer;
            this.errorReporter = errorReporter;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            return new ChallengeActivityViewModel(this.challengeActionHandler, this.transactionTimer, this.errorReporter, null, this.workContext, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class OnInactiveAwareMutableLiveData<T> extends f0<T> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    public /* synthetic */ ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, zz.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeActionHandler, transactionTimer, errorReporter, (i11 & 8) != 0 ? ImageCache.Default.INSTANCE : imageCache, gVar);
    }

    public final LiveData<ChallengeRequestResult> getChallengeRequestResult() {
        return this.challengeRequestResult;
    }

    public final LiveData<String> getChallengeText() {
        return this.challengeText;
    }

    public final LiveData<Bitmap> getImage(ChallengeResponseData.Image image, int i11) {
        return androidx.lifecycle.g.b(null, 0L, new ChallengeActivityViewModel$getImage$1(this, image, i11, null), 3, null);
    }

    public final LiveData<ChallengeResponseData> getNextScreen() {
        return this.nextScreen;
    }

    public final LiveData<b0> getRefreshUi() {
        return this.refreshUi;
    }

    public final LiveData<ChallengeResult> getShouldFinish() {
        return this.shouldFinish;
    }

    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final LiveData<ChallengeAction> getSubmitClicked() {
        return this.submitClicked;
    }

    public final LiveData<Boolean> getTimeout() {
        return androidx.lifecycle.g.b(null, 0L, new ChallengeActivityViewModel$getTimeout$1(this, null), 3, null);
    }

    public final a2 getTransactionTimerJob$3ds2sdk_release() {
        return this.transactionTimerJob;
    }

    public final void onFinish(ChallengeResult challengeResult) {
        s.g(challengeResult, "challengeResult");
        this._shouldFinish.postValue(challengeResult);
    }

    public final void onMemoryEvent() {
        this.imageCache.clear();
    }

    public final void onNextScreen(ChallengeResponseData cres) {
        s.g(cres, "cres");
        this._nextScreen.setValue(cres);
    }

    public final void onRefreshUi() {
        this._refreshUi.setValue(b0.f54756a);
    }

    public final void onSubmitClicked(ChallengeAction challengeAction) {
        s.g(challengeAction, "challengeAction");
        this._submitClicked.postValue(challengeAction);
    }

    public final void setShouldRefreshUi(boolean z11) {
        this.shouldRefreshUi = z11;
    }

    public final void stopTimer() {
        a2.a.a(this.transactionTimerJob, null, 1, null);
    }

    public final void submit(ChallengeAction action) {
        s.g(action, "action");
        v20.k.d(q0.a(this), null, null, new ChallengeActivityViewModel$submit$1(this, action, null), 3, null);
    }

    public final void updateChallengeText(String text) {
        s.g(text, "text");
        this._challengeText.setValue(text);
    }

    public ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, zz.g workContext) {
        a2 d11;
        s.g(challengeActionHandler, "challengeActionHandler");
        s.g(transactionTimer, "transactionTimer");
        s.g(errorReporter, "errorReporter");
        s.g(imageCache, "imageCache");
        s.g(workContext, "workContext");
        this.challengeActionHandler = challengeActionHandler;
        this.transactionTimer = transactionTimer;
        this.imageCache = imageCache;
        this.imageRepository = new ImageRepository(errorReporter, workContext);
        f0<b0> f0Var = new f0<>();
        this._refreshUi = f0Var;
        this.refreshUi = f0Var;
        f0<ChallengeAction> f0Var2 = new f0<>();
        this._submitClicked = f0Var2;
        this.submitClicked = f0Var2;
        f0<ChallengeResult> f0Var3 = new f0<>();
        this._shouldFinish = f0Var3;
        this.shouldFinish = f0Var3;
        f0<String> f0Var4 = new f0<>();
        this._challengeText = f0Var4;
        this.challengeText = f0Var4;
        OnInactiveAwareMutableLiveData<ChallengeRequestResult> onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData<>();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData<ChallengeResponseData> onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData<>();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        d11 = v20.k.d(q0.a(this), null, null, new AnonymousClass1(null), 3, null);
        this.transactionTimerJob = d11;
    }
}