package sg;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b;
import sg.j;

/* loaded from: classes3.dex */
public class i<T extends View, U extends com.facebook.react.uimanager.b<T> & j<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c11 = 4;
                    break;
                }
                break;
            case -795203165:
                if (str.equals("animated")) {
                    c11 = 5;
                    break;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    c11 = 7;
                    break;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((j) this.f12208a).setPresentationStyle(t11, (String) obj);
                return;
            case 1:
                ((j) this.f12208a).setSupportedOrientations(t11, (ReadableArray) obj);
                return;
            case 2:
                ((j) this.f12208a).setTransparent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 3:
                ((j) this.f12208a).setIdentifier(t11, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 4:
                ((j) this.f12208a).setStatusBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((j) this.f12208a).setAnimated(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 6:
                ((j) this.f12208a).setVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((j) this.f12208a).setHardwareAccelerated(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\b':
                ((j) this.f12208a).setAnimationType(t11, (String) obj);
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }
}