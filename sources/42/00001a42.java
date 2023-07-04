package com.facebook.react.views.swiperefresh;

import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;
import sg.e;
import sg.f;

@fg.a(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<com.facebook.react.views.swiperefresh.a> implements f<com.facebook.react.views.swiperefresh.a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final b1<com.facebook.react.views.swiperefresh.a> mDelegate = new e(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements c.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f12594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.swiperefresh.a f12595b;

        a(SwipeRefreshLayoutManager swipeRefreshLayoutManager, n0 n0Var, com.facebook.react.views.swiperefresh.a aVar) {
            this.f12594a = n0Var;
            this.f12595b = aVar;
        }

        @Override // androidx.swiperefreshlayout.widget.c.j
        public void a() {
            d c11 = t0.c(this.f12594a, this.f12595b.getId());
            if (c11 != null) {
                c11.g(new b(t0.f(this.f12595b), this.f12595b.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b1<com.facebook.react.views.swiperefresh.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.a().b("topRefresh", yf.c.d("registrationName", "onRefresh")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return yf.c.d("SIZE", yf.c.e("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.swiperefresh.a aVar) {
        aVar.setOnRefreshListener(new a(this, n0Var, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.swiperefresh.a createViewInstance(n0 n0Var) {
        return new com.facebook.react.views.swiperefresh.a(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.swiperefresh.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @Override // sg.f
    @ng.a(customType = "ColorArray", name = "colors")
    public void setColors(com.facebook.react.views.swiperefresh.a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                if (readableArray.getType(i11) == ReadableType.Map) {
                    iArr[i11] = ColorPropConverter.getColor(readableArray.getMap(i11), aVar.getContext()).intValue();
                } else {
                    iArr[i11] = readableArray.getInt(i11);
                }
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @Override // sg.f
    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.swiperefresh.a aVar, boolean z11) {
        aVar.setEnabled(z11);
    }

    @Override // sg.f
    public void setNativeRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z11) {
        setRefreshing(aVar, z11);
    }

    @Override // sg.f
    @ng.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(com.facebook.react.views.swiperefresh.a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // sg.f
    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "progressViewOffset")
    public void setProgressViewOffset(com.facebook.react.views.swiperefresh.a aVar, float f11) {
        aVar.setProgressViewOffset(f11);
    }

    @Override // sg.f
    @ng.a(name = "refreshing")
    public void setRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z11) {
        aVar.setRefreshing(z11);
    }

    public void setSize(com.facebook.react.views.swiperefresh.a aVar, int i11) {
        aVar.setSize(i11);
    }

    @Override // sg.f
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, String str) {
        if (str != null && !str.equals("default")) {
            if (str.equals("large")) {
                aVar.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
        }
        aVar.setSize(1);
    }

    @ng.a(name = "size")
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            aVar.setSize(dynamic.asInt());
        } else if (dynamic.getType() == ReadableType.String) {
            setSize(aVar, dynamic.asString());
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }
}