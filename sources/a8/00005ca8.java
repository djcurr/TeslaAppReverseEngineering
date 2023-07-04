package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.c;
import com.stripe.android.R;
import com.stripe.android.core.Logger;

/* loaded from: classes6.dex */
public final class PaymentAuthWebChromeClient extends WebChromeClient {
    private final Activity activity;
    private final Logger logger;

    public PaymentAuthWebChromeClient(Activity activity, Logger logger) {
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(logger, "logger");
        this.activity = activity;
        this.logger = logger;
    }

    public static /* synthetic */ void a(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        m529onJsConfirm$lambda1(jsResult, dialogInterface, i11);
    }

    public static /* synthetic */ void b(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        m528onJsConfirm$lambda0(jsResult, dialogInterface, i11);
    }

    /* renamed from: onJsConfirm$lambda-0 */
    public static final void m528onJsConfirm$lambda0(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        if (jsResult == null) {
            return;
        }
        jsResult.confirm();
    }

    /* renamed from: onJsConfirm$lambda-1 */
    public static final void m529onJsConfirm$lambda1(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        if (jsResult == null) {
            return;
        }
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message;
        if (consoleMessage != null && (message = consoleMessage.message()) != null) {
            this.logger.debug(message);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        new c.a(this.activity, R.style.AlertDialogStyle).e(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PaymentAuthWebChromeClient.b(jsResult, dialogInterface, i11);
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PaymentAuthWebChromeClient.a(jsResult, dialogInterface, i11);
            }
        }).create().show();
        return true;
    }
}