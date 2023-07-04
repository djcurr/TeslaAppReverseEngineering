package qg;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f48144a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<InterfaceC1027a, Set<String>> f48145b = new HashMap();

    /* renamed from: qg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC1027a {
        void a(View view, String str);
    }

    /* loaded from: classes3.dex */
    public interface b {
        String a();

        void b(View view);
    }

    public static View a(View view, String str) {
        String b11 = b(view);
        if (b11 == null || !b11.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View a11 = a(viewGroup.getChildAt(i11), str);
                    if (a11 != null) {
                        return a11;
                    }
                }
                return null;
            }
            return null;
        }
        return view;
    }

    private static String b(View view) {
        Object tag = view.getTag(h.f11879m);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void c(View view) {
        String b11 = b(view);
        if (b11 == null) {
            return;
        }
        Iterator<b> it2 = f48144a.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (b11.equals(next.a())) {
                next.b(view);
                it2.remove();
            }
        }
        for (Map.Entry<InterfaceC1027a, Set<String>> entry : f48145b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(b11)) {
                entry.getKey().a(view, b11);
            }
        }
    }
}