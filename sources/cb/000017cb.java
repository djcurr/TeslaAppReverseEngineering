package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import nd.a;

/* loaded from: classes3.dex */
public final class FallbackJSBundleLoader extends JSBundleLoader {
    static final String RECOVERABLE = "facebook::react::Recoverable";
    static final String TAG = "FallbackJSBundleLoader";
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();
    private Stack<JSBundleLoader> mLoaders = new Stack<>();

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        RuntimeException runtimeException = new RuntimeException("No fallback options available");
        Iterator<Exception> it2 = this.mRecoveredErrors.iterator();
        Throwable th2 = runtimeException;
        while (it2.hasNext()) {
            th2.initCause(it2.next());
            th2 = th2;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
        }
        throw runtimeException;
    }

    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e11) {
                if (e11.getMessage() != null && e11.getMessage().startsWith(RECOVERABLE)) {
                    this.mLoaders.pop();
                    this.mRecoveredErrors.add(e11);
                    a.M(TAG, "Falling back from recoverable error", e11);
                } else {
                    throw e11;
                }
            }
        }
        throw e11;
    }
}