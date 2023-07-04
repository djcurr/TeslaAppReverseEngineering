package mw;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    protected Bundle f39472a;

    public d(Bundle bundle) {
        this.f39472a = bundle;
    }

    public String a() {
        return this.f39472a.getString("channelId");
    }

    public String b() {
        return this.f39472a.getString("description");
    }

    public boolean c() {
        return this.f39472a.getBoolean("enableLights");
    }

    public boolean d() {
        return this.f39472a.getBoolean("enableVibration");
    }

    public String e() {
        return this.f39472a.getString("groupId");
    }

    public int f() {
        return (int) this.f39472a.getDouble("importance");
    }

    public String g() {
        return this.f39472a.getString("lightColor");
    }

    public String h() {
        return this.f39472a.getString("name");
    }

    public boolean i() {
        return this.f39472a.getBoolean("showBadge");
    }

    public String j() {
        return this.f39472a.getString("soundFile");
    }

    public List k() {
        return this.f39472a.getParcelableArrayList("vibrationPattern");
    }

    public boolean l() {
        return this.f39472a.containsKey("description");
    }

    public boolean m() {
        return this.f39472a.containsKey("enableLights");
    }

    public boolean n() {
        return this.f39472a.containsKey("enableVibration");
    }

    public boolean o() {
        return this.f39472a.containsKey("groupId");
    }

    public boolean p() {
        return this.f39472a.containsKey("lightColor");
    }

    public boolean q() {
        return this.f39472a.containsKey("showBadge");
    }

    public boolean r() {
        return this.f39472a.containsKey("soundFile");
    }

    public boolean s() {
        return this.f39472a.containsKey("vibrationPattern");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(1024);
        for (String str : this.f39472a.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(this.f39472a.get(str));
            sb2.append(", ");
        }
        return sb2.toString();
    }
}