package sg;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import sg.l;

/* loaded from: classes3.dex */
public class k<T extends View, U extends com.facebook.react.uimanager.b<T> & l<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.b1
    public void a(T t11, String str, Object obj) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c11 = 3;
                    break;
                }
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c11 = 4;
                    break;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c11 = 5;
                    break;
                }
                break;
            case 3540684:
                if (str.equals("step")) {
                    c11 = 6;
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c11 = 7;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                ((l) this.f12208a).setMaximumTrackTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 1:
                ((l) this.f12208a).setThumbImage(t11, (ReadableMap) obj);
                return;
            case 2:
                ((l) this.f12208a).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 3:
                ((l) this.f12208a).setMinimumTrackTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            case 4:
                ((l) this.f12208a).setMaximumTrackImage(t11, (ReadableMap) obj);
                return;
            case 5:
                ((l) this.f12208a).setTestID(t11, obj == null ? "" : (String) obj);
                return;
            case 6:
                ((l) this.f12208a).setStep(t11, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case 7:
                ((l) this.f12208a).setValue(t11, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\b':
                ((l) this.f12208a).setDisabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\t':
                ((l) this.f12208a).setMaximumValue(t11, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case '\n':
                ((l) this.f12208a).setTrackImage(t11, (ReadableMap) obj);
                return;
            case 11:
                ((l) this.f12208a).setMinimumValue(t11, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                return;
            case '\f':
                ((l) this.f12208a).setMinimumTrackImage(t11, (ReadableMap) obj);
                return;
            case '\r':
                ((l) this.f12208a).setThumbTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                return;
            default:
                super.a(t11, str, obj);
                return;
        }
    }
}