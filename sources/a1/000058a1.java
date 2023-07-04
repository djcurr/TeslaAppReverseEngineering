package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.i;
import vz.b0;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultTransactionTimer implements TransactionTimer {
    private final ChallengeRequestData creqData;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final u<Boolean> mutableTimeoutFlow;
    private final h0<Boolean> timeout;
    private final long timeoutMillis;
    private final g workContext;

    public DefaultTransactionTimer(int i11, ErrorRequestExecutor errorRequestExecutor, ChallengeRequestData creqData, g workContext) {
        s.g(errorRequestExecutor, "errorRequestExecutor");
        s.g(creqData, "creqData");
        s.g(workContext, "workContext");
        this.errorRequestExecutor = errorRequestExecutor;
        this.creqData = creqData;
        this.workContext = workContext;
        this.timeoutMillis = TimeUnit.MINUTES.toMillis(i11);
        u<Boolean> a11 = j0.a(Boolean.FALSE);
        this.mutableTimeoutFlow = a11;
        this.timeout = a11;
    }

    private final ErrorData createTimeoutErrorData() {
        String threeDsServerTransId = this.creqData.getThreeDsServerTransId();
        String acsTransId = this.creqData.getAcsTransId();
        ProtocolError protocolError = ProtocolError.TransactionTimedout;
        return new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Timeout expiry reached for the transaction", null, this.creqData.getMessageVersion(), this.creqData.getSdkTransId(), 132, null);
    }

    public final void onTimeout$3ds2sdk_release() {
        this.errorRequestExecutor.executeAsync(createTimeoutErrorData());
        this.mutableTimeoutFlow.setValue(Boolean.TRUE);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public Object start(d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(this.workContext, new DefaultTransactionTimer$start$2(this, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public h0<Boolean> getTimeout() {
        return this.timeout;
    }
}