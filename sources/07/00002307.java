package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;

/* loaded from: classes3.dex */
public abstract class zzig<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlf {
    @Override // 
    /* renamed from: zzao */
    public abstract zzig clone();

    protected abstract zzig zzap(zzih zzihVar);

    public zzig zzaq(byte[] bArr, int i11, int i12) {
        throw null;
    }

    public zzig zzar(byte[] bArr, int i11, int i12, zzjl zzjlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final /* bridge */ /* synthetic */ zzlf zzas(zzlg zzlgVar) {
        if (zzbJ().getClass().isInstance(zzlgVar)) {
            return zzap((zzih) zzlgVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final /* synthetic */ zzlf zzat(byte[] bArr) {
        return zzaq(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final /* synthetic */ zzlf zzau(byte[] bArr, zzjl zzjlVar) {
        return zzar(bArr, 0, bArr.length, zzjlVar);
    }
}