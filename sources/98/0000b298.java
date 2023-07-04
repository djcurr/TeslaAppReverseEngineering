package sp;

/* loaded from: classes2.dex */
public class g {
    public void a(up.g gVar, int i11) {
        com.henninghall.date_picker.pickers.a aVar = gVar.f53653d;
        int value = aVar.getValue();
        int maxValue = aVar.getMaxValue();
        boolean wrapSelectorWheel = aVar.getWrapSelectorWheel();
        int i12 = value + i11;
        if (i12 <= maxValue || wrapSelectorWheel) {
            aVar.b(i12 % (maxValue + 1));
        }
    }
}