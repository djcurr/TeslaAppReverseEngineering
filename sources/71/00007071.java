package gk;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f27999a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f11 = (Float) viewGroup.getTag(fk.f.D);
        return f11 != null ? f11 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f11) {
        float floatValue = f11.floatValue();
        viewGroup.setTag(fk.f.D, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup.getChildAt(i11).setAlpha(floatValue);
        }
    }
}