package fm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f26677a;

    public a(dm.f fVar) {
        this.f26677a = fVar.d("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f26677a;
    }

    public JSONObject b() {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        wl.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a11 = a();
                if (a11.exists()) {
                    fileInputStream = new FileInputStream(a11);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.g.C(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e = e11;
                        wl.f.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    wl.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.internal.common.g.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                com.google.firebase.crashlytics.internal.common.g.e(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            com.google.firebase.crashlytics.internal.common.g.e(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j11, JSONObject jSONObject) {
        wl.f.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j11);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.g.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e11) {
                    e = e11;
                    fileWriter = fileWriter2;
                    wl.f.f().e("Failed to cache settings", e);
                    com.google.firebase.crashlytics.internal.common.g.e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.internal.common.g.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}