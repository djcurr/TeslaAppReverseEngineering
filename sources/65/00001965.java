package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public abstract class a<T extends View, U extends b<T>> implements b1<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final U f12208a;

    public a(U u11) {
        this.f12208a = u11;
    }

    @Override // com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c11 = 4;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 5;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 6;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c11 = 7;
                    break;
                }
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    c11 = 11;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\f';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    c11 = 14;
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c11 = 15;
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c11 = 16;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c11 = 17;
                    break;
                }
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    c11 = 18;
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c11 = 19;
                    break;
                }
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    c11 = 20;
                    break;
                }
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    c11 = 21;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c11 = 22;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c11 = 23;
                    break;
                }
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    c11 = 24;
                    break;
                }
                break;
            case 1865277756:
                if (str.equals("accessibilityLabelledBy")) {
                    c11 = 25;
                    break;
                }
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    c11 = 26;
                    break;
                }
                break;
        }
        float f11 = BitmapDescriptorFactory.HUE_RED;
        switch (c11) {
            case 0:
                U u11 = this.f12208a;
                if (obj != null) {
                    f11 = ((Double) obj).floatValue();
                }
                u11.setTranslateX(t11, f11);
                return;
            case 1:
                U u12 = this.f12208a;
                if (obj != null) {
                    f11 = ((Double) obj).floatValue();
                }
                u12.setTranslateY(t11, f11);
                return;
            case 2:
                this.f12208a.setShadowColor(t11, obj != null ? ColorPropConverter.getColor(obj, t11.getContext()).intValue() : 0);
                return;
            case 3:
                this.f12208a.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 4:
                this.f12208a.setBorderTopLeftRadius(t11, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 5:
                this.f12208a.setScaleX(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 6:
                this.f12208a.setScaleY(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                return;
            case 7:
                this.f12208a.setTestId(t11, (String) obj);
                return;
            case '\b':
                U u13 = this.f12208a;
                if (obj != null) {
                    f11 = ((Double) obj).floatValue();
                }
                u13.setZIndex(t11, f11);
                return;
            case '\t':
                this.f12208a.setAccessibilityHint(t11, (String) obj);
                return;
            case '\n':
                this.f12208a.setAccessibilityRole(t11, (String) obj);
                return;
            case 11:
                this.f12208a.setRenderToHardwareTexture(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\f':
                U u14 = this.f12208a;
                if (obj != null) {
                    f11 = ((Double) obj).floatValue();
                }
                u14.setRotation(t11, f11);
                return;
            case '\r':
                U u15 = this.f12208a;
                if (obj != null) {
                    f11 = ((Double) obj).floatValue();
                }
                u15.setElevation(t11, f11);
                return;
            case 14:
                this.f12208a.setAccessibilityLiveRegion(t11, (String) obj);
                return;
            case 15:
                this.f12208a.setBorderTopRightRadius(t11, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 16:
                this.f12208a.setBorderBottomLeftRadius(t11, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 17:
                this.f12208a.setBorderBottomRightRadius(t11, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 18:
                this.f12208a.setImportantForAccessibility(t11, (String) obj);
                return;
            case 19:
                this.f12208a.setTransform(t11, (ReadableArray) obj);
                return;
            case 20:
                this.f12208a.setAccessibilityLabel(t11, (String) obj);
                return;
            case 21:
                this.f12208a.setViewState(t11, (ReadableMap) obj);
                return;
            case 22:
                this.f12208a.setBackgroundColor(t11, obj != null ? ColorPropConverter.getColor(obj, t11.getContext()).intValue() : 0);
                return;
            case 23:
                this.f12208a.setBorderRadius(t11, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                return;
            case 24:
                this.f12208a.setAccessibilityActions(t11, (ReadableArray) obj);
                return;
            case 25:
                this.f12208a.setAccessibilityLabelledBy(t11, (Dynamic) obj);
                return;
            case 26:
                this.f12208a.setNativeId(t11, (String) obj);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.b1
    public void b(T t11, String str, ReadableArray readableArray) {
    }
}