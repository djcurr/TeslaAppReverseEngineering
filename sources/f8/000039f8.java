package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: a  reason: collision with root package name */
    private final int f17063a;

    public FirebaseRemoteConfigServerException(int i11, String str) {
        super(str);
        this.f17063a = i11;
    }

    public int a() {
        return this.f17063a;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f17063a = i11;
    }
}