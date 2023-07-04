package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfk;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzfw<T extends zzfk> {
    private static final Logger logger = Logger.getLogger(zzfe.class.getName());
    private static String zzwh = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzfw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzfk> T zza(Class<T> cls) {
        String format;
        ClassLoader classLoader = zzfw.class.getClassLoader();
        if (cls.equals(zzfk.class)) {
            format = zzwh;
        } else if (cls.getPackage().equals(zzfw.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zzfw) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zzew());
                    } catch (InstantiationException e11) {
                        throw new IllegalStateException(e11);
                    } catch (NoSuchMethodException e12) {
                        throw new IllegalStateException(e12);
                    }
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it2 = ServiceLoader.load(zzfw.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzfw) it2.next()).zzew()));
                } catch (ServiceConfigurationError e15) {
                    Logger logger2 = logger;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e15);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (NoSuchMethodException e17) {
                throw new IllegalStateException(e17);
            } catch (InvocationTargetException e18) {
                throw new IllegalStateException(e18);
            }
        }
    }

    protected abstract T zzew();
}