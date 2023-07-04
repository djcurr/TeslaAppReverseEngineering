package com.wix.reactnativenotifications.oem;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import qw.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/wix/reactnativenotifications/oem/EmptyOemPushInterface;", "Lqw/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lvz/b0;", "init", "", "hasOemPush", "deleteOemPushChannel", "<init>", "()V", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class EmptyOemPushInterface implements a {
    public static final EmptyOemPushInterface INSTANCE = new EmptyOemPushInterface();

    private EmptyOemPushInterface() {
    }

    public void deleteOemPushChannel(Context context) {
        s.g(context, "context");
    }

    public boolean hasOemPush(Context context) {
        s.g(context, "context");
        return false;
    }

    public void init(Context context) {
        s.g(context, "context");
    }
}