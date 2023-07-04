package com.plaid.internal.core.crashreporting.internal.models;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CrashContext {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_BREADCRUMB_LIMIT = 50;
    private final int breadcrumbLimit;
    private volatile List<Breadcrumb> breadcrumbs;
    private volatile UUID lastEventId;
    private volatile Map<String, String> tags;
    private volatile User user;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CrashContext() {
        this(0, null, null, null, null, 31, null);
    }

    public CrashContext(int i11, UUID uuid, List<Breadcrumb> list, User user, Map<String, String> map) {
        this.breadcrumbLimit = i11;
        this.lastEventId = uuid;
        this.breadcrumbs = list;
        this.user = user;
        this.tags = map;
    }

    public final synchronized void clear() {
        this.lastEventId = null;
        List<Breadcrumb> list = this.breadcrumbs;
        if (list != null) {
            list.clear();
        }
        this.user = null;
        Map<String, String> map = this.tags;
        if (map != null) {
            map.clear();
        }
    }

    public final UUID getLastEventId() {
        return this.lastEventId;
    }

    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLastEventId(UUID uuid) {
        this.lastEventId = uuid;
    }

    public final void setTags$crash_reporting_release(Map<String, String> map) {
        this.tags = map;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public /* synthetic */ CrashContext(int i11, UUID uuid, List list, User user, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 50 : i11, (i12 & 2) != 0 ? null : uuid, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : user, (i12 & 16) == 0 ? map : null);
    }
}