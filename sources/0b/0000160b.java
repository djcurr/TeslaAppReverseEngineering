package com.facebook.datasource;

/* loaded from: classes.dex */
public abstract class b<T> implements e<T> {
    @Override // com.facebook.datasource.e
    public void onCancellation(c<T> cVar) {
    }

    @Override // com.facebook.datasource.e
    public void onFailure(c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void onFailureImpl(c<T> cVar);

    @Override // com.facebook.datasource.e
    public void onNewResult(c<T> cVar) {
        boolean a11 = cVar.a();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (a11) {
                cVar.close();
            }
        }
    }

    protected abstract void onNewResultImpl(c<T> cVar);

    @Override // com.facebook.datasource.e
    public void onProgressUpdate(c<T> cVar) {
    }
}