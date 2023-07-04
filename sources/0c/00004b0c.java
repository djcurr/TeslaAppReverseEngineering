package com.stripe.android;

import com.stripe.android.core.model.StripeModel;

/* loaded from: classes2.dex */
public interface ApiResultCallback<ResultType extends StripeModel> {
    void onError(Exception exc);

    void onSuccess(ResultType resulttype);
}