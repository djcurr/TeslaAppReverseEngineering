package p5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    protected final ReactApplicationContext f46200a;

    /* renamed from: b  reason: collision with root package name */
    protected Intent f46201b;

    /* renamed from: c  reason: collision with root package name */
    protected String f46202c = "Share";

    /* renamed from: d  reason: collision with root package name */
    protected o5.d f46203d;

    /* renamed from: e  reason: collision with root package name */
    protected ReadableMap f46204e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<HashMap<String, String>> {
        a(m mVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
            return hashMap.get("simpleName").compareTo(hashMap2.get("simpleName"));
        }
    }

    public m(ReactApplicationContext reactApplicationContext) {
        this.f46200a = reactApplicationContext;
        o(new Intent("android.intent.action.SEND"));
        g().setType("text/plain");
    }

    private ComponentName[] d(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(g().getAction());
        intent.setType(g().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.f46200a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean k(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean l(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String p(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    public Intent a(Intent intent, ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.f46200a.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && !readableMap.getArray("excludedActivityTypes").toString().contains(resolveInfo.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(this.f46200a.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new a(this));
                for (HashMap hashMap2 : arrayList2) {
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get("packageName"));
                    intent3.setClassName((String) hashMap2.get("packageName"), (String) hashMap2.get("className"));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), "share");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, "Share");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected o5.d e(ReadableMap readableMap) {
        String string = k("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean bool = Boolean.FALSE;
        if (k("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (k("type", readableMap)) {
            return new o5.d(readableMap.getString("url"), readableMap.getString("type"), string, bool2, this.f46200a);
        }
        return new o5.d(readableMap.getString("url"), string, bool2, this.f46200a);
    }

    protected o5.e f(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (k("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i11 = 0; i11 < array.size(); i11++) {
                arrayList.add(array.getString(i11));
            }
        }
        Boolean bool = Boolean.FALSE;
        if (k("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (k("type", readableMap)) {
            return new o5.e(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool2, this.f46200a);
        }
        return new o5.e(readableMap.getArray("urls"), arrayList, bool2, this.f46200a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent g() {
        return this.f46201b;
    }

    protected Intent[] h(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.f46200a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i11 = 0; i11 < queryIntentActivities.size(); i11++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i11);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i11] = new Intent(intent2);
        }
        return intentArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String i();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String j();

    public void m(ReadableMap readableMap) {
        this.f46204e = readableMap;
        if (k("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            g().addFlags(268468224);
        }
        if (k("subject", readableMap)) {
            g().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (k("email", readableMap)) {
            g().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (k(MessageBundle.TITLE_ENTRY, readableMap)) {
            this.f46202c = readableMap.getString(MessageBundle.TITLE_ENTRY);
        }
        String string = k("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = k("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                g().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            String string4 = readableMap.getString("whatsAppNumber");
            g().putExtra("jid", string4 + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            String string5 = readableMap.getString("whatsAppNumber");
            g().putExtra("jid", string5 + "@s.whatsapp.net");
        }
        if (k("urls", readableMap)) {
            o5.e f11 = f(readableMap);
            if (f11.f()) {
                ArrayList<Uri> d11 = f11.d();
                g().setAction("android.intent.action.SEND_MULTIPLE");
                g().setType(f11.c());
                g().putParcelableArrayListExtra("android.intent.extra.STREAM", d11);
                g().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                g().putExtra("android.intent.extra.TEXT", string);
            } else if (!TextUtils.isEmpty(string)) {
                Intent g11 = g();
                g11.putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray("urls").getString(0));
            } else {
                g().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
            }
        } else if (k("url", readableMap)) {
            o5.d e11 = e(readableMap);
            this.f46203d = e11;
            if (e11.f()) {
                Uri d12 = this.f46203d.d();
                g().setType(this.f46203d.c());
                g().putExtra("android.intent.extra.STREAM", d12);
                g().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                g().putExtra("android.intent.extra.TEXT", string);
            } else if (!TextUtils.isEmpty(string)) {
                Intent g12 = g();
                g12.putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString("url"));
            } else {
                g().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
            }
        } else if (TextUtils.isEmpty(string)) {
        } else {
            g().putExtra("android.intent.extra.TEXT", string);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
        Intent createChooser;
        Activity currentActivity = this.f46200a.getCurrentActivity();
        if (currentActivity == null) {
            p.d(false, "Something went wrong");
            return;
        }
        IntentSender intentSender = null;
        if (p.b()) {
            intentSender = p.a(this.f46200a);
            createChooser = Intent.createChooser(g(), this.f46202c, intentSender);
        } else {
            createChooser = Intent.createChooser(g(), this.f46202c);
        }
        createChooser.addFlags(1073741824);
        if (k("showAppsToView", this.f46204e) && k("url", this.f46204e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f46203d.c());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", h(intent, this.f46203d.d()));
        }
        if (k("excludedActivityTypes", this.f46204e)) {
            if (Build.VERSION.SDK_INT >= 24) {
                createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", d(this.f46204e.getArray("excludedActivityTypes")));
                currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
            } else {
                currentActivity.startActivityForResult(a(g(), this.f46204e), RNShareModule.SHARE_REQUEST_CODE);
            }
        } else {
            currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
        }
        if (intentSender == null) {
            p.d(true, Boolean.TRUE, "OK");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Intent intent) {
        this.f46201b = intent;
    }
}