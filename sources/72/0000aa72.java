package p8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public File f46395a;

    /* renamed from: b  reason: collision with root package name */
    public w8.a f46396b;

    public b(String str, w8.a aVar) {
        this.f46395a = null;
        this.f46396b = null;
        this.f46395a = new File(str);
        this.f46396b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        File file = this.f46395a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f46395a.isDirectory() && this.f46395a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f46395a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.f46396b.logCollect(a(x9.b.a(this.f46395a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i11 = 0; i11 < size; i11++) {
                new File(this.f46395a, (String) arrayList.get(i11)).delete();
            }
        }
    }

    public final void b() {
        new Thread(new c(this)).start();
    }
}