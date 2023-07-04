package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import f.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetForTokenContract extends a<FinancialConnectionsSheetActivityArgs.ForToken, FinancialConnectionsSheetForTokenResult> {
    private final FinancialConnectionsSheetForTokenResult toExposedResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        FinancialConnectionsSheetForTokenResult completed;
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            return FinancialConnectionsSheetForTokenResult.Canceled.INSTANCE;
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            completed = new FinancialConnectionsSheetForTokenResult.Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).getError());
        } else if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
            FinancialConnectionsSheetActivityResult.Completed completed2 = (FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult;
            FinancialConnectionsSession financialConnectionsSession = completed2.getFinancialConnectionsSession();
            Token token = completed2.getToken();
            if (token != null) {
                completed = new FinancialConnectionsSheetForTokenResult.Completed(financialConnectionsSession, token);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return completed;
    }

    @Override // f.a
    public Intent createIntent(Context context, FinancialConnectionsSheetActivityArgs.ForToken input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent(context, FinancialConnectionsSheetActivity.class).putExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS, input);
        s.f(putExtra, "Intent(context, Financia…          input\n        )");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public FinancialConnectionsSheetForTokenResult parseResult(int i11, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult = null;
        if (intent != null && (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra(FinancialConnectionsSheetActivityResult.EXTRA_RESULT)) != null) {
            financialConnectionsSheetForTokenResult = toExposedResult(financialConnectionsSheetActivityResult);
        }
        return financialConnectionsSheetForTokenResult == null ? new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : financialConnectionsSheetForTokenResult;
    }
}