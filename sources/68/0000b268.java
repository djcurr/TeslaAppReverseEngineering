package sg;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import sg.h;

/* loaded from: classes3.dex */
public class g<T extends View, U extends com.facebook.react.uimanager.b<T> & h<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c11 = 1;
                    break;
                }
                break;
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3551:
                if (str.equals("on")) {
                    c11 = 3;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c11 = 4;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c11 = 7;
                    break;
                }
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((h) this.f12208a).setThumbColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 1:
                ((h) this.f12208a).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((h) this.f12208a).setTrackTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 3:
                ((h) this.f12208a).setOn(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 4:
                ((h) this.f12208a).setValue(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((h) this.f12208a).setDisabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((h) this.f12208a).setTrackColorForFalse(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 7:
                ((h) this.f12208a).setThumbTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case '\b':
                ((h) this.f12208a).setTrackColorForTrue(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void b(T t11, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            ((h) this.f12208a).setNativeValue(t11, readableArray.getBoolean(0));
        }
    }
}