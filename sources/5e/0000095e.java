package androidx.versionedparcelable;

import a5.b;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f6364a;

    /* renamed from: b  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f6365b;

    /* renamed from: c  reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f6366c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f6364a = aVar;
        this.f6365b = aVar2;
        this.f6366c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e11);
        }
    }

    private Class c(Class<? extends b> cls) {
        Class cls2 = this.f6366c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f6366c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    private Method d(String str) {
        Method method = this.f6364a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f6364a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    private Method e(Class cls) {
        Method method = this.f6365b.get(cls.getName());
        if (method == null) {
            Class c11 = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c11.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f6365b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i11) {
        w(i11);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i11) {
        w(i11);
        C(charSequence);
    }

    protected abstract void E(int i11);

    public void F(int i11, int i12) {
        w(i12);
        E(i11);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i11) {
        w(i11);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i11) {
        w(i11);
        I(str);
    }

    protected <T extends b> void K(T t11, VersionedParcel versionedParcel) {
        try {
            e(t11.getClass()).invoke(null, t11, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(b bVar) {
        if (bVar == null) {
            I(null);
            return;
        }
        N(bVar);
        VersionedParcel b11 = b();
        K(bVar, b11);
        b11.a();
    }

    public void M(b bVar, int i11) {
        w(i11);
        L(bVar);
    }

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z11, int i11) {
        return !m(i11) ? z11 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i11) {
        return !m(i11) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i11) {
        return !m(i11) ? charSequence : k();
    }

    protected abstract boolean m(int i11);

    protected <T extends b> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    protected abstract int o();

    public int p(int i11, int i12) {
        return !m(i12) ? i11 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t11, int i11) {
        return !m(i11) ? t11 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i11) {
        return !m(i11) ? str : s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends b> T u() {
        String s11 = s();
        if (s11 == null) {
            return null;
        }
        return (T) n(s11, b());
    }

    public <T extends b> T v(T t11, int i11) {
        return !m(i11) ? t11 : (T) u();
    }

    protected abstract void w(int i11);

    public void x(boolean z11, boolean z12) {
    }

    protected abstract void y(boolean z11);

    public void z(boolean z11, int i11) {
        w(i11);
        y(z11);
    }
}