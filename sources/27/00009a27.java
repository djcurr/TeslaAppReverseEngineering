package org.spongycastle.cert.dane;

/* loaded from: classes5.dex */
public class DANEEntryStoreBuilder {
    private final DANEEntryFetcherFactory daneEntryFetcher;

    public DANEEntryStoreBuilder(DANEEntryFetcherFactory dANEEntryFetcherFactory) {
        this.daneEntryFetcher = dANEEntryFetcherFactory;
    }

    public DANEEntryStore build(String str) {
        return new DANEEntryStore(this.daneEntryFetcher.build(str).getEntries());
    }
}