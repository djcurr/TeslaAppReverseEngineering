package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzih<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlg {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzbo(Iterable iterable, List list) {
        zzkh.zze(iterable);
        if (iterable instanceof zzko) {
            List zzh = ((zzko) iterable).zzh();
            zzko zzkoVar = (zzko) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = zzkoVar.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2 - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = zzkoVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        zzkoVar.remove(size3);
                    }
                    throw new NullPointerException(sb3);
                } else if (obj instanceof zziy) {
                    zzkoVar.zzi((zziy) obj);
                } else {
                    zzkoVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzln)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(size5 - size4);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzbm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zziy zzbn() {
        try {
            int zzbr = zzbr();
            zziy zziyVar = zziy.zzb;
            byte[] bArr = new byte[zzbr];
            zzjg zzC = zzjg.zzC(bArr);
            zzbF(zzC);
            zzC.zzD();
            return new zziv(bArr);
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbp(int i11) {
        throw null;
    }

    public final byte[] zzbq() {
        try {
            byte[] bArr = new byte[zzbr()];
            zzjg zzC = zzjg.zzC(bArr);
            zzbF(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e11) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }
}