package com.plaid.core.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidWebview extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public a f18146a;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(ValueCallback<Uri[]> valueCallback);

        boolean b(String str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidWebview(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidWebview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidWebview(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final a getListener() {
        a aVar = this.f18146a;
        if (aVar != null) {
            return aVar;
        }
        s.x(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return null;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent event) {
        s.g(event, "event");
        if (event.getAction() == 0 && i11 == 4) {
            if (canGoBack()) {
                goBack();
                return true;
            }
            getListener().a();
            return true;
        }
        return super.onKeyDown(i11, event);
    }

    public final void setListener(a aVar) {
        s.g(aVar, "<set-?>");
        this.f18146a = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidWebview(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
    }
}