package sg;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import sg.f;

/* loaded from: classes3.dex */
public class e<T extends View, U extends com.facebook.react.uimanager.b<T> & f<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1354842768:
                if (str.equals("colors")) {
                    c11 = 1;
                    break;
                }
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c11 = 2;
                    break;
                }
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c11 = 3;
                    break;
                }
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c11 = 4;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((f) this.f12208a).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 1:
                ((f) this.f12208a).setColors(t11, (ReadableArray) obj);
                return;
            case 2:
                ((f) this.f12208a).setProgressBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 3:
                ((f) this.f12208a).setProgressViewOffset(t11, obj == null ? BitmapDescriptorFactory.HUE_RED : ((Double) obj).floatValue());
                return;
            case 4:
                ((f) this.f12208a).setRefreshing(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((f) this.f12208a).setSize(t11, (String) obj);
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void b(T t11, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((f) this.f12208a).setNativeRefreshing(t11, readableArray.getBoolean(0));
        }
    }
}