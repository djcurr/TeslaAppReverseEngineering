package at;

import android.util.Log;
import expo.modules.contacts.EXColumns;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6727a;

    public h(JSONObject jSONObject) {
        this.f6727a = jSONObject;
    }

    public boolean a() {
        try {
            return this.f6727a.getJSONObject("vehicle_config").getBoolean("can_accept_navigation_requests");
        } catch (JSONException unused) {
            return true;
        }
    }

    public String b() {
        try {
            return this.f6727a.getString(EXColumns.DISPLAY_NAME);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int c() {
        try {
            return this.f6727a.getJSONObject("vehicle_config").getInt("key_version");
        } catch (JSONException e11) {
            Log.e("SharedVehicleData", "Failed to get key version", e11);
            return 1;
        }
    }

    public String d() {
        try {
            return this.f6727a.getString("id");
        } catch (JSONException unused) {
            return "0";
        }
    }

    public boolean e() {
        try {
            return this.f6727a.getBoolean("in_service");
        } catch (JSONException unused) {
            return false;
        }
    }

    public String f() {
        try {
            String string = this.f6727a.getJSONObject("vehicle_config").getString("car_type");
            if (string.equals("s") || string.equals("s2") || string.equals("x") || string.equals("3") || string.equals("")) {
                return "model" + string;
            }
            return string;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String g() {
        try {
            return this.f6727a.getString("vin");
        } catch (JSONException unused) {
            return null;
        }
    }

    public void h() {
        this.f6727a.remove("charge_state");
        this.f6727a.remove("climate_state");
        this.f6727a.remove("drive_state");
        this.f6727a.remove("gui_settings");
        this.f6727a.remove("vehicle_config");
        this.f6727a.remove("vehicle_state");
    }

    public void i(boolean z11) {
        this.f6727a.put("in_service", z11);
    }

    public String toString() {
        return this.f6727a.toString();
    }

    public h(String str) {
        this.f6727a = new JSONObject(str);
    }
}