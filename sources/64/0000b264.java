package sg;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.b;
import sg.d;

/* loaded from: classes3.dex */
public class c<T extends View, U extends com.facebook.react.uimanager.b<T> & d<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 0;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c11 = 1;
                    break;
                }
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c11 = 2;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c11 = 3;
                    break;
                }
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((d) this.f12208a).setProgress(t11, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 1:
                ((d) this.f12208a).setTestID(t11, obj == null ? "" : (String) obj);
                return;
            case 2:
                ((d) this.f12208a).setTypeAttr(t11, obj != null ? (String) obj : null);
                return;
            case 3:
                ((d) this.f12208a).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 4:
                ((d) this.f12208a).setIndeterminate(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 5:
                ((d) this.f12208a).setAnimating(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 6:
                ((d) this.f12208a).setStyleAttr(t11, obj != null ? (String) obj : null);
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }
}