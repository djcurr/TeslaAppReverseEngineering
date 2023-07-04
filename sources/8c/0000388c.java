package com.google.firebase;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public class FirebaseException extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th2) {
        super(str, th2);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}