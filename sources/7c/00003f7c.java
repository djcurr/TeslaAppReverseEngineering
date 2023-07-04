package com.plaid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.Plaid;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.configuration.PlaidEnvironment;
import com.plaid.link.configuration.PlaidProduct;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkResultHandler;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0011\b\u0000\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J \u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0007J*\u0010&\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020%H\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/plaid/PlaidModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lorg/json/JSONObject;", "obj", "", PlaidModule.TOKEN, "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "getLinkTokenConfiguration", "logLevelString", "Lcom/plaid/link/configuration/LinkLogLevel;", "getLogLevel", PlaidModule.PUBLIC_KEY, "Lcom/plaid/link/configuration/LinkPublicKeyConfiguration;", "getLinkPublicKeyConfiguration", "fieldName", "maybeGetStringField", "", "maybeGetBooleanField", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "", "extrasMap", "Lvz/b0;", "maybePopulateExtrasMap", "getName", "initialize", "onCatalystInstanceDestroy", MessageExtension.FIELD_DATA, "Lcom/facebook/react/bridge/Callback;", "onSuccessCallback", "onExitCallback", "startLinkActivityForResult", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "onActivityResult", "intent", "onNewIntent", "Lcom/facebook/react/bridge/Callback;", "Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter$delegate", "Lvz/k;", "getJsonConverter", "()Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "react-native-plaid-link-sdk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PlaidModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String ACCOUNT_SUBTYPES = "accountSubtypes";
    private static final String CLIENT_NAME = "clientName";
    private static final String COUNTRY_CODES = "countryCodes";
    public static final Companion Companion = new Companion(null);
    private static final String ENV = "environment";
    private static final String EXTRAS = "extras";
    private static final String LANGUAGE = "language";
    private static final String LINK_CUSTOMIZATION_NAME = "linkCustomizationName";
    private static final String LINK_TOKEN_PREFIX = "link";
    private static final String LOG_LEVEL = "logLevel";
    private static final String NO_LOADING_STATE = "noLoadingState";
    private static final String PRODUCTS = "products";
    private static final String PUBLIC_KEY = "publicKey";
    private static final String SUBTYPE = "subtype";
    private static final String TOKEN = "token";
    private static final String TYPE = "type";
    private static final String USER_EMAIL = "userEmailAddress";
    private static final String USER_NAME = "userLegalName";
    private static final String USER_PHONE = "userPhoneNumber";
    private static final String WEBHOOK = "webhook";
    private final k jsonConverter$delegate;
    private Callback onExitCallback;
    private Callback onSuccessCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/plaid/PlaidModule$Companion;", "", "", "ACCOUNT_SUBTYPES", "Ljava/lang/String;", "CLIENT_NAME", "COUNTRY_CODES", "ENV", "EXTRAS", "LANGUAGE", "LINK_CUSTOMIZATION_NAME", "LINK_TOKEN_PREFIX", "LOG_LEVEL", "NO_LOADING_STATE", "PRODUCTS", "PUBLIC_KEY", "SUBTYPE", "TOKEN", "TYPE", "USER_EMAIL", "USER_NAME", "USER_PHONE", "WEBHOOK", "<init>", "()V", "react-native-plaid-link-sdk_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidModule(ReactApplicationContext reactContext) {
        super(reactContext);
        k a11;
        s.g(reactContext, "reactContext");
        a11 = m.a(PlaidModule$jsonConverter$2.INSTANCE);
        this.jsonConverter$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidJsonConverter getJsonConverter() {
        return (PlaidJsonConverter) this.jsonConverter$delegate.getValue();
    }

    private final LinkPublicKeyConfiguration getLinkPublicKeyConfiguration(JSONObject jSONObject, String str) {
        LinkLogLevel linkLogLevel;
        boolean u11;
        boolean u12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        maybePopulateExtrasMap(jSONObject, linkedHashMap);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(PRODUCTS);
        int length = jSONArray.length();
        int i11 = 0;
        if (length > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                String string = jSONArray.getString(i12);
                if (!TextUtils.isEmpty(string)) {
                    PlaidProduct[] values = PlaidProduct.values();
                    int length2 = values.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        PlaidProduct plaidProduct = values[i14];
                        i14++;
                        if (!arrayList.contains(plaidProduct)) {
                            u12 = v.u(plaidProduct.name(), string, true);
                            if (u12) {
                                arrayList.add(plaidProduct);
                            }
                        }
                    }
                }
                if (i13 >= length) {
                    break;
                }
                i12 = i13;
            }
        }
        if (jSONObject.has(LOG_LEVEL)) {
            String string2 = jSONObject.getString(LOG_LEVEL);
            s.f(string2, "obj.getString(LOG_LEVEL)");
            linkLogLevel = getLogLevel(string2);
        } else {
            linkLogLevel = LinkLogLevel.ASSERT;
        }
        LinkPublicKeyConfiguration.Builder publicKey = new LinkPublicKeyConfiguration.Builder().publicKey(str);
        String string3 = jSONObject.getString(CLIENT_NAME);
        s.f(string3, "obj.getString(CLIENT_NAME)");
        LinkPublicKeyConfiguration.Builder logLevel = publicKey.clientName(string3).products(arrayList).logLevel(linkLogLevel);
        if (jSONObject.has(ACCOUNT_SUBTYPES)) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray2 = jSONObject.getJSONArray(ACCOUNT_SUBTYPES);
            int length3 = jSONArray2.length();
            if (length3 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    Object obj = jSONArray2.get(i15);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj;
                    arrayList2.add(LinkAccountSubtype.Companion.convert(jSONObject2.getString(SUBTYPE), jSONObject2.getString("type")));
                    if (i16 >= length3) {
                        break;
                    }
                    i15 = i16;
                }
            }
            logLevel.setAccountSubtypes(arrayList2);
        }
        if (jSONObject.has(COUNTRY_CODES)) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray3 = jSONObject.getJSONArray(COUNTRY_CODES);
            int length4 = jSONArray3.length();
            if (length4 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    arrayList3.add(jSONArray3.getString(i17));
                    if (i18 >= length4) {
                        break;
                    }
                    i17 = i18;
                }
            }
            if (!arrayList3.isEmpty()) {
                logLevel.countryCodes(arrayList3);
            }
        }
        String maybeGetStringField = maybeGetStringField(jSONObject, LANGUAGE);
        if (maybeGetStringField != null) {
            logLevel.language(maybeGetStringField);
        }
        if (jSONObject.has(ENV) && !TextUtils.isEmpty(jSONObject.getString(ENV))) {
            PlaidEnvironment[] values2 = PlaidEnvironment.values();
            int length5 = values2.length;
            while (true) {
                if (i11 >= length5) {
                    break;
                }
                PlaidEnvironment plaidEnvironment = values2[i11];
                i11++;
                u11 = v.u(plaidEnvironment.name(), jSONObject.getString(ENV), true);
                if (u11) {
                    logLevel.environment(plaidEnvironment);
                    break;
                }
            }
        }
        String maybeGetStringField2 = maybeGetStringField(jSONObject, LINK_CUSTOMIZATION_NAME);
        if (maybeGetStringField2 != null) {
            logLevel.linkCustomizationName(maybeGetStringField2);
        }
        String maybeGetStringField3 = maybeGetStringField(jSONObject, TOKEN);
        if (maybeGetStringField3 != null) {
            logLevel.token(maybeGetStringField3);
        }
        String maybeGetStringField4 = maybeGetStringField(jSONObject, USER_EMAIL);
        if (maybeGetStringField4 != null) {
            logLevel.userEmailAddress(maybeGetStringField4);
        }
        String maybeGetStringField5 = maybeGetStringField(jSONObject, USER_NAME);
        if (maybeGetStringField5 != null) {
            logLevel.userLegalName(maybeGetStringField5);
        }
        String maybeGetStringField6 = maybeGetStringField(jSONObject, USER_PHONE);
        if (maybeGetStringField6 != null) {
            logLevel.userPhoneNumber(maybeGetStringField6);
        }
        String maybeGetStringField7 = maybeGetStringField(jSONObject, WEBHOOK);
        if (maybeGetStringField7 != null) {
            logLevel.webhook(maybeGetStringField7);
        }
        if (!linkedHashMap.isEmpty()) {
            logLevel.extraParams(linkedHashMap);
        }
        return logLevel.build();
    }

    private final LinkTokenConfiguration getLinkTokenConfiguration(JSONObject jSONObject, String str) {
        boolean H;
        LinkLogLevel linkLogLevel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        maybePopulateExtrasMap(jSONObject, linkedHashMap);
        if (str == null) {
            return null;
        }
        H = v.H(str, LINK_TOKEN_PREFIX, false, 2, null);
        if (H) {
            if (jSONObject.has(LOG_LEVEL)) {
                String string = jSONObject.getString(LOG_LEVEL);
                s.f(string, "obj.getString(LOG_LEVEL)");
                linkLogLevel = getLogLevel(string);
            } else {
                linkLogLevel = LinkLogLevel.ASSERT;
            }
            LinkTokenConfiguration.Builder noLoadingState = new LinkTokenConfiguration.Builder().token(str).logLevel(linkLogLevel).noLoadingState(false);
            Boolean maybeGetBooleanField = maybeGetBooleanField(jSONObject, NO_LOADING_STATE);
            if (maybeGetBooleanField != null) {
                noLoadingState.noLoadingState(maybeGetBooleanField.booleanValue());
            }
            if (!linkedHashMap.isEmpty()) {
                noLoadingState.extraParams(linkedHashMap);
            }
            return noLoadingState.build();
        }
        return null;
    }

    private final LinkLogLevel getLogLevel(String str) {
        LinkLogLevel linkLogLevel;
        boolean u11;
        LinkLogLevel[] values = LinkLogLevel.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                linkLogLevel = null;
                break;
            }
            linkLogLevel = values[i11];
            i11++;
            u11 = v.u(linkLogLevel.name(), str, true);
            if (u11) {
                break;
            }
        }
        return linkLogLevel == null ? LinkLogLevel.ASSERT : linkLogLevel;
    }

    private final Boolean maybeGetBooleanField(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    private final String maybeGetStringField(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || TextUtils.isEmpty(jSONObject.getString(str))) {
            return null;
        }
        return jSONObject.getString(str);
    }

    private final void maybePopulateExtrasMap(JSONObject jSONObject, Map<String, String> map) {
        if (!jSONObject.has(EXTRAS)) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(EXTRAS);
        int i11 = 0;
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i12 = i11 + 1;
            Object obj = jSONArray.get(i11);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject2.keys();
            s.f(keys, "extraObject.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                s.f(key, "key");
                String string = jSONObject2.getString(key);
                s.f(string, "extraObject.getString(key)");
                map.put(key, string);
            }
            if (i12 >= length) {
                return;
            }
            i11 = i12;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlaidAndroid";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        s.g(activity, "activity");
        if (new LinkResultHandler(new PlaidModule$onActivityResult$linkHandler$1(this), new PlaidModule$onActivityResult$linkHandler$2(this)).onActivityResult(i11, i12, intent)) {
            return;
        }
        Log.i("PlaidModule", "Result code not handled.");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s.g(intent, "intent");
    }

    @ReactMethod
    public final void startLinkActivityForResult(String data, Callback onSuccessCallback, Callback onExitCallback) {
        s.g(data, "data");
        s.g(onSuccessCallback, "onSuccessCallback");
        s.g(onExitCallback, "onExitCallback");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            this.onSuccessCallback = onSuccessCallback;
            this.onExitCallback = onExitCallback;
            try {
                Plaid.setLinkEventListener(new PlaidModule$startLinkActivityForResult$1(this));
                JSONObject jSONObject = new JSONObject(data);
                String maybeGetStringField = maybeGetStringField(jSONObject, PUBLIC_KEY);
                String maybeGetStringField2 = maybeGetStringField(jSONObject, TOKEN);
                if (maybeGetStringField == null && maybeGetStringField2 == null) {
                    throw new IllegalStateException("Token must be part of configuration.");
                }
                if (maybeGetStringField == null) {
                    LinkTokenConfiguration linkTokenConfiguration = getLinkTokenConfiguration(jSONObject, maybeGetStringField2);
                    if (linkTokenConfiguration != null) {
                        Context applicationContext = getReactApplicationContext().getApplicationContext();
                        if (applicationContext != null) {
                            Plaid.create((Application) applicationContext, linkTokenConfiguration).open(currentActivity);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                    }
                    throw new LinkException("Unable to open link, please check that your configuration is valid");
                }
                try {
                    Context applicationContext2 = getReactApplicationContext().getApplicationContext();
                    if (applicationContext2 != null) {
                        Plaid.create((Application) applicationContext2, getLinkPublicKeyConfiguration(jSONObject, maybeGetStringField)).open(currentActivity);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                } catch (Exception e11) {
                    Log.w("PlaidModule", "Public key provided but unable to open Link");
                    String message = e11.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Log.w("PlaidModule", message);
                    throw e11;
                }
            } catch (JSONException e12) {
                Log.e("PlaidModule", e12.toString());
                throw e12;
            }
        }
        throw new IllegalStateException("Current activity is null");
    }
}