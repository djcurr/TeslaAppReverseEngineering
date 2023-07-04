package ezvcard.parameter;

import ezvcard.parameter.MediaTypeParameter;
import java.lang.reflect.Constructor;

/* loaded from: classes5.dex */
public class b<T extends MediaTypeParameter> extends ezvcard.util.a<T, String[]> {
    public b(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* renamed from: i */
    public T c(String[] strArr) {
        try {
            Constructor declaredConstructor = this.f25446a.getDeclaredConstructor(String.class, String.class, String.class);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* renamed from: j */
    public boolean h(T t11, String[] strArr) {
        String[] strArr2 = {t11.b(), t11.e(), t11.d()};
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (str != null && !str.equalsIgnoreCase(strArr2[i11])) {
                return false;
            }
        }
        return true;
    }
}