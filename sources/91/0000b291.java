package sp;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.k;
import java.util.Locale;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final AccessibilityManager f50485a = (AccessibilityManager) com.henninghall.date_picker.a.f17465a.getApplicationContext().getSystemService("accessibility");

    /* renamed from: b  reason: collision with root package name */
    private static Locale f50486b = Locale.getDefault();

    /* renamed from: sp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C1122a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f50487a;

        C1122a(com.henninghall.date_picker.pickers.a aVar) {
            this.f50487a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            int value = this.f50487a.getValue();
            if (i11 != 4096) {
                if (i11 == 8192 && !this.f50487a.c()) {
                    this.f50487a.b(value + 1);
                }
            } else if (!this.f50487a.c()) {
                this.f50487a.b(value - 1);
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    public static AccessibilityEvent a(View view, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setClassName(view.getClass().getName());
        obtain.setPackageName(view.getContext().getPackageName());
        return obtain;
    }

    public static String b(com.henninghall.date_picker.pickers.a aVar) {
        String obj = aVar.getView().getTag().toString();
        String e11 = e(aVar, aVar.getValue());
        String c11 = c(obj);
        return e11 + ", " + c11;
    }

    private static String c(String str) {
        Locale d11 = d();
        return k.e(d11, str + "_description");
    }

    public static Locale d() {
        return f50486b;
    }

    private static String e(com.henninghall.date_picker.pickers.a aVar, int i11) {
        String str = aVar.getDisplayedValues()[i11];
        return str != null ? str : String.valueOf(i11);
    }

    public static void f(AccessibilityEvent accessibilityEvent) {
        AccessibilityManager accessibilityManager = f50485a;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
    }

    public static void g(com.henninghall.date_picker.pickers.a aVar, int i11) {
        AccessibilityEvent a11 = a(aVar.getView(), 32);
        a11.getText().add(e(aVar, i11));
        f(a11);
    }

    public static void h(Locale locale) {
        f50486b = locale;
    }

    public static void i(com.henninghall.date_picker.pickers.a aVar, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setContentDescription(b(aVar));
        if (Build.VERSION.SDK_INT >= 21) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(4096, "Increase value");
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = new AccessibilityNodeInfo.AccessibilityAction(PKIFailureInfo.certRevoked, "Decrease value");
            accessibilityNodeInfo.addAction(accessibilityAction);
            accessibilityNodeInfo.addAction(accessibilityAction2);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(PKIFailureInfo.certRevoked);
    }

    public static boolean j(View view) {
        if (f50485a.isTouchExplorationEnabled()) {
            if (Build.VERSION.SDK_INT >= 21) {
                return view.isAccessibilityFocused();
            }
            return false;
        }
        return true;
    }

    public static void k(com.henninghall.date_picker.pickers.a aVar) {
        aVar.getView().setAccessibilityDelegate(new C1122a(aVar));
    }
}