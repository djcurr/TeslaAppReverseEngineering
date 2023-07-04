package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class c {
    public static uf.d a(int i11, boolean z11, boolean z12) {
        try {
            Class cls = Boolean.TYPE;
            return (uf.d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, cls, cls).newInstance(Integer.valueOf(i11), Boolean.valueOf(z11), Boolean.valueOf(z12));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        }
    }
}