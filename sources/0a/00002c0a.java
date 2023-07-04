package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzed;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzhf {
    private static boolean zzrj = false;
    protected int zzri = 0;

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzga.checkNotNull(iterable);
        if (iterable instanceof zzgo) {
            List<?> zzft = ((zzgo) iterable).zzft();
            zzgo zzgoVar = (zzgo) list;
            int size = list.size();
            for (Object obj : zzft) {
                if (obj == null) {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(zzgoVar.size() - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    for (int size2 = zzgoVar.size() - 1; size2 >= size; size2--) {
                        zzgoVar.remove(size2);
                    }
                    throw new NullPointerException(sb3);
                } else if (obj instanceof zzeo) {
                    zzgoVar.zzc((zzeo) obj);
                } else {
                    zzgoVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzhr) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t11 : iterable) {
                if (t11 == null) {
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(list.size() - size3);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(t11);
            }
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzeq()];
            zzfe zzg = zzfe.zzg(bArr);
            zzb(zzg);
            zzg.zzea();
            return bArr;
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "byte array".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("byte array");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final zzeo zzce() {
        try {
            zzev zzaj = zzeo.zzaj(zzeq());
            zzb(zzaj.zzdp());
            return zzaj.zzdo();
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("ByteString");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzcf() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzy(int i11) {
        throw new UnsupportedOperationException();
    }
}