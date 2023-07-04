package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final Date f17105f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f17106a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f17107b;

    /* renamed from: c  reason: collision with root package name */
    private Date f17108c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f17109d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f17110e;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f17111a;

        /* renamed from: b  reason: collision with root package name */
        private Date f17112b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f17113c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f17114d;

        public e a() {
            return new e(this.f17111a, this.f17112b, this.f17113c, this.f17114d);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f17111a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f17113c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f17112b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f17114d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private b() {
            this.f17111a = new JSONObject();
            this.f17112b = e.f17105f;
            this.f17113c = new JSONArray();
            this.f17114d = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f17109d;
    }

    public JSONObject d() {
        return this.f17107b;
    }

    public Date e() {
        return this.f17108c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f17106a.toString().equals(((e) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f17110e;
    }

    public int hashCode() {
        return this.f17106a.hashCode();
    }

    public String toString() {
        return this.f17106a.toString();
    }

    private e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f17107b = jSONObject;
        this.f17108c = date;
        this.f17109d = jSONArray;
        this.f17110e = jSONObject2;
        this.f17106a = jSONObject3;
    }
}