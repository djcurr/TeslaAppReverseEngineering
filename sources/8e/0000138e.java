package com.airbnb.android.react.maps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes.dex */
public class AirMapMarkerManager extends ViewGroupManager<g> {
    private static final int ANIMATE_MARKER_TO_COORDINATE = 3;
    private static final int HIDE_INFO_WINDOW = 2;
    private static final int REDRAW = 4;
    private static final int SHOW_INFO_WINDOW = 1;
    private Map<String, a> sharedIcons = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private BitmapDescriptor f9730a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f9731b;

        /* renamed from: c  reason: collision with root package name */
        private Map<g, Boolean> f9732c = new WeakHashMap();

        /* renamed from: d  reason: collision with root package name */
        private boolean f9733d = false;

        public synchronized void a(g gVar) {
            this.f9732c.put(gVar, Boolean.TRUE);
            BitmapDescriptor bitmapDescriptor = this.f9730a;
            if (bitmapDescriptor != null) {
                gVar.w(bitmapDescriptor, this.f9731b);
            }
        }

        public synchronized boolean b() {
            return this.f9732c.isEmpty();
        }

        public synchronized void c(g gVar) {
            this.f9732c.remove(gVar);
        }

        public synchronized boolean d() {
            if (this.f9733d) {
                return false;
            }
            this.f9733d = true;
            return true;
        }

        public synchronized void e(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
            this.f9730a = bitmapDescriptor;
            this.f9731b = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (this.f9732c.isEmpty()) {
                return;
            }
            for (Map.Entry<g, Boolean> entry : this.f9732c.entrySet()) {
                if (entry.getKey() != null) {
                    entry.getKey().w(bitmapDescriptor, bitmap);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.g("showCallout", 1, "hideCallout", 2, "animateMarkerToCoordinate", 3, "redraw", 4);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map h11 = yf.c.h("onPress", yf.c.d("registrationName", "onPress"), "onCalloutPress", yf.c.d("registrationName", "onCalloutPress"), "onDragStart", yf.c.d("registrationName", "onDragStart"), "onDrag", yf.c.d("registrationName", "onDrag"), "onDragEnd", yf.c.d("registrationName", "onDragEnd"));
        h11.putAll(yf.c.f("onDragStart", yf.c.d("registrationName", "onDragStart"), "onDrag", yf.c.d("registrationName", "onDrag"), "onDragEnd", yf.c.d("registrationName", "onDragEnd")));
        return h11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapMarker";
    }

    public a getSharedIcon(String str) {
        a aVar = this.sharedIcons.get(str);
        if (aVar == null) {
            synchronized (this) {
                aVar = this.sharedIcons.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.sharedIcons.put(str, aVar);
                }
            }
        }
        return aVar;
    }

    public void removeSharedIconIfEmpty(String str) {
        a aVar = this.sharedIcons.get(str);
        if (aVar == null || aVar.b()) {
            return;
        }
        synchronized (this) {
            a aVar2 = this.sharedIcons.get(str);
            if (aVar2 != null && !aVar2.b()) {
                this.sharedIcons.remove(str);
            }
        }
    }

    @ng.a(name = "anchor")
    public void setAnchor(g gVar, ReadableMap readableMap) {
        gVar.u((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 1.0d : readableMap.getDouble("y"));
    }

    @ng.a(name = "calloutAnchor")
    public void setCalloutAnchor(g gVar, ReadableMap readableMap) {
        gVar.v((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 0.0d : readableMap.getDouble("y"));
    }

    @ng.a(name = "coordinate")
    public void setCoordinate(g gVar, ReadableMap readableMap) {
        gVar.setCoordinate(readableMap);
    }

    @ng.a(name = "description")
    public void setDescription(g gVar, String str) {
        gVar.setSnippet(str);
    }

    @ng.a(defaultBoolean = false, name = "draggable")
    public void setDraggable(g gVar, boolean z11) {
        gVar.setDraggable(z11);
    }

    @ng.a(defaultBoolean = false, name = "flat")
    public void setFlat(g gVar, boolean z11) {
        gVar.setFlat(z11);
    }

    @ng.a(name = "icon")
    public void setIcon(g gVar, String str) {
        gVar.setImage(str);
    }

    @ng.a(name = "identifier")
    public void setIdentifier(g gVar, String str) {
        gVar.setIdentifier(str);
    }

    @ng.a(name = "image")
    public void setImage(g gVar, String str) {
        gVar.setImage(str);
    }

    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "rotation")
    public void setMarkerRotation(g gVar, float f11) {
        gVar.setRotation(f11);
    }

    @ng.a(customType = "Color", defaultInt = -65536, name = "pinColor")
    public void setPinColor(g gVar, int i11) {
        float[] fArr = new float[3];
        Color.colorToHSV(i11, fArr);
        gVar.setMarkerHue(fArr[0]);
    }

    @ng.a(name = MessageBundle.TITLE_ENTRY)
    public void setTitle(g gVar, String str) {
        gVar.setTitle(str);
    }

    @ng.a(defaultBoolean = true, name = "tracksViewChanges")
    public void setTracksViewChanges(g gVar, boolean z11) {
        gVar.setTracksViewChanges(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(g gVar, View view, int i11) {
        if (view instanceof com.airbnb.android.react.maps.a) {
            gVar.setCalloutView((com.airbnb.android.react.maps.a) view);
            return;
        }
        super.addView((AirMapMarkerManager) gVar, view, i11);
        gVar.y(true);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(n0 n0Var) {
        return new g(n0Var, this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            ((Marker) gVar.getFeature()).showInfoWindow();
        } else if (i11 == 2) {
            ((Marker) gVar.getFeature()).hideInfoWindow();
        } else if (i11 != 3) {
            if (i11 != 4) {
                return;
            }
            gVar.A();
        } else {
            ReadableMap map = readableArray.getMap(0);
            gVar.m(new LatLng(Double.valueOf(map.getDouble("latitude")).doubleValue(), Double.valueOf(map.getDouble("longitude")).doubleValue()), Integer.valueOf(readableArray.getInt(1)));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(g gVar, int i11) {
        super.removeViewAt((AirMapMarkerManager) gVar, i11);
        gVar.y(true);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(g gVar, float f11) {
        super.setOpacity((AirMapMarkerManager) gVar, f11);
        gVar.setOpacity(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "zIndex")
    public void setZIndex(g gVar, float f11) {
        super.setZIndex((AirMapMarkerManager) gVar, f11);
        gVar.setZIndex(Math.round(f11));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(g gVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        gVar.x((int) ((Float) hashMap.get(Snapshot.WIDTH)).floatValue(), (int) ((Float) hashMap.get(Snapshot.HEIGHT)).floatValue());
    }
}