package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import w3.c;

/* loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0074a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f4461a;

        C0074a(a aVar) {
            this.f4461a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4461a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            w3.d accessibilityNodeProvider = this.f4461a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4461a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            w3.c P0 = w3.c.P0(accessibilityNodeInfo);
            P0.C0(a0.d0(view));
            P0.o0(a0.X(view));
            P0.w0(a0.s(view));
            P0.I0(a0.N(view));
            this.f4461a.onInitializeAccessibilityNodeInfo(view, P0);
            P0.f(accessibilityNodeInfo.getText(), view);
            List<c.a> actionList = a.getActionList(view);
            for (int i11 = 0; i11 < actionList.size(); i11++) {
                P0.b(actionList.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4461a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4461a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            return this.f4461a.performAccessibilityAction(view, i11, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i11) {
            this.f4461a.sendAccessibilityEvent(view, i11);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4461a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    static List<c.a> getActionList(View view) {
        List<c.a> list = (List) view.getTag(j3.c.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q11 = w3.c.q(view.createAccessibilityNodeInfo().getText());
            for (int i11 = 0; q11 != null && i11 < q11.length; i11++) {
                if (clickableSpan.equals(q11[i11])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i11, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(j3.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i11)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (isSpanStillValid(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public w3.d getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new w3.d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, cVar.O0());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        List<c.a> actionList = getActionList(view);
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= actionList.size()) {
                break;
            }
            c.a aVar = actionList.get(i12);
            if (aVar.b() == i11) {
                z11 = aVar.d(view, bundle);
                break;
            }
            i12++;
        }
        if (!z11 && Build.VERSION.SDK_INT >= 16) {
            z11 = this.mOriginalDelegate.performAccessibilityAction(view, i11, bundle);
        }
        return (z11 || i11 != j3.c.f33152a) ? z11 : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i11) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i11);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0074a(this);
    }
}