package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzadp;
import com.google.android.libraries.places.internal.zzadq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzadq<MessageType extends zzadq<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> implements zzagg {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzM(Iterable iterable, List list) {
        zzafh.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                int size2 = list.size();
                String str = "Element at index " + (size2 - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzr(zzagr zzagrVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzagg
    public final zzaed zzs() {
        try {
            int zzv = zzv();
            zzaed zzaedVar = zzaed.zzb;
            byte[] bArr = new byte[zzv];
            zzael zzC = zzael.zzC(bArr);
            zzK(zzC);
            zzC.zzD();
            return new zzaea(bArr);
        } catch (IOException e11) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e11);
        }
    }
}