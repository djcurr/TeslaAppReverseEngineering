package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class UnsupportedDrmException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f13340a;

    public UnsupportedDrmException(int i11) {
        this.f13340a = i11;
    }

    public UnsupportedDrmException(int i11, Exception exc) {
        super(exc);
        this.f13340a = i11;
    }
}