package v9;

import a9.d;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;
import t9.m;
import v9.e;

/* loaded from: classes.dex */
public class d extends v9.c implements e.f, e.g, e.h {

    /* renamed from: c  reason: collision with root package name */
    public boolean f54381c;

    /* renamed from: d  reason: collision with root package name */
    public String f54382d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54383e;

    /* renamed from: f  reason: collision with root package name */
    public final r9.a f54384f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f54385g;

    /* renamed from: h  reason: collision with root package name */
    public v9.e f54386h;

    /* renamed from: i  reason: collision with root package name */
    public v9.f f54387i;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f54379a.finish();
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v9.e f54389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v9.e eVar) {
            super(null);
            this.f54389a = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f54389a.c();
            d.this.f54383e = false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v9.e f54391a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f54392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v9.e eVar, String str) {
            super(null);
            this.f54391a = eVar;
            this.f54392b = str;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.f54391a);
            d.this.f54386h.f(this.f54392b);
            d.this.f54383e = false;
        }
    }

    /* renamed from: v9.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC1224d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f54394a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f54395b;

        /* renamed from: v9.d$d$a */
        /* loaded from: classes.dex */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                RunnableC1224d.this.f54395b.cancel();
                c9.a.h(d.this.f54384f, "net", "SSLDenied", "2");
                a9.b.c(a9.b.a());
                RunnableC1224d.this.f54394a.finish();
            }
        }

        public RunnableC1224d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f54394a = activity;
            this.f54395b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            v9.b.b(this.f54394a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<v9.e> f54398a;

        /* renamed from: b  reason: collision with root package name */
        public final String f54399b;

        /* renamed from: c  reason: collision with root package name */
        public final String f54400c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f54401d = false;

        public f(v9.e eVar, String str, String str2, JSONObject jSONObject) {
            this.f54398a = new WeakReference<>(eVar);
            this.f54399b = str;
            this.f54400c = str2;
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }

        public void b(JSONObject jSONObject) {
            v9.e eVar;
            if (this.f54401d || (eVar = (v9.e) m.f(this.f54398a)) == null) {
                return;
            }
            this.f54401d = true;
            eVar.f(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f54400c), a(jSONObject.toString())));
        }
    }

    /* loaded from: classes.dex */
    public static class g implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final f f54402a;

        /* renamed from: b  reason: collision with root package name */
        public final String f54403b;

        public g(f fVar, String str) {
            this.f54402a = fVar;
            this.f54403b = str;
        }

        @Override // a9.d.a
        public void a(boolean z11, JSONObject jSONObject, String str) {
            try {
                this.f54402a.b(new JSONObject().put("success", z11).put("random", this.f54403b).put(PaymentMethodOptionsParams.Blik.PARAM_CODE, jSONObject).put(PermissionsResponse.STATUS_KEY, str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, r9.a aVar, String str) {
        super(activity, str);
        this.f54381c = true;
        this.f54382d = "GET";
        this.f54383e = false;
        this.f54386h = null;
        this.f54387i = new v9.f();
        this.f54384f = aVar;
        A();
    }

    private synchronized boolean A() {
        try {
            v9.e eVar = new v9.e(this.f54379a, this.f54384f, new e.C1226e(!l(), !l()));
            this.f54386h = eVar;
            eVar.setChromeProxy(this);
            this.f54386h.setWebClientProxy(this);
            this.f54386h.setWebEventProxy(this);
            addView(this.f54386h);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    private void B() {
        v9.e eVar = this.f54386h;
        if (eVar != null) {
            eVar.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    private synchronized void C() {
        WebView webView = this.f54386h.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            v9.f fVar = this.f54387i;
            if (fVar != null && !fVar.c()) {
                y();
            } else {
                s(false);
            }
        }
    }

    private synchronized void q(String str, String str2, String str3) {
        v9.e eVar = this.f54386h;
        if (eVar == null) {
            return;
        }
        JSONObject Y = m.Y(str3);
        f fVar = new f(eVar, str, str2, Y);
        Context context = eVar.getContext();
        String str4 = fVar.f54399b;
        char c11 = 65535;
        switch (str4.hashCode()) {
            case -1785164386:
                if (str4.equals("canUseTaoLogin")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -552487705:
                if (str4.equals("taoLogin")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 3015911:
                if (str4.equals("back")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3127582:
                if (str4.equals("exit")) {
                    c11 = 3;
                    break;
                }
                break;
            case 110371416:
                if (str4.equals(MessageBundle.TITLE_ENTRY)) {
                    c11 = 0;
                    break;
                }
                break;
            case 1085444827:
                if (str4.equals("refresh")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1703426986:
                if (str4.equals("pushWindow")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1906413305:
                if (str4.equals("backButton")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1947723784:
                if (str4.equals("sdkInfo")) {
                    c11 = 7;
                    break;
                }
                break;
            case 2033767917:
                if (str4.equals("refreshButton")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                if (Y.has(MessageBundle.TITLE_ENTRY)) {
                    eVar.getTitle().setText(Y.optString(MessageBundle.TITLE_ENTRY, ""));
                    break;
                }
                break;
            case 1:
                eVar.getWebView().reload();
                break;
            case 2:
                C();
                break;
            case 3:
                a9.b.c(Y.optString("result", null));
                s(Y.optBoolean("success", false));
                break;
            case 4:
                eVar.getBackButton().setVisibility(Y.optBoolean("show", true) ? 0 : 4);
                break;
            case 5:
                eVar.getRefreshButton().setVisibility(Y.optBoolean("show", true) ? 0 : 4);
                break;
            case 6:
                w(Y.optString("url"), Y.optString(MessageBundle.TITLE_ENTRY, ""));
                break;
            case 7:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "15.8.14");
                jSONObject.put(AnalyticsFields.APP_NAME, this.f54384f.h());
                jSONObject.put(AnalyticsFields.APP_VERSION, this.f54384f.m());
                fVar.b(jSONObject);
                break;
            case '\b':
                String url = eVar.getUrl();
                if (!m.y(this.f54384f, url)) {
                    c9.a.h(this.f54384f, "biz", "jsUrlErr", url);
                    break;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    boolean c12 = a9.d.c(this.f54384f, context);
                    jSONObject2.put("enabled", c12);
                    c9.a.c(this.f54384f, "biz", "TbChk", String.valueOf(c12));
                    fVar.b(jSONObject2);
                    break;
                }
            case '\t':
                String url2 = eVar.getUrl();
                if (!m.y(this.f54384f, url2)) {
                    c9.a.h(this.f54384f, "biz", "jsUrlErr", url2);
                    break;
                } else {
                    String optString = Y.optString("random");
                    JSONObject optJSONObject = Y.optJSONObject("options");
                    if (!TextUtils.isEmpty("random") && optJSONObject != null) {
                        String optString2 = optJSONObject.optString("url");
                        String optString3 = optJSONObject.optString("action");
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && (context instanceof Activity)) {
                            a9.d.b(this.f54384f, (Activity) context, 1010, optString2, optString3, new g(fVar, optString));
                            break;
                        }
                    }
                }
                break;
        }
    }

    private synchronized void s(boolean z11) {
        a9.b.d(z11);
        this.f54379a.finish();
    }

    private synchronized void v(String str) {
        Map<String, String> F = m.F(this.f54384f, str);
        if (str.startsWith("callNativeFunc")) {
            q(F.get("func"), F.get("cbId"), F.get(MessageExtension.FIELD_DATA));
        } else if (str.startsWith("onBack")) {
            C();
        } else if (str.startsWith("setTitle") && F.containsKey(MessageBundle.TITLE_ENTRY)) {
            this.f54386h.getTitle().setText(F.get(MessageBundle.TITLE_ENTRY));
        } else if (str.startsWith("onRefresh")) {
            this.f54386h.getWebView().reload();
        } else if (str.startsWith("showBackButton") && F.containsKey("bshow")) {
            this.f54386h.getBackButton().setVisibility(TextUtils.equals("true", F.get("bshow")) ? 0 : 4);
        } else if (str.startsWith("onExit")) {
            a9.b.c(F.get("result"));
            s(TextUtils.equals("true", F.get("bsucc")));
        } else if (str.startsWith("onLoadJs")) {
            this.f54386h.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    private synchronized boolean w(String str, String str2) {
        v9.e eVar = this.f54386h;
        try {
            v9.e eVar2 = new v9.e(this.f54379a, this.f54384f, new e.C1226e(!l(), !l()));
            this.f54386h = eVar2;
            eVar2.setChromeProxy(this);
            this.f54386h.setWebClientProxy(this);
            this.f54386h.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f54386h.getTitle().setText(str2);
            }
            this.f54383e = true;
            this.f54387i.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.f54386h.setAnimation(translateAnimation);
            addView(this.f54386h);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    private synchronized boolean y() {
        if (this.f54387i.c()) {
            this.f54379a.finish();
        } else {
            this.f54383e = true;
            v9.e eVar = this.f54386h;
            this.f54386h = this.f54387i.d();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(eVar));
            eVar.setAnimation(translateAnimation);
            removeView(eVar);
            addView(this.f54386h);
        }
        return true;
    }

    private synchronized void z() {
        Activity activity = this.f54379a;
        v9.e eVar = this.f54386h;
        if (activity != null && eVar != null) {
            if (this.f54381c) {
                activity.finish();
            } else {
                eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    @Override // v9.e.g
    public synchronized boolean a(v9.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f54379a;
        if (activity == null) {
            return true;
        }
        r9.a aVar = this.f54384f;
        c9.a.h(aVar, "net", "SSLError", "2-" + sslError);
        activity.runOnUiThread(new RunnableC1224d(activity, sslErrorHandler));
        return true;
    }

    @Override // v9.e.g
    public synchronized boolean b(v9.e eVar, String str) {
        r9.a aVar = this.f54384f;
        c9.a.c(aVar, "biz", "h5ldd", SystemClock.elapsedRealtime() + "|" + m.b0(str));
        B();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // v9.e.g
    public synchronized boolean c(v9.e eVar, int i11, String str, String str2) {
        this.f54385g = true;
        r9.a aVar = this.f54384f;
        c9.a.h(aVar, "net", "webError", "onReceivedError:" + i11 + "|" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // v9.e.g
    public synchronized boolean d(v9.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.f54379a;
        if (activity == null) {
            return true;
        }
        if (m.z(this.f54384f, str, activity)) {
            return true;
        }
        if (str.startsWith("alipayjsbridge://")) {
            v(str.substring(17));
        } else if (TextUtils.equals(str, "sdklite://h5quit")) {
            s(false);
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent);
        } else {
            this.f54386h.f(str);
        }
        return true;
    }

    @Override // v9.e.g
    public synchronized boolean e(v9.e eVar, String str) {
        r9.a aVar = this.f54384f;
        c9.a.c(aVar, "biz", "h5ld", SystemClock.elapsedRealtime() + "|" + m.b0(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            B();
        }
        return false;
    }

    @Override // v9.e.f
    public synchronized void f(v9.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.f54386h.getTitle().setText(str);
        }
    }

    @Override // v9.e.h
    public synchronized void g(v9.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // v9.e.h
    public synchronized void h(v9.e eVar) {
        z();
    }

    @Override // v9.e.f
    public synchronized boolean i(v9.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
            this.f54379a.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // v9.c
    public synchronized boolean m() {
        Activity activity = this.f54379a;
        if (activity == null) {
            return true;
        }
        if (l()) {
            v9.e eVar = this.f54386h;
            if (eVar != null && eVar.getWebView() != null) {
                if (eVar.getWebView().canGoBack()) {
                    if (x()) {
                        a9.c b11 = a9.c.b(a9.c.NETWORK_ERROR.b());
                        a9.b.c(a9.b.b(b11.b(), b11.a(), ""));
                        activity.finish();
                    }
                } else {
                    a9.b.c(a9.b.a());
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        }
        if (!this.f54383e) {
            z();
        }
        return true;
    }

    @Override // v9.c
    public synchronized void n() {
        this.f54386h.c();
        this.f54387i.a();
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f54383e ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void p(String str) {
        if ("POST".equals(this.f54382d)) {
            this.f54386h.g(str, null);
        } else {
            this.f54386h.f(str);
        }
        v9.c.j(this.f54386h.getWebView());
    }

    public synchronized void r(String str, String str2, boolean z11) {
        this.f54382d = str2;
        this.f54386h.getTitle().setText(str);
        this.f54381c = z11;
    }

    public boolean x() {
        return this.f54385g;
    }
}