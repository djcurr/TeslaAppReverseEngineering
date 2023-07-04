package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class WXAPiSecurityHelper {
    private static final int MAX_STORE_KEY = 100;
    private static final int MAX_STORE_VALUE = 2048;
    private static final String SECURITY_KEY_TIMESTAMP_SECOND = "security_key_timestamp_second";
    private static final String STORE_VALUE_DATA = "security_key_resp";
    private static final String TAG = "MicroMsg.SDK.WXAPiSecurityHelper";
    private final Context context;
    private final CopyOnWriteArraySet<String> overtimeSyncReqSet = new CopyOnWriteArraySet<>();

    /* renamed from: sp  reason: collision with root package name */
    private final SharedPreferences f21366sp;

    /* loaded from: classes6.dex */
    private static class CheckRuleResult {
        public static final int NoPass = 2;
        public static final int Pass = 1;
        public static final int Unknown = 0;

        private CheckRuleResult() {
        }
    }

    /* loaded from: classes6.dex */
    public static class ExtraSecurityCheckRes {
        public static final int Directly_NoPass = 1;
        public static final int Directly_Pass = 0;
        public static final int Need_Deep_Check = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface IHttpCheckCallback {
        void onHttpCheckFinish(PromiseShareRule promiseShareRule);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface ISecurityCheck {
        void onCheckFinish(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface ISecuritySyncCheck {
        void onSyncCheckFinish(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class PassContext {
        String appid;
        String inputUrl;
        PromiseShareRule localRule;
        String reqSessionId;
        String version;

        private PassContext() {
            this.reqSessionId = "";
            this.appid = "";
            this.inputUrl = "";
            this.version = "";
            this.localRule = new PromiseShareRule();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class PromiseShareRule {
        String appidInRule;
        String buffer;
        public long nextRequestIntervalSecond;
        String orgJsonData;
        String reqAppid;
        int state;
        List<UrlRule> urlRuleList;
        long userWaitTimeMs;

        private PromiseShareRule() {
            this.orgJsonData = "";
            this.reqAppid = "";
            this.appidInRule = "";
            this.urlRuleList = new ArrayList();
            this.buffer = "";
        }

        public long getLegalReqInterval() {
            long j11 = this.nextRequestIntervalSecond;
            j11 = (j11 <= 0 || j11 >= 86400) ? 3600L : 3600L;
            Log.d(WXAPiSecurityHelper.TAG, "getLegalReqInterval = " + j11);
            return j11;
        }

        public long getLegalUserWaitTime() {
            long j11 = this.userWaitTimeMs;
            j11 = (j11 <= 100 || j11 >= 60000) ? 5000L : 5000L;
            Log.d(WXAPiSecurityHelper.TAG, "getLegalUserWaitTime = " + j11);
            return j11;
        }
    }

    /* loaded from: classes6.dex */
    private static class RuleState {
        public static final int InRule = 1;
        public static final int None = 0;
        public static final int NotInRule = 2;

        private RuleState() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class UrlRule {
        String host;
        List<String> mustQueryKey;

        private UrlRule() {
            this.host = "";
            this.mustQueryKey = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class WXSecurityData {
        String appid;
        long lastStoreTimeStampSecond;
        String respDataJson;

        private WXSecurityData() {
            this.appid = "";
            this.respDataJson = "";
        }

        public boolean isBasicParamsAllowed() {
            long j11 = this.lastStoreTimeStampSecond;
            return ((j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) > 0 && (j11 > (System.currentTimeMillis() / 1000) ? 1 : (j11 == (System.currentTimeMillis() / 1000) ? 0 : -1)) < 0) && (b.b(this.appid) ^ true) && (b.b(this.respDataJson) ^ true);
        }
    }

    public WXAPiSecurityHelper(Context context) {
        this.context = context;
        this.f21366sp = context.getSharedPreferences("__wx_opensdk_sp__", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkRuleCanPass(String str, PromiseShareRule promiseShareRule) {
        String str2;
        Log.d(TAG, "checkRuleCanPass, start check!");
        if (promiseShareRule.orgJsonData.length() > 2048) {
            Log.w(TAG, "response json is too long!");
            return 0;
        }
        int i11 = promiseShareRule.state;
        if (i11 == 2) {
            str2 = "checkRuleCanPass, not in rule";
        } else if (i11 != 1 || !promiseShareRule.appidInRule.equals(promiseShareRule.reqAppid)) {
            Log.d(TAG, "checkRuleCanPass, unknown");
            return 0;
        } else if (promiseShareRule.urlRuleList.size() == 0) {
            str2 = "checkRuleCanPass, urlRuleList empty!";
        } else {
            boolean checkUrlParametersLegal = checkUrlParametersLegal(str, promiseShareRule);
            Log.d(TAG, "checkRuleCanPass, urlCheckResult = " + checkUrlParametersLegal);
            if (!checkUrlParametersLegal) {
                Log.d(TAG, "checkRuleCanPass, no pass");
                return 2;
            }
            str2 = "checkRuleCanPass, pass";
        }
        Log.d(TAG, str2);
        return 1;
    }

    private boolean checkUrlParametersLegal(String str, PromiseShareRule promiseShareRule) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (b.b(host)) {
            Log.i(TAG, "checkUrlParameters, host empty!");
            return false;
        }
        for (int i11 = 0; i11 < promiseShareRule.urlRuleList.size(); i11++) {
            UrlRule urlRule = promiseShareRule.urlRuleList.get(i11);
            if (host.equals(urlRule.host)) {
                int i12 = 0;
                for (int i13 = 0; i13 < urlRule.mustQueryKey.size(); i13++) {
                    try {
                        String str2 = urlRule.mustQueryKey.get(i13);
                        Log.d(TAG, "checkRuleCanPass, key = " + str2);
                        if (!b.b(parse.getQueryParameter(str2))) {
                            i12++;
                        }
                    } catch (Exception e11) {
                        Log.e(TAG, "checkRuleCanPass, parse fail, e = %s" + e11.getMessage());
                    }
                }
                boolean z11 = i12 == urlRule.mustQueryKey.size();
                Log.d(TAG, "checkRuleCanPass, rule.host = " + urlRule.host + ", queryOk = " + z11);
                return z11;
            }
        }
        return false;
    }

    private void doRequest(final PassContext passContext, final IHttpCheckCallback iHttpCheckCallback) {
        b.f21369b.submit(new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.6
            @Override // java.lang.Runnable
            public void run() {
                WXAPiSecurityHelper wXAPiSecurityHelper = WXAPiSecurityHelper.this;
                PassContext passContext2 = passContext;
                iHttpCheckCallback.onHttpCheckFinish(WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, wXAPiSecurityHelper.postHttpRequest(passContext2.appid, passContext2.version, passContext2.localRule.buffer).toString()));
            }
        });
    }

    private void doRequestAsync(PassContext passContext) {
        Log.d(TAG, "doRequestAsync");
        doRequest(passContext, new IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.3
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    private void doRequestSync(final PassContext passContext, final ISecuritySyncCheck iSecuritySyncCheck) {
        Log.i(TAG, "requestId = " + passContext.reqSessionId);
        final Timer timer = new Timer(passContext.reqSessionId);
        timer.schedule(new TimerTask() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Log.i(WXAPiSecurityHelper.TAG, "sync request overtime, requestId = " + passContext.reqSessionId);
                WXAPiSecurityHelper.this.overtimeSyncReqSet.add(passContext.reqSessionId);
                ISecuritySyncCheck iSecuritySyncCheck2 = iSecuritySyncCheck;
                if (iSecuritySyncCheck2 != null) {
                    iSecuritySyncCheck2.onSyncCheckFinish(true);
                }
            }
        }, passContext.localRule.getLegalUserWaitTime());
        doRequest(passContext, new IHttpCheckCallback() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.5
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.IHttpCheckCallback
            public void onHttpCheckFinish(PromiseShareRule promiseShareRule) {
                timer.cancel();
                if (WXAPiSecurityHelper.this.overtimeSyncReqSet.contains(passContext.reqSessionId)) {
                    WXAPiSecurityHelper.this.overtimeSyncReqSet.remove(passContext.reqSessionId);
                } else if (iSecuritySyncCheck != null) {
                    int checkRuleCanPass = WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, promiseShareRule);
                    if (checkRuleCanPass == 1) {
                        iSecuritySyncCheck.onSyncCheckFinish(true);
                    } else if (checkRuleCanPass == 2) {
                        iSecuritySyncCheck.onSyncCheckFinish(false);
                    } else {
                        iSecuritySyncCheck.onSyncCheckFinish(WXAPiSecurityHelper.this.checkRuleCanPass(passContext.inputUrl, WXAPiSecurityHelper.this.convert2ShareRule(passContext.appid, WXAPiSecurityHelper.this.getStoredData(passContext.appid).respDataJson)) != 2);
                    }
                }
                WXAPiSecurityHelper.this.storeIfNecessary(promiseShareRule);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void extraSecurityCheckDoCallback(final ISecurityCheck iSecurityCheck, final boolean z11) {
        if (iSecurityCheck != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    Log.d(WXAPiSecurityHelper.TAG, "has got result, callback on Main Thread.");
                    iSecurityCheck.onCheckFinish(z11);
                }
            });
        }
    }

    private String getStoreKey(String str) {
        return "security_key_appid_" + str;
    }

    private void storeCheckResp(String str, PromiseShareRule promiseShareRule) {
        String cookStoreJson = cookStoreJson(str, promiseShareRule);
        Log.d(TAG, "cookStoreJson = " + cookStoreJson);
        if (b.b(cookStoreJson)) {
            Log.w(TAG, "cookStoreJson get null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SECURITY_KEY_TIMESTAMP_SECOND, System.currentTimeMillis() / 1000);
            jSONObject.put(STORE_VALUE_DATA, cookStoreJson);
            commitSp(str, jSONObject.toString());
        } catch (Exception e11) {
            Log.e(TAG, "storeCheckResp fail, ex = " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeIfNecessary(PromiseShareRule promiseShareRule) {
        String str;
        Log.d(TAG, "storeIfNecessary");
        if (b.b(promiseShareRule.reqAppid) || promiseShareRule.reqAppid.length() > 100) {
            str = "store fail! reqAppid illegal!";
        } else if (!b.b(promiseShareRule.orgJsonData) && promiseShareRule.orgJsonData.length() <= 2048) {
            if (promiseShareRule.state == 1 && promiseShareRule.reqAppid.equals(promiseShareRule.appidInRule)) {
                Log.d(TAG, "storeIfNecessary, in rule");
                storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
            }
            if (promiseShareRule.state == 2) {
                Log.d(TAG, "storeIfNecessary, not rule");
                storeCheckResp(promiseShareRule.reqAppid, promiseShareRule);
                return;
            }
            return;
        } else {
            str = "store fail! response json illegal!";
        }
        Log.i(TAG, str);
    }

    protected void commitSp(String str, String str2) {
        SharedPreferences.Editor edit = this.f21366sp.edit();
        edit.putString(getStoreKey(str), str2);
        edit.commit();
    }

    protected PromiseShareRule convert2ShareRule(String str, String str2) {
        PromiseShareRule promiseShareRule = new PromiseShareRule();
        promiseShareRule.reqAppid = str;
        promiseShareRule.orgJsonData = str2;
        if (b.b(str2)) {
            Log.d(TAG, "convert2ShareRule: jsonRespData is empty");
            return promiseShareRule;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            promiseShareRule.state = jSONObject.optInt("state", 0);
            promiseShareRule.appidInRule = jSONObject.optString("appid_rule", "");
            promiseShareRule.userWaitTimeMs = jSONObject.optLong("wait_time", 0L);
            promiseShareRule.nextRequestIntervalSecond = jSONObject.optLong("interval", 0L);
            promiseShareRule.buffer = jSONObject.optString("buffer", "");
            JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    UrlRule urlRule = new UrlRule();
                    urlRule.host = jSONObject2.optString("host");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("querys");
                    if (optJSONArray2 != null) {
                        for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                            if (!b.b(optJSONArray2.optString(i12, ""))) {
                                urlRule.mustQueryKey.add(optJSONArray2.optString(i12, ""));
                            }
                        }
                    }
                    promiseShareRule.urlRuleList.add(urlRule);
                }
            }
        } catch (Exception e11) {
            Log.e(TAG, "coverJson2ShareRule fail, ex = " + e11.getMessage());
        }
        return promiseShareRule;
    }

    protected String cookStoreJson(String str, PromiseShareRule promiseShareRule) {
        String covertShareRule2Json;
        if (promiseShareRule != null && !b.b(str)) {
            try {
                int i11 = promiseShareRule.state;
                if (i11 == 2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", promiseShareRule.state);
                    jSONObject.put("interval", promiseShareRule.getLegalReqInterval());
                    jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
                    covertShareRule2Json = jSONObject.toString();
                } else if (i11 != 1) {
                    return "";
                } else {
                    covertShareRule2Json = covertShareRule2Json(promiseShareRule);
                }
                return covertShareRule2Json;
            } catch (Exception e11) {
                Log.e(TAG, "storeCheckResp fail, ex = " + e11.getMessage());
            }
        }
        return "";
    }

    protected String covertShareRule2Json(PromiseShareRule promiseShareRule) {
        if (promiseShareRule == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", promiseShareRule.state);
            jSONObject.put("appid_rule", promiseShareRule.appidInRule);
            jSONObject.put("wait_time", promiseShareRule.userWaitTimeMs);
            jSONObject.put("interval", promiseShareRule.nextRequestIntervalSecond);
            jSONObject.put("buffer", promiseShareRule.buffer.length() > 64 ? "" : promiseShareRule.buffer);
            JSONArray jSONArray = new JSONArray();
            for (UrlRule urlRule : promiseShareRule.urlRuleList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("host", urlRule.host);
                jSONObject2.put("querys", new JSONArray((Collection) urlRule.mustQueryKey));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rules", jSONArray);
            return jSONObject.toString();
        } catch (Exception e11) {
            Log.e(TAG, "covertShareRule2Json fail, ex = " + e11.getMessage());
            return "";
        }
    }

    public int doExtraSecurityCheck(String str, String str2, String str3, final ISecurityCheck iSecurityCheck) {
        Log.i(TAG, "doExtraSecurityCheck: start!");
        if (b.b(str) || b.b(str3)) {
            Log.e(TAG, "doExtraSecurityCheck: appid or inputurl is empty!");
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        PassContext passContext = new PassContext();
        passContext.reqSessionId = String.format("%s", currentTimeMillis + "" + new Random().nextInt(9999));
        passContext.appid = str;
        passContext.inputUrl = str3;
        passContext.version = str2;
        WXSecurityData storedData = getStoredData(str);
        if (this.context.getPackageManager().checkPermission("android.permission.INTERNET", this.context.getPackageName()) != 0) {
            Log.w(TAG, "doExtraSecurityCheck: No Internet permission!");
            return 0;
        } else if (!storedData.isBasicParamsAllowed()) {
            Log.d(TAG, "doExtraSecurityCheck: local data illegal!");
            doRequestAsync(passContext);
            return 0;
        } else {
            PromiseShareRule convert2ShareRule = convert2ShareRule(passContext.appid, storedData.respDataJson);
            passContext.localRule = convert2ShareRule;
            boolean z11 = (storedData.lastStoreTimeStampSecond + convert2ShareRule.getLegalReqInterval()) * 1000 < System.currentTimeMillis();
            Log.d(TAG, "doExtraSecurityCheck: needDoNextReq: " + z11 + ", last req time stamp:" + storedData.lastStoreTimeStampSecond);
            if (!z11) {
                int checkRuleCanPass = checkRuleCanPass(passContext.inputUrl, passContext.localRule);
                Log.d(TAG, "doExtraSecurityCheck: no needDoNextReq, read local rule: " + checkRuleCanPass);
                return checkRuleCanPass == 2 ? 1 : 0;
            }
            Log.d(TAG, "doExtraSecurityCheck: needDoNextReq, state: " + passContext.localRule.state);
            if (passContext.localRule.state != 1) {
                doRequestAsync(passContext);
                return 0;
            }
            doRequestSync(passContext, new ISecuritySyncCheck() { // from class: com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.1
                @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecuritySyncCheck
                public void onSyncCheckFinish(boolean z12) {
                    WXAPiSecurityHelper.this.extraSecurityCheckDoCallback(iSecurityCheck, z12);
                }
            });
            return 2;
        }
    }

    public String extractMayNeedDoSecurityCheckUrl(String str, BaseReq baseReq) {
        if (baseReq.getType() != 2) {
            return "";
        }
        SendMessageToWX.Req req = (SendMessageToWX.Req) baseReq;
        if (req.message.getType() != 5) {
            return "";
        }
        WXWebpageObject wXWebpageObject = (WXWebpageObject) req.message.mediaObject;
        if (b.b(wXWebpageObject.webpageUrl)) {
            Log.i(TAG, "webpageUrl empty, don't need check.");
            return "";
        }
        Log.i(TAG, "need check.");
        return wXWebpageObject.webpageUrl;
    }

    protected String getLocalStoredJson(String str) {
        return getStoredData(str).respDataJson;
    }

    protected WXSecurityData getStoredData(String str) {
        String str2;
        WXSecurityData wXSecurityData = new WXSecurityData();
        Log.d(TAG, "getStoredData, appid = " + str);
        try {
            if (this.f21366sp.contains(getStoreKey(str))) {
                JSONObject jSONObject = new JSONObject(this.f21366sp.getString(getStoreKey(str), ""));
                long optLong = jSONObject.optLong(SECURITY_KEY_TIMESTAMP_SECOND);
                String optString = jSONObject.optString(STORE_VALUE_DATA);
                wXSecurityData.appid = str;
                wXSecurityData.lastStoreTimeStampSecond = optLong;
                wXSecurityData.respDataJson = optString;
                str2 = "getStoredData, Ok, appid = " + str + "timeStampSecond: " + wXSecurityData.lastStoreTimeStampSecond;
            } else {
                str2 = "getStoredData, fail, not exist!";
            }
            Log.d(TAG, str2);
        } catch (Exception e11) {
            Log.e(TAG, "getStoredData fail, ex = " + e11.getMessage());
        }
        return wXSecurityData;
    }

    protected StringBuffer postHttpRequest(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            String encode2 = URLEncoder.encode(str3, "UTF-8");
            String format = String.format("https://mp.weixin.qq.com/publicpoc/opensdkconf?action=GetShareConf&appid=%s&sdkVersion=%s&buffer=%s", encode, str2, encode2);
            Log.d(TAG, "request http, url = " + format + ", appid = " + encode + ", version = " + str2 + ", buffer = " + encode2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(format).openConnection()));
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, "application/json");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            Log.i(TAG, "http respCode = " + responseCode);
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                Log.d(TAG, "http response = " + ((Object) stringBuffer));
                bufferedReader.close();
            }
            httpURLConnection.disconnect();
        } catch (Exception e11) {
            Log.e(TAG, "http request fail, ex = " + e11.getMessage());
        }
        return stringBuffer;
    }
}