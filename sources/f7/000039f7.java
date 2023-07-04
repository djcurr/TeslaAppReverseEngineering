package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigFetchThrottledException(long j11) {
        this("Fetch was throttled.", j11);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j11) {
        super(str);
    }
}