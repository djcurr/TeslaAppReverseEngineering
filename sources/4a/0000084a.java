package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v extends androidx.core.view.a {

    /* renamed from: a  reason: collision with root package name */
    final RecyclerView f5703a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5704b;

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        final v f5705a;

        /* renamed from: b  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f5706b = new WeakHashMap();

        public a(v vVar) {
            this.f5705a = vVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a a(View view) {
            return this.f5706b.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(View view) {
            androidx.core.view.a o11 = androidx.core.view.a0.o(view);
            if (o11 == null || o11 == this) {
                return;
            }
            this.f5706b.put(view, o11);
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public w3.d getAccessibilityNodeProvider(View view) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            if (!this.f5705a.b() && this.f5705a.f5703a.getLayoutManager() != null) {
                this.f5705a.f5703a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
                androidx.core.view.a aVar = this.f5706b.get(view);
                if (aVar != null) {
                    aVar.onInitializeAccessibilityNodeInfo(view, cVar);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, cVar);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5706b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (!this.f5705a.b() && this.f5705a.f5703a.getLayoutManager() != null) {
                androidx.core.view.a aVar = this.f5706b.get(view);
                if (aVar != null) {
                    if (aVar.performAccessibilityAction(view, i11, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i11, bundle)) {
                    return true;
                }
                return this.f5705a.f5703a.getLayoutManager().performAccessibilityActionForItem(view, i11, bundle);
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(View view, int i11) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i11);
            } else {
                super.sendAccessibilityEvent(view, i11);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5706b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.f5703a = recyclerView;
        androidx.core.view.a a11 = a();
        if (a11 != null && (a11 instanceof a)) {
            this.f5704b = (a) a11;
        } else {
            this.f5704b = new a(this);
        }
    }

    public androidx.core.view.a a() {
        return this.f5704b;
    }

    boolean b() {
        return this.f5703a.hasPendingAdapterUpdates();
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || b()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        if (b() || this.f5703a.getLayoutManager() == null) {
            return;
        }
        this.f5703a.getLayoutManager().onInitializeAccessibilityNodeInfo(cVar);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
        if (super.performAccessibilityAction(view, i11, bundle)) {
            return true;
        }
        if (b() || this.f5703a.getLayoutManager() == null) {
            return false;
        }
        return this.f5703a.getLayoutManager().performAccessibilityAction(i11, bundle);
    }
}