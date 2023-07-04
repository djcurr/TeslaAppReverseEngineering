package com.plaid.link;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.plaid.internal.link.LinkActivity;
import com.plaid.internal.r5;
import com.plaid.internal.wa;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import f.a;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class OpenPlaidLink extends a<LinkTokenConfiguration, LinkResult> {
    @Override // f.a
    public Intent createIntent(Context context, LinkTokenConfiguration linkConfiguration) {
        s.g(context, "context");
        s.g(linkConfiguration, "linkConfiguration");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Plaid.create((Application) applicationContext, linkConfiguration);
        return linkConfiguration.getNoLoadingState() ? LinkActivity.f18987c.b(context) : LinkActivity.f18987c.a(context);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public LinkResult parseResult(int i11, Intent intent) {
        LinkResult linkExit;
        LinkError fromException$link_sdk_release;
        LinkError fromException$link_sdk_release2;
        if (intent == null) {
            wa.a aVar = wa.f19678a;
            wa.a.b(aVar, s.p("Null result returned ", Integer.valueOf(i11)), false, 2);
            LinkException linkException = new LinkException("No result returned.");
            if (linkException instanceof r5) {
                wa.a.a(aVar, (Throwable) linkException, false, 2);
                fromException$link_sdk_release2 = LinkError.Companion.fromException$link_sdk_release(new LinkException("Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists"));
            } else {
                fromException$link_sdk_release2 = LinkError.Companion.fromException$link_sdk_release(linkException);
            }
            return new LinkExit(fromException$link_sdk_release2, null, 2, null);
        }
        try {
            if (i11 == 96171) {
                linkExit = (LinkSuccess) intent.getParcelableExtra("link_result");
                s.e(linkExit);
            } else {
                linkExit = (LinkExit) intent.getParcelableExtra("link_result");
                s.e(linkExit);
            }
        } catch (Throwable th2) {
            wa.a aVar2 = wa.f19678a;
            wa.a.a(aVar2, th2, s.p("Invalid result returned ", Integer.valueOf(i11)), false, 4);
            LinkException linkException2 = new LinkException("Invalid result returned, please ensure you aren't using 3364 as a request code to open other activities");
            if (linkException2 instanceof r5) {
                wa.a.a(aVar2, (Throwable) linkException2, false, 2);
                fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(new LinkException("Link has exited unexpectedly please report this to support via https://dashboard.plaid.com/support with the session id if it persists"));
            } else {
                fromException$link_sdk_release = LinkError.Companion.fromException$link_sdk_release(linkException2);
            }
            linkExit = new LinkExit(fromException$link_sdk_release, null, 2, null);
        }
        return linkExit;
    }
}