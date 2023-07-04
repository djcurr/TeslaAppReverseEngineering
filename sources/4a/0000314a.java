package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes3.dex */
public abstract class PlusCode implements Parcelable {

    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public abstract PlusCode build();

        @RecentlyNullable
        public abstract String getCompoundCode();

        @RecentlyNullable
        public abstract String getGlobalCode();

        @RecentlyNonNull
        public abstract Builder setCompoundCode(String str);

        @RecentlyNonNull
        public abstract Builder setGlobalCode(String str);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzt();
    }

    @RecentlyNullable
    public abstract String getCompoundCode();

    @RecentlyNullable
    public abstract String getGlobalCode();
}