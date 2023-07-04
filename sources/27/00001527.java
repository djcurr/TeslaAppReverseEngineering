package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
final class b extends RuntimeException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}