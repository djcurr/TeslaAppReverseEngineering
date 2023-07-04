package io.realm.internal;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.g0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final i f31934a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static i f31935b;

    static {
        f31935b = null;
        try {
            f31935b = (i) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e11) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e12);
        } catch (NoSuchMethodException e13) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e13);
        } catch (InvocationTargetException e14) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e14.getTargetException());
        }
    }

    public static i b(boolean z11) {
        if (z11) {
            return f31935b;
        }
        return f31934a;
    }

    public static i d() {
        i iVar = f31935b;
        return iVar != null ? iVar : f31934a;
    }

    public void a(g0 g0Var) {
    }

    public Object[] c(g0 g0Var) {
        return new Object[14];
    }

    public String e(g0 g0Var) {
        return null;
    }

    public String f(g0 g0Var) {
        return null;
    }

    public void g(Context context, String str) {
    }

    public void h(g0 g0Var) {
    }

    public void i(OsRealmConfig osRealmConfig) {
    }
}