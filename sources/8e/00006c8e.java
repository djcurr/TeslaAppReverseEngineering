package f;

import android.content.Context;
import android.content.Intent;
import f.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import vz.p;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;

/* loaded from: classes.dex */
public final class d extends f.a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25475a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            s.g(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            s.f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, String[] input) {
        s.g(context, "context");
        s.g(input, "input");
        return f25475a.a(input);
    }

    @Override // f.a
    /* renamed from: b */
    public a.C0496a<Map<String, Boolean>> getSynchronousResult(Context context, String[] input) {
        int e11;
        int d11;
        Map i11;
        s.g(context, "context");
        s.g(input, "input");
        boolean z11 = true;
        if (input.length == 0) {
            i11 = s0.i();
            return new a.C0496a<>(i11);
        }
        int length = input.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (!(androidx.core.content.b.checkSelfPermission(context, input[i12]) == 0)) {
                z11 = false;
                break;
            }
            i12++;
        }
        if (z11) {
            e11 = r0.e(input.length);
            d11 = l.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (String str : input) {
                p a11 = v.a(str, Boolean.TRUE);
                linkedHashMap.put(a11.c(), a11.d());
            }
            return new a.C0496a<>(linkedHashMap);
        }
        return null;
    }

    @Override // f.a
    /* renamed from: c */
    public Map<String, Boolean> parseResult(int i11, Intent intent) {
        Map<String, Boolean> i12;
        List E;
        List V0;
        Map<String, Boolean> t11;
        Map<String, Boolean> i13;
        Map<String, Boolean> i14;
        if (i11 != -1) {
            i14 = s0.i();
            return i14;
        } else if (intent == null) {
            i13 = s0.i();
            return i13;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i15 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i15 == 0));
                }
                E = wz.p.E(stringArrayExtra);
                V0 = e0.V0(E, arrayList);
                t11 = s0.t(V0);
                return t11;
            }
            i12 = s0.i();
            return i12;
        }
    }
}