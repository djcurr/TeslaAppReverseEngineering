package zl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f60496b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final dm.f f60497a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f60498a;

        a(String str) {
            this.f60498a = str;
            put("userId", str);
        }
    }

    public d(dm.f fVar) {
        this.f60497a = fVar;
    }

    private static Map<String, String> d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, j(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    private static String f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String i(String str) {
        return new a(str).toString();
    }

    private static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f60497a.n(str, "internal-keys");
    }

    public File b(String str) {
        return this.f60497a.n(str, "keys");
    }

    public File c(String str) {
        return this.f60497a.n(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> g(String str, boolean z11) {
        File a11 = z11 ? a(str) : b(str);
        if (!a11.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a11);
                try {
                    Map<String, String> d11 = d(com.google.firebase.crashlytics.internal.common.g.C(fileInputStream2));
                    com.google.firebase.crashlytics.internal.common.g.e(fileInputStream2, "Failed to close user metadata file.");
                    return d11;
                } catch (Exception e11) {
                    e = e11;
                    fileInputStream = fileInputStream2;
                    wl.f.f().e("Error deserializing user metadata.", e);
                    com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c11 = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c11.exists()) {
            wl.f.f().b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c11);
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.internal.common.g.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String e12 = e(com.google.firebase.crashlytics.internal.common.g.C(fileInputStream));
                wl.f.f().b("Loaded userId " + e12 + " for session " + str);
                com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
                return e12;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.internal.common.g.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            wl.f.f().e("Error deserializing user metadata.", e);
            com.google.firebase.crashlytics.internal.common.g.e(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void k(String str, Map<String, String> map, boolean z11) {
        File a11 = z11 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String f11 = f(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a11), f60496b));
                try {
                    bufferedWriter2.write(f11);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    wl.f.f().e("Error serializing key/value metadata.", e);
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void l(String str, String str2) {
        File c11 = c(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String i11 = i(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c11), f60496b));
                try {
                    bufferedWriter2.write(i11);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    wl.f.f().e("Error serializing user metadata.", e);
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.g.e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}