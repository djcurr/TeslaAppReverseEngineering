package sg;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import sg.b;

/* loaded from: classes3.dex */
public class a<T extends View, U extends com.facebook.react.uimanager.b<T> & b<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public a(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c11 = 1;
                    break;
                }
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c11 = 2;
                    break;
                }
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c11 = 3;
                    break;
                }
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((b) this.f12208a).setStatusBarBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 1:
                ((b) this.f12208a).setDrawerBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 2:
                ((b) this.f12208a).setKeyboardDismissMode(t11, (String) obj);
                return;
            case 3:
                ((b) this.f12208a).setDrawerWidth(t11, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                return;
            case 4:
                ((b) this.f12208a).setDrawerPosition(t11, (String) obj);
                return;
            case 5:
                ((b) this.f12208a).setDrawerLockMode(t11, (String) obj);
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void b(T t11, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            ((b) this.f12208a).closeDrawer(t11);
        } else if (str.equals("openDrawer")) {
            ((b) this.f12208a).openDrawer(t11);
        }
    }
}