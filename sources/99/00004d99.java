package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import f.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetForDataContract extends a<FinancialConnectionsSheetActivityArgs.ForData, FinancialConnectionsSheetResult> {
    private final FinancialConnectionsSheetResult toExposedResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        FinancialConnectionsSheetResult completed;
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            return FinancialConnectionsSheetResult.Canceled.INSTANCE;
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            completed = new FinancialConnectionsSheetResult.Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).getError());
        } else if (!(financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        } else {
            completed = new FinancialConnectionsSheetResult.Completed(((FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult).getFinancialConnectionsSession());
        }
        return completed;
    }

    @Override // f.a
    public Intent createIntent(Context context, FinancialConnectionsSheetActivityArgs.ForData input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent(context, FinancialConnectionsSheetActivity.class).putExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS, input);
        s.f(putExtra, "Intent(context, Financia…          input\n        )");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public FinancialConnectionsSheetResult parseResult(int i11, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        FinancialConnectionsSheetResult financialConnectionsSheetResult = null;
        if (intent != null && (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra(FinancialConnectionsSheetActivityResult.EXTRA_RESULT)) != null) {
            financialConnectionsSheetResult = toExposedResult(financialConnectionsSheetActivityResult);
        }
        return financialConnectionsSheetResult == null ? new FinancialConnectionsSheetResult.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : financialConnectionsSheetResult;
    }
}