package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
import com.google.android.gms.internal.vision.zzfy.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzfy<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzec<MessageType, BuilderType> {
    private static Map<Object, zzfy<?, ?>> zzwl = new ConcurrentHashMap();
    protected zzip zzwj = zzip.zzhe();
    private int zzwk = -1;

    /* loaded from: classes3.dex */
    public static class zzb<T extends zzfy<T, ?>> extends zzee<T> {
        private final T zzwm;

        public zzb(T t11) {
            this.zzwm = t11;
        }

        @Override // com.google.android.gms.internal.vision.zzhq
        public final /* synthetic */ Object zza(zzez zzezVar, zzfk zzfkVar) {
            return zzfy.zza(this.zzwm, zzezVar, zzfkVar);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzhh {
        protected zzc(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzfy.zza
        protected final void zzfc() {
            if (this.zzwo) {
                super.zzfc();
                MessageType messagetype = this.zzwn;
                ((zzd) messagetype).zzwp = (zzfp) ((zzd) messagetype).zzwp.clone();
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfy.zza
        public /* synthetic */ zzfy zzfd() {
            return (zzd) zzff();
        }

        @Override // com.google.android.gms.internal.vision.zzfy.zza, com.google.android.gms.internal.vision.zzhg
        public /* synthetic */ zzhf zzff() {
            if (this.zzwo) {
                return (zzd) this.zzwn;
            }
            ((zzd) this.zzwn).zzwp.zzci();
            return (zzd) super.zzff();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzfy<MessageType, BuilderType> implements zzhh {
        protected zzfp<zze> zzwp = zzfp.zzep();

        /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.List, java.util.ArrayList] */
        public final <Type> Type zzc(zzfi<MessageType, Type> zzfiVar) {
            zzf zza = zzfy.zza(zzfiVar);
            if (zza.zzwu == ((zzfy) zzfb())) {
                Type type = (Type) this.zzwp.zza((zzfp<zze>) zza.zzww);
                if (type == null) {
                    return zza.zzgq;
                }
                zze zzeVar = zza.zzww;
                if (zzeVar.zzws) {
                    if (zzeVar.zzwr.zzho() == zzji.ENUM) {
                        ?? r12 = (Type) new ArrayList();
                        for (Object obj : (List) type) {
                            r12.add(zza.zzg(obj));
                        }
                        return r12;
                    }
                    return type;
                }
                return (Type) zza.zzg(type);
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* loaded from: classes3.dex */
    public static final class zze implements zzfr<zze> {
        final zzjd zzwr;
        final zzgc<?> zzwq = null;
        final int number = 202056002;
        final boolean zzws = true;
        final boolean zzwt = false;

        zze(zzgc<?> zzgcVar, int i11, zzjd zzjdVar, boolean z11, boolean z12) {
            this.zzwr = zzjdVar;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.number - ((zze) obj).number;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzfr
        public final zzhg zza(zzhg zzhgVar, zzhf zzhfVar) {
            return ((zza) zzhgVar).zza((zza) ((zzfy) zzhfVar));
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final zzjd zzes() {
            return this.zzwr;
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final zzji zzet() {
            return this.zzwr.zzho();
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final boolean zzeu() {
            return this.zzws;
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final boolean zzev() {
            return this.zzwt;
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final int zzr() {
            return this.number;
        }

        @Override // com.google.android.gms.internal.vision.zzfr
        public final zzhm zza(zzhm zzhmVar, zzhm zzhmVar2) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public static class zzf<ContainingType extends zzhf, Type> extends zzfi<ContainingType, Type> {
        final Type zzgq;
        final ContainingType zzwu;
        final zzhf zzwv;
        final zze zzww;

        zzf(ContainingType containingtype, Type type, zzhf zzhfVar, zze zzeVar, Class cls) {
            if (containingtype != null) {
                if (zzeVar.zzwr == zzjd.zzace && zzhfVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.zzwu = containingtype;
                this.zzgq = type;
                this.zzwv = zzhfVar;
                this.zzww = zzeVar;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        final Object zzg(Object obj) {
            return this.zzww.zzwr.zzho() == zzji.ENUM ? this.zzww.zzwq.zzf(((Integer) obj).intValue()) : obj;
        }
    }

    /* loaded from: classes3.dex */
    public enum zzg {
        public static final int zzwx = 1;
        public static final int zzwy = 2;
        public static final int zzwz = 3;
        public static final int zzxa = 4;
        public static final int zzxb = 5;
        public static final int zzxc = 6;
        public static final int zzxd = 7;
        public static final int zzxf = 1;
        public static final int zzxg = 2;
        public static final int zzxi = 1;
        public static final int zzxj = 2;
        private static final /* synthetic */ int[] zzxe = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzxh = {1, 2};
        private static final /* synthetic */ int[] zzxk = {1, 2};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzxe.clone();
        }
    }

    public static <T extends zzfy<?, ?>> void zza(Class<T> cls, T t11) {
        zzwl.put(cls, t11);
    }

    public static <T extends zzfy<?, ?>> T zzd(Class<T> cls) {
        zzfy<?, ?> zzfyVar = zzwl.get(cls);
        if (zzfyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfyVar = zzwl.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (zzfyVar == null) {
            zzfyVar = (T) ((zzfy) zziu.zzh(cls)).zza(zzg.zzxc, (Object) null, (Object) null);
            if (zzfyVar != null) {
                zzwl.put(cls, zzfyVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzfyVar;
    }

    public static <E> zzge<E> zzey() {
        return zzht.zzgm();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzfy) zza(zzg.zzxc, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzhs.zzgl().zzs(this).equals(this, (zzfy) obj);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.zzri;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = zzhs.zzgl().zzs(this).hashCode(this);
        this.zzri = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzhh
    public final boolean isInitialized() {
        byte byteValue = ((Byte) zza(zzg.zzwx, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzr = zzhs.zzgl().zzs(this).zzr(this);
        zza(zzg.zzwy, zzr ? this : null, (Object) null);
        return zzr;
    }

    public String toString() {
        return zzhi.zza(this, super.toString());
    }

    public abstract Object zza(int i11, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.zzhf
    public final void zzb(zzfe zzfeVar) {
        zzhs.zzgl().zzf(getClass()).zza(this, zzfg.zza(zzfeVar));
    }

    @Override // com.google.android.gms.internal.vision.zzec
    final int zzcf() {
        return this.zzwk;
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final int zzeq() {
        if (this.zzwk == -1) {
            this.zzwk = zzhs.zzgl().zzs(this).zzp(this);
        }
        return this.zzwk;
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final /* synthetic */ zzhg zzez() {
        zza zzaVar = (zza) zza(zzg.zzxb, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    public final /* synthetic */ zzhg zzfa() {
        return (zza) zza(zzg.zzxb, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzhh
    public final /* synthetic */ zzhf zzfb() {
        return (zzfy) zza(zzg.zzxc, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzec
    final void zzy(int i11) {
        this.zzwk = i11;
    }

    /* loaded from: classes3.dex */
    public static abstract class zza<MessageType extends zzfy<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzed<MessageType, BuilderType> {
        private final MessageType zzwm;
        protected MessageType zzwn;
        protected boolean zzwo = false;

        public zza(MessageType messagetype) {
            this.zzwm = messagetype;
            this.zzwn = (MessageType) messagetype.zza(zzg.zzxa, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzed
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzwm.zza(zzg.zzxb, null, null);
            zzaVar.zza((zza) ((zzfy) zzff()));
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.vision.zzhh
        public final boolean isInitialized() {
            return zzfy.zza(this.zzwn, false);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzfc();
            zza(this.zzwn, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.vision.zzed
        public final /* synthetic */ zzed zzcg() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.vision.zzhh
        public final /* synthetic */ zzhf zzfb() {
            return this.zzwm;
        }

        protected void zzfc() {
            if (this.zzwo) {
                MessageType messagetype = (MessageType) this.zzwn.zza(zzg.zzxa, null, null);
                zza(messagetype, this.zzwn);
                this.zzwn = messagetype;
                this.zzwo = false;
            }
        }

        @Override // com.google.android.gms.internal.vision.zzhg
        /* renamed from: zzfd */
        public MessageType zzff() {
            if (this.zzwo) {
                return this.zzwn;
            }
            MessageType messagetype = this.zzwn;
            zzhs.zzgl().zzs(messagetype).zze(messagetype);
            this.zzwo = true;
            return this.zzwn;
        }

        @Override // com.google.android.gms.internal.vision.zzhg
        /* renamed from: zzfe */
        public final MessageType zzfg() {
            MessageType messagetype = (MessageType) zzff();
            byte byteValue = ((Byte) messagetype.zza(zzg.zzwx, null, null)).byteValue();
            boolean z11 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z11 = false;
                } else {
                    z11 = zzhs.zzgl().zzs(messagetype).zzr(messagetype);
                    messagetype.zza(zzg.zzwy, z11 ? messagetype : null, null);
                }
            }
            if (z11) {
                return messagetype;
            }
            throw new zzin(messagetype);
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzhs.zzgl().zzs(messagetype).zzc(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzed
        protected final /* synthetic */ zzed zza(zzec zzecVar) {
            return zza((zza<MessageType, BuilderType>) ((zzfy) zzecVar));
        }
    }

    public static Object zza(zzhf zzhfVar, String str, Object[] objArr) {
        return new zzhu(zzhfVar, str, objArr);
    }

    public static <ContainingType extends zzhf, Type> zzf<ContainingType, Type> zza(ContainingType containingtype, zzhf zzhfVar, zzgc<?> zzgcVar, int i11, zzjd zzjdVar, boolean z11, Class cls) {
        return new zzf<>(containingtype, Collections.emptyList(), zzhfVar, new zze(null, 202056002, zzjdVar, true, false), cls);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static <T extends zzfy<T, ?>> T zzb(T t11, byte[] bArr) {
        T t12 = (T) zza(t11, bArr);
        if (t12 != null) {
            byte byteValue = ((Byte) t12.zza(zzg.zzwx, null, null)).byteValue();
            boolean z11 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z11 = false;
                } else {
                    z11 = zzhs.zzgl().zzs(t12).zzr(t12);
                    t12.zza(zzg.zzwy, z11 ? t12 : null, null);
                }
            }
            if (!z11) {
                throw new zzin(t12).zzhc().zzg(t12);
            }
        }
        return t12;
    }

    public static <MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>, T> zzf<MessageType, T> zza(zzfi<MessageType, T> zzfiVar) {
        return (zzf) zzfiVar;
    }

    protected static final <T extends zzfy<T, ?>> boolean zza(T t11, boolean z11) {
        byte byteValue = ((Byte) t11.zza(zzg.zzwx, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return zzhs.zzgl().zzs(t11).zzr(t11);
    }

    protected static <T extends zzfy<T, ?>> T zzb(T t11, byte[] bArr, zzfk zzfkVar) {
        T t12 = (T) zza(t11, bArr, zzfkVar);
        if (t12 != null) {
            byte byteValue = ((Byte) t12.zza(zzg.zzwx, null, null)).byteValue();
            boolean z11 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z11 = false;
                } else {
                    z11 = zzhs.zzgl().zzs(t12).zzr(t12);
                    t12.zza(zzg.zzwy, z11 ? t12 : null, null);
                }
            }
            if (!z11) {
                throw new zzin(t12).zzhc().zzg(t12);
            }
        }
        return t12;
    }

    static <T extends zzfy<T, ?>> T zza(T t11, zzez zzezVar, zzfk zzfkVar) {
        T t12 = (T) t11.zza(zzg.zzxa, null, null);
        try {
            zzhs.zzgl().zzs(t12).zza(t12, zzfc.zza(zzezVar), zzfkVar);
            zzhs.zzgl().zzs(t12).zze(t12);
            return t12;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgf) {
                throw ((zzgf) e11.getCause());
            }
            throw new zzgf(e11.getMessage()).zzg(t12);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzgf) {
                throw ((zzgf) e12.getCause());
            }
            throw e12;
        }
    }

    private static <T extends zzfy<T, ?>> T zza(T t11, byte[] bArr) {
        T t12 = (T) t11.zza(zzg.zzxa, null, null);
        try {
            zzhs.zzgl().zzs(t12).zza(t12, bArr, 0, bArr.length, new zzei());
            zzhs.zzgl().zzs(t12).zze(t12);
            if (t12.zzri == 0) {
                return t12;
            }
            throw new RuntimeException();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgf) {
                throw ((zzgf) e11.getCause());
            }
            throw new zzgf(e11.getMessage()).zzg(t12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgf.zzfh().zzg(t12);
        }
    }

    private static <T extends zzfy<T, ?>> T zza(T t11, byte[] bArr, zzfk zzfkVar) {
        try {
            zzez zzf2 = zzez.zzf(bArr);
            T t12 = (T) zza(t11, zzf2, zzfkVar);
            try {
                zzf2.zzak(0);
                return t12;
            } catch (zzgf e11) {
                throw e11.zzg(t12);
            }
        } catch (zzgf e12) {
            throw e12;
        }
    }
}