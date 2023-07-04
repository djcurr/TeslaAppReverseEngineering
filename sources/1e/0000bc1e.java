package w3;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f55474a;

    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f55475a;

        a(d dVar) {
            this.f55475a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            w3.c b11 = this.f55475a.b(i11);
            if (b11 == null) {
                return null;
            }
            return b11.O0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i11) {
            List<w3.c> c11 = this.f55475a.c(str, i11);
            if (c11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c11.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(c11.get(i12).O0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.f55475a.f(i11, i12, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i11) {
            w3.c d11 = this.f55475a.d(i11);
            if (d11 == null) {
                return null;
            }
            return d11.O0();
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f55475a.a(i11, w3.c.P0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f55474a = new c(this);
        } else if (i11 >= 19) {
            this.f55474a = new b(this);
        } else if (i11 >= 16) {
            this.f55474a = new a(this);
        } else {
            this.f55474a = null;
        }
    }

    public void a(int i11, w3.c cVar, String str, Bundle bundle) {
    }

    public w3.c b(int i11) {
        return null;
    }

    public List<w3.c> c(String str, int i11) {
        return null;
    }

    public w3.c d(int i11) {
        return null;
    }

    public Object e() {
        return this.f55474a;
    }

    public boolean f(int i11, int i12, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f55474a = obj;
    }
}