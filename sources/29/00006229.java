package com.teslamotors.tesla.notification;

import com.wix.reactnativenotifications.oem.EmptyOemPushInterface;
import kotlin.Metadata;
import qw.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/teslamotors/tesla/notification/OemPushInjector;", "", "Lqw/a;", "inject", "<init>", "()V", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OemPushInjector {
    public static final OemPushInjector INSTANCE = new OemPushInjector();

    private OemPushInjector() {
    }

    public static final a inject() {
        return EmptyOemPushInterface.INSTANCE;
    }
}