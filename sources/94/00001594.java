package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        a(boolean z11) {
            this.isComplete = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(d dVar);

    boolean c(d dVar);

    void e(d dVar);

    void g(d dVar);

    e getRoot();

    boolean j(d dVar);
}