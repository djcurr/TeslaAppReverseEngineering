package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, n> f17154c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f17155a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17156b;

    private n(Context context, String str) {
        this.f17155a = context;
        this.f17156b = str;
    }

    public static synchronized n c(Context context, String str) {
        n nVar;
        synchronized (n.class) {
            Map<String, n> map = f17154c;
            if (!map.containsKey(str)) {
                map.put(str, new n(context, str));
            }
            nVar = map.get(str);
        }
        return nVar;
    }

    public synchronized Void a() {
        this.f17155a.deleteFile(this.f17156b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f17156b;
    }

    public synchronized e d() {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f17155a.openFileInput(this.f17156b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            e b11 = e.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b11;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th2;
        }
    }

    public synchronized Void e(e eVar) {
        FileOutputStream openFileOutput = this.f17155a.openFileOutput(this.f17156b, 0);
        openFileOutput.write(eVar.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}