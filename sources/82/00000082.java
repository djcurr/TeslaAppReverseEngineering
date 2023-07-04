package a9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g9.a;
import java.util.Collections;
import org.json.JSONObject;
import t9.m;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static a f369a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z11, JSONObject jSONObject, String str);
    }

    public static boolean a(r9.a aVar, int i11, int i12, Intent intent) {
        if (i11 == 1010 && intent != null) {
            a aVar2 = f369a;
            if (aVar2 == null) {
                return true;
            }
            f369a = null;
            if (i12 == -1) {
                c9.a.c(aVar, "biz", "TbOk", intent.toUri(1));
                aVar2.a(true, m.p(intent), "OK");
            } else if (i12 != 0) {
                c9.a.h(aVar, "biz", "TbUnknown", "" + i12);
            } else {
                c9.a.c(aVar, "biz", "TbCancel", intent.toUri(1));
                aVar2.a(false, null, "CANCELED");
            }
            return true;
        }
        return false;
    }

    public static boolean b(r9.a aVar, Activity activity, int i11, String str, String str2, a aVar2) {
        try {
            c9.a.b(aVar, "biz", "TbStart");
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i11);
            f369a = aVar2;
            return true;
        } catch (Throwable th2) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            c9.a.d(aVar, "biz", "TbActFail", th2);
            return false;
        }
    }

    public static boolean c(r9.a aVar, Context context) {
        return m.w(aVar, context, Collections.singletonList(new a.b("com.taobao.taobao", 0, "")), false);
    }
}