package mw;

import android.os.Bundle;
import android.util.Log;
import com.facebook.react.modules.appstate.AppStateModule;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f39473n = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private String f39474a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39475b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39476c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39477d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39478e;

    /* renamed from: f  reason: collision with root package name */
    private final String f39479f;

    /* renamed from: g  reason: collision with root package name */
    private final String f39480g;

    /* renamed from: h  reason: collision with root package name */
    private final String f39481h;

    /* renamed from: i  reason: collision with root package name */
    private final String f39482i;

    /* renamed from: j  reason: collision with root package name */
    private final String f39483j;

    /* renamed from: k  reason: collision with root package name */
    private final String f39484k;

    /* renamed from: l  reason: collision with root package name */
    private final String f39485l;

    /* renamed from: m  reason: collision with root package name */
    private final long f39486m;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(String str) {
            if (str != null) {
                try {
                    return new JSONArray(str).getString(0);
                } catch (JSONException e11) {
                    Log.e("Notification", "Failed to parse notification args", e11);
                    return null;
                }
            }
            return null;
        }

        private final long b(String str) {
            Long valueOf = str == null ? null : Long.valueOf(Long.parseLong(str));
            return valueOf == null ? System.currentTimeMillis() / 1000 : valueOf.longValue();
        }

        private final int d(String str) {
            return (str == null || !s.c(str, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) ? 0 : 1;
        }

        public final e c(Bundle data, Boolean bool) {
            String str;
            s.g(data, "data");
            try {
                String string = data.getString("alert_args");
                String string2 = data.getString("alert_id");
                boolean parseBoolean = Boolean.parseBoolean(data.getString("delivery_confirmation"));
                String string3 = data.getString("product_type");
                String string4 = data.getString("product_subtype");
                String string5 = data.getString("product_id");
                String string6 = data.getString("view");
                String string7 = data.getString("override_string");
                int d11 = d(data.getString("priority"));
                String a11 = a(string);
                long b11 = b(data.getString("alert_time"));
                String string8 = data.getString("txid");
                if (bool == null) {
                    str = data.getString("app_state");
                    if (str == null) {
                        str = "unknown";
                    }
                } else {
                    str = bool.booleanValue() ? "active" : AppStateModule.APP_STATE_BACKGROUND;
                }
                return new e(string2, parseBoolean, string7, d11, string, a11, string8, string3, string4, string5, string6, str, b11);
            } catch (JSONException e11) {
                Log.e("Notification", "Failed to parse local Notification Json", e11);
                return null;
            }
        }
    }

    public e() {
        this(null, false, null, 0, null, null, null, null, null, null, null, null, 0L, 8191, null);
    }

    public e(String str, boolean z11, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String appState, long j11) {
        s.g(appState, "appState");
        this.f39474a = str;
        this.f39475b = z11;
        this.f39476c = str2;
        this.f39477d = i11;
        this.f39478e = str3;
        this.f39479f = str4;
        this.f39480g = str5;
        this.f39481h = str6;
        this.f39482i = str7;
        this.f39483j = str8;
        this.f39484k = str9;
        this.f39485l = appState;
        this.f39486m = j11;
    }

    public static final e a(Bundle bundle, Boolean bool) {
        return f39473n.c(bundle, bool);
    }

    public final boolean b() {
        return this.f39475b;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alert_id", this.f39474a);
            jSONObject.put("override_string", this.f39476c);
            jSONObject.put("delivery_confirmation", this.f39475b);
            jSONObject.put("product_type", this.f39481h);
            jSONObject.put("product_id", this.f39483j);
            jSONObject.put("priority", this.f39477d);
            jSONObject.put("alert_args", this.f39478e);
            jSONObject.put("txid", this.f39480g);
            jSONObject.put("alert_time", this.f39486m);
            jSONObject.put("app_state", this.f39485l);
            String str = this.f39484k;
            if (str != null) {
                jSONObject.put("view", str);
            }
            String str2 = this.f39482i;
            if (str2 != null) {
                jSONObject.put("product_subtype", str2);
            }
            return jSONObject;
        } catch (JSONException e11) {
            Log.e("Notification", "Failed to create JSON from notification", e11);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s.c(this.f39474a, eVar.f39474a) && this.f39475b == eVar.f39475b && s.c(this.f39476c, eVar.f39476c) && this.f39477d == eVar.f39477d && s.c(this.f39478e, eVar.f39478e) && s.c(this.f39479f, eVar.f39479f) && s.c(this.f39480g, eVar.f39480g) && s.c(this.f39481h, eVar.f39481h) && s.c(this.f39482i, eVar.f39482i) && s.c(this.f39483j, eVar.f39483j) && s.c(this.f39484k, eVar.f39484k) && s.c(this.f39485l, eVar.f39485l) && this.f39486m == eVar.f39486m;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f39474a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z11 = this.f39475b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        String str2 = this.f39476c;
        int hashCode2 = (((i12 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.f39477d)) * 31;
        String str3 = this.f39478e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39479f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39480g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39481h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f39482i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f39483j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f39484k;
        return ((((hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.f39485l.hashCode()) * 31) + Long.hashCode(this.f39486m);
    }

    public String toString() {
        String str = this.f39474a;
        boolean z11 = this.f39475b;
        String str2 = this.f39476c;
        int i11 = this.f39477d;
        String str3 = this.f39478e;
        String str4 = this.f39479f;
        String str5 = this.f39480g;
        String str6 = this.f39481h;
        String str7 = this.f39482i;
        String str8 = this.f39483j;
        String str9 = this.f39484k;
        String str10 = this.f39485l;
        long j11 = this.f39486m;
        return "NotificationData(alertId=" + str + ", deliveryConfirmation=" + z11 + ", overrideString=" + str2 + ", priority=" + i11 + ", alertArgs=" + str3 + ", carName=" + str4 + ", txid=" + str5 + ", productType=" + str6 + ", productSubtype=" + str7 + ", productId=" + str8 + ", view=" + str9 + ", appState=" + str10 + ", timestamp=" + j11 + ")";
    }

    public /* synthetic */ e(String str, boolean z11, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? null : str2, (i12 & 8) == 0 ? i11 : 0, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : str8, (i12 & 1024) == 0 ? str9 : null, (i12 & 2048) != 0 ? "unknown" : str10, (i12 & 4096) != 0 ? 0L : j11);
    }
}