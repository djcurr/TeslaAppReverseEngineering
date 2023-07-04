package ezvcard.parameter;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameter;
import java.lang.reflect.Constructor;

/* loaded from: classes5.dex */
public class d<T extends VCardParameter> extends ezvcard.util.a<T, String> {
    public d(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* renamed from: i */
    public T c(String str) {
        try {
            try {
                Constructor declaredConstructor = this.f25446a.getDeclaredConstructor(String.class);
                declaredConstructor.setAccessible(true);
                return (T) declaredConstructor.newInstance(str);
            } catch (Exception unused) {
                Constructor declaredConstructor2 = this.f25446a.getDeclaredConstructor(String.class, VCardVersion[].class);
                declaredConstructor2.setAccessible(true);
                return (T) declaredConstructor2.newInstance(str, new VCardVersion[0]);
            }
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    /* renamed from: j */
    public boolean h(T t11, String str) {
        return t11.b().equalsIgnoreCase(str);
    }
}