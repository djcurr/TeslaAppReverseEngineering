package gb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static void a(b bVar, Intent intent) {
        if (bVar == null || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("result");
        String stringExtra2 = intent.getStringExtra("requestCode");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        bVar.onCmblifeCallBack(stringExtra2, b(stringExtra));
    }

    private static Map<String, String> b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    public static String c(Context context, String str, Class<?> cls, String str2) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.cmbchina.ccd.pluto.cmbActivity", "com.cmbchina.ccd.pluto.cmbActivity.open.OpenSplashActivity"));
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("callBackActivity", cls.getName());
            intent.putExtra("protocol", str);
            intent.putExtra("requestCode", str2);
            context.startActivity(intent);
            return "";
        } catch (Exception unused) {
            d(context, "https://site.cc.cmbimg.com/Router/?sid=f3be2a0ceb8b4dd7a6c9fff17dc56c78&ch=608");
            return "您的掌上生活版本过低或未能正确安装，请从官方渠道重新下载";
        }
    }

    private static void d(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }
}