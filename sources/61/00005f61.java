package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.k;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import js.b;
import js.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import wz.r0;
import wz.s0;
import yu.f;
import yu.y;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0014\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J0\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007Jq\u0010+\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010\t\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010,Jg\u0010.\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010\t\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007¢\u0006\u0004\b.\u0010/Ji\u00100\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010\t\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006<"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/OwnerApiModuleNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", CMSAttributeTableGenerator.CONTENT_TYPE, "getFileExtension", "Lcom/tesla/data/oapi/k;", "Lcom/facebook/react/bridge/WritableMap;", "toWritableMap", "Lokhttp3/Headers;", OwnerApiModuleNativeModule.KEY_HEADERS, "convertHeadersToMap", "Lorg/json/JSONObject;", "jsonObject", "convertJsonToMap", "Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/react/bridge/WritableArray;", "convertJsonToArray", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "getBaseUrl", "authorizationCode", "codeVerifier", "issuer", "", "useEngAuth", "result", "requestAccessToken", "revokeAccessToken", "getAccessToken", "uri", "method", "requiresAuth", "Lcom/facebook/react/bridge/ReadableMap;", "urlParams", MessageExtension.FIELD_DATA, "params", "", "timeout", "disableCompression", "retryCount", "sendRequest", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Integer;ZILcom/facebook/react/bridge/Promise;)V", "path", "downloadFile", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Integer;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "uploadFiles", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Integer;ZLcom/facebook/react/bridge/Promise;)V", "Ljs/b;", "getAuthRepository", "()Ljs/b;", "authRepository", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OwnerApiModuleNativeModule extends ReactContextBaseJavaModule {
    private static final String KEY_ERROR = "error";
    private static final String KEY_HEADERS = "headers";
    private static final String KEY_RESPONSE = "response";
    private static final String KEY_STATUS_CODE = "status_code";
    public static final a Companion = new a(null);
    private static final String TAG = "OwnerApiModuleNativeModule";
    private static final byte[] BUFFER = new byte[PKIFailureInfo.certRevoked];

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerApiModuleNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public static /* synthetic */ void a(OwnerApiModuleNativeModule ownerApiModuleNativeModule) {
        m562revokeAccessToken$lambda5(ownerApiModuleNativeModule);
    }

    public static /* synthetic */ void b(Promise promise, Throwable th2) {
        m561requestAccessToken$lambda4(promise, th2);
    }

    public static /* synthetic */ void c(Promise promise, Throwable th2) {
        m564revokeAccessToken$lambda7(promise, th2);
    }

    private final WritableMap convertHeadersToMap(Headers headers) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (headers != null) {
            Iterator<vz.p<? extends String, ? extends String>> it2 = headers.iterator();
            while (it2.hasNext()) {
                vz.p<? extends String, ? extends String> next = it2.next();
                writableNativeMap.putString(next.a(), next.b());
            }
        }
        return writableNativeMap;
    }

    private final WritableArray convertJsonToArray(JSONArray jSONArray) {
        Map f11;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jSONArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object obj = jSONArray.get(i11);
                kotlin.jvm.internal.s.f(obj, "jsonArray.get(index)");
                if (obj instanceof JSONObject) {
                    writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
                } else if (obj instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeArray.pushInt(((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    writableNativeArray.pushDouble(((Number) obj).longValue());
                } else if (obj instanceof Float) {
                    writableNativeArray.pushDouble(((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    writableNativeArray.pushDouble(((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeArray.pushString((String) obj);
                } else if (kotlin.jvm.internal.s.c(obj, JSONObject.NULL) ? true : kotlin.jvm.internal.s.c(obj, Boolean.valueOf(jSONArray.isNull(i11)))) {
                    writableNativeArray.pushNull();
                } else {
                    String str = "Parse error: Unknown value type at index " + i11 + " => " + jSONArray.get(i11);
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    ht.a aVar = ht.a.f29422a;
                    f11 = r0.f(vz.v.a("[OwnerAPIModule]", str));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : f11.entrySet()) {
                        ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(str));
                    TeslaLog.setTag$default(teslaLog, "[OwnerAPIModule]", false, 2, null);
                    n80.a.a(str, new Object[0]);
                }
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        return writableNativeArray;
    }

    private final WritableMap convertJsonToMap(JSONObject jSONObject) {
        Map f11;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                writableNativeMap.putDouble(next, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                writableNativeMap.putDouble(next, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else if (kotlin.jvm.internal.s.c(obj, JSONObject.NULL) ? true : kotlin.jvm.internal.s.c(obj, Boolean.valueOf(jSONObject.isNull(next)))) {
                writableNativeMap.putNull(next);
            } else {
                String str = "Parse error: Unknown value type for key " + next;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(vz.v.a("[OwnerAPIModule]", str));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(str));
                TeslaLog.setTag$default(teslaLog, "[OwnerAPIModule]", false, 2, null);
                n80.a.a(str, new Object[0]);
            }
        }
        return writableNativeMap;
    }

    public static /* synthetic */ void d(Promise promise, Throwable th2) {
        m556downloadFile$lambda25(promise, th2);
    }

    /* renamed from: downloadFile$lambda-24 */
    public static final void m555downloadFile$lambda24(String path, OwnerApiModuleNativeModule this$0, Promise result, retrofit2.s response) {
        kotlin.jvm.internal.s.g(path, "$path");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(result, "$result");
        ResponseBody responseBody = (ResponseBody) response.a();
        InputStream byteStream = responseBody == null ? null : responseBody.byteStream();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                String fileExtension = this$0.getFileExtension(response.e().get("content-type"));
                Path path2 = Paths.get(path + fileExtension, new String[0]);
                kotlin.jvm.internal.s.f(path2, "get(\n              \"$pat…t-type\"])}\"\n            )");
                Files.copy(byteStream, path2, StandardCopyOption.REPLACE_EXISTING);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("filePath", path2.toUri().getPath());
                k.a aVar = com.tesla.data.oapi.k.f21782k;
                kotlin.jvm.internal.s.f(response, "response");
                WritableMap writableMap = this$0.toWritableMap(aVar.b(response));
                writableMap.putMap(KEY_RESPONSE, writableNativeMap);
                vz.b0 b0Var = vz.b0.f54756a;
                result.resolve(writableMap);
            } else {
                String fileExtension2 = this$0.getFileExtension(response.e().get("content-type"));
                FileOutputStream fileOutputStream = new FileOutputStream(new File(path + fileExtension2));
                while (true) {
                    kotlin.jvm.internal.s.e(byteStream);
                    byte[] bArr = BUFFER;
                    int read = byteStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                vz.b0 b0Var2 = vz.b0.f54756a;
                e00.b.a(fileOutputStream, null);
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                String fileExtension3 = this$0.getFileExtension(response.e().get("content-type"));
                writableNativeMap2.putString("filePath", path + fileExtension3);
                k.a aVar2 = com.tesla.data.oapi.k.f21782k;
                kotlin.jvm.internal.s.f(response, "response");
                WritableMap writableMap2 = this$0.toWritableMap(aVar2.b(response));
                writableMap2.putMap(KEY_RESPONSE, writableNativeMap2);
                result.resolve(writableMap2);
            }
            if (byteStream != null) {
                try {
                    byteStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th2) {
            if (byteStream != null) {
                try {
                    byteStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: downloadFile$lambda-25 */
    public static final void m556downloadFile$lambda25(Promise result, Throwable th2) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.reject(th2);
    }

    public static /* synthetic */ WritableMap e(OwnerApiModuleNativeModule ownerApiModuleNativeModule, com.tesla.data.oapi.k kVar) {
        return m568uploadFiles$lambda28(ownerApiModuleNativeModule, kVar);
    }

    public static /* synthetic */ void f(Promise promise, Throwable th2) {
        m558getAccessToken$lambda9(promise, th2);
    }

    public static /* synthetic */ void g(Promise promise, WritableNativeMap writableNativeMap) {
        m560requestAccessToken$lambda3(promise, writableNativeMap);
    }

    /* renamed from: getAccessToken$lambda-8 */
    public static final void m557getAccessToken$lambda8(Promise promise, js.k kVar) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        if (kVar instanceof k.d) {
            promise.resolve(((k.d) kVar).a());
        } else if (kVar instanceof k.b) {
            promise.resolve(((k.b) kVar).a());
        } else if (kVar instanceof k.a) {
            promise.reject(((k.a) kVar).a());
        } else if (kVar instanceof k.c) {
            promise.reject(((k.c) kVar).a());
        }
    }

    /* renamed from: getAccessToken$lambda-9 */
    public static final void m558getAccessToken$lambda9(Promise promise, Throwable th2) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        promise.reject(th2);
    }

    private final js.b getAuthRepository() {
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        return yu.j.a(applicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0026, code lost:
        if (r4.equals("image/jpg") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0066, code lost:
        if (r4.equals("image/jpeg") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0068, code lost:
        return ".jpg";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getFileExtension(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L6b
            int r0 = r4.hashCode()
            switch(r0) {
                case -1487394660: goto L60;
                case -1487103447: goto L55;
                case -1487018032: goto L4a;
                case -1248334925: goto L3f;
                case -879272239: goto L34;
                case -879267568: goto L29;
                case -879264467: goto L20;
                case -879258763: goto L15;
                case -227171396: goto La;
                default: goto L9;
            }
        L9:
            goto L6b
        La:
            java.lang.String r0 = "image/svg+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".svg"
            goto L6a
        L15:
            java.lang.String r0 = "image/png"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".png"
            goto L6a
        L20:
            java.lang.String r0 = "image/jpg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            goto L68
        L29:
            java.lang.String r0 = "image/gif"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".gif"
            goto L6a
        L34:
            java.lang.String r0 = "image/bmp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".bmp"
            goto L6a
        L3f:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".pdf"
            goto L6a
        L4a:
            java.lang.String r0 = "image/webp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".webp"
            goto L6a
        L55:
            java.lang.String r0 = "image/tiff"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
            java.lang.String r4 = ".tif"
            goto L6a
        L60:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6b
        L68:
            java.lang.String r4 = ".jpg"
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Content Type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " of file did not match supported file extensions"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.TeslaV4.reactnative.module.OwnerApiModuleNativeModule.getFileExtension(java.lang.String):java.lang.String");
    }

    static /* synthetic */ String getFileExtension$default(OwnerApiModuleNativeModule ownerApiModuleNativeModule, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return ownerApiModuleNativeModule.getFileExtension(str);
    }

    public static /* synthetic */ void h(Promise promise, Throwable th2) {
        m570uploadFiles$lambda30(promise, th2);
    }

    public static /* synthetic */ void i(Promise promise, WritableMap writableMap) {
        m566sendRequest$lambda14(promise, writableMap);
    }

    public static /* synthetic */ void j(Promise promise, Throwable th2) {
        m567sendRequest$lambda15(promise, th2);
    }

    public static /* synthetic */ void k(Promise promise, js.k kVar) {
        m557getAccessToken$lambda8(promise, kVar);
    }

    public static /* synthetic */ WritableNativeMap l(vz.p pVar) {
        return m559requestAccessToken$lambda2(pVar);
    }

    public static /* synthetic */ void m(Promise promise, com.tesla.data.oapi.k kVar) {
        m563revokeAccessToken$lambda6(promise, kVar);
    }

    public static /* synthetic */ void n(String str, OwnerApiModuleNativeModule ownerApiModuleNativeModule, Promise promise, retrofit2.s sVar) {
        m555downloadFile$lambda24(str, ownerApiModuleNativeModule, promise, sVar);
    }

    public static /* synthetic */ WritableMap o(OwnerApiModuleNativeModule ownerApiModuleNativeModule, com.tesla.data.oapi.k kVar) {
        return m565sendRequest$lambda13(ownerApiModuleNativeModule, kVar);
    }

    public static /* synthetic */ void p(Promise promise, WritableMap writableMap) {
        m569uploadFiles$lambda29(promise, writableMap);
    }

    /* renamed from: requestAccessToken$lambda-2 */
    public static final WritableNativeMap m559requestAccessToken$lambda2(vz.p pVar) {
        zu.c0 c0Var = (zu.c0) pVar.a();
        int intValue = ((Number) pVar.b()).intValue();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(KEY_STATUS_CODE, intValue);
        boolean z11 = false;
        if (200 <= intValue && intValue <= 300) {
            z11 = true;
        }
        if (z11) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("token", (String) c0Var.b());
            vz.b0 b0Var = vz.b0.f54756a;
            writableNativeMap.putMap(KEY_RESPONSE, writableNativeMap2);
        }
        return writableNativeMap;
    }

    /* renamed from: requestAccessToken$lambda-3 */
    public static final void m560requestAccessToken$lambda3(Promise result, WritableNativeMap writableNativeMap) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.resolve(writableNativeMap);
    }

    /* renamed from: requestAccessToken$lambda-4 */
    public static final void m561requestAccessToken$lambda4(Promise result, Throwable th2) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.reject(th2);
    }

    /* renamed from: revokeAccessToken$lambda-5 */
    public static final void m562revokeAccessToken$lambda5(OwnerApiModuleNativeModule this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.getAuthRepository().e();
    }

    /* renamed from: revokeAccessToken$lambda-6 */
    public static final void m563revokeAccessToken$lambda6(Promise result, com.tesla.data.oapi.k kVar) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.resolve(Boolean.valueOf(kVar.i()));
    }

    /* renamed from: revokeAccessToken$lambda-7 */
    public static final void m564revokeAccessToken$lambda7(Promise result, Throwable th2) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.reject(th2);
    }

    /* renamed from: sendRequest$lambda-13 */
    public static final WritableMap m565sendRequest$lambda13(OwnerApiModuleNativeModule this$0, com.tesla.data.oapi.k it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(it2, "it");
        return this$0.toWritableMap(it2);
    }

    /* renamed from: sendRequest$lambda-14 */
    public static final void m566sendRequest$lambda14(Promise result, WritableMap writableMap) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.resolve(writableMap);
    }

    /* renamed from: sendRequest$lambda-15 */
    public static final void m567sendRequest$lambda15(Promise result, Throwable th2) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.reject(th2);
    }

    private final WritableMap toWritableMap(com.tesla.data.oapi.k kVar) {
        boolean w11;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(KEY_STATUS_CODE, kVar.a());
        writableNativeMap.putMap(KEY_HEADERS, convertHeadersToMap(kVar.d()));
        try {
            JSONObject e11 = kVar.e();
            if (e11 != null) {
                WritableMap convertJsonToMap = convertJsonToMap(e11);
                String c11 = kVar.c();
                boolean z11 = false;
                if (c11 != null) {
                    w11 = kotlin.text.v.w(c11);
                    if (!w11) {
                        z11 = true;
                    }
                }
                if (z11) {
                    convertJsonToMap.putString(KEY_ERROR, kVar.c());
                }
                writableNativeMap.putMap(KEY_RESPONSE, convertJsonToMap);
            }
        } catch (JSONException e12) {
            TeslaLog.INSTANCE.e(TAG, "Error converting JSON to native map", e12);
        }
        return writableNativeMap;
    }

    /* renamed from: uploadFiles$lambda-28 */
    public static final WritableMap m568uploadFiles$lambda28(OwnerApiModuleNativeModule this$0, com.tesla.data.oapi.k it2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(it2, "it");
        return this$0.toWritableMap(it2);
    }

    /* renamed from: uploadFiles$lambda-29 */
    public static final void m569uploadFiles$lambda29(Promise result, WritableMap writableMap) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.resolve(writableMap);
    }

    /* renamed from: uploadFiles$lambda-30 */
    public static final void m570uploadFiles$lambda30(Promise result, Throwable th2) {
        kotlin.jvm.internal.s.g(result, "$result");
        result.reject(th2);
    }

    @ReactMethod
    public final void downloadFile(String uri, String method, boolean z11, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, Integer num, final String path, boolean z12, final Promise result) {
        HashMap<String, Object> hashMap;
        LinkedHashMap linkedHashMap;
        int e11;
        kotlin.jvm.internal.s.g(uri, "uri");
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(result, "result");
        y.a aVar = yu.y.f59842h;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        yu.y a11 = aVar.a(applicationContext);
        HashMap<String, Object> hashMap2 = readableMap == null ? null : readableMap.toHashMap();
        HashMap<String, Object> hashMap3 = readableMap2 == null ? null : readableMap2.toHashMap();
        if (readableMap3 == null || (hashMap = readableMap3.toHashMap()) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            e11 = r0.e(linkedHashMap2.size());
            linkedHashMap = new LinkedHashMap(e11);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        a11.p(uri, hashMap2, hashMap3, linkedHashMap, num, z11, z12).p(gy.b.c()).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.i
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.n(path, this, result, (retrofit2.s) obj);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.t
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.d(result, (Throwable) obj);
            }
        });
    }

    @ReactMethod
    public final void getAccessToken(final Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        b.a.a(getAuthRepository(), null, false, 2, null).p(gy.b.c()).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.p
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.k(promise, (js.k) obj);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.u
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.f(promise, (Throwable) obj);
            }
        });
    }

    @ReactMethod
    public final void getBaseUrl(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        promise.resolve(yu.a0.f59768c.c());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OwnerAPIModule";
    }

    @ReactMethod
    public final void requestAccessToken(String authorizationCode, String codeVerifier, String issuer, boolean z11, final Promise result) {
        kotlin.jvm.internal.s.g(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.s.g(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.s.g(issuer, "issuer");
        kotlin.jvm.internal.s.g(result, "result");
        getAuthRepository().c(authorizationCode, codeVerifier, issuer).o(new ky.h() { // from class: com.tesla.TeslaV4.reactnative.module.l
            @Override // ky.h
            public final Object apply(Object obj) {
                return OwnerApiModuleNativeModule.l((vz.p) obj);
            }
        }).p(gy.b.c()).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.o
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.g(Promise.this, (WritableNativeMap) obj);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.r
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.b(result, (Throwable) obj);
            }
        });
    }

    @ReactMethod
    public final void revokeAccessToken(final Promise result) {
        Map l11;
        kotlin.jvm.internal.s.g(result, "result");
        String issuer = getAuthRepository().getIssuer();
        String d11 = getAuthRepository().d();
        if (d11 == null) {
            d11 = "";
        }
        y.a aVar = yu.y.f59842h;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        l11 = s0.l(vz.v.a("id_token_hint", d11), vz.v.a("post_logout_redirect_uri", BuildConfig.AUTH_REDIRECT_URI));
        f.a.c(aVar.a(applicationContext), HttpMethodType.GET, issuer + "/logout", null, new LinkedHashMap(), l11, null, null, false, false, 484, null).p(gy.b.c()).h(new ky.a() { // from class: com.tesla.TeslaV4.reactnative.module.f
            {
                OwnerApiModuleNativeModule.this = this;
            }

            @Override // ky.a
            public final void run() {
                OwnerApiModuleNativeModule.a(OwnerApiModuleNativeModule.this);
            }
        }).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.q
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.m(Promise.this, (com.tesla.data.oapi.k) obj);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.s
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.c(result, (Throwable) obj);
            }
        });
    }

    @ReactMethod
    public final void sendRequest(String uri, String method, boolean z11, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, ReadableMap readableMap4, Integer num, boolean z12, int i11, final Promise result) {
        HashMap<String, Object> hashMap;
        LinkedHashMap linkedHashMap;
        int e11;
        kotlin.jvm.internal.s.g(uri, "uri");
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(result, "result");
        y.a aVar = yu.y.f59842h;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        yu.y a11 = aVar.a(applicationContext);
        HashMap<String, Object> hashMap2 = readableMap == null ? null : readableMap.toHashMap();
        JSONObject c11 = readableMap2 == null ? null : zu.t.c(readableMap2);
        HashMap<String, Object> hashMap3 = readableMap3 == null ? null : readableMap3.toHashMap();
        if (readableMap4 == null || (hashMap = readableMap4.toHashMap()) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            e11 = r0.e(linkedHashMap2.size());
            linkedHashMap = new LinkedHashMap(e11);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        a11.c(method, uri, hashMap2, c11, hashMap3, linkedHashMap, num, z11, z12).o(new ky.h() { // from class: com.tesla.TeslaV4.reactnative.module.k
            @Override // ky.h
            public final Object apply(Object obj) {
                return OwnerApiModuleNativeModule.o(OwnerApiModuleNativeModule.this, (com.tesla.data.oapi.k) obj);
            }
        }).p(gy.b.c()).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.m
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.i(result, (WritableMap) obj);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.h
            @Override // ky.f
            public final void accept(Object obj) {
                OwnerApiModuleNativeModule.j(result, (Throwable) obj);
            }
        });
    }

    @ReactMethod
    public final void uploadFiles(String uri, String method, boolean z11, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, ReadableMap readableMap4, Integer num, boolean z12, final Promise result) {
        HashMap<String, Object> hashMap;
        LinkedHashMap linkedHashMap;
        int e11;
        kotlin.jvm.internal.s.g(uri, "uri");
        kotlin.jvm.internal.s.g(method, "method");
        kotlin.jvm.internal.s.g(result, "result");
        HashMap<String, Object> hashMap2 = readableMap2 == null ? null : readableMap2.toHashMap();
        Object obj = hashMap2 == null ? null : hashMap2.get("uri");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = hashMap2 == null ? null : hashMap2.get("name");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = hashMap2 == null ? null : hashMap2.get("mimeType");
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
        MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData(Action.FILE_ATTRIBUTE, str2, RequestBody.Companion.create(new File(str), MediaType.Companion.get((String) obj3)));
        y.a aVar = yu.y.f59842h;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        yu.y a11 = aVar.a(applicationContext);
        HashMap<String, Object> hashMap3 = readableMap == null ? null : readableMap.toHashMap();
        HashMap<String, Object> hashMap4 = readableMap3 == null ? null : readableMap3.toHashMap();
        if (readableMap4 == null || (hashMap = readableMap4.toHashMap()) == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            e11 = r0.e(linkedHashMap2.size());
            linkedHashMap = new LinkedHashMap(e11);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        }
        a11.D(uri, hashMap3, createFormData, hashMap4, linkedHashMap, num, z11, z12).o(new ky.h() { // from class: com.tesla.TeslaV4.reactnative.module.j
            @Override // ky.h
            public final Object apply(Object obj4) {
                return OwnerApiModuleNativeModule.e(OwnerApiModuleNativeModule.this, (com.tesla.data.oapi.k) obj4);
            }
        }).p(gy.b.c()).u(new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.n
            @Override // ky.f
            public final void accept(Object obj4) {
                OwnerApiModuleNativeModule.p(result, (WritableMap) obj4);
            }
        }, new ky.f() { // from class: com.tesla.TeslaV4.reactnative.module.g
            @Override // ky.f
            public final void accept(Object obj4) {
                OwnerApiModuleNativeModule.h(result, (Throwable) obj4);
            }
        });
    }
}