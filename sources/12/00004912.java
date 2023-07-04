package com.plaid.link.result;

import android.content.Intent;
import com.plaid.link.OpenPlaidLink;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public class LinkResultHandler {
    private final l<LinkExit, b0> onExit;
    private final l<LinkSuccess, b0> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkResultHandler(l<? super LinkSuccess, b0> onSuccess, l<? super LinkExit, b0> onExit) {
        s.g(onSuccess, "onSuccess");
        s.g(onExit, "onExit");
        this.onSuccess = onSuccess;
        this.onExit = onExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 3364) {
            LinkResult parseResult = new OpenPlaidLink().parseResult(i12, intent);
            if (parseResult instanceof LinkSuccess) {
                this.onSuccess.invoke(parseResult);
                return true;
            } else if (parseResult instanceof LinkExit) {
                this.onExit.invoke(parseResult);
                return true;
            } else {
                return true;
            }
        }
        return false;
    }
}