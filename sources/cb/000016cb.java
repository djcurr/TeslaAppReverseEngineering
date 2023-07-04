package com.facebook.imagepipeline.platform;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import jf.m;
import qf.t;
import v3.g;

/* loaded from: classes3.dex */
public class e {
    public static d a(t tVar, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            int e11 = tVar.e();
            return new c(tVar.b(), e11, new g(e11));
        } else if (i11 < 21 && m.a()) {
            try {
                if (!z11 || i11 >= 19) {
                    int i12 = KitKatPurgeableDecoder.f11307d;
                    return (d) KitKatPurgeableDecoder.class.getConstructor(com.facebook.imagepipeline.memory.e.class).newInstance(tVar.d());
                }
                int i13 = GingerbreadPurgeableDecoder.f11305e;
                return (d) GingerbreadPurgeableDecoder.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
            } catch (IllegalAccessException e13) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
            } catch (InstantiationException e14) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
            } catch (NoSuchMethodException e15) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e15);
            } catch (InvocationTargetException e16) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e16);
            }
        } else {
            int e17 = tVar.e();
            return new a(tVar.b(), e17, new g(e17));
        }
    }
}