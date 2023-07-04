package com.bumptech.glide;

import com.bumptech.glide.l;

/* loaded from: classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private za.c<? super TranscodeType> f10494a = za.a.b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final za.c<? super TranscodeType> b() {
        return this.f10494a;
    }
}